package mapped;

import it.unimi.dsi.fastutil.objects.Object2FloatMap;
import it.unimi.dsi.fastutil.objects.Object2FloatOpenHashMap;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.client.util.Util;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import java.util.Random;

public class Class3475 extends Block implements Class3476 {
   private static String[] field19325;
   public static final IntegerProperty field19326 = BlockStateProperties.field39752;
   public static final Object2FloatMap<IItemProvider> field19327 = new Object2FloatOpenHashMap();
   private static final VoxelShape field19328 = VoxelShapes.method27426();
   private static final VoxelShape[] field19329 = Util.<VoxelShape[]>make(
      new VoxelShape[9],
      var0 -> {
         for (int var3 = 0; var3 < 8; var3++) {
            var0[var3] = VoxelShapes.combineAndSimplify(
               field19328, Block.makeCuboidShape(2.0, (double)Math.max(2, 1 + var3 * 2), 2.0, 14.0, 16.0, 14.0), IBooleanFunction.ONLY_FIRST
            );
         }

         var0[8] = var0[7];
      }
   );

   public static void method12162() {
      field19327.defaultReturnValue(-1.0F);
      float var2 = 0.3F;
      float var3 = 0.5F;
      float var4 = 0.65F;
      float var5 = 0.85F;
      float var6 = 1.0F;
      method12163(0.3F, Items.field37294);
      method12163(0.3F, Items.field37291);
      method12163(0.3F, Items.field37292);
      method12163(0.3F, Items.field37296);
      method12163(0.3F, Items.field37295);
      method12163(0.3F, Items.field37293);
      method12163(0.3F, Items.field37245);
      method12163(0.3F, Items.field37246);
      method12163(0.3F, Items.field37247);
      method12163(0.3F, Items.field37248);
      method12163(0.3F, Items.field37249);
      method12163(0.3F, Items.field37250);
      method12163(0.3F, Items.field38112);
      method12163(0.3F, Items.field37958);
      method12163(0.3F, Items.field37311);
      method12163(0.3F, Items.field37356);
      method12163(0.3F, Items.field37960);
      method12163(0.3F, Items.field37959);
      method12163(0.3F, Items.field37314);
      method12163(0.3F, Items.field38170);
      method12163(0.3F, Items.field37841);
      method12163(0.5F, Items.field37898);
      method12163(0.5F, Items.field37599);
      method12163(0.5F, Items.field37427);
      method12163(0.5F, Items.field37355);
      method12163(0.5F, Items.field37473);
      method12163(0.5F, Items.field37352);
      method12163(0.5F, Items.field37353);
      method12163(0.5F, Items.field37354);
      method12163(0.5F, Items.field37957);
      method12163(0.65F, Items.field37315);
      method12163(0.65F, Items.field37485);
      method12163(0.65F, Items.field37438);
      method12163(0.65F, Items.field37439);
      method12163(0.65F, Items.field37472);
      method12163(0.65F, Items.field37795);
      method12163(0.65F, Items.field38111);
      method12163(0.65F, Items.field38052);
      method12163(0.65F, Items.field37916);
      method12163(0.65F, Items.field38053);
      method12163(0.65F, Items.field37842);
      method12163(0.65F, Items.field37346);
      method12163(0.65F, Items.field37347);
      method12163(0.65F, Items.field37468);
      method12163(0.65F, Items.field37348);
      method12163(0.65F, Items.field37349);
      method12163(0.65F, Items.field37970);
      method12163(0.65F, Items.field37350);
      method12163(0.65F, Items.field37351);
      method12163(0.65F, Items.field38173);
      method12163(0.65F, Items.field37333);
      method12163(0.65F, Items.field37334);
      method12163(0.65F, Items.field37335);
      method12163(0.65F, Items.field37336);
      method12163(0.65F, Items.field37337);
      method12163(0.65F, Items.field37338);
      method12163(0.65F, Items.field37339);
      method12163(0.65F, Items.field37340);
      method12163(0.65F, Items.field37341);
      method12163(0.65F, Items.field37342);
      method12163(0.65F, Items.field37343);
      method12163(0.65F, Items.field37344);
      method12163(0.65F, Items.field37345);
      method12163(0.65F, Items.field37312);
      method12163(0.65F, Items.field37595);
      method12163(0.65F, Items.field37596);
      method12163(0.65F, Items.field37597);
      method12163(0.65F, Items.field37598);
      method12163(0.65F, Items.field37600);
      method12163(0.85F, Items.field37571);
      method12163(0.85F, Items.field37466);
      method12163(0.85F, Items.field37467);
      method12163(0.85F, Items.field37647);
      method12163(0.85F, Items.field37648);
      method12163(0.85F, Items.field37843);
      method12163(0.85F, Items.field38054);
      method12163(0.85F, Items.field37954);
      method12163(1.0F, Items.field37937);
      method12163(1.0F, Items.field38067);
   }

