package remapped;

import java.io.InputStream;
import java.util.Optional;
import java.util.Properties;
import java.util.function.Consumer;

public class class_2789 extends class_7621 {
   private static final Identifier field_13703 = new Identifier("textures/gui/title/mojangstudios.png");
   private static final int field_13709 = class_8496.method_39154(255, 239, 50, 61);
   private static final int field_13698 = field_13709 & 16777215;
   private final MinecraftClient field_13696;
   private final class_4302 field_13700;
   private final Consumer<Optional<Throwable>> field_13695;
   private final boolean field_13694;
   private float field_13697;
   private long field_13707 = -1L;
   private long field_13702 = -1L;
   private int field_13704 = field_13698;
   private int field_13699 = field_13698;
   private int field_13705 = 16777215;
   private int field_13701 = 16777215;
   private class_3525 field_13706 = null;
   private boolean field_13708 = false;

   public class_2789(MinecraftClient var1, class_4302 var2, Consumer<Optional<Throwable>> var3, boolean var4) {
      this.field_13696 = var1;
      this.field_13700 = var2;
      this.field_13695 = var3;
      this.field_13694 = false;
   }

   public static void method_12674(MinecraftClient var0) {
      var0.getTextureManager().method_35682(field_13703, new class_7289());
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      int var7 = this.field_13696.getMainWindow().getScaledWidth();
      int var8 = this.field_13696.getMainWindow().getScaledHeight();
      long var9 = Util.getMeasuringTimeMs();
      if (this.field_13694 && (this.field_13700.method_19968() || this.field_13696.screen != null) && this.field_13702 == -1L) {
         this.field_13702 = var9;
      }

      float var11 = this.field_13707 > -1L ? (float)(var9 - this.field_13707) / 1000.0F : -1.0F;
      float var12 = this.field_13702 > -1L ? (float)(var9 - this.field_13702) / 500.0F : -1.0F;
      float var14;
      if (var11 >= 1.0F) {
         this.field_13708 = true;
         if (this.field_13696.screen != null) {
            this.field_13696.screen.method_6767(var1, 0, 0, var4);
         }

         int var13 = MathHelper.ceil((1.0F - MathHelper.clamp(var11 - 1.0F, 0.0F, 1.0F)) * 255.0F);
         method_9774(var1, 0, 0, var7, var8, this.field_13704 | var13 << 24);
         var14 = 1.0F - MathHelper.clamp(var11 - 1.0F, 0.0F, 1.0F);
      } else if (this.field_13694) {
         if (this.field_13696.screen != null && var12 < 1.0F) {
            this.field_13696.screen.method_6767(var1, var2, var3, var4);
         }

         int var27 = MathHelper.ceil(MathHelper.clamp((double)var12, 0.15, 1.0) * 255.0);
         method_9774(var1, 0, 0, var7, var8, this.field_13704 | var27 << 24);
         var14 = MathHelper.clamp(var12, 0.0F, 1.0F);
      } else {
         method_9774(var1, 0, 0, var7, var8, this.field_13704 | 0xFF000000);
         var14 = 1.0F;
      }

      int var28 = (int)((double)this.field_13696.getMainWindow().getScaledWidth() * 0.5);
      int var15 = (int)((double)this.field_13696.getMainWindow().getScaledHeight() * 0.5);
      double var16 = Math.min((double)this.field_13696.getMainWindow().getScaledWidth() * 0.75, (double)this.field_13696.getMainWindow().getScaledHeight()) * 0.25;
      int var18 = (int)(var16 * 0.5);
      double var19 = var16 * 4.0;
      int var21 = (int)(var19 * 0.5);
      this.field_13696.getTextureManager().bindTexture(field_13703);
      RenderSystem.enableBlend();
      RenderSystem.blendEquation(32774);
      RenderSystem.blendFunc(770, 1);
      RenderSystem.alphaFunc(516, 0.0F);
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, var14);
      boolean var22 = true;
      if (this.field_13706 != null) {
         this.field_13706.method_16280();
         if (!this.field_13706.method_16287() && this.field_13708) {
            var22 = false;
         }
      }

      if (var22) {
         method_9780(var1, var28 - var21, var15 - var18, var21, (int)var16, -0.0625F, 0.0F, 120, 60, 120, 120);
         method_9780(var1, var28, var15 - var18, var21, (int)var16, 0.0625F, 60.0F, 120, 60, 120, 120);
      }

