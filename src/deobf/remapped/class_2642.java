package remapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Random;
import java.util.function.Supplier;

public class class_2642 {
   public static final Codec<class_2642> field_13018 = RecordCodecBuilder.create(
      var0 -> var0.group(
               class_5927.field_30061.fieldOf("feature").forGetter(var0x -> var0x.field_13015),
               Codec.floatRange(0.0F, 1.0F).fieldOf("chance").forGetter(var0x -> var0x.field_13017)
            )
            .apply(var0, class_2642::new)
   );
   public final Supplier<class_5927<?, ?>> field_13015;
   public final float field_13017;

   public class_2642(class_5927<?, ?> var1, float var2) {
      this(() -> var1, var2);
   }

   private class_2642(Supplier<class_5927<?, ?>> var1, float var2) {
      this.field_13015 = var1;
      this.field_13017 = var2;
   }

   public boolean method_11949(class_700 var1, class_6541 var2, Random var3, class_1331 var4) {
      return this.field_13015.get().method_27104(var1, var2, var3, var4);
   }
}
