package remapped;

import java.util.EnumSet;

public abstract class class_6967 extends class_3599 {
   public final class_4612 field_35801;
   public final double field_35803;
   public int field_35805;
   public int field_35808;
   private int field_35809;
   public class_1331 field_35802 = class_1331.field_7306;
   private boolean field_35806;
   private final int field_35807;
   private final int field_35804;
   public int field_35800;

   public class_6967(class_4612 var1, double var2, int var4) {
      this(var1, var2, var4, 1);
   }

   public class_6967(class_4612 var1, double var2, int var4, int var5) {
      this.field_35801 = var1;
      this.field_35803 = var2;
      this.field_35807 = var4;
      this.field_35800 = 0;
      this.field_35804 = var5;
      this.method_16800(EnumSet.<class_1891>of(class_1891.field_9564, class_1891.field_9561));
   }

   @Override
   public boolean method_16795() {
      if (this.field_35805 <= 0) {
         this.field_35805 = this.method_31862(this.field_35801);
         return this.method_31856();
      } else {
         this.field_35805--;
         return false;
      }
   }

   public int method_31862(class_4612 var1) {
      return 200 + var1.method_26594().nextInt(200);
   }

   @Override
   public boolean method_16799() {
      return this.field_35808 >= -this.field_35809 && this.field_35808 <= 1200 && this.method_31855(this.field_35801.field_41768, this.field_35802);
   }

   @Override
   public void method_16796() {
      this.method_31859();
      this.field_35808 = 0;
      this.field_35809 = this.field_35801.method_26594().nextInt(this.field_35801.method_26594().nextInt(1200) + 1200) + 1200;
   }

   public void method_31859() {
      this.field_35801
         .method_26927()
         .method_5595(
            (double)((float)this.field_35802.method_12173()) + 0.5,
            (double)(this.field_35802.method_12165() + 1),
            (double)((float)this.field_35802.method_12185()) + 0.5,
            this.field_35803
         );
   }

   public double method_31857() {
      return 1.0;
   }

   public class_1331 method_31861() {
      return this.field_35802.method_6081();
   }

   @Override
   public void method_16794() {
      class_1331 var3 = this.method_31861();
      if (var3.method_12170(this.field_35801.method_37245(), this.method_31857())) {
         this.field_35806 = true;
         this.field_35808--;
      } else {
         this.field_35806 = false;
         this.field_35808++;
         if (this.method_31858()) {
            this.field_35801
               .method_26927()
               .method_5595(
                  (double)((float)var3.method_12173()) + 0.5, (double)var3.method_12165(), (double)((float)var3.method_12185()) + 0.5, this.field_35803
               );
         }
      }
   }

   public boolean method_31858() {
      return this.field_35808 % 40 == 0;
   }

   public boolean method_31860() {
      return this.field_35806;
   }

   public boolean method_31856() {
      int var3 = this.field_35807;
      int var4 = this.field_35804;
      class_1331 var5 = this.field_35801.method_37075();
      class_2921 var6 = new class_2921();

      for (int var7 = this.field_35800; var7 <= var4; var7 = var7 <= 0 ? 1 - var7 : -var7) {
         for (int var8 = 0; var8 < var3; var8++) {
            for (int var9 = 0; var9 <= var8; var9 = var9 <= 0 ? 1 - var9 : -var9) {
               for (int var10 = var9 < var8 && var9 > -var8 ? var8 : 0; var10 <= var8; var10 = var10 <= 0 ? 1 - var10 : -var10) {
                  var6.method_13360(var5, var9, var7 - 1, var10);
                  if (this.field_35801.method_26880(var6) && this.method_31855(this.field_35801.field_41768, var6)) {
                     this.field_35802 = var6;
                     return true;
                  }
               }
            }
         }
      }

      return false;
   }

   public abstract boolean method_31855(class_4924 var1, class_1331 var2);
}
