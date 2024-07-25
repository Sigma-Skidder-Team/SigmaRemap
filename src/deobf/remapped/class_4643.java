package remapped;

import org.lwjgl.opengl.GL11;

public class class_4643 extends class_6220 {
   private static String[] field_22668;
   private final class_8343 field_22667;
   private boolean field_22669;
   private class_2440 field_22670 = new class_2440(150, 190, class_4043.field_19618);

   public class_4643(class_7038 var1, String var2, int var3, int var4, int var5, int var6, class_8343 var7) {
      super(var1, var2, var3, var4, var5, var6);
      this.field_22667 = var7;
   }

   @Override
   public void method_32145(int var1, int var2) {
      boolean var5 = this.method_32183();
      this.field_22669 = var5;
      super.method_32145(var1, var2);
   }

   @Override
   public void method_32178(float var1) {
      this.field_22670.method_11119(!this.field_22669 ? class_4043.field_19618 : class_4043.field_19620);
      float var4 = class_5181.method_23766(this.field_22670.method_11123(), 0.07, 0.73, 0.63, 1.01);
      if (this.field_22670.method_11128() == class_4043.field_19618) {
         var4 = class_5181.method_23766(this.field_22670.method_11123(), 0.71, 0.18, 0.95, 0.57);
      }

      class_73.method_135((float)this.method_32132(), (float)this.method_32173() - var4 * 3.0F, (float)this.method_32109(), (float)this.method_32137());
      byte var5 = 40;
      float var6 = -class_3778.field_18442 / (float) MinecraftClient.getInstance().window.method_43166();
      float var7 = -class_3778.field_18444 / (float) MinecraftClient.getInstance().window.method_43163();
      class_73.method_96(
         (float)var5 * var6,
         (float)var5 * var7,
         (float)(MinecraftClient.getInstance().window.method_43166() + var5),
         (float)(MinecraftClient.getInstance().window.method_43163() + var5),
         class_6340.field_32371
      );
      class_73.method_141();
      if (this.field_22669) {
         class_73.method_103(
            (float)this.method_32132(),
            (float)this.method_32173() - var4 * 3.0F,
            (float)this.method_32109(),
            (float)this.method_32137(),
            class_314.method_1444(-12319668, 0.5F)
         );
      }

      class_73.method_99(
         (float)this.method_32132(),
         (float)this.method_32173() - var4 * 3.0F,
         (float)this.method_32109(),
         (float)this.method_32137(),
         this.field_22667,
         class_1255.field_6918.field_6917
      );
      GL11.glPushMatrix();
      super.method_32182(var1);
      GL11.glPopMatrix();
   }
}
