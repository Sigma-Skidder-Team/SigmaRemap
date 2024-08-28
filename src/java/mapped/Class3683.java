package mapped;

import com.google.common.collect.ImmutableMap;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Class3683 extends Class3676<Class1046> {
   private static String[] field19697;
   private final float field19698;

   public Class3683(float var1) {
      super(ImmutableMap.of(Class8830.field39824, Class2217.field14485));
      this.field19698 = var1;
   }

   public boolean method12508(ServerWorld var1, Class1046 var2) {
      return !var1.method7022(var2.method3432());
   }

   public void method12502(ServerWorld var1, Class1046 var2, long var3) {
      BlockPos var7 = var2.method3432();
      List<BlockPos> var8 = BlockPos.method8360(var7.method8336(-1, -1, -1), var7.method8336(1, 1, 1))
         .map(BlockPos::method8353)
         .collect(Collectors.toList());
      Collections.shuffle(var8);
      Optional<BlockPos> var9 = var8.stream()
         .filter(var1x -> !var1.method7022(var1x))
         .filter(var2x -> var1.method6765(var2x, var2))
         .filter(var2x -> var1.method7052(var2))
         .findFirst();
      var9.ifPresent(var2x -> var2.method2992().method21406(Class8830.field39824, new Class8999(var2x, this.field19698, 0)));
   }
}
