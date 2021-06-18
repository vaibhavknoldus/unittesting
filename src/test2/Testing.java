package test2; 

import org.junit.platform.launcher.listeners.TestExecutionSummary.Failure;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Result result = JUnitCore.runClasses(Main.class);
		for(org.junit.runner.notification.Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}

		System.out.println("result is: "+ result.wasSuccessful());
	}

}
