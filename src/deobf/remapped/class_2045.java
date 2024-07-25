package remapped;

import com.mojang.serialization.Codec;

public class class_2045 implements class_6157 {
   public static final Codec<class_2045> field_10354 = class_2522.field_12489.fieldOf("state").xmap(class_2045::new, var0 -> var0.field_10356).codec();
   public final class_2522 field_10356;

   public class_2045(class_2522 var1) {
      this.field_10356 = var1;
   }
}
