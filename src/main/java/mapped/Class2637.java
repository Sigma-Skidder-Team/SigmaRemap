package mapped;

import net.minecraft.block.BedBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.state.properties.BedPart;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorldReader;

public class Class2637 extends Class2628 {
   private static String[] field16958;
   private final CatEntity field16959;

   public Class2637(CatEntity var1, double var2) {
      super(var1, var2, 8);
      this.field16959 = var1;
   }

   @Override
   public boolean method10803() {
      return this.field16959.method4393() && !this.field16959.method4402() && super.method10803();
   }

   @Override
   public void startExecuting() {
      super.startExecuting();
      this.field16959.method4396(false);
   }

   @Override
   public void method10807() {
      super.method10807();
      this.field16959.method4396(false);
   }

   @Override
   public void method10805() {
      super.method10805();
      this.field16959.method4396(this.method10838());
   }

   @Override
   public boolean method10840(IWorldReader var1, BlockPos var2) {
      if (var1.method7007(var2.up())) {
         BlockState var5 = var1.getBlockState(var2);
         if (var5.isIn(Blocks.CHEST)) {
            return ChestTileEntity.getPlayersUsing(var1, var2) < 1;
         } else {
            return var5.isIn(Blocks.FURNACE) && var5.<Boolean>get(FurnaceBlock.field18876)
               ? true
               : var5.method23447(
                  BlockTags.field32770, var0 -> var0.<BedPart>method23464(BedBlock.PART).<Boolean>map(var0x -> var0x != BedPart.HEAD).orElse(true)
               );
         }
      } else {
         return false;
      }
   }
}
