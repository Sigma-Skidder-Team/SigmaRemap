package remapped;

public class DisablerModule extends SecondModule {
   public DisablerModule() {
      super(
         Category.WORLD,
         "Disabler",
         "Disables some anticheats",
         new PingSpoofDisabler(),
         new NullDisabler(),
         new HypixelDisabler(),
         new TeleportDisabler(),
         new GhostlyDisabler()
      );
   }
}
