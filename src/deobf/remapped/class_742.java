package remapped;

public class class_742 extends class_2451 {
   private static String[] field_4042;
   private static final class_6191 field_4044 = new class_4048();
   private final class_3481 field_4043;

   public class_742(class_3481 var1, class_317 var2) {
      super(var2);
      this.field_4043 = var1;
      class_6451.method_29408(this, field_4044);
   }

   @Override
   public class_6910 method_11237(class_4734 var1) {
      World var4 = var1.method_21862();
      BlockPos var5 = var1.method_21858();
      class_2522 var6 = var4.method_28262(var5);
      if (var6.method_8349(class_2351.field_11745)) {
         ItemStack var7 = var1.method_21867();
         if (!var4.field_33055) {
            class_3665 var8 = !(var6.method_8360() instanceof class_6788)
               ? class_3665.field_17829
               : var6.<class_3665>method_10313(((class_6788)var6.method_8360()).method_31121());
            double var9 = 0.0;
            if (var8.method_17011()) {
               var9 = 0.5;
            }

            AbstractMinecartEntity var11 = AbstractMinecartEntity.method_4759(
               var4, (double)var5.method_12173() + 0.5, (double)var5.method_12165() + 0.0625 + var9, (double)var5.method_12185() + 0.5, this.field_4043
            );
            if (var7.method_28018()) {
               var11.method_37303(var7.method_28008());
            }

            var4.method_7509(var11);
         }

         var7.method_27970(1);
         return class_6910.method_31659(var4.field_33055);
      } else {
         return class_6910.field_35517;
      }
   }
}
