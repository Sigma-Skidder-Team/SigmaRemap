package remapped;

public class BasicAimbot extends Module {
   public BasicAimbot() {
      super(Category.COMBAT, "Basic", "Automatically aims at players");
      this.addSetting(new FloatSetting<Float>("Range", "Range value", 4.0F, Float.class, 2.8F, 8.0F, 0.01F));
   }

   @EventListen
   private void method_7262(class_3368 var1) {
      if (this.method_42015()) {
         Entity var4 = ((AimbotModule)this.method_42017()).method_10678(this.getFloatValueByName("Range"));
         if (var4 != null) {
            float[] var5 = class_7211.method_33013(var4);
            client.thePlayer.rotationYaw = var5[0];
            client.thePlayer.rotationPitch = var5[1];
         }
      }
   }
}
