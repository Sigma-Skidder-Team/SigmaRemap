package remapped;

import java.awt.Color;
import org.lwjgl.opengl.GL11;

public class class_9074 {
   private static String[] field_46443;
   private float field_46445;
   private float field_46450;
   public float field_46440;
   public float field_46449;
   public float field_46438;
   private float field_46437;
   private float field_46447;
   private float field_46439;
   private boolean field_46444;
   private float field_46442 = 1.0F;
   private class_8465 field_46436 = new class_8465();
   private float field_46448 = 1.0F;
   public float field_46441;
   public Color field_46446 = new Color(1.0F, 1.0F, 1.0F, 0.5F);

   public class_9074(float var1, float var2) {
      this.field_46440 = this.field_46445 = var1;
      this.field_46449 = this.field_46450 = var2;
      this.field_46438 = (float)this.field_46436.nextInt(1, 4) + this.field_46436.nextFloat();
      this.field_46447 = 0.5F - this.field_46436.nextFloat();
      this.field_46439 = 0.5F - this.field_46436.nextFloat();
      this.field_46448 = this.field_46436.nextFloat();
      this.field_46447 *= 0.7F;
      this.field_46439 *= 0.7F;
   }

   public void method_41654(float var1) {
      method_41655(
         this.field_46440 * 2.0F, this.field_46449 * 2.0F, this.field_46438 * 2.0F, class_314.method_1444(this.field_46446.getRGB(), var1 * this.field_46448)
      );
   }

   public static void method_41655(float var0, float var1, float var2, int var3) {
      var2 *= 1.0F;
      var0 *= 2.0F;
      var1 *= 2.0F;
      float var6 = 0.19634953F;
      float var7 = (float)Math.cos((double)var6);
      float var8 = (float)Math.sin((double)var6);
      float var9 = var2;
      float var10 = 0.0F;
      GL11.glEnable(3042);
      GL11.glDisable(3553);
      GL11.glPushMatrix();
      GL11.glScalef(0.5F, 0.5F, 0.5F);
      GL11.glBegin(2);
      GL11.glColor4fv(class_314.method_1412(var3));

      for (int var11 = 0; var11 < 32; var11++) {
         GL11.glVertex2f(var9 + var0, var10 + var1);
         GL11.glVertex2f(var0, var1);
         float var12 = var9;
         var9 = var7 * var9 - var8 * var10;
         var10 = var8 * var12 + var7 * var10;
      }

      GL11.glEnd();
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glPopMatrix();
      GL11.glDisable(3042);
      GL11.glEnable(3553);
   }

   public void method_41653() {
      this.field_46440 = this.field_46440 + this.field_46447;
      this.field_46449 = this.field_46449 + this.field_46439;
      this.field_46448 = Math.max(0.0F, Math.min(1.0F, this.field_46448 - 0.003F + 5.0E-4F * this.field_46438));
   }
}
