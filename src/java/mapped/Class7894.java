package mapped;

import com.google.common.collect.ImmutableSet;
import net.minecraft.entity.Entity;

import java.util.Set;

public class Class7894 extends Class7882<Class880> {
   private static String[] field33845;

   @Override
   public Set<Class8830<?>> method26424() {
      return ImmutableSet.of(Class8830.field39835, Class8830.field39836);
   }

   @Override
   public void method26425(ServerWorld var1, Class880 var2) {
      Class6947<?> var5 = var2.method2992();
      Class8654 var6 = var2.method3047();
      if (var6 == null) {
         var5.method21405(Class8830.field39835);
      } else {
         var5.method21406(Class8830.field39835, var2.method3047());
         Entity var7 = var6.method31109();
         if (var7 instanceof Class880) {
            var5.method21406(Class8830.field39836, (Class880)var7);
         }
      }

      var5.method21410(Class8830.field39836).ifPresent(var2x -> {
         if (!var2x.method3066() || var2x.world != var1) {
            var5.method21405(Class8830.field39836);
         }
      });
   }
}
