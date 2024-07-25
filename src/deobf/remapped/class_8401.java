package remapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class class_8401 implements class_6157 {
   public static final Codec<class_8401> field_42980 = RecordCodecBuilder.create(
      var0 -> var0.group(
               class_4161.field_20227.fieldOf("biome_temp").forGetter(var0x -> var0x.field_42983),
               Codec.floatRange(0.0F, 1.0F).fieldOf("large_probability").forGetter(var0x -> var0x.field_42981),
               Codec.floatRange(0.0F, 1.0F).fieldOf("cluster_probability").forGetter(var0x -> var0x.field_42984)
            )
            .apply(var0, class_8401::new)
   );
   public final class_4161 field_42983;
   public final float field_42981;
   public final float field_42984;

   public class_8401(class_4161 var1, float var2, float var3) {
      this.field_42983 = var1;
      this.field_42981 = var2;
      this.field_42984 = var3;
   }
}
