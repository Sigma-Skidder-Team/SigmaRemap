package mapped;

import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Class7886 extends Class7882<Class880> {
   private static String[] field33834;

   @Override
   public void method26425(ServerWorld var1, Class880 var2) {
      AxisAlignedBB var5 = var2.getBoundingBox().method19663(16.0, 16.0, 16.0);
      List<Class880> var6 = var1.<Class880>method6772(Class880.class, var5, var1x -> var1x != var2 && var1x.method3066());
      var6.sort(Comparator.comparingDouble(var2::getDistanceSq));
      Class6947 var7 = var2.method2992();
      var7.method21406(Class8830.field39818, var6);
      var7.method21406(Class8830.field39819, var6.stream().filter(var1x -> method26430(var2, var1x)).collect(Collectors.<Class880>toList()));
   }

   @Override
   public Set<Class8830<?>> method26424() {
      return ImmutableSet.of(Class8830.field39818, Class8830.field39819);
   }
}
