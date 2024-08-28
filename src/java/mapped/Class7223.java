package mapped;

import net.minecraft.util.text.ITextComponent;

public class Class7223 implements Class7222 {
   private static String[] field31052;
   private final int field31053;
   private final boolean field31054;

   public Class7223(int var1, boolean var2) {
      this.field31053 = var1;
      this.field31054 = var2;
   }

   @Override
   public void method22697(Class8036 var1) {
      Class8036.method27577(var1, Class8036.method27578(var1) + this.field31053);
   }

   @Override
   public ITextComponent method22698() {
      return this.field31053 >= 0 ? Class8036.method27580() : Class8036.method27579();
   }

   @Override
   public void method22699(MatrixStack var1, float var2, int var3) {
      Minecraft.getInstance().getTextureManager().bindTexture(Class1195.field6470);
      if (this.field31053 >= 0) {
         Class1193.method5699(var1, 0, 0, 160.0F, 0.0F, 16, 16, 256, 256);
      } else {
         Class1193.method5699(var1, 0, 0, 144.0F, 0.0F, 16, 16, 256, 256);
      }
   }

   @Override
   public boolean method22700() {
      return this.field31054;
   }
}
