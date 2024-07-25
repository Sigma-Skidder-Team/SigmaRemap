package remapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class class_1310 {
   public static final MapCodec<class_1310> field_7241 = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
               class_6750.field_34847.fieldOf("precipitation").forGetter(var0x -> var0x.field_7240),
               Codec.FLOAT.fieldOf("temperature").forGetter(var0x -> var0x.field_7239),
               class_101.field_243.optionalFieldOf("temperature_modifier", class_101.field_239).forGetter(var0x -> var0x.field_7237),
               Codec.FLOAT.fieldOf("downfall").forGetter(var0x -> var0x.field_7238)
            )
            .apply(var0, class_1310::new)
   );
   private final class_6750 field_7240;
   private final float field_7239;
   private final class_101 field_7237;
   private final float field_7238;

   private class_1310(class_6750 var1, float var2, class_101 var3, float var4) {
      this.field_7240 = var1;
      this.field_7239 = var2;
      this.field_7237 = var3;
      this.field_7238 = var4;
   }
}
