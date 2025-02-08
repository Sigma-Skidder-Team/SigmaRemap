package mapped;

import com.google.common.collect.Lists;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.datafixers.util.Pair;
import net.minecraft.client.renderer.texture.NativeImage;
import net.minecraft.client.renderer.texture.TextureUtil;
import net.minecraft.crash.CrashReport;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.crash.ReportedException;
import net.minecraft.util.ResourceLocation;
import net.optifine.Config;
import net.optifine.shaders.Shaders;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class TextureAtlasSprite implements AutoCloseable {
   private final AtlasTexture field9324;
   private final Class9431 field9325;
   private final Class7788 field9326;
   public final NativeImage[] field9327;
   private final int[] field9328;
   private final int[] field9329;
   private final Class1816 field9330;
   private final int field9331;
   private final int field9332;
   private final float field9333;
   private final float field9334;
   private final float field9335;
   private final float field9336;
   private int field9337;
   private int field9338;
   private int field9339 = -1;
   public float field9340;
   public float field9341;
   public int field9342;
   public int field9343;
   public int field9344 = -1;
   public TextureAtlasSprite field9345 = null;
   public boolean field9346 = false;
   public static final String field9347 = ".sprite_single";
   public int field9348 = 0;
   public TextureAtlasSprite field9349 = null;
   public TextureAtlasSprite field9350 = null;
   public boolean field9351 = false;
   public TextureAtlasSprite field9352 = null;
   public boolean field9353 = false;
   private int field9354 = -1;
   private boolean field9355 = false;
   private boolean field9356;
   private boolean field9357;
   private boolean field9358;
   private IResourceManager field9359;

   public TextureAtlasSprite(ResourceLocation var1) {
      this.field9324 = null;
      this.field9325 = new Class9431(var1, 0, 0, (Class7788)null);
      this.field9326 = null;
      this.field9327 = null;
      this.field9328 = new int[0];
      this.field9329 = new int[0];
      this.field9330 = null;
      this.field9331 = 0;
      this.field9332 = 0;
      this.field9333 = 0.0F;
      this.field9334 = 0.0F;
      this.field9335 = 0.0F;
      this.field9336 = 0.0F;
   }

   private TextureAtlasSprite(TextureAtlasSprite var1) {
      this.field9324 = var1.field9324;
      Class9431 var4 = var1.field9325;
      ResourceLocation var5 = var4.method36195();
      ResourceLocation var6 = new ResourceLocation(var5.getNamespace(), var5.getPath() + ".sprite_single");
      int var7 = var4.method36196();
      int var8 = var4.method36197();
      Class7788 var9 = var4.method36200();
      this.field9325 = new Class9431(var6, var7, var8, var9);
      this.field9326 = var1.field9326;
      this.field9327 = var1.field9327;
      this.field9328 = var1.field9328;
      this.field9329 = var1.field9329;
      this.field9330 = var1.field9330;
      this.field9331 = 0;
      this.field9332 = 0;
      this.field9333 = 0.0F;
      this.field9334 = 1.0F;
      this.field9335 = 0.0F;
      this.field9336 = 1.0F;
      this.field9337 = var1.field9337;
      this.field9338 = var1.field9338;
      this.field9339 = var1.field9339;
      this.field9340 = var1.field9340;
      this.field9341 = var1.field9341;
      this.field9342 = var1.field9342;
      this.field9343 = var1.field9343;
      this.field9346 = true;
      this.field9348 = var1.field9348;
      this.field9354 = var1.field9354;
      this.field9355 = var1.field9355;
   }

   public TextureAtlasSprite(AtlasTexture var1, Class9431 var2, int var3, int var4, int var5, int var6, int var7, NativeImage var8) {
      this.field9324 = var1;
      Class7788 var11 = Class9431.method36203(var2);
      int var12 = Class9431.method36204(var2);
      int var13 = Class9431.method36205(var2);
      this.field9331 = var6;
      this.field9332 = var7;
      this.field9333 = (float)var6 / (float)var4;
      this.field9334 = (float)(var6 + var12) / (float)var4;
      this.field9335 = (float)var7 / (float)var5;
      this.field9336 = (float)(var7 + var13) / (float)var5;
      if (Class9431.method36206(var2) > 1.0) {
         int var14 = (int)Math.round((double)var8.method7886() * Class9431.method36206(var2));
         NativeImage var15 = Class8684.method31279(var8, var14);
         if (var15 != var8) {
            var8.close();
            var8 = var15;
         }
      }

      if (!this.field9351 && !var2.method36195().getPath().endsWith("_leaves")) {
         this.method7480(var8);
      }

      NativeImage var24 = var8;
      int var25 = var8.method7886() / var11.method25811(var12);
      int var16 = var8.method7887() / var11.method25810(var13);
      if (var11.method25812() > 0) {
         int var17 = var11.method25818().stream().max(Integer::compareTo).get() + 1;
         this.field9328 = new int[var17];
         this.field9329 = new int[var17];
         Arrays.fill(this.field9328, -1);
         Arrays.fill(this.field9329, -1);

         for (int var19 : var11.method25818()) {
            if (var19 >= var25 * var16) {
               throw new RuntimeException("invalid frameindex " + var19);
            }

            int var20 = var19 / var25;
            int var21 = var19 % var25;
            this.field9328[var19] = var21;
            this.field9329[var19] = var20;
         }
      } else {
         ArrayList var26 = Lists.newArrayList();
         int var27 = var25 * var16;
         this.field9328 = new int[var27];
         this.field9329 = new int[var27];

         for (int var30 = 0; var30 < var16; var30++) {
            for (int var33 = 0; var33 < var25; var33++) {
               int var34 = var30 * var25 + var33;
               this.field9328[var34] = var33;
               this.field9329[var34] = var30;
               var26.add(new Class9704(var34, -1));
            }
         }

         var11 = new Class7788(var26, var12, var13, var11.method25813(), var11.method25814());
      }

      this.field9325 = new Class9431(Class9431.method36207(var2), var12, var13, var11);
      this.field9326 = var11;

      try {
         try {
            this.field9327 = Class6977.method21536(var8, var3);
         } catch (Throwable var22) {
            CrashReport var29 = CrashReport.makeCrashReport(var22, "Generating mipmaps for frame");
            CrashReportCategory var32 = var29.makeCategory("Frame being iterated");
            var32.addDetail("First frame", () -> {
               StringBuilder var3x = new StringBuilder();
               if (var3x.length() > 0) {
                  var3x.append(", ");
               }

               var3x.append(var24.method7886()).append("x").append(var24.method7887());
               return var3x.toString();
            });
            throw new ReportedException(var29);
         }
      } catch (Throwable var23) {
         CrashReport var28 = CrashReport.makeCrashReport(var23, "Applying mipmap");
         CrashReportCategory var31 = var28.makeCategory("Sprite being mipmapped");
         var31.addDetail("Sprite name", () -> this.method7465().toString());
         var31.addDetail("Sprite size", () -> this.method7457() + " x " + this.method7458());
         var31.addDetail("Sprite frames", () -> this.method7467() + " frames");
         var31.addDetail("Mipmap levels", var3);
         throw new ReportedException(var28);
      }

      if (var11.method25814()) {
         this.field9330 = new Class1816(this, var2, var3);
      } else {
         this.field9330 = null;
      }

      this.field9348 = var3;
      this.field9340 = Math.min(this.field9333, this.field9334);
      this.field9341 = Math.min(this.field9335, this.field9336);
      this.field9342 = var4;
      this.field9343 = var5;
   }

   private void method7455(int var1) {
      int var4 = this.field9328[var1] * Class9431.method36204(this.field9325);
      int var5 = this.field9329[var1] * Class9431.method36205(this.field9325);
      this.method7456(var4, var5, this.field9327);
   }

   private void method7456(int var1, int var2, NativeImage[] var3) {
      boolean var6 = false;
      boolean var7 = this.field9346;

      for (int var8 = 0; var8 < var3.length && this.method7457() >> var8 > 0 && this.method7458() >> var8 > 0; var8++) {
         var3[var8]
            .method7895(
               var8,
               this.field9331 >> var8,
               this.field9332 >> var8,
               var1 >> var8,
               var2 >> var8,
               Class9431.method36204(this.field9325) >> var8,
               Class9431.method36205(this.field9325) >> var8,
               var6,
               var7,
               var3.length > 1,
               false
            );
      }

      if (this.field9345 != null) {
         this.field9345.method7456(var1, var2, var3);
      }
   }

   public int method7457() {
      return Class9431.method36204(this.field9325);
   }

   public int method7458() {
      return Class9431.method36205(this.field9325);
   }

   public float getMinU() {
      return this.field9333;
   }

   public float getMaxU() {
      return this.field9334;
   }

   public float method7461(double var1) {
      float var5 = this.field9334 - this.field9333;
      return this.field9333 + var5 * (float)var1 / 16.0F;
   }

   public float getMinV() {
      return this.field9335;
   }

   public float getMaxV() {
      return this.field9336;
   }

   public float method7464(double var1) {
      float var5 = this.field9336 - this.field9335;
      return this.field9335 + var5 * (float)var1 / 16.0F;
   }

   public ResourceLocation method7465() {
      return Class9431.method36207(this.field9325);
   }

   public AtlasTexture getAtlasTexture() {
      return this.field9324;
   }

   public int method7467() {
      return this.field9328.length;
   }

   @Override
   public void close() {
      for (NativeImage var6 : this.field9327) {
         if (var6 != null) {
            var6.close();
         }
      }

      if (this.field9330 != null) {
         this.field9330.close();
      }

      if (this.field9345 == null) {
      }

      if (this.field9349 != null) {
         this.field9349.close();
      }

      if (this.field9350 != null) {
         this.field9350.close();
      }
   }

   @Override
   public String toString() {
      int var3 = this.field9328.length;
      return "TextureAtlasSprite{name='"
         + Class9431.method36207(this.field9325)
         + '\''
         + ", frameCount="
         + var3
         + ", x="
         + this.field9331
         + ", y="
         + this.field9332
         + ", height="
         + Class9431.method36205(this.field9325)
         + ", width="
         + Class9431.method36204(this.field9325)
         + ", u0="
         + this.field9333
         + ", u1="
         + this.field9334
         + ", v0="
         + this.field9335
         + ", v1="
         + this.field9336
         + '}';
   }

   public boolean method7468(int var1, int var2, int var3) {
      return (
            this.field9327[0]
                     .method7889(
                        var2 + this.field9328[var1] * Class9431.method36204(this.field9325),
                        var3 + this.field9329[var1] * Class9431.method36205(this.field9325)
                     )
                  >> 24
               & 0xFF
         )
         == 0;
   }

   public void method7469() {
      this.method7455(0);
   }

   private float method7470() {
      float var3 = (float)Class9431.method36204(this.field9325) / (this.field9334 - this.field9333);
      float var4 = (float)Class9431.method36205(this.field9325) / (this.field9336 - this.field9335);
      return Math.max(var4, var3);
   }

   public float getUvShrinkRatio() {
      return 4.0F / this.method7470();
   }

   public void method7472() {
      if (this.field9326 != null) {
         this.field9355 = !SmartAnimations.isActive() ? true : SmartAnimations.method14217(this);
         if (this.field9326.method25812() <= 1) {
            this.field9355 = false;
         }

         this.field9338++;
         if (this.field9338 < this.field9326.method25816(this.field9337)) {
            if (this.field9330 != null) {
               if (!this.field9355) {
                  return;
               }

               if (RenderSystem.isOnRenderThread()) {
                  Class1816.method8061(this.field9330);
               } else {
                  RenderSystem.recordRenderCall(() -> Class1816.method8061(this.field9330));
               }
            }
         } else {
            int var3 = this.field9326.method25817(this.field9337);
            int var4 = this.field9326.method25812() != 0 ? this.field9326.method25812() : this.method7467();
            this.field9337 = (this.field9337 + 1) % var4;
            this.field9338 = 0;
            int var5 = this.field9326.method25817(this.field9337);
            if (!this.field9355) {
               return;
            }

            if (var3 != var5 && var5 >= 0 && var5 < this.method7467()) {
               this.method7455(var5);
            }
         }
      }
   }

   public boolean method7473() {
      return this.field9326.method25812() > 1;
   }

   public IVertexBuilder method7474(IVertexBuilder var1) {
      if (this.method7465() == Class8684.field39209) {
         IRenderTypeBuffer.Impl var4 = var1.method17049();
         if (var4 != null) {
            return var4.method25606();
         }
      }

      return new Class5429(var1, this);
   }

   public int method7475() {
      return this.field9339;
   }

   public void method7476(Class9147 var1) {
      if (this.field9339 < 0) {
         if (this.field9324 != null) {
            TextureAtlasSprite var4 = this.field9324.method1105(this.method7465());
            if (var4 != null) {
               this.field9339 = var4.method7475();
            }
         }

         if (this.field9339 < 0) {
            this.field9339 = var1.method34165();
         }
      }
   }

   public int method7477() {
      return this.field9354;
   }

   public void method7478(int var1) {
      this.field9354 = var1;
      if (this.field9345 != null) {
         this.field9345.method7478(var1);
      }

      if (this.field9349 != null) {
         this.field9349.method7478(var1);
      }

      if (this.field9350 != null) {
         this.field9350.method7478(var1);
      }
   }

   public boolean method7479() {
      return this.field9355;
   }

   private void method7480(NativeImage var1) {
      int[] var4 = new int[var1.method7886() * var1.method7887()];
      var1.method7915().get(var4);
      this.method7481(var4);
      var1.method7915().put(var4);
   }

   private void method7481(int[] var1) {
      if (var1 != null) {
         long var4 = 0L;
         long var6 = 0L;
         long var8 = 0L;
         long var10 = 0L;

         for (int var12 = 0; var12 < var1.length; var12++) {
            int var13 = var1[var12];
            int var14 = var13 >> 24 & 0xFF;
            if (var14 >= 16) {
               int var15 = var13 >> 16 & 0xFF;
               int var16 = var13 >> 8 & 0xFF;
               int var17 = var13 & 0xFF;
               var4 += (long)var15;
               var6 += (long)var16;
               var8 += (long)var17;
               var10++;
            }
         }

         if (var10 > 0L) {
            int var19 = (int)(var4 / var10);
            int var20 = (int)(var6 / var10);
            int var21 = (int)(var8 / var10);
            int var22 = var19 << 16 | var20 << 8 | var21;

            for (int var23 = 0; var23 < var1.length; var23++) {
               int var24 = var1[var23];
               int var18 = var24 >> 24 & 0xFF;
               if (var18 <= 16) {
                  var1[var23] = var22;
               }
            }
         }
      }
   }

   public double method7482(float var1) {
      float var4 = this.field9334 - this.field9333;
      return (double)((var1 - this.field9333) / var4 * 16.0F);
   }

   public double method7483(float var1) {
      float var4 = this.field9336 - this.field9335;
      return (double)((var1 - this.field9335) / var4 * 16.0F);
   }

   public void method7484() {
      if (this.field9344 < 0) {
         this.field9344 = TextureUtil.generateTextureId();
         TextureUtil.method30370(this.field9344, this.field9348, this.method7457(), this.method7458());
         Class8684.method31276();
      }

      Class8684.method31277(this.field9344);
   }

   public void method7485() {
      if (this.field9344 >= 0) {
         TextureUtil.releaseTextureId(this.field9344);
         this.field9344 = -1;
      }
   }

   public float method7486(float var1) {
      var1 -= this.field9340;
      float var4 = (float)this.field9342 / (float)this.method7457();
      return var1 * var4;
   }

   public float method7487(float var1) {
      var1 -= this.field9341;
      float var4 = (float)this.field9343 / (float)this.method7458();
      return var1 * var4;
   }

   public NativeImage[] method7488() {
      return this.field9327;
   }

   public Class7788 method7489() {
      return this.field9326;
   }

   public int method7490() {
      return this.field9331;
   }

   public int method7491() {
      return this.field9332;
   }

   public float method7492(float var1) {
      float var4 = this.field9334 - this.field9333;
      return (var1 - this.field9333) / var4 * 16.0F;
   }

   public float method7493(float var1) {
      float var4 = this.field9336 - this.field9335;
      return (var1 - this.field9335) / var4 * 16.0F;
   }

   public TextureAtlasSprite method7494() {
      TextureAtlasSprite var3 = new TextureAtlasSprite(this);
      var3.field9346 = true;
      return var3;
   }

   public TextureAtlasSprite method7495(String var1, int var2) {
      ResourceLocation var5 = new ResourceLocation(this.method7465().getNamespace(), this.method7465().getPath() + var1);
      ResourceLocation var6 = this.field9324.method1096(var5);
      TextureAtlasSprite var7 = null;
      if (this.field9359.hasResource(var6)) {
         try (IResource var8 = this.field9359.getResource(var6)) {
            IResource var10 = this.field9359.getResource(var6);
            Class7756 var11 = new Class7756(var6.toString(), var10.getInputStream());
            Class7788 var12 = var8.<Class7788>getMetadata(Class7788.field33411);
            if (var12 == null) {
               var12 = Class7788.field33412;
            }

            Pair var13 = var12.method25807(var11.field33321, var11.field33322);
            Class9431 var14 = new Class9431(var5, (Integer)var13.getFirst(), (Integer)var13.getSecond(), var12);
            NativeImage var15 = NativeImage.method7879(var8.getInputStream());
            if (var15.method7886() != this.method7457()) {
               NativeImage var16 = Class8684.method31279(var15, this.method7457());
               if (var16 != var15) {
                  double var17 = 1.0 * (double)this.method7457() / (double)var15.method7886();
                  var15.close();
                  var15 = var16;
                  var14 = new Class9431(
                     var5, (int)((double)((Integer)var13.getFirst()).intValue() * var17), (int)((double)((Integer)var13.getSecond()).intValue() * var17), var12
                  );
               }
            }

            var7 = new TextureAtlasSprite(this.field9324, var14, this.field9348, this.field9342, this.field9343, this.field9331, this.field9332, var15);
         } catch (IOException var29) {
         }
      }

      if (var7 == null) {
         NativeImage var30 = new NativeImage(this.method7457(), this.method7458(), false);
         int var31 = Class8684.method31291(var2);
         var30.method7904(0, 0, var30.method7886(), var30.method7887(), var31);
         Class9431 var32 = new Class9431(var5, this.method7457(), this.method7458(), Class7788.field33412);
         var7 = new TextureAtlasSprite(this.field9324, var32, this.field9348, this.field9342, this.field9343, this.field9331, this.field9332, var30);
      }

      var7.field9351 = true;
      return var7;
   }

   public boolean method7496() {
      return this.field9356;
   }

   private void method7497(boolean var1) {
      this.field9356 = var1;
      this.field9358 = false;
      this.field9357 = false;
      if (this.field9345 != null) {
         this.field9345.method7485();
         this.field9345 = null;
      }

      if (this.field9349 != null) {
         this.field9349.close();
         this.field9349 = null;
      }

      if (this.field9350 != null) {
         this.field9350.close();
         this.field9350 = null;
      }

      this.field9358 = Config.method26894();
      this.field9357 = Config.isShaders();
      if (this.field9358 && !this.field9346) {
         this.field9345 = this.method7494();
      }

      if (this.field9357 && !this.field9346) {
         if (this.field9349 == null && Shaders.field40874) {
            this.field9349 = this.method7495("_n", -8421377);
         }

         if (this.field9350 == null && Shaders.field40875) {
            this.field9350 = this.method7495("_s", 0);
         }
      }
   }

   public void method7498(IResourceManager var1) {
      this.field9359 = var1;
      this.method7476(this.field9324.method1122());
      this.method7497(this.field9324.method1121());
   }

   public int method7499(int var1, int var2, int var3) {
      return this.field9327[0].method7889(var2 + this.field9328[var1] * this.method7457(), var3 + this.field9329[var1] * this.method7458());
   }

   // $VF: synthetic method
   public static int method7505(TextureAtlasSprite var0) {
      return var0.field9338;
   }

   // $VF: synthetic method
   public static int method7506(TextureAtlasSprite var0) {
      return var0.field9337;
   }

   // $VF: synthetic method
   public static Class7788 method7507(TextureAtlasSprite var0) {
      return var0.field9326;
   }

   // $VF: synthetic method
   public static Class9431 method7508(TextureAtlasSprite var0) {
      return var0.field9325;
   }

   // $VF: synthetic method
   public static void method7509(TextureAtlasSprite var0, int var1, int var2, NativeImage[] var3) {
      var0.method7456(var1, var2, var3);
   }

   // $VF: synthetic method
   public static int[] method7510(TextureAtlasSprite var0) {
      return var0.field9328;
   }

   // $VF: synthetic method
   public static int[] method7511(TextureAtlasSprite var0) {
      return var0.field9329;
   }
}
