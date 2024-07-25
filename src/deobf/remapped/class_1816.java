package remapped;

import org.lwjgl.opengl.GL11;

public class class_1816 extends class_6220 {
   private static String[] field_9221;
   public final class_1828 field_9220;
   public boolean field_9223;
   public class_2440 field_9222;

   public class_1816(class_7038 var1, String var2, int var3, int var4, class_1828 var5) {
      super(var1, var2, var3, var4, 18, 18);
      this.field_9220 = var5;
      this.field_9222 = new class_2440(250, 250);
      this.field_9222.method_11119(class_4043.field_19618);
   }

   @Override
   public void method_32178(float var1) {
      if (this.field_9223 && var1 == 1.0F) {
         this.field_9222.method_11119(class_4043.field_19620);
      }

      int var4 = (int)(class_9556.method_44077(this.field_9222.method_11123(), 0.0F, 1.0F, 1.0F, 7.0F) * 3.0F);
      class_73.method_121(
         (float)(this.field_36270 + this.field_36278 / 2),
         (float)(this.field_36261 + this.field_36257 / 2),
         25.0F,
         class_314.method_1444(class_1255.field_6929.field_6917, 0.025F * var1 * this.field_9222.method_11123())
      );
      class_73.method_121(
         (float)(this.field_36270 + this.field_36278 / 2),
         (float)(this.field_36261 + this.field_36257 / 2),
         23.0F,
         class_314.method_1444(class_1255.field_6929.field_6917, 0.05F * var1 * this.field_9222.method_11123())
      );
      class_73.method_121(
         (float)(this.field_36270 + this.field_36278 / 2),
         (float)(this.field_36261 + this.field_36257 / 2),
         (float)(18 + var4),
         class_314.method_1444(class_1255.field_6918.field_6917, var1 * this.field_9222.method_11123())
      );
      class_73.method_121(
         (float)(this.field_36270 + this.field_36278 / 2),
         (float)(this.field_36261 + this.field_36257 / 2),
         (float)(18 - var4),
         class_314.method_1444(this.field_9220.field_9273, var1)
      );
      GL11.glPushMatrix();
      super.method_32182(var1);
      GL11.glPopMatrix();
   }
}
