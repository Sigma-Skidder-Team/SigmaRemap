package mapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.ITextComponent$Serializer;
import net.minecraft.util.text.TranslationTextComponent;

import javax.annotation.Nullable;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Class950 extends TileEntity implements Class949, Class935 {
   public static final Class7144[][] field5338 = new Class7144[][]{
      {Class8254.field35467, Class8254.field35469}, {Class8254.field35477, Class8254.field35474}, {Class8254.field35471}, {Class8254.field35476}
   };
   private static final Set<Class7144> field5339 = Arrays.<Class7144[]>stream(field5338)
      .<Class7144>flatMap(Arrays::stream)
      .collect(Collectors.<Class7144>toSet());
   private List<Class7934> field5340 = Lists.newArrayList();
   private List<Class7934> field5341 = Lists.newArrayList();
   private int field5342;
   private int field5343 = -1;
   private Class7144 field5344;
   private Class7144 field5345;
   private ITextComponent field5346;
   private Class7969 field5347 = Class7969.field34259;
   private final Class8202 field5348 = new Class8201(this);

   public Class950() {
      super(Class4387.field21434);
   }

   @Override
   public void method3647() {
      int var3 = this.field5325.getX();
      int var4 = this.field5325.getY();
      int var5 = this.field5325.getZ();
      BlockPos var6;
      if (this.field5343 >= var4) {
         var6 = new BlockPos(var3, this.field5343 + 1, var5);
      } else {
         var6 = this.field5325;
         this.field5341 = Lists.newArrayList();
         this.field5343 = var6.getY() - 1;
      }

      Class7934 var7 = !this.field5341.isEmpty() ? this.field5341.get(this.field5341.size() - 1) : null;
      int var8 = this.field5324.method6736(Class101.field296, var3, var5);

      for (int var9 = 0; var9 < 10 && var6.getY() <= var8; var9++) {
         BlockState var10 = this.field5324.getBlockState(var6);
         Block var11 = var10.getBlock();
         if (!(var11 instanceof Class3235)) {
            if (var7 == null || var10.getOpacity(this.field5324, var6) >= 15 && var11 != Blocks.BEDROCK) {
               this.field5341.clear();
               this.field5343 = var8;
               break;
            }

            var7.method26684();
         } else {
            float[] var12 = ((Class3235)var11).method11637().method311();
            if (this.field5341.size() > 1) {
               if (var7 != null) {
                  if (!Arrays.equals(var12, Class7934.method26687(var7))) {
                     var7 = new Class7934(
                        new float[]{
                           (Class7934.method26687(var7)[0] + var12[0]) / 2.0F,
                           (Class7934.method26687(var7)[1] + var12[1]) / 2.0F,
                           (Class7934.method26687(var7)[2] + var12[2]) / 2.0F
                        }
                     );
                     this.field5341.add(var7);
                  } else {
                     var7.method26684();
                  }
               }
            } else {
               var7 = new Class7934(var12);
               this.field5341.add(var7);
            }
         }

         var6 = var6.up();
         this.field5343++;
      }

      int var14 = this.field5342;
      if (this.field5324.method6783() % 80L == 0L) {
         if (!this.field5340.isEmpty()) {
            this.method3820(var3, var4, var5);
         }

         if (this.field5342 > 0 && !this.field5340.isEmpty()) {
            this.method3821();
            this.method3822(Sounds.field26386);
         }
      }

      if (this.field5343 >= var8) {
         this.field5343 = -1;
         boolean var15 = var14 > 0;
         this.field5340 = this.field5341;
         if (!this.field5324.isRemote) {
            boolean var16 = this.field5342 > 0;
            if (!var15 && var16) {
               this.method3822(Sounds.field26385);

               for (ServerPlayerEntity var13 : this.field5324
                  .<ServerPlayerEntity>method7182(
                     ServerPlayerEntity.class,
                     new AxisAlignedBB((double)var3, (double)var4, (double)var5, (double)var3, (double)(var4 - 4), (double)var5).method19663(10.0, 5.0, 10.0)
                  )) {
                  CriteriaTriggers.field44476.method15096(var13, this);
               }
            } else if (var15 && !var16) {
               this.method3822(Sounds.field26387);
            }
         }
      }
   }

   private void method3820(int var1, int var2, int var3) {
      this.field5342 = 0;

      for (int var6 = 1; var6 <= 4; this.field5342 = var6++) {
         int var7 = var2 - var6;
         if (var7 < 0) {
            break;
         }

         boolean var8 = true;

         for (int var9 = var1 - var6; var9 <= var1 + var6 && var8; var9++) {
            for (int var10 = var3 - var6; var10 <= var3 + var6; var10++) {
               if (!this.field5324.getBlockState(new BlockPos(var9, var7, var10)).method23446(BlockTags.field32801)) {
                  var8 = false;
                  break;
               }
            }
         }

         if (!var8) {
            break;
         }
      }
   }

   @Override
   public void method3765() {
      this.method3822(Sounds.field26387);
      super.method3765();
   }

   private void method3821() {
      if (!this.field5324.isRemote && this.field5344 != null) {
         double var3 = (double)(this.field5342 * 10 + 10);
         byte var5 = 0;
         if (this.field5342 >= 4 && this.field5344 == this.field5345) {
            var5 = 1;
         }

         int var6 = (9 + this.field5342 * 2) * 20;
         AxisAlignedBB var7 = new AxisAlignedBB(this.field5325).method19664(var3).method19662(0.0, (double)this.field5324.method7034(), 0.0);
         List<PlayerEntity> var8 = this.field5324.<PlayerEntity>method7182(PlayerEntity.class, var7);

         for (PlayerEntity var10 : var8) {
            var10.method3035(new Class2023(this.field5344, var6, var5, true, true));
         }

         if (this.field5342 >= 4 && this.field5344 != this.field5345 && this.field5345 != null) {
            for (PlayerEntity var12 : var8) {
               var12.method3035(new Class2023(this.field5345, var6, 0, true, true));
            }
         }
      }
   }

   public void method3822(Class9455 var1) {
      this.field5324.method6742((PlayerEntity)null, this.field5325, var1, Class2266.field14732, 1.0F, 1.0F);
   }

   public List<Class7934> method3823() {
      return (List<Class7934>)(this.field5342 != 0 ? this.field5340 : ImmutableList.of());
   }

   public int method3824() {
      return this.field5342;
   }

   @Nullable
   @Override
   public Class5610 method3776() {
      return new Class5610(this.field5325, 3, this.method3777());
   }

   @Override
   public CompoundNBT method3777() {
      return this.write(new CompoundNBT());
   }

   @Override
   public double method3773() {
      return 256.0;
   }

   @Nullable
   private static Class7144 method3825(int var0) {
      Class7144 var3 = Class7144.method22287(var0);
      return !field5339.contains(var3) ? null : var3;
   }

   @Override
   public void method3645(BlockState var1, CompoundNBT var2) {
      super.method3645(var1, var2);
      this.field5344 = method3825(var2.method122("Primary"));
      this.field5345 = method3825(var2.method122("Secondary"));
      if (var2.method119("CustomName", 8)) {
         this.field5346 = ITextComponent$Serializer.func_240643_a_(var2.method126("CustomName"));
      }

      this.field5347 = Class7969.method27093(var2);
   }

   @Override
   public CompoundNBT write(CompoundNBT var1) {
      super.write(var1);
      var1.method102("Primary", Class7144.method22288(this.field5344));
      var1.method102("Secondary", Class7144.method22288(this.field5345));
      var1.method102("Levels", this.field5342);
      if (this.field5346 != null) {
         var1.method109("CustomName", ITextComponent$Serializer.toJson(this.field5346));
      }

      this.field5347.method27092(var1);
      return var1;
   }

   public void method3826(ITextComponent var1) {
      this.field5346 = var1;
   }

   @Nullable
   @Override
   public Class5812 method3627(int var1, PlayerInventory var2, PlayerEntity var3) {
      return !Class932.method3697(var3, this.field5347, this.method2954())
         ? null
         : new Class5821(var1, var2, this.field5348, Class8786.method31714(this.field5324, this.getPos()));
   }

   @Override
   public ITextComponent method2954() {
      return (ITextComponent)(this.field5346 == null ? new TranslationTextComponent("container.beacon") : this.field5346);
   }

   // $VF: synthetic method
   public static int method3827(Class950 var0) {
      return var0.field5342;
   }

   // $VF: synthetic method
   public static Class7144 method3828(Class950 var0) {
      return var0.field5344;
   }

   // $VF: synthetic method
   public static Class7144 method3829(Class950 var0) {
      return var0.field5345;
   }

   // $VF: synthetic method
   public static int method3830(Class950 var0, int var1) {
      return var0.field5342 = var1;
   }

   // $VF: synthetic method
   public static List method3831(Class950 var0) {
      return var0.field5340;
   }

   // $VF: synthetic method
   public static Class7144 method3832(Class950 var0, Class7144 var1) {
      return var0.field5344 = var1;
   }

   // $VF: synthetic method
   public static Class7144 method3833(int var0) {
      return method3825(var0);
   }

   // $VF: synthetic method
   public static Class7144 method3834(Class950 var0, Class7144 var1) {
      return var0.field5345 = var1;
   }
}
