package mapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.OptionalInt;

public class Class7618 extends Class7617 {
   public static final Codec<Class7618> field32674 = RecordCodecBuilder.create(
      var0 -> var0.group(
               Codec.intRange(0, 80).fieldOf("limit").orElse(1).forGetter(var0x -> var0x.field32675),
               Codec.intRange(0, 80).fieldOf("upper_limit").orElse(1).forGetter(var0x -> var0x.field32676),
               Codec.intRange(0, 16).fieldOf("lower_size").orElse(0).forGetter(var0x -> var0x.field32677),
               Codec.intRange(0, 16).fieldOf("middle_size").orElse(1).forGetter(var0x -> var0x.field32678),
               Codec.intRange(0, 16).fieldOf("upper_size").orElse(1).forGetter(var0x -> var0x.field32679),
               method24958()
            )
            .apply(var0, Class7618::new)
   );
   private final int field32675;
   private final int field32676;
   private final int field32677;
   private final int field32678;
   private final int field32679;

   public Class7618(int var1, int var2, int var3, int var4, int var5, OptionalInt var6) {
      super(var6);
      this.field32675 = var1;
      this.field32676 = var2;
      this.field32677 = var3;
      this.field32678 = var4;
      this.field32679 = var5;
   }

   @Override
   public Class7646<?> method24952() {
      return Class7646.field32821;
   }

   @Override
   public int method24953(int var1, int var2) {
      if (var2 >= this.field32675) {
         return var2 < var1 - this.field32676 ? this.field32678 : this.field32679;
      } else {
         return this.field32677;
      }
   }
}
