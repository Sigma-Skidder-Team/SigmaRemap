package remapped;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import org.lwjgl.opengl.GL11;

public class class_9137 extends Module {
   public HashMap<UUID, class_4333> field_46733 = new HashMap<UUID, class_4333>();
   private Category field_46735 = Category.PLAYER;

   public class_9137() {
      super(Category.RENDER, "Waypoints", "Renders waypoints you added in Jello maps");
      this.addSetting(new BooleanSetting("Unspawn Positions", "Adds a waypoint when a player unspawns", false));
      this.method_42011(false);
   }

   @class_9148
   public void method_42047(class_717 var1) {
      this.field_46733.clear();
   }

   @class_9148
   public void method_42048(class_139 var1) {
      if (mcInstance.field_9601 != null) {
         if (!(var1.method_557() instanceof class_3985)) {
            if (!(var1.method_557() instanceof class_6589)) {
               if (!(var1.method_557() instanceof class_4228)) {
                  if (var1.method_557() instanceof class_5000) {
                     class_5000 var4 = (class_5000)var1.method_557();
                     if (this.field_46733.containsKey(var4.method_23019())) {
                        this.field_46733.remove(var4.method_23019());
                     }
                  }
               } else {
                  class_4228 var10 = (class_4228)var1.method_557();
                  if (this.field_46733.containsKey(var10.method_19691())) {
                     this.field_46733.remove(var10.method_19691());
                  }
               }
            } else {
               class_6589 var11 = (class_6589)var1.method_557();
               if (this.field_46733.containsKey(var11.method_30337())) {
                  this.field_46733.remove(var11.method_30337());
               }
            }
         } else {
            class_3985 var12 = (class_3985)var1.method_557();

            for (int var8 : var12.method_18381()) {
               Entity var9 = mcInstance.field_9601.method_29534(var8);
               if (var9 != null && var9 instanceof class_704) {
                  if (this.field_46733.containsKey(var9.method_37328())) {
                     this.field_46733.remove(var9.method_37328());
                  }

                  this.field_46733
                     .put(
                        var9.method_37328(),
                        new class_4333(
                           var9.method_45509().getUnformattedComponentText() + " Unspawn",
                           (int)var9.method_37302(),
                           (int)var9.method_37309(),
                           (int)var9.method_37156(),
                           class_1255.field_6923.field_6917
                        )
                     );
               }
            }
         }
      }
   }

   @Override
   public void method_42006() {
   }

   @Override
   public void method_42020() {
      this.field_46733.clear();
   }

   public List<class_4333> method_42044(List<class_4333> var1) {
      ArrayList var4 = new ArrayList(var1);
      if (this.method_42007("Unspawn Positions")) {
         var4.addAll(this.field_46733.values());
      }

      var4.sort(
         (var0, var1x) -> !(
                  mcInstance.field_9632.method_37273((double)var0.field_21071, (double)var0.field_21077, (double)var0.field_21073)
                     < mcInstance.field_9632.method_37273((double)var1x.field_21071, (double)var1x.field_21077, (double)var1x.field_21073)
               )
               ? -1
               : 1
      );
      return var4;
   }

