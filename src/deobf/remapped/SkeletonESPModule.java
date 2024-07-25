package remapped;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
import org.lwjgl.opengl.GL11;

public class SkeletonESPModule extends Module {
   private static Map<class_704, float[][]> field_20882 = new HashMap<class_704, float[][]>();

   public SkeletonESPModule() {
      super(Category.RENDER, "Skeleton", "Skeleton ESP.");
      this.addSetting(new ColorSetting("Color", "The Skeleton color", class_1255.field_6918.field_6917));
      this.addSetting(new BooleanSetting("CSGO", "Add a CSGO look.", true));
   }

   @class_9148
   public void method_19976(class_3368 var1) {
      if (!this.method_42015()) {
         ;
      }
   }

   private void method_19977(class_3368 var1, class_704 var2) {
      Color var5 = new Color(
         !SigmaMainClass.method_3328().method_3307().method_14459(var2.method_45509().getString())
            ? (!var2.method_45509().getString().equalsIgnoreCase(mcInstance.field_9632.method_45509().getString()) ? new Color(16775672).getRGB() : -6684775)
            : -8401409
      );
      if (!var2.method_37109()) {
         float[][] var6 = field_20882.get(var2);
         if (var6 != null && var2.method_37330() && var2 != mcInstance.field_9632 && !var2.method_26507()) {
            GL11.glPushMatrix();
            GL11.glLineWidth(2.0F);
            GL11.glColor4f((float)(var5.getRed() / 255), (float)(var5.getGreen() / 255), (float)(var5.getBlue() / 255), 1.0F);
            class_4714 var7 = this.method_19975(var1, var2);
            double var8 = var7.method_21803() - mcInstance.method_8587().camera.method_41627().field_7336;
            double var10 = var7.method_21801() - mcInstance.method_8587().camera.method_41627().field_7333;
            double var12 = var7.method_21799() - mcInstance.method_8587().camera.method_41627().field_7334;
            GL11.glTranslated(var8, var10, var12);
            float var14 = var2.field_29611 + (var2.field_29605 - var2.field_29611) * mcInstance.method_8554();
            GL11.glRotatef(-var14, 0.0F, 1.0F, 0.0F);
            GL11.glTranslated(0.0, 0.0, !var2.method_37252() ? 0.0 : -0.235);
            float var15 = !var2.method_37252() ? 0.75F : 0.6F;
            GL11.glPushMatrix();
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            GL11.glTranslated(-0.125, (double)var15, 0.0);
            if (var6[3][0] != 0.0F) {
               GL11.glRotatef(var6[3][0] * (180.0F / (float)Math.PI), 1.0F, 0.0F, 0.0F);
            }

            if (var6[3][1] != 0.0F) {
               GL11.glRotatef(var6[3][1] * (180.0F / (float)Math.PI), 0.0F, 1.0F, 0.0F);
            }

            if (var6[3][2] != 0.0F) {
               GL11.glRotatef(var6[3][2] * (180.0F / (float)Math.PI), 0.0F, 0.0F, 1.0F);
            }

            GL11.glBegin(3);
            GL11.glVertex3d(0.0, 0.0, 0.0);
            GL11.glVertex3d(0.0, (double)(-var15), 0.0);
            GL11.glEnd();
            GL11.glPopMatrix();
            GL11.glPushMatrix();
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            GL11.glTranslated(0.125, (double)var15, 0.0);
            if (var6[4][0] != 0.0F) {
               GL11.glRotatef(var6[4][0] * (180.0F / (float)Math.PI), 1.0F, 0.0F, 0.0F);
            }

            if (var6[4][1] != 0.0F) {
               GL11.glRotatef(var6[4][1] * (180.0F / (float)Math.PI), 0.0F, 1.0F, 0.0F);
            }

            if (var6[4][2] != 0.0F) {
               GL11.glRotatef(var6[4][2] * (180.0F / (float)Math.PI), 0.0F, 0.0F, 1.0F);
            }

            GL11.glBegin(3);
            GL11.glVertex3d(0.0, 0.0, 0.0);
            GL11.glVertex3d(0.0, (double)(-var15), 0.0);
            GL11.glEnd();
            GL11.glPopMatrix();
            GL11.glTranslated(0.0, 0.0, !var2.method_37252() ? 0.0 : 0.25);
            GL11.glPushMatrix();
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            GL11.glTranslated(0.0, !var2.method_37252() ? 0.0 : -0.05, !var2.method_37252() ? 0.0 : -0.01725);
            GL11.glPushMatrix();
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            GL11.glTranslated(-0.375, (double)var15 + 0.55, 0.0);
            if (var6[1][0] != 0.0F) {
               GL11.glRotatef(var6[1][0] * (180.0F / (float)Math.PI), 1.0F, 0.0F, 0.0F);
            }

            if (var6[1][1] != 0.0F) {
               GL11.glRotatef(var6[1][1] * (180.0F / (float)Math.PI), 0.0F, 1.0F, 0.0F);
            }

            if (var6[1][2] != 0.0F) {
               GL11.glRotatef(-var6[1][2] * (180.0F / (float)Math.PI), 0.0F, 0.0F, 1.0F);
            }

            GL11.glBegin(3);
            GL11.glVertex3d(0.0, 0.0, 0.0);
            GL11.glVertex3d(0.0, -0.5, 0.0);
            GL11.glEnd();
            GL11.glPopMatrix();
            GL11.glPushMatrix();
            GL11.glTranslated(0.375, (double)var15 + 0.55, 0.0);
            if (var6[2][0] != 0.0F) {
               GL11.glRotatef(var6[2][0] * (180.0F / (float)Math.PI), 1.0F, 0.0F, 0.0F);
            }

            if (var6[2][1] != 0.0F) {
               GL11.glRotatef(var6[2][1] * (180.0F / (float)Math.PI), 0.0F, 1.0F, 0.0F);
            }

            if (var6[2][2] != 0.0F) {
               GL11.glRotatef(-var6[2][2] * (180.0F / (float)Math.PI), 0.0F, 0.0F, 1.0F);
            }

            GL11.glBegin(3);
            GL11.glVertex3d(0.0, 0.0, 0.0);
            GL11.glVertex3d(0.0, -0.5, 0.0);
            GL11.glEnd();
            GL11.glPopMatrix();
            GL11.glRotatef(var14 - var2.field_29618, 0.0F, 1.0F, 0.0F);
            GL11.glPushMatrix();
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            GL11.glTranslated(0.0, (double)var15 + 0.55, 0.0);
            if (var6[0][0] != 0.0F) {
               GL11.glRotatef(var6[0][0] * (180.0F / (float)Math.PI), 1.0F, 0.0F, 0.0F);
            }

            GL11.glBegin(3);
            GL11.glVertex3d(0.0, 0.0, 0.0);
            GL11.glVertex3d(0.0, 0.3, 0.0);
            GL11.glEnd();
            GL11.glPopMatrix();
            GL11.glPopMatrix();
            GL11.glRotatef(!var2.method_37252() ? 0.0F : 25.0F, 1.0F, 0.0F, 0.0F);
            GL11.glTranslated(0.0, !var2.method_37252() ? 0.0 : -0.16175, !var2.method_37252() ? 0.0 : -0.48025);
            GL11.glPushMatrix();
            GL11.glTranslated(0.0, (double)var15, 0.0);
            GL11.glBegin(3);
            GL11.glVertex3d(-0.125, 0.0, 0.0);
            GL11.glVertex3d(0.125, 0.0, 0.0);
            GL11.glEnd();
            GL11.glPopMatrix();
            GL11.glPushMatrix();
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            GL11.glTranslated(0.0, (double)var15, 0.0);
            GL11.glBegin(3);
            GL11.glVertex3d(0.0, 0.0, 0.0);
            GL11.glVertex3d(0.0, 0.55, 0.0);
            GL11.glEnd();
            GL11.glPopMatrix();
            GL11.glPushMatrix();
            GL11.glTranslated(0.0, (double)var15 + 0.55, 0.0);
            GL11.glBegin(3);
            GL11.glVertex3d(-0.375, 0.0, 0.0);
            GL11.glVertex3d(0.375, 0.0, 0.0);
            GL11.glEnd();
            GL11.glPopMatrix();
            GL11.glPopMatrix();
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         }
      }
   }

