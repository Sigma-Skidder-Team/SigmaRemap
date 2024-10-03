package mapped;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.enchantment.ProtectionEnchantment;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceContext;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Random;
import javax.annotation.Nullable;

public class Explosion {
   private static final Class5924 field33369 = new Class5924();
   private final boolean field33370;
   private final Class2141 field33371;
   private final Random field33372 = new Random();
   private final World field33373;
   private final double field33374;
   private final double field33375;
   private final double field33376;
   private final Entity field33377;
   private final float field33378;
   private final DamageSource field33379;
   private final Class5924 field33380;
   private final List<BlockPos> field33381 = Lists.newArrayList();
   private final Map<PlayerEntity, Vector3d> field33382 = Maps.newHashMap();

   public Explosion(World var1, Entity var2, double var3, double var5, double var7, float var9, List<BlockPos> var10) {
      this(var1, var2, var3, var5, var7, var9, false, Class2141.field14016, var10);
   }

   public Explosion(World var1, Entity var2, double var3, double var5, double var7, float var9, boolean var10, Class2141 var11, List<BlockPos> var12) {
      this(var1, var2, var3, var5, var7, var9, var10, var11);
      this.field33381.addAll(var12);
   }

   public Explosion(World var1, Entity var2, double var3, double var5, double var7, float var9, boolean var10, Class2141 var11) {
      this(var1, var2, (DamageSource)null, (Class5924)null, var3, var5, var7, var9, var10, var11);
   }

   public Explosion(
           World var1, Entity var2, DamageSource var3, Class5924 var4, double var5, double var7, double var9, float var11, boolean var12, Class2141 var13
   ) {
      this.field33373 = var1;
      this.field33377 = var2;
      this.field33378 = var11;
      this.field33374 = var5;
      this.field33375 = var7;
      this.field33376 = var9;
      this.field33370 = var12;
      this.field33371 = var13;
      this.field33379 = var3 != null ? var3 : DamageSource.method31126(this);
      this.field33380 = var4 != null ? var4 : this.method25782(var2);
   }

   private Class5924 method25782(Entity var1) {
      return (Class5924)(var1 != null ? new Class5923(var1) : field33369);
   }

   public static float method25783(Vector3d var0, Entity var1) {
      AxisAlignedBB var4 = var1.getBoundingBox();
      double var5 = 1.0 / ((var4.maxX - var4.minX) * 2.0 + 1.0);
      double var7 = 1.0 / ((var4.maxY - var4.minY) * 2.0 + 1.0);
      double var9 = 1.0 / ((var4.maxZ - var4.minZ) * 2.0 + 1.0);
      double var11 = (1.0 - Math.floor(1.0 / var5) * var5) / 2.0;
      double var13 = (1.0 - Math.floor(1.0 / var9) * var9) / 2.0;
      if (!(var5 < 0.0) && !(var7 < 0.0) && !(var9 < 0.0)) {
         int var15 = 0;
         int var16 = 0;

         for (float var17 = 0.0F; var17 <= 1.0F; var17 = (float)((double)var17 + var5)) {
            for (float var18 = 0.0F; var18 <= 1.0F; var18 = (float)((double)var18 + var7)) {
               for (float var19 = 0.0F; var19 <= 1.0F; var19 = (float)((double)var19 + var9)) {
                  double var20 = MathHelper.lerp((double)var17, var4.minX, var4.maxX);
                  double var22 = MathHelper.lerp((double)var18, var4.minY, var4.maxY);
                  double var24 = MathHelper.lerp((double)var19, var4.minZ, var4.maxZ);
                  Vector3d var26 = new Vector3d(var20 + var11, var22, var24 + var13);
                  if (var1.world.rayTraceBlocks(new RayTraceContext(var26, var0, RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, var1)).getType()
                     == RayTraceResult.Type.MISS) {
                     var15++;
                  }

                  var16++;
               }
            }
         }

         return (float)var15 / (float)var16;
      } else {
         return 0.0F;
      }
   }

