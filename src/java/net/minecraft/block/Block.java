package net.minecraft.block;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.LoadingCache;
import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.impl.EventRenderBlocks;
import it.unimi.dsi.fastutil.objects.Object2ByteLinkedOpenHashMap;
import mapped.*;
import net.minecraft.client.util.Util;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.ItemStack;
import net.minecraft.state.StateContainer;
import net.minecraft.tags.BlockTags;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ObjectIntIdentityMap;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class Block extends AbstractBlock implements IItemProvider {
   public static final Logger field18609 = LogManager.getLogger();
   public static final ObjectIntIdentityMap<BlockState> field18610 = new ObjectIntIdentityMap<BlockState>();
   private static final LoadingCache<VoxelShape, Boolean> field18611 = CacheBuilder.newBuilder().maximumSize(512L).weakKeys().build(new Class4562());
   public final StateContainer<Block, BlockState> stateContainer;
   private BlockState field18613;
   private String field18614;
   private Item field18615;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<Class8570>> field18616 = ThreadLocal.<Object2ByteLinkedOpenHashMap<Class8570>>withInitial(
      () -> {
         Class2360 var2 = new Class2360(2048, 0.25F);
         var2.defaultReturnValue((byte)127);
         return var2;
      }
   );

   public static int getStateId(BlockState var0) {
      if (var0 != null) {
         int var3 = field18610.getId(var0);
         return var3 != -1 ? var3 : 0;
      } else {
         return 0;
      }
   }

   public static BlockState method11536(int var0) {
      BlockState var3 = field18610.getByValue(var0);
      return var3 != null ? var3 : Blocks.AIR.getDefaultState();
   }

   public static Block method11537(Item var0) {
      return !(var0 instanceof Class3292) ? Blocks.AIR : ((Class3292)var0).method11845();
   }

   public static BlockState method11538(BlockState var0, BlockState var1, World var2, BlockPos var3) {
      VoxelShape var6 = VoxelShapes.method27434(var0.method23414(var2, var3), var1.method23414(var2, var3), IBooleanFunction.field44039)
         .withOffset((double)var3.getX(), (double)var3.getY(), (double)var3.getZ());

      for (Entity var8 : var2.method7181((Entity)null, var6.getBoundingBox())) {
         double var9 = VoxelShapes.method27437(Direction.Axis.Y, var8.getBoundingBox().offset(0.0, 1.0, 0.0), Stream.<VoxelShape>of(var6), -1.0);
         var8.setPositionAndUpdate(var8.getPosX(), var8.getPosY() + 1.0 + var9, var8.getPosZ());
      }

      return var1;
   }

   public static VoxelShape makeCuboidShape(double var0, double var2, double var4, double var6, double var8, double var10) {
      return VoxelShapes.create(var0 / 16.0, var2 / 16.0, var4 / 16.0, var6 / 16.0, var8 / 16.0, var10 / 16.0);
   }

   public boolean isIn(ITag<Block> var1) {
      return var1.method24917(this);
   }

   public boolean method11541(Block var1) {
      return this == var1;
   }

   public static BlockState method11542(BlockState var0, IWorld var1, BlockPos var2) {
      BlockState var5 = var0;
      BlockPos.Mutable var6 = new BlockPos.Mutable();

      for (Direction var10 : field19003) {
         var6.method8377(var2, var10);
         var5 = var5.method23439(var10, var1.getBlockState(var6), var1, var2, var6);
      }

      return var5;
   }

   public static void method11543(BlockState var0, BlockState var1, IWorld var2, BlockPos var3, int var4) {
      method11544(var0, var1, var2, var3, var4, 512);
   }

   public static void method11544(BlockState var0, BlockState var1, IWorld var2, BlockPos var3, int var4, int var5) {
      if (var1 != var0) {
         if (!var1.isAir()) {
            var2.setBlockState(var3, var1, var4 & -33, var5);
         } else if (!var2.isRemote()) {
            var2.destroyBlock(var3, (var4 & 32) == 0, (Entity)null, var5);
         }
      }
   }

   public Block(Properties var1) {
      super(var1);
      StateContainer.Builder<Block, BlockState> var4 = new StateContainer.Builder<>(this);
      this.fillStateContainer(var4);
      this.stateContainer = var4.method24739(Block::getDefaultState, BlockState::new);
      this.setDefaultState(this.stateContainer.getBaseState());
   }

   public static boolean method11545(Block var0) {
      return var0 instanceof Class3465
         || var0 == Blocks.field36765
         || var0 == Blocks.field36589
         || var0 == Blocks.field36590
         || var0 == Blocks.MELON
         || var0 == Blocks.PUMPKIN
         || var0.isIn(BlockTags.field32805);
   }

   public boolean ticksRandomly(BlockState var1) {
      return this.field19007;
   }

   public static boolean method11546(BlockState var0, IBlockReader var1, BlockPos var2, Direction var3) {
      BlockPos var6 = var2.offset(var3);
      BlockState var7 = var1.getBlockState(var6);
      EventRenderBlocks var8 = new EventRenderBlocks(var0);
      Client.getInstance().getEventManager().call(var8);
      if (!var8.isCancelled()) {
         if (!var8.method13971()) {
            if (!var0.method23411(var7, var3)) {
               if (!var7.method23410()) {
                  return true;
               } else {
                  Class8570 var9 = new Class8570(var0, var7, var3);
                  Object2ByteLinkedOpenHashMap var10 = field18616.get();
                  byte var11 = var10.getAndMoveToFirst(var9);
                  if (var11 == 127) {
                     VoxelShape var12 = var0.method23388(var1, var2, var3);
                     VoxelShape var13 = var7.method23388(var1, var6, var3.getOpposite());
                     boolean var14 = VoxelShapes.compare(var12, var13, IBooleanFunction.ONLY_FIRST);
                     if (var10.size() == 2048) {
                        var10.removeLastByte();
                     }

                     var10.putAndMoveToFirst(var9, (byte)(!var14 ? 0 : 1));
                     return var14;
                  } else {
                     return var11 != 0;
                  }
               }
            } else {
               return false;
            }
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   public static boolean method11547(IBlockReader var0, BlockPos var1) {
      return var0.getBlockState(var1).method23455(var0, var1, Direction.UP, Class2156.field14142);
   }

   public static boolean method11548(IWorldReader var0, BlockPos var1, Direction var2) {
      BlockState var5 = var0.getBlockState(var1);
      return var2 == Direction.DOWN && var5.isIn(BlockTags.field32813) ? false : var5.method23455(var0, var1, var2, Class2156.field14141);
   }

   public static boolean method11549(VoxelShape var0, Direction var1) {
      VoxelShape var4 = var0.method19526(var1);
      return method11550(var4);
   }

   public static boolean method11550(VoxelShape var0) {
      return (Boolean)field18611.getUnchecked(var0);
   }

   public boolean method11493(BlockState var1, IBlockReader var2, BlockPos var3) {
      return !method11550(var1.method23412(var2, var3)) && var1.method23449().method23474();
   }

   public void animateTick(BlockState var1, World var2, BlockPos var3, Random var4) {
   }

   public void onPlayerDestroy(IWorld var1, BlockPos var2, BlockState var3) {
   }

   public static List<ItemStack> method11552(BlockState var0, ServerWorld var1, BlockPos var2, TileEntity var3) {
      Class9464 var6 = new Class9464(var1)
         .method36450(var1.rand)
         .method36454(Class9525.field44335, Vector3d.method11328(var2))
         .method36454(Class9525.field44338, ItemStack.EMPTY)
         .method36455(Class9525.field44337, var3);
      return var0.method23434(var6);
   }

   public static List<ItemStack> method11553(BlockState var0, ServerWorld var1, BlockPos var2, TileEntity var3, Entity var4, ItemStack var5) {
      Class9464 var8 = new Class9464(var1)
         .method36450(var1.rand)
         .method36454(Class9525.field44335, Vector3d.method11328(var2))
         .method36454(Class9525.field44338, var5)
         .method36455(Class9525.field44330, var4)
         .method36455(Class9525.field44337, var3);
      return var0.method23434(var8);
   }

   public static void method11554(BlockState var0, World var1, BlockPos var2) {
      if (var1 instanceof ServerWorld) {
         method11552(var0, (ServerWorld)var1, var2, (TileEntity)null).forEach(var2x -> method11557(var1, var2, var2x));
         var0.method23433((ServerWorld)var1, var2, ItemStack.EMPTY);
      }
   }

   public static void method11555(BlockState var0, IWorld var1, BlockPos var2, TileEntity var3) {
      if (var1 instanceof ServerWorld) {
         method11552(var0, (ServerWorld)var1, var2, var3).forEach(var2x -> method11557((ServerWorld)var1, var2, var2x));
         var0.method23433((ServerWorld)var1, var2, ItemStack.EMPTY);
      }
   }

   public static void spawnDrops(BlockState var0, World var1, BlockPos var2, TileEntity var3, Entity var4, ItemStack var5) {
      if (var1 instanceof ServerWorld) {
         method11553(var0, (ServerWorld)var1, var2, var3, var4, var5).forEach(var2x -> method11557(var1, var2, var2x));
         var0.method23433((ServerWorld)var1, var2, var5);
      }
   }

   public static void method11557(World var0, BlockPos var1, ItemStack var2) {
      if (!var0.isRemote && !var2.isEmpty() && var0.getGameRules().getBoolean(Class5462.field24228)) {
         float var5 = 0.5F;
         double var6 = (double)(var0.rand.nextFloat() * 0.5F) + 0.25;
         double var8 = (double)(var0.rand.nextFloat() * 0.5F) + 0.25;
         double var10 = (double)(var0.rand.nextFloat() * 0.5F) + 0.25;
         ItemEntity var12 = new ItemEntity(var0, (double)var1.getX() + var6, (double)var1.getY() + var8, (double)var1.getZ() + var10, var2);
         var12.setDefaultPickupDelay();
         var0.addEntity(var12);
      }
   }

   public void method11558(ServerWorld var1, BlockPos var2, int var3) {
      if (var1.getGameRules().getBoolean(Class5462.field24228)) {
         while (var3 > 0) {
            int var6 = ExperienceOrbEntity.getXPSplit(var3);
            var3 -= var6;
            var1.addEntity(new ExperienceOrbEntity(var1, (double)var2.getX() + 0.5, (double)var2.getY() + 0.5, (double)var2.getZ() + 0.5, var6));
         }
      }
   }

   public float getExplosionResistance() {
      return this.field19006;
   }

   public void onExplosionDestroy(World var1, BlockPos var2, Explosion var3) {
   }

   public void onEntityWalk(World var1, BlockPos var2, Entity var3) {
   }

   @Nullable
   public BlockState getStateForPlacement(BlockItemUseContext var1) {
      return this.getDefaultState();
   }

   public void method11562(World var1, PlayerEntity var2, BlockPos var3, BlockState var4, TileEntity var5, ItemStack var6) {
      var2.addStat(Stats.field40096.method172(this));
      var2.method2931(0.005F);
      spawnDrops(var4, var1, var3, var5, var2, var6);
   }

   public void method11563(World var1, BlockPos var2, BlockState var3, LivingEntity var4, ItemStack var5) {
   }

   public boolean method11564() {
      return !this.field19004.isSolid() && !this.field19004.isLiquid();
   }

   public IFormattableTextComponent method11565() {
      return new TranslationTextComponent(this.getTranslationKey());
   }

   public String getTranslationKey() {
      if (this.field18614 == null) {
         this.field18614 = Util.makeTranslationKey("block", Registry.BLOCK.getKey(this));
      }

      return this.field18614;
   }

   public void onFallenUpon(World var1, BlockPos var2, Entity var3, float var4) {
      var3.onLivingFall(var4, 1.0F);
   }

   public void method11568(IBlockReader var1, Entity var2) {
      var2.setMotion(var2.getMotion().method11347(1.0, 0.0, 1.0));
   }

   public ItemStack getItem(IBlockReader var1, BlockPos var2, BlockState var3) {
      return new ItemStack(this);
   }

   public void method11570(ItemGroup var1, NonNullList<ItemStack> var2) {
      var2.add(new ItemStack(this));
   }

   public float method11571() {
      return this.field19009;
   }

   public float method11572() {
      return this.field19010;
   }

   public float method11573() {
      return this.field19011;
   }

   public void onBlockHarvested(World var1, BlockPos var2, BlockState var3, PlayerEntity var4) {
      var1.method6869(var4, 2001, var2, getStateId(var3));
      if (this.isIn(BlockTags.field32810)) {
         Class4388.method13832(var4, false);
      }
   }

   public void method11575(World var1, BlockPos var2) {
   }

   public boolean method11576(Explosion var1) {
      return true;
   }

   public void fillStateContainer(StateContainer.Builder<Block, BlockState> var1) {
   }

   public StateContainer<Block, BlockState> getStateContainer() {
      return this.stateContainer;
   }

   public final void setDefaultState(BlockState var1) {
      this.field18613 = var1;
   }

   public final BlockState getDefaultState() {
      return this.field18613;
   }

   public SoundType method11580(BlockState var1) {
      return this.field19008;
   }

   @Override
   public Item method11581() {
      if (this.field18615 == null) {
         this.field18615 = Item.method11703(this);
      }

      return this.field18615;
   }

   public boolean method11582() {
      return this.field19012;
   }

   @Override
   public String toString() {
      return "Block{" + Registry.BLOCK.getKey(this) + "}";
   }

   public void method11583(ItemStack var1, IBlockReader var2, List<ITextComponent> var3, Class2216 var4) {
   }

   @Override
   public Block method11584() {
      return this;
   }
}
