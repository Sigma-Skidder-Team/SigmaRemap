package remapped;

import org.lwjgl.opengl.GL11;

public class class_122 extends class_6220 {
   private static String[] field_295;
   public static final class_590 field_296 = new class_590(class_1255.field_6918.field_6917, class_314.method_1401(class_1255.field_6918.field_6917, 0.1F));
   public class_8343 field_294;

   public class_122(class_7038 var1, String var2, int var3, int var4, int var5, int var6, class_8343 var7, class_590 var8, String var9, class_3384 var10) {
      super(var1, var2, var3, var4, var5, var6, var8, var9, var10);
      this.field_294 = var7;
   }

   public class_122(class_7038 var1, String var2, int var3, int var4, int var5, int var6, class_8343 var7, class_590 var8, String var9) {
      super(var1, var2, var3, var4, var5, var6, var8, var9);
      this.field_294 = var7;
   }

   public class_122(class_7038 var1, String var2, int var3, int var4, int var5, int var6, class_8343 var7, class_590 var8) {
      super(var1, var2, var3, var4, var5, var6, var8);
      this.field_294 = var7;
   }

   public class_122(class_7038 var1, String var2, int var3, int var4, int var5, int var6, class_8343 var7) {
      super(var1, var2, var3, var4, var5, var6, field_296);
      this.field_294 = var7;
   }

   public class_8343 method_365() {
      return this.field_294;
   }

   public void method_364(class_8343 var1) {
      this.field_294 = var1;
   }

   @Override
   public void method_32178(float var1) {
      float var4 = !this.method_32140() ? 0.3F : (!this.method_1535() ? (!this.method_32185() ? Math.max(var1 * this.field_31774, 0.0F) : 1.5F) : 0.0F);
      class_73.method_99(
         (float)this.method_32132(),
         (float)this.method_32173(),
         (float)this.method_32109(),
         (float)this.method_32137(),
         this.method_365(),
         class_314.method_1444(
            class_314.method_1442(this.field_36272.method_2764(), this.field_36272.method_2768(), 1.0F - var4),
            (float)(this.field_36272.method_2764() >> 24 & 0xFF) / 255.0F * var1
         )
      );
      if (this.method_32165() != null) {
         class_73.method_88(
            this.method_32097(),
            (float)(this.method_32132() + this.method_32109() / 2),
            (float)(this.method_32173() + this.method_32137() / 2),
            this.method_32165(),
            class_314.method_1444(this.field_36272.method_2774(), var1),
            this.field_36272.method_2773(),
            this.field_36272.method_2770()
         );
      }

      GL11.glPushMatrix();
      super.method_32182(var1);
      GL11.glPopMatrix();
   }
}
