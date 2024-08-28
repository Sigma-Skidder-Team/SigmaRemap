package mapped;

import com.google.common.collect.Sets;

import java.util.List;
import java.util.Random;
import java.util.Set;

public class Class216 implements Class215 {
   public static final ResourceLocation field845 = new ResourceLocation("textures/misc/enchanted_item_glint.png");
   private static final Set<Class3257> field846 = Sets.newHashSet(new Class3257[]{Class8514.field37222});
   public float field847;
   private final Class8400 field848;
   private final TextureManager field849;
   private final Class9003 field850;
   public Class280 field851 = null;
   private static boolean field852 = false;

   public Class216(TextureManager var1, Class280 var2, Class9003 var3) {
      this.field849 = var1;
      this.field851 = var2;
      if (!Class9299.field42952.method20241()) {
         this.field848 = new Class8400(var2);
      } else {
         this.field848 = (Class8400)Class9299.method35087(Class9299.field42952, this.field851);
      }

      for (Class3257 var7 : Registry.field16075) {
         if (!field846.contains(var7)) {
            this.field848.method29495(var7, new Class1997(Registry.field16075.method9181(var7), "inventory"));
         }
      }

      this.field850 = var3;
   }

   public Class8400 method779() {
      return this.field848;
   }

   public void method780(Class7202 var1, ItemStack var2, int var3, int var4, MatrixStack var5, Class5422 var6) {
      boolean var9 = Class7944.method26969().method1114();
      boolean var10 = Class7944.method26894() && var9;
      if (var10) {
         var6.method17044(Class9025.field41288);
      }

      Random var11 = new Random();
      long var12 = 42L;

      for (Direction var17 : Direction.field685) {
         var11.setSeed(42L);
         this.method787(var5, var6, var1.method22619((Class7380)null, var17, var11), var2, var3, var4);
      }

      var11.setSeed(42L);
      this.method787(var5, var6, var1.method22619((Class7380)null, (Direction)null, var11), var2, var3, var4);
      if (var10) {
         var6.method17044((Class4520)null);
         Class7414.method23864();
      }
   }

   public void method781(ItemStack var1, Class2327 var2, boolean var3, MatrixStack var4, Class7733 var5, int var6, int var7, Class7202 var8) {
      if (!var1.method32105()) {
         var4.method35294();
         boolean var11 = var2 == Class2327.field15930 || var2 == Class2327.field15931 || var2 == Class2327.field15932;
         if (var1.method32107() == Class8514.field38144 && var11) {
            var8 = this.field848.method29496().method1023(new Class1997("minecraft:trident#inventory"));
         }

         if (!Class9299.field42870.method20214()) {
            var8.method22625().method34866(var2).method20691(var3, var4);
         } else {
            var8 = (Class7202)Class9299.field42870.method20217(var4, var8, var2, var3);
         }

         var4.method35291(-0.5, -0.5, -0.5);
         if (!var8.method22623() && (var1.method32107() != Class8514.field38144 || var11)) {
            boolean var16;
            if (var2 != Class2327.field15930 && !var2.method9103() && var1.method32107() instanceof Class3292) {
               Block var13 = ((Class3292)var1.method32107()).method11845();
               var16 = !(var13 instanceof Class3231) && !(var13 instanceof Class3236);
            } else {
               var16 = true;
            }

            if (var8.method22633()) {
               Class9299.field42866.method20217(this, var8, var1, var4, var5, var6, var7, var16);
            } else {
               Class4520 var17 = Class8928.method32633(var1, var16);
               Class5422 var14;
               if (var1.method32107() == Class8514.field37905 && var1.method32159()) {
                  var4.method35294();
                  Class8892 var15 = var4.method35296();
                  if (var2 != Class2327.field15930) {
                     if (var2.method9103()) {
                        var15.method32361().method35510(0.75F);
                     }
                  } else {
                     var15.method32361().method35510(0.5F);
                  }

                  if (!var16) {
                     var14 = method783(var5, var17, var15);
                  } else {
                     var14 = method784(var5, var17, var15);
                  }

                  var4.method35295();
               } else if (!var16) {
                  var14 = method785(var5, var17, true, var1.method32159());
               } else {
                  var14 = method786(var5, var17, true, var1.method32159());
               }

               if (Class7944.method26953()) {
                  var8 = Class7992.method27268(var1, var8, Class6391.field27977, false);
                  Class6391.field27977 = null;
               }

               if (Class8564.method30588()) {
                  Class8564.method30590();
               }

               this.method780(var8, var1, var6, var7, var4, var14);
               if (Class8564.method30588()) {
                  if (Class8564.method30594()) {
                     Class8564.method30595();
                     var14 = method785(var5, var17, true, false);
                     this.method780(var8, var1, Class1699.field9258, var7, var4, var14);
                     Class8564.method30597();
                  }

                  Class8564.method30598();
               }
            }
         } else if (!Class9299.field42913.method20214()) {
            Class9809.field45844.method38685(var1, var2, var4, var5, var6, var7);
         } else {
            Class9809 var12 = (Class9809)Class9299.method35070(var1.method32107(), Class9299.field42913);
            var12.method38685(var1, var2, var4, var5, var6, var7);
         }

         var4.method35295();
      }
   }

