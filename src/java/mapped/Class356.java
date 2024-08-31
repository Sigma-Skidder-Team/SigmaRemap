package mapped;

import com.mojang.realmsclient.gui.screens.RealmsResetWorldScreen;

public class Class356 extends Thread {
   public final RealmsResetWorldScreen field1584;

   public Class356(RealmsResetWorldScreen var1, String var2) {
      super(var2);
      this.field1584 = var1;
   }

   @Override
   public void run() {
      Class4624 var3 = Class4624.method14543();

      try {
         Class6108 var4 = var3.method14563(1, 10, Class2049.field13369);
         Class6108 var5 = var3.method14563(1, 10, Class2049.field13371);
         Class6108 var6 = var3.method14563(1, 10, Class2049.field13372);
         Class6108 var7 = var3.method14563(1, 10, Class2049.field13373);
         RealmsResetWorldScreen.method2264(this.field1584).execute(() -> {
            RealmsResetWorldScreen.method2266(this.field1584, var4);
            RealmsResetWorldScreen.method2267(this.field1584, var5);
            RealmsResetWorldScreen.method2268(this.field1584, var6);
            RealmsResetWorldScreen.method2269(this.field1584, var7);
         });
      } catch (Class2435 var8) {
         RealmsResetWorldScreen.method2265().error("Couldn't fetch templates in reset world", var8);
      }
   }
}
