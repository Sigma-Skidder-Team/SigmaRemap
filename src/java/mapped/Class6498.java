package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.util.math.BlockPos;

import java.util.HashSet;
import java.util.Set;

public class Class6498 extends Class6490 {
   private static String[] field28456;

   public Class6498() {
      super(Class3348.class);
   }

   @Override
   public Set<Class8189> method19687(BlockPos var1, BlockState var2, ViaVersionFixer var3) {
      HashSet var6 = new HashSet();
      BlockState var7 = Minecraft.getInstance().world.getBlockState(var1);
      if (var7.getBlock() instanceof Class3348) {
         var6.add(new Class8189(var1, var7));
      }

      return var6;
   }
}
