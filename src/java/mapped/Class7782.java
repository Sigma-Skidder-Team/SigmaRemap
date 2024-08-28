package mapped;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Random;
import javax.annotation.Nullable;

public class Class7782 {
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
   private final Class8654 field33379;
   private final Class5924 field33380;
   private final List<BlockPos> field33381 = Lists.newArrayList();
   private final Map<PlayerEntity, Vector3d> field33382 = Maps.newHashMap();

   public Class7782(World var1, Entity var2, double var3, double var5, double var7, float var9, List<BlockPos> var10) {
      this(var1, var2, var3, var5, var7, var9, false, Class2141.field14016, var10);
   }

   public Class7782(World var1, Entity var2, double var3, double var5, double var7, float var9, boolean var10, Class2141 var11, List<BlockPos> var12) {
      this(var1, var2, var3, var5, var7, var9, var10, var11);
      this.field33381.addAll(var12);
   }

   public Class7782(World var1, Entity var2, double var3, double var5, double var7, float var9, boolean var10, Class2141 var11) {
      this(var1, var2, (Class8654)null, (Class5924)null, var3, var5, var7, var9, var10, var11);
   }

   public Class7782(
           World var1, Entity var2, Class8654 var3, Class5924 var4, double var5, double var7, double var9, float var11, boolean var12, Class2141 var13
   ) {
      this.field33373 = var1;
      this.field33377 = var2;
      this.field33378 = var11;
      this.field33374 = var5;
      this.field33375 = var7;
      this.field33376 = var9;
      this.field33370 = var12;
      this.field33371 = var13;
      this.field33379 = var3 != null ? var3 : Class8654.method31126(this);
      this.field33380 = var4 != null ? var4 : this.method25782(var2);
   }

   private Class5924 method25782(Entity var1) {
      return (Class5924)(var1 != null ? new Class5923(var1) : field33369);
   }

