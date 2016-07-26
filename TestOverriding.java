package com.Ritesh.test;

import com.Ritesh.tools.Overriding1;
import com.Ritesh.tools.Overriding2;
import com.Ritesh.tools.Overriding3;

public class TestOverriding {

	public static void main(String[] args) {
		Overriding1 obj = new Overriding1();
		Overriding2 sbj = new Overriding2();
		Overriding3 mbj = new Overriding3();
		obj.gateRateOfInterest();
		sbj.gateRateOfInterest();
		mbj.gateRateOfInterest();
		
	}

}
