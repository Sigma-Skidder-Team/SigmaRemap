package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;

import java.util.Set;
import java.util.function.Predicate;

public class Class164 implements Predicate<Class9632> {
   private final BlockState field529;
   private final Set<Class8550<?>> field530;
   private final CompoundNBT field531;

   public Class164(BlockState var1, Set<Class8550<?>> var2, CompoundNBT var3) {
      this.field529 = var1;
      this.field530 = var2;
      this.field531 = var3;
   }

   public BlockState method495() {
      return this.field529;
   }

   public boolean test(Class9632 var1) {
      BlockState var4 = var1.method37548();
      if (!var4.method23448(this.field529.getBlock())) {
         return false;
      } else {
         for (Class8550 var6 : this.field530) {
            if (var4.method23463(var6) != this.field529.method23463(var6)) {
               return false;
            }
         }

         if (this.field531 == null) {
            return true;
         } else {
            TileEntity var7 = var1.method37549();
            return var7 != null && Class8354.method29280(this.field531, var7.write(new CompoundNBT()), true);
         }
      }
   }

   public boolean method496(ServerWorld var1, BlockPos var2, int var3) {
      BlockState var6 = Block.method11542(this.field529, var1, var2);
      if (var6.isAir()) {
         var6 = this.field529;
      }

      if (var1.setBlockState(var2, var6, var3)) {
         if (this.field531 != null) {
            TileEntity var7 = var1.getTileEntity(var2);
            if (var7 != null) {
               CompoundNBT var8 = this.field531.method79();
               var8.method102("x", var2.getX());
               var8.method102("y", var2.getY());
               var8.method102("z", var2.getZ());
               var7.method3645(var6, var8);
            }
         }

         return true;
      } else {
         return false;
      }
   }
}
