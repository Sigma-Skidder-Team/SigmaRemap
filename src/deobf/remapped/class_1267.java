package remapped;

import com.mojang.serialization.Codec;

public class class_1267 implements class_6157 {
   public static final Codec<class_1267> field_6970 = class_6593.field_34021.fieldOf("portal_type").xmap(class_1267::new, var0 -> var0.field_6971).codec();
   public final class_6593 field_6971;

   public class_1267(class_6593 var1) {
      this.field_6971 = var1;
   }
}