   public void method25784() {
      HashSet var3 = Sets.newHashSet();
      byte var4 = 16;

      for (int var5 = 0; var5 < 16; var5++) {
         for (int var6 = 0; var6 < 16; var6++) {
            for (int var7 = 0; var7 < 16; var7++) {
               if (var5 == 0 || var5 == 15 || var6 == 0 || var6 == 15 || var7 == 0 || var7 == 15) {
                  double var15 = (double)((float)var5 / 15.0F * 2.0F - 1.0F);
                  double var17 = (double)((float)var6 / 15.0F * 2.0F - 1.0F);
                  double var19 = (double)((float)var7 / 15.0F * 2.0F - 1.0F);
                  double var21 = Math.sqrt(var15 * var15 + var17 * var17 + var19 * var19);
                  var15 /= var21;
                  var17 /= var21;
                  var19 /= var21;
                  float var23 = this.field33378 * (0.7F + this.field33373.rand.nextFloat() * 0.6F);
                  double var24 = this.field33374;
                  double var26 = this.field33375;
                  double var28 = this.field33376;

                  for (float var30 = 0.3F; var23 > 0.0F; var23 -= 0.22500001F) {
                     BlockPos var31 = new BlockPos(var24, var26, var28);
                     BlockState var32 = this.field33373.getBlockState(var31);
                     FluidState var33 = this.field33373.getFluidState(var31);
                     Optional<Float> var34 = this.field33380.method18423(this, this.field33373, var31, var32, var33);
                     if (var34.isPresent()) {
                        var23 -= (var34.get() + 0.3F) * 0.3F;
                     }

                     if (var23 > 0.0F && this.field33380.method18424(this, this.field33373, var31, var32, var23)) {
                        var3.add(var31);
                     }

                     var24 += var15 * 0.3F;
                     var26 += var17 * 0.3F;
                     var28 += var19 * 0.3F;
                  }
               }
            }
         }
      }

      this.field33381.addAll(var3);
      float var53 = this.field33378 * 2.0F;
      int var54 = MathHelper.floor(this.field33374 - (double)var53 - 1.0);
      int var55 = MathHelper.floor(this.field33374 + (double)var53 + 1.0);
      int var8 = MathHelper.floor(this.field33375 - (double)var53 - 1.0);
      int var9 = MathHelper.floor(this.field33375 + (double)var53 + 1.0);
      int var10 = MathHelper.floor(this.field33376 - (double)var53 - 1.0);
      int var11 = MathHelper.floor(this.field33376 + (double)var53 + 1.0);
      List var12 = this.field33373
         .method7181(this.field33377, new AxisAlignedBB((double)var54, (double)var8, (double)var10, (double)var55, (double)var9, (double)var11));
      Vector3d var13 = new Vector3d(this.field33374, this.field33375, this.field33376);

      for (int var14 = 0; var14 < var12.size(); var14++) {
         Entity var35 = (Entity)var12.get(var14);
         if (!var35.method3398()) {
            double var36 = (double)(MathHelper.sqrt(var35.getDistanceNearest3(var13)) / var53);
            if (var36 <= 1.0) {
               double var38 = var35.getPosX() - this.field33374;
               double var40 = (!(var35 instanceof Class1004) ? var35.getPosYEye() : var35.getPosY()) - this.field33375;
               double var42 = var35.getPosZ() - this.field33376;
               double var44 = (double) MathHelper.sqrt(var38 * var38 + var40 * var40 + var42 * var42);
               if (var44 != 0.0) {
                  var38 /= var44;
                  var40 /= var44;
                  var42 /= var44;
                  double var46 = (double)method25783(var13, var35);
                  double var48 = (1.0 - var36) * var46;
                  var35.attackEntityFrom(this.method25787(), (float)((int)((var48 * var48 + var48) / 2.0 * 7.0 * (double)var53 + 1.0)));
                  double var50 = var48;
                  if (var35 instanceof LivingEntity) {
                     var50 = ProtectionEnchantment.method18835((LivingEntity)var35, var48);
                  }

                  var35.setMotion(var35.getMotion().add(var38 * var50, var40 * var50, var42 * var50));
                  if (var35 instanceof PlayerEntity) {
                     PlayerEntity var52 = (PlayerEntity)var35;
                     if (!var52.isSpectator() && (!var52.isCreative() || !var52.abilities.isFlying)) {
                        this.field33382.put(var52, new Vector3d(var38 * var48, var40 * var48, var42 * var48));
                     }
                  }
               }
            }
         }
      }
   }

