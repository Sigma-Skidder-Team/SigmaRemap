package mapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.io.File;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.function.Supplier;

public class Class9535 {
   public static final ResourceLocation field44366 = new ResourceLocation("overworld");
   public static final ResourceLocation field44367 = new ResourceLocation("the_nether");
   public static final ResourceLocation field44368 = new ResourceLocation("the_end");
   public static final Codec<Class9535> field44369 = RecordCodecBuilder.create(
      var0 -> var0.group(
               Codec.LONG
                  .optionalFieldOf("fixed_time")
                  .xmap(
                     var0x -> var0x.<OptionalLong>map(OptionalLong::of).orElseGet(OptionalLong::empty),
                     var0x -> !var0x.isPresent() ? Optional.empty() : Optional.<Long>of(var0x.getAsLong())
                  )
                  .forGetter(var0x -> var0x.field44380),
               Codec.BOOL.fieldOf("has_skylight").forGetter(Class9535::method36875),
               Codec.BOOL.fieldOf("has_ceiling").forGetter(Class9535::method36876),
               Codec.BOOL.fieldOf("ultrawarm").forGetter(Class9535::method36877),
               Codec.BOOL.fieldOf("natural").forGetter(Class9535::method36878),
               Codec.doubleRange(1.0E-5F, 3.0E7).fieldOf("coordinate_scale").forGetter(Class9535::method36879),
               Codec.BOOL.fieldOf("piglin_safe").forGetter(Class9535::method36880),
               Codec.BOOL.fieldOf("bed_works").forGetter(Class9535::method36881),
               Codec.BOOL.fieldOf("respawn_anchor_works").forGetter(Class9535::method36882),
               Codec.BOOL.fieldOf("has_raids").forGetter(Class9535::method36883),
               Codec.intRange(0, 256).fieldOf("logical_height").forGetter(Class9535::method36884),
               ResourceLocation.field13020.fieldOf("infiniburn").forGetter(var0x -> var0x.field44393),
               ResourceLocation.field13020.fieldOf("effects").orElse(field44366).forGetter(var0x -> var0x.field44394),
               Codec.FLOAT.fieldOf("ambient_light").forGetter(var0x -> var0x.field44395)
            )
            .apply(var0, Class9535::new)
   );
   public static final float[] field44370 = new float[]{1.0F, 0.75F, 0.5F, 0.25F, 0.0F, 0.25F, 0.5F, 0.75F};
   public static final RegistryKey<Class9535> field44371 = RegistryKey.<Class9535>method31395(Registry.field16066, new ResourceLocation("overworld"));
   public static final RegistryKey<Class9535> field44372 = RegistryKey.<Class9535>method31395(Registry.field16066, new ResourceLocation("the_nether"));
   public static final RegistryKey<Class9535> field44373 = RegistryKey.<Class9535>method31395(Registry.field16066, new ResourceLocation("the_end"));
   public static final Class9535 field44374 = new Class9535(
      OptionalLong.empty(),
      true,
      false,
      false,
      true,
      1.0,
      false,
      false,
      true,
      false,
      true,
      256,
      Class1961.field12768,
      Class7645.field32815.method24929(),
      field44366,
      0.0F
   );
   public static final Class9535 field44375 = new Class9535(
      OptionalLong.of(18000L),
      false,
      true,
      true,
      false,
      8.0,
      false,
      true,
      false,
      true,
      false,
      128,
      Class1959.field12765,
      Class7645.field32816.method24929(),
      field44367,
      0.1F
   );
   public static final Class9535 field44376 = new Class9535(
      OptionalLong.of(6000L),
      false,
      false,
      false,
      false,
      1.0,
      true,
      false,
      false,
      false,
      true,
      256,
      Class1959.field12765,
      Class7645.field32817.method24929(),
      field44368,
      0.0F
   );
   public static final RegistryKey<Class9535> field44377 = RegistryKey.<Class9535>method31395(Registry.field16066, new ResourceLocation("overworld_caves"));
   public static final Class9535 field44378 = new Class9535(
      OptionalLong.empty(),
      true,
      true,
      false,
      true,
      1.0,
      false,
      false,
      true,
      false,
      true,
      256,
      Class1961.field12768,
      Class7645.field32815.method24929(),
      field44366,
      0.0F
   );
   public static final Codec<Supplier<Class9535>> field44379 = Class9054.method33671(Registry.field16066, field44369);
   private final OptionalLong field44380;
   private final boolean field44381;
   private final boolean field44382;
   private final boolean field44383;
   private final boolean field44384;
   private final double field44385;
   private final boolean field44386;
   private final boolean field44387;
   private final boolean field44388;
   private final boolean field44389;
   private final boolean field44390;
   private final int field44391;
   private final Class1960 field44392;
   private final ResourceLocation field44393;
   private final ResourceLocation field44394;
   private final float field44395;
   private final transient float[] field44396;