      RenderSystem.defaultBlendFunc();
      RenderSystem.method_16433();
      RenderSystem.disableBlend();
      int var23 = (int)((double)this.field_13696.getMainWindow().getScaledHeight() * 0.8325);
      float var24 = this.field_13700.method_19969();
      this.field_13697 = MathHelper.clamp(this.field_13697 * 0.95F + var24 * 0.050000012F, 0.0F, 1.0F);
      class_7860.field_40010.method_3582();
      if (var11 < 1.0F) {
         this.method_12677(var1, var7 / 2 - var21, var23 - 5, var7 / 2 + var21, var23 + 5, 1.0F - MathHelper.clamp(var11, 0.0F, 1.0F));
      }

      if (var11 >= 2.0F) {
         this.field_13696.method_8494((class_7621)null);
      }

      if (this.field_13707 == -1L && this.field_13700.method_19970() && (!this.field_13694 || var12 >= 2.0F)) {
         this.field_13707 = Util.getMeasuringTimeMs();

         try {
            this.field_13700.method_19966();
            this.field_13695.accept(Optional.<Throwable>empty());
         } catch (Throwable var26) {
            this.field_13695.accept(Optional.<Throwable>of(var26));
         }

         if (this.field_13696.screen != null) {
            this.field_13696
               .screen
               .method_1164(this.field_13696, this.field_13696.getMainWindow().getScaledWidth(), this.field_13696.getMainWindow().getScaledHeight());
         }
      }
   }

   private void method_12677(class_7966 var1, int var2, int var3, int var4, int var5, float var6) {
      int var9 = MathHelper.ceil((float)(var4 - var2 - 2) * this.field_13697);
      int var10 = Math.round(var6 * 255.0F);
      if (this.field_13699 != this.field_13704) {
         int var11 = this.field_13699 >> 16 & 0xFF;
         int var12 = this.field_13699 >> 8 & 0xFF;
         int var13 = this.field_13699 & 0xFF;
         int var14 = class_8496.method_39154(var10, var11, var12, var13);
         method_9774(var1, var2, var3, var4, var5, var14);
      }

      int var18 = this.field_13705 >> 16 & 0xFF;
      int var19 = this.field_13705 >> 8 & 0xFF;
      int var20 = this.field_13705 & 0xFF;
      int var21 = class_8496.method_39154(var10, var18, var19, var20);
      method_9774(var1, var2 + 1, var3, var4 - 1, var3 + 1, var21);
      method_9774(var1, var2 + 1, var5, var4 - 1, var5 - 1, var21);
      method_9774(var1, var2, var3, var2 + 1, var5, var21);
      method_9774(var1, var4, var3, var4 - 1, var5, var21);
      int var15 = this.field_13701 >> 16 & 0xFF;
      int var16 = this.field_13701 >> 8 & 0xFF;
      int var17 = this.field_13701 & 0xFF;
      var21 = class_8496.method_39154(var10, var15, var16, var17);
      method_9774(var1, var2 + 2, var3 + 2, var2 + var9, var5 - 2, var21);
   }

   @Override
   public boolean method_34549() {
      return true;
   }

   public void method_12679() {
      this.field_13704 = field_13698;
      this.field_13699 = field_13698;
      this.field_13705 = 16777215;
      this.field_13701 = 16777215;
      if (Config.method_14438()) {
         try {
            String var3 = "optifine/color.properties";
            Identifier var4 = new Identifier(var3);
            if (!Config.method_14362(var4)) {
               return;
            }

            InputStream var5 = Config.method_14374(var4);
            Config.method_14277("Loading " + var3);
            class_8407 var6 = new class_8407();
            var6.load(var5);
            var5.close();
            this.field_13704 = method_12675(var6, "screen.loading", this.field_13704);
            this.field_13705 = method_12675(var6, "screen.loading.outline", this.field_13705);
            this.field_13699 = method_12675(var6, "screen.loading.bar", this.field_13699);
            this.field_13701 = method_12675(var6, "screen.loading.progress", this.field_13701);
            this.field_13706 = class_4593.method_21291(var6.getProperty("screen.loading.blend"));
         } catch (Exception var7) {
            Config.method_14317("" + var7.getClass().getName() + ": " + var7.getMessage());
         }
      }
   }

   private static int method_12675(Properties var0, String var1, int var2) {
      String var5 = var0.getProperty(var1);
      if (var5 != null) {
         var5 = var5.trim();
         int var6 = method_12678(var5, var2);
         if (var6 >= 0) {
            Config.method_14277(var1 + " = " + var5);
            return var6;
         } else {
            Config.method_14317("Invalid color: " + var1 + " = " + var5);
            return var6;
         }
      } else {
         return var2;
      }
   }

   private static int method_12678(String var0, int var1) {
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

   public boolean method_12676() {
      return this.field_13708;
   }
}
