package remapped;

public class class_2739 extends class_9128 {
   public class_2739() {
      super(class_5664.field_28714, "InteractRange", "Allows you to interact farer away");
      this.method_42010(new class_2748<Float>("Range", "Range value", 4.0F, Float.class, 3.0F, 8.0F, 0.01F));
   }

   @class_9148
   private void method_12310(class_8706 var1) {
      if (this.method_42015()) {
         Entity var4 = class_314.method_1458(field_46692.field_9632.field_41701, field_46692.field_9632.field_41755, this.method_42002("Range"), 0.0);
         class_9529 var5 = class_7494.method_34079(field_46692.field_9632.field_41701, field_46692.field_9632.field_41755, this.method_42002("Range"));
         if (var4 != null && field_46692.field_9587.method_33990() == class_1430.field_7721) {
            field_46692.field_9587 = new class_5631(var4);
         }

         if (var4 == null && field_46692.field_9587.method_33990() == class_1430.field_7721 && var5 != null) {
            field_46692.field_9587 = var5;
         }
      }
   }
}
