package remapped;

import org.lwjgl.opengl.GL11;

public class class_629 extends class_1859 {
   private static String[] field_3555;
   public class_8343 field_3554;
   public class_8343 field_3556;

   public class_629(class_7038 var1, String var2, int var3, int var4, int var5, int var6, String var7, class_8343 var8, class_8343 var9) {
      super(var1, var2, var3, var4, var5, var6, class_590.field_3421, var7, false);
      this.field_3554 = var8;
      this.field_3556 = var9;
   }

   @Override
   public void method_32178(float var1) {
      GL11.glAlphaFunc(518, 0.1F);
      FontManager.method_99(
         (float)(this.field_36270 + (this.field_36278 - 64) / 2),
         (float)(this.field_36261 + 10),
         64.0F,
         64.0F,
         !this.method_32183() ? this.field_3554 : this.field_3556,
         class_1255.field_6918.field_6917
      );
      int var4 = this.method_32109() / 2 + this.field_36270;
      int var5 = this.method_32137() / 2 + this.field_36261;
      FontManager.method_87(
         class_3054.field_14988,
         (float)(this.field_36270 + (this.method_32109() - class_3054.field_14988.method_18547(this.field_36275)) / 2),
         (float)(this.field_36261 + this.method_32137() - 50),
         this.field_36275,
         !this.method_32183() ? -14869219 : -319475
      );
      super.method_32178(var1);
   }
}