   public static Class5422 method782(Class7733 var0, Class4520 var1, boolean var2, boolean var3) {
      if (Class8981.field40609) {
         var3 = false;
      }

      if (Class8564.method30596()) {
         var3 = false;
      }

      return !var3
         ? var0.method25597(var1)
         : Class7802.method26050(var0.method25597(!var2 ? Class4520.method14332() : Class4520.method14331()), var0.method25597(var1));
   }

   public static Class5422 method783(Class7733 var0, Class4520 var1, Class8892 var2) {
      return Class7802.method26050(new Class5427(var0.method25597(Class4520.method14334()), var2.method32361(), var2.method32362()), var0.method25597(var1));
   }

   public static Class5422 method784(Class7733 var0, Class4520 var1, Class8892 var2) {
      return Class7802.method26050(new Class5427(var0.method25597(Class4520.method14335()), var2.method32361(), var2.method32362()), var0.method25597(var1));
   }

   public static Class5422 method785(Class7733 var0, Class4520 var1, boolean var2, boolean var3) {
      if (Class8981.field40609) {
         var3 = false;
      }

      if (Class8564.method30596()) {
         var3 = false;
      }

      if (!var3) {
         return var0.method25597(var1);
      } else {
         return Minecraft.method1517() && var1 == Class8624.method30908()
            ? Class7802.method26050(var0.method25597(Class4520.method14333()), var0.method25597(var1))
            : Class7802.method26050(var0.method25597(!var2 ? Class4520.method14336() : Class4520.method14334()), var0.method25597(var1));
      }
   }

   public static Class5422 method786(Class7733 var0, Class4520 var1, boolean var2, boolean var3) {
      if (Class8981.field40609) {
         var3 = false;
      }

      if (Class8564.method30596()) {
         var3 = false;
      }

      return !var3
         ? var0.method25597(var1)
         : Class7802.method26050(var0.method25597(!var2 ? Class4520.method14337() : Class4520.method14335()), var0.method25597(var1));
   }

   private void method787(MatrixStack var1, Class5422 var2, List<Class8557> var3, ItemStack var4, int var5, int var6) {
      boolean var9 = !var4.method32105();
      Class8892 var10 = var1.method35296();
      boolean var11 = Class8564.method30588();
      int var12 = var3.size();

      for (int var13 = 0; var13 < var12; var13++) {
         Class8557 var14 = (Class8557)var3.get(var13);
         if (var11) {
            var14 = Class8564.method30593(var14);
            if (var14 == null) {
               continue;
            }
         }

         int var15 = -1;
         if (var9 && var14.method30512()) {
            var15 = this.field850.method33258(var4, var14.method30513());
         }

         float var16 = (float)(var15 >> 16 & 0xFF) / 255.0F;
         float var17 = (float)(var15 >> 8 & 0xFF) / 255.0F;
         float var18 = (float)(var15 & 0xFF) / 255.0F;
         if (!Class9299.field42864.method20245()) {
            var2.method17036(var10, var14, var16, var17, var18, var5, var6);
         } else {
            var2.method17021(var10, var14, var16, var17, var18, var5, var6, true);
         }
      }
   }

