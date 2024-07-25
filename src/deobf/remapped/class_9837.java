package remapped;

import java.awt.image.BufferedImage;
import java.net.URL;
import org.lwjgl.opengl.GL11;

public class class_9837 extends class_446 {
   private static String[] field_49818;
   public static class_590 field_49816 = new class_590(
      class_1255.field_6929.field_6917,
      class_1255.field_6929.field_6917,
      class_1255.field_6929.field_6917,
      class_1255.field_6929.field_6917,
      class_6206.field_31724,
      class_6206.field_31726
   );
   public URL field_49814 = null;
   public BufferedImage field_49815;
   public boolean field_49817 = false;
   private class_8343 field_49819;
   private class_8343 field_49820;
   private class_2440 field_49813;

   public class_9837(class_7038 var1, String var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6, field_49816, var2, false);
   }

   @Override
   public void method_32145(int var1, int var2) {
      super.method_32145(var1, var2);
   }

   @Override
   public void method_32178(float var1) {
      double var4 = MinecraftClient.method_8510().field_9625.method_39835() - (double)(MinecraftClient.method_8510().field_9602.method_43166() / 2);
      var4 /= (double)(MinecraftClient.method_8510().field_9602.method_43166() / 2);
      var4 = Math.max(-1.0, Math.min(1.0, var4));
      double var6 = MinecraftClient.method_8510().field_9625.method_39832() - (double)(MinecraftClient.method_8510().field_9602.method_43163() / 2);
      var6 /= (double)(MinecraftClient.method_8510().field_9602.method_43163() / 2);
      var6 = Math.max(-1.0, Math.min(1.0, var6));
      GL11.glPushMatrix();
      GL11.glMatrixMode(5888);
      GL11.glEnable(2929);
      GL11.glRotated(1.0 * Math.abs(var4 * var6), var6, var4, 0.0);
      GL11.glTranslatef((float)(-this.field_36270 - this.field_36278 / 2), (float)(-this.field_36261 - this.field_36257 / 2), 0.0F);
      GL11.glDisable(2929);
      class_73.method_103((float)this.field_36270, (float)this.field_36261, (float)this.field_36278, (float)this.field_36257, class_1255.field_6928.field_6917);
      GL11.glPopMatrix();
      super.method_32178(var1);
   }
}
