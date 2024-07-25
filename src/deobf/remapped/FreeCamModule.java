package remapped;

import com.mojang.authlib.GameProfile;

public class FreeCamModule extends Module {
   public static class_704 field_48917;
   private double field_48921;
   private double field_48927;
   private double field_48914;
   private double field_48912;
   private double field_48926;
   private double field_48916;
   private float field_48915;
   private float field_48920;
   private int field_48925;
   public float field_48928;
   public float field_48922;
   public boolean field_48929;
   public boolean field_48924;
   public boolean field_48913;
   public boolean field_48923;
   public boolean field_48919;
   public boolean field_48911;

   public FreeCamModule() {
      super(Category.RENDER, "Freecam", "Move client side but not server side");
      this.addSetting(new FloatSetting<Float>("Speed", "Speed value", 4.0F, Float.class, 1.0F, 10.0F, 0.1F));
   }

   @EventListen
   public void method_44323(class_5278 var1) {
      if (this.method_42015()) {
         if (var1.method_24098() instanceof class_5989 && var1.method_24098() != field_48917) {
            var1.method_29715(true);
         }
      }
   }

   @EventListen
   public void method_44321(class_1711 var1) {
      if (this.method_42015()) {
         if (field_48917 == null) {
            this.onEnable();
         }

         client.thePlayer.field_30524 = client.thePlayer.field_41755;
         class_4092 var4 = client.thePlayer.field_41712;
         field_48917.method_37256((var4.field_19941 + var4.field_19940) / 2.0, var4.field_19937, (var4.field_19938 + var4.field_19942) / 2.0);
         double var5 = this.field_48912 + (this.field_48921 - this.field_48912) * (double)var1.field_8848;
         double var7 = this.field_48926 + (this.field_48927 - this.field_48926) * (double)var1.field_8848;
         double var9 = this.field_48916 + (this.field_48914 - this.field_48916) * (double)var1.field_8848;
         client.thePlayer.field_41736.field_7336 = var5;
         client.thePlayer.field_41754 = var5;
         client.thePlayer.field_3868 = var5;
         client.thePlayer.field_41767 = var5;
         client.thePlayer.field_41736.field_7333 = var7;
         client.thePlayer.field_41713 = var7;
         client.thePlayer.field_3864 = var7;
         client.thePlayer.field_41698 = var7;
         client.thePlayer.field_41736.field_7334 = var9;
         client.thePlayer.field_41724 = var9;
         client.thePlayer.field_3858 = var9;
         client.thePlayer.field_41725 = var9;
         if (class_8865.method_40772()) {
            client.thePlayer.field_3859 = 0.099999994F;
         }
      }
   }

