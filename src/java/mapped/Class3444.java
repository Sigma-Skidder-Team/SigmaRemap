package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;

import java.util.Random;
import javax.annotation.Nullable;

public abstract class Class3444 extends Block {
   public final Direction field19256;
   public final boolean field19257;
   public final VoxelShape field19258;

   public Class3444(AbstractBlock var1, Direction var2, VoxelShape var3, boolean var4) {
      super(var1);
      this.field19256 = var2;
      this.field19258 = var3;
      this.field19257 = var4;
   }

   @Nullable
   @Override
   public BlockState method11495(Class5909 var1) {
      BlockState var4 = var1.method18360().getBlockState(var1.method18345().method8349(this.field19256));
      return !var4.method23448(this.method12124()) && !var4.method23448(this.method12125())
         ? this.method12122(var1.method18360())
         : this.method12125().method11579();
   }

   public BlockState method12122(Class1660 var1) {
      return this.method11579();
   }

   @Override
   public boolean method11492(BlockState var1, Class1662 var2, BlockPos var3) {
      BlockPos var6 = var3.method8349(this.field19256.method536());
      BlockState var7 = var2.getBlockState(var6);
      Block var8 = var7.getBlock();
      return !this.method12123(var8) ? false : var8 == this.method12124() || var8 == this.method12125() || var7.method23454(var2, var6, this.field19256);
   }

   @Override
   public void method11522(BlockState var1, ServerWorld var2, BlockPos var3, Random var4) {
      if (!var1.method23443(var2, var3)) {
         var2.method7179(var3, true);
      }
   }

   public boolean method12123(Block var1) {
      return true;
   }

   @Override
   public VoxelShape method11483(BlockState var1, Class1665 var2, BlockPos var3, ISelectionContext var4) {
      return this.field19258;
   }

   public abstract Class3452 method12124();

   public abstract Block method12125();
}
