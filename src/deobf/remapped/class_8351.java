package remapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class class_8351 implements class_6157 {
   public static final Codec<class_8351> field_42762 = RecordCodecBuilder.create(
      var0 -> var0.group(
               class_2522.field_12489.fieldOf("state").forGetter(var0x -> var0x.field_42763),
               class_3461.method_15933(0, 4, 4).fieldOf("radius").forGetter(var0x -> var0x.field_42764),
               Codec.intRange(0, 4).fieldOf("half_height").forGetter(var0x -> var0x.field_42766),
               class_2522.field_12489.listOf().fieldOf("targets").forGetter(var0x -> var0x.field_42761)
            )
            .apply(var0, class_8351::new)
   );
   public final class_2522 field_42763;
   public final class_3461 field_42764;
   public final int field_42766;
   public final List<class_2522> field_42761;

   public class_8351(class_2522 var1, class_3461 var2, int var3, List<class_2522> var4) {
      this.field_42763 = var1;
      this.field_42764 = var2;
      this.field_42766 = var3;
      this.field_42761 = var4;
   }
}
