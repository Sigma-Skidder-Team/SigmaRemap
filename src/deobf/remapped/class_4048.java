package remapped;

public final class class_4048 extends class_9446 {
   private static String[] field_19682;
   private final class_9446 field_19683 = new class_9446();

   @Override
   public ItemStack method_43688(class_8743 var1, ItemStack var2) {
      Direction var5 = var1.method_40141().<Direction>method_10313(class_6451.field_32900);
      class_6331 var6 = var1.method_40140();
      double var7 = var1.method_61() + (double)var5.method_1041() * 1.125;
      double var9 = Math.floor(var1.method_60()) + (double)var5.method_1054();
      double var11 = var1.method_62() + (double)var5.method_1034() * 1.125;
      BlockPos var13 = var1.method_40142().method_6098(var5);
      class_2522 var14 = var6.method_28262(var13);
      class_3665 var15 = !(var14.method_8360() instanceof class_6788)
         ? class_3665.field_17829
         : var14.<class_3665>method_10313(((class_6788)var14.method_8360()).method_31121());
      double var16;
      if (!var14.method_8349(class_2351.field_11745)) {
         if (!var14.method_8345() || !var6.method_28262(var13.method_6100()).method_8349(class_2351.field_11745)) {
            return this.field_19683.method_28324(var1, var2);
         }

         class_2522 var18 = var6.method_28262(var13.method_6100());
         class_3665 var19 = !(var18.method_8360() instanceof class_6788)
            ? class_3665.field_17829
            : var18.<class_3665>method_10313(((class_6788)var18.method_8360()).method_31121());
         if (var5 != Direction.field_802 && var19.method_17011()) {
            var16 = -0.4;
         } else {
            var16 = -0.9;
         }
      } else if (!var15.method_17011()) {
         var16 = 0.1;
      } else {
         var16 = 0.6;
      }

      AbstractMinecartEntity var20 = AbstractMinecartEntity.method_4759(var6, var7, var9 + var16, var11, class_742.method_3371((class_742)var2.method_27960()));
      if (var2.method_28018()) {
         var20.method_37303(var2.method_28008());
      }

      var6.method_7509(var20);
      var2.method_27970(1);
      return var2;
   }

   @Override
   public void method_43687(class_8743 var1) {
      var1.method_40140().method_43364(1000, var1.method_40142(), 0);
   }
}
