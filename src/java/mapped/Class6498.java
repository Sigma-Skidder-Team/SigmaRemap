package mapped;

import java.util.HashSet;
import java.util.Set;

public class Class6498 extends Class6490 {
   private static String[] field28456;

   public Class6498() {
      super(Class3348.class);
   }

   @Override
   public Set<Class8189> method19687(BlockPos var1, Class7380 var2, Class8982 var3) {
      HashSet var6 = new HashSet();
      Class7380 var7 = Minecraft.getInstance().field1338.method6738(var1);
      if (var7.method23383() instanceof Class3348) {
         var6.add(new Class8189(var1, var7));
      }

      return var6;
   }
}
