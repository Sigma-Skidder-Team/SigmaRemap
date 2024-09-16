package mapped;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import java.util.Optional;
import java.util.Random;

public abstract class Class3445 extends Class3444 implements Class3196 {
   public Class3445(AbstractBlock var1, Direction var2, VoxelShape var3, boolean var4) {
      super(var1, var2, var3, var4);
   }

   @Override
   public BlockState method11491(BlockState var1, Direction var2, BlockState var3, Class1660 var4, BlockPos var5, BlockPos var6) {
      if (var2 == this.field19256.method536() && !var1.method23443(var4, var5)) {
         var4.method6860().method20726(var5, this, 1);
      }

      Class3452 var9 = this.method12124();
      if (var2 == this.field19256) {
         Block var10 = var3.getBlock();
         if (var10 != this && var10 != var9) {
            return var9.method12122(var4);
         }
      }

      if (this.field19257) {
         var4.method6861().method20726(var5, Class9479.field44066, Class9479.field44066.method25057(var4));
      }

      return super.method11491(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public ItemStack getItem(IBlockReader var1, BlockPos var2, BlockState var3) {
      return new ItemStack(this.method12124());
   }

   @Override
   public boolean method11486(IBlockReader var1, BlockPos var2, BlockState var3, boolean var4) {
      Optional var7 = this.method12126(var1, var2, var3);
      return var7.isPresent() && this.method12124().method12127(var1.getBlockState(((BlockPos)var7.get()).method8349(this.field19256)));
   }

   @Override
   public boolean method11487(World var1, Random var2, BlockPos var3, BlockState var4) {
      return true;
   }

   @Override
   public void method11488(ServerWorld var1, Random var2, BlockPos var3, BlockState var4) {
      Optional var7 = this.method12126(var1, var3, var4);
      if (var7.isPresent()) {
         BlockState var8 = var1.getBlockState((BlockPos)var7.get());
         ((Class3452)var8.getBlock()).method11488(var1, var2, (BlockPos)var7.get(), var8);
      }
   }

   private Optional<BlockPos> method12126(IBlockReader var1, BlockPos var2, BlockState var3) {
      BlockPos var6 = var2;

      Block var7;
      do {
         var6 = var6.method8349(this.field19256);
         var7 = var1.getBlockState(var6).getBlock();
      } while (var7 == var3.getBlock());

      return var7 != this.method12124() ? Optional.<BlockPos>empty() : Optional.<BlockPos>of(var6);
   }

   @Override
   public boolean method11497(BlockState var1, Class5909 var2) {
      boolean var5 = super.method11497(var1, var2);
      return var5 && var2.method18357().getItem() == this.method12124().method11581() ? false : var5;
   }

   @Override
   public Block method12125() {
      return this;
   }
}
