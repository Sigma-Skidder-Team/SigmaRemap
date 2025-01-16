package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.state.properties.DoubleBlockHalf;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;

import java.util.EnumSet;
import java.util.Optional;
import java.util.function.Predicate;

public class Class2663 extends Class2661 {
   private static String[] field17024;
   private final Predicate<BlockState> field17025;
   private int field17026;
   private int field17027;
   private boolean field17028;
   private Vector3d field17029;
   private int field17030;
   public final BeeEntity field17031;

   public Class2663(BeeEntity var1) {
      super(var1, null);
      this.field17031 = var1;
      this.field17025 = var0 -> {
         if (!var0.isIn(BlockTags.field32772)) {
            return var0.isIn(BlockTags.field32769);
         } else {
            return !var0.isIn(Blocks.SUNFLOWER) ? true : var0.<DoubleBlockHalf>get(Class3456.field19276) == DoubleBlockHalf.field209;
         }
      };
      this.field17026 = 0;
      this.field17027 = 0;
      this.field17030 = 0;
      this.method10809(EnumSet.<Class2240>of(Class2240.field14657));
   }

   @Override
   public boolean method10860() {
      if (BeeEntity.method4481(this.field17031) <= 0) {
         if (!this.field17031.method4438()) {
            if (!this.field17031.world.method6795()) {
               if (!(BeeEntity.method4482(this.field17031).nextFloat() < 0.7F)) {
                  Optional var3 = this.method10867();
                  if (!var3.isPresent()) {
                     return false;
                  } else {
                     BeeEntity.method4473(this.field17031, (BlockPos)var3.get());
                     BeeEntity.method4483(this.field17031)
                        .method21654(
                           (double) BeeEntity.method4469(this.field17031).getX() + 0.5,
                           (double) BeeEntity.method4469(this.field17031).getY() + 0.5,
                           (double) BeeEntity.method4469(this.field17031).getZ() + 0.5,
                           1.2F
                        );
                     return true;
                  }
               } else {
                  return false;
               }
            } else {
               return false;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   @Override
   public boolean method10861() {
      if (this.field17028) {
         if (this.field17031.method4422()) {
            if (!this.field17031.world.method6795()) {
               if (!this.method10862()) {
                  if (this.field17031.ticksExisted % 20 == 0 && !BeeEntity.method4470(this.field17031, BeeEntity.method4469(this.field17031))) {
                     BeeEntity.method4473(this.field17031, null);
                     return false;
                  } else {
                     return true;
                  }
               } else {
                  return BeeEntity.method4484(this.field17031).nextFloat() < 0.2F;
               }
            } else {
               return false;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   private boolean method10862() {
      return this.field17026 > 400;
   }

   private boolean method10863() {
      return this.field17028;
   }

   private void method10864() {
      this.field17028 = false;
   }

   @Override
   public void method10804() {
      this.field17026 = 0;
      this.field17030 = 0;
      this.field17027 = 0;
      this.field17028 = true;
      this.field17031.method4429();
   }

   @Override
   public void method10807() {
      if (this.method10862()) {
         BeeEntity.method4485(this.field17031, true);
      }

      this.field17028 = false;
      BeeEntity.method4486(this.field17031).method21666();
      BeeEntity.method4487(this.field17031, 200);
   }

   @Override
   public void method10805() {
      this.field17030++;
      if (this.field17030 <= 600) {
         Vector3d var3 = Vector3d.method11330(BeeEntity.method4469(this.field17031)).add(0.0, 0.6F, 0.0);
         if (!(var3.method11341(this.field17031.getPositionVec()) > 1.0)) {
            if (this.field17029 == null) {
               this.field17029 = var3;
            }

            boolean var4 = this.field17031.getPositionVec().method11341(this.field17029) <= 0.1;
            boolean var5 = true;
            if (!var4 && this.field17030 > 600) {
               BeeEntity.method4473(this.field17031, null);
            } else {
               if (var4) {
                  boolean var6 = BeeEntity.method4488(this.field17031).nextInt(25) == 0;
                  if (!var6) {
                     var5 = false;
                  } else {
                     this.field17029 = new Vector3d(
                        var3.getX() + (double)this.method10866(), var3.getY(), var3.getZ() + (double)this.method10866()
                     );
                     BeeEntity.method4489(this.field17031).method21666();
                  }

                  this.field17031.method4227().method28041(var3.getX(), var3.getY(), var3.getZ());
               }

               if (var5) {
                  this.method10865();
               }

               this.field17026++;
               if (BeeEntity.method4490(this.field17031).nextFloat() < 0.05F && this.field17026 > this.field17027 + 60) {
                  this.field17027 = this.field17026;
                  this.field17031.playSound(SoundEvents.field26394, 1.0F, 1.0F);
               }
            }
         } else {
            this.field17029 = var3;
            this.method10865();
         }
      } else {
         BeeEntity.method4473(this.field17031, null);
      }
   }

   private void method10865() {
      this.field17031.method4228().method20813(this.field17029.getX(), this.field17029.getY(), this.field17029.getZ(), 0.35F);
   }

   private float method10866() {
      return (BeeEntity.method4491(this.field17031).nextFloat() * 2.0F - 1.0F) * 0.33333334F;
   }

   private Optional<BlockPos> method10867() {
      return this.method10868(this.field17025, 5.0);
   }

   private Optional<BlockPos> method10868(Predicate<BlockState> var1, double var2) {
      BlockPos var6 = this.field17031.getPosition();
      BlockPos.Mutable var7 = new BlockPos.Mutable();

      for (int var8 = 0; (double)var8 <= var2; var8 = var8 <= 0 ? 1 - var8 : -var8) {
         for (int var9 = 0; (double)var9 < var2; var9++) {
            for (int var10 = 0; var10 <= var9; var10 = var10 <= 0 ? 1 - var10 : -var10) {
               for (int var11 = var10 < var9 && var10 > -var9 ? var9 : 0; var11 <= var9; var11 = var11 <= 0 ? 1 - var11 : -var11) {
                  var7.method8378(var6, var10, var8 - 1, var11);
                  if (var6.method8316(var7, var2) && var1.test(this.field17031.world.getBlockState(var7))) {
                     return Optional.<BlockPos>of(var7);
                  }
               }
            }
         }
      }

      return Optional.<BlockPos>empty();
   }

   // $VF: synthetic method
   public static boolean method10870(Class2663 var0) {
      return var0.method10863();
   }

   // $VF: synthetic method
   public static void method10871(Class2663 var0) {
      var0.method10864();
   }
}
