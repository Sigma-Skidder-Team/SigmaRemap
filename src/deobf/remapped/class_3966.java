package remapped;

import com.mojang.serialization.Codec;

public class class_3966 implements class_9793 {
   public static final Codec<class_3966> field_19209 = Codec.INT.fieldOf("chance").xmap(class_3966::new, var0 -> var0.field_19208).codec();
   public final int field_19208;

   public class_3966(int var1) {
      this.field_19208 = var1;
   }
}
