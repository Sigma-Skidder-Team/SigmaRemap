package net.minecraft.client.renderer.entity;

import com.google.common.collect.Sets;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import mapped.*;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.crash.CrashReport;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.resources.IResourceManagerReloadListener;
import net.minecraft.util.Direction;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import net.optifine.Config;
import net.optifine.shaders.Shaders;

import java.util.List;
import java.util.Random;
import java.util.Set;

public class ItemRenderer implements IResourceManagerReloadListener {
   public static final ResourceLocation field845 = new ResourceLocation("textures/misc/enchanted_item_glint.png");
   private static final Set<Item> field846 = Sets.newHashSet(new Item[]{Items.field37222});
   public float field847;
   private final Class8400 field848;
   private final TextureManager field849;
   private final ItemColors field850;
   public ModelManager field851 = null;
   private static boolean field852 = false;

   public ItemRenderer(TextureManager var1, ModelManager var2, ItemColors var3) {
      this.field849 = var1;
      this.field851 = var2;
      if (!Reflector.field42952.exists()) {
         this.field848 = new Class8400(var2);
      } else {
         this.field848 = (Class8400) Reflector.method35087(Reflector.field42952, this.field851);
      }

      for (Item var7 : Registry.ITEM) {
         if (!field846.contains(var7)) {
            this.field848.method29495(var7, new Class1997(Registry.ITEM.getKey(var7), "inventory"));
         }
      }

      this.field850 = var3;
   }

   public Class8400 method779() {
      return this.field848;
   }

   public void method780(IBakedModel var1, ItemStack var2, int var3, int var4, MatrixStack var5, Class5422 var6) {
      boolean var9 = Config.method26969().method1114();
      boolean var10 = Config.method26894() && var9;
      if (var10) {
         var6.method17044(Class9025.field41288);
      }

      Random var11 = new Random();
      long var12 = 42L;

      for (Direction var17 : Direction.field685) {
         var11.setSeed(42L);
         this.method787(var5, var6, var1.method22619((BlockState)null, var17, var11), var2, var3, var4);
      }

      var11.setSeed(42L);
      this.method787(var5, var6, var1.method22619((BlockState)null, (Direction)null, var11), var2, var3, var4);
      if (var10) {
         var6.method17044((RenderType)null);
         GlStateManager.method23864();
      }
   }

