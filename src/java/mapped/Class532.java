package mapped;

public class Class532 implements Runnable {
   private static String[] field2543;
   public final BlockPos field2544;
   public final Class5362 field2545;

   public Class532(Class5362 var1, BlockPos var2) {
      this.field2545 = var1;
      this.field2544 = var2;
   }

   @Override
   public void run() {
      Class5362.method16868().getClientPlayNetHandler().sendPacket(new Class5492(Class2070.field13484, this.field2544, Direction.field673));
      Class5362.method16869().getClientPlayNetHandler().sendPacket(new Class5492(Class2070.field13486, this.field2544, Direction.field673));
      Class5362.method16870().getClientPlayNetHandler().sendPacket(new CAnimateHandPacket(Hand.field182));
   }
}
