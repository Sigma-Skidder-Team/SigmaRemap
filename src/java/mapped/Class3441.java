package mapped;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tags.BlockTags;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import java.util.Random;
import javax.annotation.Nullable;

public class Class3441 extends Block {
   private static String[] field19240;
   private static final VoxelShape field19241 = Block.makeCuboidShape(3.0, 0.0, 3.0, 12.0, 7.0, 12.0);
   private static final VoxelShape field19242 = Block.makeCuboidShape(1.0, 0.0, 1.0, 15.0, 7.0, 15.0);
   public static final IntegerProperty field19243 = BlockStateProperties.field39749;
   public static final IntegerProperty field19244 = BlockStateProperties.field39748;

   public Class3441(Properties var1) {
      super(var1);
      this.method11578(this.field18612.method35393().with(field19243, Integer.valueOf(0)).with(field19244, Integer.valueOf(1)));
   }

   @Override
   public void onEntityWalk(World var1, BlockPos var2, Entity var3) {
      this.method12112(var1, var2, var3, 100);
      super.onEntityWalk(var1, var2, var3);
   }

   @Override
   public void onFallenUpon(World var1, BlockPos var2, Entity var3, float var4) {
      if (!(var3 instanceof ZombieEntity)) {
         this.method12112(var1, var2, var3, 3);
      }

      super.onFallenUpon(var1, var2, var3, var4);
   }

   private void method12112(World var1, BlockPos var2, Entity var3, int var4) {
      if (this.method12117(var1, var3) && !var1.isRemote && var1.rand.nextInt(var4) == 0) {
         BlockState var7 = var1.getBlockState(var2);
         if (var7.isIn(Blocks.field36964)) {
            this.method12113(var1, var2, var7);
         }
      }
   }

   private void method12113(World var1, BlockPos var2, BlockState var3) {
      var1.method6742((PlayerEntity)null, var2, SoundEvents.field27167, Class2266.field14732, 0.7F, 0.9F + var1.rand.nextFloat() * 0.2F);
      int var6 = var3.<Integer>get(field19244);
      if (var6 > 1) {
         var1.setBlockState(var2, var3.with(field19244, Integer.valueOf(var6 - 1)), 2);
         var1.playEvent(2001, var2, Block.getStateId(var3));
      } else {
         var1.method7179(var2, false);
      }
   }

   @Override
   public void method11484(BlockState var1, ServerWorld var2, BlockPos var3, Random var4) {
      if (this.method12116(var2) && method12114(var2, var3)) {
         int var7 = var1.<Integer>get(field19243);
         if (var7 >= 2) {
            var2.method6742((PlayerEntity)null, var3, SoundEvents.field27169, Class2266.field14732, 0.7F, 0.9F + var4.nextFloat() * 0.2F);
            var2.removeBlock(var3, false);

            for (int var8 = 0; var8 < var1.<Integer>get(field19244); var8++) {
               var2.playEvent(2001, var3, Block.getStateId(var1));
               Class1088 var9 = EntityType.field41096.create(var2);
               var9.method4770(-24000);
               var9.method5041(var3);
               var9.setLocationAndAngles((double)var3.getX() + 0.3 + (double)var8 * 0.2, (double)var3.getY(), (double)var3.getZ() + 0.3, 0.0F, 0.0F);
               var2.addEntity(var9);
            }
         } else {
            var2.method6742((PlayerEntity)null, var3, SoundEvents.field27168, Class2266.field14732, 0.7F, 0.9F + var4.nextFloat() * 0.2F);
            var2.setBlockState(var3, var1.with(field19243, Integer.valueOf(var7 + 1)), 2);
         }
      }
   }

   public static boolean method12114(IBlockReader var0, BlockPos var1) {
      return method12115(var0, var1.down());
   }

   public static boolean method12115(IBlockReader var0, BlockPos var1) {
      return var0.getBlockState(var1).isIn(BlockTags.field32761);
   }

   @Override
   public void method11589(BlockState var1, World var2, BlockPos var3, BlockState var4, boolean var5) {
      if (method12114(var2, var3) && !var2.isRemote) {
         var2.playEvent(2005, var3, 0);
      }
   }

   private boolean method12116(World var1) {
      float var4 = var1.method7001(1.0F);
      return (double)var4 < 0.69 && (double)var4 > 0.65 ? true : var1.rand.nextInt(500) == 0;
   }

   @Override
   public void method11562(World var1, PlayerEntity var2, BlockPos var3, BlockState var4, TileEntity var5, ItemStack var6) {
      super.method11562(var1, var2, var3, var4, var5, var6);
      this.method12113(var1, var3, var4);
   }

   @Override
   public boolean method11497(BlockState var1, Class5909 var2) {
      return var2.method18357().getItem() == this.method11581() && var1.<Integer>get(field19244) < 4 ? true : super.method11497(var1, var2);
   }

   @Nullable
   @Override
   public BlockState method11495(Class5909 var1) {
      BlockState var4 = var1.method18360().getBlockState(var1.method18345());
      return !var4.isIn(this)
         ? super.method11495(var1)
         : var4.with(field19244, Integer.valueOf(Math.min(4, var4.<Integer>get(field19244) + 1)));
   }

   @Override
   public VoxelShape method11483(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      return var1.<Integer>get(field19244) <= 1 ? field19241 : field19242;
   }

   @Override
   public void method11489(Class7558<Block, BlockState> var1) {
      var1.method24737(field19243, field19244);
   }

   private boolean method12117(World var1, Entity var2) {
      if (var2 instanceof Class1088 || var2 instanceof Class1114) {
         return false;
      } else {
         return !(var2 instanceof LivingEntity) ? false : var2 instanceof PlayerEntity || var1.getGameRules().getBoolean(Class5462.field24224);
      }
   }
}
