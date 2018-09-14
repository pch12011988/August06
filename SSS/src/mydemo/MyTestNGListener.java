package mydemo;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyTestNGListener implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println(result.getName() + " test case started");

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("The name of the testcase passed is :" + result.getName());

	}

	@Override
	public void onTestFailure(ITestResult result) {
		 System.out.println("The name of the testcase failed is :"+result.getName());
		try {
			CaptureScreenShot.capture(result.getName());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("The name of the testcase Skipped is :" + result.getName());

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// System.out.println("onTestFailedButWithinSuccessPercentage");

	}

	@Override
	public void onStart(ITestContext context) {
		// System.out.println("onStart");
		System.out.println("test case start time>>::" + context.getName());
		System.out.println("start time >>" + new java.util.Date());

	}

	@Override
	public void onFinish(ITestContext context) {
		// System.out.println("onFinish");
		System.out.println("test case finish time>>::" + context.getName());
		System.out.println("finish time >>" + new java.util.Date());

	}

}
