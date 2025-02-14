package mapped;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.state.IntegerProperty;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.math.BlockPos;

public class FindPollinationTargetGoal extends Class2661 {
   private static String[] field17023;
   public final BeeEntity field17022;

   private FindPollinationTargetGoal(BeeEntity var1) {
      super(var1, null);
      this.field17022 = var1;
   }

   @Override
   public boolean canBeeStart() {
      if (BeeEntity.method4476(this.field17022) < 10) {
         return BeeEntity.method4477(this.field17022).nextFloat() < 0.3F ? false : this.field17022.method4438() && BeeEntity.method4478(this.field17022);
      } else {
         return false;
      }
   }

   @Override
   public boolean canBeeContinue() {
      return this.canBeeStart();
   }

   @Override
   public void method10805() {
      if (BeeEntity.method4479(this.field17022).nextInt(30) == 0) {
         for (int var3 = 1; var3 <= 2; var3++) {
            BlockPos var4 = this.field17022.getPosition().method8340(var3);
            BlockState var5 = this.field17022.world.getBlockState(var4);
            Block var6 = var5.getBlock();
            boolean var7 = false;
            IntegerProperty var8 = null;
            if (var6.isIn(BlockTags.field32796)) {
               if (!(var6 instanceof WheatBlock)) {
                  if (!(var6 instanceof Class3486)) {
                     if (var6 == Blocks.SWEET_BERRY_BUSH) {
                        int var9 = var5.<Integer>get(Class3484.field19342);
                        if (var9 < 3) {
                           var7 = true;
                           var8 = Class3484.field19342;
                        }
                     }
                  } else {
                     int var10 = var5.<Integer>get(Class3486.field19347);
                     if (var10 < 7) {
                        var7 = true;
                        var8 = Class3486.field19347;
                     }
                  }
               } else {
                  WheatBlock var11 = (WheatBlock)var6;
                  if (!var11.method12179(var5)) {
                     var7 = true;
                     var8 = var11.method12175();
                  }
               }

               if (var7) {
                  this.field17022.world.playEvent(2005, var4, 0);
                  this.field17022.world.setBlockState(var4, var5.with(var8, Integer.valueOf(var5.<Integer>get(var8) + 1)));
                  BeeEntity.method4480(this.field17022);
               }
            }
         }
      }
   }

   // $VF: synthetic method
   public FindPollinationTargetGoal(BeeEntity var1, Class6996 var2) {
      this(var1);
   }
}
