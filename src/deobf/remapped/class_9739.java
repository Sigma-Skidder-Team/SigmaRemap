package remapped;

import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.RecordBuilder;
import java.util.Optional;

public final class class_9739<U> {
   private static String[] field_49490;
   private final class_6044<U> field_49491;
   private final Optional<? extends class_3909<U>> field_49492;

   private static <U> class_9739<U> method_44970(class_6044<U> var0, Optional<? extends class_3909<?>> var1) {
      return new class_9739<U>(var0, var1);
   }

   private class_9739(class_6044<U> var1, Optional<? extends class_3909<U>> var2) {
      this.field_49491 = var1;
      this.field_49492 = var2;
   }

   private void method_44969(class_1150<?> var1) {
      class_1150.method_5101(var1, this.field_49491, this.field_49492);
   }

   public <T> void method_44972(DynamicOps<T> var1, RecordBuilder<T> var2) {
      this.field_49491
         .method_27594()
         .ifPresent(
            var3 -> this.field_49492.ifPresent(var4 -> var2.add(class_8669.field_44431.encodeStart(var1, this.field_49491), var3.encodeStart(var1, var4)))
         );
   }
}
