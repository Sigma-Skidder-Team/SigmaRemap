package mapped;

import net.minecraft.util.text.StringTextComponent;

public class Class1249 extends Class1197 {
   private static String[] field6614;
   public ResourceLocation field6615;
   public boolean field6616;
   public int field6617;
   public int field6618;
   public int field6619;
   public int field6620;

   public Class1249(int var1, int var2, int var3, int var4, boolean var5) {
      super(var1, var2, var3, var4, StringTextComponent.EMPTY);
      this.field6616 = var5;
   }

   public void method5821(int var1, int var2, int var3, int var4, ResourceLocation var5) {
      this.field6617 = var1;
      this.field6618 = var2;
      this.field6619 = var3;
      this.field6620 = var4;
      this.field6615 = var5;
   }

   public void method5822(boolean var1) {
      this.field6616 = var1;
   }

   public boolean method5823() {
      return this.field6616;
   }

   public void method5824(int var1, int var2) {
      this.field6477 = var1;
      this.field6478 = var2;
   }

   @Override
   public void method5655(MatrixStack var1, int var2, int var3, float var4) {
      Minecraft var7 = Minecraft.getInstance();
      var7.getTextureManager().bindTexture(this.field6615);
      RenderSystem.disableDepthTest();
      int var8 = this.field6617;
      int var9 = this.field6618;
      if (this.field6616) {
         var8 += this.field6619;
      }

      if (this.method5737()) {
         var9 += this.field6620;
      }

      this.method5696(var1, this.field6477, this.field6478, var8, var9, this.field6475, this.field6476);
      RenderSystem.enableDepthTest();
   }
}
