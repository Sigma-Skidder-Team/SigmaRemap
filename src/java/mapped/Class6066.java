package mapped;

import net.minecraft.client.gui.AbstractGui;

public class Class6066 extends Class6065 {
   private static String[] field26311;
   public final Class1160 field26312;

   public Class6066(Class1160 var1) {
      super(15, 15, 235, 5);
      this.field26312 = var1;
   }

   @Override
   public void method18799(MatrixStack var1, int var2, int var3, boolean var4) {
      Class823.method2403(this.field26312.field6314).getTextureManager().bindTexture(Class823.method2402());
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      float var7 = !var4 ? 0.0F : 19.0F;
      AbstractGui.method5699(var1, var2, var3, var7, 0.0F, 18, 18, 37, 18);
      if (var4) {
         Class823.method2399(this.field26312.field6314, Class823.method2404());
      }
   }

   @Override
   public void method18800(int var1) {
      Class823.method2405(this.field26312.field6314, var1);
   }
}
