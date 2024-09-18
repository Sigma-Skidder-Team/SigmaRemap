package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gui.AbstractGui;

public class Class6064 extends Class6065 {
   private static String[] field26305;
   public final Class1160 field26306;

   public Class6064(Class1160 var1) {
      super(15, 15, 215, 5);
      this.field26306 = var1;
   }

   @Override
   public void method18799(MatrixStack var1, int var2, int var3, boolean var4) {
      Class823.method2398(this.field26306.field6314).getTextureManager().bindTexture(Class823.method2397());
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      float var7 = !var4 ? 0.0F : 19.0F;
      AbstractGui.method5699(var1, var2, var3, var7, 0.0F, 18, 18, 37, 18);
      if (var4) {
         Class823.method2399(this.field26306.field6314, Class823.method2400());
      }
   }

   @Override
   public void method18800(int var1) {
      Class823.method2401(this.field26306.field6314, var1);
   }
}
