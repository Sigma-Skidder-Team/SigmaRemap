package remapped;

public class TimerModule extends Module {
   public TimerModule() {
      super(Category.WORLD, "Timer", "Speeds up the world's timer");
      this.addSetting(new FloatSetting<Float>("Timer", "Timer value", 0.1F, Float.class, 0.1F, 10.0F, 0.1F));
   }

   @EventListen
   private void method_31152(class_5596 var1) {
      if (this.method_42015()) {
         client.theTimer.timerSpeed = this.getFloatValueByName("Timer");
      }
   }

   @Override
   public void onDisable() {
      client.theTimer.timerSpeed = 1.0F;
   }
}
