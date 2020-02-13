package com.cts.training.middle.controller;

import java.util.List;
import java.util.Stack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cts.training.dao.CompanyDAO;
import com.cts.training.dao.StockExchangeDAO;
import com.cts.training.model.Company;
import com.cts.training.model.StockExchangeEntity;

@Controller
public class ExchangeController {

	@Autowired
	StockExchangeDAO stockDAO;
	
	
	@GetMapping("/exchange-home")
	public String exchangePage(Model model)
	{
		List<StockExchangeEntity> exchanges=stockDAO.getAllStockExchanges();
		model.addAttribute("list", exchanges);
		model.addAttribute("exchange", new StockExchangeEntity());//user will work as a model attribute in a form
		return "exchangeoperations";
	}
	
	@PostMapping("/exchange/save")
	//or @RequestMapping(value="/user/save",method=RequestMethod.post)
	public String addUser(@ModelAttribute("exchange") StockExchangeEntity stock)
	{
		stockDAO.addStockExchange(stock);
		return "redirect:/exchange-home";
	}
	
	@GetMapping("/remove")//{}----path variable
	public String deleteUser(@RequestParam("id")int id) {
		StockExchangeEntity stock=stockDAO.getStockExchangeById(id);
		stockDAO.deleteStockExchange(stock);
		return "redirect:/exchnage-home";
		
	}
	@GetMapping("/exchange/update/{id}")
	public String ExchangeCompany(@PathVariable("id")int id,Model model)
	{
		StockExchangeEntity stock=stockDAO.getStockExchangeById(id);
		model.addAttribute("exchange", stock);
		List<StockExchangeEntity> exchanges= stockDAO.getAllStockExchanges();
		model.addAttribute("list", exchanges);
		
		return "exchangeoperations";
		
	}
}




