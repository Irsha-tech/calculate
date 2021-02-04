package com.example.calculator.service;

import org.springframework.stereotype.Service;

import com.example.calculator.model.OperationModel;
@Service
public class Calculate {
	 public static int add(OperationModel model){
	        return model.getA() + model.getB();
	    }

	    public static int subtract(OperationModel model){
	        return model.getA() - model.getB();
	    }

	    public static int multiply(OperationModel model){
	        return model.getA() * model.getB();
	    }

	    public static double divide(OperationModel model){
	        if(model.getA() == 0) return 0;
	        if(model.getB() == 0) return 0;
	        return (double) model.getA() / model.getB();
	    }
	    public OperationModel clearSimple(OperationModel model){
	        model.setA(0);
	        model.setB(0);
	        return model;
	    }
}
