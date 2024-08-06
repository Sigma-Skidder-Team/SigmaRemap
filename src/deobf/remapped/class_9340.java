package remapped;

import org.lwjgl.opengl.GL11;

public class class_9340 extends class_6220 {
   private static String[] field_47672;
   public static final class_590 field_47671 = new class_590(class_1255.field_6925.field_6917, class_314.method_1401(class_1255.field_6925.field_6917, 0.1F));

   public class_9340(class_7038 var1, String var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6, field_47671);
   }

   @Override
   public void method_32178(float var1) {
      if (var1 != 0.0F) {
         if (!this.method_32140()) {
            float var10000 = 0.3F;
         } else if (!this.method_1535()) {
            if (!this.method_32185()) {
               Math.max(var1 * this.field_31774, 0.0F);
            } else {
               float var5 = 1.5F;
            }
         } else {
            float var6 = 0.0F;
         }

         FontManager.method_139(
            (float)this.method_32132(),
            (float)this.method_32173(),
            (float)this.method_32109(),
            (float)this.method_32137(),
            5.0F,
            class_314.method_1444(this.field_36272.method_2764(), var1)
         );
         if (this.method_32165() != null) {
            FontManager.method_88(
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
}
