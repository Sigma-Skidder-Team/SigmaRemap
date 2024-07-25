package remapped;

import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public abstract class class_1249 {
   public final class_5886 field_6877;
   public final World field_6882;
   public class_3998 field_6887;
   public double field_6871;
   public int field_6875;
   public int field_6884;
   public class_1343 field_6885 = class_1343.field_7335;
   public class_2700 field_6879 = class_2700.field_13228;
   public long field_6886;
   public long field_6870;
   public double field_6876;
   public float field_6889 = 0.5F;
   public boolean field_6874;
   public long field_6880;
   public class_1546 field_6888;
   private BlockPos field_6872;
   private int field_6878;
   private float field_6883 = 1.0F;
   private final class_8976 field_6873;
   private boolean field_6881;

   public class_1249(class_5886 var1, World var2) {
      this.field_6877 = var1;
      this.field_6882 = var2;
      int var5 = class_9299.method_42847(var1.method_26575(class_7331.field_37471) * 16.0);
      this.field_6873 = this.method_5605(var5);
   }

   public void method_5622() {
      this.field_6883 = 1.0F;
   }

   public void method_5613(float var1) {
      this.field_6883 = var1;
   }

   public BlockPos method_5603() {
      return this.field_6872;
   }

   public abstract class_8976 method_5605(int var1);

   public void method_5600(double var1) {
      this.field_6871 = var1;
   }

   public boolean method_5604() {
      return this.field_6874;
   }

   public void method_5621() {
      if (this.field_6882.method_29546() - this.field_6880 <= 20L) {
         this.field_6874 = true;
      } else if (this.field_6872 != null) {
         this.field_6887 = null;
         this.field_6887 = this.method_5615(this.field_6872, this.field_6878);
         this.field_6880 = this.field_6882.method_29546();
         this.field_6874 = false;
      }
   }

   @Nullable
   public final class_3998 method_5614(double var1, double var3, double var5, int var7) {
      return this.method_5615(new BlockPos(var1, var3, var5), var7);
   }

   @Nullable
   public class_3998 method_5623(Stream<BlockPos> var1, int var2) {
      return this.method_5606(var1.collect(Collectors.<BlockPos>toSet()), 8, false, var2);
   }

   @Nullable
   public class_3998 method_5626(Set<BlockPos> var1, int var2) {
      return this.method_5606(var1, 8, false, var2);
   }

   @Nullable
   public class_3998 method_5615(BlockPos var1, int var2) {
      return this.method_5606(ImmutableSet.of(var1), 8, false, var2);
   }

   @Nullable
   public class_3998 method_5598(Entity var1, int var2) {
      return this.method_5606(ImmutableSet.of(var1.method_37075()), 16, true, var2);
   }

   @Nullable
   public class_3998 method_5606(Set<BlockPos> var1, int var2, boolean var3, int var4) {
      if (!var1.isEmpty()) {
         if (!(this.field_6877.method_37309() < 0.0)) {
            if (this.method_5601()) {
               if (this.field_6887 != null && !this.field_6887.method_18436() && var1.contains(this.field_6872)) {
                  return this.field_6887;
               } else {
                  this.field_6882.method_29599().startSection("pathfind");
                  float var7 = (float)this.field_6877.method_26575(class_7331.field_37471);
                  BlockPos var8 = !var3 ? this.field_6877.method_37075() : this.field_6877.method_37075().method_6081();
                  int var9 = (int)(var7 + (float)var2);
                  class_9525 var10 = new class_9525(this.field_6882, var8.method_6104(-var9, -var9, -var9), var8.method_6104(var9, var9, var9));
                  class_3998 var11 = this.field_6873.method_41159(var10, this.field_6877, var1, var7, var4, this.field_6883);
                  this.field_6882.method_29599().endSection();
                  if (var11 != null && var11.method_18426() != null) {
                     this.field_6872 = var11.method_18426();
                     this.field_6878 = var4;
                     this.method_5590();
                  }

                  return var11;
               }
            } else {
               return null;
            }
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   public boolean method_5595(double var1, double var3, double var5, double var7) {
      return this.method_5607(this.method_5614(var1, var3, var5, 1), var7);
   }

   public boolean method_5616(Entity var1, double var2) {
      class_3998 var6 = this.method_5598(var1, 1);
      return var6 != null && this.method_5607(var6, var2);
   }

   public boolean method_5607(class_3998 var1, double var2) {
      if (var1 != null) {
         if (!var1.method_18446(this.field_6887)) {
            this.field_6887 = var1;
         }

         if (!this.method_5591()) {
            this.method_5618();
            if (this.field_6887.method_18437() > 0) {
               this.field_6871 = var2;
               class_1343 var6 = this.method_5596();
               this.field_6884 = this.field_6875;
               this.field_6885 = var6;
               return true;
            } else {
               return false;
            }
         } else {
            return false;
         }
      } else {
         this.field_6887 = null;
         return false;
      }
   }

   @Nullable
   public class_3998 method_5594() {
      return this.field_6887;
   }

   public void method_5612() {
      this.field_6875++;
      if (this.field_6874) {
         this.method_5621();
      }

      if (!this.method_5591()) {
         if (!this.method_5601()) {
            if (this.field_6887 != null && !this.field_6887.method_18436()) {
               class_1343 var3 = this.method_5596();
               class_1343 var4 = this.field_6887.method_18439(this.field_6877);
               if (var3.field_7333 > var4.field_7333
                  && !this.field_6877.method_37360()
                  && class_9299.method_42847(var3.field_7336) == class_9299.method_42847(var4.field_7336)
                  && class_9299.method_42847(var3.field_7334) == class_9299.method_42847(var4.field_7334)) {
                  this.field_6887.method_18434();
               }
            }
         } else {
            this.method_5592();
         }

         class_1892.method_8443(this.field_6882, this.field_6877, this.field_6887, this.field_6889);
         if (!this.method_5591()) {
            class_1343 var5 = this.field_6887.method_18439(this.field_6877);
            BlockPos var6 = new BlockPos(var5);
            this.field_6877
               .method_26905()
               .method_12879(
                  var5.field_7336,
                  !this.field_6882.method_28262(var6.method_6100()).method_8345() ? class_2266.method_10464(this.field_6882, var6) : var5.field_7333,
                  var5.field_7334,
                  this.field_6871
               );
         }
      }
   }

   public void method_5592() {
      class_1343 var3 = this.method_5596();
      this.field_6889 = !(this.field_6877.method_37086() > 0.75F) ? 0.75F - this.field_6877.method_37086() / 2.0F : this.field_6877.method_37086() / 2.0F;
      BlockPos var4 = this.field_6887.method_18449();
      double var5 = Math.abs(this.field_6877.method_37302() - ((double)var4.method_12173() + 0.5));
      double var7 = Math.abs(this.field_6877.method_37309() - (double)var4.method_12165());
      double var9 = Math.abs(this.field_6877.method_37156() - ((double)var4.method_12185() + 0.5));
      boolean var11 = var5 < (double)this.field_6889 && var9 < (double)this.field_6889 && var7 < 1.0;
      if (var11 || this.field_6877.method_26854(this.field_6887.method_18438().field_29730) && this.method_5593(var3)) {
         this.field_6887.method_18434();
      }

      this.method_5619(var3);
   }

   private boolean method_5593(class_1343 var1) {
      if (this.field_6887.method_18429() + 1 < this.field_6887.method_18437()) {
         class_1343 var4 = class_1343.method_6200(this.field_6887.method_18449());
         if (var1.method_6222(var4, 2.0)) {
            class_1343 var5 = class_1343.method_6200(this.field_6887.method_18445(this.field_6887.method_18429() + 1));
            class_1343 var6 = var5.method_6194(var4);
            class_1343 var7 = var1.method_6194(var4);
            return var6.method_6206(var7) > 0.0;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public void method_5619(class_1343 var1) {
      if (this.field_6875 - this.field_6884 > 100) {
         if (!(var1.method_6204(this.field_6885) < 2.25)) {
            this.field_6881 = false;
         } else {
            this.field_6881 = true;
            this.method_5620();
         }

         this.field_6884 = this.field_6875;
         this.field_6885 = var1;
      }

      if (this.field_6887 != null && !this.field_6887.method_18436()) {
         BlockPos var4 = this.field_6887.method_18449();
         if (!var4.equals(this.field_6879)) {
            this.field_6879 = var4;
            double var5 = var1.method_6195(class_1343.method_6200(this.field_6879));
            this.field_6876 = !(this.field_6877.method_26423() > 0.0F) ? 0.0 : var5 / (double)this.field_6877.method_26423() * 1000.0;
         } else {
            this.field_6886 = this.field_6886 + (Util.getMeasuringTimeMs() - this.field_6870);
         }

         if (this.field_6876 > 0.0 && (double)this.field_6886 > this.field_6876 * 3.0) {
            this.method_5624();
         }

         this.field_6870 = Util.getMeasuringTimeMs();
      }
   }

   private void method_5624() {
      this.method_5590();
      this.method_5620();
   }

   private void method_5590() {
      this.field_6879 = class_2700.field_13228;
      this.field_6886 = 0L;
      this.field_6876 = 0.0;
      this.field_6881 = false;
   }

   public boolean method_5591() {
      return this.field_6887 == null || this.field_6887.method_18436();
   }

   public boolean method_5608() {
      return !this.method_5591();
   }

   public void method_5620() {
      this.field_6887 = null;
   }

   public abstract class_1343 method_5596();

   public abstract boolean method_5601();

   public boolean method_5617() {
      return this.field_6877.method_37134() || this.field_6877.method_37370();
   }

   public void method_5618() {
      if (this.field_6887 != null) {
         for (int var3 = 0; var3 < this.field_6887.method_18437(); var3++) {
            class_5851 var4 = this.field_6887.method_18447(var3);
            class_5851 var5 = var3 + 1 >= this.field_6887.method_18437() ? null : this.field_6887.method_18447(var3 + 1);
            class_2522 var6 = this.field_6882.method_28262(new BlockPos(var4.field_29731, var4.field_29735, var4.field_29736));
            if (var6.method_8350(class_4783.field_23673)) {
               this.field_6887.method_18427(var3, var4.method_26692(var4.field_29731, var4.field_29735 + 1, var4.field_29736));
               if (var5 != null && var4.field_29735 >= var5.field_29735) {
                  this.field_6887.method_18427(var3 + 1, var4.method_26692(var5.field_29731, var4.field_29735 + 1, var5.field_29736));
               }
            }
         }
      }
   }

   public abstract boolean method_5599(class_1343 var1, class_1343 var2, int var3, int var4, int var5);

   public boolean method_5609(BlockPos var1) {
      BlockPos var4 = var1.method_6100();
      return this.field_6882.method_28262(var4).method_8321(this.field_6882, var4);
   }

   public class_1546 method_5627() {
      return this.field_6888;
   }

   public void method_5611(boolean var1) {
      this.field_6888.method_7012(var1);
   }

   public boolean method_5602() {
      return this.field_6888.method_7015();
   }

   public void method_5625(BlockPos var1) {
      if (this.field_6887 != null && !this.field_6887.method_18436() && this.field_6887.method_18437() != 0) {
         class_5851 var4 = this.field_6887.method_18448();
         class_1343 var5 = new class_1343(
            ((double)var4.field_29731 + this.field_6877.method_37302()) / 2.0,
            ((double)var4.field_29735 + this.field_6877.method_37309()) / 2.0,
            ((double)var4.field_29736 + this.field_6877.method_37156()) / 2.0
         );
         if (var1.method_12170(var5, (double)(this.field_6887.method_18437() - this.field_6887.method_18429()))) {
            this.method_5621();
         }
      }
   }

   public boolean method_5597() {
      return this.field_6881;
   }
}
