package remapped;

import org.lwjgl.opengl.GL11;

public class Auto32KModule extends Module {
   public class_1331 field_44720;
   public int field_44718 = -1;
   public int field_44721 = -1;
   public int field_44724 = 0;
   public int field_44717 = -1;
   public short field_44723 = 0;
   public class_5149 field_44716;
   public boolean field_44719 = false;

   public Auto32KModule() {
      super(Category.WORLD, "Auto32k", "Automaticly places 32k shulker + hopper in hotbar");
   }

   @Override
   public void onEnable() {
      this.field_44720 = null;

      for (class_1331 var4 : class_7494.method_34085(class_7494.method_34110(client.playerController.method_42146()))) {
         if (!(class_7494.method_34108(client.thePlayer, var4) < 2.0F)
            && class_7494.method_34116(client.thePlayer, var4)
            && (double)var4.method_12165() >= client.thePlayer.method_37309() - 2.0
            && (double)var4.method_12165() <= client.thePlayer.method_37309() - 1.0
            && this.method_40074(var4)) {
            this.field_44720 = var4;
            break;
         }
      }

      this.field_44721 = class_2740.method_12336(
         class_4897.field_24940,
         class_4897.field_24578,
         class_4897.field_24569,
         class_4897.field_25166,
         class_4897.field_24891,
         class_4897.field_24653,
         class_4897.field_25164,
         class_4897.field_25144,
         class_4897.field_24928,
         class_4897.field_24590,
         class_4897.field_24356,
         class_4897.field_25171,
         class_4897.field_25093,
         class_4897.field_24909,
         class_4897.field_24792,
         class_4897.field_24986,
         class_4897.field_25041
      );
      this.field_44718 = class_2740.method_12336(class_4897.field_25087);
      if (this.field_44718 == -1) {
         this.field_44718 = class_2740.method_12318(class_4897.field_25087);
         if (this.field_44718 != -1) {
            if (this.field_44718 >= 36 && this.field_44718 <= 44) {
               this.field_44718 %= 9;
            } else {
               this.field_44718 = class_2740.method_12363(this.field_44718);
            }
         }
      }

      if (this.field_44721 == -1) {
         this.field_44721 = class_2740.method_12319(
            class_4897.field_24940,
            class_4897.field_24578,
            class_4897.field_24569,
            class_4897.field_25166,
            class_4897.field_24891,
            class_4897.field_24653,
            class_4897.field_25164,
            class_4897.field_25144,
            class_4897.field_24928,
            class_4897.field_24590,
            class_4897.field_24356,
            class_4897.field_25171,
            class_4897.field_25093,
            class_4897.field_24909,
            class_4897.field_24792,
            class_4897.field_24986,
            class_4897.field_25041
         );
         if (this.field_44721 != -1) {
            if (this.field_44721 >= 36 && this.field_44721 <= 44) {
               this.field_44721 %= 9;
            } else {
               this.field_44721 = class_2740.method_12363(this.field_44721);
            }
         }
      }

      this.field_44724 = 0;
   }

   public boolean method_40074(class_1331 var1) {
      class_2522 var4 = client.field_9601.method_28262(var1);
      class_2522 var5 = client.field_9601.method_28262(var1.method_6081());
      class_2522 var6 = client.field_9601.method_28262(var1.method_6082(2));
      return var4.method_8302() && var5.method_8345() && var6.method_8345();
   }

   @Override
   public void onDisable() {
   }

