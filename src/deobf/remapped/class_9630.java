package remapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.OptionalInt;

public class class_9630 extends class_8294 {
   public static final Codec<class_9630> field_49046 = RecordCodecBuilder.create(
      var0 -> var0.group(
               Codec.intRange(0, 80).fieldOf("limit").orElse(1).forGetter(var0x -> var0x.field_49044),
               Codec.intRange(0, 80).fieldOf("upper_limit").orElse(1).forGetter(var0x -> var0x.field_49047),
               Codec.intRange(0, 16).fieldOf("lower_size").orElse(0).forGetter(var0x -> var0x.field_49045),
               Codec.intRange(0, 16).fieldOf("middle_size").orElse(1).forGetter(var0x -> var0x.field_49049),
               Codec.intRange(0, 16).fieldOf("upper_size").orElse(1).forGetter(var0x -> var0x.field_49048),
               method_38261()
            )
            .apply(var0, class_9630::new)
   );
   private final int field_49044;
   private final int field_49047;
   private final int field_49045;
   private final int field_49049;
   private final int field_49048;

   public class_9630(int var1, int var2, int var3, int var4, int var5, OptionalInt var6) {
      super(var6);
      this.field_49044 = var1;
      this.field_49047 = var2;
      this.field_49045 = var3;
      this.field_49049 = var4;
      this.field_49048 = var5;
   }

   @Override
   public class_2356<?> method_38258() {
      return class_2356.field_11833;
   }

   @Override
   public int method_38262(int var1, int var2) {
      if (var2 >= this.field_49044) {
         return var2 < var1 - this.field_49047 ? this.field_49049 : this.field_49048;
      } else {
         return this.field_49045;
      }
   }
}
