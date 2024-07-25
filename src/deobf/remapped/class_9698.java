package remapped;

public class class_9698 extends Module {
   public class_9698() {
      super(Category.PLAYER, "Sneak", "Always sneaks");
   }

   @Override
   public void method_42020() {
      mcInstance.method_8614().method_4813(new class_2317(mcInstance.field_9632, class_4127.field_20097));
   }

   @EventListen
   public void method_44822(class_1393 var1) {
      if (this.method_42015()) {
         if (!var1.method_6449()) {
            mcInstance.method_8614().method_4813(new class_2317(mcInstance.field_9632, class_4127.field_20097));
            mcInstance.method_8614().method_4813(new class_2317(mcInstance.field_9632, class_4127.field_20098));
         } else {
            mcInstance.method_8614().method_4813(new class_2317(mcInstance.field_9632, class_4127.field_20098));
            mcInstance.method_8614().method_4813(new class_2317(mcInstance.field_9632, class_4127.field_20097));
         }
      }
   }
}
