package com.cybertek.tests.VytrackTest;

import com.cybertek.pages.DashboardPage;
import com.cybertek.pages.LoginPage;
import com.cybertek.pages.VehiclesModelPage;
import com.cybertek.tests.TestBase;
import com.cybertek.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US_13 extends TestBase {

    /*VERIFY Store Manager able to see Vehicle Model Page
    Open browser
    Login as Store manager
    Go to Fleet -> Vehicles Model
    Verify that user could able to see Web Element with the text All Vehicles Model
    * */

    @Test
    public void test170(){
        extentLogger = report.createTest("Store Manager could able to see Vehicles Model");

        LoginPage loginPage = new LoginPage();

        extentLogger.info("Login as a Store Manager");
        loginPage.loginAsStoreManager();

        DashboardPage dashboardPage = new DashboardPage();
        extentLogger.info("Navigate to --> Fleet > Vehicles Model");
        dashboardPage.navigateToModule("Fleet","Vehicles Model");

        VehiclesModelPage vehiclesModelPage = new VehiclesModelPage();

        extentLogger.info("Verify Current Url is " + "https://qa2.vytrack.com/entity/Extend_Entity_VehiclesModel");
        String actualCurrentUrl = Driver.get().getCurrentUrl();
        String expectedCurrentUrl = "https://qa2.vytrack.com/entity/Extend_Entity_VehiclesModel";

        Assert.assertEquals(actualCurrentUrl,expectedCurrentUrl,"Verify Store manager could able to see Vehicles Model page");

        extentLogger.pass("PASSED");

    }


    /*VERIFY Sales Manager able to see Vehicle Model Page
        Open browser
        Login as Sales manager
        Go to Fleet -> Vehicles Model
        Verify that user could able to see Web Element with the text All Vehicles Model
        * */
    @Test
    public void test171(){
        LoginPage loginPage = new LoginPage();
        loginPage.loginAsSalesManager();

        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.navigateToModule("Fleet","Vehicles Model");

        VehiclesModelPage vehiclesModelPage = new VehiclesModelPage();

        String actualCurrentUrl = Driver.get().getCurrentUrl();
        String expectedCurrentUrl = "https://qa2.vytrack.com/entity/Extend_Entity_VehiclesModel";

        Assert.assertEquals(actualCurrentUrl,expectedCurrentUrl,"Verify Sales manager could able to see Vehicles Model page");


    }


    /*VERIFY Truck driver not able to see Vehicle Model Page
        Open browser
        Login as Sales manager
        Go to Fleet -> Vehicles Model
        Verify that user could not able to see Web Element with the text All Vehicles Model
        * */
    @Test
    public void test172(){
        LoginPage loginPage = new LoginPage();
        loginPage.loginAsDriver();

        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.navigateToModule("Fleet","Vehicles Model");

        VehiclesModelPage vehiclesModelPage = new VehiclesModelPage();

        String actualCurrentUrl = Driver.get().getCurrentUrl();
        Assert.assertFalse(actualCurrentUrl.equals("https://qa2.vytrack.com/entity/Extend_Entity_VehiclesModel"));

    }





}
