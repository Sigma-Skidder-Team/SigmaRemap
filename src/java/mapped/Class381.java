package mapped;

import net.minecraft.util.text.TranslationTextComponent;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Class381 extends Thread {
   public final String field1639;
   public final int field1640;
   public final Class1314 field1641;

   public Class381(Class1314 var1, String var2, String var3, int var4) {
      super(var2);
      this.field1641 = var1;
      this.field1639 = var3;
      this.field1640 = var4;
   }

   @Override
   public void run() {
      InetAddress var3 = null;

      try {
         if (Class1314.method6222(this.field1641)) {
            return;
         }

         var3 = InetAddress.getByName(this.field1639);
         Class1314.method6223(this.field1641, NetworkManager.method30703(var3, this.field1640, this.field1641.field4562.gameSettings.method37154()));
         Class1314.method6224(this.field1641)
            .method30692(
               new Class5102(
                  Class1314.method6224(this.field1641),
                  this.field1641.field4562,
                  Class1314.method6225(this.field1641),
                  var1 -> Class1314.method6227(this.field1641, var1)
               )
            );
         Class1314.method6224(this.field1641).method30693(new Class5575(this.field1639, this.field1640, Class1858.field9904));
         Class1314.method6224(this.field1641).method30693(new Class5500(this.field1641.field4562.method1533().method21528()));
      } catch (UnknownHostException var6) {
         if (Class1314.method6222(this.field1641)) {
            return;
         }

         Class1314.method6226().error("Couldn't connect to server", var6);
         this.field1641
            .field4562
            .execute(
               () -> this.field1641
                     .field4562
                     .displayGuiScreen(
                        new Class832(
                           Class1314.method6225(this.field1641), Class7127.field30664, new TranslationTextComponent("disconnect.genericReason", "Unknown host")
                        )
                     )
            );
      } catch (Exception var7) {
         if (Class1314.method6222(this.field1641)) {
            return;
         }

         Class1314.method6226().error("Couldn't connect to server", var7);
         String var5 = var3 == null ? var7.toString() : var7.toString().replaceAll(var3 + ":" + this.field1640, "");
         this.field1641
            .field4562
            .execute(
               () -> this.field1641
                     .field4562
                     .displayGuiScreen(
                        new Class832(Class1314.method6225(this.field1641), Class7127.field30664, new TranslationTextComponent("disconnect.genericReason", var5))
                     )
            );
      }
   }
}