   public void method25785(boolean var1) {
      if (this.field33373.isRemote) {
         this.field33373
            .method6745(
               this.field33374,
               this.field33375,
               this.field33376,
               SoundEvents.field26610,
               Class2266.field14732,
               4.0F,
               (1.0F + (this.field33373.rand.nextFloat() - this.field33373.rand.nextFloat()) * 0.2F) * 0.7F,
               false
            );
      }

      boolean var4 = this.field33371 != Class2141.field14014;
      if (var1) {
         if (!(this.field33378 < 2.0F) && var4) {
            this.field33373.addParticle(ParticleTypes.field34069, this.field33374, this.field33375, this.field33376, 1.0, 0.0, 0.0);
         } else {
            this.field33373.addParticle(ParticleTypes.field34070, this.field33374, this.field33375, this.field33376, 1.0, 0.0, 0.0);
         }
      }

      if (var4) {
         ObjectArrayList var5 = new ObjectArrayList();
         Collections.shuffle(this.field33381, this.field33373.rand);

         for (BlockPos var7 : this.field33381) {
            BlockState var8 = this.field33373.getBlockState(var7);
            Block var9 = var8.getBlock();
            if (!var8.isAir()) {
               BlockPos var10 = var7.toImmutable();
               this.field33373.getProfiler().startSection("explosion_blocks");
               if (var9.method11576(this) && this.field33373 instanceof ServerWorld) {
                  TileEntity var11 = !var9.isTileEntityProvider() ? null : this.field33373.getTileEntity(var7);
                  Class9464 var12 = new Class9464((ServerWorld)this.field33373)
                     .method36450(this.field33373.rand)
                     .method36454(Class9525.field44335, Vector3d.method11328(var7))
                     .method36454(Class9525.field44338, ItemStack.EMPTY)
                     .method36455(Class9525.field44337, var11)
                     .method36455(Class9525.field44330, this.field33377);
                  if (this.field33371 == Class2141.field14016) {
                     var12.method36454(Class9525.field44339, this.field33378);
                  }

                  var8.method23434(var12).forEach(var2 -> method25786(var5, var2, var10));
               }

               this.field33373.setBlockState(var7, Blocks.AIR.getDefaultState(), 3);
               var9.onExplosionDestroy(this.field33373, var7, this);
               this.field33373.getProfiler().endSection();
            }
         }

         ObjectListIterator var14 = var5.iterator();

         while (var14.hasNext()) {
            Pair var16 = (Pair)var14.next();
            Block.method11557(this.field33373, (BlockPos)var16.getSecond(), (ItemStack)var16.getFirst());
         }
      }

      if (this.field33370) {
         for (BlockPos var15 : this.field33381) {
            if (this.field33372.nextInt(3) == 0
               && this.field33373.getBlockState(var15).isAir()
               && this.field33373.getBlockState(var15.down()).method23409(this.field33373, var15.down())) {
               this.field33373.setBlockState(var15, AbstractFireBlock.method12009(this.field33373, var15));
            }
         }
      }
   }

   private static void method25786(ObjectArrayList<Pair<ItemStack, BlockPos>> var0, ItemStack var1, BlockPos var2) {
      int var5 = var0.size();

      for (int var6 = 0; var6 < var5; var6++) {
         Pair<ItemStack, BlockPos> var7 = var0.get(var6);
         ItemStack var8 = (ItemStack)var7.getFirst();
         if (ItemEntity.method4120(var8, var1)) {
            ItemStack var9 = ItemEntity.method4121(var8, var1, 16);
            var0.set(var6, Pair.of(var9, var7.getSecond()));
            if (var1.isEmpty()) {
               return;
            }
         }
      }

      var0.add(Pair.of(var1, var2));
   }

   public DamageSource method25787() {
      return this.field33379;
   }

   public Map<PlayerEntity, Vector3d> method25788() {
      return this.field33382;
   }

   @Nullable
   public LivingEntity method25789() {
      if (this.field33377 != null) {
         if (!(this.field33377 instanceof Class1004)) {
            if (!(this.field33377 instanceof LivingEntity)) {
               if (this.field33377 instanceof ProjectileEntity) {
                  Entity var3 = ((ProjectileEntity)this.field33377).method3460();
                  if (var3 instanceof LivingEntity) {
                     return (LivingEntity)var3;
                  }
               }

               return null;
            } else {
               return (LivingEntity)this.field33377;
            }
         } else {
            return ((Class1004)this.field33377).method4181();
         }
      } else {
         return null;
      }
   }

   public void method25790() {
      this.field33381.clear();
   }

   public List<BlockPos> method25791() {
      return this.field33381;
   }
}
