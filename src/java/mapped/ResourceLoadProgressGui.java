package mapped;

import java.io.InputStream;
import java.util.Optional;
import java.util.Properties;
import java.util.function.Consumer;

public class ResourceLoadProgressGui extends LoadingGui {
   private static final ResourceLocation field6435 = new ResourceLocation("textures/gui/title/mojangstudios.png");
   private static final int field6436 = Class9470.method36520(255, 239, 50, 61);
   private static final int field6437 = field6436 & 16777215;
   private final Minecraft field6438;
   private final Class8335 field6439;
   private final Consumer<Optional<Throwable>> field6440;
   private final boolean field6441;
   private float field6442;
   private long field6443 = -1L;
   private long field6444 = -1L;
   private int field6445 = field6437;
   private int field6446 = field6437;
   private int field6447 = 16777215;
   private int field6448 = 16777215;
   private Class8069 field6449 = null;
   private boolean field6450 = false;

   public ResourceLoadProgressGui(Minecraft var1, Class8335 var2, Consumer<Optional<Throwable>> var3, boolean var4) {
      this.field6438 = var1;
      this.field6439 = var2;
      this.field6440 = var3;
      this.field6441 = false;
   }

   public static void loadLogoTexture(Minecraft var0) {
      var0.getTextureManager().method1073(field6435, new Class297());
   }

   @Override
   public void method1923(MatrixStack var1, int var2, int var3, float var4) {
      int var7 = this.field6438.getMainWindow().getScaledWidth();
      int var8 = this.field6438.getMainWindow().getScaledHeight();
      long var9 = Util.milliTime();
      if (this.field6441 && (this.field6439.method29225() || this.field6438.currentScreen != null) && this.field6444 == -1L) {
         this.field6444 = var9;
      }

      float var11 = this.field6443 > -1L ? (float)(var9 - this.field6443) / 1000.0F : -1.0F;
      float var12 = this.field6444 > -1L ? (float)(var9 - this.field6444) / 500.0F : -1.0F;
      float var14;
      if (var11 >= 1.0F) {
         this.field6450 = true;
         if (this.field6438.currentScreen != null) {
            this.field6438.currentScreen.method1923(var1, 0, 0, var4);
         }

         int var13 = MathHelper.method37773((1.0F - MathHelper.method37777(var11 - 1.0F, 0.0F, 1.0F)) * 255.0F);
         method5686(var1, 0, 0, var7, var8, this.field6445 | var13 << 24);
         var14 = 1.0F - MathHelper.method37777(var11 - 1.0F, 0.0F, 1.0F);
      } else if (this.field6441) {
         if (this.field6438.currentScreen != null && var12 < 1.0F) {
            this.field6438.currentScreen.method1923(var1, var2, var3, var4);
         }

         int var27 = MathHelper.method37774(MathHelper.method37778((double)var12, 0.15, 1.0) * 255.0);
         method5686(var1, 0, 0, var7, var8, this.field6445 | var27 << 24);
         var14 = MathHelper.method37777(var12, 0.0F, 1.0F);
      } else {
         method5686(var1, 0, 0, var7, var8, this.field6445 | 0xFF000000);
         var14 = 1.0F;
      }

      int var28 = (int)((double)this.field6438.getMainWindow().getScaledWidth() * 0.5);
      int var15 = (int)((double)this.field6438.getMainWindow().getScaledHeight() * 0.5);
      double var16 = Math.min((double)this.field6438.getMainWindow().getScaledWidth() * 0.75, (double)this.field6438.getMainWindow().getScaledHeight()) * 0.25;
      int var18 = (int)(var16 * 0.5);
      double var19 = var16 * 4.0;
      int var21 = (int)(var19 * 0.5);
      this.field6438.getTextureManager().bindTexture(field6435);
      RenderSystem.enableBlend();
      RenderSystem.method27838(32774);
      RenderSystem.method27835(770, 1);
      RenderSystem.method27819(516, 0.0F);
      RenderSystem.method27889(1.0F, 1.0F, 1.0F, var14);
      boolean var22 = true;
      if (this.field6449 != null) {
         this.field6449.method27786();
         if (!this.field6449.method27780() && this.field6450) {
            var22 = false;
         }
      }

      if (var22) {
         method5698(var1, var28 - var21, var15 - var18, var21, (int)var16, -0.0625F, 0.0F, 120, 60, 120, 120);
         method5698(var1, var28, var15 - var18, var21, (int)var16, 0.0625F, 60.0F, 120, 60, 120, 120);
      }

      RenderSystem.method27938();
      RenderSystem.method27939();
      RenderSystem.disableBlend();
      int var23 = (int)((double)this.field6438.getMainWindow().getScaledHeight() * 0.8325);
      float var24 = this.field6439.method29224();
      this.field6442 = MathHelper.method37777(this.field6442 * 0.95F + var24 * 0.050000012F, 0.0F, 1.0F);
      Class9299.field42771.method20217();
      if (var11 < 1.0F) {
         this.method5678(var1, var7 / 2 - var21, var23 - 5, var7 / 2 + var21, var23 + 5, 1.0F - MathHelper.method37777(var11, 0.0F, 1.0F));
      }

      if (var11 >= 2.0F) {
         this.field6438.setLoadingGui((LoadingGui)null);
      }

      if (this.field6443 == -1L && this.field6439.method29226() && (!this.field6441 || var12 >= 2.0F)) {
         this.field6443 = Util.milliTime();

         try {
            this.field6439.method29227();
            this.field6440.accept(Optional.<Throwable>empty());
         } catch (Throwable var26) {
            this.field6440.accept(Optional.<Throwable>of(var26));
         }

         if (this.field6438.currentScreen != null) {
            this.field6438.currentScreen.init(this.field6438, this.field6438.getMainWindow().getScaledWidth(), this.field6438.getMainWindow().getScaledHeight());
         }
      }
   }

