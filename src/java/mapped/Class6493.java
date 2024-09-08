package mapped;

import com.mentalfrostbyte.jello.unmapped.JelloPortal;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;

import java.util.HashSet;
import java.util.Set;

public class Class6493 extends Class6490 {

   public Class6493() {
      super(Class3411.class);
   }

   @Override
   public Set<Class8189> method19687(BlockPos var1, BlockState var2, Class8982 var3) {
      HashSet var6 = new HashSet();
      if (JelloPortal.method27349() == ViaVerList.field26129.method18582() && this.field28457.getCurrentServerData() != null) {
         var6.add(new Class8189(var1, Blocks.AIR.method11579()));
         return var6;
      } else {
         return var6;
      }
   }
}