   @class_9148
   public void method_42053(class_3368 var1) {
      if (this.method_42015()) {
         for (class_4333 var5 : this.method_42044(SigmaMainClass.method_3328().method_3309().method_21960())) {
            class_1331 var6 = new class_1331(
               (double)(var5.field_21071 - (var5.field_21071 <= 0 ? 1 : 0)),
               (double)var5.field_21077,
               (double)(var5.field_21073 - (var5.field_21073 <= 0 ? 1 : 0))
            );
            double var7 = Math.sqrt(class_9189.method_42355(var6));
            if (!(var7 > 300.0)) {
               if (mcInstance.field_9601.method_22556(var6) != null && var5.field_21076) {
                  int var9 = var6.method_12173() % 16;
                  int var10 = var6.method_12185() % 16;
                  if (var10 < 0) {
                     var10 += 16;
                  }

                  if (var9 < 0) {
                     var9 += 16;
                  }

                  int var11 = mcInstance.field_9601.method_22556(var6).method_27353(class_3801.field_18592).method_9957(var9, var10);
                  if (var11 == 0) {
                     var11 = 64;
                  }

                  if ((float)var11 != var5.field_21077) {
                     var5.field_21077 = var5.field_21077 + ((float)var11 - var5.field_21077) * 0.1F;
                  }
               }

               float var13 = (float)((double)var5.field_21077 - MinecraftClient.getInstance().gameRenderer.method_35949().method_41627().method_60());
               float var14 = (float)((double)var5.field_21071 - MinecraftClient.getInstance().gameRenderer.method_35949().method_41627().method_61());
               float var15 = (float)((double)var5.field_21073 - MinecraftClient.getInstance().gameRenderer.method_35949().method_41627().method_62());
               if (var5.field_21071 < 0) {
                  var14--;
               }

               if (var5.field_21073 < 0) {
                  var15--;
               }

               float var12 = 1.0F;
               var12 = (float)Math.max(1.0, Math.sqrt(class_9189.method_42355(var6) / 30.0));
               this.method_42045(var14, var13, var15, var5.field_21072, var5.field_21075, var12);
            }
         }

         class_3542.method_16420(33986, 240.0F, 240.0F);
         class_9162.method_42212();
         TextureManager var10000 = mcInstance.method_8577();
         mcInstance.method_8577();
         var10000.method_35674(TextureManager.field_40364);
      }
   }

   private void method_42050(int var1) {
      for (byte var4 = 0; var4 <= 270; var4 += 90) {
         GL11.glPushMatrix();
         GL11.glRotatef((float)var4, 0.0F, 1.0F, 0.0F);
         GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
         this.method_42052(class_314.method_1442(class_1255.field_6929.field_6917, var1, 0.04F * (float)var4 / 90.0F));
         GL11.glPopMatrix();
      }

      for (byte var5 = 0; var5 <= 270; var5 += 90) {
         GL11.glPushMatrix();
         GL11.glRotatef((float)var5, 0.0F, 1.0F, 0.0F);
         this.method_42052(class_314.method_1442(class_1255.field_6929.field_6917, var1, 0.04F * (float)var5 / 90.0F));
         GL11.glPopMatrix();
      }
   }

   private void method_42052(int var1) {
      GL11.glColor4fv(class_314.method_1412(var1));
      GL11.glTranslatef(0.0F, 0.0F, 0.3F);
      GL11.glNormal3f(0.0F, 0.0F, 1.0F);
      GL11.glRotated(-37.0, 1.0, 0.0, 0.0);
      GL11.glBegin(6);
      GL11.glVertex2f(0.0F, 0.4985F);
      GL11.glVertex2f(-0.3F, 0.0F);
      GL11.glVertex2f(0.3F, 0.0F);
      GL11.glEnd();
   }

   private void method_42049(float var1, float var2, float var3, float var4) {
      GL11.glColor4f(var1 / 255.0F, var2 / 255.0F, var3 / 255.0F, var4);
      GL11.glTranslatef(0.0F, 0.0F, 0.3F);
      GL11.glNormal3f(0.0F, 0.0F, 1.0F);
      GL11.glRotated(-37.0, 1.0, 0.0, 0.0);
      GL11.glBegin(6);
      GL11.glVertex2f(0.0F, 0.0F);
      GL11.glVertex2f(0.0F, 0.5F);
      GL11.glVertex2f(0.5F, 0.5F);
      GL11.glVertex2f(0.5F, 0.0F);
      GL11.glEnd();
   }

   private void method_42046(float var1) {
      GL11.glBegin(2);

      for (int var4 = 0; var4 < 360; var4++) {
         double var5 = (double)var4 * Math.PI / 180.0;
         GL11.glVertex2d(Math.cos(var5) * (double)var1, Math.sin(var5) * (double)var1);
      }

      GL11.glEnd();
   }

