package remapped;

import com.mojang.serialization.Codec;

public class class_8342 implements class_6157 {
   public static final Codec<class_8342> field_42745 = class_7732.field_39221.fieldOf("state_provider").xmap(class_8342::new, var0 -> var0.field_42743).codec();
   public final class_7732 field_42743;

   public class_8342(class_7732 var1) {
      this.field_42743 = var1;
   }
}
