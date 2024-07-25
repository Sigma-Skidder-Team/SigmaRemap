package remapped;

public class SpeedModule extends SecondModule {
   public static int field_35509;

   public SpeedModule() {
      super(
         Category.MOVEMENT,
         "Speed",
         "Vroom vroom",
         new VanillaSpeed(),
         new HypixelSpeed(),
         new AACSpeed(),
         new OldAACSpeed(),
         new ViperMCSpeed(),
         new SlowHopSpeed(),
         new NCPSpeed(),
         new LegitSpeed(),
         new CubecraftSpeed(),
         new YPortSpeed(),
         new MinemenSpeed(),
         new InvadedSpeed(),
         new MineplexSpeed(),
         new GommeSpeed(),
         new TestSpeed()
      );
      this.addSetting(new BooleanSetting("Lag back checker", "Disable speed when you get lag back", true));
      field_35509 = 0;
   }

   @EventListen
   public void method_31652(class_5596 var1) {
      field_35509++;
   }

   @EventListen
   public void method_31654(PacketEvent var1) {
      if (var1.method_557() instanceof class_509 && client.thePlayer != null) {
         field_35509 = 0;
         if (this.getBooleanValueByName("Lag back checker") && this.method_42015() && client.thePlayer.field_41697 > 2) {
            SigmaMainClass.getInstance().getNotificationManager().pushNotification(new Notification("Speed", "Disabled speed due to lagback."));
            this.method_41999();
         }
      }
   }

   public void method_31653() {
      if (this.field_17664 instanceof HypixelSpeed) {
         HypixelSpeed var3 = (HypixelSpeed)this.field_17664;
         var3.method_11347();
      }
   }
}
