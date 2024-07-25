package remapped;

public class AntiBlindModule extends Module {
   public AntiBlindModule() {
      super(Category.RENDER, "AntiBlind", "Disables bad visual potion effects");
   }

   @EventListen
   private void method_32351(class_1711 var1) {
      if (this.method_42015()) {
         mc.field_9632.removeEffect(Effects.field_19732);
         mc.field_9632.removeEffect(Effects.field_19736);
      }
   }
}
