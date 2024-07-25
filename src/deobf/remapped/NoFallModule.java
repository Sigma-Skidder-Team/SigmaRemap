package remapped;

public class NoFallModule extends Module {
   private boolean field_15401 = false;
   private boolean field_15405;
   private double field_15404;
   private boolean field_15403;

   public NoFallModule() {
      super(Category.PLAYER, "NoFall", "Avoid you from getting fall damages");
      this.addSetting(
         new ModeSetting("Mode", "Nofall mode", 0, "Vanilla", "Hypixel", "Hypixel2", "AAC", "NCPSpigot", "OldHypixel", "Vanilla Legit")
            .setDefaultMode("Hypixel", "Hypixel2")
      );
   }

   @Override
   public void onEnable() {
      this.field_15401 = false;
      this.field_15405 = false;
      this.field_15404 = 0.0;
   }

   @EventListen
   @class_7664
   private void method_14177(class_7767 var1) {
      if (this.method_42015()) {
         if (var1.method_35236() < -0.5
            && (double) client.thePlayer.field_41706 > 2.0 + (double)class_8865.method_40769() * 0.5
            && !client.thePlayer.field_41726
            && this.getStringValueByName("Mode").equals("Hypixel")
            && class_314.method_1387()) {
            double[] var4 = class_314.method_1466();
            int var5 = var4.length;
            double var6 = Double.MAX_VALUE;

            for (int var8 = 0; var8 < var5; var8++) {
               double var9 = var4[var8];
               double var11 = client.thePlayer.method_37309();
               double var13 = (double)((int)(var11 + var1.method_35236())) - var11 - var1.method_35236() + var9;
               double var15 = 0.02;
               double var17 = -0.05;
               if (var1.method_35236() > -0.5 + (double)(class_8865.method_40769() * 1)) {
                  var15 = 0.0;
               }

               if (var13 > var17 && var13 < var15) {
                  class_4092 var19 = client.thePlayer
                     .field_41712
                     .method_18918(var1.method_35234(), var1.method_35236() + var13 + var17, var1.method_35231());
                  if (client.theWorld.method_6680(client.thePlayer, var19).count() != 0L) {
                     var13 -= 1.0E-5;
                     var1.method_35235(var1.method_35236() + var13);
                     class_314.method_1408(var1.method_35236());
                     var6 = Double.MAX_VALUE;
                     break;
                  }

                  if (Math.abs(var13) < var6) {
                     var6 = var13;
                  }
               }
            }

            if (Math.abs(var6) < 0.1) {
               var1.method_35235(var1.method_35236() + var6);
               class_314.method_1408(var1.method_35236());
            }
         }
      }
   }

   @EventListen
   private void method_14176(class_1393 var1) {
      if (this.method_42015() && client.thePlayer != null) {
         if (!(client.thePlayer.method_37309() < 2.0)) {
            String var4 = this.getStringValueByName("Mode");
            if (!class_314.method_1387() && var4.equals("Hypixel")) {
               var4 = "OldHypixel";
            }

            switch (var4) {
               case "OldHypixel":
                  if (var1.method_6449()) {
                     if (class_314.method_1413(client.thePlayer, 1.0E-4F)) {
                        this.field_15404 = 0.0;
                        return;
                     }

                     if (client.thePlayer.method_37098().field_7333 < -0.1) {
                        if (this.field_15404 == 0.0) {
                        }

                        this.field_15404 = this.field_15404 - client.thePlayer.method_37098().field_7333;
                     }

                     if (this.field_15404 > 3.0) {
                        this.field_15404 = 1.0E-14;
                        var1.method_6451(true);
                     }
                  }
                  break;
               case "Hypixel":
                  if (var1.method_6449()
                     && client.thePlayer.method_37098().field_7333 < 0.0
                     && !client.thePlayer.field_41726
                     && class_314.method_1387()) {
                     for (double var10 : class_314.method_1466()) {
                        if ((double)((int)var1.method_6454()) - var1.method_6454() + var10 == 0.0) {
                           var1.method_6451(true);
                           break;
                        }
                     }
                  }
                  break;
               case "Hypixel2":
                  if (var1.method_6449()) {
                     if (class_314.method_1413(client.thePlayer, 1.0E-4F)) {
                        this.field_15404 = 0.0;
                        return;
                     }

                     if (client.thePlayer.method_37098().field_7333 < -0.1 && client.thePlayer.field_41706 > 3.0F) {
                        this.field_15404++;
                        if (this.field_15404 == 1.0) {
                           client.method_8614().method_4813(new class_4609(true));
                        } else if (this.field_15404 > 1.0) {
                           this.field_15404 = 0.0;
                        }
                     }
                  }
                  break;
               case "AAC":
                  if (var1.method_6449()) {
                     if (client.thePlayer.field_41697 == 1) {
                        this.field_15401 = false;
                     }

                     if (!this.field_15401 && client.thePlayer.field_41706 > 3.0F && this.getStringValueByName("Mode").equals("AAC")) {
                        this.field_15401 = !this.field_15401;
                        class_9515 var7 = new class_9515(client.thePlayer.method_37302(), Double.NaN, client.thePlayer.method_37156(), true);
                        client.method_8614().method_4813(var7);
                     }
                  }
                  break;
               case "Vanilla":
                  if (var1.method_6449() && client.thePlayer.method_37098().field_7333 < -0.1) {
                     var1.method_6451(true);
                  }
                  break;
               case "Vanilla Legit":
                  if (client.thePlayer.method_37098().field_7333 < -0.1) {
                     var1.method_6451(true);
                  }

                  if (client.thePlayer.field_41706 > 3.0F) {
                     this.field_15403 = true;
                  }

                  if (this.field_15403 && client.thePlayer.field_41726 && !client.thePlayer.method_37285()) {
                     double var12 = client.thePlayer.method_37302();
                     double var14 = client.thePlayer.method_37309();
                     double var16 = client.thePlayer.method_37156();
                     client.method_8614().method_4813(new class_9515(var12, var14 + 3.01, var16, false));
                     client.method_8614().method_4813(new class_9515(var12, var14, var16, false));
                     client.method_8614().method_4813(new class_9515(var12, var14, var16, true));
                     System.out.println("sent");
                     this.field_15403 = false;
                  }
                  break;
               case "NCPSpigot":
                  if (var1.method_6449()) {
                     if (client.thePlayer.field_41706 > 3.0F) {
                        this.field_15405 = true;
                     }

                     if (this.field_15405 && SigmaMainClass.getInstance().method_3310().method_25293() == 0 && client.thePlayer.field_41726) {
                        var1.method_6455(var1.method_6454() - 11.0);
                        this.field_15405 = false;
                     }
                  }
            }
         }
      }
   }
}
