package remapped;

import org.lwjgl.opengl.GL11;

public class class_8443 extends class_122 implements class_6375 {
   private static String[] field_43192;
   public float field_43193;
   public boolean field_43194 = false;
   public class_2440 field_43191 = new class_2440(160, 140, class_4043.field_19618);

   public class_8443(class_7038 var1, String var2, int var3, int var4, int var5, int var6, class_8343 var7, class_590 var8, String var9, class_3384 var10) {
      super(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
   }

   public class_8443(class_7038 var1, String var2, int var3, int var4, int var5, int var6, class_8343 var7, class_590 var8, String var9) {
      super(var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   public class_8443(class_7038 var1, String var2, int var3, int var4, int var5, int var6, class_8343 var7, class_590 var8) {
      super(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public class_8443(class_7038 var1, String var2, int var3, int var4, int var5, int var6, class_8343 var7) {
      super(var1, var2, var3, var4, var5, var6, var7, new class_590(class_1255.field_6918.field_6917, class_1255.field_6918.field_6917));
   }

   @Override
   public void method_32145(int var1, int var2) {
      super.method_32145(var1, var2);
      this.field_43194 = this.method_32183();
      if (!this.field_43194) {
         if (this.method_38838()) {
            this.field_43191.method_11119(class_4043.field_19618);
            this.method_32187(false);
         }
      } else {
         this.field_43191.method_11119(class_4043.field_19620);
         this.method_32187(true);
      }
   }

   public boolean method_38838() {
      return Math.abs(this.method_38839() - this.method_38837()) < 0.6F;
   }

   public float method_38839() {
      return class_5181.method_23766(this.field_43191.method_11123(), 0.24, 0.88, 0.3, 1.0);
   }

   public float method_38837() {
      return class_5181.method_23766(this.field_43191.method_11123(), 0.45, 0.02, 0.59, 0.28);
   }

   @Override
   public void method_32178(float var1) {
      float var4 = !this.method_32185() ? 0.0F : 0.1F;
      float var5 = this.method_38839();
      if (this.field_43191.method_11128() == class_4043.field_19618) {
         var5 = this.method_38837();
      }

      int var6 = (int)((double)this.method_32109() * (1.0 + (double)var5 * 0.2));
      int var7 = (int)((double)this.method_32137() * (1.0 + (double)var5 * 0.2));
      int var8 = this.method_32132() - (var6 - this.method_32109()) / 2;
      int var9 = (int)((double)(this.method_32173() - (var7 - this.method_32137()) / 2) - (double)((float)(this.method_32137() / 2) * var5) * 0.2);
      float[] var10 = class_314.method_1464(this.method_365().method_38423(), this.method_365().method_38414(), (float)var6, (float)var7);
      byte var11 = 85;
      class_73.method_99(
         (float)var8 + var10[0] - (float)var11,
         (float)var9 + var10[1] - (float)var11,
         var10[2] + (float)(var11 * 2),
         var10[3] + (float)(var11 * 2),
         class_2209.field_11045,
         class_314.method_1444(class_1255.field_6918.field_6917, this.field_43191.method_11123() * 0.7F * var1)
      );
      class_73.method_99(
         (float)var8 + var10[0],
         (float)var9 + var10[1],
         var10[2],
         var10[3],
         this.method_365(),
         class_314.method_1444(class_314.method_1442(this.field_36272.method_2764(), this.field_36272.method_2768(), 1.0F - var4), var1)
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

      class_3384 var12 = this.method_32097();
      float var13 = 0.8F + var5 * 0.2F;
      if (var5 > 0.0F) {
         GL11.glPushMatrix();
         String var14 = this.method_32165() != null ? this.method_32165() : this.field_36268;
         GL11.glTranslatef(
            (float)(this.method_32132() + this.method_32109() / 2 - var12.method_18547(var14) / 2),
            (float)(this.method_32173() + this.method_32137() - 40),
            0.0F
         );
         GL11.glScalef(var13, var13, var13);
         GL11.glAlphaFunc(519, 0.0F);
         class_73.method_97(
            (1.0F - var13) * (float)var12.method_18547(var14) / 2.0F + 1.0F - (float)var12.method_18547(var14) / 2.0F,
            (float)var12.method_18548(var14) / 3.0F,
            (float)(var12.method_18547(var14) * 2),
            (float)var12.method_18548(var14) * 3.0F,
            class_2209.field_11045,
            var5 * 0.6F * var1
         );
         class_73.method_87(
            var12,
            (1.0F - var13) * (float)var12.method_18547(var14) / 2.0F + 1.0F,
            40.0F,
            var14,
            class_314.method_1444(this.method_32139().method_2764(), var5 * 0.6F * var1)
         );
         GL11.glPopMatrix();
      }

      super.method_32182(var1);
   }

   public float 韤쟗㥇䬹呓殢() {
      return 1.2F;
   }

   public float Ꮀ붛疂䕦堧樽() {
      return 0.07F * (30.0F / (float)class_1893.method_8501());
   }
}
