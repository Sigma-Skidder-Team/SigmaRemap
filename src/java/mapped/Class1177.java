package mapped;

public class Class1177 extends Class1155<Class1177> {
   private final Class6130 field6371;
   public final Class804 field6372;

   public Class1177(Class804 var1, Class6130 var2) {
      this.field6372 = var1;
      this.field6371 = var2;
   }

   @Override
   public void method5544(MatrixStack var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, float var10) {
      this.method5603(var1, this.field6371, var4, var3, var7, var8);
   }

   private void method5603(MatrixStack var1, Class6130 var2, int var3, int var4, int var5, int var6) {
      int var9 = var3 + 45 + 20;
      Class804.method1983(this.field6372).method38801(var1, var2.field27465, (float)var9, (float)(var4 + 2), 16777215);
      Class804.method1984(this.field6372).method38801(var1, var2.field27467, (float)var9, (float)(var4 + 15), 7105644);
      Class804.method1986(this.field6372)
         .method38801(var1, var2.field27466, (float)(var9 + 227 - Class804.method1985(this.field6372).method38820(var2.field27466)), (float)(var4 + 1), 7105644);
      if (!"".equals(var2.field27468) || !"".equals(var2.field27470) || !"".equals(var2.field27471)) {
         this.method5605(var1, var9 - 1, var4 + 25, var5, var6, var2.field27468, var2.field27470, var2.field27471);
      }

      this.method5604(var1, var3, var4 + 1, var5, var6, var2);
   }

   private void method5604(MatrixStack var1, int var2, int var3, int var4, int var5, Class6130 var6) {
      Class8087.method27972(var6.field27464, var6.field27469);
      RenderSystem.method27889(1.0F, 1.0F, 1.0F, 1.0F);
      Class1193.method5699(var1, var2 + 1, var3 + 1, 0.0F, 0.0F, 38, 38, 38, 38);
      Class804.method1988(this.field6372).getTextureManager().bindTexture(Class804.method1987());
      RenderSystem.method27889(1.0F, 1.0F, 1.0F, 1.0F);
      Class1193.method5699(var1, var2, var3, 0.0F, 0.0F, 40, 40, 40, 40);
   }

   private void method5605(MatrixStack var1, int var2, int var3, int var4, int var5, String var6, String var7, String var8) {
      if (!"".equals(var8)) {
         Class804.method1989(this.field6372).method38801(var1, var8, (float)var2, (float)(var3 + 4), 5000268);
      }

      int var11 = !"".equals(var8) ? Class804.method1990(this.field6372).method38820(var8) + 2 : 0;
      boolean var12 = false;
      boolean var13 = false;
      boolean var14 = "".equals(var6);
      if (var4 >= var2 + var11 && var4 <= var2 + var11 + 32 && var5 >= var3 && var5 <= var3 + 15 && var5 < this.field6372.field4565 - 15 && var5 > 32) {
         if (var4 <= var2 + 15 + var11 && var4 > var11) {
            if (!var14) {
               var12 = true;
            } else {
               var13 = true;
            }
         } else if (!var14) {
            var13 = true;
         }
      }

      if (!var14) {
         Class804.method1992(this.field6372).getTextureManager().bindTexture(Class804.method1991());
         RenderSystem.method27889(1.0F, 1.0F, 1.0F, 1.0F);
         RenderSystem.pushMatrix();
         RenderSystem.scalef(1.0F, 1.0F, 1.0F);
         float var15 = !var12 ? 0.0F : 15.0F;
         Class1193.method5699(var1, var2 + var11, var3, var15, 0.0F, 15, 15, 30, 15);
         RenderSystem.popMatrix();
      }

      if (!"".equals(var7)) {
         Class804.method1994(this.field6372).getTextureManager().bindTexture(Class804.method1993());
         RenderSystem.method27889(1.0F, 1.0F, 1.0F, 1.0F);
         RenderSystem.pushMatrix();
         RenderSystem.scalef(1.0F, 1.0F, 1.0F);
         int var17 = var2 + var11 + (!var14 ? 17 : 0);
         float var16 = !var13 ? 0.0F : 15.0F;
         Class1193.method5699(var1, var17, var3, var16, 0.0F, 15, 15, 30, 15);
         RenderSystem.popMatrix();
      }

      if (!var12) {
         if (var13 && !"".equals(var7)) {
            Class804.method1995(this.field6372, Class804.method1998());
            Class804.method1997(this.field6372, var7);
         }
      } else {
         Class804.method1995(this.field6372, Class804.method1996());
         Class804.method1997(this.field6372, var6);
      }
   }

   // $VF: synthetic method
   public static Class6130 method5606(Class1177 var0) {
      return var0.field6371;
   }
}
