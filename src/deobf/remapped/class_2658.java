package remapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class class_2658 {
   public static final Codec<class_2658> field_13097 = RecordCodecBuilder.create(
      var0 -> var0.group(
               Codec.DOUBLE.fieldOf("energy_budget").forGetter(var0x -> var0x.field_13095),
               Codec.DOUBLE.fieldOf("charge").forGetter(var0x -> var0x.field_13098)
            )
            .apply(var0, class_2658::new)
   );
   private final double field_13095;
   private final double field_13098;

   private class_2658(double var1, double var3) {
      this.field_13095 = var1;
      this.field_13098 = var3;
   }

   public double method_12014() {
      return this.field_13095;
   }

   public double method_12012() {
      return this.field_13098;
   }
}
