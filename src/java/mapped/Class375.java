package mapped;

import com.mojang.realmsclient.RealmsMainScreen;
import net.minecraft.util.text.TranslationTextComponent;

public class Class375 extends Thread {
   public final RealmsMainScreen field1629;

   public Class375(RealmsMainScreen var1, String var2) {
      super(var2);
      this.field1629 = var1;
   }

   @Override
   public void run() {
      Class4624 var3 = Class4624.method14543();

      try {
         Class1992 var4 = var3.method14554();
         if (var4 == Class1992.field12995) {
            RealmsMainScreen.field4268 = new Class809(RealmsMainScreen.method2079(this.field1629), true);
            RealmsMainScreen.method2080(this.field1629).execute(() -> RealmsMainScreen.method2090(this.field1629).displayGuiScreen(RealmsMainScreen.field4268));
            return;
         }

         if (var4 == Class1992.field12996) {
            RealmsMainScreen.field4268 = new Class809(RealmsMainScreen.method2079(this.field1629), false);
            RealmsMainScreen.method2081(this.field1629).execute(() -> RealmsMainScreen.method2089(this.field1629).displayGuiScreen(RealmsMainScreen.field4268));
            return;
         }

         RealmsMainScreen.method2082(this.field1629);
      } catch (Class2435 var5) {
         RealmsMainScreen.method2083(false);
         RealmsMainScreen.method2084().error("Couldn't connect to realms", var5);
         if (var5.field16472 == 401) {
            RealmsMainScreen.field4268 = new Class821(
               new TranslationTextComponent("mco.error.invalid.session.title"),
               new TranslationTextComponent("mco.error.invalid.session.message"),
               RealmsMainScreen.method2079(this.field1629)
            );
            RealmsMainScreen.method2085(this.field1629).execute(() -> RealmsMainScreen.method2088(this.field1629).displayGuiScreen(RealmsMainScreen.field4268));
         } else {
            RealmsMainScreen.method2086(this.field1629)
               .execute(() -> RealmsMainScreen.method2087(this.field1629).displayGuiScreen(new Class821(var5, RealmsMainScreen.method2079(this.field1629))));
         }
      }
   }
}
