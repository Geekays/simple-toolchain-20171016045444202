package com.example;

public class TempConverter {

	public int CtoF(int value){
		return ((value*9)/5)+32;
	}

	public int FtoC(int value){
		return ((value-32)/9)*5;
	}
}
