package remapped;

public class class_5063 extends class_3893 {
   private static String[] field_26177;

   public class_5063(class_1421 var1) {
      this.field_26176 = var1;
   }

   @Override
   public void method_18023() {
      this.method_18025(var1 -> {
         class_6150 var4 = class_1421.method_6524(this.field_26176).method_19008();
         class_1421.method_6521(this.field_26176, var1, var1x -> var4 == null ? null : var4.method_28207(var1x), class_1421.method_6518(this.field_26176));
         class_1421.method_6521(this.field_26176, var1, var1x -> var4 == null ? null : var4.method_28210(var1x), class_1421.method_6525(this.field_26176));
         if (class_1421.method_6517(this.field_26176) != null || !class_1421.method_6527(this.field_26176).isEmpty()) {
            int var5 = var1.<Integer>method_23261(class_8039.field_41157);

            for (int var6 = 0; var6 < var5; var6++) {
               var1.<String>method_23261(class_8039.field_41171);
               var1.<int[]>method_23261(class_8039.field_41144);
            }

            class_1421.method_6521(this.field_26176, var1, class_1421.method_6517(this.field_26176), class_1421.method_6527(this.field_26176));
         }
      });
   }
}
