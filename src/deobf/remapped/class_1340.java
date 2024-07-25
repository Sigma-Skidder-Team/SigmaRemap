package remapped;

import net.minecraft.util.text.StringTextComponent;

public abstract class class_1340 extends class_7430 {
   private boolean field_7330;

   public class_1340(int var1, int var2) {
      super(var1, var2, 22, 22, StringTextComponent.EMPTY);
   }

   @Override
   public void method_32686(class_7966 var1, int var2, int var3, float var4) {
      MinecraftClient.getInstance().getTextureManager().bindTexture(class_340.method_1573());
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      short var7 = 219;
      int var8 = 0;
      if (this.field_36675) {
         if (!this.field_7330) {
            if (this.method_32703()) {
               var8 += this.field_36671 * 3;
            }
         } else {
            var8 += this.field_36671 * 1;
         }
      } else {
         var8 += this.field_36671 * 2;
      }

      this.method_9781(var1, this.field_36670, this.field_36674, var8, 219, this.field_36671, this.field_36681);
      this.method_6185(var1);
   }

   public abstract void method_6185(class_7966 var1);

   public boolean method_6184() {
      return this.field_7330;
   }

   public void method_6183(boolean var1) {
      this.field_7330 = var1;
   }
}