   public void method781(ItemStack var1, Class2327 var2, boolean var3, MatrixStack var4, Class7733 var5, int var6, int var7, IBakedModel var8) {
      if (!var1.isEmpty()) {
         var4.push();
         boolean var11 = var2 == Class2327.field15930 || var2 == Class2327.field15931 || var2 == Class2327.field15932;
         if (var1.getItem() == Items.field38144 && var11) {
            var8 = this.field848.method29496().method1023(new Class1997("minecraft:trident#inventory"));
         }

         if (!Reflector.field42870.exists()) {
            var8.method22625().method34866(var2).method20691(var3, var4);
         } else {
            var8 = (IBakedModel) Reflector.field42870.call(var4, var8, var2, var3);
         }

         var4.translate(-0.5, -0.5, -0.5);
         if (!var8.method22623() && (var1.getItem() != Items.field38144 || var11)) {
            boolean var16;
            if (var2 != Class2327.field15930 && !var2.method9103() && var1.getItem() instanceof Class3292) {
               Block var13 = ((Class3292)var1.getItem()).method11845();
               var16 = !(var13 instanceof Class3231) && !(var13 instanceof Class3236);
            } else {
               var16 = true;
            }

            if (var8.method22633()) {
               Reflector.field42866.call(this, var8, var1, var4, var5, var6, var7, var16);
            } else {
               RenderType var17 = Class8928.method32633(var1, var16);
               Class5422 var14;
               if (var1.getItem() == Items.field37905 && var1.method32159()) {
                  var4.push();
                  Class8892 var15 = var4.getLast();
                  if (var2 != Class2327.field15930) {
                     if (var2.method9103()) {
                        var15.getMatrix().method35510(0.75F);
                     }
                  } else {
                     var15.getMatrix().method35510(0.5F);
                  }

                  if (!var16) {
                     var14 = method783(var5, var17, var15);
                  } else {
                     var14 = method784(var5, var17, var15);
                  }

                  var4.pop();
               } else if (!var16) {
                  var14 = method785(var5, var17, true, var1.method32159());
               } else {
                  var14 = method786(var5, var17, true, var1.method32159());
               }

               if (Config.method26953()) {
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
         } else if (!Reflector.field42913.exists()) {
            Class9809.field45844.method38685(var1, var2, var4, var5, var6, var7);
         } else {
            Class9809 var12 = (Class9809) Reflector.call(var1.getItem(), Reflector.field42913);
            var12.method38685(var1, var2, var4, var5, var6, var7);
         }

         var4.pop();
      }
   }

   public static Class5422 method782(Class7733 var0, RenderType var1, boolean var2, boolean var3) {
      if (Shaders.isShadowPass) {
         var3 = false;
      }

      if (Class8564.method30596()) {
         var3 = false;
      }

      return !var3
         ? var0.method25597(var1)
         : Class7802.method26050(var0.method25597(!var2 ? RenderType.method14332() : RenderType.method14331()), var0.method25597(var1));
   }

   public static Class5422 method783(Class7733 var0, RenderType var1, Class8892 var2) {
      return Class7802.method26050(new Class5427(var0.method25597(RenderType.method14334()), var2.getMatrix(), var2.method32362()), var0.method25597(var1));
   }

   public static Class5422 method784(Class7733 var0, RenderType var1, Class8892 var2) {
      return Class7802.method26050(new Class5427(var0.method25597(RenderType.method14335()), var2.getMatrix(), var2.method32362()), var0.method25597(var1));
   }

   public static Class5422 method785(Class7733 var0, RenderType var1, boolean var2, boolean var3) {
      if (Shaders.isShadowPass) {
         var3 = false;
      }

      if (Class8564.method30596()) {
         var3 = false;
      }

      if (!var3) {
         return var0.method25597(var1);
      } else {
         return Minecraft.isFabulousGraphicsEnabled() && var1 == Class8624.method30908()
            ? Class7802.method26050(var0.method25597(RenderType.method14333()), var0.method25597(var1))
            : Class7802.method26050(var0.method25597(!var2 ? RenderType.method14336() : RenderType.method14334()), var0.method25597(var1));
      }
   }

   public static Class5422 method786(Class7733 var0, RenderType var1, boolean var2, boolean var3) {
      if (Shaders.isShadowPass) {
         var3 = false;
      }

      if (Class8564.method30596()) {
         var3 = false;
      }

      return !var3
         ? var0.method25597(var1)
         : Class7802.method26050(var0.method25597(!var2 ? RenderType.method14337() : RenderType.method14335()), var0.method25597(var1));
   }

   private void method787(MatrixStack var1, Class5422 var2, List<Class8557> var3, ItemStack var4, int var5, int var6) {
      boolean var9 = !var4.isEmpty();
      Class8892 var10 = var1.getLast();
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
         if (!Reflector.field42864.method20245()) {
            var2.method17036(var10, var14, var16, var17, var18, var5, var6);
         } else {
            var2.method17021(var10, var14, var16, var17, var18, var5, var6, true);
         }
      }
   }

   public IBakedModel method788(ItemStack var1, World var2, LivingEntity var3) {
      Item var6 = var1.getItem();
      IBakedModel var7;
      if (var6 != Items.field38144) {
         var7 = this.field848.method29492(var1);
      } else {
         var7 = this.field848.method29496().method1023(new Class1997("minecraft:trident_in_hand#inventory"));
      }

      ClientWorld var8 = !(var2 instanceof ClientWorld) ? null : (ClientWorld)var2;
      Class6391.field27977 = null;
      IBakedModel var9 = var7.method22626().method19424(var7, var1, var8, var3);
      if (Config.method26953()) {
         var9 = Class7992.method27268(var1, var9, Class6391.field27977, true);
      }

      return var9 != null ? var9 : this.field848.method29496().getMissingModel();
   }

   public void method789(ItemStack var1, Class2327 var2, int var3, int var4, MatrixStack var5, Class7733 var6) {
      this.method790((LivingEntity)null, var1, var2, false, var5, var6, (World)null, var3, var4);
   }

   public void method790(LivingEntity var1, ItemStack var2, Class2327 var3, boolean var4, MatrixStack var5, Class7733 var6, World var7, int var8, int var9) {
      if (!var2.isEmpty()) {
         IBakedModel var12 = this.method788(var2, var7, var1);
         this.method781(var2, var3, var4, var5, var6, var8, var9, var12);
      }
   }

   public void method791(ItemStack var1, int var2, int var3) {
      this.method792(var1, var2, var3, this.method788(var1, (World)null, (LivingEntity)null));
   }

   public void method792(ItemStack var1, int var2, int var3, IBakedModel var4) {
      field852 = true;
      RenderSystem.pushMatrix();
      this.field849.bindTexture(AtlasTexture.LOCATION_BLOCKS_TEXTURE);
      this.field849.getTexture(AtlasTexture.LOCATION_BLOCKS_TEXTURE).method1130(false, false);
      RenderSystem.enableRescaleNormal();
      RenderSystem.enableAlphaTest();
      RenderSystem.method27939();
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.field15997, DestFactor.field12932);
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      RenderSystem.translatef((float)var2, (float)var3, 100.0F + this.field847);
      RenderSystem.translatef(8.0F, 8.0F, 0.0F);
      RenderSystem.scalef(1.0F, -1.0F, 1.0F);
      RenderSystem.scalef(16.0F, 16.0F, 16.0F);
      MatrixStack var7 = new MatrixStack();
      Class7735 var8 = Minecraft.getInstance().getRenderTypeBuffers().method26536();
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

      RenderSystem.disableAlphaTest();
      RenderSystem.method27868();
      RenderSystem.popMatrix();
      field852 = false;
   }

