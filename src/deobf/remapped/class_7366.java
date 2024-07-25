package remapped;

public class class_7366 extends class_9128 {
   public static class_7366 field_37635;

   public class_7366() {
      super(class_5664.field_28709, "XRay", "Shows ores");
      field_37635 = this;
   }

   @Override
   public void method_42006() {
      field_46692.field_9657.method_19998();
      class_914 var3 = (class_914)class_727.method_3328().method_3298().method_847(class_914.class);
      if (!var3.method_42015()) {
         var3.method_42023(true);
      }
   }

   @Override
   public void method_42020() {
      field_46692.field_9657.method_19998();
   }

   @class_9148
   public void method_33542(class_3310 var1) {
      if (this.method_42015()) {
         class_1873 var4 = var1.method_15183();
         if (!(var4.method_8360() instanceof class_285) && var4.method_8360() != class_4783.field_23211) {
            var1.method_29715(true);
         } else {
            var1.method_15182(true);
         }
      }
   }
}
