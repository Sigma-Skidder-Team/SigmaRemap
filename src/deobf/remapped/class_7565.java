package remapped;

import com.mojang.authlib.GameProfile;
import java.awt.Color;
import java.util.Iterator;
import java.util.UUID;
import org.lwjgl.opengl.GL11;

public class class_7565 extends PremiumModule {
   public int field_38545;
   public int field_38544;
   public int field_38556;
   public int field_38543 = 100;
   private float field_38551 = 1.0F;
   private float field_38549 = 0.0F;
   private float field_38548 = 0.0F;
   private class_2440 field_38554;
   private class_2440 field_38546;
   private class_2440 field_38552;
   private class_2440 field_38547;
   private Entity field_38555;
   public int field_38550 = class_314.method_1444(class_1255.field_6929.field_6917, 0.05F);

   public class_7565() {
      super("TargetHUD", "Shows target info with killaura", Category.GUI);
      this.addSetting(new ModeSetting("Background", "Background", 0, "Blur", "Color", "None"));
      this.addSetting(new ModeSetting("Position", "HUD Position", 0, "Center", "Bottom"));
      this.addSetting(new ModeSetting("HealthBar", "Healthbar color", 0, "Health", "White"));
      this.addSetting(new BooleanSetting("Armor", "Draw target's armor", false));
      this.method_42011(false);
      this.field_38554 = new class_2440(800, 200, class_4043.field_19618);
      this.field_38552 = new class_2440(1500, 200, class_4043.field_19618);
      this.field_38547 = new class_2440(950, 200, class_4043.field_19618);
      this.field_38546 = new class_2440(230, 200, class_4043.field_19620);
   }

   @Override
   public void onEnable() {
   }

   @EventListen
   @class_5355
   private void method_34401(class_1711 var1) {
      if (this.field_38555 != null) {
         this.field_38556 = (this.getBooleanValueByName("Head") ? 100 : 0)
            + Math.max(95, class_5320.field_27152.method_18547(this.field_38555.method_45509().getString()))
            + (this.getBooleanValueByName("Armor") ? 80 : 0)
            + 20;
         String var4 = this.getStringValueByName("Position");
         switch (var4) {
            case "Center":
               this.field_38545 = MinecraftClient.getInstance().window.method_43166() / 2 - this.field_38556 / 2;
               this.field_38544 = MinecraftClient.getInstance().window.method_43163() / 2 + 40;
               break;
            case "Bottom":
               this.field_38545 = MinecraftClient.getInstance().window.method_43166() / 2 - this.field_38556 / 2;
               this.field_38544 = MinecraftClient.getInstance().window.method_43163() - 200;
         }

         this.field_38545 -= 100;
         float var6 = ((class_5834)this.field_38555).method_26551();
         if (var6 != this.field_38548) {
            this.field_38549 = this.field_38548;
            this.field_38548 = var6;
            this.field_38546.method_11122(0.0F);
         }
      }
   }

   @EventListen
   @class_5355
   public void method_34402(class_3278 var1) {
   }

