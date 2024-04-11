package report;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.annotations.MarkupIgnore;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExtentReport {
    public static ExtentReports extent;

    public ExtentReports reportSetup(String pathLocation) {
        extent = new ExtentReports();
        ExtentSparkReporter spark = new ExtentSparkReporter(pathLocation);
        extent.attachReporter(spark);
        return extent;

    }

    public void  reportTeardown(){
        extent.flush();
    }

}
