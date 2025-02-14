package mapped;

import net.minecraft.util.math.BlockPos;

public interface ISpawnWorldInfo extends Class6612 {
   void method20035(int var1);

   void method20036(int var1);

   void method20037(int var1);

   void method20038(float var1);

   default void setSpawn(BlockPos var1, float var2) {
      this.method20035(var1.getX());
      this.method20036(var1.getY());
      this.method20037(var1.getZ());
      this.method20038(var2);
   }
}
