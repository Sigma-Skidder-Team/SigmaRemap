package remapped;

public class KeyStrokesModule extends Module {
   public KeyStrokesModule() {
      super(Category.GUI, "KeyStrokes", "Shows what keybind you are pressing");
   }

   @EventListen
   private void method_11912(class_3278 var1) {
      if (!this.method_42015() || mc.field_9632 == null) {
         ;
      }
   }

   @EventListen
   private void method_11911(class_6435 var1) {
      if (!this.method_42015() || mc.field_9632 == null) {
         ;
      }
   }

   @EventListen
   private void method_11910(class_8706 var1) {
      if (this.method_42015() && mc.field_9632 != null) {
         if (var1.method_40004() != class_3237.field_16098 && var1.method_40004() != class_3237.field_16101) {
         }
      }
   }
}
