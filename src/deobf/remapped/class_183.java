package remapped;

public class class_183 extends class_6195 {
   public class_183(class_4106 var1, class_5115 var2) {
      super(var1, var2);
      this.field_27895.put("smithing", this::method_820);
   }

   public void method_820(class_5051 var1) throws Exception {
      class_9530[] var4 = var1.<class_9530[]>method_23261(class_8039.field_41185);

      for (class_9530 var8 : var4) {
         this.field_27893.method_23451(var8);
      }

      class_9530[] var10 = var1.<class_9530[]>method_23261(class_8039.field_41185);

      for (class_9530 var9 : var10) {
         this.field_27893.method_23451(var9);
      }

      this.field_27893.method_23451(var1.<class_9530>method_23261(class_8039.field_41162));
   }
}
