package remapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class class_5049 {
   private static final Codec<Double> field_26086 = Codec.doubleRange(0.001, 1000.0);
   public static final Codec<class_5049> field_26090 = RecordCodecBuilder.create(
      var0 -> var0.group(
               field_26086.fieldOf("xz_scale").forGetter(class_5049::method_23229),
               field_26086.fieldOf("y_scale").forGetter(class_5049::method_23226),
               field_26086.fieldOf("xz_factor").forGetter(class_5049::method_23227),
               field_26086.fieldOf("y_factor").forGetter(class_5049::method_23228)
            )
            .apply(var0, class_5049::new)
   );
   private final double field_26087;
   private final double field_26085;
   private final double field_26089;
   private final double field_26091;

   public class_5049(double var1, double var3, double var5, double var7) {
      this.field_26087 = var1;
      this.field_26085 = var3;
      this.field_26089 = var5;
      this.field_26091 = var7;
   }

   public double method_23229() {
      return this.field_26087;
   }

   public double method_23226() {
      return this.field_26085;
   }

   public double method_23227() {
      return this.field_26089;
   }

   public double method_23228() {
      return this.field_26091;
   }
}