   public Class7202 method788(ItemStack var1, World var2, Class880 var3) {
      Class3257 var6 = var1.method32107();
      Class7202 var7;
      if (var6 != Class8514.field38144) {
         var7 = this.field848.method29492(var1);
      } else {
         var7 = this.field848.method29496().method1023(new Class1997("minecraft:trident_in_hand#inventory"));
      }

      Class1656 var8 = !(var2 instanceof Class1656) ? null : (Class1656)var2;
      Class6391.field27977 = null;
      Class7202 var9 = var7.method22626().method19424(var7, var1, var8, var3);
      if (Class7944.method26953()) {
         var9 = Class7992.method27268(var1, var9, Class6391.field27977, true);
      }

      return var9 != null ? var9 : this.field848.method29496().method1024();
   }

   public void method789(ItemStack var1, Class2327 var2, int var3, int var4, MatrixStack var5, Class7733 var6) {
      this.method790((Class880)null, var1, var2, false, var5, var6, (World)null, var3, var4);
   }

   public void method790(Class880 var1, ItemStack var2, Class2327 var3, boolean var4, MatrixStack var5, Class7733 var6, World var7, int var8, int var9) {
      if (!var2.method32105()) {
         Class7202 var12 = this.method788(var2, var7, var1);
         this.method781(var2, var3, var4, var5, var6, var8, var9, var12);
      }
   }

   public void method791(ItemStack var1, int var2, int var3) {
      this.method792(var1, var2, var3, this.method788(var1, (World)null, (Class880)null));
   }

   public void method792(ItemStack var1, int var2, int var3, Class7202 var4) {
      field852 = true;
      RenderSystem.pushMatrix();
      this.field849.bindTexture(Class289.field1102);
      this.field849.method1076(Class289.field1102).method1130(false, false);
      RenderSystem.method27867();
      RenderSystem.disableAlphaTest();
      RenderSystem.method27939();
      RenderSystem.enableBlend();
      RenderSystem.method27834(Class2339.field15997, Class1981.field12932);
      RenderSystem.method27889(1.0F, 1.0F, 1.0F, 1.0F);
      RenderSystem.translatef((float)var2, (float)var3, 100.0F + this.field847);
      RenderSystem.translatef(8.0F, 8.0F, 0.0F);
      RenderSystem.scalef(1.0F, -1.0F, 1.0F);
      RenderSystem.scalef(16.0F, 16.0F, 16.0F);
      MatrixStack var7 = new MatrixStack();
      Class7735 var8 = Minecraft.getInstance().method1581().method26536();
      boolean var9 = !var4.method22622();
      if (var9) {
         Class7516.method24502();
      }

      this.method781(var1, Class2327.field15930, false, var7, var8, 15728880, Class213.field798, var4);
      var8.method25602();
      RenderSystem.enableDepthTest();
      if (var9) {
         Class7516.method24503();
      }

      RenderSystem.method27817();
      RenderSystem.method27868();
      RenderSystem.popMatrix();
      field852 = false;
   }

   public void method793(ItemStack var1, int var2, int var3) {
      this.method796(Minecraft.getInstance().player, var1, var2, var3);
   }

   public void method794(ItemStack var1, int var2, int var3) {
      this.method796((Class880)null, var1, var2, var3);
   }

   public void method795(Class880 var1, ItemStack var2, int var3, int var4) {
      this.method796(var1, var2, var3, var4);
   }

   private void method796(Class880 var1, ItemStack var2, int var3, int var4) {
      if (!var2.method32105()) {
         this.field847 += 50.0F;

         try {
            this.method792(var2, var3, var4, this.method788(var2, (World)null, var1));
         } catch (Throwable var10) {
            Class4526 var8 = Class4526.method14413(var10, "Rendering item");
            Class8965 var9 = var8.method14410("Item being rendered");
            var9.method32806("Item Type", () -> String.valueOf(var2.method32107()));
            var9.method32806("Registry Name", () -> String.valueOf(Class9299.method35070(var2.method32107(), Class9299.field42938)));
            var9.method32806("Item Damage", () -> String.valueOf(var2.method32117()));
            var9.method32806("Item NBT", () -> String.valueOf(var2.method32142()));
            var9.method32806("Item Foil", () -> String.valueOf(var2.method32159()));
            throw new Class2506(var8);
         }

         this.field847 -= 50.0F;
      }
   }

