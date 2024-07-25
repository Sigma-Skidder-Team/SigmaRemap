package remapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class class_9253 implements class_6157 {
   public static final Codec<class_9253> field_47234 = RecordCodecBuilder.create(
      var0 -> var0.group(
               class_2710.field_13257.fieldOf("target").forGetter(var0x -> var0x.field_47233),
               class_2522.field_12489.fieldOf("state").forGetter(var0x -> var0x.field_47237),
               Codec.intRange(0, 64).fieldOf("size").forGetter(var0x -> var0x.field_47236)
            )
            .apply(var0, class_9253::new)
   );
   public final class_2710 field_47233;
   public final int field_47236;
   public final class_2522 field_47237;

   public class_9253(class_2710 var1, class_2522 var2, int var3) {
      this.field_47236 = var3;
      this.field_47237 = var2;
      this.field_47233 = var1;
   }
}
