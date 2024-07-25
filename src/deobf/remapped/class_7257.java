package remapped;

import org.lwjgl.opengl.GL11;

public class class_7257 extends class_446 {
   private static String[] field_37177;
   public boolean field_37175;
   private ItemStack field_37178;
   private MinecraftClient field_37176 = MinecraftClient.getInstance();

   public class_7257(class_7038 var1, String var2, int var3, int var4, int var5, int var6, int var7) {
      super(var1, var2, var3, var4, var5, var6, false);
      this.field_37178 = new ItemStack(class_2451.method_11220(var7));
   }

   @Override
   public void method_29506(int var1, int var2, int var3) {
      this.method_33160(!this.field_37175);
      super.method_29506(var1, var2, var3);
   }

   public boolean method_33161() {
      return this.field_37175;
   }

   public void method_33160(boolean var1) {
      this.field_37175 = var1;
   }

   @Override
   public void method_32178(float var1) {
      if (!this.field_37175) {
         class_73.method_94(
            (float)this.field_36270,
            (float)this.field_36261,
            (float)(this.field_36270 + this.field_36278),
            (float)(this.field_36261 + this.field_36257),
            class_314.method_1444(class_1255.field_6918.field_6917, var1)
         );
      } else {
         class_73.method_94(
            (float)this.field_36270,
            (float)this.field_36261,
            (float)(this.field_36270 + this.field_36278),
            (float)(this.field_36261 + this.field_36257),
            class_314.method_1444(-3487030, var1 * 0.5F)
         );
      }

      class_73.method_109(
         (float)(this.field_36270 - 1),
         (float)(this.field_36261 - 1),
         (float)(this.field_36270 + this.field_36278),
         (float)(this.field_36261 + this.field_36257),
         class_314.method_1444(-921103, var1)
      );
      if (this.field_37178.method_27960() != null) {
         this.method_33159();
      }
   }

   private void method_33159() {
      GL11.glPushMatrix();
      float var3 = 0.062F;
      GL11.glTranslatef((float)this.field_36270, (float)this.field_36261, 0.0F);
      GL11.glScalef(
         (float)this.field_36278 * var3 - 0.25F * (float)this.field_36278 / 40.0F,
         (float)this.field_36257 * var3 - 0.25F * (float)this.field_36257 / 40.0F,
         1.0F
      );
      GL11.glTranslatef((float)(-this.field_36270), (float)(-this.field_36261), 0.0F);
      GL11.glEnable(2929);
      class_2083.method_9718();
      this.field_37176.method_8511().method_40264(this.field_37178, this.field_36270 + 1, this.field_36261 + 1);
      class_2083.method_9719();
      GL11.glDisable(2929);
      GL11.glPopMatrix();
   }
}
