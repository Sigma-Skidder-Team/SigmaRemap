package remapped;

import org.lwjgl.opengl.GL11;

public class class_3534 extends class_1859 {
   private static String[] field_17297;
   public class_2440 field_17296 = new class_2440(1200, 1200, class_4043.field_19618);

   public class_3534(class_7038 var1, String var2, int var3, int var4) {
      super(var1, var2, var3, var4, 20, 20, false);
   }

   @Override
   public void method_32178(float var1) {
      this.field_17296.method_11119(!this.method_32183() ? class_4043.field_19618 : class_4043.field_19620);
      if (this.field_17296.method_11123() == 1.0F && this.method_32183()) {
         this.field_17296 = new class_2440(1200, 1200, class_4043.field_19620);
      }

      int var4 = this.method_32132() + 10;
      int var5 = this.method_32173() + 10;
      GL11.glPushMatrix();
      GL11.glTranslatef((float)var4, (float)var5, 0.0F);
      GL11.glRotatef(this.field_17296.method_11123() * 360.0F, 0.0F, 0.0F, 1.0F);
      GL11.glTranslatef((float)(-var4), (float)(-var5), 0.0F);
      class_73.method_96((float)this.field_36270, (float)this.field_36261, 20.0F, 20.0F, !this.method_32183() ? class_9898.field_50208 : class_9898.field_50189);
      GL11.glPopMatrix();
      super.method_32178(var1);
   }
}