   private class_4714 method_19975(class_3368 var1, class_704 var2) {
      float var5 = mcInstance.method_8554();
      double var6 = var2.field_41754 + (var2.method_37302() - var2.field_41754) * (double)var5;
      double var8 = var2.field_41713 + (var2.method_37309() - var2.field_41713) * (double)var5;
      double var10 = var2.field_41724 + (var2.method_37156() - var2.field_41724) * (double)var5;
      return new class_4714(var6, var8, var10);
   }

   public static void method_19978(class_704 var0, class_3169<class_704> var1) {
      field_20882.put(
         var0,
         new float[][]{
            {var1.field_11696.field_8191, var1.field_11696.field_8190, var1.field_11696.field_8185},
            {var1.field_11705.field_8191, var1.field_11705.field_8190, var1.field_11705.field_8185},
            {var1.field_11701.field_8191, var1.field_11701.field_8190, var1.field_11701.field_8185},
            {var1.field_11706.field_8191, var1.field_11706.field_8190, var1.field_11706.field_8185},
            {var1.field_11703.field_8191, var1.field_11703.field_8190, var1.field_11703.field_8185}
         }
      );
   }

   private boolean method_19979(class_704 var1) {
      return !mcInstance.field_9601.method_25873().contains(var1);
   }

   private void method_19980(boolean var1) {
      if (!var1) {
         GL11.glDisable(3042);
         GL11.glDisable(2848);
         GL11.glEnable(2929);
         GL11.glEnable(3553);
         GL11.glPopMatrix();
      } else {
         GL11.glPopMatrix();
         GL11.glEnable(3042);
         GL11.glEnable(2848);
         GL11.glDisable(2929);
         GL11.glDisable(3553);
         GL11.glBlendFunc(770, 771);
         GL11.glHint(3154, 4354);
      }

      GL11.glDepthMask(var1);
   }

   private int method_19974(class_5834 var1) {
      float var4 = var1.method_26551();
      float var5 = var1.method_26465();
      float var6 = Math.max(0.0F, Math.min(var4, var5) / var5);
      return Color.HSBtoRGB(var6 / 3.0F, 1.0F, 1.0F) | 0xFF000000;
   }
}
