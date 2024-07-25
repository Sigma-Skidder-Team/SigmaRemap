package remapped;

import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_702 implements class_700 {
   private static final Logger field_3825 = LogManager.getLogger();
   private final List<class_5990> field_3823;
   private final int field_3821;
   private final int field_3831;
   private final int field_3829;
   private final class_6331 field_3827;
   private final long field_3826;
   private final class_1906 field_3832;
   private final Random field_3833;
   private final class_8760 field_3819;
   private final class_3065<class_6414> field_3820 = new class_2326<class_6414>(var1x -> this.method_22556(var1x).method_27335());
   private final class_3065<class_2340> field_3834 = new class_2326<class_2340>(var1x -> this.method_22556(var1x).method_27336());
   private final class_859 field_3830;
   private final class_2034 field_3824;
   private final class_2034 field_3835;
   private final class_2033 field_3828;

   public class_702(class_6331 var1, List<class_5990> var2) {
      int var5 = class_9299.method_42847(Math.sqrt((double)var2.size()));
      if (var5 * var5 == var2.size()) {
         class_2034 var6 = ((class_5990)var2.get(var2.size() / 2)).method_27352();
         this.field_3823 = var2;
         this.field_3821 = var6.field_10328;
         this.field_3831 = var6.field_10327;
         this.field_3829 = var5;
         this.field_3827 = var1;
         this.field_3826 = var1.method_3133();
         this.field_3832 = var1.method_43366();
         this.field_3833 = var1.method_43360();
         this.field_3819 = var1.method_22572();
         this.field_3830 = new class_859(this, class_859.method_3728(this.field_3826), var1.method_22572().method_40246());
         this.field_3824 = ((class_5990)var2.get(0)).method_27352();
         this.field_3835 = ((class_5990)var2.get(var2.size() - 1)).method_27352();
         this.field_3828 = var1.method_28991().method_9529(this);
      } else {
         throw (IllegalStateException) Util.method_44658(new IllegalStateException("Cache size is not a square."));
      }
   }

   public int method_3137() {
      return this.field_3821;
   }

   public int method_3139() {
      return this.field_3831;
   }

   @Override
   public class_5990 method_22553(int var1, int var2) {
      return this.method_22554(var1, var2, class_7335.field_37504);
   }

   @Nullable
   @Override
   public class_5990 method_22555(int var1, int var2, class_7335 var3, boolean var4) {
      class_5990 var7;
      if (!this.method_22560(var1, var2)) {
         var7 = null;
      } else {
         int var8 = var1 - this.field_3824.field_10328;
         int var9 = var2 - this.field_3824.field_10327;
         var7 = this.field_3823.get(var8 + var9 * this.field_3829);
         if (var7.method_27364().method_33453(var3)) {
            return var7;
         }
      }

      if (var4) {
         field_3825.error("Requested chunk : {} {}", var1, var2);
         field_3825.error(
            "Region bounds : {} {} | {} {}", this.field_3824.field_10328, this.field_3824.field_10327, this.field_3835.field_10328, this.field_3835.field_10327
         );
         if (var7 == null) {
            throw (RuntimeException) Util.method_44658(
               new RuntimeException(String.format("We are asking a region for a chunk out of bound | %s %s", var1, var2))
            );
         } else {
            throw (RuntimeException) Util.method_44658(
               new RuntimeException(String.format("Chunk is not of correct status. Expecting %s, got %s | %s %s", var3, var7.method_27364(), var1, var2))
            );
         }
      } else {
         return null;
      }
   }

   @Override
   public boolean method_22560(int var1, int var2) {
      return var1 >= this.field_3824.field_10328
         && var1 <= this.field_3835.field_10328
         && var2 >= this.field_3824.field_10327
         && var2 <= this.field_3835.field_10327;
   }

   @Override
   public class_2522 method_28262(BlockPos var1) {
      return this.method_22553(var1.method_12173() >> 4, var1.method_12185() >> 4).method_28262(var1);
   }

   @Override
   public class_4774 method_28258(BlockPos var1) {
      return this.method_22556(var1).method_28258(var1);
   }

   @Nullable
   @Override
   public PlayerEntity method_25856(double var1, double var3, double var5, double var7, Predicate<Entity> var9) {
      return null;
   }

   @Override
   public int method_22557() {
      return 0;
   }

   @Override
   public class_859 getBiomeManager() {
      return this.field_3830;
   }

   @Override
   public class_6325 method_22558(int var1, int var2, int var3) {
      return this.field_3827.method_22558(var1, var2, var3);
   }

   @Override
   public float method_25265(Direction var1, boolean var2) {
      return 1.0F;
   }

   @Override
   public class_4663 method_25264() {
      return this.field_3827.method_25264();
   }

   @Override
   public boolean method_7512(BlockPos var1, boolean var2, Entity var3, int var4) {
      class_2522 var7 = this.method_28262(var1);
      if (!var7.method_8345()) {
         if (var2) {
            class_3757 var8 = !var7.method_8360().method_10802() ? null : this.method_28260(var1);
            class_6414.method_29295(var7, this.field_3827, var1, var8, var3, ItemStack.EMPTY);
         }

         return this.method_7514(var1, class_4783.field_23184.method_29260(), 3, var4);
      } else {
         return false;
      }
   }

   @Nullable
   @Override
   public class_3757 method_28260(BlockPos var1) {
      class_5990 var4 = this.method_22556(var1);
      class_3757 var5 = var4.method_28260(var1);
      if (var5 == null) {
         CompoundNBT var6 = var4.method_27355(var1);
         class_2522 var7 = var4.method_28262(var1);
         if (var6 != null) {
            if (!"DUMMY".equals(var6.method_25965("id"))) {
               var5 = class_3757.method_17410(var7, var6);
            } else {
               class_6414 var8 = var7.method_8360();
               if (!(var8 instanceof class_724)) {
                  return null;
               }

               var5 = ((class_724)var8).method_3281(this.field_3827);
            }

            if (var5 != null) {
               var4.method_27346(var1, var5);
               return var5;
            }
         }

         if (var7.method_8360() instanceof class_724) {
            field_3825.warn("Tried to access a block entity before it was created. {}", var1);
         }

         return null;
      } else {
         return var5;
      }
   }

   @Override
   public boolean method_7514(BlockPos var1, class_2522 var2, int var3, int var4) {
      class_5990 var7 = this.method_22556(var1);
      class_2522 var8 = var7.method_27348(var1, var2, false);
      if (var8 != null) {
         this.field_3827.method_29550(var1, var8, var2);
      }

      class_6414 var9 = var2.method_8360();
      if (!var9.method_10802()) {
         if (var8 != null && var8.method_8360().method_10802()) {
            var7.method_27370(var1);
         }
      } else if (var7.method_27364().method_33446() != class_5592.field_28385) {
         CompoundNBT var10 = new CompoundNBT();
         var10.putInt("x", var1.method_12173());
         var10.putInt("y", var1.method_12165());
         var10.putInt("z", var1.method_12185());
         var10.method_25941("id", "DUMMY");
         var7.method_27347(var10);
      } else {
         var7.method_27346(var1, ((class_724)var9).method_3281(this));
      }

      if (var2.method_8365(this, var1)) {
         this.method_3140(var1);
      }

      return true;
   }

   private void method_3140(BlockPos var1) {
      this.method_22556(var1).method_27365(var1);
   }

   @Override
   public boolean method_7509(Entity var1) {
      int var4 = class_9299.method_42847(var1.getPosX() / 16.0);
      int var5 = class_9299.method_42847(var1.getPosZ() / 16.0);
      this.method_22553(var4, var5).method_27342(var1);
      return true;
   }

   @Override
   public boolean method_7508(BlockPos var1, boolean var2) {
      return this.method_7513(var1, class_4783.field_23184.method_29260(), 3);
   }

   @Override
   public class_2098 method_6673() {
      return this.field_3827.method_6673();
   }

   @Override
   public boolean method_22567() {
      return false;
   }

   @Deprecated
   @Override
   public class_6331 method_7066() {
      return this.field_3827;
   }

   @Override
   public class_6322 method_2755() {
      return this.field_3827.method_2755();
   }

   @Override
   public class_1906 method_43366() {
      return this.field_3832;
   }

   @Override
   public class_9589 method_43368(BlockPos var1) {
      if (this.method_22560(var1.method_12173() >> 4, var1.method_12185() >> 4)) {
         return new class_9589(this.field_3827.method_43370(), this.field_3827.method_29584(), 0L, this.field_3827.method_13576());
      } else {
         throw new RuntimeException("We are asking a region for a chunk out of bound");
      }
   }

   @Override
   public class_3232 method_43363() {
      return this.field_3827.method_28945();
   }

   @Override
   public long method_3133() {
      return this.field_3826;
   }

   @Override
   public class_3065<class_6414> method_43367() {
      return this.field_3820;
   }

   @Override
   public class_3065<class_2340> method_43362() {
      return this.field_3834;
   }

   @Override
   public int method_22552() {
      return this.field_3827.method_22552();
   }

   @Override
   public Random method_43360() {
      return this.field_3833;
   }

   @Override
   public int method_22562(class_3801 var1, int var2, int var3) {
      return this.method_22553(var2 >> 4, var3 >> 4).method_27367(var1, var2 & 15, var3 & 15) + 1;
   }

   @Override
   public void method_43359(PlayerEntity var1, BlockPos var2, class_8461 var3, class_562 var4, float var5, float var6) {
   }

   @Override
   public void method_43361(class_5079 var1, double var2, double var4, double var6, double var8, double var10, double var12) {
   }

   @Override
   public void method_43365(PlayerEntity var1, int var2, BlockPos var3, int var4) {
   }

   @Override
   public class_8760 method_22572() {
      return this.field_3819;
   }

   @Override
   public boolean method_38320(BlockPos var1, Predicate<class_2522> var2) {
      return var2.test(this.method_28262(var1));
   }

   @Override
   public <T extends Entity> List<T> method_25869(Class<? extends T> var1, Box var2, Predicate<? super T> var3) {
      return Collections.<T>emptyList();
   }

   @Override
   public List<Entity> method_25867(Entity var1, Box var2, Predicate<? super Entity> var3) {
      return Collections.<Entity>emptyList();
   }

   @Override
   public List<PlayerEntity> method_25873() {
      return Collections.<PlayerEntity>emptyList();
   }

   @Override
   public Stream<? extends class_3200<?>> method_3132(class_6979 var1, class_5390<?> var2) {
      return this.field_3828.method_9531(var1, var2);
   }
}
