package utils;

import org.testng.*;

public class RetryAnalyzer implements IRetryAnalyzer{
int count=0;
public boolean retry(ITestResult r){
if(count<2){count++;return true;}
return false;
}
}