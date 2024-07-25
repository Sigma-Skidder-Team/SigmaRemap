package remapped;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Supplier;

public class class_3925 extends class_3498 {
   public static final Codec<class_3925> field_19065 = RecordCodecBuilder.create(
      var0 -> var0.group(
               Codec.LONG.fieldOf("seed").stable().forGetter(var0x -> var0x.field_19066),
               Codec.BOOL.optionalFieldOf("legacy_biome_init_layer", false, Lifecycle.stable()).forGetter(var0x -> var0x.field_19067),
               Codec.BOOL.fieldOf("large_biomes").orElse(false).stable().forGetter(var0x -> var0x.field_19070),
               class_5203.<class_6325>method_23878(class_8669.field_44359).forGetter(var0x -> var0x.field_19064)
            )
            .apply(var0, var0.stable(class_3925::new))
   );
   private final class_1838 field_19069;
   private static final List<class_5621<class_6325>> field_19068 = ImmutableList.of(
      class_8606.field_44104,
      class_8606.field_44136,
      class_8606.field_44094,
      class_8606.field_44074,
      class_8606.field_44076,
      class_8606.field_44138,
      class_8606.field_44089,
      class_8606.field_44139,
      class_8606.field_44137,
      class_8606.field_44082,
      class_8606.field_44142,
      class_8606.field_44070,
      new class_5621[]{
         class_8606.field_44072,
         class_8606.field_44091,
         class_8606.field_44073,
         class_8606.field_44101,
         class_8606.field_44079,
         class_8606.field_44133,
         class_8606.field_44123,
         class_8606.field_44078,
         class_8606.field_44114,
         class_8606.field_44080,
         class_8606.field_44084,
         class_8606.field_44135,
         class_8606.field_44097,
         class_8606.field_44113,
         class_8606.field_44071,
         class_8606.field_44118,
         class_8606.field_44119,
         class_8606.field_44083,
         class_8606.field_44093,
         class_8606.field_44145,
         class_8606.field_44100,
         class_8606.field_44081,
         class_8606.field_44095,
         class_8606.field_44110,
         class_8606.field_44127,
         class_8606.field_44124,
         class_8606.field_44103,
         class_8606.field_44086,
         class_8606.field_44088,
         class_8606.field_44087,
         class_8606.field_44116,
         class_8606.field_44092,
         class_8606.field_44115,
         class_8606.field_44090,
         class_8606.field_44098,
         class_8606.field_44120,
         class_8606.field_44111,
         class_8606.field_44102,
         class_8606.field_44147,
         class_8606.field_44143,
         class_8606.field_44106,
         class_8606.field_44140,
         class_8606.field_44144,
         class_8606.field_44130,
         class_8606.field_44107,
         class_8606.field_44125,
         class_8606.field_44117,
         class_8606.field_44134,
         class_8606.field_44075,
         class_8606.field_44077,
         class_8606.field_44141,
         class_8606.field_44128,
         class_8606.field_44099,
         class_8606.field_44121
      }
   );
   private final long field_19066;
   private final boolean field_19067;
   private final boolean field_19070;
   private final class_8669<class_6325> field_19064;

   public class_3925(long var1, boolean var3, boolean var4, class_8669<class_6325> var5) {
      super(field_19068.stream().<Supplier<class_6325>>map(var1x -> () -> var5.method_39807((class_5621<class_6325>)var1x)));
      this.field_19066 = var1;
      this.field_19067 = var3;
      this.field_19070 = var4;
      this.field_19064 = var5;
      this.field_19069 = class_7930.method_35855(var1, var3, !var4 ? 4 : 6, 4);
   }

   @Override
   public Codec<? extends class_3498> method_16088() {
      return field_19065;
   }

   @Override
   public class_3498 method_16083(long var1) {
      return new class_3925(var1, this.field_19067, this.field_19070, this.field_19064);
   }

   @Override
   public class_6325 method_28192(int var1, int var2, int var3) {
      return this.field_19069.method_8118(this.field_19064, var1, var3);
   }
}
