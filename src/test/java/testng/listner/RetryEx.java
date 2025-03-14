package testng.listner;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

import java.util.PrimitiveIterator;

public class RetryEx implements IRetryAnalyzer {

    private int retryCount=0;
    private int maxCount=3;


    @Override
    public boolean retry(ITestResult iTestResult) {
        if(retryCount<maxCount){
            retryCount++;
            return true;
        }

        return false;











    }
}
