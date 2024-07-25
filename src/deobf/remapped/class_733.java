package remapped;

import java.net.InetAddress;
import java.net.UnknownHostException;
import net.minecraft.util.text.TranslationTextComponent;

public class class_733 extends Thread {
   public class_733(class_501 var1, String var2, String var3, int var4) {
      super(var2);
      this.field_3997 = var1;
      this.field_3995 = var3;
      this.field_3996 = var4;
   }

   @Override
   public void run() {
      InetAddress var3 = null;

      try {
         if (class_501.method_2494(this.field_3997)) {
            return;
         }

         var3 = InetAddress.getByName(this.field_3995);
         class_501.method_2491(this.field_3997, class_5121.method_23489(var3, this.field_3996, this.field_3997.field_943.field_9577.method_40877()));
         class_501.method_2496(this.field_3997)
            .method_23495(
               new class_261(
                  class_501.method_2496(this.field_3997),
                  this.field_3997.field_943,
                  class_501.method_2495(this.field_3997),
                  var1 -> class_501.method_2490(this.field_3997, var1)
               )
            );
         class_501.method_2496(this.field_3997).method_23485(new class_8135(this.field_3995, this.field_3996, class_5776.field_29174));
         class_501.method_2496(this.field_3997).method_23485(new class_4014(this.field_3997.field_943.method_8502().method_5370()));
      } catch (UnknownHostException var6) {
         if (class_501.method_2494(this.field_3997)) {
            return;
         }

         class_501.method_2492().error("Couldn't connect to server", var6);
         this.field_3997
            .field_943
            .execute(
               () -> this.field_3997
                     .field_943
                     .method_8609(
                        new class_7773(
                           class_501.method_2495(this.field_3997),
                           class_1402.field_7627,
                           new TranslationTextComponent("disconnect.genericReason", "Unknown host")
                        )
                     )
            );
      } catch (Exception var7) {
         if (class_501.method_2494(this.field_3997)) {
            return;
         }

         class_501.method_2492().error("Couldn't connect to server", var7);
         String var5 = var3 == null ? var7.toString() : var7.toString().replaceAll(var3 + ":" + this.field_3996, "");
         this.field_3997
            .field_943
            .execute(
               () -> this.field_3997
                     .field_943
                     .method_8609(
                        new class_7773(
                           class_501.method_2495(this.field_3997), class_1402.field_7627, new TranslationTextComponent("disconnect.genericReason", var5)
                        )
                     )
            );
      }
   }
}
