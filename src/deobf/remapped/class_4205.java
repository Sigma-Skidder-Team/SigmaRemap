package remapped;

import java.util.EnumSet;

public class class_4205 extends class_3599 {
   private static String[] field_20447;
   private final class_496 field_20446;

   public class_4205(class_496 var1) {
      this.field_20446 = var1;
      this.method_16800(EnumSet.<class_1891>of(class_1891.field_9564, class_1891.field_9560, class_1891.field_9561));
   }

   @Override
   public boolean method_16795() {
      if ((this.field_20446.method_26449() || this.field_20446.method_2423()) && this.field_20446.onGround) {
         if (this.field_20446.method_2451()) {
            float var3 = this.field_20446.rotationYaw * (float) (Math.PI / 180.0);
            int var4 = 0;
            int var5 = 0;
            float var6 = -class_9299.method_42818(var3);
            float var7 = class_9299.method_42840(var3);
            if ((double)Math.abs(var6) > 0.5) {
               var4 = (int)((float)var4 + var6 / Math.abs(var6));
            }

            if ((double)Math.abs(var7) > 0.5) {
               var5 = (int)((float)var5 + var7 / Math.abs(var7));
            }

            if (this.field_20446.world.method_28262(this.field_20446.method_37075().method_6104(var4, -1, var5)).method_8345()) {
               return true;
            } else {
               return this.field_20446.method_2423() && class_496.method_2457(this.field_20446).nextInt(60) == 1
                  ? true
                  : class_496.method_2422(this.field_20446).nextInt(500) == 1;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   @Override
   public boolean method_16799() {
      return false;
   }

   @Override
   public void method_16796() {
      this.field_20446.method_2445(true);
   }

   @Override
   public boolean method_16801() {
      return false;
   }
}
