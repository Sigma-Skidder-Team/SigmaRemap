package remapped;

import javax.annotation.Nullable;

public class class_2173 extends class_1871 {
   private static String[] field_10829;
   private boolean field_10830;
   private class_3998 field_10827;
   private class_1343 field_10828;

   public class_2173(class_2770 var1) {
      super(var1);
   }

   @Override
   public void method_23473() {
      if (!this.field_10830 && this.field_10827 != null) {
         class_1331 var3 = this.field_9479.field_41768.method_22563(class_3801.field_18590, class_8870.field_45348);
         if (!var3.method_12170(this.field_9479.method_37245(), 10.0)) {
            this.field_9479.method_12611().method_29422(class_8978.field_46006);
         }
      } else {
         this.field_10830 = false;
         this.method_10092();
      }
   }

   @Override
   public void method_23469() {
      this.field_10830 = true;
      this.field_10827 = null;
      this.field_10828 = null;
   }

   private void method_10092() {
      int var3 = this.field_9479.method_12606();
      class_1343 var4 = this.field_9479.method_12609(1.0F);
      int var5 = this.field_9479.method_12614(-var4.field_7336 * 40.0, 105.0, -var4.field_7334 * 40.0);
      if (this.field_9479.method_12622() != null && this.field_9479.method_12622().method_12784() > 0) {
         var5 %= 12;
         if (var5 < 0) {
            var5 += 12;
         }
      } else {
         var5 -= 12;
         var5 &= 7;
         var5 += 12;
      }

      this.field_10827 = this.field_9479.method_12612(var3, var5, (class_5851)null);
      this.method_10091();
   }

   private void method_10091() {
      if (this.field_10827 != null) {
         this.field_10827.method_18434();
         if (!this.field_10827.method_18436()) {
            class_1331 var3 = this.field_10827.method_18449();
            this.field_10827.method_18434();

            double var4;
            do {
               var4 = (double)((float)var3.method_12165() + this.field_9479.method_26594().nextFloat() * 20.0F);
            } while (var4 < (double)var3.method_12165());

            this.field_10828 = new class_1343((double)var3.method_12173(), var4, (double)var3.method_12185());
         }
      }
   }

   @Nullable
   @Override
   public class_1343 method_23463() {
      return this.field_10828;
   }

   @Override
   public class_8978<class_2173> method_23464() {
      return class_8978.field_46003;
   }
}
