package remapped;

import java.util.Random;

public class class_3252 extends class_378 {
   private static String[] field_16146;

   public class_3252(class_6629<? extends class_3252> var1, World var2) {
      super(var1, var2);
   }

   public static class_1313 method_14866() {
      return class_1173.method_5201().method_5984(class_7331.field_37465, 0.2F);
   }

   public static boolean method_14865(class_6629<class_3252> var0, class_9379 var1, class_2417 var2, class_1331 var3, Random var4) {
      return var1.method_43370() != class_423.field_1790;
   }

   @Override
   public boolean method_26855(class_4924 var1) {
      return var1.method_6677(this) && !var1.method_22550(this.method_37241());
   }

   @Override
   public void method_1861(int var1, boolean var2) {
      super.method_1861(var1, var2);
      this.method_26561(class_7331.field_37473).method_45006((double)(var1 * 3));
   }

   @Override
   public float method_37193() {
      return 1.0F;
   }

   @Override
   public class_5079 method_1854() {
      return class_3090.field_15321;
   }

   @Override
   public Identifier method_26934() {
      return !this.method_1859() ? this.method_37387().method_30480() : class_5931.field_30157;
   }

   @Override
   public boolean method_37264() {
      return false;
   }

   @Override
   public int method_1862() {
      return super.method_1862() * 4;
   }

   @Override
   public void method_1855() {
      this.field_1537 *= 0.9F;
   }

   @Override
   public void method_26595() {
      class_1343 var3 = this.method_37098();
      this.method_37214(var3.field_7336, (double)(this.method_26538() + (float)this.method_1860() * 0.1F), var3.field_7334);
      this.field_41763 = true;
   }

   @Override
   public void method_26583(class_2307<class_2340> var1) {
      if (var1 != class_6503.field_33095) {
         super.method_26583(var1);
      } else {
         class_1343 var4 = this.method_37098();
         this.method_37214(var4.field_7336, (double)(0.22F + (float)this.method_1860() * 0.05F), var4.field_7334);
         this.field_41763 = true;
      }
   }

   @Override
   public boolean method_37270(float var1, float var2) {
      return false;
   }

   @Override
   public boolean method_1857() {
      return this.method_26530();
   }

   @Override
   public float method_1858() {
      return super.method_1858() + 2.0F;
   }

   @Override
   public class_8461 method_26541(class_6199 var1) {
      return !this.method_1859() ? class_463.field_2044 : class_463.field_2413;
   }

   @Override
   public class_8461 method_26599() {
      return !this.method_1859() ? class_463.field_1927 : class_463.field_1983;
   }

   @Override
   public class_8461 method_1850() {
      return !this.method_1859() ? class_463.field_2639 : class_463.field_2461;
   }

   @Override
   public class_8461 method_1849() {
      return class_463.field_2606;
   }
}