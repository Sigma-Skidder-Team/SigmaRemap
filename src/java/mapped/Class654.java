package mapped;

public class Class654 implements Runnable {
   private static String[] field3280;
   public final BlockPos field3281;
   public final Class5362 field3282;

   public Class654(Class5362 var1, BlockPos var2) {
      this.field3282 = var1;
      this.field3281 = var2;
   }

   @Override
   public void run() {
      Class5362.method16876().getConnection().sendPacket(new CPlayerDiggingPacket(CPlayerDiggingPacket.Action.field13484, this.field3281.up(), Direction.field673));
      Class5362.method16877().getConnection().sendPacket(new CPlayerDiggingPacket(CPlayerDiggingPacket.Action.field13486, this.field3281.up(), Direction.field673));
      Class5362.method16878().getConnection().sendPacket(new CAnimateHandPacket(Hand.MAIN_HAND));
   }
}
