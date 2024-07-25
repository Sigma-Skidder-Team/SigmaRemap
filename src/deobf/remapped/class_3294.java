package remapped;

import com.mojang.serialization.Codec;

public class class_3294 implements class_6157 {
   public static final Codec<class_3294> field_16304 = Codec.BOOL.fieldOf("is_beached").orElse(false).xmap(class_3294::new, var0 -> var0.field_16302).codec();
   public final boolean field_16302;

   public class_3294(boolean var1) {
      this.field_16302 = var1;
   }
}
