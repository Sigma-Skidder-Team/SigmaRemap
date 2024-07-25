package remapped;

public class AntiLevitationModule extends Module {
   public AntiLevitationModule() {
      super(Category.MISC, "AntiLevitation", "Removes levitation effects");
   }

   @EventListen
   public void method_33472(class_5596 var1) {
      if (this.method_42015()) {
         mc.field_9632.removeEffect(Effects.LevitationEffect);
      }
   }
}
