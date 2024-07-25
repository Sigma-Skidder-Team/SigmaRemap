package remapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class class_5194 implements class_4139 {
   public static final Codec<class_5194> field_26714 = RecordCodecBuilder.create(
      var0 -> var0.group(
               class_2522.field_12489.fieldOf("top_material").forGetter(var0x -> var0x.field_26715),
               class_2522.field_12489.fieldOf("under_material").forGetter(var0x -> var0x.field_26712),
               class_2522.field_12489.fieldOf("underwater_material").forGetter(var0x -> var0x.field_26711)
            )
            .apply(var0, class_5194::new)
   );
   private final class_2522 field_26715;
   private final class_2522 field_26712;
   private final class_2522 field_26711;

   public class_5194(class_2522 var1, class_2522 var2, class_2522 var3) {
      this.field_26715 = var1;
      this.field_26712 = var2;
      this.field_26711 = var3;
   }

   @Override
   public class_2522 method_19215() {
      return this.field_26715;
   }

   @Override
   public class_2522 method_19216() {
      return this.field_26712;
   }

   public class_2522 method_23858() {
      return this.field_26711;
   }
}
