package mapped;

import com.mojang.realmsclient.RealmsMainScreen;
import com.mojang.realmsclient.client.RealmsClient;
import com.mojang.realmsclient.exception.RealmsServiceException;

public class Class364 extends Thread {
   public final RealmsMainScreen field1601;

   public Class364(RealmsMainScreen var1, String var2) {
      super(var2);
      this.field1601 = var1;
   }

   @Override
   public void run() {
      RealmsClient var3 = RealmsClient.method14543();

      try {
         Boolean var4 = var3.method14553();
         if (var4) {
            RealmsClient.method14546();
            RealmsMainScreen.method2084().info("Switched to local");
            RealmsMainScreen.method2097().method36019();
         }
      } catch (RealmsServiceException var5) {
         RealmsMainScreen.method2084().error("Couldn't connect to Realms: " + var5);
      }
   }
}
