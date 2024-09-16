package mapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.DamageSource;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.math.vector.Vector3i;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

import java.util.Optional;
import java.util.Random;

public class Class3389 extends Block {
   private static String[] field18999;
   public static final Class8554 field19000 = Class8820.field39762;
   private static final ImmutableList<Vector3i> field19001 = ImmutableList.of(
      new Vector3i(0, 0, -1),
      new Vector3i(-1, 0, 0),
      new Vector3i(0, 0, 1),
      new Vector3i(1, 0, 0),
      new Vector3i(-1, 0, -1),
      new Vector3i(1, 0, -1),
      new Vector3i(-1, 0, 1),
      new Vector3i(1, 0, 1)
   );
   private static final ImmutableList<Vector3i> field19002 = new Builder()
      .addAll(field19001)
      .addAll(field19001.stream().<Vector3i>map(Vector3i::method8312).iterator())
      .addAll(field19001.stream().<Vector3i>map(Vector3i::method8310).iterator())
      .add(new Vector3i(0, 1, 0))
      .build();

   public Class3389(AbstractBlock var1) {
      super(var1);
      this.method11578(this.field18612.method35393().method23465(field19000, Integer.valueOf(0)));
   }

   @Override
   public ActionResultType method11505(BlockState var1, World var2, BlockPos var3, PlayerEntity var4, Hand var5, BlockRayTraceResult var6) {
      ItemStack var9 = var4.getHeldItem(var5);
      if (var5 == Hand.MAIN_HAND && !method11984(var9) && method11984(var4.getHeldItem(Hand.field183))) {
         return ActionResultType.field14820;
      } else if (method11984(var9) && method11985(var1)) {
         method11989(var2, var3, var1);
         if (!var4.abilities.isCreativeMode) {
            var9.method32182(1);
         }

         return ActionResultType.method9002(var2.isRemote);
      } else if (var1.<Integer>method23463(field19000) != 0) {
         if (!method11988(var2)) {
            if (!var2.isRemote) {
               this.method11987(var1, var2, var3);
            }

            return ActionResultType.method9002(var2.isRemote);
         } else {
            if (!var2.isRemote) {
               ServerPlayerEntity var10 = (ServerPlayerEntity)var4;
               if (var10.method2827() != var2.getDimensionKey() || !var10.method2825().equals(var3)) {
                  var10.method2829(var2.getDimensionKey(), var3, 0.0F, false, true);
                  var2.method6743(
                     (PlayerEntity)null,
                     (double)var3.getX() + 0.5,
                     (double)var3.getY() + 0.5,
                     (double)var3.getZ() + 0.5,
                     SoundEvents.field27015,
                     Class2266.field14732,
                     1.0F,
                     1.0F
                  );
                  return ActionResultType.SUCCESS;
               }
            }

            return ActionResultType.field14819;
         }
      } else {
         return ActionResultType.field14820;
      }
   }

   private static boolean method11984(ItemStack var0) {
      return var0.getItem() == Items.field37446;
   }

   private static boolean method11985(BlockState var0) {
      return var0.<Integer>method23463(field19000) < 4;
   }

   private static boolean method11986(BlockPos var0, World var1) {
      FluidState var4 = var1.getFluidState(var0);
      if (var4.method23486(FluidTags.field40469)) {
         if (!var4.method23473()) {
            float var5 = (float)var4.method23477();
            if (!(var5 < 2.0F)) {
               FluidState var6 = var1.getFluidState(var0.down());
               return !var6.method23486(FluidTags.field40469);
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

   private void method11987(BlockState var1, World var2, BlockPos var3) {
      var2.removeBlock(var3, false);
      boolean var6 = Class76.field161.method248().<BlockPos>map(var3::method8349).anyMatch(var1x -> method11986(var1x, var2));
      boolean var7 = var6 || var2.getFluidState(var3.up()).method23486(FluidTags.field40469);
      Class5925 var8 = new Class5925(this, var7);
      var2.method6757(
         (Entity)null,
         DamageSource.method31128(),
         var8,
         (double)var3.getX() + 0.5,
         (double)var3.getY() + 0.5,
         (double)var3.getZ() + 0.5,
         5.0F,
         true,
         Class2141.field14016
      );
   }

   public static boolean method11988(World var0) {
      return var0.method6812().doesRespawnAnchorWorks();
   }

   public static void method11989(World var0, BlockPos var1, BlockState var2) {
      var0.setBlockState(var1, var2.method23465(field19000, Integer.valueOf(var2.<Integer>method23463(field19000) + 1)), 3);
      var0.method6743(
         (PlayerEntity)null,
         (double)var1.getX() + 0.5,
         (double)var1.getY() + 0.5,
         (double)var1.getZ() + 0.5,
         SoundEvents.field27013,
         Class2266.field14732,
         1.0F,
         1.0F
      );
   }

   @Override
   public void method11512(BlockState var1, World var2, BlockPos var3, Random var4) {
      if (var1.<Integer>method23463(field19000) != 0) {
         if (var4.nextInt(100) == 0) {
            var2.method6743(
               (PlayerEntity)null,
               (double)var3.getX() + 0.5,
               (double)var3.getY() + 0.5,
               (double)var3.getZ() + 0.5,
               SoundEvents.field27012,
               Class2266.field14732,
               1.0F,
               1.0F
            );
         }

         double var7 = (double)var3.getX() + 0.5 + (0.5 - var4.nextDouble());
         double var9 = (double)var3.getY() + 1.0;
         double var11 = (double)var3.getZ() + 0.5 + (0.5 - var4.nextDouble());
         double var13 = (double)var4.nextFloat() * 0.04;
         var2.addParticle(ParticleTypes.field34118, var7, var9, var11, 0.0, var13, 0.0);
      }
   }

   @Override
   public void method11489(Class7558<Block, BlockState> var1) {
      var1.method24737(field19000);
   }

   @Override
   public boolean method11648(BlockState var1) {
      return true;
   }

   public static int method11990(BlockState var0, int var1) {
      return MathHelper.method37767((float)(var0.<Integer>method23463(field19000) - 0) / 4.0F * (float)var1);
   }

   @Override
   public int method11649(BlockState var1, World var2, BlockPos var3) {
      return method11990(var1, 15);
   }

   public static Optional<Vector3d> method11991(EntityType<?> var0, ICollisionReader var1, BlockPos var2) {
      Optional var5 = method11992(var0, var1, var2, true);
      return !var5.isPresent() ? method11992(var0, var1, var2, false) : var5;
   }

   private static Optional<Vector3d> method11992(EntityType<?> var0, ICollisionReader var1, BlockPos var2, boolean var3) {
      BlockPos.Mutable var6 = new BlockPos.Mutable();
      UnmodifiableIterator var7 = field19002.iterator();

      while (var7.hasNext()) {
         Vector3i var8 = (Vector3i)var7.next();
         var6.method8374(var2).method8382(var8);
         Vector3d var9 = Class4527.method14428(var0, var1, var6, var3);
         if (var9 != null) {
            return Optional.<Vector3d>of(var9);
         }
      }

      return Optional.<Vector3d>empty();
   }

   @Override
   public boolean method11494(BlockState var1, IBlockReader var2, BlockPos var3, Class1947 var4) {
      return false;
   }
}
