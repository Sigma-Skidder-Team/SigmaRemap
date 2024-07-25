package remapped;

public class class_7333 extends class_4088 {
   private static String[] field_37485;
   public final class_2831<class_6098> field_37486 = class_2831.<class_6098>method_12874();

   public class_7333(class_704 var1) {
      super((class_4165<?>)null, 0);
      class_7051 var4 = var1.field_3853;

      for (int var5 = 0; var5 < 5; var5++) {
         for (int var6 = 0; var6 < 9; var6++) {
            this.method_18885(new class_9736(class_2546.method_11589(), var5 * 9 + var6, 9 + var6 * 18, 18 + var5 * 18));
         }
      }

      for (int var7 = 0; var7 < 9; var7++) {
         this.method_18885(new class_7934(var4, var7, 9 + var7 * 18, 112));
      }

      this.method_33420(0.0F);
   }

   @Override
   public boolean method_18861(class_704 var1) {
      return true;
   }

   public void method_33420(float var1) {
      int var4 = (this.field_37486.size() + 9 - 1) / 9 - 5;
      int var5 = (int)((double)(var1 * (float)var4) + 0.5);
      if (var5 < 0) {
         var5 = 0;
      }

      for (int var6 = 0; var6 < 5; var6++) {
         for (int var7 = 0; var7 < 9; var7++) {
            int var8 = var7 + (var6 + var5) * 9;
            if (var8 >= 0 && var8 < this.field_37486.size()) {
               class_2546.method_11589().method_31503(var7 + var6 * 9, this.field_37486.get(var8));
            } else {
               class_2546.method_11589().method_31503(var7 + var6 * 9, class_6098.field_31203);
            }
         }
      }
   }

   public boolean method_33421() {
      return this.field_37486.size() > 45;
   }

   @Override
   public class_6098 method_18874(class_704 var1, int var2) {
      if (var2 >= this.field_19926.size() - 9 && var2 < this.field_19926.size()) {
         class_7934 var5 = this.field_19926.get(var2);
         if (var5 != null && var5.method_35884()) {
            var5.method_35896(class_6098.field_31203);
         }
      }

      return class_6098.field_31203;
   }

   @Override
   public boolean method_18873(class_6098 var1, class_7934 var2) {
      return var2.field_40591 != class_2546.method_11589();
   }

   @Override
   public boolean method_18857(class_7934 var1) {
      return var1.field_40591 != class_2546.method_11589();
   }
}