   public void method797(Class9834 var1, ItemStack var2, int var3, int var4) {
      this.method798(var1, var2, var3, var4, (String)null);
   }

   public void method798(Class9834 var1, ItemStack var2, int var3, int var4, String var5) {
      if (!var2.method32105()) {
         MatrixStack var8 = new MatrixStack();
         if (var2.method32179() != 1 || var5 != null) {
            String var9 = var5 != null ? var5 : String.valueOf(var2.method32179());
            var8.method35291(0.0, 0.0, (double)(this.field847 + 200.0F));
            Class7735 var10 = Class7733.method25595(Class9352.method35409().method35411());
            var1.method38810(
               var9,
               (float)(var3 + 19 - 2 - var1.method38820(var9)),
               (float)(var4 + 6 + 3),
               16777215,
               true,
               var8.method35296().method32361(),
               var10,
               false,
               0,
               15728880
            );
            var10.method25602();
         }

         if (Class9561.method37046(var2)) {
            RenderSystem.disableDepthTest();
            RenderSystem.method27862();
            RenderSystem.method27817();
            RenderSystem.disableBlend();
            Class9352 var19 = Class9352.method35409();
            Class5425 var21 = var19.method35411();
            float var11 = (float)var2.method32117();
            float var12 = (float)var2.method32119();
            float var13 = Math.max(0.0F, (var12 - var11) / var12);
            int var14 = Math.round(13.0F - var11 * 13.0F / var12);
            int var15 = MathHelper.method37818(var13 / 3.0F, 1.0F, 1.0F);
            if (Class9299.field42910.method20214() && Class9299.field42914.method20214()) {
               double var16 = Class9299.method35068(var2.method32107(), Class9299.field42910, var2);
               int var18 = Class9299.method35065(var2.method32107(), Class9299.field42914, var2);
               var14 = Math.round(13.0F - (float)var16 * 13.0F);
               var15 = var18;
            }

            if (Class7944.method26911()) {
               var15 = Class9680.method37863(var13, var15);
            }

            this.method799(var21, var3 + 2, var4 + 13, 13, 2, 0, 0, 0, 255);
            this.method799(var21, var3 + 2, var4 + 13, var14, 1, var15 >> 16 & 0xFF, var15 >> 8 & 0xFF, var15 & 0xFF, 255);
            RenderSystem.enableBlend();
            RenderSystem.disableAlphaTest();
            RenderSystem.enableTexture();
            RenderSystem.enableDepthTest();
         }

         ClientPlayerEntity var20 = Minecraft.getInstance().player;
         float var22 = var20 != null ? var20.method2976().method19636(var2.method32107(), Minecraft.getInstance().method1562()) : 0.0F;
         if (var22 > 0.0F) {
            RenderSystem.disableDepthTest();
            RenderSystem.method27862();
            RenderSystem.enableBlend();
            RenderSystem.method27938();
            Class9352 var23 = Class9352.method35409();
            Class5425 var24 = var23.method35411();
            this.method799(var24, var3, var4 + MathHelper.method37767(16.0F * (1.0F - var22)), 16, MathHelper.method37773(16.0F * var22), 255, 255, 255, 127);
            RenderSystem.enableTexture();
            RenderSystem.enableDepthTest();
         }
      }
   }

   private void method799(Class5425 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      var1.method17063(7, Class9337.field43342);
      var1.method17025((double)(var2 + 0), (double)(var3 + 0), 0.0).method17026(var6, var7, var8, var9).method17031();
      var1.method17025((double)(var2 + 0), (double)(var3 + var5), 0.0).method17026(var6, var7, var8, var9).method17031();
      var1.method17025((double)(var2 + var4), (double)(var3 + var5), 0.0).method17026(var6, var7, var8, var9).method17031();
      var1.method17025((double)(var2 + var4), (double)(var3 + 0), 0.0).method17026(var6, var7, var8, var9).method17031();
      Class9352.method35409().method35410();
   }

   @Override
   public void method737(Class191 var1) {
      this.field848.method29497();
   }

   public Class1991 method800() {
      return Class1990.field12988;
   }
}
