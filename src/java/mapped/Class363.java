package mapped;

import com.mojang.realmsclient.RealmsMainScreen;
import com.mojang.realmsclient.dto.RealmsServer;

public class Class363 extends Thread {
   public final RealmsMainScreen field1600;

   public Class363(RealmsMainScreen var1, String var2) {
      super(var2);
      this.field1600 = var1;
   }

   @Override
   public void run() {
      try {
         RealmsServer var3 = RealmsMainScreen.method2099(this.field1600, RealmsMainScreen.method2098(this.field1600));
         if (var3 != null) {
            Class4624 var4 = Class4624.method14543();
            var4.method14556(var3.field27443);
            RealmsMainScreen.method2100(this.field1600).execute(() -> RealmsMainScreen.method2103(this.field1600, var3));
         }
      } catch (Class2435 var5) {
         RealmsMainScreen.method2084().error("Couldn't configure world");
         RealmsMainScreen.method2101(this.field1600).execute(() -> RealmsMainScreen.method2102(this.field1600).displayGuiScreen(new Class821(var5, this.field1600)));
      }
   }
}
