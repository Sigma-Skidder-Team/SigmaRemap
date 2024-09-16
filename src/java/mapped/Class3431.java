package mapped;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import java.util.List;
import java.util.Random;
import java.util.function.Predicate;

public class Class3431 extends Class3429 {
   private static String[] field19192;
   public static final Class8552<Class96> field19193 = Class8820.field39737;
   public static final Class8551 field19194 = Class8820.field39704;

   public Class3431(AbstractBlock var1) {
      super(true, var1);
      this.method11578(this.field18612.method35393().method23465(field19194, Boolean.valueOf(false)).method23465(field19193, Class96.field247));
   }

   @Override
   public boolean method11516(BlockState var1) {
      return true;
   }

   @Override
   public void method11523(BlockState var1, World var2, BlockPos var3, Entity var4) {
      if (!var2.isRemote && !var1.<Boolean>method23463(field19194)) {
         this.method12094(var2, var3, var1);
      }
   }

   @Override
   public void method11522(BlockState var1, ServerWorld var2, BlockPos var3, Random var4) {
      if (var1.<Boolean>method23463(field19194)) {
         this.method12094(var2, var3, var1);
      }
   }

   @Override
   public int method11514(BlockState var1, IBlockReader var2, BlockPos var3, Direction var4) {
      return !var1.<Boolean>method23463(field19194) ? 0 : 15;
   }

   @Override
   public int method11515(BlockState var1, IBlockReader var2, BlockPos var3, Direction var4) {
      if (var1.<Boolean>method23463(field19194)) {
         return var4 != Direction.field673 ? 0 : 15;
      } else {
         return 0;
      }
   }

   private void method12094(World var1, BlockPos var2, BlockState var3) {
      if (this.method11492(var3, var1, var2)) {
         boolean var6 = var3.<Boolean>method23463(field19194);
         boolean var7 = false;
         List var8 = this.<AbstractMinecartEntity>method12096(var1, var2, AbstractMinecartEntity.class, (Predicate<Entity>)null);
         if (!var8.isEmpty()) {
            var7 = true;
         }

         if (var7 && !var6) {
            BlockState var9 = var3.method23465(field19194, Boolean.valueOf(true));
            var1.setBlockState(var2, var9, 3);
            this.method12095(var1, var2, var9, true);
            var1.notifyNeighborsOfStateChange(var2, this);
            var1.notifyNeighborsOfStateChange(var2.down(), this);
            var1.markBlockRangeForRenderUpdate(var2, var3, var9);
         }

         if (!var7 && var6) {
            BlockState var10 = var3.method23465(field19194, Boolean.valueOf(false));
            var1.setBlockState(var2, var10, 3);
            this.method12095(var1, var2, var10, false);
            var1.notifyNeighborsOfStateChange(var2, this);
            var1.notifyNeighborsOfStateChange(var2.down(), this);
            var1.markBlockRangeForRenderUpdate(var2, var3, var10);
         }

         if (var7) {
            var1.method6860().method20726(var2, this, 20);
         }

         var1.updateComparatorOutputLevel(var2, this);
      }
   }

   public void method12095(World var1, BlockPos var2, BlockState var3, boolean var4) {
      Class9435 var7 = new Class9435(var1, var2, var3);

      for (BlockPos var9 : var7.method36233()) {
         BlockState var10 = var1.getBlockState(var9);
         var10.method23423(var1, var9, var10.getBlock(), var2, false);
      }
   }

   @Override
   public void method11589(BlockState var1, World var2, BlockPos var3, BlockState var4, boolean var5) {
      if (!var4.isIn(var1.getBlock())) {
         this.method12094(var2, var3, this.method12089(var1, var2, var3, var5));
      }
   }

   @Override
   public Class8550<Class96> method12093() {
      return field19193;
   }

   @Override
   public boolean method11648(BlockState var1) {
      return true;
   }

   @Override
   public int method11649(BlockState var1, World var2, BlockPos var3) {
      if (var1.<Boolean>method23463(field19194)) {
         List var6 = this.<Class918>method12096(var2, var3, Class918.class, (Predicate<Entity>)null);
         if (!var6.isEmpty()) {
            return ((Class918)var6.get(0)).method3614().method3557();
         }

         List var7 = this.<AbstractMinecartEntity>method12096(var2, var3, AbstractMinecartEntity.class, Class8088.field34760);
         if (!var7.isEmpty()) {
            return Container.calcRedstoneFromInventory((IInventory)var7.get(0));
         }
      }

      return 0;
   }

