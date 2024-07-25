package remapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.io.File;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.function.Supplier;

public class class_8760 {
   public static final Identifier field_44835 = new Identifier("overworld");
   public static final Identifier field_44849 = new Identifier("the_nether");
   public static final Identifier field_44825 = new Identifier("the_end");
   public static final Codec<class_8760> field_44837 = RecordCodecBuilder.create(
      var0 -> var0.group(
               Codec.LONG
                  .optionalFieldOf("fixed_time")
                  .xmap(
                     var0x -> var0x.<OptionalLong>map(OptionalLong::of).orElseGet(OptionalLong::empty),
                     var0x -> !var0x.isPresent() ? Optional.empty() : Optional.<Long>of(var0x.getAsLong())
                  )
                  .forGetter(var0x -> var0x.field_44844),
               Codec.BOOL.fieldOf("has_skylight").forGetter(class_8760::method_40229),
               Codec.BOOL.fieldOf("has_ceiling").forGetter(class_8760::method_40244),
               Codec.BOOL.fieldOf("ultrawarm").forGetter(class_8760::method_40242),
               Codec.BOOL.fieldOf("natural").forGetter(class_8760::method_40233),
               Codec.doubleRange(1.0E-5F, 3.0E7).fieldOf("coordinate_scale").forGetter(class_8760::method_40223),
               Codec.BOOL.fieldOf("piglin_safe").forGetter(class_8760::method_40227),
               Codec.BOOL.fieldOf("bed_works").forGetter(class_8760::method_40245),
               Codec.BOOL.fieldOf("respawn_anchor_works").forGetter(class_8760::method_40219),
               Codec.BOOL.fieldOf("has_raids").forGetter(class_8760::method_40239),
               Codec.intRange(0, 256).fieldOf("logical_height").forGetter(class_8760::method_40236),
               Identifier.field_22655.fieldOf("infiniburn").forGetter(var0x -> var0x.field_44852),
               Identifier.field_22655.fieldOf("effects").orElse(field_44835).forGetter(var0x -> var0x.field_44827),
               Codec.FLOAT.fieldOf("ambient_light").forGetter(var0x -> var0x.field_44851)
            )
            .apply(var0, class_8760::new)
   );
   public static final float[] field_44830 = new float[]{1.0F, 0.75F, 0.5F, 0.25F, 0.0F, 0.25F, 0.5F, 0.75F};
   public static final class_5621<class_8760> field_44833 = class_5621.<class_8760>method_25497(class_8669.field_44415, new Identifier("overworld"));
   public static final class_5621<class_8760> field_44843 = class_5621.<class_8760>method_25497(class_8669.field_44415, new Identifier("the_nether"));
   public static final class_5621<class_8760> field_44841 = class_5621.<class_8760>method_25497(class_8669.field_44415, new Identifier("the_end"));
   public static final class_8760 field_44823 = new class_8760(
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
      class_1345.field_7344,
      class_2351.field_11749.method_40487(),
      field_44835,
      0.0F
   );
   public static final class_8760 field_44838 = new class_8760(
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
      class_4862.field_24214,
      class_2351.field_11746.method_40487(),
      field_44849,
      0.1F
   );
   public static final class_8760 field_44822 = new class_8760(
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
      class_4862.field_24214,
      class_2351.field_11766.method_40487(),
      field_44825,
      0.0F
   );
   public static final class_5621<class_8760> field_44834 = class_5621.<class_8760>method_25497(class_8669.field_44415, new Identifier("overworld_caves"));
   public static final class_8760 field_44847 = new class_8760(
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
      class_1345.field_7344,
      class_2351.field_11749.method_40487(),
      field_44835,
      0.0F
   );
   public static final Codec<Supplier<class_8760>> field_44831 = class_6833.<Supplier<class_8760>>method_31333(class_8669.field_44415, field_44837);
   private final OptionalLong field_44844;
   private final boolean field_44824;
   private final boolean field_44828;
   private final boolean field_44829;
   private final boolean field_44846;
   private final double field_44845;
   private final boolean field_44839;
   private final boolean field_44826;
   private final boolean field_44821;
   private final boolean field_44836;
   private final boolean field_44832;
   private final int field_44842;
   private final class_6166 field_44840;
   private final Identifier field_44852;
   private final Identifier field_44827;
   private final float field_44851;
   private final transient float[] field_44850;

   public class_8760(
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
      Identifier var13,
      Identifier var14,
      float var15
   ) {
      this(var1, var2, var3, var4, var5, var6, false, var8, var9, var10, var11, var12, class_4862.field_24214, var13, var14, var15);
   }

   public class_8760(
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
      class_6166 var14,
      Identifier var15,
      Identifier var16,
      float var17
   ) {
      this.field_44844 = var1;
      this.field_44824 = var2;
      this.field_44828 = var3;
      this.field_44829 = var4;
      this.field_44846 = var5;
      this.field_44845 = var6;
      this.field_44839 = var8;
      this.field_44826 = var9;
      this.field_44821 = var10;
      this.field_44836 = var11;
      this.field_44832 = var12;
      this.field_44842 = var13;
      this.field_44840 = var14;
      this.field_44852 = var15;
      this.field_44827 = var16;
      this.field_44851 = var17;
      this.field_44850 = method_40234(var17);
   }

   private static float[] method_40234(float var0) {
      float[] var3 = new float[16];

      for (int var4 = 0; var4 <= 15; var4++) {
         float var5 = (float)var4 / 15.0F;
         float var6 = var5 / (4.0F - 3.0F * var5);
         var3[var4] = MathHelper.method_42795(var0, var6, 1.0F);
      }

      return var3;
   }

