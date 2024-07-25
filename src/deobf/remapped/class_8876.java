package remapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import java.util.Optional;

public class class_8876<T> extends class_3766<T> {
   private static String[] field_45375;
   private final class_6322 field_45376;

   public static <T> class_8876<T> method_40843(DynamicOps<T> var0, class_6322 var1) {
      return new class_8876<T>(var0, var1);
   }

   private class_8876(DynamicOps<T> var1, class_6322 var2) {
      super(var1);
      this.field_45376 = var2;
   }

   public <E> DataResult<T> method_40844(E var1, T var2, class_5621<? extends class_8669<E>> var3, Codec<E> var4) {
      Optional var7 = this.field_45376.method_28814(var3);
      if (var7.isPresent()) {
         class_6433 var8 = (class_6433)var7.get();
         Optional var9 = var8.method_39800(var1);
         if (var9.isPresent()) {
            class_5621 var10 = (class_5621)var9.get();
            return Identifier.field_22655.encode(var10.method_25499(), this.field_18419, var2);
         }
      }

      return var4.encode(var1, this, var2);
   }
}