   private void method_34397(int var1) {
      if (mc.field_9623 == null || mc.field_9623 instanceof class_5766) {
         GL11.glPushMatrix();
         class_73.method_150(var1 - 20, this.field_38544 - 20, var1 + 200, this.field_38544 + 120, true);
         EntityRenderDispatcher var4 = MinecraftClient.getInstance().method_8587();
         class_5869 var5 = new class_5869(var4);
         short var6 = 150;
         UUID var7 = this.field_38555.method_37328();
         if (!(this.field_38555 instanceof class_2803)) {
            if (!(this.field_38555 instanceof class_2811)) {
               if (!(this.field_38555 instanceof class_912)) {
                  if (!(this.field_38555 instanceof class_6778)) {
                     if (!(this.field_38555 instanceof class_6778)) {
                        if (!(this.field_38555 instanceof class_9490)) {
                           if (!(this.field_38555 instanceof class_9405)) {
                              if (!(this.field_38555 instanceof class_8031)) {
                                 if (!(this.field_38555 instanceof class_3024)) {
                                    if (!(this.field_38555 instanceof class_3551)) {
                                       if (!(this.field_38555 instanceof class_5583)) {
                                          if (!(this.field_38555 instanceof class_9408)) {
                                             if (!(this.field_38555 instanceof class_6011)) {
                                                if (this.field_38555 instanceof class_1260) {
                                                   var7 = UUID.fromString("0fd952e4-e895-4bb0-a12b-48f24cac1231");
                                                }
                                             } else {
                                                var7 = UUID.fromString("655b9804-f385-4e11-8966-d1555bedffc6");
                                             }
                                          } else {
                                             var7 = UUID.fromString("14430053-bbf4-4141-9d3d-08ff8ec631a4");
                                          }
                                       } else {
                                          var7 = UUID.fromString("241d6e54-d289-4db3-999f-1d51593aca81");
                                       }
                                    } else {
                                       var7 = UUID.fromString("1b90edcf-393d-4e93-a0d6-cf737dc80999");
                                    }
                                 } else {
                                    var7 = UUID.fromString("6a5b3d5e-07cd-449a-bf1d-c29383d1ae47");
                                 }
                              } else {
                                 var7 = UUID.fromString("edd84e70-3a47-4215-b539-c95bf176d2cd");
                              }
                           } else {
                              var7 = UUID.fromString("5443bbef-0b09-48ea-8b32-744ab646d883");
                           }
                        } else {
                           var7 = UUID.fromString("696581df-4256-4028-b55e-9452b4de40b6");
                        }
                     } else {
                        var7 = UUID.fromString("6d959fcc-e0ca-44ff-8d49-f4a2ae9f8de8");
                     }
                  } else {
                     var7 = UUID.fromString("6d959fcc-e0ca-44ff-8d49-f4a2ae9f8de8");
                  }
               } else {
                  var7 = UUID.fromString("b36f9117-5454-43d7-ab15-86f303bf49f9");
               }
            } else {
               var7 = UUID.fromString("02b0e86d-c86a-4ae7-bc41-015d21f80c1c");
            }
         } else {
            var7 = UUID.fromString("b1adf2ec-eed6-46d6-a770-40f409651913");
         }

         GameProfile var8 = new GameProfile(var7, this.field_38555.method_45509().getString());
         class_1806 var9 = new class_1806(this, mc.field_9601, var8);
         class_3542.method_16438();
         class_3542.method_16413((float)var1 + 50.0F, (float)this.field_38544 + 295.0F, 1000.0F);
         class_3542.method_16403(1.0F, 1.0F, -1.0F);
         class_7966 var10 = new class_7966();
         var10.method_36065(0.0, 0.0, 1500.0);
         var10.method_36062((float)var6, (float)var6, (float)var6);
         Quaternion var11 = class_2426.field_12076.method_11074(180.0F);
         var10.method_36060(var11);
         var4.method_28136(false);
         class_3758 var12 = MinecraftClient.getInstance().method_8589().method_13796();
         class_3542.method_16430(
            () -> var5.method_26732(
                  var9, 100.0F, 0.0F, var10, var12, 15728880, Math.min(1.0F, this.field_38554.method_11123() * 4.0F), this.field_38552.method_11123()
               )
         );
         var12.method_17415();
         var4.method_28136(true);
         class_3542.method_16489();
         class_73.method_141();
         GL11.glPopMatrix();
      }
   }

   private Color method_34400(int var1, int var2, Color var3) {
      Color var6 = class_73.method_114(var1, var2, var3);
      if (var3 != null) {
         var6 = class_314.method_1388(var6, var3, 0.08F * this.field_38551);
      }

      return var6;
   }

   private Color method_34398(Entity var1) {
      if (var1 instanceof class_5834) {
         class_5834 var4 = (class_5834)var1;
         float var5 = var4.method_26551() / var4.method_26465() * 20.0F;
         if (var5 > 20.0F) {
            var5 = 20.0F;
         }

         float[] var6 = new float[]{0.0F, 0.5F, 1.0F};
         Color[] var7 = new Color[]{Color.RED, Color.ORANGE, Color.GREEN};
         float var8 = var5 * 5.0F * 0.01F;
         return this.method_34404(var6, var7, var8).brighter();
      } else {
         return new Color(0, 255, 0);
      }
   }

   private Color method_34404(float[] var1, Color[] var2, float var3) {
      Object var6 = null;
      if (var1 == null) {
         throw new IllegalArgumentException("Fractions can't be null");
      } else if (var2 == null) {
         throw new IllegalArgumentException("Colours can't be null");
      } else if (var1.length != var2.length) {
         throw new IllegalArgumentException("Fractions and colours must have equal number of elements");
      } else {
         int[] var7 = this.method_34403(var1, var3);
         if (var7[0] >= 0 && var7[0] < var1.length && var7[1] >= 0 && var7[1] < var1.length) {
            float[] var8 = new float[]{var1[var7[0]], var1[var7[1]]};
            Color[] var9 = new Color[]{var2[var7[0]], var2[var7[1]]};
            float var10 = var8[1] - var8[0];
            float var11 = var3 - var8[0];
            float var12 = var11 / var10;
            return class_314.method_1388(var9[0], var9[1], 1.0F - var12);
         } else {
            return var2[0];
         }
      }
   }

   private int[] method_34403(float[] var1, float var2) {
      int[] var5 = new int[2];
      int var6 = 0;

      while (var6 < var1.length && var1[var6] <= var2) {
         var6++;
      }

      if (var6 >= var1.length) {
         var6 = var1.length - 1;
      }

      var5[0] = var6 - 1;
      var5[1] = var6;
      return var5;
   }

   private void method_34399(int var1) {
      Iterator var4 = this.field_38555.method_37262().iterator();
      int var5 = 0;

      while (var4.hasNext()) {
         class_6098 var6 = (class_6098)var4.next();
         class_73.method_125(var6, var1, this.field_38544 + this.field_38543 / 2 - var5 * 35, 1.0F);
         if (++var5 == 2) {
            var1 -= 35;
            var5 -= 2;
         }
      }
   }
}
