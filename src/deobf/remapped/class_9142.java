package remapped;

import org.lwjgl.opengl.GL11;

public class class_9142 extends class_122 implements class_6375 {
   private static String[] field_46742;
   public boolean field_46744 = false;
   public class_2440 field_46743 = new class_2440(90, 90, class_4043.field_19618);

   public class_9142(class_7038 var1, String var2, int var3, int var4, int var5, int var6, class_8343 var7, class_590 var8, String var9, class_3384 var10) {
      super(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
   }

   public class_9142(class_7038 var1, String var2, int var3, int var4, int var5, int var6, class_8343 var7, class_590 var8, String var9) {
      super(var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   public class_9142(class_7038 var1, String var2, int var3, int var4, int var5, int var6, class_8343 var7, class_590 var8) {
      super(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public class_9142(class_7038 var1, String var2, int var3, int var4, int var5, int var6, class_8343 var7) {
      super(var1, var2, var3, var4, var5, var6, var7, new class_590(class_1255.field_6918.field_6917, class_1255.field_6918.field_6917));
   }

   @Override
   public void method_32145(int var1, int var2) {
      super.method_32145(var1, var2);
      this.field_46744 = this.method_32183();
      this.field_46743.method_11119(!this.field_46744 ? class_4043.field_19618 : class_4043.field_19620);
   }

   @Override
   public void method_32178(float var1) {
      float var4 = 1.0F + this.field_46743.method_11123() * 0.2F;
      float var5 = !this.method_32185() ? 0.0F : 0.1F;
      int var6 = (int)((float)this.method_32109() * var4);
      int var7 = (int)((float)this.method_32137() * var4);
      int var8 = this.method_32132() - (var6 - this.method_32109()) / 2;
      int var9 = (int)((float)(this.method_32173() - (var7 - this.method_32137()) / 2) - (float)(this.method_32137() / 2) * (var4 - 1.0F));
      float[] var10 = class_314.method_1464(this.method_365().method_38423(), this.method_365().method_38414(), (float)var6, (float)var7);
      class_73.method_149(
         this.method_32155() + var8 - this.field_36270,
         this.method_32093() + var9 - this.field_36261,
         this.method_32155() + var8 - this.field_36270 + var6,
         this.method_32093() + var9 - this.field_36261 + var7
      );
      class_73.method_99(
         (float)var8 + var10[0],
         (float)var9 + var10[1],
         var10[2],
         var10[3],
         this.method_365(),
         class_314.method_1444(class_314.method_1442(this.field_36272.method_2764(), this.field_36272.method_2768(), 1.0F - var5), var1)
      );
      if (this.method_32165() != null) {
         class_73.method_88(
            this.method_32097(),
            (float)(var8 + var6 / 2),
            (float)(var9 + var7 / 2),
            this.method_32165(),
            class_314.method_1444(this.field_36272.method_2774(), var1),
            this.field_36272.method_2773(),
            this.field_36272.method_2770()
         );
      }

      class_73.method_141();
      class_3384 var11 = this.method_32097();
      if (var4 > 1.0F) {
         float var12 = (var4 - 1.0F) / (this.韤쟗㥇䬹呓殢() - 1.0F);
         GL11.glPushMatrix();
         String var13 = this.method_32165() != null ? this.method_32165() : this.field_36268;
         GL11.glTranslatef(
            (float)(this.method_32132() + this.method_32109() / 2 - var11.method_18547(var13) / 2),
            (float)(this.method_32173() + this.method_32137() - 40),
            0.0F
         );
         GL11.glScalef(var4 / this.韤쟗㥇䬹呓殢(), var4 / this.韤쟗㥇䬹呓殢(), var4 / this.韤쟗㥇䬹呓殢());
         GL11.glAlphaFunc(519, 0.0F);
         class_73.method_97(
            (1.0F - var4 / this.韤쟗㥇䬹呓殢()) * (float)var11.method_18547(var13) / 2.0F + 1.0F - (float)var11.method_18547(var13) / 2.0F,
            (float)var11.method_18548(var13) / 3.0F,
            (float)(var11.method_18547(var13) * 2),
            (float)var11.method_18548(var13) * 3.0F,
            NotificationIcons.altshadow,
            var12 * 0.6F
         );
         class_73.method_87(
            var11,
            (1.0F - var4 / this.韤쟗㥇䬹呓殢()) * (float)var11.method_18547(var13) / 2.0F + 1.0F,
            40.0F,
            var13,
            class_314.method_1444(this.method_32139().method_2764(), var12 * 0.6F)
         );
         GL11.glPopMatrix();
      }

      super.method_32182(var1);
   }

   public float 韤쟗㥇䬹呓殢() {
      return 1.2F;
   }

   public float Ꮀ붛疂䕦堧樽() {
      return 0.07F * (30.0F / (float) MinecraftClient.method_8501());
   }
}
