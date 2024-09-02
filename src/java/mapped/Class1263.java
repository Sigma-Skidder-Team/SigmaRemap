package mapped;

import com.google.common.collect.Lists;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.AbstractGui;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.ResourceLocation;

import java.util.Collections;
import java.util.List;

public class Class1263 extends AbstractGui implements Class1190, Class1152 {
   private static final ResourceLocation field6677 = new ResourceLocation("textures/gui/recipe_book.png");
   private final List<Class1251> field6678 = Lists.newArrayList();
   private boolean field6679;
   private int field6680;
   private int field6681;
   private Minecraft field6682;
   private RecipeList field6683;
   private IRecipe<?> field6684;
   private float field6685;
   private boolean field6686;

   public void method5901(Minecraft var1, RecipeList var2, int var3, int var4, int var5, int var6, float var7) {
      this.field6682 = var1;
      this.field6683 = var2;
      if (var1.player.field4905 instanceof Class5831) {
         this.field6686 = true;
      }

      boolean var10 = var1.player.method5397().method21370((Class5828<?>)var1.player.field4905);
      List var11 = var2.method34894(true);
      List var12 = !var10 ? var2.method34894(false) : Collections.emptyList();
      int var13 = var11.size();
      int var14 = var13 + var12.size();
      int var15 = var14 > 16 ? 5 : 4;
      int var16 = (int)Math.ceil((double)((float)var14 / (float)var15));
      this.field6680 = var3;
      this.field6681 = var4;
      byte var17 = 25;
      float var18 = (float)(this.field6680 + Math.min(var14, var15) * 25);
      float var19 = (float)(var5 + 50);
      if (var18 > var19) {
         this.field6680 = (int)((float)this.field6680 - var7 * (float)((int)((var18 - var19) / var7)));
      }

      float var20 = (float)(this.field6681 + var16 * 25);
      float var21 = (float)(var6 + 50);
      if (var20 > var21) {
         this.field6681 = (int)((float)this.field6681 - var7 * (float) MathHelper.method37773((var20 - var21) / var7));
      }

      float var22 = (float)this.field6681;
      float var23 = (float)(var6 - 100);
      if (var22 < var23) {
         this.field6681 = (int)((float)this.field6681 - var7 * (float) MathHelper.method37773((var22 - var23) / var7));
      }

      this.field6679 = true;
      this.field6678.clear();

      for (int var24 = 0; var24 < var14; var24++) {
         boolean var25 = var24 < var13;
         IRecipe var26 = !var25 ? (IRecipe)var12.get(var24 - var13) : (IRecipe)var11.get(var24);
         int var27 = this.field6680 + 4 + 25 * (var24 % var15);
         int var28 = this.field6681 + 5 + 25 * (var24 / var15);
         if (!this.field6686) {
            this.field6678.add(new Class1251(this, var27, var28,var26, var25));
         } else {
            this.field6678.add(new Class1252(this, var27, var28, var26, var25));
         }
      }

      this.field6684 = null;
   }

   @Override
   public boolean method5538(boolean var1) {
      return false;
   }

   public RecipeList method5902() {
      return this.field6683;
   }

   public IRecipe<?> method5903() {
      return this.field6684;
   }

