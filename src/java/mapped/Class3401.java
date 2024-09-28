package mapped;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.state.EnumProperty;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Direction;
import net.minecraft.util.Rotation;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

public class Class3401 extends Block {
   private static String[] field19059;
   public static final EnumProperty<Direction.Axis> field19060 = BlockStateProperties.field39712;
   public static final VoxelShape field19061 = Block.makeCuboidShape(0.0, 0.0, 6.0, 16.0, 16.0, 10.0);
   public static final VoxelShape field19062 = Block.makeCuboidShape(6.0, 0.0, 0.0, 10.0, 16.0, 16.0);

   public Class3401(Properties var1) {
      super(var1);
      this.method11578(this.field18612.method35393().with(field19060, Direction.Axis.X));
   }

   @Override
   public VoxelShape method11483(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      switch (Class9111.field41872[var1.<Direction.Axis>get(field19060).ordinal()]) {
         case 1:
            return field19062;
         case 2:
         default:
            return field19061;
      }
   }

   @Override
   public void method11484(BlockState var1, ServerWorld var2, BlockPos var3, Random var4) {
      if (var2.method6812().isNatural() && var2.getGameRules().getBoolean(Class5462.field24226) && var4.nextInt(2000) < var2.method6997().getId()) {
         while (var2.getBlockState(var3).isIn(this)) {
            var3 = var3.down();
         }

         if (var2.getBlockState(var3).method23385(var2, var3, EntityType.field41110)) {
            Entity var7 = EntityType.field41110
               .method33201(var2, (CompoundNBT)null, (ITextComponent)null, (PlayerEntity)null, var3.up(), Class2202.field14394, false, false);
            if (var7 != null) {
               var7.method3218();
            }
         }
      }
   }

   @Override
   public BlockState method11491(BlockState var1, Direction var2, BlockState var3, Class1660 var4, BlockPos var5, BlockPos var6) {
      Direction.Axis var9 = var2.getAxis();
      Direction.Axis var10 = var1.<Direction.Axis>get(field19060);
      boolean var11 = var10 != var9 && var9.method324();
      return !var11 && !var3.isIn(this) && !new Class7473(var4, var5, var10).method24205()
         ? Blocks.AIR.method11579()
         : super.method11491(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public void method11523(BlockState var1, World var2, BlockPos var3, Entity var4) {
      if (!var4.isPassenger() && !var4.isBeingRidden() && var4.method3367()) {
         var4.setPortal(var3);
      }
   }

   @Override
   public void method11512(BlockState var1, World var2, BlockPos var3, Random var4) {
      if (var4.nextInt(100) == 0) {
         var2.method6745(
            (double)var3.getX() + 0.5,
            (double)var3.getY() + 0.5,
            (double)var3.getZ() + 0.5,
            SoundEvents.field26976,
            Class2266.field14732,
            0.5F,
            var4.nextFloat() * 0.4F + 0.8F,
            false
         );
      }

      for (int var7 = 0; var7 < 4; var7++) {
         double var8 = (double)var3.getX() + var4.nextDouble();
         double var10 = (double)var3.getY() + var4.nextDouble();
         double var12 = (double)var3.getZ() + var4.nextDouble();
         double var14 = ((double)var4.nextFloat() - 0.5) * 0.5;
         double var16 = ((double)var4.nextFloat() - 0.5) * 0.5;
         double var18 = ((double)var4.nextFloat() - 0.5) * 0.5;
         int var20 = var4.nextInt(2) * 2 - 1;
         if (!var2.getBlockState(var3.west()).isIn(this) && !var2.getBlockState(var3.east()).isIn(this)) {
            var8 = (double)var3.getX() + 0.5 + 0.25 * (double)var20;
            var14 = (double)(var4.nextFloat() * 2.0F * (float)var20);
         } else {
            var12 = (double)var3.getZ() + 0.5 + 0.25 * (double)var20;
            var18 = (double)(var4.nextFloat() * 2.0F * (float)var20);
         }

         var2.addParticle(ParticleTypes.field34090, var8, var10, var12, var14, var16, var18);
      }
   }

   @Override
   public ItemStack getItem(IBlockReader var1, BlockPos var2, BlockState var3) {
      return ItemStack.EMPTY;
   }

   @Override
   public BlockState rotate(BlockState var1, Rotation var2) {
      switch (Class9111.field41873[var2.ordinal()]) {
         case 1:
         case 2:
            switch (Class9111.field41872[var1.<Direction.Axis>get(field19060).ordinal()]) {
               case 1:
                  return var1.with(field19060, Direction.Axis.X);
               case 2:
                  return var1.with(field19060, Direction.Axis.Z);
               default:
                  return var1;
            }
         default:
            return var1;
      }
   }

   @Override
   public void method11489(Class7558<Block, BlockState> var1) {
      var1.method24737(field19060);
   }
}
