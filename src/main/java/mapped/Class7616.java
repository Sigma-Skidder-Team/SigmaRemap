package mapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.OptionalInt;

public class Class7616 extends Class7617 {
   public static final Codec<Class7616> field32668 = RecordCodecBuilder.create(
      var0 -> var0.group(
               Codec.intRange(0, 81).fieldOf("limit").orElse(1).forGetter(var0x -> var0x.field32669),
               Codec.intRange(0, 16).fieldOf("lower_size").orElse(0).forGetter(var0x -> var0x.field32670),
               Codec.intRange(0, 16).fieldOf("upper_size").orElse(1).forGetter(var0x -> var0x.field32671),
               method24958()
            )
            .apply(var0, Class7616::new)
   );
   private final int field32669;
   private final int field32670;
   private final int field32671;

   public Class7616(int var1, int var2, int var3) {
      this(var1, var2, var3, OptionalInt.empty());
   }

   public Class7616(int var1, int var2, int var3, OptionalInt var4) {
      super(var4);
      this.field32669 = var1;
      this.field32670 = var2;
      this.field32671 = var3;
   }

   @Override
   public Class7646<?> method24952() {
      return Class7646.field32820;
   }

   @Override
   public int method24953(int var1, int var2) {
      return var2 >= this.field32669 ? this.field32671 : this.field32670;
   }
}
