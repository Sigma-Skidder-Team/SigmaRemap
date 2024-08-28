package mapped;

public class Class649 implements Runnable {
   private static String[] field3250;
   public final int field3251;
   public final float[] field3252;
   public final Class5362 field3253;

   public Class649(Class5362 var1, int var2, float[] var3) {
      this.field3253 = var1;
      this.field3251 = var2;
      this.field3252 = var3;
   }

   @Override
   public void run() {
      Class5362.method16871().getClientPlayNetHandler().sendPacket(new Class5539(this.field3251));
      Class5362.method16872().getClientPlayNetHandler().sendPacket(new Class5570(Class79.field182, Class9217.method34567(this.field3252[0], this.field3252[1], 4.5F)));
      Class5362.method16873().getClientPlayNetHandler().sendPacket(new Class5511(Class79.field182));
      Class5362.method16875().getClientPlayNetHandler().sendPacket(new Class5539(Class5362.method16874().field1339.field4902.field5443));
   }
}
