package remapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class class_3222 extends class_1047 {
   public static final Codec<class_3222> field_16054 = RecordCodecBuilder.create(
      var0 -> var0.group(
               class_8669.field_44400.fieldOf("type").forGetter(var0x -> var0x.field_16053),
               Codec.INT.fieldOf("weight").forGetter(var0x -> var0x.field_5753),
               Codec.INT.fieldOf("minCount").forGetter(var0x -> var0x.field_16055),
               Codec.INT.fieldOf("maxCount").forGetter(var0x -> var0x.field_16056)
            )
            .apply(var0, class_3222::new)
   );
   public final class_6629<?> field_16053;
   public final int field_16055;
   public final int field_16056;

   public class_3222(class_6629<?> var1, int var2, int var3, int var4) {
      super(var2);
      this.field_16053 = var1.method_30476() != class_4565.field_22251 ? var1 : class_6629.field_34252;
      this.field_16055 = var3;
      this.field_16056 = var4;
   }

   @Override
   public String toString() {
      return class_6629.method_30472(this.field_16053) + "*(" + this.field_16055 + "-" + this.field_16056 + "):" + this.field_5753;
   }
}
