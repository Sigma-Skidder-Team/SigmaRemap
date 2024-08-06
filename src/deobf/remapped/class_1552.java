package remapped;

import org.lwjgl.opengl.GL11;

public class class_1552 extends class_446 {
   private static String[] field_8209;
   public static class_590 field_8208 = new class_590(
      class_1255.field_6929.field_6917,
      class_1255.field_6929.field_6917,
      class_1255.field_6929.field_6917,
      class_1255.field_6929.field_6917,
      class_6206.field_31724,
      class_6206.field_31726
   );
   public boolean field_8207 = false;

   public class_1552(class_7038 var1, String var2, int var3, int var4, int var5, int var6, class_590 var7, String var8) {
      super(var1, var2, var3, var4, var5, var6, var7, var8, false);
   }

   public class_1552(class_7038 var1, String var2, int var3, int var4, int var5, int var6, class_590 var7, String var8, FontRenderer var9) {
      super(var1, var2, var3, var4, var5, var6, var7, var8, var9, false);
   }

   @Override
   public void method_32178(float var1) {
      if (this.field_8207) {
         GL11.glAlphaFunc(518, 0.01F);
         FontManager.method_87(
            class_5320.field_27146,
            (float)this.method_32132(),
            (float)this.method_32173(),
            this.method_32165(),
            class_314.method_1444(class_1255.field_6929.field_6917, var1)
         );
         GL11.glAlphaFunc(519, 0.0F);
      }

      if (this.field_36275 != null) {
         FontManager.method_87(
            this.method_32097(),
            (float)this.method_32132(),
            (float)this.method_32173(),
            this.method_32165(),
            class_314.method_1444(this.field_36272.method_2774(), var1 * class_314.method_1407(this.field_36272.method_2774()))
         );
      }
   }
}
