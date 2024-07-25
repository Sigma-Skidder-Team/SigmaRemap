package remapped;

import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class class_9146 extends class_2103 {
   private static String[] field_46777;
   public static final Codec<class_9146> field_46775 = Codec.unit(() -> class_9146.field_46776);
   public static final class_9146 field_46776 = new class_9146();

   @Nullable
   @Override
   public class_4099 method_9859(class_4924 var1, class_1331 var2, class_1331 var3, class_4099 var4, class_4099 var5, class_8478 var6) {
      class_1331 var9 = var5.field_19965;
      boolean var10 = var1.method_28262(var9).method_8350(class_4783.field_23811);
      return var10 && !class_6414.method_29301(var5.field_19967.method_8334(var1, var9))
         ? new class_4099(var9, class_4783.field_23811.method_29260(), var5.field_19968)
         : var5;
   }

   @Override
   public class_2111<?> method_9858() {
      return class_2111.field_10592;
   }
}
