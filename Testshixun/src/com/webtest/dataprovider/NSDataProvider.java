package com.webtest.dataprovider;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;

	public class NSDataProvider {

		 @DataProvider(name="para1")
		 public Object[][] getFromExcelData() throws Exception{
			return ExcelDataProvider.getData("data/user.xlsx");
		 }
		 @DataProvider(name="para2")
		 public Object[][] getFromExcel2Data() throws Exception{
			return ExcelDataProvider.getData("data/user1.xlsx");
		 }
		 @DataProvider(name="para3")
		 public Object[][] getFromExcel3Data() throws Exception{
			return ExcelDataProvider.getData("data/user2.xlsx");
		 }
		 @DataProvider(name="para4")
		 public Object[][] getFromExcel4Data() throws Exception{
			return ExcelDataProvider.getData("data/user3.xlsx");
		 }
	}


	

