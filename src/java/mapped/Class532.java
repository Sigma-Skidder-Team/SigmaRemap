package mapped;

import com.mentalfrostbyte.jello.module.impl.world.AutoFarm;
import net.minecraft.util.math.BlockPos;

public class Class532 implements Runnable {
   private static String[] field2543;
   public final BlockPos field2544;
   public final AutoFarm field2545;

   public Class532(AutoFarm var1, BlockPos var2) {
      this.field2545 = var1;
      this.field2544 = var2;
   }

   @Override
   public void run() {
      AutoFarm.method16868().getConnection().sendPacket(new CPlayerDiggingPacket(CPlayerDiggingPacket.Action.field13484, this.field2544, Direction.field673));
      AutoFarm.method16869().getConnection().sendPacket(new CPlayerDiggingPacket(CPlayerDiggingPacket.Action.field13486, this.field2544, Direction.field673));
      AutoFarm.method16870().getConnection().sendPacket(new CAnimateHandPacket(Hand.MAIN_HAND));
   }
}
