package mapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public final class Class9354 {
   public static final MapCodec<Class9354> field43409 = RecordCodecBuilder.mapCodec(
      builder -> builder.group(
               ResourceLocation.field13020.flatXmap(id ->
                               Optional.ofNullable(Class9546.method36971().get(id)).map(DataResult::success).orElseGet(() ->
                                       DataResult.error("Unknown preset: " + id)),
                     preset -> DataResult.success(Class9546.method36970((Class9546) preset))
                  )
                  .fieldOf("preset")
                  .stable()
                  .forGetter(Class9354::method35413),
               Class8611.method30859(Registry.BIOME_KEY).forGetter(Class9354::method35414),
               Codec.LONG.fieldOf("seed").stable().forGetter(Class9354::method35415)
            )
            .apply(builder, builder.stable((a, b, c) -> new Class9354((Class9546) a, b, c)))
   );
   private final Class9546 field43410;
   private final Registry<Biome> field43411;
   private final long field43412;

   public Class9354(Class9546 var1, Registry<Biome> var2, long var3) {
      this.field43410 = var1;
      this.field43411 = var2;
      this.field43412 = var3;
   }

   public Class9546 method35413() {
      return this.field43410;
   }

   public Registry<Biome> method35414() {
      return this.field43411;
   }

   public long method35415() {
      return this.field43412;
   }

   public Class1686 method35416() {
      return this.field43410.method36963(this.field43411, this.field43412);
   }
}
