package mapped;

import com.mentalfrostbyte.jello.module.impl.world.AutoFarm;
import com.mentalfrostbyte.jello.util.world.BlockUtil;
import net.minecraft.network.play.client.CAnimateHandPacket;
import net.minecraft.network.play.client.CPlayerTryUseItemOnBlockPacket;
import net.minecraft.util.Hand;

public class Class1358 implements Runnable {
   private static String[] field7244;
   public final float[] field7245;
   public final AutoFarm field7246;

   public Class1358(AutoFarm var1, float[] var2) {
      this.field7246 = var1;
      this.field7245 = var2;
   }

   @Override
   public void run() {
      AutoFarm.mc.getConnection().sendPacket(new CPlayerTryUseItemOnBlockPacket(Hand.MAIN_HAND, BlockUtil.method34567(this.field7245[0], this.field7245[1], 4.5F)));
      AutoFarm.mc.getConnection().sendPacket(new CAnimateHandPacket(Hand.MAIN_HAND));
   }
}
