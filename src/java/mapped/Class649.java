package mapped;

import com.mentalfrostbyte.jello.module.impl.world.AutoFarm;

public class Class649 implements Runnable {
   private static String[] field3250;
   public final int field3251;
   public final float[] field3252;
   public final AutoFarm field3253;

   public Class649(AutoFarm var1, int var2, float[] var3) {
      this.field3253 = var1;
      this.field3251 = var2;
      this.field3252 = var3;
   }

   @Override
   public void run() {
      AutoFarm.mc.getConnection().sendPacket(new Class5539(this.field3251));
      AutoFarm.mc.getConnection().sendPacket(new Class5570(Hand.MAIN_HAND, Class9217.method34567(this.field3252[0], this.field3252[1], 4.5F)));
      AutoFarm.mc.getConnection().sendPacket(new CAnimateHandPacket(Hand.MAIN_HAND));
      AutoFarm.mc.getConnection().sendPacket(new Class5539(AutoFarm.mc.player.inventory.currentItem));
   }
}
