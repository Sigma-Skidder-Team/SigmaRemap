package mapped;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.LoadingCache;
import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.impl.Class4424;
import it.unimi.dsi.fastutil.objects.Object2ByteLinkedOpenHashMap;
import net.minecraft.client.util.Util;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class Block extends Class3390 implements Class3303 {
   public static final Logger field18609 = LogManager.getLogger();
   public static final Class2352<BlockState> field18610 = new Class2352<BlockState>();
   private static final LoadingCache<VoxelShape, Boolean> field18611 = CacheBuilder.newBuilder().maximumSize(512L).weakKeys().build(new Class4562());
   public final Class9348<Block, BlockState> field18612;
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
         int var3 = field18610.method9171(var0);
         return var3 != -1 ? var3 : 0;
      } else {
         return 0;
      }
   }

   public static BlockState method11536(int var0) {
      BlockState var3 = field18610.method9172(var0);
      return var3 != null ? var3 : Blocks.AIR.method11579();
   }

   public static Block method11537(Item var0) {
      return !(var0 instanceof Class3292) ? Blocks.AIR : ((Class3292)var0).method11845();
   }

   public static BlockState method11538(BlockState var0, BlockState var1, World var2, BlockPos var3) {
      VoxelShape var6 = VoxelShapes.method27434(var0.method23414(var2, var3), var1.method23414(var2, var3), IBooleanFunction.field44039)
         .withOffset((double)var3.getX(), (double)var3.getY(), (double)var3.getZ());

      for (Entity var8 : var2.method7181((Entity)null, var6.method19514())) {
         double var9 = VoxelShapes.method27437(Class113.field414, var8.getBoundingBox().method19667(0.0, 1.0, 0.0), Stream.<VoxelShape>of(var6), -1.0);
         var8.method2793(var8.getPosX(), var8.getPosY() + 1.0 + var9, var8.getPosZ());
      }

      return var1;
   }

   public static VoxelShape method11539(double var0, double var2, double var4, double var6, double var8, double var10) {
      return VoxelShapes.create(var0 / 16.0, var2 / 16.0, var4 / 16.0, var6 / 16.0, var8 / 16.0, var10 / 16.0);
   }

   public boolean method11540(ITag<Block> var1) {
      return var1.method24917(this);
   }

   public boolean method11541(Block var1) {
      return this == var1;
   }

   public static BlockState method11542(BlockState var0, Class1660 var1, BlockPos var2) {
      BlockState var5 = var0;
      Mutable var6 = new Mutable();

      for (Direction var10 : field19003) {
         var6.method8377(var2, var10);
         var5 = var5.method23439(var10, var1.getBlockState(var6), var1, var2, var6);
      }

      return var5;
   }

   public static void method11543(BlockState var0, BlockState var1, Class1660 var2, BlockPos var3, int var4) {
      method11544(var0, var1, var2, var3, var4, 512);
   }

   public static void method11544(BlockState var0, BlockState var1, Class1660 var2, BlockPos var3, int var4, int var5) {
      if (var1 != var0) {
         if (!var1.isAir()) {
            var2.setBlockState(var3, var1, var4 & -33, var5);
         } else if (!var2.isRemote()) {
            var2.destroyBlock(var3, (var4 & 32) == 0, (Entity)null, var5);
         }
      }
   }

   public Block(AbstractBlock var1) {
      super(var1);
      Class7558<Block, BlockState> var4 = new Class7558<>(this);
      this.method11489(var4);
      this.field18612 = var4.method24739(Block::method11579, BlockState::new);
      this.method11578(this.field18612.method35393());
   }

   public static boolean method11545(Block var0) {
      return var0 instanceof Class3465
         || var0 == Blocks.field36765
         || var0 == Blocks.field36589
         || var0 == Blocks.field36590
         || var0 == Blocks.MELON
         || var0 == Blocks.PUMPKIN
         || var0.method11540(BlockTags.field32805);
   }

   public boolean method11499(BlockState var1) {
      return this.field19007;
   }

   public static boolean method11546(BlockState var0, Class1665 var1, BlockPos var2, Direction var3) {
      BlockPos var6 = var2.method8349(var3);
      BlockState var7 = var1.getBlockState(var6);
      Class4424 var8 = new Class4424(var0);
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
                     VoxelShape var13 = var7.method23388(var1, var6, var3.method536());
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

   public static boolean method11547(Class1665 var0, BlockPos var1) {
      return var0.getBlockState(var1).method23455(var0, var1, Direction.field673, Class2156.field14142);
   }

   public static boolean method11548(Class1662 var0, BlockPos var1, Direction var2) {
      BlockState var5 = var0.getBlockState(var1);
      return var2 == Direction.DOWN && var5.method23446(BlockTags.field32813) ? false : var5.method23455(var0, var1, var2, Class2156.field14141);
   }

   public static boolean method11549(VoxelShape var0, Direction var1) {
      VoxelShape var4 = var0.method19526(var1);
      return method11550(var4);
   }

   public static boolean method11550(VoxelShape var0) {
      return (Boolean)field18611.getUnchecked(var0);
   }

   public boolean method11493(BlockState var1, Class1665 var2, BlockPos var3) {
      return !method11550(var1.method23412(var2, var3)) && var1.method23449().method23474();
   }

   public void method11512(BlockState var1, World var2, BlockPos var3, Random var4) {
   }

   public void method11551(Class1660 var1, BlockPos var2, BlockState var3) {
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

   public static void method11555(BlockState var0, Class1660 var1, BlockPos var2, TileEntity var3) {
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
      if (!var0.isRemote && !var2.isEmpty() && var0.method6789().method17135(Class5462.field24228)) {
         float var5 = 0.5F;
         double var6 = (double)(var0.rand.nextFloat() * 0.5F) + 0.25;
         double var8 = (double)(var0.rand.nextFloat() * 0.5F) + 0.25;
         double var10 = (double)(var0.rand.nextFloat() * 0.5F) + 0.25;
         ItemEntity var12 = new ItemEntity(var0, (double)var1.getX() + var6, (double)var1.getY() + var8, (double)var1.getZ() + var10, var2);
         var12.method4131();
         var0.method6916(var12);
      }
   }

   public void method11558(ServerWorld var1, BlockPos var2, int var3) {
      if (var1.method6789().method17135(Class5462.field24228)) {
         while (var3 > 0) {
            int var6 = ExperienceOrbEntity.method4179(var3);
            var3 -= var6;
            var1.method6916(new ExperienceOrbEntity(var1, (double)var2.getX() + 0.5, (double)var2.getY() + 0.5, (double)var2.getZ() + 0.5, var6));
         }
      }
   }

   public float method11559() {
      return this.field19006;
   }

   public void method11560(World var1, BlockPos var2, Class7782 var3) {
   }

   public void method11561(World var1, BlockPos var2, Entity var3) {
   }

   @Nullable
   public BlockState method11495(Class5909 var1) {
      return this.method11579();
   }

   public void method11562(World var1, PlayerEntity var2, BlockPos var3, BlockState var4, TileEntity var5, ItemStack var6) {
      var2.method2913(Class8876.field40096.method172(this));
      var2.method2931(0.005F);
      spawnDrops(var4, var1, var3, var5, var2, var6);
   }

   public void method11563(World var1, BlockPos var2, BlockState var3, Class880 var4, ItemStack var5) {
   }

   public boolean method11564() {
      return !this.field19004.method31086() && !this.field19004.method31085();
   }

   public IFormattableTextComponent method11565() {
      return new TranslationTextComponent(this.getTranslationKey());
   }

   public String getTranslationKey() {
      if (this.field18614 == null) {
         this.field18614 = Util.method38486("block", Registry.BLOCK.getKey(this));
      }

      return this.field18614;
   }

   public void method11567(World var1, BlockPos var2, Entity var3, float var4) {
      var3.method2921(var4, 1.0F);
   }

   public void method11568(Class1665 var1, Entity var2) {
      var2.method3434(var2.method3433().method11347(1.0, 0.0, 1.0));
   }

   public ItemStack getItem(Class1665 var1, BlockPos var2, BlockState var3) {
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

   public void method11574(World var1, BlockPos var2, BlockState var3, PlayerEntity var4) {
      var1.method6869(var4, 2001, var2, getStateId(var3));
      if (this.method11540(BlockTags.field32810)) {
         Class4388.method13832(var4, false);
      }
   }

   public void method11575(World var1, BlockPos var2) {
   }

   public boolean method11576(Class7782 var1) {
      return true;
   }

   public void method11489(Class7558<Block, BlockState> var1) {
   }

   public Class9348<Block, BlockState> getStateContainer() {
      return this.field18612;
   }

   public final void method11578(BlockState var1) {
      this.field18613 = var1;
   }

   public final BlockState method11579() {
      return this.field18613;
   }

   public Class8447 method11580(BlockState var1) {
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

   public void method11583(ItemStack var1, Class1665 var2, List<ITextComponent> var3, Class2216 var4) {
   }

   @Override
   public Block method11584() {
      return this;
   }
}
