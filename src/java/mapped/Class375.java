package mapped;

import com.mojang.realmsclient.RealmsMainScreen;
import com.mojang.realmsclient.client.RealmsClient;
import com.mojang.realmsclient.exception.RealmsServiceException;
import net.minecraft.util.text.TranslationTextComponent;

public class Class375 extends Thread {
   public final RealmsMainScreen field1629;

   public Class375(RealmsMainScreen var1, String var2) {
      super(var2);
      this.field1629 = var1;
   }

   @Override
   public void run() {
      RealmsClient var3 = RealmsClient.method14543();

      try {
         Class1992 var4 = var3.method14554();

         if (var4 == Class1992.OTHER) {
            RealmsMainScreen.field_224000_H = new Class809(RealmsMainScreen.method2079(this.field1629), false);
            RealmsMainScreen.method2081(this.field1629).execute(() -> RealmsMainScreen.method2089(this.field1629).displayGuiScreen(RealmsMainScreen.field_224000_H));
            return;
         }

         RealmsMainScreen.method2082(this.field1629);
      } catch (RealmsServiceException var5) {
         RealmsMainScreen.method2083(false);
         RealmsMainScreen.method2084().error("Couldn't connect to realms", var5);
         if (var5.field16472 == 401) {
            RealmsMainScreen.field_224000_H = new Class821(
               new TranslationTextComponent("mco.error.invalid.session.title"),
               new TranslationTextComponent("mco.error.invalid.session.message"),
               RealmsMainScreen.method2079(this.field1629)
            );
            RealmsMainScreen.method2085(this.field1629).execute(() -> RealmsMainScreen.method2088(this.field1629).displayGuiScreen(RealmsMainScreen.field_224000_H));
         } else {
            RealmsMainScreen.method2086(this.field1629)
               .execute(() -> RealmsMainScreen.method2087(this.field1629).displayGuiScreen(new Class821(var5, RealmsMainScreen.method2079(this.field1629))));
         }
      }
   }
}
