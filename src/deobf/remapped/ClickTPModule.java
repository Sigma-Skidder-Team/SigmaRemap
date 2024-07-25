package remapped;

import org.lwjgl.opengl.GL11;

public class ClickTPModule extends SecondModule {
   public ClickTPModule() {
      super(Category.MOVEMENT, "ClickTP", "TP's you when you click", new BasicClickTP(), new SpartanClickTP());
      this.addSetting(new BooleanSetting("Sneak", "Allows teleport only when sneaking", true));
      this.addSetting(new BooleanSetting("Auto Disable", "Disable ClickTP after teleporting", true));
      this.addSetting(new FloatSetting<Float>("Maximum range", "Maximum range of the teleport", 100.0F, Float.class, 10.0F, 300.0F, 1.0F));
   }

   @EventListen
   public void method_41139(class_3368 var1) {
      if (this.method_42015() && (client.thePlayer.isSneaking() || !this.getBooleanValueByName("Sneak"))) {
         class_9529 var4 = class_7494.method_34079(client.thePlayer.rotationYaw, client.thePlayer.rotationPitch, this.getFloatValueByName("Maximum range"));
         BlockPos var5 = null;
         if (var4 != null) {
            var5 = var4.method_43955();
         }

         this.method_41141(
            this.method_41136(),
            (double)var5.getX() + 0.5 - MinecraftClient.getInstance().gameRenderer.method_35949().method_41627().method_61(),
            (double)(var5.method_12165() + 1) - MinecraftClient.getInstance().gameRenderer.method_35949().method_41627().method_60(),
            (double)var5.method_12185() + 0.5 - MinecraftClient.getInstance().gameRenderer.method_35949().method_41627().method_62()
         );
      }
   }

   private double method_41136() {
      return (double)(MathHelper.sin((float)Math.toRadians((double)(90.0F - client.thePlayer.rotationPitch))) * 10.0F);
   }

   private void method_41141(double var1, double var3, double var5, double var7) {
      GL11.glBlendFunc(770, 771);
      GL11.glEnable(3042);
      GL11.glEnable(2848);
      GL11.glDisable(3553);
      GL11.glDisable(2929);
      GL11.glDepthMask(false);
      GL11.glPushMatrix();
      GL11.glTranslated(var3, var5, var7);
      GL11.glRotatef((float)(client.thePlayer.field_41697 % 90 * 4), 0.0F, 1.0F, 0.0F);
      this.method_41140();
      GL11.glPopMatrix();
      GL11.glEnable(3553);
      GL11.glEnable(2929);
      GL11.glDisable(2848);
      GL11.glDepthMask(true);
      GL11.glDisable(3042);
   }

   private void method_41138(float var1) {
      GL11.glBegin(6);

      for (int var4 = 0; var4 < 360; var4++) {
         double var5 = (double)var4 * Math.PI / 180.0;
         GL11.glVertex2d(Math.cos(var5) * (double)var1, Math.sin(var5) * (double)var1);
      }

      GL11.glEnd();
   }

   private void method_41140() {
      for (byte var3 = 0; var3 <= 270; var3 += 90) {
         GL11.glPushMatrix();
         GL11.glRotatef((float)var3, 0.0F, 1.0F, 0.0F);
         this.method_41137(77.0F, (float)(177 + var3 / 10), (float)(206 + var3 / 10));
         GL11.glPopMatrix();
      }

      for (byte var4 = 0; var4 <= 270; var4 += 90) {
         GL11.glPushMatrix();
         GL11.glRotatef((float)var4, 0.0F, 1.0F, 0.0F);
         GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
         this.method_41137(77.0F, (float)(177 + var4 / 10), (float)(206 + var4 / 10));
         GL11.glPopMatrix();
      }
   }

   private void method_41137(float var1, float var2, float var3) {
      GL11.glColor3f(var1 / 255.0F, var2 / 255.0F, var3 / 255.0F);
      GL11.glTranslatef(0.0F, 0.0F, 0.3F);
      GL11.glNormal3f(0.0F, 0.0F, 1.0F);
      GL11.glRotated(-37.0, 1.0, 0.0, 0.0);
      GL11.glBegin(6);
      GL11.glVertex2f(0.0F, 0.4985F);
      GL11.glVertex2f(-0.3F, 0.0F);
      GL11.glVertex2f(0.3F, 0.0F);
      GL11.glEnd();
   }
}
