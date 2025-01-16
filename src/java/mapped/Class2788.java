package mapped;

import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;

public class Class2788 extends Class2785 {
   private static String[] field17405;
   private final PandaEntity field17415;
   private int field17416;
   public final PandaEntity field17417;

   public Class2788(PandaEntity var1, PandaEntity var2, double var3) {
      super(var2, var3);
      this.field17417 = var1;
      this.field17415 = var2;
   }

   @Override
   public boolean method10803() {
      if (!super.method10803() || this.field17415.method5186() != 0) {
         return false;
      } else if (this.method10980()) {
         return true;
      } else {
         if (this.field17416 <= this.field17415.ticksExisted) {
            this.field17415.method5187(32);
            this.field17416 = this.field17415.ticksExisted + 600;
            if (this.field17415.isServerWorld()) {
               PlayerEntity var3 = this.field17409.method7188(PandaEntity.method5237(), this.field17415);
               PandaEntity.method5238(this.field17415).method10824(var3);
            }
         }

         return false;
      }
   }

   private boolean method10980() {
      BlockPos var3 = this.field17415.getPosition();
      BlockPos.Mutable var4 = new BlockPos.Mutable();

      for (int var5 = 0; var5 < 3; var5++) {
         for (int var6 = 0; var6 < 8; var6++) {
            for (int var7 = 0; var7 <= var6; var7 = var7 <= 0 ? 1 - var7 : -var7) {
               for (int var8 = var7 < var6 && var7 > -var6 ? var6 : 0; var8 <= var6; var8 = var8 <= 0 ? 1 - var8 : -var8) {
                  var4.method8378(var3, var7, var5, var8);
                  if (this.field17409.getBlockState(var4).isIn(Blocks.BAMBOO)) {
                     return true;
                  }
               }
            }
         }
      }

      return false;
   }
}
