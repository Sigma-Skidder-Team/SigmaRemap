package remapped;

public class class_3224 extends class_6451 {
   private static String[] field_16062;
   private static final class_6191 field_16063 = new class_9446();

   public class_3224(class_3073 var1) {
      super(var1);
   }

   @Override
   public class_6191 method_29409(ItemStack var1) {
      return field_16063;
   }

   @Override
   public class_3757 method_3281(class_6163 var1) {
      return new class_5705();
   }

   @Override
   public void method_29410(class_6331 var1, BlockPos var2) {
      class_1010 var5 = new class_1010(var1, var2);
      class_7434 var6 = var5.<class_7434>method_40143();
      int var7 = var6.method_33831();
      if (var7 >= 0) {
         ItemStack var8 = var6.method_31498(var7);
         if (!var8.method_28022()) {
            Direction var9 = var1.method_28262(var2).<Direction>method_10313(field_32900);
            class_6867 var10 = class_5772.method_26108(var1, var2.method_6098(var9));
            ItemStack var12;
            if (var10 != null) {
               var12 = class_5772.method_26103(var6, var10, var8.method_27973().method_27953(1), var9.method_1046());
               if (!var12.method_28022()) {
                  var12 = var8.method_27973();
               } else {
                  var12 = var8.method_27973();
                  var12.method_27970(1);
               }
            } else {
               var12 = field_16063.method_28324(var5, var8);
            }

            var6.method_31503(var7, var12);
         }
      } else {
         var1.method_43364(1001, var2, 0);
      }
   }
}
