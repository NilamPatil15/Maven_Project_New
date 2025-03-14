package testng.listner;

import org.testng.IAnnotationTransformer;

public class Transformation implements IAnnotationTransformer {
    //go to IAnnotationTransformer add first method and override using public access modifier
    @Override
    public void transform(org.testng.annotations.ITestAnnotation annotation, java.lang.Class testClass, java.lang.reflect.Constructor testConstructor, java.lang.reflect.Method testMethod) {
        /* compiled code */
        annotation.setRetryAnalyzer(RetryEx.class);
    }
}