   private void method_42051(float var1) {
      GL11.glBegin(6);

      for (int var4 = 0; var4 < 360; var4++) {
         double var5 = (double)var4 * Math.PI / 180.0;
         GL11.glVertex2d(Math.cos(var5) * (double)var1, Math.sin(var5) * (double)var1);
      }

      GL11.glEnd();
   }

   public void method_42045(float var1, float var2, float var3, String var4, int var5, float var6) {
      GL11.glBlendFunc(770, 771);
      GL11.glEnable(3042);
      GL11.glEnable(2848);
      GL11.glDisable(3553);
      GL11.glDisable(2929);
      GL11.glDisable(2896);
      GL11.glDepthMask(false);
      GL11.glPushMatrix();
      GL11.glAlphaFunc(519, 0.0F);
      GL11.glColor4f(0.0F, 0.0F, 0.0F, 0.114F);
      GL11.glTranslated((double)var1 + 0.5, (double)var2, (double)var3 + 0.5);
      GL11.glRotatef(90.0F, -1.0F, 0.0F, 0.0F);
      this.method_42051(0.5F);
      GL11.glPopMatrix();
      GL11.glPushMatrix();
      GL11.glColor4fv(class_314.method_1412(var5));
      GL11.glTranslated((double)var1 + 0.5, (double)(var2 + 0.7F), (double)var3 + 0.5);
      GL11.glRotatef((float)(mcInstance.field_9632.field_41697 % 90 * 4), 0.0F, -1.0F, 0.0F);
      GL11.glLineWidth(1.4F + 1.0F / var6 * 1.4F);
      this.method_42046(0.6F);
      GL11.glPopMatrix();
      GL11.glPushMatrix();
      GL11.glTranslated((double)var1 + 0.5, (double)(var2 + 0.7F), (double)var3 + 0.5);
      GL11.glRotatef((float)(mcInstance.field_9632.field_41697 % 90 * 4), 0.0F, 1.0F, 0.0F);
      this.method_42050(var5);
      GL11.glPopMatrix();
      GL11.glPushMatrix();
      GL11.glAlphaFunc(519, 0.0F);
      GL11.glTranslated((double)var1 + 0.5, (double)var2 + 1.9, (double)var3 + 0.5);
      GL11.glRotatef(mcInstance.gameRenderer.method_35949().method_41640(), 0.0F, -1.0F, 0.0F);
      GL11.glRotatef(mcInstance.gameRenderer.method_35949().method_41638(), 1.0F, 0.0F, 0.0F);
      class_3384 var9 = class_5320.field_27141;
      GL11.glPushMatrix();
      GL11.glScalef(-0.009F * var6, -0.009F * var6, -0.009F * var6);
      GL11.glTranslated(0.0, -20.0 * Math.sqrt(Math.sqrt((double)var6)), 0.0);
      int var11 = class_314.method_1444(class_314.method_1442(class_1255.field_6918.field_6917, class_1255.field_6929.field_6917, 75.0F), 0.5F);
      class_73.method_94(
         (float)(-var9.method_18547(var4) / 2 - 14), -5.0F, (float)var9.method_18547(var4) / 2.0F + 14.0F, (float)(var9.method_15654() + 7), var11
      );
      class_73.method_128(
         (float)(-var9.method_18547(var4) / 2 - 14), -5.0F, (float)(var9.method_18547(var4) + 28), (float)(var9.method_15654() + 12), 20.0F, 0.5F
      );
      GL11.glTranslated((double)(-var9.method_18547(var4) / 2), 0.0, 0.0);
      class_73.method_87(var9, 0.0F, 0.0F, var4, class_314.method_1444(class_1255.field_6918.field_6917, 0.8F));
      GL11.glPopMatrix();
      GL11.glPopMatrix();
      GL11.glEnable(3553);
      GL11.glEnable(2929);
      GL11.glEnable(2896);
      GL11.glDisable(2848);
      GL11.glDepthMask(true);
      GL11.glDisable(3042);
   }
}
