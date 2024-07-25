package remapped;

import java.awt.Color;
import org.lwjgl.opengl.GL11;

public class class_385 {
   private static String[] field_1573;
   public final float field_1572 = (float)(0.1F + Math.random() * 0.9F);
   public final float field_1571 = (float)(0.5 + Math.random() * 0.5);
   public final int field_1570 = (int)((double) MusicParticlesModule.method_11763().field_9602.method_43166() * Math.random());
   public final int field_1569 = (int)((double) MusicParticlesModule.method_11765().field_9602.method_43163() * Math.random());
   public float field_1568;

   public void method_1876(float var1) {
      this.field_1568 = this.field_1568 + 0.02F * var1 * this.field_1572;
   }

   public void method_1877() {
      float var3 = 0.3F + this.field_1568 * 0.7F;
      float var4 = 1.0F;
      if (!(this.field_1568 < 0.1F)) {
         if (this.field_1568 > 0.75F) {
            var4 = 1.0F - (this.field_1568 - 0.75F) / 0.25F;
         }
      } else {
         var4 = this.field_1568 / 0.1F;
      }

      GL11.glPushMatrix();
      GL11.glTranslatef(
         (float)(MusicParticlesModule.method_11768().field_9602.method_43166() / 2), (float)(MusicParticlesModule.method_11769().field_9602.method_43163() / 2), 0.0F
      );
      GL11.glScalef(var3, var3, 1.0F);
      GL11.glTranslatef(
         (float)(-MusicParticlesModule.method_11770().field_9602.method_43166() / 2), (float)(-MusicParticlesModule.method_11762().field_9602.method_43163() / 2), 0.0F
      );
      int var5 = Color.getHSBColor((float)(System.currentTimeMillis() % 4000L) / 4000.0F, 0.3F, 1.0F).getRGB();
      float var6 = 60.0F * this.field_1571;
      class_73.method_99(
         (float)this.field_1570 - var6 / 2.0F,
         (float)this.field_1569 - var6 / 2.0F,
         var6,
         var6,
         NotificationIcons.field_11006,
         class_314.method_1444(var5, var4 * 0.9F)
      );
      GL11.glPopMatrix();
   }

   public boolean method_1878() {
      return this.field_1568 >= 1.0F;
   }
}
