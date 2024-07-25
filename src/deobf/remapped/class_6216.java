package remapped;

public class class_6216 extends class_5476 {
   public class_6216(class_4106 var1, class_5115 var2) {
      super(var1, var2);
      this.field_27895.put("crafting_shapeless", this::method_28432);
      this.field_27895.put("crafting_shaped", this::method_28431);
      this.field_27895.put("smelting", this::method_28430);
   }

   public void method_28430(class_5051 var1) throws Exception {
      var1.<String>method_23261(class_8039.field_41171);
      class_9530[] var4 = var1.<class_9530[]>method_23261(class_8039.field_41185);

      for (class_9530 var8 : var4) {
         this.field_27893.method_23451(var8);
      }

      this.field_27893.method_23451(var1.<class_9530>method_23261(class_8039.field_41162));
      var1.<Float>method_23261(class_8039.field_41146);
      var1.<Integer>method_23261(class_8039.field_41157);
   }

   public void method_28431(class_5051 var1) throws Exception {
      int var4 = var1.<Integer>method_23261(class_8039.field_41157) * var1.<Integer>method_23261(class_8039.field_41157);
      var1.<String>method_23261(class_8039.field_41171);

      for (int var5 = 0; var5 < var4; var5++) {
         class_9530[] var6 = var1.<class_9530[]>method_23261(class_8039.field_41185);

         for (class_9530 var10 : var6) {
            this.field_27893.method_23451(var10);
         }
      }

      this.field_27893.method_23451(var1.<class_9530>method_23261(class_8039.field_41162));
   }

   public void method_28432(class_5051 var1) throws Exception {
      var1.<String>method_23261(class_8039.field_41171);
      int var4 = var1.<Integer>method_23261(class_8039.field_41157);

      for (int var5 = 0; var5 < var4; var5++) {
         class_9530[] var6 = var1.<class_9530[]>method_23261(class_8039.field_41185);

         for (class_9530 var10 : var6) {
            this.field_27893.method_23451(var10);
         }
      }

      this.field_27893.method_23451(var1.<class_9530>method_23261(class_8039.field_41162));
   }
}