   public static float method25783(Vector3d var0, Entity var1) {
      Class6488 var4 = var1.method3389();
      double var5 = 1.0 / ((var4.field28452 - var4.field28449) * 2.0 + 1.0);
      double var7 = 1.0 / ((var4.field28453 - var4.field28450) * 2.0 + 1.0);
      double var9 = 1.0 / ((var4.field28454 - var4.field28451) * 2.0 + 1.0);
      double var11 = (1.0 - Math.floor(1.0 / var5) * var5) / 2.0;
      double var13 = (1.0 - Math.floor(1.0 / var9) * var9) / 2.0;
      if (!(var5 < 0.0) && !(var7 < 0.0) && !(var9 < 0.0)) {
         int var15 = 0;
         int var16 = 0;

         for (float var17 = 0.0F; var17 <= 1.0F; var17 = (float)((double)var17 + var5)) {
            for (float var18 = 0.0F; var18 <= 1.0F; var18 = (float)((double)var18 + var7)) {
               for (float var19 = 0.0F; var19 <= 1.0F; var19 = (float)((double)var19 + var9)) {
                  double var20 = MathHelper.method37822((double)var17, var4.field28449, var4.field28452);
                  double var22 = MathHelper.method37822((double)var18, var4.field28450, var4.field28453);
                  double var24 = MathHelper.method37822((double)var19, var4.field28451, var4.field28454);
                  Vector3d var26 = new Vector3d(var20 + var11, var22, var24 + var13);
                  if (var1.field5024.method7036(new Class6809(var26, var0, Class2271.field14774, Class1985.field12962, var1)).method31417()
                     == Class2100.field13689) {
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
                  float var23 = this.field33378 * (0.7F + this.field33373.field9016.nextFloat() * 0.6F);
                  double var24 = this.field33374;
                  double var26 = this.field33375;
                  double var28 = this.field33376;

                  for (float var30 = 0.3F; var23 > 0.0F; var23 -= 0.22500001F) {
                     BlockPos var31 = new BlockPos(var24, var26, var28);
                     Class7380 var32 = this.field33373.method6738(var31);
                     Class7379 var33 = this.field33373.method6739(var31);
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
      int var54 = MathHelper.method37769(this.field33374 - (double)var53 - 1.0);
      int var55 = MathHelper.method37769(this.field33374 + (double)var53 + 1.0);
      int var8 = MathHelper.method37769(this.field33375 - (double)var53 - 1.0);
      int var9 = MathHelper.method37769(this.field33375 + (double)var53 + 1.0);
      int var10 = MathHelper.method37769(this.field33376 - (double)var53 - 1.0);
      int var11 = MathHelper.method37769(this.field33376 + (double)var53 + 1.0);
      List var12 = this.field33373
         .method7181(this.field33377, new Class6488((double)var54, (double)var8, (double)var10, (double)var55, (double)var9, (double)var11));
      Vector3d var13 = new Vector3d(this.field33374, this.field33375, this.field33376);

      for (int var14 = 0; var14 < var12.size(); var14++) {
         Entity var35 = (Entity)var12.get(var14);
         if (!var35.method3398()) {
            double var36 = (double)(MathHelper.method37766(var35.method3278(var13)) / var53);
            if (var36 <= 1.0) {
               double var38 = var35.getPosX() - this.field33374;
               double var40 = (!(var35 instanceof Class1004) ? var35.method3442() : var35.getPosY()) - this.field33375;
               double var42 = var35.getPosZ() - this.field33376;
               double var44 = (double) MathHelper.method37766(var38 * var38 + var40 * var40 + var42 * var42);
               if (var44 != 0.0) {
                  var38 /= var44;
                  var40 /= var44;
                  var42 /= var44;
                  double var46 = (double)method25783(var13, var35);
                  double var48 = (1.0 - var36) * var46;
                  var35.method2741(this.method25787(), (float)((int)((var48 * var48 + var48) / 2.0 * 7.0 * (double)var53 + 1.0)));
                  double var50 = var48;
                  if (var35 instanceof Class880) {
                     var50 = Class6096.method18835((Class880)var35, var48);
                  }

                  var35.method3434(var35.method3433().method11339(var38 * var50, var40 * var50, var42 * var50));
                  if (var35 instanceof PlayerEntity) {
                     PlayerEntity var52 = (PlayerEntity)var35;
                     if (!var52.method2800() && (!var52.method2801() || !var52.field4919.field29607)) {
                        this.field33382.put(var52, new Vector3d(var38 * var48, var40 * var48, var42 * var48));
                     }
                  }
               }
            }
         }
      }
   }

   public void method25785(boolean var1) {
      if (this.field33373.field9020) {
         this.field33373
            .method6745(
               this.field33374,
               this.field33375,
               this.field33376,
               Class6067.field26610,
               Class2266.field14732,
               4.0F,
               (1.0F + (this.field33373.field9016.nextFloat() - this.field33373.field9016.nextFloat()) * 0.2F) * 0.7F,
               false
            );
      }

      boolean var4 = this.field33371 != Class2141.field14014;
      if (var1) {
         if (!(this.field33378 < 2.0F) && var4) {
            this.field33373.method6746(Class7940.field34069, this.field33374, this.field33375, this.field33376, 1.0, 0.0, 0.0);
         } else {
            this.field33373.method6746(Class7940.field34070, this.field33374, this.field33375, this.field33376, 1.0, 0.0, 0.0);
         }
      }

      if (var4) {
         ObjectArrayList var5 = new ObjectArrayList();
         Collections.shuffle(this.field33381, this.field33373.field9016);

         for (BlockPos var7 : this.field33381) {
            Class7380 var8 = this.field33373.method6738(var7);
            Block var9 = var8.method23383();
            if (!var8.method23393()) {
               BlockPos var10 = var7.method8353();
               this.field33373.method6820().method22503("explosion_blocks");
               if (var9.method11576(this) && this.field33373 instanceof ServerWorld) {
                  Class944 var11 = !var9.method11998() ? null : this.field33373.method6759(var7);
                  Class9464 var12 = new Class9464((ServerWorld)this.field33373)
                     .method36450(this.field33373.field9016)
                     .method36454(Class9525.field44335, Vector3d.method11328(var7))
                     .method36454(Class9525.field44338, ItemStack.EMPTY)
                     .method36455(Class9525.field44337, var11)
                     .method36455(Class9525.field44330, this.field33377);
                  if (this.field33371 == Class2141.field14016) {
                     var12.method36454(Class9525.field44339, this.field33378);
                  }

                  var8.method23434(var12).forEach(var2 -> method25786(var5, var2, var10));
               }

               this.field33373.method6725(var7, Blocks.AIR.method11579(), 3);
               var9.method11560(this.field33373, var7, this);
               this.field33373.method6820().method22505();
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
               && this.field33373.method6738(var15).method23393()
               && this.field33373.method6738(var15.method8313()).method23409(this.field33373, var15.method8313())) {
               this.field33373.method6730(var15, Class3397.method12009(this.field33373, var15));
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
            if (var1.method32105()) {
               return;
            }
         }
      }

      var0.add(Pair.of(var1, var2));
   }

   public Class8654 method25787() {
      return this.field33379;
   }

   public Map<PlayerEntity, Vector3d> method25788() {
      return this.field33382;
   }

   @Nullable
   public Class880 method25789() {
      if (this.field33377 != null) {
         if (!(this.field33377 instanceof Class1004)) {
            if (!(this.field33377 instanceof Class880)) {
               if (this.field33377 instanceof Class882) {
                  Entity var3 = ((Class882)this.field33377).method3460();
                  if (var3 instanceof Class880) {
                     return (Class880)var3;
                  }
               }

               return null;
            } else {
               return (Class880)this.field33377;
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
