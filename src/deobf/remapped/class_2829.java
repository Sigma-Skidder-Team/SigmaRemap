package remapped;

import java.util.EnumSet;
import java.util.Random;
import javax.annotation.Nullable;

public class class_2829 extends class_3599 {
   private static String[] field_13863;
   public final class_4612 field_13867;
   private double field_13868;
   private double field_13866;
   private double field_13869;
   private final double field_13865;
   private final World field_13864;

   public class_2829(class_4612 var1, double var2) {
      this.field_13867 = var1;
      this.field_13865 = var2;
      this.field_13864 = var1.world;
      this.method_16800(EnumSet.<Flag>of(Flag.MOVE));
   }

   @Override
   public boolean method_16795() {
      if (this.field_13867.getAttackTarget() == null) {
         if (this.field_13864.method_29602()) {
            if (this.field_13867.method_37264()) {
               if (this.field_13864.method_25263(this.field_13867.method_37075())) {
                  return this.field_13867.method_26520(class_6943.field_35704).method_28022() ? this.method_12869() : false;
               } else {
                  return false;
               }
            } else {
               return false;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public boolean method_12869() {
      class_1343 var3 = this.method_12868();
      if (var3 != null) {
         this.field_13868 = var3.field_7336;
         this.field_13866 = var3.field_7333;
         this.field_13869 = var3.field_7334;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean method_16799() {
      return !this.field_13867.method_26927().method_5591();
   }

   @Override
   public void method_16796() {
      this.field_13867.method_26927().method_5595(this.field_13868, this.field_13866, this.field_13869, this.field_13865);
   }

   @Nullable
   public class_1343 method_12868() {
      Random var3 = this.field_13867.method_26594();
      BlockPos var4 = this.field_13867.method_37075();

      for (int var5 = 0; var5 < 10; var5++) {
         BlockPos var6 = var4.method_6104(var3.nextInt(20) - 10, var3.nextInt(6) - 3, var3.nextInt(20) - 10);
         if (!this.field_13864.method_25263(var6) && this.field_13867.method_21375(var6) < 0.0F) {
            return class_1343.method_6200(var6);
         }
      }

      return null;
   }
}
