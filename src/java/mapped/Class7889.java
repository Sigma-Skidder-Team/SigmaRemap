package mapped;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Class7889 extends Class7882<Class880> {
   private static String[] field33840;

   @Override
   public Set<Class8830<?>> method26424() {
      return ImmutableSet.of(Class8830.field39820);
   }

   @Override
   public void method26425(ServerWorld var1, Class880 var2) {
      var2.method2992().method21406(Class8830.field39820, this.method26453(var2));
   }

   private List<Class880> method26453(Class880 var1) {
      return this.method26455(var1).stream().filter(this::method26454).collect(Collectors.<Class880>toList());
   }

   private boolean method26454(Class880 var1) {
      return var1.method3204() == Class8992.field41098 && var1.method3005();
   }

   private List<Class880> method26455(Class880 var1) {
      return var1.method2992().<List<Class880>>method21410(Class8830.field39819).orElse(Lists.newArrayList());
   }
}
