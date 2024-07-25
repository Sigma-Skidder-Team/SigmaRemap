package remapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class class_3902 {
   public static final Codec<class_3902> field_18965 = RecordCodecBuilder.create(
      var0 -> var0.group(
               class_8461.field_43261.fieldOf("sound").forGetter(var0x -> var0x.field_18964),
               Codec.DOUBLE.fieldOf("tick_chance").forGetter(var0x -> var0x.field_18967)
            )
            .apply(var0, class_3902::new)
   );
   private class_8461 field_18964;
   private double field_18967;

   public class_3902(class_8461 var1, double var2) {
      this.field_18964 = var1;
      this.field_18967 = var2;
   }

   public class_8461 method_18056() {
      return this.field_18964;
   }

   public double method_18054() {
      return this.field_18967;
   }
}
