package mapped;

import com.mentalfrostbyte.jello.module.impl.world.AutoFarm;
import net.minecraft.network.play.client.CAnimateHandPacket;
import net.minecraft.network.play.client.CPlayerDiggingPacket;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;

public class Class1431 implements Runnable {
   private static String[] field7677;
   public final BlockPos field7678;
   public final AutoFarm field7679;

   public Class1431(AutoFarm var1, BlockPos var2) {
      this.field7679 = var1;
      this.field7678 = var2;
   }

   @Override
   public void run() {
      AutoFarm.mc.getConnection().sendPacket(new CPlayerDiggingPacket(CPlayerDiggingPacket.Action.START_DESTROY_BLOCK, this.field7678.up(), Direction.UP));
      AutoFarm.mc.getConnection().sendPacket(new CPlayerDiggingPacket(CPlayerDiggingPacket.Action.STOP_DESTROY_BLOCK, this.field7678.up(), Direction.UP));
      AutoFarm.mc.getConnection().sendPacket(new CAnimateHandPacket(Hand.MAIN_HAND));
   }
}
