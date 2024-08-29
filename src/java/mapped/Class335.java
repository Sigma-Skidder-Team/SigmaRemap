package mapped;

public class Class335 implements Runnable {
   private static String[] field1458;
   public final BlockPos field1459;
   public final int field1460;
   public final Class5254 field1461;

   public Class335(Class5254 var1, BlockPos var2, int var3) {
      this.field1461 = var1;
      this.field1459 = var2;
      this.field1460 = var3;
   }

   @Override
   public void run() {
      BlockRayTraceResult var3 = new BlockRayTraceResult(BlockFlyNCPMode.method16814(this.field1459, Direction.field673), Direction.field673, this.field1459, false);
      int var4 = Class5254.method16395().player.inventory.currentItem;
      Class5254.method16396().player.inventory.currentItem = this.field1460;
      Class5254.method16397().playerController.method23138();
      Class5254.method16400().playerController.func_217292_a(Class5254.method16398().player, Class5254.method16399().world, Hand.MAIN_HAND, var3);
      Class5254.method16401().player.swingArm(Hand.MAIN_HAND);
      Class5254.method16402().player.inventory.currentItem = var4;
   }
}
