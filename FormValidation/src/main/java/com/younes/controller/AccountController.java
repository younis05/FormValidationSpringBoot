package com.younes.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.younes.model.Account;
import com.younes.validator.AccountValidator;

@Controller
@RequestMapping(value = "account")
public class AccountController {

	@RequestMapping(method = RequestMethod.GET)
	public String index(ModelMap modelMap) {
		modelMap.put("account", new Account());
		return "account/index";
	}

	@RequestMapping(value = "save", method = RequestMethod.POST)
	public String save(@ModelAttribute(value = "account") @Valid Account account, BindingResult bindingResult, ModelMap modelMap) {
		AccountValidator accountValidator = new AccountValidator();
		accountValidator.validate(account, bindingResult);
		if (bindingResult.hasErrors()) {
			return "account/index";
		} else {
			modelMap.put("account", account);
			return "account/success";
		}
	}
}
