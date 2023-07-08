package selenium004;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class extentReportsManger{
    private static ExtentReports extentReports;

    public static ExtentReports getInstance() {
        if (extentReports == null) {
            extentReports = createExtentReports();
        }
        return extentReports;
    }

    private static ExtentReports createExtentReports() {
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("test-output/extent-report.html");

        ExtentReports extentReports = new ExtentReports();
        extentReports.attachReporter(htmlReporter);
        return extentReports;
    }
}