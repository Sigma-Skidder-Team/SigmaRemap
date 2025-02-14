package mapped;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class Class6996 extends Class6995 {
   private static String[] field30269;
   public final BeeEntity field30270;

   public Class6996(BeeEntity var1, MobEntity var2, World var3) {
      super(var2, var3);
      this.field30270 = var1;
   }

   @Override
   public boolean method21672(BlockPos var1) {
      return !this.field30244.getBlockState(var1.down()).isAir();
   }

   @Override
   public void method21658() {
      if (!PollinateGoal.method10870(BeeEntity.method4451(this.field30270))) {
         super.method21658();
      }
   }
}
