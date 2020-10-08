package com.cybertek.tests.VytrackTest;

import com.cybertek.pages.DashboardPage;
import com.cybertek.pages.LoginPage;
import com.cybertek.pages.VehicleFuelLogsPage;
import com.cybertek.tests.TestBase;
import org.testng.annotations.Test;

public class US_10 extends TestBase {

    @Test
    public void test11111(){
        LoginPage loginPage = new LoginPage();
        loginPage.loginAsDriver();

        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.navigateToModule("Fleet","Vehicles Fuel Logs");

        VehicleFuelLogsPage vehicleFuelLogsPage = new VehicleFuelLogsPage();

        System.out.println(vehicleFuelLogsPage.getPageSubTitle());

        System.out.println("-----");

        System.out.println(vehicleFuelLogsPage.vehicleFuelLogsMessage.getText());

        System.out.println(vehicleFuelLogsPage.fuelLogInformation.getText());


    }


}
