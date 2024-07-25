package remapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class class_8822 {
   public static final Codec<class_8822> field_45121 = RecordCodecBuilder.create(
      var0 -> var0.group(
               Codec.intRange(0, 256).fieldOf("height").forGetter(class_8822::method_40516),
               class_5049.field_26090.fieldOf("sampling").forGetter(class_8822::method_40517),
               class_3881.field_18890.fieldOf("top_slide").forGetter(class_8822::method_40509),
               class_3881.field_18890.fieldOf("bottom_slide").forGetter(class_8822::method_40513),
               Codec.intRange(1, 4).fieldOf("size_horizontal").forGetter(class_8822::method_40511),
               Codec.intRange(1, 4).fieldOf("size_vertical").forGetter(class_8822::method_40521),
               Codec.DOUBLE.fieldOf("density_factor").forGetter(class_8822::method_40510),
               Codec.DOUBLE.fieldOf("density_offset").forGetter(class_8822::method_40512),
               Codec.BOOL.fieldOf("simplex_surface_noise").forGetter(class_8822::method_40520),
               Codec.BOOL.optionalFieldOf("random_density_offset", false, Lifecycle.experimental()).forGetter(class_8822::method_40519),
               Codec.BOOL.optionalFieldOf("island_noise_override", false, Lifecycle.experimental()).forGetter(class_8822::method_40515),
               Codec.BOOL.optionalFieldOf("amplified", false, Lifecycle.experimental()).forGetter(class_8822::method_40514)
            )
            .apply(var0, class_8822::new)
   );
   private final int field_45115;
   private final class_5049 field_45116;
   private final class_3881 field_45119;
   private final class_3881 field_45120;
   private final int field_45117;
   private final int field_45124;
   private final double field_45112;
   private final double field_45123;
   private final boolean field_45125;
   private final boolean field_45118;
   private final boolean field_45122;
   private final boolean field_45114;

   public class_8822(
      int var1,
      class_5049 var2,
      class_3881 var3,
      class_3881 var4,
      int var5,
      int var6,
      double var7,
      double var9,
      boolean var11,
      boolean var12,
      boolean var13,
      boolean var14
   ) {
      this.field_45115 = var1;
      this.field_45116 = var2;
      this.field_45119 = var3;
      this.field_45120 = var4;
      this.field_45117 = var5;
      this.field_45124 = var6;
      this.field_45112 = var7;
      this.field_45123 = var9;
      this.field_45125 = var11;
      this.field_45118 = var12;
      this.field_45122 = var13;
      this.field_45114 = var14;
   }

   public int method_40516() {
      return this.field_45115;
   }

   public class_5049 method_40517() {
      return this.field_45116;
   }

   public class_3881 method_40509() {
      return this.field_45119;
   }

   public class_3881 method_40513() {
      return this.field_45120;
   }

   public int method_40511() {
      return this.field_45117;
   }

   public int method_40521() {
      return this.field_45124;
   }

   public double method_40510() {
      return this.field_45112;
   }

   public double method_40512() {
      return this.field_45123;
   }

   @Deprecated
   public boolean method_40520() {
      return this.field_45125;
   }

   @Deprecated
   public boolean method_40519() {
      return this.field_45118;
   }

   @Deprecated
   public boolean method_40515() {
      return this.field_45122;
   }

   @Deprecated
   public boolean method_40514() {
      return this.field_45114;
   }
}
