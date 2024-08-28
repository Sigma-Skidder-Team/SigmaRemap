package mapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class Class7763 {
   public static final Codec<Class7763> field33334 = RecordCodecBuilder.create(
      var0 -> var0.group(
               Codec.DOUBLE.fieldOf("energy_budget").forGetter(var0x -> var0x.field33335), Codec.DOUBLE.fieldOf("charge").forGetter(var0x -> var0x.field33336)
            )
            .apply(var0, Class7763::new)
   );
   private final double field33335;
   private final double field33336;

   public Class7763(double var1, double var3) {
      this.field33335 = var1;
      this.field33336 = var3;
   }

   public double method25732() {
      return this.field33335;
   }

   public double method25733() {
      return this.field33336;
   }
}