   public Class9535(
      OptionalLong var1,
      boolean var2,
      boolean var3,
      boolean var4,
      boolean var5,
      double var6,
      boolean var8,
      boolean var9,
      boolean var10,
      boolean var11,
      int var12,
      ResourceLocation var13,
      ResourceLocation var14,
      float var15
   ) {
      this(var1, var2, var3, var4, var5, var6, false, var8, var9, var10, var11, var12, Class1959.field12765, var13, var14, var15);
   }

   public Class9535(
      OptionalLong var1,
      boolean var2,
      boolean var3,
      boolean var4,
      boolean var5,
      double var6,
      boolean var8,
      boolean var9,
      boolean var10,
      boolean var11,
      boolean var12,
      int var13,
      Class1960 var14,
      ResourceLocation var15,
      ResourceLocation var16,
      float var17
   ) {
      this.field44380 = var1;
      this.field44381 = var2;
      this.field44382 = var3;
      this.field44383 = var4;
      this.field44384 = var5;
      this.field44385 = var6;
      this.field44386 = var8;
      this.field44387 = var9;
      this.field44388 = var10;
      this.field44389 = var11;
      this.field44390 = var12;
      this.field44391 = var13;
      this.field44392 = var14;
      this.field44393 = var15;
      this.field44394 = var16;
      this.field44395 = var17;
      this.field44396 = method36866(var17);
   }

   private static float[] method36866(float var0) {
      float[] var3 = new float[16];

      for (int var4 = 0; var4 <= 15; var4++) {
         float var5 = (float)var4 / 15.0F;
         float var6 = var5 / (4.0F - 3.0F * var5);
         var3[var4] = MathHelper.method37821(var0, var6, 1.0F);
      }

      return var3;
   }

   @Deprecated
   public static DataResult<RegistryKey<World>> method36867(Dynamic<?> var0) {
      Optional var3 = var0.asNumber().result();
      if (var3.isPresent()) {
         int var4 = ((Number)var3.get()).intValue();
         if (var4 == -1) {
            return DataResult.success(World.field9000);
         }

         if (var4 == 0) {
            return DataResult.success(World.field8999);
         }

         if (var4 == 1) {
            return DataResult.success(World.THE_END);
         }
      }

      return World.field8998.parse(var0);
   }

   public static Class8905 method36868(Class8905 var0) {
      Class2349 var3 = var0.<Class9535>method32453(Registry.field16066);
      var3.<Class9535>method9250(field44371, field44374, Lifecycle.stable());
      var3.<Class9535>method9250(field44377, field44378, Lifecycle.stable());
      var3.<Class9535>method9250(field44372, field44375, Lifecycle.stable());
      var3.<Class9535>method9250(field44373, field44376, Lifecycle.stable());
      return var0;
   }

   private static Class5646 method36869(Registry<Biome> var0, Registry<Class9309> var1, long var2) {
      return new Class5645(new Class1690(var0, var2), var2, () -> var1.method9189(Class9309.field43233));
   }

