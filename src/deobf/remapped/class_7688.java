package remapped;

import org.lwjgl.opengl.GL11;

public class class_7688 extends class_1859 {
   private static String[] field_39048;
   public boolean field_39049;
   public class_2440 field_39047 = new class_2440(70, 90);

   public class_7688(class_7038 var1, String var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6, false);
   }

   public boolean method_34834() {
      return this.field_39049;
   }

   public void method_34832(boolean var1) {
      this.method_34833(var1, true);
   }

   public void method_34833(boolean var1, boolean var2) {
      if (var1 != this.method_34834()) {
         this.field_39049 = var1;
         this.field_39047.method_11119(!this.field_39049 ? class_4043.field_19620 : class_4043.field_19618);
         if (var2) {
            this.method_8235();
         }
      }
   }

   @Override
   public void method_32178(float var1) {
      float var4 = !this.method_32185() ? 0.43F : 0.6F;
      class_73.method_108(
         (float)this.field_36270,
         (float)this.field_36261,
         (float)this.field_36278,
         (float)this.field_36257,
         10.0F,
         class_314.method_1444(-4144960, var4 * this.field_39047.method_11123() * var1)
      );
      float var5 = (1.0F - this.field_39047.method_11123()) * var1;
      class_73.method_108(
         (float)this.field_36270,
         (float)this.field_36261,
         (float)this.field_36278,
         (float)this.field_36257,
         10.0F,
         class_314.method_1444(class_314.method_1442(-14047489, class_1255.field_6929.field_6917, !this.method_32185() ? 1.0F : 0.9F), var5)
      );
      GL11.glPushMatrix();
      GL11.glTranslatef((float)(this.method_32132() + this.method_32109() / 2), (float)(this.method_32173() + this.method_32137() / 2), 0.0F);
      GL11.glScalef(1.5F - 0.5F * var5, 1.5F - 0.5F * var5, 0.0F);
      GL11.glTranslatef((float)(-this.method_32132() - this.method_32109() / 2), (float)(-this.method_32173() - this.method_32137() / 2), 0.0F);
      class_73.method_99(
         (float)this.field_36270,
         (float)this.field_36261,
         (float)this.field_36278,
         (float)this.field_36257,
         NotificationIcons.field_11014,
         class_314.method_1444(class_1255.field_6918.field_6917, var5)
      );
      GL11.glPopMatrix();
      var5 *= var5;
      super.method_32178(var1);
   }

   @Override
   public void method_29506(int var1, int var2, int var3) {
      this.method_34833(!this.field_39049, true);
   }
}
