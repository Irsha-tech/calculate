package com.example.calculator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.calculator.model.OperationModel;
import com.example.calculator.service.Calculate;

@Controller
public class CalculatorController {



	    OperationModel operationModel = new OperationModel();

	    @Autowired
	    private Calculate calculate;

	    @RequestMapping("/calculator")
	    public String getCalculatorPage(Model model){
	        model.addAttribute("operationModel",operationModel);
	        return "calculate";
	    }

	    @RequestMapping(value="/calculator", params="add", method = RequestMethod.POST)
	    public String add(@ModelAttribute("operationModel")  OperationModel operationModel, Model model ){
	        model.addAttribute("result", Calculate.add(operationModel));
	        return "calculate";
	    }

	    @RequestMapping(value="/calculator", params="subtract", method = RequestMethod.POST)
	    public String subtract(@ModelAttribute("operationModel")  OperationModel operationModel, Model model ){
	        model.addAttribute("result", Calculate.subtract(operationModel));
	        return "calculate";
	    }

	    @RequestMapping(value="/calculator", params="multiply", method = RequestMethod.POST)
	    public String multiply(@ModelAttribute("operationModel")  OperationModel operationModel, Model model ){
	        model.addAttribute("result", Calculate.multiply(operationModel));
	        return "calculate";
	    }

	    @RequestMapping(value="/calculator", params="divide", method = RequestMethod.POST)
	    public String divide(@ModelAttribute("operationModel")  OperationModel operationModel, Model model ){
	        model.addAttribute("result", Calculate.divide(operationModel));
	        return "calculate";
	    }
}
