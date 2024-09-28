package mapped;

import com.mentalfrostbyte.jello.module.impl.movement.blockfly.BlockFlyNCPMode;
import com.mentalfrostbyte.jello.module.impl.world.AutoCrystal;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;

public class Class335 implements Runnable {
   private static String[] field1458;
   public final BlockPos field1459;
   public final int field1460;
   public final AutoCrystal field1461;

   public Class335(AutoCrystal var1, BlockPos var2, int var3) {
      this.field1461 = var1;
      this.field1459 = var2;
      this.field1460 = var3;
   }

   @Override
   public void run() {
      BlockRayTraceResult var3 = new BlockRayTraceResult(BlockFlyNCPMode.method16814(this.field1459, Direction.UP), Direction.UP, this.field1459, false);
      int var4 = AutoCrystal.method16395().player.inventory.currentItem;
      AutoCrystal.method16396().player.inventory.currentItem = this.field1460;
      AutoCrystal.method16397().playerController.syncCurrentPlayItem();
      AutoCrystal.method16400().playerController.func_217292_a(AutoCrystal.method16398().player, AutoCrystal.method16399().world, Hand.MAIN_HAND, var3);
      AutoCrystal.method16401().player.swingArm(Hand.MAIN_HAND);
      AutoCrystal.method16402().player.inventory.currentItem = var4;
   }
}
