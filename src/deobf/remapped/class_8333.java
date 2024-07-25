package remapped;

import java.util.EnumSet;

public class class_8333 extends class_3599 {
   private static String[] field_42659;
   private final class_449 field_42658;
   private boolean field_42660;

   public class_8333(class_449 var1) {
      this.field_42658 = var1;
      this.method_16800(EnumSet.<class_1891>of(class_1891.field_9564, class_1891.field_9560));
   }

   @Override
   public boolean method_16801() {
      return false;
   }

   @Override
   public boolean method_16795() {
      return this.field_42658.method_2161() && this.field_42658.method_37229() >= 100;
   }

   @Override
   public boolean method_16799() {
      BlockPos var3 = this.field_42658.method_2163();
      return !new BlockPos((double)var3.method_12173(), this.field_42658.method_37309(), (double)var3.method_12185())
            .method_12170(this.field_42658.method_37245(), 4.0)
         && !this.field_42660
         && this.field_42658.method_37229() >= 100;
   }

   @Override
   public void method_16796() {
      if (this.field_42658.world instanceof class_6331) {
         class_6331 var3 = (class_6331)this.field_42658.world;
         this.field_42660 = false;
         this.field_42658.method_26927().method_5620();
         BlockPos var4 = this.field_42658.method_37075();
         class_5390 var5 = !((double)var3.field_33033.nextFloat() >= 0.5) ? class_5390.field_27508 : class_5390.field_27495;
         BlockPos var6 = var3.method_29000(var5, var4, 50, false);
         if (var6 != null) {
            this.field_42658.method_2155(var6);
         } else {
            class_5390 var7 = !var5.equals(class_5390.field_27495) ? class_5390.field_27495 : class_5390.field_27508;
            BlockPos var8 = var3.method_29000(var7, var4, 50, false);
            if (var8 == null) {
               this.field_42660 = true;
               return;
            }

            this.field_42658.method_2155(var8);
         }

         var3.method_29587(this.field_42658, (byte)38);
      }
   }

   @Override
   public void method_16793() {
      BlockPos var3 = this.field_42658.method_2163();
      if (new BlockPos((double)var3.method_12173(), this.field_42658.method_37309(), (double)var3.method_12185())
            .method_12170(this.field_42658.method_37245(), 4.0)
         || this.field_42660) {
         this.field_42658.method_2153(false);
      }
   }

   @Override
   public void method_16794() {
      World var3 = this.field_42658.world;
      if (this.field_42658.method_2162() || this.field_42658.method_26927().method_5591()) {
         class_1343 var4 = class_1343.method_6216(this.field_42658.method_2163());
         class_1343 var5 = class_3425.method_15841(this.field_42658, 16, 1, var4, (float) (Math.PI / 8));
         if (var5 == null) {
            var5 = class_3425.method_15837(this.field_42658, 8, 4, var4);
         }

         if (var5 != null) {
            BlockPos var6 = new BlockPos(var5);
            if (!var3.method_28258(var6).method_22007(class_6503.field_33094) || !var3.method_28262(var6).method_8319(var3, var6, class_2929.field_14272)) {
               var5 = class_3425.method_15837(this.field_42658, 8, 5, var4);
            }
         }

         if (var5 == null) {
            this.field_42660 = true;
            return;
         }

         this.field_42658
            .method_26865()
            .method_17231(
               var5.field_7336, var5.field_7333, var5.field_7334, (float)(this.field_42658.method_26903() + 20), (float)this.field_42658.method_26862()
            );
         this.field_42658.method_26927().method_5595(var5.field_7336, var5.field_7333, var5.field_7334, 1.3);
         if (var3.field_33033.nextInt(80) == 0) {
            var3.method_29587(this.field_42658, (byte)38);
         }
      }
   }
}