   private void method5678(MatrixStack var1, int var2, int var3, int var4, int var5, float var6) {
      int var9 = MathHelper.method37773((float)(var4 - var2 - 2) * this.field6442);
      int var10 = Math.round(var6 * 255.0F);
      if (this.field6446 != this.field6445) {
         int var11 = this.field6446 >> 16 & 0xFF;
         int var12 = this.field6446 >> 8 & 0xFF;
         int var13 = this.field6446 & 0xFF;
         int var14 = Class9470.method36520(var10, var11, var12, var13);
         method5686(var1, var2, var3, var4, var5, var14);
      }

      int var18 = this.field6447 >> 16 & 0xFF;
      int var19 = this.field6447 >> 8 & 0xFF;
      int var20 = this.field6447 & 0xFF;
      int var21 = Class9470.method36520(var10, var18, var19, var20);
      method5686(var1, var2 + 1, var3, var4 - 1, var3 + 1, var21);
      method5686(var1, var2 + 1, var5, var4 - 1, var5 - 1, var21);
      method5686(var1, var2, var3, var2 + 1, var5, var21);
      method5686(var1, var4, var3, var4 - 1, var5, var21);
      int var15 = this.field6448 >> 16 & 0xFF;
      int var16 = this.field6448 >> 8 & 0xFF;
      int var17 = this.field6448 & 0xFF;
      var21 = Class9470.method36520(var10, var15, var16, var17);
      method5686(var1, var2 + 2, var3 + 2, var2 + var9, var5 - 2, var21);
   }

   @Override
   public boolean isPauseScreen() {
      return true;
   }

   public void method5679() {
      this.field6445 = field6437;
      this.field6446 = field6437;
      this.field6447 = 16777215;
      this.field6448 = 16777215;
      if (Class7944.method26911()) {
         try {
            String var3 = "optifine/color.properties";
            ResourceLocation var4 = new ResourceLocation(var3);
            if (!Class7944.method26866(var4)) {
               return;
            }

            InputStream var5 = Class7944.method26863(var4);
            Class7944.method26810("Loading " + var3);
            Class20 var6 = new Class20();
            var6.load(var5);
            var5.close();
            this.field6445 = method5680(var6, "screen.loading", this.field6445);
            this.field6447 = method5680(var6, "screen.loading.outline", this.field6447);
            this.field6446 = method5680(var6, "screen.loading.bar", this.field6446);
            this.field6448 = method5680(var6, "screen.loading.progress", this.field6448);
            this.field6449 = Class8440.method29681(var6.getProperty("screen.loading.blend"));
         } catch (Exception var7) {
            Class7944.method26811("" + var7.getClass().getName() + ": " + var7.getMessage());
         }
      }
   }

   private static int method5680(Properties var0, String var1, int var2) {
      String var5 = var0.getProperty(var1);
      if (var5 != null) {
         var5 = var5.trim();
         int var6 = method5681(var5, var2);
         if (var6 >= 0) {
            Class7944.method26810(var1 + " = " + var5);
            return var6;
         } else {
            Class7944.method26811("Invalid color: " + var1 + " = " + var5);
            return var6;
         }
      } else {
         return var2;
      }
   }

   private static int method5681(String var0, int var1) {
      if (var0 == null) {
         return var1;
      } else {
         var0 = var0.trim();

         try {
            return Integer.parseInt(var0, 16) & 16777215;
         } catch (NumberFormatException var5) {
            return var1;
         }
      }
   }

   public boolean method5682() {
      return this.field6450;
   }

   // $VF: synthetic method
   public static ResourceLocation method5683() {
      return field6435;
   }
}
