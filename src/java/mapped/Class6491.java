package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;

import java.util.HashSet;
import java.util.Set;

public class Class6491 extends Class6490 {
   private static String[] field28456;

   public Class6491() {
      super(Class3457.class);
   }

   @Override
   public Set<Class8189> method19687(BlockPos var1, BlockState var2, Class8982 var3) {
      HashSet var6 = new HashSet();
      if (var2.<Class84>method23463(Class3456.field19276) == Class84.field209) {
         BlockState var7 = var3.method33184(var1.down());
         if (var7.getBlock() instanceof Class3457) {
            var6.add(new Class8189(var1, var7.method23465(Class3457.field19276, Class84.field209)));
         }
      }

      return var6;
   }
}
