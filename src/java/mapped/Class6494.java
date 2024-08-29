package mapped;

import java.util.HashSet;
import java.util.Set;

public class Class6494 extends Class6490 {
   private static String[] field28456;

   public Class6494() {
      super(Class3421.class);
   }

   @Override
   public Set<Class8189> method19688(BlockPos var1, BlockState var2, Class8982 var3) {
      HashSet var6 = new HashSet();
      var6.add(new Class8189(var1, var2.method23465(Class3421.field19133, Class3421.method12072(var2, Minecraft.getInstance().world, var1))));
      return var6;
   }
}
