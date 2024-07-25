package remapped;

import java.util.EnumSet;
import javax.annotation.Nullable;

public class class_8285 extends class_3599 {
   private static String[] field_42469;
   public final class_4612 field_42465;
   public double field_42467;
   public double field_42470;
   public double field_42471;
   public final double field_42468;
   public int field_42473;
   public boolean field_42466;
   private boolean field_42472;

   public class_8285(class_4612 var1, double var2) {
      this(var1, var2, 120);
   }

   public class_8285(class_4612 var1, double var2, int var4) {
      this(var1, var2, var4, true);
   }

   public class_8285(class_4612 var1, double var2, int var4, boolean var5) {
      this.field_42465 = var1;
      this.field_42468 = var2;
      this.field_42473 = var4;
      this.field_42472 = var5;
      this.method_16800(EnumSet.<Flag>of(Flag.MOVE));
   }

   @Override
   public boolean method_16795() {
      if (!this.field_42465.method_37151()) {
         if (!this.field_42466) {
            if (this.field_42472 && this.field_42465.method_26532() >= 100) {
               return false;
            }

            if (this.field_42465.method_26594().nextInt(this.field_42473) != 0) {
               return false;
            }
         }

         class_1343 var3 = this.method_38233();
         if (var3 != null) {
            this.field_42467 = var3.field_7336;
            this.field_42470 = var3.field_7333;
            this.field_42471 = var3.field_7334;
            this.field_42466 = false;
            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   @Nullable
   public class_1343 method_38233() {
      return class_3425.method_15845(this.field_42465, 10, 7);
   }

   @Override
   public boolean method_16799() {
      return !this.field_42465.method_26927().method_5591() && !this.field_42465.method_37151();
   }

   @Override
   public void method_16796() {
      this.field_42465.method_26927().method_5595(this.field_42467, this.field_42470, this.field_42471, this.field_42468);
   }

   @Override
   public void method_16793() {
      this.field_42465.method_26927().method_5620();
      super.method_16793();
   }

   public void method_38234() {
      this.field_42466 = true;
   }

   public void method_38232(int var1) {
      this.field_42473 = var1;
   }
}
