package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.util.math.BlockPos;

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
         return var7 != null ? Class9217.method34574(var7.getBlock()) << 4 | Class9217.method34573(var7) : 0;
      }
   }

   public Chunk method16992(World var1, int var2, int var3) {
      return this.field24089 != null && this.field24089.method7072().field32174 == var2 && this.field24089.method7072().field32175 == var3
         ? this.field24089
         : (this.field24089 = var1.getChunk(var2, var3));
   }
}
