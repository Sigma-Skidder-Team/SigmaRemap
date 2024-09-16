package mapped;

import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import net.minecraft.client.util.Util;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3d;

import javax.annotation.Nullable;

public abstract class Class6349 {
   private static final Object2ObjectMap<ResourceLocation, Class6349> field27884 = Util.<Object2ObjectMap<ResourceLocation, Class6349>>make(
      new Object2ObjectArrayMap(), var0 -> {
         Class6348 var3 = new Class6348();
         var0.defaultReturnValue(var3);
         var0.put(DimensionType.OVERWORLD_ID, var3);
         var0.put(DimensionType.THE_NETHER_ID, new Class6350());
         var0.put(DimensionType.THE_END_ID, new Class6351());
      }
   );
   private final float[] field27885 = new float[4];
   private final float field27886;
   private final boolean field27887;
   private final Class2078 field27888;
   private final boolean field27889;
   private final boolean field27890;

   public Class6349(float var1, boolean var2, Class2078 var3, boolean var4, boolean var5) {
      this.field27886 = var1;
      this.field27887 = var2;
      this.field27888 = var3;
      this.field27889 = var4;
      this.field27890 = var5;
   }

   public static Class6349 method19301(DimensionType var0) {
      return (Class6349)field27884.get(var0.getEffects());
   }

   @Nullable
   public float[] method19302(float var1, float var2) {
      float var5 = 0.4F;
      float var6 = MathHelper.cos(var1 * (float) (Math.PI * 2)) - 0.0F;
      float var7 = -0.0F;
      if (var6 >= -0.4F && var6 <= 0.4F) {
         float var8 = (var6 - -0.0F) / 0.4F * 0.5F + 0.5F;
         float var9 = 1.0F - (1.0F - MathHelper.sin(var8 * (float) Math.PI)) * 0.99F;
         var9 *= var9;
         this.field27885[0] = var8 * 0.3F + 0.7F;
         this.field27885[1] = var8 * var8 * 0.7F + 0.2F;
         this.field27885[2] = var8 * var8 * 0.0F + 0.2F;
         this.field27885[3] = var9;
         return this.field27885;
      } else {
         return null;
      }
   }

   public float method19303() {
      return this.field27886;
   }

   public boolean method19304() {
      return this.field27887;
   }

   public abstract Vector3d method19299(Vector3d var1, float var2);

   public abstract boolean method19300(int var1, int var2);

   public Class2078 method19305() {
      return this.field27888;
   }

   public boolean method19306() {
      return this.field27889;
   }

   public boolean method19307() {
      return this.field27890;
   }
}