   @EventListen
   public void method_44322(class_3368 var1) {
      if (this.method_42015()) {
         field_48917.method_37298();
         field_48917.field_41712 = new class_4092(0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public void onEnable() {
      this.field_48921 = client.thePlayer.method_37302();
      this.field_48927 = client.thePlayer.method_37309();
      this.field_48914 = client.thePlayer.method_37156();
      this.field_48915 = client.thePlayer.field_41701;
      this.field_48920 = client.thePlayer.field_41755;
      String var3 = client.thePlayer.method_45509().getString();
      GameProfile var4 = new GameProfile(client.thePlayer.method_3247().getId(), var3);
      field_48917 = new class_9745(client.field_9601, var4);
      field_48917.inventory = client.thePlayer.inventory;
      field_48917.method_37249(this.field_48921, this.field_48927, this.field_48914, this.field_48915, this.field_48920);
      field_48917.field_41731 = true;
      field_48917.field_41721 = client.thePlayer.field_41721;
      field_48917.field_29618 = this.field_48915;
      field_48917.field_29657 = this.field_48915;
      field_48917.field_29605 = this.field_48915;
      field_48917.field_29611 = this.field_48915;
      client.field_9601.method_725(this.field_48925 = (int)(Math.random() * -10000.0), field_48917);
      this.field_48929 = client.gameOptions.keyForward.isKeyDown();
      this.field_48924 = client.gameOptions.keyBack.isKeyDown();
      this.field_48913 = client.gameOptions.keyLeft.isKeyDown();
      this.field_48923 = client.gameOptions.keyRight.isKeyDown();
      this.field_48922 = this.field_48929 != this.field_48924 ? (float)(!this.field_48929 ? -1 : 1) : 0.0F;
      this.field_48928 = this.field_48913 != this.field_48923 ? (float)(!this.field_48913 ? -1 : 1) : 0.0F;
      this.field_48919 = client.gameOptions.keyJump.isKeyDown();
      this.field_48911 = client.gameOptions.keySneak.isKeyDown();
      client.gameOptions.keyForward.pressed = false;
      client.gameOptions.keyBack.pressed = false;
      client.gameOptions.keyLeft.pressed = false;
      client.gameOptions.keyRight.pressed = false;
      client.gameOptions.keyJump.pressed = false;
      client.gameOptions.keySneak.pressed = false;
   }

   @Override
   public void onDisable() {
      client.gameOptions.keyForward.pressed = this.field_48929;
      client.gameOptions.keyBack.pressed = this.field_48924;
      client.gameOptions.keyLeft.pressed = this.field_48913;
      client.gameOptions.keyRight.pressed = this.field_48923;
      client.gameOptions.keyJump.pressed = this.field_48919;
      client.gameOptions.keySneak.pressed = this.field_48911;
      client.field_9601.method_754(this.field_48925);
      client.thePlayer.method_37298();
      if (field_48917 != null) {
         client.thePlayer.field_41721 = field_48917.field_41721;
      }

      field_48917 = null;
   }

   @EventListen
   private void method_44330(class_3574 var1) {
      if (this.method_42015()) {
         var1.method_29715(true);
      }
   }

   @EventListen
   private void method_44329(class_6435 var1) {
      if (this.method_42015()) {
         if (var1.method_29384() != client.gameOptions.keySneak.field_30027.field_17800) {
            if (var1.method_29384() != client.gameOptions.keyJump.field_30027.field_17800) {
               if (var1.method_29384() != client.gameOptions.keyForward.field_30027.field_17800) {
                  if (var1.method_29384() != client.gameOptions.keyBack.field_30027.field_17800) {
                     if (var1.method_29384() != client.gameOptions.keyLeft.field_30027.field_17800) {
                        if (var1.method_29384() == client.gameOptions.keyRight.field_30027.field_17800) {
                           var1.method_29715(true);
                           this.field_48923 = true;
                        }
                     } else {
                        var1.method_29715(true);
                        this.field_48913 = true;
                     }
                  } else {
                     var1.method_29715(true);
                     this.field_48924 = true;
                  }
               } else {
                  var1.method_29715(true);
                  this.field_48929 = true;
               }
            } else {
               var1.method_29715(true);
               this.field_48919 = true;
            }
         } else {
            var1.method_29715(true);
            this.field_48911 = true;
         }

         this.field_48922 = this.field_48929 != this.field_48924 ? (float)(!this.field_48929 ? -1 : 1) : 0.0F;
         this.field_48928 = this.field_48913 != this.field_48923 ? (float)(!this.field_48913 ? -1 : 1) : 0.0F;
      }
   }

   @EventListen
   private void method_44328(class_307 var1) {
      if (this.method_42015()) {
         if (var1.method_1364() != client.gameOptions.keySneak.field_30027.field_17800) {
            if (var1.method_1364() != client.gameOptions.keyJump.field_30027.field_17800) {
               if (var1.method_1364() != client.gameOptions.keyForward.field_30027.field_17800) {
                  if (var1.method_1364() != client.gameOptions.keyBack.field_30027.field_17800) {
                     if (var1.method_1364() != client.gameOptions.keyLeft.field_30027.field_17800) {
                        if (var1.method_1364() == client.gameOptions.keyRight.field_30027.field_17800) {
                           var1.method_29715(true);
                           this.field_48923 = false;
                        }
                     } else {
                        var1.method_29715(true);
                        this.field_48913 = false;
                     }
                  } else {
                     var1.method_29715(true);
                     this.field_48924 = false;
                  }
               } else {
                  var1.method_29715(true);
                  this.field_48929 = false;
               }
            } else {
               var1.method_29715(true);
               this.field_48919 = false;
            }
         } else {
            var1.method_29715(true);
            this.field_48911 = false;
         }

         this.field_48922 = this.field_48929 != this.field_48924 ? (float)(!this.field_48929 ? -1 : 1) : 0.0F;
         this.field_48928 = this.field_48913 != this.field_48923 ? (float)(!this.field_48913 ? -1 : 1) : 0.0F;
      }
   }

   @EventListen
   public void method_44320(class_2911 var1) {
      if (this.method_42015()) {
         var1.method_29715(true);
      }
   }

   @EventListen
   public void method_44319(class_1393 var1) {
      if (this.method_42015() && var1.method_6449()) {
         var1.method_6441(this.field_48915 % 360.0F);
         var1.method_6448(this.field_48920);
         client.thePlayer.field_30535 = this.field_48915;
         client.thePlayer.field_30524 = this.field_48920;
         float[] var4 = class_8865.method_40774(this.field_48922, this.field_48928);
         float var5 = var4[1];
         float var6 = var4[2];
         float var7 = var4[0];
         double var8 = Math.cos(Math.toRadians((double)var7));
         double var10 = Math.sin(Math.toRadians((double)var7));
         double var12 = (double)(this.getFloatValueByName("Speed") / 2.0F);
         this.field_48912 = this.field_48921;
         this.field_48916 = this.field_48914;
         this.field_48926 = this.field_48927;
         this.field_48921 += ((double)var5 * var8 + (double)var6 * var10) * var12;
         this.field_48914 += ((double)var5 * var10 - (double)var6 * var8) * var12;
         if (this.field_48919) {
            this.field_48927 += var12;
         }

         if (this.field_48911) {
            this.field_48927 -= var12;
         }
      }
   }

   @EventListen
   private void method_44326(PacketEvent var1) {
      if (this.method_42015()) {
         if (client.thePlayer != null) {
            if (var1.method_557() instanceof class_509) {
               class_509 var4 = (class_509)var1.method_557();
               this.field_48915 = var4.field_3143;
               this.field_48920 = var4.field_3140;
               var4.field_3143 = client.thePlayer.field_41701;
               var4.field_3140 = client.thePlayer.field_41755;
               double var5 = var4.field_3139;
               double var7 = var4.field_3144;
               double var9 = var4.field_3141;
               float var11 = class_704.field_3865.field_31199;
               float var12 = class_704.field_3865.field_31200;
               client.thePlayer
                  .method_37094(
                     new class_4092(var5 - (double)var11, var7, var9 - (double)var11, var5 + (double)var11, var7 + (double)var12, var9 + (double)var11)
                  );
               var1.method_29715(true);
               field_48917.method_37214(0.0, 0.0, 0.0);
            }
         }
      }
   }

   @EventListen
   private void method_44327(class_2157 var1) {
      if (this.method_42015()) {
         if (var1.method_10047() instanceof class_3195) {
            field_48917.method_26597(class_2584.field_12791);
         }

         if (var1.method_10047() instanceof class_3398) {
            class_3398 var4 = (class_3398)var1.method_10047();
            if (var4.method_15695(client.field_9601) == null) {
               var1.method_29715(true);
            }
         }
      }
   }

   @EventListen
   private void method_44325(class_9081 var1) {
      if (this.method_42015()) {
         var1.method_29715(true);
      }
   }

   @EventListen
   private void method_44324(class_717 var1) {
      if (this.method_42015()) {
         this.method_42023(false);
      }
   }
}
