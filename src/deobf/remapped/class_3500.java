package remapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Random;

public class class_3500 extends class_2710 {
   public static final Codec<class_3500> field_17164 = RecordCodecBuilder.create(
      var0 -> var0.group(
               class_8669.field_44462.fieldOf("block").forGetter(var0x -> var0x.field_17166),
               Codec.FLOAT.fieldOf("probability").forGetter(var0x -> var0x.field_17163)
            )
            .apply(var0, class_3500::new)
   );
   private final class_6414 field_17166;
   private final float field_17163;

   public class_3500(class_6414 var1, float var2) {
      this.field_17166 = var1;
      this.field_17163 = var2;
   }

   @Override
   public boolean method_12207(class_2522 var1, Random var2) {
      return var1.method_8350(this.field_17166) && var2.nextFloat() < this.field_17163;
   }

   @Override
   public class_7768<?> method_12209() {
      return class_7768.field_39368;
   }
}
