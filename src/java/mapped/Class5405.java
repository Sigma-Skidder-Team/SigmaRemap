package mapped;

import com.mentalfrostbyte.jello.util.world.BlockUtil;
import net.minecraft.block.BlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class Class5405 extends Class5404 {
   private static String[] field24088;
   private Chunk field24089;
   public Minecraft field24090 = Minecraft.getInstance();

   @Override
   public int method16985(Class7161 var1, int var2, int var3, int var4) {
      if (this.field24090.player == null) {
         return 0;
      } else {
         BlockState var7 = this.field24090.world.getBlockState(new BlockPos(var2, var3, var4));
         return var7 != null ? BlockUtil.method34574(var7.getBlock()) << 4 | BlockUtil.method34573(var7) : 0;
      }
   }

   public Chunk method16992(World var1, int var2, int var3) {
      return this.field24089 != null && this.field24089.getPos().x == var2 && this.field24089.getPos().z == var3
         ? this.field24089
         : (this.field24089 = var1.getChunk(var2, var3));
   }
}
