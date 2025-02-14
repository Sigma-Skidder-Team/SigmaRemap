package mapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.doubles.DoubleArrayList;
import it.unimi.dsi.fastutil.doubles.DoubleList;
import java.util.List;

public class Class6813 {
   private final int field29664;
   private final DoubleList field29665;
   public static final Codec<Class6813> field29666 = RecordCodecBuilder.create(
      var0 -> var0.group(
               Codec.INT.fieldOf("firstOctave").forGetter(Class6813::method20760),
               Codec.DOUBLE.listOf().fieldOf("amplitudes").forGetter(Class6813::method20761)
            )
            .apply(var0, Class6813::new)
   );

   public Class6813(int var1, List<Double> var2) {
      this.field29664 = var1;
      this.field29665 = new DoubleArrayList(var2);
   }

   public int method20760() {
      return this.field29664;
   }

   public DoubleList method20761() {
      return this.field29665;
   }
}