   @EventListen
   private void method_40073(class_3368 var1) {
      if (this.method_42015()) {
         if (this.field_44720 != null) {
            GL11.glAlphaFunc(516, 0.0F);
            class_1331 var4 = this.field_44720;
            double var5 = (double)var4.method_12173() - client.gameRenderer.method_35949().method_41627().method_61();
            double var7 = (double)var4.method_12165() - client.gameRenderer.method_35949().method_41627().method_60();
            double var9 = (double)var4.method_12185() - client.gameRenderer.method_35949().method_41627().method_62();
            class_73.method_83(
               new class_8194(var5, var7 + 1.625, var9, var5 + 1.0, var7 + 3.0, var9 + 1.0), class_314.method_1444(class_1255.field_6922.field_6917, 0.3F)
            );
            GL11.glColor3f(1.0F, 1.0F, 1.0F);
            GL11.glBlendFunc(770, 771);
            GL11.glEnable(3042);
            GL11.glEnable(2848);
            GL11.glDisable(3553);
            GL11.glEnable(2929);
            GL11.glDisable(2896);
            GL11.glDepthMask(false);
            float var11 = 8.0F;
            boolean var12 = true;
            if (var12) {
               GL11.glPushMatrix();
               int var13 = class_314.method_1444(class_1255.field_6922.field_6917, 0.5F);
               float var14 = (float)(var13 >> 24 & 0xFF) / 255.0F;
               float var15 = (float)(var13 >> 16 & 0xFF) / 255.0F;
               float var16 = (float)(var13 >> 8 & 0xFF) / 255.0F;
               float var17 = (float)(var13 & 0xFF) / 255.0F;
               GL11.glColor4f(var15, var16, var17, var14);
               GL11.glTranslated(var5 + 0.5, var7 + 1.01F, var9 + 0.5);
               GL11.glRotatef(90.0F, 0.0F, 0.0F, 0.0F);
               GL11.glLineWidth(3.4F);
               this.method_40072(var11);
               GL11.glPopMatrix();
            }

            int var22 = class_314.method_1444(class_1255.field_6918.field_6917, 0.5F);
            float var23 = (float)(var22 >> 24 & 0xFF) / 255.0F;
            float var24 = (float)(var22 >> 16 & 0xFF) / 255.0F;
            float var25 = (float)(var22 >> 8 & 0xFF) / 255.0F;
            float var26 = (float)(var22 & 0xFF) / 255.0F;

            for (int var18 = 0; (float)var18 < var11 - 1.0F; var18++) {
               float var19 = (float)var18 / var11;
               double var20 = Math.cos((double)var19 * Math.PI / 2.0);
               GL11.glPushMatrix();
               GL11.glColor4f(var24, var25, var26, var23 * (1.0F - var19) * 0.25F);
               GL11.glTranslated(var5 + 0.5, var7 + 2.01F + (double)var18, var9 + 0.5);
               GL11.glRotatef(90.0F, 0.0F, 0.0F, 0.0F);
               GL11.glLineWidth(3.4F);
               this.method_40072((float)((double)var11 * var20));
               GL11.glPopMatrix();
            }

            for (int var27 = 0; (float)var27 < var11 - 1.0F; var27++) {
               float var28 = (float)var27 / var11;
               double var29 = Math.cos((double)var28 * Math.PI / 2.0);
               GL11.glPushMatrix();
               GL11.glColor4f(var24, var25, var26, var23 * (1.0F - var28) * 0.25F);
               GL11.glTranslated(var5 + 0.5, var7 - (double)var27 + 0.01F, var9 + 0.45);
               GL11.glRotatef(90.0F, 0.0F, 0.0F, 0.0F);
               GL11.glLineWidth(3.4F);
               this.method_40072((float)((double)var11 * var29));
               GL11.glPopMatrix();
            }

            GL11.glEnable(3553);
            GL11.glDisable(2848);
            GL11.glDepthMask(true);
            GL11.glEnable(2896);
            GL11.glColor3f(1.0F, 1.0F, 1.0F);
         }
      }
   }

   private void method_40072(float var1) {
      GL11.glBegin(2);

      for (int var4 = 0; var4 < 360; var4++) {
         double var5 = (double)var4 * Math.PI / 180.0;
         GL11.glVertex2d(Math.cos(var5) * (double)var1, Math.sin(var5) * (double)var1);
      }

      GL11.glEnd();
   }

