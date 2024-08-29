package mapped;

public class Class1431 implements Runnable {
   private static String[] field7677;
   public final BlockPos field7678;
   public final Class5362 field7679;

   public Class1431(Class5362 var1, BlockPos var2) {
      this.field7679 = var1;
      this.field7678 = var2;
   }

   @Override
   public void run() {
      Class5362.method16879().getConnection().sendPacket(new CPlayerDiggingPacket(CPlayerDiggingPacket.Action.field13484, this.field7678.method8311(), Direction.field673));
      Class5362.method16880().getConnection().sendPacket(new CPlayerDiggingPacket(CPlayerDiggingPacket.Action.field13486, this.field7678.method8311(), Direction.field673));
      Class5362.method16881().getConnection().sendPacket(new CAnimateHandPacket(Hand.MAIN_HAND));
   }
}