   public <T extends AbstractMinecartEntity> List<T> method12096(World var1, BlockPos var2, Class<T> var3, Predicate<Entity> var4) {
      return var1.<T>method6772(var3, this.method12097(var2), var4);
   }

   private AxisAlignedBB method12097(BlockPos var1) {
      double var4 = 0.2;
      return new AxisAlignedBB(
         (double)var1.getX() + 0.2,
         (double)var1.getY(),
         (double)var1.getZ() + 0.2,
         (double)(var1.getX() + 1) - 0.2,
         (double)(var1.getY() + 1) - 0.2,
         (double)(var1.getZ() + 1) - 0.2
      );
   }

   @Override
   public BlockState method11500(BlockState var1, Class80 var2) {
      switch (Class7090.field30515[var2.ordinal()]) {
         case 1:
            switch (Class7090.field30514[var1.<Class96>method23463(field19193).ordinal()]) {
               case 1:
                  return var1.method23465(field19193, Class96.field250);
               case 2:
                  return var1.method23465(field19193, Class96.field249);
               case 3:
                  return var1.method23465(field19193, Class96.field252);
               case 4:
                  return var1.method23465(field19193, Class96.field251);
               case 5:
                  return var1.method23465(field19193, Class96.field255);
               case 6:
                  return var1.method23465(field19193, Class96.field256);
               case 7:
                  return var1.method23465(field19193, Class96.field253);
               case 8:
                  return var1.method23465(field19193, Class96.field254);
            }
         case 2:
            switch (Class7090.field30514[var1.<Class96>method23463(field19193).ordinal()]) {
               case 1:
                  return var1.method23465(field19193, Class96.field251);
               case 2:
                  return var1.method23465(field19193, Class96.field252);
               case 3:
                  return var1.method23465(field19193, Class96.field250);
               case 4:
                  return var1.method23465(field19193, Class96.field249);
               case 5:
                  return var1.method23465(field19193, Class96.field256);
               case 6:
                  return var1.method23465(field19193, Class96.field253);
               case 7:
                  return var1.method23465(field19193, Class96.field254);
               case 8:
                  return var1.method23465(field19193, Class96.field255);
               case 9:
                  return var1.method23465(field19193, Class96.field248);
               case 10:
                  return var1.method23465(field19193, Class96.field247);
            }
         case 3:
            switch (Class7090.field30514[var1.<Class96>method23463(field19193).ordinal()]) {
               case 1:
                  return var1.method23465(field19193, Class96.field252);
               case 2:
                  return var1.method23465(field19193, Class96.field251);
               case 3:
                  return var1.method23465(field19193, Class96.field249);
               case 4:
                  return var1.method23465(field19193, Class96.field250);
               case 5:
                  return var1.method23465(field19193, Class96.field254);
               case 6:
                  return var1.method23465(field19193, Class96.field255);
               case 7:
                  return var1.method23465(field19193, Class96.field256);
               case 8:
                  return var1.method23465(field19193, Class96.field253);
               case 9:
                  return var1.method23465(field19193, Class96.field248);
               case 10:
                  return var1.method23465(field19193, Class96.field247);
            }
         default:
            return var1;
      }
   }

   @Override
   public BlockState method11501(BlockState var1, Class2089 var2) {
      Class96 var5 = var1.<Class96>method23463(field19193);
      switch (Class7090.field30516[var2.ordinal()]) {
         case 1:
            switch (Class7090.field30514[var5.ordinal()]) {
               case 3:
                  return var1.method23465(field19193, Class96.field252);
               case 4:
                  return var1.method23465(field19193, Class96.field251);
               case 5:
                  return var1.method23465(field19193, Class96.field256);
               case 6:
                  return var1.method23465(field19193, Class96.field255);
               case 7:
                  return var1.method23465(field19193, Class96.field254);
               case 8:
                  return var1.method23465(field19193, Class96.field253);
               default:
                  return super.method11501(var1, var2);
            }
         case 2:
            switch (Class7090.field30514[var5.ordinal()]) {
               case 1:
                  return var1.method23465(field19193, Class96.field250);
               case 2:
                  return var1.method23465(field19193, Class96.field249);
               case 3:
               case 4:
               default:
                  break;
               case 5:
                  return var1.method23465(field19193, Class96.field254);
               case 6:
                  return var1.method23465(field19193, Class96.field253);
               case 7:
                  return var1.method23465(field19193, Class96.field256);
               case 8:
                  return var1.method23465(field19193, Class96.field255);
            }
         default:
            return super.method11501(var1, var2);
      }
   }

   @Override
   public void method11489(Class7558<Block, BlockState> var1) {
      var1.method24737(field19193, field19194);
   }
}
