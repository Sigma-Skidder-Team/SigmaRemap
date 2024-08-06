package remapped;

import org.lwjgl.opengl.GL11;

public class class_4984 extends class_6220 {
   public static final class_590 field_25812 = new class_590(class_1255.field_6918.field_6917, class_314.method_1401(class_1255.field_6918.field_6917, 0.1F));
   public boolean field_25809 = false;
   public class_2440 field_25811 = new class_2440(300, 250);

   public class_4984(class_7038 var1, String var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6, field_25812);
   }

   @Override
   public void method_32145(int var1, int var2) {
      this.field_25811.method_11119(!this.field_36267 ? class_4043.field_19618 : class_4043.field_19620);
      super.method_32145(var1, var2);
   }

   @Override
   public void method_32178(float var1) {
      this.method_32133(1.0F + this.field_25811.method_11123());
      this.method_32146(1.0F + this.field_25811.method_11123());
      this.method_32190();
      FontManager.method_87(
         this.method_32097(), (float)this.method_32132(), (float)this.method_32173(), "" + this.field_25811.method_11123(), class_1255.field_6929.field_6917
      );
      GL11.glPushMatrix();
      super.method_32182(var1);
      GL11.glPopMatrix();
   }
}
