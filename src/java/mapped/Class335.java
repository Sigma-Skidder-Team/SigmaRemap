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
      Class8711 var3 = new Class8711(Class5355.method16814(this.field1459, Direction.field673), Direction.field673, this.field1459, false);
      int var4 = Class5254.method16395().field1339.field4902.field5443;
      Class5254.method16396().field1339.field4902.field5443 = this.field1460;
      Class5254.method16397().field1337.method23138();
      Class5254.method16400().field1337.method23139(Class5254.method16398().field1339, Class5254.method16399().field1338, Hand.field182, var3);
      Class5254.method16401().field1339.swingArm(Hand.field182);
      Class5254.method16402().field1339.field4902.field5443 = var4;
   }
}
