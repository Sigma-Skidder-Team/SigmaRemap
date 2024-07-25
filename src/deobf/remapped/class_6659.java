package remapped;

public class class_6659 extends class_9128 {
   public class_6659() {
      super(class_5664.field_28716, "Vanilla", "Step for Vanilla");
      this.method_42010(new class_2748<Float>("Maximum heigh", "Maximum heigh", 2.0F, Float.class, 1.0F, 10.0F, 0.5F));
   }

   @class_9148
   private void method_30574(class_7982 var1) {
      if (this.method_42015() && field_46692.field_9632 != null) {
         if (!var1.method_36184()) {
            field_46692.field_9632.field_41733 = this.method_42002("Maximum heigh");
         } else {
            field_46692.field_9632.field_41733 = 0.5F;
         }
      }
   }
}
