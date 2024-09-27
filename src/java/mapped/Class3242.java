package mapped;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.container.Container;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import javax.annotation.Nullable;
import java.util.Random;

public class Class3242 extends Class3241 {
   private static String[] field18692;
   public static final Class8553 field18693 = Class8820.field39720;
   public static final Class8551 field18694 = Class8820.field39702;

   public Class3242(AbstractBlock var1) {
      super(var1);
      this.method11578(this.field18612.method35393().method23465(field18693, Direction.NORTH).method23465(field18694, Boolean.valueOf(false)));
   }

   @Override
   public ActionResultType method11505(BlockState var1, World var2, BlockPos var3, PlayerEntity var4, Hand var5, BlockRayTraceResult var6) {
      if (!var2.isRemote) {
         TileEntity var9 = var2.getTileEntity(var3);
         if (var9 instanceof Class973) {
            var4.method2766((Class973)var9);
            var4.method2911(Stats.field40164);
            Class4388.method13832(var4, true);
         }

         return ActionResultType.field14819;
      } else {
         return ActionResultType.SUCCESS;
      }
   }

   @Override
   public void method11513(BlockState var1, World var2, BlockPos var3, BlockState var4, boolean var5) {
      if (!var1.isIn(var4.getBlock())) {
         TileEntity var8 = var2.getTileEntity(var3);
         if (var8 instanceof IInventory) {
            Class7236.method22721(var2, var3, (IInventory)var8);
            var2.updateComparatorOutputLevel(var3, this);
         }

         super.method11513(var1, var2, var3, var4, var5);
      }
   }

   @Override
   public void method11522(BlockState var1, ServerWorld var2, BlockPos var3, Random var4) {
      TileEntity var7 = var2.getTileEntity(var3);
      if (var7 instanceof Class973) {
         ((Class973)var7).method4025();
      }
   }

   @Nullable
   @Override
   public TileEntity method11646(IBlockReader var1) {
      return new Class973();
   }

   @Override
   public BlockRenderType method11526(BlockState var1) {
      return BlockRenderType.MODEL;
   }

   @Override
   public void method11563(World var1, BlockPos var2, BlockState var3, LivingEntity var4, ItemStack var5) {
      if (var5.method32152()) {
         TileEntity var8 = var1.getTileEntity(var2);
         if (var8 instanceof Class973) {
            ((Class973)var8).method3695(var5.method32149());
         }
      }
   }

   @Override
   public boolean method11648(BlockState var1) {
      return true;
   }

   @Override
   public int method11649(BlockState var1, World var2, BlockPos var3) {
      return Container.calcRedstone(var2.getTileEntity(var3));
   }

   @Override
   public BlockState method11500(BlockState var1, Class80 var2) {
      return var1.method23465(field18693, var2.method252(var1.<Direction>method23463(field18693)));
   }

   @Override
   public BlockState method11501(BlockState var1, Class2089 var2) {
      return var1.method23395(var2.method8749(var1.<Direction>method23463(field18693)));
   }

   @Override
   public void method11489(Class7558<Block, BlockState> var1) {
      var1.method24737(field18693, field18694);
   }

   @Override
   public BlockState method11495(Class5909 var1) {
      return this.method11579().method23465(field18693, var1.method18348().method536());
   }
}
