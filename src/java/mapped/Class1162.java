package mapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;

public class Class1162 extends Class1161 {
   private final Class6128 field6316;
   public final Class806 field6317;

   public Class1162(Class806 var1, Class6128 var2) {
      super(var1, null);
      this.field6317 = var1;
      this.field6316 = var2;
   }

   @Override
   public void method5544(MatrixStack var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, float var10) {
      this.method5559(this.field6316, var1, var4, var3, var7, var8);
   }

   @Override
   public boolean method1958(double var1, double var3, int var5) {
      if (this.field6316.field27447 != Class2261.field14708) {
         Class806.method2120(this.field6317, this.field6316.field27443);
      } else {
         Class806.method2120(this.field6317, -1L);
         Class806.method2121(this.field6317).displayGuiScreen(new Class799(this.field6316, this.field6317));
      }

      return true;
   }

   private void method5559(Class6128 var1, MatrixStack var2, int var3, int var4, int var5, int var6) {
      this.method5560(var1, var2, var3 + 36, var4, var5, var6);
   }

   private void method5560(Class6128 var1, MatrixStack var2, int var3, int var4, int var5, int var6) {
      if (var1.field27447 != Class2261.field14708) {
         short var9 = 225;
         byte var10 = 2;
         if (!var1.field27452) {
            if (var1.field27447 != Class2261.field14706) {
               if (Class806.method2129(this.field6317, var1) && var1.field27454 < 7) {
                  Class806.method2130(this.field6317, var2, var3 + 225 - 14, var4 + 2, var5, var6, var1.field27454);
               } else if (var1.field27447 == Class2261.field14707) {
                  Class806.method2131(this.field6317, var2, var3 + 225 - 14, var4 + 2, var5, var6);
               }
            } else {
               Class806.method2128(this.field6317, var2, var3 + 225 - 14, var4 + 2, var5, var6);
            }
         } else {
            Class806.method2127(this.field6317, var2, var3 + 225 - 14, var4 + 2, var5, var6);
         }

         if (!Class806.method2129(this.field6317, var1) && !Class806.method2132()) {
            Class806.method2133(this.field6317, var2, var3 + 225, var4 + 2, var5, var6);
         } else {
            Class806.method2134(this.field6317, var2, var3 + 225, var4 + 2, var5, var6);
         }

         if (!"0".equals(var1.field27460.field27461)) {
            String var11 = TextFormatting.GRAY + "" + var1.field27460.field27461;
            Class806.method2136(this.field6317)
               .method38801(var2, var11, (float)(var3 + 207 - Class806.method2135(this.field6317).method38820(var11)), (float)(var4 + 3), 8421504);
            if (var5 >= var3 + 207 - Class806.method2137(this.field6317).method38820(var11)
               && var5 <= var3 + 207
               && var6 >= var4 + 1
               && var6 <= var4 + 10
               && var6 < this.field6317.field4565 - 40
               && var6 > 32
               && !this.field6317.method2012()) {
               Class806.method2108(this.field6317, new ITextComponent[]{new StringTextComponent(var1.field27460.field27462)});
            }
         }

         if (Class806.method2129(this.field6317, var1) && var1.field27452) {
            RenderSystem.method27889(1.0F, 1.0F, 1.0F, 1.0F);
            RenderSystem.enableBlend();
            Class806.method2139(this.field6317).getTextureManager().bindTexture(Class806.method2138());
            RenderSystem.method27834(Class2339.field15997, Class1981.field12932);
            ITextComponent var23;
            ITextComponent var24;
            if (!var1.field27453) {
               var23 = Class806.method2142();
               var24 = Class806.method2143();
            } else {
               var23 = Class806.method2140();
               var24 = Class806.method2141();
            }

            int var13 = Class806.method2144(this.field6317).method38821(var24) + 17;
            byte var14 = 16;
            int var15 = var3 + Class806.method2145(this.field6317).method38821(var23) + 8;
            int var16 = var4 + 13;
            boolean var17 = false;
            if (var5 >= var15
               && var5 < var15 + var13
               && var6 > var16
               && var6 <= var16 + 16 & var6 < this.field6317.field4565 - 40
               && var6 > 32
               && !this.field6317.method2012()) {
               var17 = true;
               Class806.method2146(this.field6317, Class1982.field12940);
            }

            int var18 = !var17 ? 1 : 2;
            Class1193.method5699(var2, var15, var16, 0.0F, (float)(46 + var18 * 20), var13 / 2, 8, 256, 256);
            Class1193.method5699(var2, var15 + var13 / 2, var16, (float)(200 - var13 / 2), (float)(46 + var18 * 20), var13 / 2, 8, 256, 256);
            Class1193.method5699(var2, var15, var16 + 8, 0.0F, (float)(46 + var18 * 20 + 12), var13 / 2, 8, 256, 256);
            Class1193.method5699(var2, var15 + var13 / 2, var16 + 8, (float)(200 - var13 / 2), (float)(46 + var18 * 20 + 12), var13 / 2, 8, 256, 256);
            RenderSystem.disableBlend();
            int var19 = var4 + 11 + 5;
            int var20 = !var17 ? 16777215 : 16777120;
            Class806.method2147(this.field6317).method38805(var2, var23, (float)(var3 + 2), (float)(var19 + 1), 15553363);
            Class1193.method5691(var2, Class806.method2148(this.field6317), var24, var15 + var13 / 2, var19 + 1, var20);
         } else {
            if (var1.field27455 != Class2049.field13370) {
               Class806.method2153(this.field6317).method38801(var2, var1.method18906(), (float)(var3 + 2), (float)(var4 + 12), 7105644);
            } else {
               int var12 = Class806.method2150(this.field6317).method38821(Class806.method2149());
               Class806.method2151(this.field6317).method38805(var2, Class806.method2149(), (float)(var3 + 2), (float)(var4 + 12), 13413468);
               Class806.method2152(this.field6317).method38801(var2, var1.method18908(), (float)(var3 + 2 + var12), (float)(var4 + 12), 7105644);
            }

            if (!Class806.method2129(this.field6317, var1)) {
               Class806.method2154(this.field6317).method38801(var2, var1.field27448, (float)(var3 + 2), (float)(var4 + 12 + 11), 5000268);
            }
         }

         Class806.method2155(this.field6317).method38801(var2, var1.method18907(), (float)(var3 + 2), (float)(var4 + 1), 16777215);
         Class8087.method27973(var1.field27449, () -> {
            RenderSystem.method27889(1.0F, 1.0F, 1.0F, 1.0F);
            Class1193.method5698(var2, var3 - 36, var4, 32, 32, 8.0F, 8.0F, 8, 8, 64, 64);
            Class1193.method5698(var2, var3 - 36, var4, 32, 32, 40.0F, 8.0F, 8, 8, 64, 64);
         });
      } else {
         Class806.method2123(this.field6317).getTextureManager().bindTexture(Class806.method2122());
         RenderSystem.method27889(1.0F, 1.0F, 1.0F, 1.0F);
         RenderSystem.disableAlphaTest();
         Class1193.method5699(var2, var3 + 10, var4 + 6, 0.0F, 0.0F, 40, 20, 40, 20);
         float var21 = 0.5F + (1.0F + MathHelper.method37763((float)Class806.method2124(this.field6317) * 0.25F)) * 0.25F;
         int var22 = 0xFF000000 | (int)(127.0F * var21) << 16 | (int)(255.0F * var21) << 8 | (int)(127.0F * var21);
         Class1193.method5691(var2, Class806.method2125(this.field6317), Class806.method2126(), var3 + 10 + 40 + 75, var4 + 12, var22);
      }
   }

   // $VF: synthetic method
   public static Class6128 method5562(Class1162 var0) {
      return var0.field6316;
   }
}
