package net.minecraft.client.world;

import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import mapped.*;
import net.minecraft.client.util.Util;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3d;

import javax.annotation.Nullable;

public abstract class DimensionRenderInfo {
   private static final Object2ObjectMap<ResourceLocation, DimensionRenderInfo> field_239208_a_ = Util.make(
      new Object2ObjectArrayMap<>(),      p_239214_0_ -> {
         Overworld dimensionrenderinfo$overworld = new Overworld();
              p_239214_0_.defaultReturnValue(dimensionrenderinfo$overworld);
              p_239214_0_.put(DimensionType.OVERWORLD_ID, dimensionrenderinfo$overworld);
              p_239214_0_.put(DimensionType.THE_NETHER_ID, new Nether());
              p_239214_0_.put(DimensionType.THE_END_ID, new End());
      }
   );
   private final float[] field_239209_b_ = new float[4];
   private final float field_239210_c_;
   private final boolean field_239211_d_;
   private final FogType field_241680_e_;
   private final boolean field_241681_f_;
   private final boolean field_239212_e_;

   public DimensionRenderInfo(float var1, boolean var2, FogType var3, boolean var4, boolean var5) {
      this.field_239210_c_ = var1;
      this.field_239211_d_ = var2;
      this.field_241680_e_ = var3;
      this.field_241681_f_ = var4;
      this.field_239212_e_ = var5;
   }

   public static DimensionRenderInfo func_243495_a(DimensionType p_243495_0_)
   {
      return field_239208_a_.get(p_243495_0_.getEffects());
   }

   @Nullable
   public float[] func_230492_a_(float p_230492_1_, float p_230492_2_) {
      float f = 0.4F;
      float f1 = MathHelper.cos(p_230492_1_ * ((float)Math.PI * 2F)) - 0.0F;
      float f2 = -0.0F;

      if (f1 >= -0.4F && f1 <= 0.4F)
      {
         float f3 = (f1 - -0.0F) / 0.4F * 0.5F + 0.5F;
         float f4 = 1.0F - (1.0F - MathHelper.sin(f3 * (float)Math.PI)) * 0.99F;
         f4 = f4 * f4;
         this.field_239209_b_[0] = f3 * 0.3F + 0.7F;
         this.field_239209_b_[1] = f3 * f3 * 0.7F + 0.2F;
         this.field_239209_b_[2] = f3 * f3 * 0.0F + 0.2F;
         this.field_239209_b_[3] = f4;
         return this.field_239209_b_;
      }
      else
      {
         return null;
      }
   }

   public float method19303() {
      return this.field_239210_c_;
   }

   public boolean method19304() {
      return this.field_239211_d_;
   }

   public abstract Vector3d method19299(Vector3d var1, float var2);

   public abstract boolean method19300(int var1, int var2);

   public FogType method19305() {
      return this.field_241680_e_;
   }

   public boolean method19306() {
      return this.field_241681_f_;
   }

   public boolean method19307() {
      return this.field_239212_e_;
   }

   public static class Overworld extends DimensionRenderInfo {
      public Overworld() {
         super(128.0F, true, FogType.NORMAL, false, false);
      }

      @Override
      public Vector3d method19299(Vector3d var1, float var2) {
         return var1.mul((double)(var2 * 0.94F + 0.06F), (double)(var2 * 0.94F + 0.06F), (double)(var2 * 0.91F + 0.09F));
      }

      @Override
      public boolean method19300(int var1, int var2) {
         return false;
      }
   }

   public static class Nether extends DimensionRenderInfo {
      public Nether() {
         super(Float.NaN, true, FogType.NONE, false, true);
      }

      @Override
      public Vector3d method19299(Vector3d var1, float var2) {
         return var1;
      }

      @Override
      public boolean method19300(int var1, int var2) {
         return true;
      }
   }

   public static class End extends DimensionRenderInfo {
      public End() {
         super(Float.NaN, false, FogType.END, true, false);
      }

      @Override
      public Vector3d method19299(Vector3d var1, float var2) {
         return var1.scale(0.15F);
      }

      @Override
      public boolean method19300(int var1, int var2) {
         return false;
      }

      @Nullable
      @Override
      public float[] func_230492_a_(float var1, float var2) {
         return null;
      }
   }

   public enum FogType {
      NONE,
      NORMAL,
      END
   }
}