   private static void method12163(float var0, IItemProvider var1) {
      field19327.put(var1.method11581(), var0);
   }

   public Class3475(Properties var1) {
      super(var1);
      this.method11578(this.field18612.method35393().with(field19326, Integer.valueOf(0)));
   }

   public static void method12164(World var0, BlockPos var1, boolean var2) {
      BlockState var5 = var0.getBlockState(var1);
      var0.method6745(
         (double)var1.getX(),
         (double)var1.getY(),
         (double)var1.getZ(),
         !var2 ? SoundEvents.field26464 : SoundEvents.field26465,
         Class2266.field14732,
         1.0F,
         1.0F,
         false
      );
      double var6 = var5.method23412(var0, var1).method19522(Direction.Axis.Y, 0.5, 0.5) + 0.03125;
      double var8 = 0.13125F;
      double var10 = 0.7375F;
      Random var12 = var0.method6814();

      for (int var13 = 0; var13 < 10; var13++) {
         double var14 = var12.nextGaussian() * 0.02;
         double var16 = var12.nextGaussian() * 0.02;
         double var18 = var12.nextGaussian() * 0.02;
         var0.addParticle(
            ParticleTypes.field34079,
            (double)var1.getX() + 0.13125F + 0.7375F * (double)var12.nextFloat(),
            (double)var1.getY() + var6 + (double)var12.nextFloat() * (1.0 - var6),
            (double)var1.getZ() + 0.13125F + 0.7375F * (double)var12.nextFloat(),
            var14,
            var16,
            var18
         );
      }
   }

   @Override
   public VoxelShape method11483(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      return field19329[var1.<Integer>get(field19326)];
   }

   @Override
   public VoxelShape method11938(BlockState var1, IBlockReader var2, BlockPos var3) {
      return field19328;
   }

   @Override
   public VoxelShape method11502(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      return field19329[0];
   }

   @Override
   public void method11589(BlockState var1, World var2, BlockPos var3, BlockState var4, boolean var5) {
      if (var1.<Integer>get(field19326) == 7) {
         var2.method6860().method20726(var3, var1.getBlock(), 20);
      }
   }

   @Override
   public ActionResultType method11505(BlockState var1, World var2, BlockPos var3, PlayerEntity var4, Hand var5, BlockRayTraceResult var6) {
      int var9 = var1.<Integer>get(field19326);
      ItemStack var10 = var4.getHeldItem(var5);
      if (var9 < 8 && field19327.containsKey(var10.getItem())) {
         if (var9 < 7 && !var2.isRemote) {
            BlockState var11 = method12168(var1, var2, var3, var10);
            var2.playEvent(1500, var3, var1 == var11 ? 0 : 1);
            if (!var4.abilities.isCreativeMode) {
               var10.shrink(1);
            }
         }

         return ActionResultType.method9002(var2.isRemote);
      } else if (var9 != 8) {
         return ActionResultType.field14820;
      } else {
         method12166(var1, var2, var3);
         return ActionResultType.method9002(var2.isRemote);
      }
   }