   @Override
   public boolean method1958(double var1, double var3, int var5) {
      if (var5 != 0) {
         return false;
      } else {
         for (Class1251 var9 : this.field6678) {
            if (var9.method1958(var1, var3, var5)) {
               this.field6684 = Class1251.method5831(var9);
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public boolean method2485(double var1, double var3) {
      return false;
   }

   @Override
   public void render(MatrixStack var1, int var2, int var3, float var4) {
      if (this.field6679) {
         this.field6685 += var4;
         RenderSystem.enableBlend();
         RenderSystem.method27889(1.0F, 1.0F, 1.0F, 1.0F);
         this.field6682.getTextureManager().bindTexture(field6677);
         RenderSystem.pushMatrix();
         RenderSystem.translatef(0.0F, 0.0F, 170.0F);
         int var7 = this.field6678.size() > 16 ? 5 : 4;
         int var8 = Math.min(this.field6678.size(), var7);
         int var9 = MathHelper.method37773((float)this.field6678.size() / (float)var7);
         byte var10 = 24;
         byte var11 = 4;
         byte var12 = 82;
         short var13 = 208;
         this.method5904(var1, var8, var9, 24, 4, 82, 208);
         RenderSystem.disableBlend();

         for (Class1251 var15 : this.field6678) {
            var15.render(var1, var2, var3, var4);
         }

         RenderSystem.popMatrix();
      }
   }

   private void method5904(MatrixStack var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      this.method5696(var1, this.field6680, this.field6681, var6, var7, var5, var5);
      this.method5696(var1, this.field6680 + var5 * 2 + var2 * var4, this.field6681, var6 + var4 + var5, var7, var5, var5);
      this.method5696(var1, this.field6680, this.field6681 + var5 * 2 + var3 * var4, var6, var7 + var4 + var5, var5, var5);
      this.method5696(
         var1, this.field6680 + var5 * 2 + var2 * var4, this.field6681 + var5 * 2 + var3 * var4, var6 + var4 + var5, var7 + var4 + var5, var5, var5
      );

      for (int var10 = 0; var10 < var2; var10++) {
         this.method5696(var1, this.field6680 + var5 + var10 * var4, this.field6681, var6 + var5, var7, var4, var5);
         this.method5696(var1, this.field6680 + var5 + (var10 + 1) * var4, this.field6681, var6 + var5, var7, var5, var5);

         for (int var11 = 0; var11 < var3; var11++) {
            if (var10 == 0) {
               this.method5696(var1, this.field6680, this.field6681 + var5 + var11 * var4, var6, var7 + var5, var5, var4);
               this.method5696(var1, this.field6680, this.field6681 + var5 + (var11 + 1) * var4, var6, var7 + var5, var5, var5);
            }

            this.method5696(var1, this.field6680 + var5 + var10 * var4, this.field6681 + var5 + var11 * var4, var6 + var5, var7 + var5, var4, var4);
            this.method5696(var1, this.field6680 + var5 + (var10 + 1) * var4, this.field6681 + var5 + var11 * var4, var6 + var5, var7 + var5, var5, var4);
            this.method5696(var1, this.field6680 + var5 + var10 * var4, this.field6681 + var5 + (var11 + 1) * var4, var6 + var5, var7 + var5, var4, var5);
            this.method5696(
               var1,
               this.field6680 + var5 + (var10 + 1) * var4 - 1,
               this.field6681 + var5 + (var11 + 1) * var4 - 1,
               var6 + var5,
               var7 + var5,
               var5 + 1,
               var5 + 1
            );
            if (var10 == var2 - 1) {
               this.method5696(var1, this.field6680 + var5 * 2 + var2 * var4, this.field6681 + var5 + var11 * var4, var6 + var4 + var5, var7 + var5, var5, var4);
               this.method5696(
                  var1, this.field6680 + var5 * 2 + var2 * var4, this.field6681 + var5 + (var11 + 1) * var4, var6 + var4 + var5, var7 + var5, var5, var5
               );
            }
         }

         this.method5696(var1, this.field6680 + var5 + var10 * var4, this.field6681 + var5 * 2 + var3 * var4, var6 + var5, var7 + var4 + var5, var4, var5);
         this.method5696(var1, this.field6680 + var5 + (var10 + 1) * var4, this.field6681 + var5 * 2 + var3 * var4, var6 + var5, var7 + var4 + var5, var5, var5);
      }
   }

   public void method5905(boolean var1) {
      this.field6679 = var1;
   }

   public boolean method5906() {
      return this.field6679;
   }

   // $VF: synthetic method
   public static ResourceLocation method5907() {
      return field6677;
   }

   // $VF: synthetic method
   public static Minecraft method5908(Class1263 var0) {
      return var0.field6682;
   }

   // $VF: synthetic method
   public static boolean method5909(Class1263 var0) {
      return var0.field6686;
   }

   // $VF: synthetic method
   public static float method5910(Class1263 var0) {
      return var0.field6685;
   }
}