   public void method793(ItemStack var1, int var2, int var3) {
      this.method796(Minecraft.getInstance().player, var1, var2, var3);
   }

   public void method794(ItemStack var1, int var2, int var3) {
      this.method796((LivingEntity)null, var1, var2, var3);
   }

   public void method795(LivingEntity var1, ItemStack var2, int var3, int var4) {
      this.method796(var1, var2, var3, var4);
   }

   private void method796(LivingEntity var1, ItemStack var2, int var3, int var4) {
      if (!var2.isEmpty()) {
         this.field847 += 50.0F;

         try {
            this.method792(var2, var3, var4, this.method788(var2, (World)null, var1));
         } catch (Throwable var10) {
            CrashReport var8 = CrashReport.makeCrashReport(var10, "Rendering item");
            CrashReportCategory var9 = var8.makeCategory("Item being rendered");
            var9.addDetail("Item Type", () -> String.valueOf(var2.getItem()));
            var9.addDetail("Registry Name", () -> String.valueOf(Reflector.call(var2.getItem(), Reflector.field42938)));
            var9.addDetail("Item Damage", () -> String.valueOf(var2.method32117()));
            var9.addDetail("Item NBT", () -> String.valueOf(var2.method32142()));
            var9.addDetail("Item Foil", () -> String.valueOf(var2.method32159()));
            throw new ReportedException(var8);
         }

         this.field847 -= 50.0F;
      }
   }

   public void method797(FontRenderer var1, ItemStack var2, int var3, int var4) {
      this.method798(var1, var2, var3, var4, (String)null);
   }

