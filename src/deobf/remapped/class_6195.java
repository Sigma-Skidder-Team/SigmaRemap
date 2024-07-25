package remapped;

public class class_6195 extends class_6216 {
   public class_6195(class_4106 var1, class_5115 var2) {
      super(var1, var2);
      this.field_27895.put("stonecutting", this::method_28331);
      this.field_27895.put("blasting", this::method_28430);
      this.field_27895.put("smoking", this::method_28430);
      this.field_27895.put("campfire_cooking", this::method_28430);
   }

   public void method_28331(class_5051 var1) throws Exception {
      var1.<String>method_23261(class_8039.field_41171);
      class_9530[] var4 = var1.<class_9530[]>method_23261(class_8039.field_41185);

      for (class_9530 var8 : var4) {
         this.field_27893.method_23451(var8);
      }

      this.field_27893.method_23451(var1.<class_9530>method_23261(class_8039.field_41162));
   }
}
