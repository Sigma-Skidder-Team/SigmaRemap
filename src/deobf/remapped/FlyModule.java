package remapped;

public class FlyModule extends SecondModule {
   public FlyModule() {
      super(
         Category.MOVEMENT,
         "Fly",
         "Allows you to fly like a bird",
         new VanillaFly(),
         new HypixelFly(),
         new MineplexFly(),
         new JetpackFly(),
         new BowFly(),
         new OmegaCraftFly(),
         new ViperMCFly(),
         new VeltPVPFly(),
         new HawkFly(),
         new LibreCraftFly(),
         new ReloadedFly(),
         new NCPFly(),
         new HorizonFly(),
         new SpartanFly(),
         new TestFly()
      );
   }
}
