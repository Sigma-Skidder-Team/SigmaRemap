package remapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class class_2225 implements class_6157 {
   public static final Codec<class_2225> field_11113 = RecordCodecBuilder.create(
      var0 -> var0.group(
               class_2522.field_12489.fieldOf("to_place").forGetter(var0x -> var0x.field_11117),
               class_2522.field_12489.listOf().fieldOf("place_on").forGetter(var0x -> var0x.field_11114),
               class_2522.field_12489.listOf().fieldOf("place_in").forGetter(var0x -> var0x.field_11116),
               class_2522.field_12489.listOf().fieldOf("place_under").forGetter(var0x -> var0x.field_11112)
            )
            .apply(var0, class_2225::new)
   );
   public final class_2522 field_11117;
   public final List<class_2522> field_11114;
   public final List<class_2522> field_11116;
   public final List<class_2522> field_11112;

   public class_2225(class_2522 var1, List<class_2522> var2, List<class_2522> var3, List<class_2522> var4) {
      this.field_11117 = var1;
      this.field_11114 = var2;
      this.field_11116 = var3;
      this.field_11112 = var4;
   }
}
