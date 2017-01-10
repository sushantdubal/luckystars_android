package luckystars;

import org.testng.annotations.Factory;



public class WebTestFactory {

             @Factory

             public Object[] createInstances() {

              Object[] obj = new Object[10];

              for (int i = 0; i < 10; i++) {

                 obj[i] = new TC0003_signin_profile_firstname_edit();

               }

               return obj;

             }

}

