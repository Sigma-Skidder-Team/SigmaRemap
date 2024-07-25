package remapped;

import javax.annotation.Nullable;

public class class_4341 extends class_1871 {
   private static String[] field_21094;
   private static final class_4931 field_21092 = new class_4931().method_22607(128.0);
   private class_3998 field_21093;
   private class_1343 field_21095;

   public class_4341(class_2770 var1) {
      super(var1);
   }

   @Override
   public class_8978<class_4341> method_23464() {
      return class_8978.field_45996;
   }

   @Override
   public void method_23469() {
      this.field_21093 = null;
      this.field_21095 = null;
   }

   @Override
   public void method_23473() {
      double var3 = this.field_21095 != null
         ? this.field_21095.method_6203(this.field_9479.method_37302(), this.field_9479.method_37309(), this.field_9479.method_37156())
         : 0.0;
      if (var3 < 100.0 || var3 > 22500.0 || this.field_9479.field_41744 || this.field_9479.field_41774) {
         this.method_20193();
      }
   }

   @Nullable
   @Override
   public class_1343 method_23463() {
      return this.field_21095;
   }

   private void method_20193() {
      if (this.field_21093 == null || this.field_21093.method_18436()) {
         int var3 = this.field_9479.method_12606();
         class_1331 var4 = this.field_9479.field_41768.method_22563(class_3801.field_18590, class_8870.field_45348);
         class_704 var5 = this.field_9479
            .field_41768
            .method_25858(field_21092, (double)var4.method_12173(), (double)var4.method_12165(), (double)var4.method_12185());
         int var6;
         if (var5 == null) {
            var6 = this.field_9479.method_12614(40.0, (double)var4.method_12165(), 0.0);
         } else {
            class_1343 var7 = new class_1343(var5.method_37302(), 0.0, var5.method_37156()).method_6213();
            var6 = this.field_9479.method_12614(-var7.field_7336 * 40.0, 105.0, -var7.field_7334 * 40.0);
         }

         class_5851 var8 = new class_5851(var4.method_12173(), var4.method_12165(), var4.method_12185());
         this.field_21093 = this.field_9479.method_12612(var3, var6, var8);
         if (this.field_21093 != null) {
            this.field_21093.method_18434();
         }
      }

      this.method_20194();
      if (this.field_21093 != null && this.field_21093.method_18436()) {
         this.field_9479.method_12611().method_29422(class_8978.field_45995);
      }
   }

   private void method_20194() {
      if (this.field_21093 != null && !this.field_21093.method_18436()) {
         class_1331 var3 = this.field_21093.method_18449();
         this.field_21093.method_18434();
         double var4 = (double)var3.method_12173();
         double var6 = (double)var3.method_12185();

         double var8;
         do {
            var8 = (double)((float)var3.method_12165() + this.field_9479.method_26594().nextFloat() * 20.0F);
         } while (var8 < (double)var3.method_12165());

         this.field_21095 = new class_1343(var4, var8, var6);
      }
   }
}
