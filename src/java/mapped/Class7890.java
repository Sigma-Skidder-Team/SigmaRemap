package mapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class Class7890 extends Class7882<Class880> {
   private static String[] field33841;

   @Override
   public Set<Class8830<?>> method26424() {
      return ImmutableSet.of(Class8830.field39819, Class8830.field39848, Class8830.field39861);
   }

   @Override
   public void method26425(ServerWorld var1, Class880 var2) {
      Class6947<?> var5 = var2.method2992();
      Optional var6 = Optional.empty();
      ArrayList var7 = Lists.newArrayList();

      for (Class880 var9 : var5.<List<Class880>>method21410(Class8830.field39819).orElse(ImmutableList.of())) {
         if (var9 instanceof Class1084 || var9 instanceof Class1079) {
            var6 = Optional.<Class880>of((Class1006)var9);
            break;
         }
      }

      for (Class880 var11 : var5.<List<Class880>>method21410(Class8830.field39818).orElse(ImmutableList.of())) {
         if (var11 instanceof Class1035 && ((Class1035)var11).method4635()) {
            var7.add((Class1035)var11);
         }
      }

      var5.method21408(Class8830.field39848, var6);
      var5.method21406(Class8830.field39861, var7);
   }
}