   public static BlockState method12165(BlockState var0, ServerWorld var1, ItemStack var2, BlockPos var3) {
      int var6 = var0.<Integer>get(field19326);
      if (var6 < 7 && field19327.containsKey(var2.getItem())) {
         BlockState var7 = method12168(var0, var1, var3, var2);
         var2.shrink(1);
         return var7;
      } else {
         return var0;
      }
   }

   public static BlockState method12166(BlockState var0, World var1, BlockPos var2) {
      if (!var1.isRemote) {
         float var5 = 0.7F;
         double var6 = (double)(var1.rand.nextFloat() * 0.7F) + 0.15F;
         double var8 = (double)(var1.rand.nextFloat() * 0.7F) + 0.060000002F + 0.6;
         double var10 = (double)(var1.rand.nextFloat() * 0.7F) + 0.15F;
         ItemEntity var12 = new ItemEntity(
            var1, (double)var2.getX() + var6, (double)var2.getY() + var8, (double)var2.getZ() + var10, new ItemStack(Items.field37934)
         );
         var12.setDefaultPickupDelay();
         var1.addEntity(var12);
      }

      BlockState var13 = method12167(var0, var1, var2);
      var1.method6742((PlayerEntity)null, var2, SoundEvents.field26463, Class2266.field14732, 1.0F, 1.0F);
      return var13;
   }

   private static BlockState method12167(BlockState var0, Class1660 var1, BlockPos var2) {
      BlockState var5 = var0.with(field19326, Integer.valueOf(0));
      var1.setBlockState(var2, var5, 3);
      return var5;
   }

   private static BlockState method12168(BlockState var0, Class1660 var1, BlockPos var2, ItemStack var3) {
      int var6 = var0.<Integer>get(field19326);
      float var7 = field19327.getFloat(var3.getItem());
      if ((var6 != 0 || !(var7 > 0.0F)) && !(var1.method6814().nextDouble() < (double)var7)) {
         return var0;
      } else {
         int var8 = var6 + 1;
         BlockState var9 = var0.with(field19326, Integer.valueOf(var8));
         var1.setBlockState(var2, var9, 3);
         if (var8 == 7) {
            var1.method6860().method20726(var2, var0.getBlock(), 20);
         }

         return var9;
      }
   }

   @Override
   public void method11522(BlockState var1, ServerWorld var2, BlockPos var3, Random var4) {
      if (var1.<Integer>get(field19326) == 7) {
         var2.setBlockState(var3, var1.method23459(field19326), 3);
         var2.method6742((PlayerEntity)null, var3, SoundEvents.field26466, Class2266.field14732, 1.0F, 1.0F);
      }
   }

   @Override
   public boolean method11648(BlockState var1) {
      return true;
   }

   @Override
   public int method11649(BlockState var1, World var2, BlockPos var3) {
      return var1.<Integer>get(field19326);
   }

   @Override
   public void method11489(Class7558<Block, BlockState> var1) {
      var1.method24737(field19326);
   }

   @Override
   public boolean method11494(BlockState var1, IBlockReader var2, BlockPos var3, Class1947 var4) {
      return false;
   }

   @Override
   public Class930 method12169(BlockState var1, Class1660 var2, BlockPos var3) {
      int var6 = var1.<Integer>get(field19326);
      return (Class930)(var6 != 8
         ? (Class930)(var6 >= 7 ? new Class976() : new Class975(var1, var2, var3))
         : new Class929(var1, var2, var3, new ItemStack(Items.field37934)));
   }

   // $VF: synthetic method
   public static BlockState method12171(BlockState var0, Class1660 var1, BlockPos var2) {
      return method12167(var0, var1, var2);
   }

   // $VF: synthetic method
   public static BlockState method12172(BlockState var0, Class1660 var1, BlockPos var2, ItemStack var3) {
      return method12168(var0, var1, var2, var3);
   }
}
