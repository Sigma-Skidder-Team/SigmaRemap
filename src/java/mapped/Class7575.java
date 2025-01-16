package mapped;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class Class7575 extends Class7574 {
   private static String[] field32528;
   public final SpawnerMinecartEntity field32529;

   public Class7575(SpawnerMinecartEntity var1) {
      this.field32529 = var1;
   }

   @Override
   public void method24785(int var1) {
      this.field32529.world.setEntityState(this.field32529, (byte)var1);
   }

   @Override
   public World method24786() {
      return this.field32529.world;
   }

   @Override
   public BlockPos method24787() {
      return this.field32529.getPosition();
   }
}
