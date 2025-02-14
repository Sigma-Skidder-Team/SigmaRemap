package mapped;

import com.mojang.realmsclient.RealmsMainScreen;
import com.mojang.realmsclient.client.RealmsClient;
import com.mojang.realmsclient.exception.RealmsServiceException;

public class Class380 extends Thread {
   public final RealmsMainScreen field1638;

   public Class380(RealmsMainScreen var1, String var2) {
      super(var2);
      this.field1638 = var1;
   }

   @Override
   public void run() {
      RealmsClient var3 = RealmsClient.method14543();

      try {
         Boolean var4 = var3.method14552();
         if (var4) {
            RealmsMainScreen.method2084().info("Realms is available for this user");
            RealmsMainScreen.method2091(true);
         } else {
            RealmsMainScreen.method2084().info("Realms is not available for this user");
            RealmsMainScreen.method2091(false);
            RealmsMainScreen.method2092(this.field1638)
               .execute(() -> RealmsMainScreen.method2096(this.field1638).displayGuiScreen(new Class820(RealmsMainScreen.method2079(this.field1638))));
         }

         RealmsMainScreen.method2093(true);
      } catch (RealmsServiceException var5) {
         RealmsMainScreen.method2084().error("Couldn't connect to realms", var5);
         RealmsMainScreen.method2094(this.field1638)
            .execute(() -> RealmsMainScreen.method2095(this.field1638).displayGuiScreen(new Class821(var5, RealmsMainScreen.method2079(this.field1638))));
      }
   }
}
