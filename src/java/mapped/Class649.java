package mapped;

import com.mentalfrostbyte.jello.module.impl.world.AutoFarm;
import com.mentalfrostbyte.jello.util.world.BlockUtil;
import net.minecraft.network.play.client.CAnimateHandPacket;
import net.minecraft.network.play.client.CHeldItemChangePacket;
import net.minecraft.network.play.client.CPlayerTryUseItemOnBlockPacket;
import net.minecraft.util.Hand;

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
      AutoFarm.mc.getConnection().sendPacket(new CHeldItemChangePacket(this.field3251));
      AutoFarm.mc.getConnection().sendPacket(new CPlayerTryUseItemOnBlockPacket(Hand.MAIN_HAND, BlockUtil.method34567(this.field3252[0], this.field3252[1], 4.5F)));
      AutoFarm.mc.getConnection().sendPacket(new CAnimateHandPacket(Hand.MAIN_HAND));
      AutoFarm.mc.getConnection().sendPacket(new CHeldItemChangePacket(AutoFarm.mc.player.inventory.currentItem));
   }
}
