package mapped;

import com.mentalfrostbyte.jello.module.impl.world.AutoFarm;
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
      AutoFarm.method16876().getConnection().sendPacket(new CPlayerDiggingPacket(CPlayerDiggingPacket.Action.field13484, this.field3281.up(), Direction.field673));
      AutoFarm.method16877().getConnection().sendPacket(new CPlayerDiggingPacket(CPlayerDiggingPacket.Action.field13486, this.field3281.up(), Direction.field673));
      AutoFarm.method16878().getConnection().sendPacket(new CAnimateHandPacket(Hand.MAIN_HAND));
   }
}
