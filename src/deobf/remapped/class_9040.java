package remapped;

import javax.annotation.Nullable;

public class class_9040 extends class_1871 {
   private static String[] field_46260;
   private static final class_4931 field_46257 = new class_4931().method_22607(64.0);
   private class_3998 field_46258;
   private class_1343 field_46259;
   private boolean field_46256;

   public class_9040(class_2770 var1) {
      super(var1);
   }

   @Override
   public class_8978<class_9040> method_23464() {
      return class_8978.field_46006;
   }

   @Override
   public void method_23473() {
      double var3 = this.field_46259 != null
         ? this.field_46259.method_6203(this.field_9479.method_37302(), this.field_9479.method_37309(), this.field_9479.method_37156())
         : 0.0;
      if (var3 < 100.0 || var3 > 22500.0 || this.field_9479.field_41744 || this.field_9479.field_41774) {
         this.method_41498();
      }
   }

   @Override
   public void method_23469() {
      this.field_46258 = null;
      this.field_46259 = null;
   }

   @Nullable
   @Override
   public class_1343 method_23463() {
      return this.field_46259;
   }

   private void method_41498() {
      if (this.field_46258 != null && this.field_46258.method_18436()) {
         class_1331 var3 = this.field_9479.field_41768.method_22563(class_3801.field_18590, new class_1331(class_8870.field_45348));
         int var4 = this.field_9479.method_12622() != null ? this.field_9479.method_12622().method_12784() : 0;
         if (this.field_9479.method_26594().nextInt(var4 + 3) == 0) {
            this.field_9479.method_12611().method_29422(class_8978.field_45996);
            return;
         }

         double var5 = 64.0;
         class_704 var7 = this.field_9479
            .field_41768
            .method_25858(field_46257, (double)var3.method_12173(), (double)var3.method_12165(), (double)var3.method_12185());
         if (var7 != null) {
            var5 = var3.method_12179(var7.method_37245(), true) / 512.0;
         }

         if (var7 != null
            && !var7.field_3876.field_4940
            && (this.field_9479.method_26594().nextInt(class_9299.method_42805((int)var5) + 2) == 0 || this.field_9479.method_26594().nextInt(var4 + 2) == 0)) {
            this.method_41500(var7);
            return;
         }
      }

      if (this.field_46258 == null || this.field_46258.method_18436()) {
         int var8 = this.field_9479.method_12606();
         int var9 = var8;
         if (this.field_9479.method_26594().nextInt(8) == 0) {
            this.field_46256 = !this.field_46256;
            var9 = var8 + 6;
         }

         if (!this.field_46256) {
            var9--;
         } else {
            var9++;
         }

         if (this.field_9479.method_12622() != null && this.field_9479.method_12622().method_12784() >= 0) {
            var9 %= 12;
            if (var9 < 0) {
               var9 += 12;
            }
         } else {
            var9 -= 12;
            var9 &= 7;
            var9 += 12;
         }

         this.field_46258 = this.field_9479.method_12612(var8, var9, (class_5851)null);
         if (this.field_46258 != null) {
            this.field_46258.method_18434();
         }
      }

      this.method_41499();
   }

   private void method_41500(class_704 var1) {
      this.field_9479.method_12611().method_29422(class_8978.field_46007);
      this.field_9479.method_12611().<class_3394>method_29420(class_8978.field_46007).method_15684(var1);
   }

   private void method_41499() {
      if (this.field_46258 != null && !this.field_46258.method_18436()) {
         class_1331 var3 = this.field_46258.method_18449();
         this.field_46258.method_18434();
         double var4 = (double)var3.method_12173();
         double var6 = (double)var3.method_12185();

         double var8;
         do {
            var8 = (double)((float)var3.method_12165() + this.field_9479.method_26594().nextFloat() * 20.0F);
         } while (var8 < (double)var3.method_12165());

         this.field_46259 = new class_1343(var4, var8, var6);
      }
   }

   @Override
   public void method_23468(class_3577 var1, class_1331 var2, class_6199 var3, class_704 var4) {
      if (var4 != null && !var4.field_3876.field_4940) {
         this.method_41500(var4);
      }
   }
}