   public void method798(FontRenderer var1, ItemStack var2, int var3, int var4, String var5) {
      if (!var2.isEmpty()) {
         MatrixStack var8 = new MatrixStack();
         if (var2.getCount() != 1 || var5 != null) {
            String var9 = var5 != null ? var5 : String.valueOf(var2.getCount());
            var8.translate(0.0, 0.0, (double)(this.field847 + 200.0F));
            Class7735 var10 = Class7733.method25595(Tessellator.getInstance().getBuffer());
            var1.method38810(
               var9,
               (float)(var3 + 19 - 2 - var1.getStringWidth(var9)),
               (float)(var4 + 6 + 3),
               16777215,
               true,
               var8.getLast().getMatrix(),
               var10,
               false,
               0,
               15728880
            );
            var10.method25602();
         }

         if (Class9561.method37046(var2)) {
            RenderSystem.disableDepthTest();
            RenderSystem.disableTexture();
            RenderSystem.disableAlphaTest();
            RenderSystem.disableBlend();
            Tessellator var19 = Tessellator.getInstance();
            BufferBuilder var21 = var19.getBuffer();
            float var11 = (float)var2.method32117();
            float var12 = (float)var2.method32119();
            float var13 = Math.max(0.0F, (var12 - var11) / var12);
            int var14 = Math.round(13.0F - var11 * 13.0F / var12);
            int var15 = MathHelper.method37818(var13 / 3.0F, 1.0F, 1.0F);
            if (Reflector.field42910.exists() && Reflector.field42914.exists()) {
               double var16 = Reflector.method35068(var2.getItem(), Reflector.field42910, var2);
               int var18 = Reflector.method35065(var2.getItem(), Reflector.field42914, var2);
               var14 = Math.round(13.0F - (float)var16 * 13.0F);
               var15 = var18;
            }

            if (Config.method26911()) {
               var15 = Class9680.method37863(var13, var15);
            }

            this.method799(var21, var3 + 2, var4 + 13, 13, 2, 0, 0, 0, 255);
            this.method799(var21, var3 + 2, var4 + 13, var14, 1, var15 >> 16 & 0xFF, var15 >> 8 & 0xFF, var15 & 0xFF, 255);
            RenderSystem.enableBlend();
            RenderSystem.enableAlphaTest();
            RenderSystem.enableTexture();
            RenderSystem.enableDepthTest();
         }

         ClientPlayerEntity var20 = Minecraft.getInstance().player;
         float var22 = var20 != null ? var20.method2976().method19636(var2.getItem(), Minecraft.getInstance().getRenderPartialTicks()) : 0.0F;
         if (var22 > 0.0F) {
            RenderSystem.disableDepthTest();
            RenderSystem.disableTexture();
            RenderSystem.enableBlend();
            RenderSystem.defaultBlendFunc();
            Tessellator var23 = Tessellator.getInstance();
            BufferBuilder var24 = var23.getBuffer();
            this.method799(var24, var3, var4 + MathHelper.method37767(16.0F * (1.0F - var22)), 16, MathHelper.ceil(16.0F * var22), 255, 255, 255, 127);
            RenderSystem.enableTexture();
            RenderSystem.enableDepthTest();
         }
      }
   }

   private void method799(BufferBuilder var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      var1.begin(7, DefaultVertexFormats.POSITION_COLOR);
      var1.pos((double)(var2 + 0), (double)(var3 + 0), 0.0).color(var6, var7, var8, var9).endVertex();
      var1.pos((double)(var2 + 0), (double)(var3 + var5), 0.0).color(var6, var7, var8, var9).endVertex();
      var1.pos((double)(var2 + var4), (double)(var3 + var5), 0.0).color(var6, var7, var8, var9).endVertex();
      var1.pos((double)(var2 + var4), (double)(var3 + 0), 0.0).color(var6, var7, var8, var9).endVertex();
      Tessellator.getInstance().draw();
   }

   @Override
   public void method737(IResourceManager var1) {
      this.field848.method29497();
   }

   public Class1991 method800() {
      return Class1990.field12988;
   }
}
