package remapped;

import java.util.Random;

public class DerpModule extends Module {
   private Random random = new Random();
   private boolean field_33189;
   private int field_33188;
   private int field_33191;

   public DerpModule() {
      super(Category.PLAYER, "Derp", "Spazzes around");
      this.addSetting(new ModeSetting("Rotation Mode", "Rotation Mode", 0, "Random", "Spin", "None"));
      this.addSetting(new BooleanSetting("Hit", "Randomly hit", true));
      this.addSetting(new BooleanSetting("Sneak", "Randomly sneak", true));
   }

   @EventListen
   public void method_29695(class_1393 var1) {
      if (this.method_42015() && var1.method_6449()) {
         if (this.getBooleanValueByName("Sneak")) {
            if (this.field_33189) {
               client.method_8614().sendPacket(new class_2317(client.thePlayer, Action.PRESS_SHIFT_KEY));
            } else {
               client.method_8614().sendPacket(new class_2317(client.thePlayer, Action.RELEASE_SHIFT_KEY));
            }
         }

         this.field_33189 = !this.field_33189;
         this.field_33188++;
         if (this.getBooleanValueByName("Hit") && this.field_33188 > this.random.nextInt(5) + 3) {
            this.field_33188 = 0;
            Hand var4 = Hand.values()[this.random.nextInt(1)];
            client.thePlayer.method_26597(var4);
         }

         String var6 = this.getStringValueByName("Rotation Mode");
         switch (var6) {
            case "Random":
               var1.method_6441(this.random.nextFloat() * 360.0F);
               var1.method_6448(this.random.nextFloat() * 180.0F - 90.0F);
               break;
            case "Spin":
               this.field_33191 += 20;

               while (this.field_33191 > 360) {
                  this.field_33191 -= 360;
               }

               var1.method_6441((float)this.field_33191 + this.random.nextFloat());
         }
      }
   }

   @Override
   public void onEnable() {
      this.field_33191 = (int) client.thePlayer.rotationYaw;
   }
}
