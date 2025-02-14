package mapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class Class8562 {
   private static final Codec<Double> field38488 = Codec.doubleRange(0.001, 1000.0);
   public static final Codec<Class8562> field38489 = RecordCodecBuilder.create(
      var0 -> var0.group(
               field38488.fieldOf("xz_scale").forGetter(Class8562::method30550),
               field38488.fieldOf("y_scale").forGetter(Class8562::method30551),
               field38488.fieldOf("xz_factor").forGetter(Class8562::method30552),
               field38488.fieldOf("y_factor").forGetter(Class8562::method30553)
            )
            .apply(var0, Class8562::new)
   );
   private final double field38490;
   private final double field38491;
   private final double field38492;
   private final double field38493;

   public Class8562(double var1, double var3, double var5, double var7) {
      this.field38490 = var1;
      this.field38491 = var3;
      this.field38492 = var5;
      this.field38493 = var7;
   }

   public double method30550() {
      return this.field38490;
   }

   public double method30551() {
      return this.field38491;
   }

   public double method30552() {
      return this.field38492;
   }

   public double method30553() {
      return this.field38493;
   }
}
