package remapped;

import com.mojang.serialization.Codec;
import java.util.Random;
import javax.annotation.Nullable;

public class class_9098 extends class_2103 {
   public static final Codec<class_9098> field_46603 = Codec.FLOAT.fieldOf("integrity").orElse(1.0F).xmap(class_9098::new, var0 -> var0.field_46604).codec();
   private final float field_46604;

   public class_9098(float var1) {
      this.field_46604 = var1;
   }

   @Nullable
   @Override
   public class_4099 method_9859(class_4924 var1, class_1331 var2, class_1331 var3, class_4099 var4, class_4099 var5, class_8478 var6) {
      Random var9 = var6.method_39052(var5.field_19965);
      return !(this.field_46604 >= 1.0F) && !(var9.nextFloat() <= this.field_46604) ? null : var5;
   }

   @Override
   public class_2111<?> method_9858() {
      return class_2111.field_10594;
   }
}
