package remapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class class_9445 implements class_6157 {
   public static final Codec<class_9445> field_48205 = RecordCodecBuilder.create(
      var0 -> var0.group(
               class_2522.field_12489.fieldOf("target").forGetter(var0x -> var0x.field_48207),
               class_2522.field_12489.fieldOf("state").forGetter(var0x -> var0x.field_48206)
            )
            .apply(var0, class_9445::new)
   );
   public final class_2522 field_48207;
   public final class_2522 field_48206;

   public class_9445(class_2522 var1, class_2522 var2) {
      this.field_48207 = var1;
      this.field_48206 = var2;
   }
}
