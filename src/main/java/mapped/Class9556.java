package mapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class Class9556 {
   public static final Codec<Class9556> field44510 = RecordCodecBuilder.create(
      var0 -> var0.group(
               Codec.intRange(0, 256).fieldOf("height").forGetter(Class9556::method37010),
               Class8562.field38489.fieldOf("sampling").forGetter(Class9556::method37011),
               Class8208.field35242.fieldOf("top_slide").forGetter(Class9556::method37012),
               Class8208.field35242.fieldOf("bottom_slide").forGetter(Class9556::method37013),
               Codec.intRange(1, 4).fieldOf("size_horizontal").forGetter(Class9556::method37014),
               Codec.intRange(1, 4).fieldOf("size_vertical").forGetter(Class9556::method37015),
               Codec.DOUBLE.fieldOf("density_factor").forGetter(Class9556::method37016),
               Codec.DOUBLE.fieldOf("density_offset").forGetter(Class9556::method37017),
               Codec.BOOL.fieldOf("simplex_surface_noise").forGetter(Class9556::method37018),
               Codec.BOOL.optionalFieldOf("random_density_offset", false, Lifecycle.experimental()).forGetter(Class9556::method37019),
               Codec.BOOL.optionalFieldOf("island_noise_override", false, Lifecycle.experimental()).forGetter(Class9556::method37020),
               Codec.BOOL.optionalFieldOf("amplified", false, Lifecycle.experimental()).forGetter(Class9556::method37021)
            )
            .apply(var0, Class9556::new)
   );
   private final int field44511;
   private final Class8562 field44512;
   private final Class8208 field44513;
   private final Class8208 field44514;
   private final int field44515;
   private final int field44516;
   private final double field44517;
   private final double field44518;
   private final boolean field44519;
   private final boolean field44520;
   private final boolean field44521;
   private final boolean field44522;

   public Class9556(
      int var1,
      Class8562 var2,
      Class8208 var3,
      Class8208 var4,
      int var5,
      int var6,
      double var7,
      double var9,
      boolean var11,
      boolean var12,
      boolean var13,
      boolean var14
   ) {
      this.field44511 = var1;
      this.field44512 = var2;
      this.field44513 = var3;
      this.field44514 = var4;
      this.field44515 = var5;
      this.field44516 = var6;
      this.field44517 = var7;
      this.field44518 = var9;
      this.field44519 = var11;
      this.field44520 = var12;
      this.field44521 = var13;
      this.field44522 = var14;
   }

   public int method37010() {
      return this.field44511;
   }

   public Class8562 method37011() {
      return this.field44512;
   }

   public Class8208 method37012() {
      return this.field44513;
   }

   public Class8208 method37013() {
      return this.field44514;
   }

   public int method37014() {
      return this.field44515;
   }

   public int method37015() {
      return this.field44516;
   }

   public double method37016() {
      return this.field44517;
   }

   public double method37017() {
      return this.field44518;
   }

   @Deprecated
   public boolean method37018() {
      return this.field44519;
   }

   @Deprecated
   public boolean method37019() {
      return this.field44520;
   }

   @Deprecated
   public boolean method37020() {
      return this.field44521;
   }

   @Deprecated
   public boolean method37021() {
      return this.field44522;
   }
}