   private static Class5646 method36870(Registry<Biome> var0, Registry<Class9309> var1, long var2) {
      return new Class5645(Class9546.field44451.method36963(var0, var2), var2, () -> var1.method9189(Class9309.field43232));
   }

   public static Class2350<Class9459> method36871(Registry<Class9535> var0, Registry<Biome> var1, Registry<Class9309> var2, long var3) {
      Class2350 var7 = new Class2350<Class9459>(Registry.field16068, Lifecycle.experimental());
      var7.<Class9459>method9250(Class9459.field43953, new Class9459(() -> var0.method9189(field44372), method36870(var1, var2, var3)), Lifecycle.stable());
      var7.<Class9459>method9250(Class9459.field43954, new Class9459(() -> var0.method9189(field44373), method36869(var1, var2, var3)), Lifecycle.stable());
      return var7;
   }

   public static double method36872(Class9535 var0, Class9535 var1) {
      double var4 = var0.method36879();
      double var6 = var1.method36879();
      return var4 / var6;
   }

   @Deprecated
   public String method36873() {
      return !this.method36893(field44376) ? "" : "_end";
   }

   public static File method36874(RegistryKey<World> var0, File var1) {
      if (var0 != World.field8999) {
         if (var0 != World.THE_END) {
            return var0 != World.field9000
               ? new File(var1, "dimensions/" + var0.method31399().method8293() + "/" + var0.method31399().method8292())
               : new File(var1, "DIM-1");
         } else {
            return new File(var1, "DIM1");
         }
      } else {
         return var1;
      }
   }

   public boolean method36875() {
      return this.field44381;
   }

   public boolean method36876() {
      return this.field44382;
   }

   public boolean method36877() {
      return this.field44383;
   }

   public boolean method36878() {
      return this.field44384;
   }

   public double method36879() {
      return this.field44385;
   }

   public boolean method36880() {
      return this.field44387;
   }

   public boolean method36881() {
      return this.field44388;
   }

   public boolean method36882() {
      return this.field44389;
   }

   public boolean method36883() {
      return this.field44390;
   }

   public int method36884() {
      return this.field44391;
   }

   public boolean method36885() {
      return this.field44386;
   }

   public Class1960 method36886() {
      return this.field44392;
   }

   public boolean method36887() {
      return this.field44380.isPresent();
   }

   public float method36888(long var1) {
      double var5 = MathHelper.method37808((double)this.field44380.orElse(var1) / 24000.0 - 0.25);
      double var7 = 0.5 - Math.cos(var5 * Math.PI) / 2.0;
      return (float)(var5 * 2.0 + var7) / 3.0F;
   }

   public int method36889(long var1) {
      return (int)(var1 / 24000L % 8L + 8L) % 8;
   }

   public float method36890(int var1) {
      return this.field44396[var1];
   }

   public Class7608<Block> method36891() {
      Class7608 var3 = Class7645.method25115().method27135(this.field44393);
      return (Class7608<Block>)(var3 == null ? Class7645.field32815 : var3);
   }

   public ResourceLocation method36892() {
      return this.field44394;
   }

   public boolean method36893(Class9535 var1) {
      return this == var1
         ? true
         : this.field44381 == var1.field44381
            && this.field44382 == var1.field44382
            && this.field44383 == var1.field44383
            && this.field44384 == var1.field44384
            && this.field44385 == var1.field44385
            && this.field44386 == var1.field44386
            && this.field44387 == var1.field44387
            && this.field44388 == var1.field44388
            && this.field44389 == var1.field44389
            && this.field44390 == var1.field44390
            && this.field44391 == var1.field44391
            && Float.compare(var1.field44395, this.field44395) == 0
            && this.field44380.equals(var1.field44380)
            && this.field44392.equals(var1.field44392)
            && this.field44393.equals(var1.field44393)
            && this.field44394.equals(var1.field44394);
   }
}
