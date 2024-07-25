package remapped;

public class class_2606 extends Module {
   public class_2606() {
      super(Category.COMBAT, "Normal", "Increase the knockback you give to players");
   }

   @EventListen
   @class_315
   private void method_11810(class_3645 var1) {
      if (this.method_42015() && var1.method_16971()) {
         mc.method_8614().method_4813(new class_2317(mc.field_9632, class_4127.field_20099));
      }
   }
}
