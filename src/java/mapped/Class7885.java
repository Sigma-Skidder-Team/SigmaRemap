package mapped;

import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class Class7885 extends Class7882<Class880> {
   private static String[] field33833;

   public Class7885() {
      this(200);
   }

   public Class7885(int var1) {
      super(var1);
   }

   @Override
   public void method26425(Class1657 var1, Class880 var2) {
      method26441(var2);
   }

   @Override
   public Set<Class8830<?>> method26424() {
      return ImmutableSet.of(Class8830.field39818);
   }

   public static void method26441(Class880 var0) {
      Optional<List<Class880>> var3 = var0.method2992().<List<Class880>>method21410(Class8830.field39818);
      if (var3.isPresent()) {
         boolean var4 = var3.get().stream().anyMatch(var0x -> var0x.method3204().equals(Class8992.field41041));
         if (var4) {
            method26442(var0);
         }
      }
   }

   public static void method26442(Class880 var0) {
      var0.method2992().method21407(Class8830.field39842, true, 600L);
   }
}