   @Deprecated
   public static DataResult<class_5621<World>> method_40243(Dynamic<?> var0) {
      Optional var3 = var0.asNumber().result();
      if (var3.isPresent()) {
         int var4 = ((Number)var3.get()).intValue();
         if (var4 == -1) {
            return DataResult.success(World.field_33029);
         }

         if (var4 == 0) {
            return DataResult.success(World.field_33048);
         }

         if (var4 == 1) {
            return DataResult.success(World.field_33038);
         }
      }

      return World.field_33043.parse(var0);
   }

   public static class_7522 method_40235(class_7522 var0) {
      class_6433 var3 = var0.<class_8760>method_28813(class_8669.field_44415);
      var3.<class_8760>method_29381(field_44833, field_44823, Lifecycle.stable());
      var3.<class_8760>method_29381(field_44834, field_44847, Lifecycle.stable());
      var3.<class_8760>method_29381(field_44843, field_44838, Lifecycle.stable());
      var3.<class_8760>method_29381(field_44841, field_44822, Lifecycle.stable());
      return var0;
   }

   private static class_6541 method_40238(class_8669<class_6325> var0, class_8669<class_7902> var1, long var2) {
      return new class_322(new class_8627(var0, var2), var2, () -> var1.method_39807(class_7902.field_40410));
   }

   private static class_6541 method_40220(class_8669<class_6325> var0, class_8669<class_7902> var1, long var2) {
      return new class_322(class_8796.field_45008.method_40438(var0, var2), var2, () -> var1.method_39807(class_7902.field_40413));
   }

   public static class_5383<class_8472> method_40218(class_8669<class_8760> var0, class_8669<class_6325> var1, class_8669<class_7902> var2, long var3) {
      class_5383 var7 = new class_5383<class_8472>(class_8669.field_44420, Lifecycle.experimental());
      var7.<class_8472>method_29381(
         class_8472.field_43413, new class_8472(() -> var0.method_39807(field_44843), method_40220(var1, var2, var3)), Lifecycle.stable()
      );
      var7.<class_8472>method_29381(
         class_8472.field_43410, new class_8472(() -> var0.method_39807(field_44841), method_40238(var1, var2, var3)), Lifecycle.stable()
      );
      return var7;
   }

   public static double method_40232(class_8760 var0, class_8760 var1) {
      double var4 = var0.method_40223();
      double var6 = var1.method_40223();
      return var4 / var6;
   }

   @Deprecated
   public String method_40237() {
      return !this.method_40222(field_44822) ? "" : "_end";
   }

   public static File method_40231(class_5621<World> var0, File var1) {
      if (var0 != World.field_33048) {
         if (var0 != World.field_33038) {
            return var0 != World.field_33029
               ? new File(var1, "dimensions/" + var0.method_25499().method_21461() + "/" + var0.method_25499().method_21456())
               : new File(var1, "DIM-1");
         } else {
            return new File(var1, "DIM1");
         }
      } else {
         return var1;
      }
   }

   public boolean method_40229() {
      return this.field_44824;
   }

   public boolean method_40244() {
      return this.field_44828;
   }

   public boolean method_40242() {
      return this.field_44829;
   }

   public boolean method_40233() {
      return this.field_44846;
   }

   public double method_40223() {
      return this.field_44845;
   }

   public boolean method_40227() {
      return this.field_44826;
   }

   public boolean method_40245() {
      return this.field_44821;
   }

   public boolean method_40219() {
      return this.field_44836;
   }

   public boolean method_40239() {
      return this.field_44832;
   }

   public int method_40236() {
      return this.field_44842;
   }

   public boolean method_40224() {
      return this.field_44839;
   }

   public class_6166 method_40246() {
      return this.field_44840;
   }

   public boolean method_40228() {
      return this.field_44844.isPresent();
   }

   public float method_40230(long var1) {
      double var5 = MathHelper.frac((double)this.field_44844.orElse(var1) / 24000.0 - 0.25);
      double var7 = 0.5 - Math.cos(var5 * Math.PI) / 2.0;
      return (float)(var5 * 2.0 + var7) / 3.0F;
   }

   public int method_40241(long var1) {
      return (int)(var1 / 24000L % 8L + 8L) % 8;
   }

   public float method_40221(int var1) {
      return this.field_44850[var1];
   }

   public class_2307<class_6414> method_40240() {
      class_2307 var3 = class_2351.method_10755().method_43140(this.field_44852);
      return (class_2307<class_6414>)(var3 == null ? class_2351.field_11749 : var3);
   }

   public Identifier method_40226() {
      return this.field_44827;
   }

   public boolean method_40222(class_8760 var1) {
      return this == var1
         ? true
         : this.field_44824 == var1.field_44824
            && this.field_44828 == var1.field_44828
            && this.field_44829 == var1.field_44829
            && this.field_44846 == var1.field_44846
            && this.field_44845 == var1.field_44845
            && this.field_44839 == var1.field_44839
            && this.field_44826 == var1.field_44826
            && this.field_44821 == var1.field_44821
            && this.field_44836 == var1.field_44836
            && this.field_44832 == var1.field_44832
            && this.field_44842 == var1.field_44842
            && Float.compare(var1.field_44851, this.field_44851) == 0
            && this.field_44844.equals(var1.field_44844)
            && this.field_44840.equals(var1.field_44840)
            && this.field_44852.equals(var1.field_44852)
            && this.field_44827.equals(var1.field_44827);
   }
}
