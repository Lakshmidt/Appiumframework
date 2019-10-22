package com.tyss.qa.androidapp.library;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.Status;

public class ListenersLib implements ITestListener {
	String filepath="C:\\Users\\TYSS\\Desktop\\Instagram_scripts.xlsx";

	public void onFinish(ITestContext arg0) {
		
	ReportsLib.testlog.log(Status.INFO, arg0.getName()+"suite is completed");
	ReportsLib.report.flush();
	}

	public void onStart(ITestContext arg0) {
		ReportsLib.report(arg0);
		ReportsLib.testlog.log(Status.INFO, arg0.getName()+"suite is started");	
		Reporter.log(arg0.getName()+" is started");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
	
		
	}

	public void onTestFailure(ITestResult arg0) {
		ReportsLib.testlog.log(Status.FAIL,arg0.getName()+" is fail");
		try {
		
			Excelreport.writeData(filepath,"Sheet1", "Fail", 1, 2);
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void onTestSkipped(ITestResult arg0) {
		
		ReportsLib.testlog.log(Status.SKIP,arg0.getName()+" is Skipped");
	}

	public void onTestStart(ITestResult arg0) {
	//ReportsLib.report(arg0);
	ReportsLib.testlog.log(Status.INFO, arg0.getName()+" is started");
		
	}

	public void onTestSuccess(ITestResult arg0) {
	
		ReportsLib.testlog.log(Status.PASS,arg0.getName()+" is Pass");
		try {
			Excelreport.writeData(filepath,"Sheet1", "Pass", 1, 2);
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
