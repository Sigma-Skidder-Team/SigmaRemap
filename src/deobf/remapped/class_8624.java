package remapped;

import java.awt.Color;
import java.awt.Font;
import org.lwjgl.opengl.GL11;

public class class_8624 extends FontRenderer {
   public final int field_44252;
   public MinecraftClient field_44253 = MinecraftClient.getInstance();

   public class_8624(int var1) {
      super(new Font("Arial", 0, var1), false);
      this.field_44252 = var1;
   }

   private int method_39615(char var1) {
      return this.field_44253.textRenderer.method_45395(String.valueOf(var1)) * this.field_44252;
   }

   @Override
   public int method_18547(String var1) {
      return this.field_44253.textRenderer.method_45395(var1) * this.field_44252;
   }

   @Override
   public int method_15654() {
      return 9 * this.field_44252;
   }

   @Override
   public int method_18548(String var1) {
      return 9 * this.field_44252;
   }

   @Override
   public int method_18543() {
      return 9 * this.field_44252;
   }

   @Override
   public void method_18545(float var1, float var2, String var3, class_8709 var4) {
      this.method_18546(var1, var2, var3, var4, 0, var3.length() - 1);
   }

   @Override
   public void method_18546(float var1, float var2, String var3, class_8709 var4, int var5, int var6) {
      GL11.glPushMatrix();
      GL11.glScalef((float)this.field_44252, (float)this.field_44252, 0.0F);
      GL11.glTranslatef(-var1 / (float)this.field_44252, -var2 / (float)this.field_44252 + 1.0F, 0.0F);
      this.field_44253
         .textRenderer
         .method_45410(
            var3,
            var1,
            var2,
            new Color(var4.field_44663, var4.field_44649, var4.field_44648, var4.field_44645).getRGB(),
            new class_7966().method_36058().method_28620(),
            false,
            false
         );
      GL11.glPopMatrix();
   }

   @Override
   public void method_18544(float var1, float var2, String var3) {
      this.method_18545(var1, var2, var3, class_8709.field_44646);
   }
}
