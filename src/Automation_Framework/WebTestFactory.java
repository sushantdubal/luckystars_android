package Automation_Framework;

import org.testng.annotations.Factory;

import App_modules.MD01_On_boarding;



public class WebTestFactory {

             @Factory

             public Object[] createInstances() {

              Object[] obj = new Object[10];

              for (int i = 0; i < 10; i++) {

                 obj[i] = new MD01_On_boarding();

               }

               return obj;

             }

}

