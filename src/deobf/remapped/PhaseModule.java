package remapped;

public class PhaseModule extends SecondModule {
   public PhaseModule() {
      super(
         Category.MOVEMENT,
         "Phase",
         "Allows you to go through blocks",
         new FullBlockPhase(),
         new NCPPhase(),
         new NoClipPhase(),
         new HypixelVClipPhase(),
         new VanillaPhase()
      );
   }

   @EventListen
   private void method_39616(class_9081 var1) {
      if (this.isEnabled()) {
         var1.method_41811(0.0F);
         var1.method_29715(true);
      }
   }
}
