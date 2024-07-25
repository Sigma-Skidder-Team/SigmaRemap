package remapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class class_2692 implements class_9793 {
   public static final Codec<class_2692> field_13176 = RecordCodecBuilder.create(
      var0 -> var0.group(
               class_3010.field_14783.fieldOf("outer").forGetter(class_2692::method_12078),
               class_3010.field_14783.fieldOf("inner").forGetter(class_2692::method_12079)
            )
            .apply(var0, class_2692::new)
   );
   private final class_3010<?> field_13178;
   private final class_3010<?> field_13177;

   public class_2692(class_3010<?> var1, class_3010<?> var2) {
      this.field_13178 = var1;
      this.field_13177 = var2;
   }

   public class_3010<?> method_12078() {
      return this.field_13178;
   }

   public class_3010<?> method_12079() {
      return this.field_13177;
   }
}
