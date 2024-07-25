package remapped;

public class NCPPhase extends PremiumModule {
   private boolean field_13372;
   private int field_13371;
   private int field_13370;

   public NCPPhase() {
      super("NCP", "Phase for NCP anticheat", Category.MOVEMENT);
      this.addSetting(new BooleanSetting("Hypixel", "Hypixel bypass", true));
   }

   @Override
   public void onEnable() {
      this.field_13372 = false;
      if (!client.thePlayer.field_41744) {
         this.field_13371 = -1;
      } else {
         this.field_13371 = 0;
         if (client.thePlayer.field_41726) {
            double var3 = client.thePlayer.method_37302();
            double var5 = client.thePlayer.method_37309();
            double var7 = client.thePlayer.method_37156();
            client.method_8614().method_4813(new class_9515(var3, var5 + 0.0626, var7, false));
         }
      }
   }

   @EventListen
   private void method_12308(class_1393 var1) {
      if (this.method_42015() && var1.method_6449()) {
         if (client.gameOptions.keySneak.isKeyDown()) {
            double var4 = client.thePlayer.method_37302();
            double var6 = client.thePlayer.method_37309();
            double var8 = client.thePlayer.method_37156();
            if (!class_314.method_1434()) {
               if (class_314.method_1413(client.thePlayer, 0.001F) && !class_314.method_1383()) {
                  client.thePlayer.method_37256(var4, var6 - 1.0, var8);
                  var1.method_6455(var6 - 1.0);
                  var1.method_6444(true);
                  var1.method_6441(var1.method_6442() + 10.0F);
                  class_314.method_1408(0.0);
               } else if (client.thePlayer.method_37309() == (double)((int) client.thePlayer.method_37309())) {
                  client.thePlayer.method_37256(var4, var6 - 0.3, var8);
               }
            }
         }

         if (this.field_13371 > 0 && this.field_13372 && class_314.method_1383()) {
            this.field_13370++;
            float var10 = (float)Math.sin((double)this.field_13370) * 5.0F;
            float var11 = (float)Math.cos((double)this.field_13370) * 5.0F;
            var1.method_6441(var1.method_6442() + var10);
            var1.method_6448(var1.method_6439() + var11);
         } else if (this.field_13371 < 0) {
            return;
         }

         var1.method_6444(true);
      }
   }

   @EventListen
   private void method_12309(class_7767 var1) {
      if (this.method_42015()) {
         if (client.thePlayer.field_41744 && this.field_13371 != 0) {
            this.field_13371 = 0;
            if (client.thePlayer.field_41726) {
               double var4 = client.thePlayer.method_37302();
               double var6 = client.thePlayer.method_37309();
               double var8 = client.thePlayer.method_37156();
               client.method_8614().method_4813(new class_9515(var4, var6 + 0.0626, var8, false));
            }
         }

         if (this.field_13371 >= 0) {
            if (this.field_13371 != 0) {
               if (!class_314.method_1383()) {
                  this.field_13372 = false;
                  class_8865.method_40777(var1, 0.0);
                  return;
               }

               if (!this.field_13372) {
                  class_8865.method_40777(var1, !this.getBooleanValueByName("Hypixel") ? 0.0031 : 0.03);
               } else {
                  class_8865.method_40777(var1, 0.617);
               }
            } else {
               class_8865.method_40777(var1, 0.0);
               class_8865.method_40781(6.000000238415E-4);
            }

            this.field_13371++;
         }
      }
   }

   @EventListen
   private void method_12307(class_3574 var1) {
      if (this.method_42015()) {
         var1.method_29715(true);
      }
   }

   @EventListen
   private void method_12306(PacketEvent var1) {
      if (this.method_42015()) {
         Packet var4 = var1.method_557();
         if (var4 instanceof class_509) {
            class_509 var5 = (class_509)var4;
            var5.field_3143 = client.thePlayer.rotationYaw;
            var5.field_3140 = client.thePlayer.rotationPitch;
            this.field_13372 = true;
         }
      }
   }
}
