package com.tyss.qa.androidapp.library;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ReportsLib
{
	static public ExtentReports report;
	public static ExtentTest testlog;
	public static void report(ITestContext result)
	{
		SimpleDateFormat df=new SimpleDateFormat("dd-MM-yy");
		Date date=new Date();
		ExtentHtmlReporter htmlreport=new ExtentHtmlReporter("C:\\Users\\TYSS\\Desktop\\appium\\AndroidFramework\\Reports\\alarmsetting"+df.format(date)+".html");
		htmlreport.config().setDocumentTitle("ClockApp report");
		htmlreport.config().setReportName(result.getName());
		htmlreport.config().setTheme(Theme.DARK);
		report=new ExtentReports();
		testlog=report.createTest(result.getName());
		report.attachReporter(htmlreport);
	}

}
