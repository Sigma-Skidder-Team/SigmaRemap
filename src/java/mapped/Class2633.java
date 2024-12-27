package mapped;

import net.minecraft.block.Blocks;
import net.minecraft.entity.monster.ZombieEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;

public class Class2633 extends Class2632 {
   private static String[] field16944;
   public final ZombieEntity field16948;

   public Class2633(ZombieEntity var1, CreatureEntity var2, double var3, int var5) {
      super(Blocks.TURTLE_EGG, var2, var3, var5);
      this.field16948 = var1;
   }

   @Override
   public void method10842(IWorld var1, BlockPos var2) {
      var1.playSound((PlayerEntity)null, var2, SoundEvents.field27288, SoundCategory.field14733, 0.5F, 0.9F + ZombieEntity.method4665(this.field16948).nextFloat() * 0.2F);
   }

   @Override
   public void method10843(World var1, BlockPos var2) {
      var1.playSound((PlayerEntity)null, var2, SoundEvents.field27167, SoundCategory.field14732, 0.7F, 0.9F + var1.rand.nextFloat() * 0.2F);
   }

   @Override
   public double method10835() {
      return 1.14;
   }
}
