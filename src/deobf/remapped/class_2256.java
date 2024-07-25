package remapped;

import java.util.EnumSet;
import java.util.List;

public class class_2256 extends class_3599 {
   private static String[] field_11225;
   private int field_11226;

   public class_2256(class_496 var1) {
      this.field_11227 = var1;
      this.method_16800(EnumSet.<class_1891>of(class_1891.field_9564));
   }

   @Override
   public boolean method_16795() {
      if (this.field_11226 <= this.field_11227.field_41697
         && !this.field_11227.method_26449()
         && !this.field_11227.method_37285()
         && this.field_11227.method_2451()
         && this.field_11227.method_2430() <= 0) {
         List var3 = this.field_11227
            .field_41768
            .<class_91>method_25869(class_91.class, this.field_11227.method_37241().method_18899(6.0, 6.0, 6.0), class_496.method_2437());
         return !var3.isEmpty() || !this.field_11227.method_26520(class_6943.field_35707).method_28022();
      } else {
         return false;
      }
   }

   @Override
   public boolean method_16799() {
      return !this.field_11227.method_37285() && (this.field_11227.method_2468() || class_496.method_2470(this.field_11227).nextInt(600) != 1)
         ? class_496.method_2452(this.field_11227).nextInt(2000) != 1
         : false;
   }

   @Override
   public void method_16794() {
      if (!this.field_11227.method_2449() && !this.field_11227.method_26520(class_6943.field_35707).method_28022()) {
         class_496.method_2459(this.field_11227);
      }
   }

   @Override
   public void method_16796() {
      List var3 = this.field_11227
         .field_41768
         .<class_91>method_25869(class_91.class, this.field_11227.method_37241().method_18899(8.0, 8.0, 8.0), class_496.method_2437());
      if (!var3.isEmpty() && this.field_11227.method_26520(class_6943.field_35707).method_28022()) {
         this.field_11227.method_26927().method_5616((Entity)var3.get(0), 1.2F);
      } else if (!this.field_11227.method_26520(class_6943.field_35707).method_28022()) {
         class_496.method_2459(this.field_11227);
      }

      this.field_11226 = 0;
   }

   @Override
   public void method_16793() {
      class_6098 var3 = this.field_11227.method_26520(class_6943.field_35707);
      if (!var3.method_28022()) {
         this.field_11227.method_37310(var3);
         this.field_11227.method_37349(class_6943.field_35707, class_6098.field_31203);
         int var4 = !this.field_11227.method_2468()
            ? class_496.method_2463(this.field_11227).nextInt(150) + 10
            : class_496.method_2453(this.field_11227).nextInt(50) + 10;
         this.field_11226 = this.field_11227.field_41697 + var4 * 20;
      }

      this.field_11227.method_2442(false);
   }
}
