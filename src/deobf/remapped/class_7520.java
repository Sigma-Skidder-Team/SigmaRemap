package remapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Set;

public class class_7520<T> implements class_2307<T> {
   private static String[] field_38389;
   private final ImmutableList<T> field_38387;
   private final Set<T> field_38386;
   public final Class<?> field_38388;

   public class_7520(Set<T> var1, Class<?> var2) {
      this.field_38388 = var2;
      this.field_38386 = var1;
      this.field_38387 = ImmutableList.copyOf(var1);
   }

   public static <T> class_7520<T> method_34261() {
      return new class_7520<T>(ImmutableSet.of(), Void.class);
   }

   public static <T> class_7520<T> method_34262(Set<T> var0) {
      return new class_7520<T>(var0, method_34263(var0));
   }

   @Override
   public boolean method_10609(T var1) {
      return this.field_38388.isInstance(var1) && this.field_38386.contains(var1);
   }

   @Override
   public List<T> method_10608() {
      return this.field_38387;
   }

   private static <T> Class<?> method_34263(Set<T> var0) {
      if (!var0.isEmpty()) {
         Class var3 = null;

         for (Object var5 : var0) {
            if (var3 != null) {
               var3 = method_34260(var3, var5.getClass());
            } else {
               var3 = var5.getClass();
            }
         }

         return var3;
      } else {
         return Void.class;
      }
   }

   private static Class<?> method_34260(Class<?> var0, Class<?> var1) {
      while (!var0.isAssignableFrom(var1)) {
         var0 = var0.getSuperclass();
      }

      return var0;
   }
}