   @EventListen
   private void method_40075(class_1393 var1) {
      if (this.method_42015()) {
         if (this.field_44718 != -1) {
            if (this.field_44721 != -1) {
               if (this.field_44720 != null) {
                  if (this.field_44724 != 0) {
                     if (this.field_44724 == 1) {
                        float var4 = class_7494.method_34097(this.field_44720.method_6081(), Direction.field_817)[0];
                        float var5 = class_7494.method_34097(this.field_44720.method_6081(), Direction.field_817)[1];
                        var1.method_6441(var4);
                        var1.method_6448(var5);
                        int var6 = client.thePlayer.inventory.field_36404;
                        client.thePlayer.inventory.field_36404 = this.field_44718;
                        class_1343 var7 = class_7494.method_34098(Direction.field_817, this.field_44720);
                        class_9529 var8 = new class_9529(var7, Direction.field_817, this.field_44720, false);
                        class_6910 var9 = client.playerController.method_42147(client.thePlayer, client.field_9601, class_2584.field_12791, var8);
                        client.thePlayer.method_26597(class_2584.field_12791);
                        if (var9 == class_6910.field_35520) {
                           this.field_44724++;
                           client.method_8614().method_4813(new class_2317(client.thePlayer, class_4127.field_20098));
                           client.thePlayer.field_30533.field_45289 = true;
                           client.thePlayer.inventory.field_36404 = this.field_44721;
                           class_1343 var10 = class_7494.method_34098(Direction.field_817, this.field_44720.method_6081());
                           class_9529 var11 = new class_9529(var10, Direction.field_817, this.field_44720.method_6081(), false);
                           client.playerController.method_42147(client.thePlayer, client.field_9601, class_2584.field_12791, var11);
                           client.thePlayer.method_26597(class_2584.field_12791);
                           client.thePlayer.field_30533.field_45289 = false;
                           client.method_8614().method_4813(new class_2317(client.thePlayer, class_4127.field_20097));
                           client.playerController.method_42147(client.thePlayer, client.field_9601, class_2584.field_12791, var11);
                        }
                     }
                  } else {
                     float var12 = class_7494.method_34097(this.field_44720, Direction.field_817)[0];
                     float var13 = class_7494.method_34097(this.field_44720, Direction.field_817)[1];
                     var1.method_6441(var12);
                     var1.method_6448(var13);
                     this.field_44724++;
                  }
               }
            }
         }
      }
   }

   @EventListen
   private void method_40077(PacketEvent var1) {
      if (this.method_42015()) {
         if (var1.method_557() instanceof class_5149) {
            this.field_44716 = (class_5149)var1.method_557();
            if (this.method_42015() && this.field_44716.method_23575() == class_4165.field_20265) {
               var1.method_29715(true);
            }

            this.field_44717 = this.field_44716.method_23577();
            this.field_44719 = false;
         }

         if (var1.method_557() instanceof class_5491) {
            class_5491 var4 = (class_5491)var1.method_557();
            int var5 = var4.method_24956();
            ItemStack var6 = var4.method_24953();
            int var7 = var4.method_24952();
            if (this.field_44717 == var7 && var5 == 0 && var6.method_27960() != class_4897.field_25302 && !this.field_44719) {
               var1.method_29715(true);
               client.method_8614().method_4813(new class_5955(var7, var5, 1, class_6269.field_32019, var6, this.field_44723++));
               int var8 = -1;

               for (int var9 = 44; var9 > 9; var9--) {
                  ItemStack var10 = client.thePlayer.field_3869.method_18878(var9).method_35898();
                  if (var10.method_28022()) {
                     var8 = var9;
                     break;
                  }
               }

               if (var8 != -1) {
                  client.thePlayer.field_3869.method_18878(var8).method_35896(var6);
                  if (var8 >= 36) {
                     client.thePlayer.inventory.field_36404 = var8 % 9;
                  }
               }

               this.field_44719 = true;
            }
         }

         if (var1.method_557() instanceof class_5257) {
            this.setEnabled2(false);
         }
      }
   }

   @EventListen
   private void method_40076(class_2157 var1) {
      if (this.method_42015()) {
         if (var1.method_10047() instanceof class_1194) {
            var1.method_29715(true);
         }

         if (var1.method_10047() instanceof class_3398) {
            float var4 = class_7494.method_34097(this.field_44720.method_6081(), Direction.field_817)[0];
            float var5 = class_7494.method_34097(this.field_44720.method_6081(), Direction.field_817)[1];
         }

         if (var1.method_10047() instanceof class_4609) {
            class_4609 var6 = (class_4609)var1.method_10047();
            var6.field_22416 = false;
         }
      }
   }
}
