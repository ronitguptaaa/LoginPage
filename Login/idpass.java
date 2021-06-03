package Login;

import java.util.HashMap;

public class idpass {
    HashMap<String,String> LoginInfo = new HashMap<String,String>();

    idpass(){
        LoginInfo.put("Bro1","Pizza");
        LoginInfo.put("Bro2", "Beer");
        LoginInfo.put("Bro3", "Drive");
    }

           protected HashMap getLoginInfo() {
      return LoginInfo;
  }
    }

