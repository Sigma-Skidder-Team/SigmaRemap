package remapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class class_946 implements class_6157 {
   public static final Codec<class_946> field_4845 = RecordCodecBuilder.create(
      var0 -> var0.group(
               class_2522.field_12489.fieldOf("contents").forGetter(var0x -> var0x.field_4841),
               class_2522.field_12489.fieldOf("rim").forGetter(var0x -> var0x.field_4842),
               class_3461.method_15933(0, 8, 8).fieldOf("size").forGetter(var0x -> var0x.field_4846),
               class_3461.method_15933(0, 8, 8).fieldOf("rim_size").forGetter(var0x -> var0x.field_4844)
            )
            .apply(var0, class_946::new)
   );
   private final class_2522 field_4841;
   private final class_2522 field_4842;
   private final class_3461 field_4846;
   private final class_3461 field_4844;

   public class_946(class_2522 var1, class_2522 var2, class_3461 var3, class_3461 var4) {
      this.field_4841 = var1;
      this.field_4842 = var2;
      this.field_4846 = var3;
      this.field_4844 = var4;
   }

   public class_2522 method_4135() {
      return this.field_4841;
   }

   public class_2522 method_4136() {
      return this.field_4842;
   }

   public class_3461 method_4138() {
      return this.field_4846;
   }

   public class_3461 method_4139() {
      return this.field_4844;
   }
}
