package mapped;

public class Class1358 implements Runnable {
   private static String[] field7244;
   public final float[] field7245;
   public final Class5362 field7246;

   public Class1358(Class5362 var1, float[] var2) {
      this.field7246 = var1;
      this.field7245 = var2;
   }

   @Override
   public void run() {
      Class5362.method16866().getConnection().sendPacket(new Class5570(Hand.MAIN_HAND, Class9217.method34567(this.field7245[0], this.field7245[1], 4.5F)));
      Class5362.method16867().getConnection().sendPacket(new CAnimateHandPacket(Hand.MAIN_HAND));
   }
}
