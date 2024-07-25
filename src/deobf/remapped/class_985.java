package remapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.doubles.DoubleArrayList;
import it.unimi.dsi.fastutil.doubles.DoubleList;
import java.util.List;

public class class_985 {
   private final int field_5017;
   private final DoubleList field_5016;
   public static final Codec<class_985> field_5019 = RecordCodecBuilder.create(
      var0 -> var0.group(
               Codec.INT.fieldOf("firstOctave").forGetter(class_985::method_4295),
               Codec.DOUBLE.listOf().fieldOf("amplitudes").forGetter(class_985::method_4294)
            )
            .apply(var0, class_985::new)
   );

   public class_985(int var1, List<Double> var2) {
      this.field_5017 = var1;
      this.field_5016 = new DoubleArrayList(var2);
   }

   public int method_4295() {
      return this.field_5017;
   }

   public DoubleList method_4294() {
      return this.field_5016;
   }
}
