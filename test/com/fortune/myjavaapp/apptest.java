   
package com.fortune.myjavaapp;


import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * Unit test for simple App.
 */
public class AppTest
{​​​​​​​
    @Test
    public void testAppConstructor() {​​​​​​​
        App app1 = new App();
        App app2 = new App();
        assertEquals(app1.getMessage(), app2.getMessage());
    }​​​​​​​


    @Test
    public void testAppMessage()
    {​​​​​​​
        App app = new App();
        assertEquals("Hello World!", app.getMessage());
    }​​​​​​​
}​​​​​​​






<https://teams.microsoft.com/l/message/19:PuL1PNj8ttVSKHdvPHGkHuW55Yhky4VgO0HbV2S8mU01@thread.tacv2/1689744086316?tenantId=88738e75-9e08-47e1-908f-bc12b11c19ad&amp;groupId=0e190c78-be44-4d02-abe6-974961bb42c2&amp;parentMessageId=1689743659834&amp;teamName=Devops 18 April&amp;channelName=General&amp;createdTime=1689744086316&amp;allowXTenantAccess=false>
