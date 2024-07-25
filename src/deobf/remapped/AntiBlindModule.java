package remapped;

public class AntiBlindModule extends Module {
   public AntiBlindModule() {
      super(Category.RENDER, "AntiBlind", "Disables bad visual potion effects");
   }

   @class_9148
   private void method_32351(class_1711 var1) {
      if (this.method_42015()) {
         mcInstance.field_9632.method_26607(class_4054.field_19732);
         mcInstance.field_9632.method_26607(class_4054.field_19736);
      }
   }
}
