package remapped;

import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.types.Type;
import java.util.Set;
import java.util.function.Supplier;

public final class class_9690<T extends class_3757> {
   private static String[] field_49302;
   private final Supplier<? extends T> field_49301;
   private final Set<class_6414> field_49303;

   private class_9690(Supplier<? extends T> var1, Set<class_6414> var2) {
      this.field_49301 = var1;
      this.field_49303 = var2;
   }

   public static <T extends class_3757> class_9690<T> method_44793(Supplier<? extends T> var0, class_6414... var1) {
      return new class_9690<T>(var0, ImmutableSet.copyOf(var1));
   }

   public class_133<T> method_44792(Type<?> var1) {
      return new class_133<T>(this.field_49301, this.field_49303, var1);
   }
}
