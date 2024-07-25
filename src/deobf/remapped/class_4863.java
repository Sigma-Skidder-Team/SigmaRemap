package remapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Random;

public class class_4863 extends class_2710 {
   public static final Codec<class_4863> field_24218 = RecordCodecBuilder.create(
      var0 -> var0.group(
               class_2522.field_12489.fieldOf("block_state").forGetter(var0x -> var0x.field_24216),
               Codec.FLOAT.fieldOf("probability").forGetter(var0x -> var0x.field_24219)
            )
            .apply(var0, class_4863::new)
   );
   private final class_2522 field_24216;
   private final float field_24219;

   public class_4863(class_2522 var1, float var2) {
      this.field_24216 = var1;
      this.field_24219 = var2;
   }

   @Override
   public boolean method_12207(class_2522 var1, Random var2) {
      return var1 == this.field_24216 && var2.nextFloat() < this.field_24219;
   }

   @Override
   public class_7768<?> method_12209() {
      return class_7768.field_39369;
   }
}
