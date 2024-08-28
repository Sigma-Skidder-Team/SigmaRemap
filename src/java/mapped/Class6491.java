package mapped;

import java.util.HashSet;
import java.util.Set;

public class Class6491 extends Class6490 {
   private static String[] field28456;

   public Class6491() {
      super(Class3457.class);
   }

   @Override
   public Set<Class8189> method19687(BlockPos var1, Class7380 var2, Class8982 var3) {
      HashSet var6 = new HashSet();
      if (var2.<Class84>method23463(Class3456.field19276) == Class84.field209) {
         Class7380 var7 = var3.method33184(var1.method8313());
         if (var7.method23383() instanceof Class3457) {
            var6.add(new Class8189(var1, var7.method23465(Class3457.field19276, Class84.field209)));
         }
      }

      return var6;
   }
}
