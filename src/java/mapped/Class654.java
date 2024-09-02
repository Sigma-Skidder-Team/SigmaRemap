package mapped;

import com.mentalfrostbyte.jello.module.impl.world.AutoFarm;
import net.minecraft.network.play.client.CAnimateHandPacket;
import net.minecraft.network.play.client.CPlayerDiggingPacket;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;

public class Class654 implements Runnable {
   private static String[] field3280;
   public final BlockPos field3281;
   public final AutoFarm field3282;

   public Class654(AutoFarm var1, BlockPos var2) {
      this.field3282 = var1;
      this.field3281 = var2;
   }

   @Override
   public void run() {
      AutoFarm.mc.getConnection().sendPacket(new CPlayerDiggingPacket(CPlayerDiggingPacket.Action.START_DESTROY_BLOCK, this.field3281.up(), Direction.field673));
      AutoFarm.mc.getConnection().sendPacket(new CPlayerDiggingPacket(CPlayerDiggingPacket.Action.STOP_DESTROY_BLOCK, this.field3281.up(), Direction.field673));
      AutoFarm.mc.getConnection().sendPacket(new CAnimateHandPacket(Hand.MAIN_HAND));
   }
}
