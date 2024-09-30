package net.minecraft.block;

import mapped.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.PushReaction;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.ItemStack;
import net.minecraft.pathfinding.PathType;
import net.minecraft.util.*;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public abstract class AbstractBlock {
   public static final Direction[] field19003 = new Direction[]{
      Direction.WEST, Direction.EAST, Direction.NORTH, Direction.SOUTH, Direction.DOWN, Direction.UP
   };
   public final Material field19004;
   public final boolean canCollide;
   public final float field19006;
   public final boolean field19007;
   public final SoundType field19008;
   public final float field19009;
   public final float field19010;
   public final float field19011;
   public final boolean field19012;
   public final Properties field19013;
   public ResourceLocation field19014;

   public AbstractBlock(Properties var1) {
      this.field19004 = Properties.method26643(var1);
      this.canCollide = Properties.method26644(var1);
      this.field19014 = Properties.method26645(var1);
      this.field19006 = Properties.method26646(var1);
      this.field19007 = Properties.method26647(var1);
      this.field19008 = Properties.method26648(var1);
      this.field19009 = Properties.method26649(var1);
      this.field19010 = Properties.method26650(var1);
      this.field19011 = Properties.method26651(var1);
      this.field19012 = Properties.method26652(var1);
      this.field19013 = var1;
   }

   @Deprecated
   public void method11618(BlockState var1, IWorld var2, BlockPos var3, int var4, int var5) {
   }

   @Deprecated
   public boolean allowsMovement(BlockState var1, IBlockReader var2, BlockPos var3, PathType var4) {
      switch (Class8735.field39385[var4.ordinal()]) {
         case 1:
            return !var1.method23456(var2, var3);
         case 2:
            return var2.getFluidState(var3).method23486(FluidTags.field40469);
         case 3:
            return !var1.method23456(var2, var3);
         default:
            return false;
      }
   }

   @Deprecated
   public BlockState updatePostPlacement(BlockState var1, Direction var2, BlockState var3, IWorld var4, BlockPos var5, BlockPos var6) {
      return var1;
   }

   @Deprecated
   public boolean method11634(BlockState var1, BlockState var2, Direction var3) {
      return false;
   }

   @Deprecated
   public void method11506(BlockState var1, World var2, BlockPos var3, Block var4, BlockPos var5, boolean var6) {
      Class7393.method23618(var2, var3);
   }

   @Deprecated
   public void onBlockAdded(BlockState var1, World var2, BlockPos var3, BlockState var4, boolean var5) {
   }

   @Deprecated
   public void onReplaced(BlockState var1, World var2, BlockPos var3, BlockState var4, boolean var5) {
      if (this.isTileEntityProvider() && !var1.isIn(var4.getBlock())) {
         var2.method6762(var3);
      }
   }

   @Deprecated
   public ActionResultType onBlockActivated(BlockState var1, World var2, BlockPos var3, PlayerEntity var4, Hand var5, BlockRayTraceResult var6) {
      return ActionResultType.field14820;
   }

   @Deprecated
   public boolean method11647(BlockState var1, World var2, BlockPos var3, int var4, int var5) {
      return false;
   }

   @Deprecated
   public BlockRenderType method11526(BlockState var1) {
      return BlockRenderType.MODEL;
   }

   @Deprecated
   public boolean isTransparent(BlockState var1) {
      return false;
   }

   @Deprecated
   public boolean method11516(BlockState var1) {
      return false;
   }

   @Deprecated
   public PushReaction method11689(BlockState var1) {
      return this.field19004.getPushReaction();
   }

   @Deprecated
   public FluidState getFluidState(BlockState var1) {
      return Fluids.EMPTY.method25049();
   }

   @Deprecated
   public boolean method11648(BlockState var1) {
      return false;
   }

   public Class2260 method11994() {
      return Class2260.field14702;
   }

   @Deprecated
   public BlockState rotate(BlockState var1, Rotation var2) {
      return var1;
   }

   @Deprecated
   public BlockState mirror(BlockState var1, Mirror var2) {
      return var1;
   }

   @Deprecated
   public boolean method11497(BlockState var1, BlockItemUseContext var2) {
      return this.field19004.isReplaceable() && (var2.method18357().isEmpty() || var2.method18357().getItem() != this.method11581());
   }

   @Deprecated
   public boolean method11650(BlockState var1, Fluid var2) {
      return this.field19004.isReplaceable() || !this.field19004.isSolid();
   }

   @Deprecated
   public List<ItemStack> method11697(BlockState var1, Class9464 var2) {
      ResourceLocation var5 = this.method11999();
      if (var5 != Class8793.field39533) {
         LootContext var6 = var2.method36454(Class9525.field44336, var1).method36460(Class8524.field38292);
         ServerWorld var7 = var6.method26090();
         Class7318 var8 = var7.getServer().method1411().method1058(var5);
         return var8.method23182(var6);
      } else {
         return Collections.<ItemStack>emptyList();
      }
   }

   @Deprecated
   public long method11691(BlockState var1, BlockPos var2) {
      return MathHelper.method37809(var2);
   }

   @Deprecated
   public VoxelShape method11503(BlockState var1, IBlockReader var2, BlockPos var3) {
      return var1.method23412(var2, var3);
   }

   @Deprecated
   public VoxelShape method11995(BlockState var1, IBlockReader var2, BlockPos var3) {
      return this.method11502(var1, var2, var3, ISelectionContext.method14947());
   }

   @Deprecated
   public VoxelShape method11938(BlockState var1, IBlockReader var2, BlockPos var3) {
      return VoxelShapes.empty();
   }

   @Deprecated
   public int method11996(BlockState var1, IBlockReader var2, BlockPos var3) {
      if (!var1.method23409(var2, var3)) {
         return !var1.method23386(var2, var3) ? 1 : 0;
      } else {
         return var2.getMaxLightLevel();
      }
   }

   @Nullable
   @Deprecated
   public Class949 method11528(BlockState var1, World var2, BlockPos var3) {
      return null;
   }

   @Deprecated
   public boolean isValidPosition(BlockState var1, IWorldReader var2, BlockPos var3) {
      return true;
   }

   @Deprecated
   public float method11636(BlockState var1, IBlockReader var2, BlockPos var3) {
      return !var1.method23456(var2, var3) ? 1.0F : 0.2F;
   }

   @Deprecated
   public int method11649(BlockState var1, World var2, BlockPos var3) {
      return 0;
   }

   @Deprecated
   public VoxelShape getShape(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      return VoxelShapes.method27426();
   }

   @Deprecated
   public VoxelShape method11502(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      return !this.canCollide ? VoxelShapes.empty() : var1.method23412(var2, var3);
   }

   @Deprecated
   public VoxelShape method11635(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      return this.method11502(var1, var2, var3, var4);
   }

   @Deprecated
   public void randomTick(BlockState var1, ServerWorld var2, BlockPos var3, Random var4) {
      this.tick(var1, var2, var3, var4);
   }

   @Deprecated
   public void tick(BlockState var1, ServerWorld var2, BlockPos var3, Random var4) {
   }

   @Deprecated
   public float method11997(BlockState var1, PlayerEntity var2, IBlockReader var3, BlockPos var4) {
      float var7 = var1.getBlockHardness(var3, var4);
      if (var7 != -1.0F) {
         int var8 = !var2.method2884(var1) ? 100 : 30;
         return var2.method2883(var1) / var7 / (float)var8;
      } else {
         return 0.0F;
      }
   }

   @Deprecated
   public void method11965(BlockState var1, ServerWorld var2, BlockPos var3, ItemStack var4) {
   }

   @Deprecated
   public void onBlockClicked(BlockState var1, World var2, BlockPos var3, PlayerEntity var4) {
   }

   @Deprecated
   public int method11514(BlockState var1, IBlockReader var2, BlockPos var3, Direction var4) {
      return 0;
   }

   @Deprecated
   public void onEntityCollision(BlockState var1, World var2, BlockPos var3, Entity var4) {
   }

   @Deprecated
   public int method11515(BlockState var1, IBlockReader var2, BlockPos var3, Direction var4) {
      return 0;
   }

   public final boolean isTileEntityProvider() {
      return this instanceof Class3245;
   }

   public final ResourceLocation method11999() {
      if (this.field19014 == null) {
         ResourceLocation var3 = Registry.BLOCK.getKey(this.method11584());
         this.field19014 = new ResourceLocation(var3.getNamespace(), "blocks/" + var3.getPath());
      }

      return this.field19014;
   }

   @Deprecated
   public void method11595(World var1, BlockState var2, BlockRayTraceResult var3, ProjectileEntity var4) {
   }

   public abstract Item method11581();

   public abstract Block method11584();

   public MaterialColor method12000() {
      return (MaterialColor) Properties.method26653(this.field19013).apply(this.method11584().getDefaultState());
   }

   public static class Properties {
      private static String[] field33963;
      private Material field33964;
      private Function<BlockState, MaterialColor> field33965;
      private boolean field33966 = true;
      private SoundType field33967 = SoundType.field36204;
      private ToIntFunction<BlockState> field33968 = var0 -> 0;
      private float field33969;
      private float field33970;
      private boolean field33971;
      private boolean field33972;
      private float field33973 = 0.6F;
      private float field33974 = 1.0F;
      private float field33975 = 1.0F;
      private ResourceLocation field33976;
      private boolean field33977 = true;
      private boolean field33978;
      private Class9817<EntityType<?>> field33979 = (var0, var1x, var2x, var3) -> var0.method23454(var1x, var2x, Direction.UP) && var0.getLightValue() < 14;
      private Class8609 field33980 = (var0, var1x, var2x) -> var0.getMaterial().isOpaque() && var0.method23456(var1x, var2x);
      private Class8609 field33981 = (var1x, var2x, var3) -> this.field33964.blocksMovement() && var1x.method23456(var2x, var3);
      private Class8609 field33982 = this.field33981;
      private Class8609 field33983 = (var0, var1x, var2x) -> false;
      private Class8609 field33984 = (var0, var1x, var2x) -> false;
      private boolean field33985;

      private Properties(Material var1, MaterialColor var2) {
         this(var1, var1x -> var2);
      }

      private Properties(Material var1, Function<BlockState, MaterialColor> var2) {
         this.field33964 = var1;
         this.field33965 = var2;
      }

      public static Properties method26609(Material var0) {
         return method26611(var0, var0.getColor());
      }

      public static Properties method26610(Material var0, Class112 var1) {
         return method26611(var0, var1.method312());
      }

      public static Properties method26611(Material var0, MaterialColor var1) {
         return new Properties(var0, var1);
      }

      public static Properties method26612(Material var0, Function<BlockState, MaterialColor> var1) {
         return new Properties(var0, var1);
      }

      public static Properties method26613(AbstractBlock var0) {
         Properties var3 = new Properties(var0.field19004, var0.field19013.field33965);
         var3.field33964 = var0.field19013.field33964;
         var3.field33970 = var0.field19013.field33970;
         var3.field33969 = var0.field19013.field33969;
         var3.field33966 = var0.field19013.field33966;
         var3.field33972 = var0.field19013.field33972;
         var3.field33968 = var0.field19013.field33968;
         var3.field33965 = var0.field19013.field33965;
         var3.field33967 = var0.field19013.field33967;
         var3.field33973 = var0.field19013.field33973;
         var3.field33974 = var0.field19013.field33974;
         var3.field33985 = var0.field19013.field33985;
         var3.field33977 = var0.field19013.field33977;
         var3.field33978 = var0.field19013.field33978;
         var3.field33971 = var0.field19013.field33971;
         return var3;
      }

      public Properties method26614() {
         this.field33966 = false;
         this.field33977 = false;
         return this;
      }

      public Properties method26615() {
         this.field33977 = false;
         return this;
      }

      public Properties method26616(float var1) {
         this.field33973 = var1;
         return this;
      }

      public Properties method26617(float var1) {
         this.field33974 = var1;
         return this;
      }

      public Properties method26618(float var1) {
         this.field33975 = var1;
         return this;
      }

      public Properties method26619(SoundType var1) {
         this.field33967 = var1;
         return this;
      }

      public Properties method26620(ToIntFunction<BlockState> var1) {
         this.field33968 = var1;
         return this;
      }

      public Properties method26621(float var1, float var2) {
         this.field33970 = var1;
         this.field33969 = Math.max(0.0F, var2);
         return this;
      }

      public Properties method26622() {
         return this.method26623(0.0F);
      }

      public Properties method26623(float var1) {
         this.method26621(var1, var1);
         return this;
      }

      public Properties method26624() {
         this.field33972 = true;
         return this;
      }

      public Properties method26625() {
         this.field33985 = true;
         return this;
      }

      public Properties method26626() {
         this.field33976 = Class8793.field39533;
         return this;
      }

      public Properties method26627(Block var1) {
         this.field33976 = var1.method11999();
         return this;
      }

      public Properties method26628() {
         this.field33978 = true;
         return this;
      }

      public Properties method26629(Class9817<EntityType<?>> var1) {
         this.field33979 = var1;
         return this;
      }

      public Properties method26630(Class8609 var1) {
         this.field33980 = var1;
         return this;
      }

      public Properties method26631(Class8609 var1) {
         this.field33981 = var1;
         return this;
      }

      public Properties method26632(Class8609 var1) {
         this.field33982 = var1;
         return this;
      }

      public Properties method26633(Class8609 var1) {
         this.field33983 = var1;
         return this;
      }

      public Properties method26634(Class8609 var1) {
         this.field33984 = var1;
         return this;
      }

      public Properties method26635() {
         this.field33971 = true;
         return this;
      }

      // $VF: synthetic method
      public static Material method26643(Properties var0) {
         return var0.field33964;
      }

      // $VF: synthetic method
      public static boolean method26644(Properties var0) {
         return var0.field33966;
      }

      // $VF: synthetic method
      public static ResourceLocation method26645(Properties var0) {
         return var0.field33976;
      }

      // $VF: synthetic method
      public static float method26646(Properties var0) {
         return var0.field33969;
      }

      // $VF: synthetic method
      public static boolean method26647(Properties var0) {
         return var0.field33972;
      }

      // $VF: synthetic method
      public static SoundType method26648(Properties var0) {
         return var0.field33967;
      }

      // $VF: synthetic method
      public static float method26649(Properties var0) {
         return var0.field33973;
      }

      // $VF: synthetic method
      public static float method26650(Properties var0) {
         return var0.field33974;
      }

      // $VF: synthetic method
      public static float method26651(Properties var0) {
         return var0.field33975;
      }

      // $VF: synthetic method
      public static boolean method26652(Properties var0) {
         return var0.field33985;
      }

      // $VF: synthetic method
      public static Function method26653(Properties var0) {
         return var0.field33965;
      }

      // $VF: synthetic method
      public static ToIntFunction method26654(Properties var0) {
         return var0.field33968;
      }

      // $VF: synthetic method
      public static boolean method26655(Properties var0) {
         return var0.field33978;
      }

      // $VF: synthetic method
      public static float method26656(Properties var0) {
         return var0.field33970;
      }

      // $VF: synthetic method
      public static boolean method26657(Properties var0) {
         return var0.field33971;
      }

      // $VF: synthetic method
      public static boolean method26658(Properties var0) {
         return var0.field33977;
      }

      // $VF: synthetic method
      public static Class8609 method26659(Properties var0) {
         return var0.field33980;
      }

      // $VF: synthetic method
      public static Class8609 method26660(Properties var0) {
         return var0.field33981;
      }

      // $VF: synthetic method
      public static Class8609 method26661(Properties var0) {
         return var0.field33982;
      }

      // $VF: synthetic method
      public static Class8609 method26662(Properties var0) {
         return var0.field33983;
      }

      // $VF: synthetic method
      public static Class8609 method26663(Properties var0) {
         return var0.field33984;
      }

      // $VF: synthetic method
      public static Class9817 method26664(Properties var0) {
         return var0.field33979;
      }
   }
}
