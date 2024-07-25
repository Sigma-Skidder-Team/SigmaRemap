package remapped;

import java.io.IOException;
import java.util.Date;
import java.util.Iterator;
import net.minecraft.util.text.StringTextComponent;

public class class_9140 extends class_2794 {
   public static Date field_46740 = new Date(0L);

   public class_9140() {
      super(true);
      if (field_46740.before(new Date(System.currentTimeMillis() - 3000L))) {
         field_46740 = new Date();
         SigmaMainClass.method_3328().method_3326().method_12863("Saving profiles...");

         try {
            SigmaMainClass.method_3328().method_3298().method_848().method_4306();
            SigmaMainClass.method_3328().method_3318();
         } catch (IOException var4) {
            var4.printStackTrace();
            SigmaMainClass.method_3328().method_3326().method_12862("Unable to save mod profiles...");
         }
      }
   }

   @Override
   public void method_1163() {
      if (SigmaMainClass.method_3328().method_3312() == class_6015.field_30645) {
         this.<class_9521>method_1186(
            new class_9521(
               this.field_941 / 2 - 102,
               this.field_940 - 45,
               204,
               20,
               new StringTextComponent("Jello for Sigma Options"),
               var1 -> this.field_943.method_8609(new class_4710())
            )
         );
      }

      super.method_1163();
      Iterator var3 = this.field_950.iterator();

      while (var3.hasNext()) {
         class_7114 var4 = (class_7114)var3.next();
         if (var4.field_36674 == this.field_940 / 4 + 72 + -16) {
            var3.remove();
         }
      }
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      super.method_6767(var1, var2, var3, var4);
   }

   @Override
   public boolean method_1161() {
      return false;
   }
}
