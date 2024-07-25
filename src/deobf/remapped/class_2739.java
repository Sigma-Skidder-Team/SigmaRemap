package remapped;

public class class_2739 extends Module {
   public class_2739() {
      super(Category.COMBAT, "InteractRange", "Allows you to interact farer away");
      this.addSetting(new FloatSetting<Float>("Range", "Range value", 4.0F, Float.class, 3.0F, 8.0F, 0.01F));
   }

   @EventListen
   private void method_12310(class_8706 var1) {
      if (this.method_42015()) {
         Entity var4 = class_314.method_1458(mcInstance.field_9632.field_41701, mcInstance.field_9632.field_41755, this.getFloatValueByName("Range"), 0.0);
         class_9529 var5 = class_7494.method_34079(mcInstance.field_9632.field_41701, mcInstance.field_9632.field_41755, this.getFloatValueByName("Range"));
         if (var4 != null && mcInstance.field_9587.method_33990() == class_1430.field_7721) {
            mcInstance.field_9587 = new class_5631(var4);
         }

         if (var4 == null && mcInstance.field_9587.method_33990() == class_1430.field_7721 && var5 != null) {
            mcInstance.field_9587 = var5;
         }
      }
   }
}
