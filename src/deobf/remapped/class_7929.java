package remapped;

import com.mojang.serialization.Codec;
import java.util.Random;
import java.util.function.Supplier;

public class class_7929<SC extends class_4139> {
   private static String[] field_40558;
   public static final Codec<class_7929<?>> field_40559 = class_8669.field_44363.dispatch(var0 -> var0.field_40555, class_3133::method_14495);
   public static final Codec<Supplier<class_7929<?>>> field_40556 = class_6833.<Supplier<class_7929<?>>>method_31333(class_8669.field_44412, field_40559);
   public final class_3133<SC> field_40555;
   public final SC field_40557;

   public class_7929(class_3133<SC> var1, SC var2) {
      this.field_40555 = var1;
      this.field_40557 = (SC)var2;
   }

   public void method_35844(
      Random var1, class_5990 var2, class_6325 var3, int var4, int var5, int var6, double var7, class_2522 var9, class_2522 var10, int var11, long var12
   ) {
      this.field_40555.method_14498(var1, var2, var3, var4, var5, var6, var7, var9, var10, var11, var12, this.field_40557);
   }

   public void method_35845(long var1) {
      this.field_40555.method_14499(var1);
   }

   public SC method_35846() {
      return this.field_40557;
   }
}
