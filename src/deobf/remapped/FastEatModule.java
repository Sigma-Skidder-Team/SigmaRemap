package remapped;

public class FastEatModule extends Module {
   public FastEatModule() {
      super(Category.PLAYER, "FastEat", "Allows you to eat faster");
      this.addSetting(new ModeSetting("Mode", "Mode", 0, "Basic", "Hypixel").setDefaultMode("Hypixel"));
      this.addSetting(new FloatSetting<Float>("Speed", "Eating speed.", 0.55F, Float.class, 0.0F, 1.0F, 0.01F));
   }

   @EventListen
   public void method_20195(PlayerTickEvent var1) {
      if (this.isEnabled() && client.thePlayer != null) {
         if (client.thePlayer.method_26554()) {
            ItemStack var4 = client.thePlayer.method_26576();
            if (var4 != null
               && (var4.method_27952() == class_6209.field_31739 || var4.method_27952() == class_6209.field_31732)
               && (float) client.thePlayer.method_26466() < this.getFloatValueByName("Speed") * 32.0F) {
               String var5 = this.getStringValueByName("Mode");
               switch (var5) {
                  case "Basic":
                     int var7 = client.thePlayer.method_26466() + 2;

                     for (int var8 = 0; var8 < var7; var8++) {
                        client.method_8614().sendPacket(new class_4609(client.thePlayer.onGround));
                        client.thePlayer.method_26474();
                     }
                     break;
                  case "Hypixel":
                     client.method_8614()
                        .sendPacket(
                           new class_7371(client.thePlayer.inventory.field_36404 + 1 >= 9 ? 0 : client.thePlayer.inventory.field_36404 + 1)
                        );
                     client.method_8614().sendPacket(new class_7371(client.thePlayer.inventory.field_36404));
               }
            }
         }
      }
   }
}
