package remapped;

import org.lwjgl.glfw.GLFW;

public class ElytraFlyModule extends Module {
   public int field_49843 = 0;
   private float field_49839;
   private float field_49840;
   private float field_49841;
   private boolean field_49845;
   public int field_49842 = 0;

   public ElytraFlyModule() {
      super(Category.MOVEMENT, "ElytraFly", "Better elytra flying");
      this.addSetting(new BooleanSetting("NCP", "Bypass NCP", true));
   }

   @EventListen
   public void method_45348(PlayerTickEvent var1) {
      if (this.isEnabled()) {
         client.gameOptions.keySneak.pressed = false;
         if (!(client.thePlayer.method_37098().field_7333 < 0.08) || client.thePlayer.onGround) {
            client.thePlayer.method_37220(7, false);
            if (client.thePlayer.isSneaking()) {
               this.setEnabled2(false);
            }
         } else if (!client.thePlayer.method_26618()) {
            client.method_8614().sendPacket(new class_2317(client.thePlayer, Action.field_20093));
            client.thePlayer.method_37220(7, true);
         }
      }
   }

   @EventListen
   public void method_45349(class_7767 var1) {
      if (this.isEnabled()) {
         double var4 = class_8865.method_40775();
         boolean var6 = class_314.method_1434();
         if (!this.getBooleanValueByName("NCP") && client.thePlayer.isSneaking()) {
            var4 *= 2.5;
         }

         class_8865.method_40777(var1, 0.0);
         if (!client.thePlayer.method_26618()) {
            this.field_49843 = 0;
         } else {
            if (this.field_49843 > 0) {
               if (this.field_49843 > 7) {
                  class_8865.method_40777(var1, var4 * 6.3F);
               }

               class_314.method_1408(-0.071);
               var1.method_35235(-1.0001E-4F);
            }

            this.field_49843++;
         }

         if (this.field_49840 > 1.0001E-4F && client.thePlayer.field_29654) {
            class_8865.method_40777(var1, var4 * 6.3F);
            var1.method_35235((double)this.field_49840);
         }

         int var7 = GLFW.glfwGetKey(client.window.getHandle(), client.gameOptions.keySneak.field_30027.field_17800);
         if (var7 == 1 && this.getBooleanValueByName("NCP")) {
            var1.method_35235(-0.9F);
         } else if (!client.thePlayer.isSneaking()) {
            if (client.thePlayer.field_29654 && !this.getBooleanValueByName("NCP")) {
               var1.method_35235(1.4F);
            }
         } else {
            var1.method_35235(1.4F);
         }

         this.field_49840 = (float)((double)this.field_49840 * 0.85);
      }
   }

   @EventListen
   private void method_45346(PacketEvent var1) {
      if (this.isEnabled()) {
         if (client.thePlayer != null && var1.method_557() instanceof class_4548) {
            class_4548 var4 = (class_4548)var1.method_557();
            Entity var5 = client.theWorld.method_29534(var4.method_21093());
            if (var5 instanceof class_8612) {
               class_8612 var6 = (class_8612)var5;
               if (var6.field_44173 != null && var6.field_44173.method_37145() == client.thePlayer.method_37145()) {
                  this.field_49839 = this.field_49839 + (float)var4.field_22171 / 8000.0F;
                  this.field_49841 = this.field_49841 + (float)var4.field_22167 / 8000.0F;
                  this.field_49840 = this.field_49840 + (float)var4.field_22168 / 8000.0F;
                  this.field_49845 = true;
               }
            }
         }
      }
   }

   @EventListen
   private void method_45345(class_1393 var1) {
      if (this.isEnabled()) {
         byte var4 = 65;
         if (this.field_49842 != var4 - 1) {
            if (this.field_49842 <= 0 && client.thePlayer.field_29654) {
               this.field_49842 = var4;
            }
         } else {
            int var5 = class_2740.method_12336(class_4897.field_24479);
            if (var5 >= 0) {
               if (var5 != client.thePlayer.inventory.field_36404) {
                  client.method_8614().sendPacket(new class_7371(var5));
               }

               client.method_8614().sendPacket(new class_1022(Hand.MAIN_HAND));
               if (var5 != client.thePlayer.inventory.field_36404) {
                  client.method_8614().sendPacket(new class_7371(client.thePlayer.inventory.field_36404));
               }
            }
         }

         if (this.field_49842 > 0) {
            var1.method_6448(-90.0F);
         }

         if (!client.thePlayer.field_29654) {
            this.field_49842 = 0;
         }

         this.field_49842--;
      }
   }

   @EventListen
   @class_315
   private void method_45347(class_2157 var1) {
      if (!this.isEnabled()) {
         ;
      }
   }

   @EventListen
   private void method_45344(class_307 var1) {
      if (!this.isEnabled()) {
         ;
      }
   }

   @Override
   public void onEnable() {
      if (client.thePlayer.onGround) {
         class_314.method_1408(0.3994F);
      }
   }

   @Override
   public void onDisable() {
      if (!class_8865.method_40772()) {
         class_314.method_1463(0.0);
         class_314.method_1405(0.0);
      }
   }
}
