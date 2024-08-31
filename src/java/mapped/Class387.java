package mapped;

import com.mojang.realmsclient.RealmsMainScreen;

public class Class387 extends Thread {
   public final RealmsMainScreen field1652;

   public Class387(RealmsMainScreen var1, String var2) {
      super(var2);
      this.field1652 = var1;
   }

   @Override
   public void run() {
      Class4624 var3 = Class4624.method14543();

      try {
         Boolean var4 = var3.method14553();
         if (var4) {
            Class4624.method14544();
            RealmsMainScreen.method2084().info("Switched to stage");
            RealmsMainScreen.method2097().method36019();
         }
      } catch (Class2435 var5) {
         RealmsMainScreen.method2084().error("Couldn't connect to Realms: " + var5);
      }
   }
}
