package remapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.OptionalInt;

public class class_2318 extends class_8294 {
   public static final Codec<class_2318> field_11610 = RecordCodecBuilder.create(
      var0 -> var0.group(
               Codec.intRange(0, 81).fieldOf("limit").orElse(1).forGetter(var0x -> var0x.field_11614),
               Codec.intRange(0, 16).fieldOf("lower_size").orElse(0).forGetter(var0x -> var0x.field_11611),
               Codec.intRange(0, 16).fieldOf("upper_size").orElse(1).forGetter(var0x -> var0x.field_11612),
               method_38261()
            )
            .apply(var0, class_2318::new)
   );
   private final int field_11614;
   private final int field_11611;
   private final int field_11612;

   public class_2318(int var1, int var2, int var3) {
      this(var1, var2, var3, OptionalInt.empty());
   }

   public class_2318(int var1, int var2, int var3, OptionalInt var4) {
      super(var4);
      this.field_11614 = var1;
      this.field_11611 = var2;
      this.field_11612 = var3;
   }

   @Override
   public class_2356<?> method_38258() {
      return class_2356.field_11831;
   }

   @Override
   public int method_38262(int var1, int var2) {
      return var2 >= this.field_11614 ? this.field_11612 : this.field_11611;
   }
}
