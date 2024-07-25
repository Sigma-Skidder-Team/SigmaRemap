package remapped;

public final class class_4153 extends class_8085 {
   private static String[] field_20197;

   @Override
   public ItemStack method_43688(class_8743 var1, ItemStack var2) {
      class_6331 var5 = var1.method_40140();
      this.method_36717(true);
      Direction var6 = var1.method_40141().<Direction>method_10313(class_6451.field_32900);
      class_1331 var7 = var1.method_40142().method_6098(var6);
      class_2522 var8 = var5.method_28262(var7);
      if (!class_9476.method_43769(var5, var7, var6)) {
         if (!class_8474.method_39007(var8)) {
            if (!(var8.method_8360() instanceof class_2727)) {
               this.method_36717(false);
            } else {
               class_2727.method_12256(var5, var7);
               var5.method_7508(var7, false);
            }
         } else {
            var5.method_29594(var7, var8.method_10308(class_6023.field_30732, Boolean.valueOf(true)));
         }
      } else {
         var5.method_29594(var7, class_9476.method_43768(var5, var7));
      }

      if (this.method_36716() && var2.method_27996(1, var5.field_33033, (class_9359)null)) {
         var2.method_28017(0);
      }

      return var2;
   }
}
