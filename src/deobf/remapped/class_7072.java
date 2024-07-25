package remapped;

import java.awt.Color;
import org.lwjgl.opengl.GL11;

public class class_7072 extends Module {
   public class_7072() {
      super(class_5664.field_28709, "Sims", "You know what it is");
   }

   @class_9148
   public void method_32570(class_3368 var1) {
      if (this.method_42015()) {
         for (Entity var5 : class_7494.method_34088(class_314.method_1435())) {
            if (var5 != mcInstance.field_9632 && !SigmaMainClass.method_3328().method_3331().method_20495(var5)) {
               method_32571(
                  var5.field_41754 + (var5.method_37302() - var5.field_41754) * (double) MinecraftClient.getInstance().field_9616.field_32600,
                  var5.field_41713
                     + (double)var5.method_37074()
                     + (var5.method_37309() - var5.field_41713) * (double) MinecraftClient.getInstance().field_9616.field_32600,
                  var5.field_41724 + (var5.method_37156() - var5.field_41724) * (double) MinecraftClient.getInstance().field_9616.field_32600,
                  var5
               );
            }
         }
      }
   }

   public static void method_32569() {
      Color[] var2 = new Color[]{
         new Color(136, 217, 72),
         new Color(124, 189, 72),
         new Color(103, 181, 75),
         new Color(136, 217, 72),
         new Color(124, 189, 72),
         new Color(103, 181, 75),
         new Color(136, 217, 72),
         new Color(103, 181, 75),
         null,
         null
      };

      for (byte var3 = 0; var3 <= 315; var3 += 45) {
         GL11.glPushMatrix();
         GL11.glRotatef((float)var3, 0.0F, 1.0F, 0.0F);
         int var4 = var3 / 45;
         method_32572((float)var2[var4].getRed() / 255.0F, (float)var2[var4].getGreen() / 255.0F, (float)var2[var4].getBlue() / 255.0F);
         GL11.glPopMatrix();
      }

      GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);

      for (byte var6 = 0; var6 <= 315; var6 += 45) {
         GL11.glPushMatrix();
         GL11.glRotatef((float)var6, 0.0F, 1.0F, 0.0F);
         GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
         int var7 = var6 / 45;
         Color var5 = new Color(class_314.method_1401(var2[var7].getRGB(), 0.2F), false);
         method_32572((float)var5.getRed() / 255.0F, (float)var5.getGreen() / 255.0F, (float)var5.getBlue() / 255.0F);
         GL11.glPopMatrix();
      }
   }

   public static void method_32572(float var0, float var1, float var2) {
      GL11.glColor3f(var0, var1, var2);
      GL11.glTranslatef(0.0F, 0.0F, 0.25F);
      GL11.glNormal3f(0.0F, 0.0F, 1.0F);
      GL11.glRotated(-30.0, 1.0, 0.0, 0.0);
      GL11.glBegin(6);
      GL11.glVertex2f(0.0F, 0.5F);
      GL11.glVertex2f(-0.105F, 0.0F);
      GL11.glVertex2f(0.105F, 0.0F);
      GL11.glEnd();
   }

   public static void method_32571(double var0, double var2, double var4, Entity var6) {
      GL11.glBlendFunc(770, 771);
      GL11.glEnable(3042);
      GL11.glEnable(2848);
      GL11.glDisable(3553);
      GL11.glDisable(2929);
      GL11.glDepthMask(false);
      GL11.glPushMatrix();
      GL11.glTranslated(
         var0 - mcInstance.gameRenderer.method_35949().method_41627().method_61(),
         var2 - mcInstance.gameRenderer.method_35949().method_41627().method_60(),
         var4 - mcInstance.gameRenderer.method_35949().method_41627().method_62()
      );
      GL11.glRotated((double)(var6.field_41697 % 180 * 2), 0.0, -1.0, 0.0);
      float var9 = (float)(var6.field_41697 % 100 - 50);
      if (var9 < 0.0F) {
         var9 *= -1.0F;
      }

      GL11.glTranslated(0.0, (double)(0.7F + var9 / 500.0F), 0.0);
      method_32569();
      GL11.glPopMatrix();
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glEnable(3553);
      GL11.glEnable(2929);
      GL11.glDisable(2848);
      GL11.glDepthMask(true);
      GL11.glDisable(3042);
   }
}
