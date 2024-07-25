package remapped;

public class class_9446 implements class_6191 {
   private static String[] field_48208;

   @Override
   public final ItemStack method_28324(class_8743 var1, ItemStack var2) {
      ItemStack var5 = this.method_43688(var1, var2);
      this.method_43687(var1);
      this.method_43689(var1, var1.method_40141().<Direction>method_10313(class_6451.field_32900));
      return var5;
   }

   public ItemStack method_43688(class_8743 var1, ItemStack var2) {
      Direction var5 = var1.method_40141().<Direction>method_10313(class_6451.field_32900);
      class_66 var6 = class_6451.method_29411(var1);
      ItemStack var7 = var2.method_27953(1);
      method_43686(var1.method_40140(), var7, 6, var5, var6);
      return var2;
   }

   public static void method_43686(World var0, ItemStack var1, int var2, Direction var3, class_66 var4) {
      double var7 = var4.method_61();
      double var9 = var4.method_60();
      double var11 = var4.method_62();
      if (var3.method_1029() != class_9249.field_47216) {
         var9 -= 0.15625;
      } else {
         var9 -= 0.125;
      }

      class_91 var13 = new class_91(var0, var7, var9, var11, var1);
      double var14 = var0.field_33033.nextDouble() * 0.1 + 0.2;
      var13.method_37214(
         var0.field_33033.nextGaussian() * 0.0075F * (double)var2 + (double)var3.method_1041() * var14,
         var0.field_33033.nextGaussian() * 0.0075F * (double)var2 + 0.2F,
         var0.field_33033.nextGaussian() * 0.0075F * (double)var2 + (double)var3.method_1034() * var14
      );
      var0.method_7509(var13);
   }

   public void method_43687(class_8743 var1) {
      var1.method_40140().method_43364(1000, var1.method_40142(), 0);
   }

   public void method_43689(class_8743 var1, Direction var2) {
      var1.method_40140().method_43364(2000, var1.method_40142(), var2.method_1050());
   }
}
