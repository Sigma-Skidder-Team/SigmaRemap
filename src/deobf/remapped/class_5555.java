package remapped;

import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_5555 extends class_9795 implements class_3745 {
   private static final Logger field_28270 = LogManager.getLogger();
   private long field_28273;
   private int field_28271;
   private BlockPos field_28268;
   private boolean field_28269;

   public class_5555() {
      super(class_133.field_354);
   }

   @Override
   public CompoundNBT method_17396(CompoundNBT var1) {
      super.method_17396(var1);
      var1.method_25949("Age", this.field_28273);
      if (this.field_28268 != null) {
         var1.put("ExitPortal", class_4338.method_20190(this.field_28268));
      }

      if (this.field_28269) {
         var1.putBoolean("ExactTeleport", this.field_28269);
      }

      return var1;
   }

   @Override
   public void method_17394(class_2522 var1, CompoundNBT var2) {
      super.method_17394(var1, var2);
      this.field_28273 = var2.method_25948("Age");
      if (var2.contains("ExitPortal", 10)) {
         this.field_28268 = class_4338.method_20189(var2.getCompound("ExitPortal"));
      }

      this.field_28269 = var2.getBoolean("ExactTeleport");
   }

   @Override
   public double method_17404() {
      return 256.0;
   }

   @Override
   public void method_17353() {
      boolean var3 = this.method_25241();
      boolean var4 = this.method_25249();
      this.field_28273++;
      if (!var4) {
         if (!this.field_18364.field_33055) {
            List var5 = this.field_18364.<Entity>method_25869(Entity.class, new Box(this.method_17399()), class_5555::method_25250);
            if (!var5.isEmpty()) {
               this.method_25252((Entity)var5.get(this.field_18364.field_33033.nextInt(var5.size())));
            }

            if (this.field_28273 % 2400L == 0L) {
               this.method_25242();
            }
         }
      } else {
         this.field_28271--;
      }

      if (var3 != this.method_25241() || var4 != this.method_25249()) {
         this.method_17407();
      }
   }

   public static boolean method_25250(Entity var0) {
      return class_3572.field_17483.test(var0) && !var0.getLowestRidingEntity().method_37121();
   }

   public boolean method_25241() {
      return this.field_28273 < 200L;
   }

   public boolean method_25249() {
      return this.field_28271 > 0;
   }

   public float method_25245(float var1) {
      return class_9299.method_42828(((float)this.field_28273 + var1) / 200.0F, 0.0F, 1.0F);
   }

   public float method_25244(float var1) {
      return 1.0F - class_9299.method_42828(((float)this.field_28271 - var1) / 40.0F, 0.0F, 1.0F);
   }

   @Nullable
   @Override
   public class_5029 method_17413() {
      return new class_5029(this.field_18358, 8, this.method_17414());
   }

   @Override
   public CompoundNBT method_17414() {
      return this.method_17396(new CompoundNBT());
   }

   public void method_25242() {
      if (!this.field_18364.field_33055) {
         this.field_28271 = 40;
         this.field_18364.method_29521(this.method_17399(), this.method_17403().method_8360(), 1, 0);
         this.method_17407();
      }
   }

   @Override
   public boolean method_17408(int var1, int var2) {
      if (var1 != 1) {
         return super.method_17408(var1, var2);
      } else {
         this.field_28271 = 40;
         return true;
      }
   }

   public void method_25252(Entity var1) {
      if (this.field_18364 instanceof class_6331 && !this.method_25249()) {
         this.field_28271 = 100;
         if (this.field_28268 == null && this.field_18364.method_29545() == World.field_33038) {
            this.method_25251((class_6331)this.field_18364);
         }

         if (this.field_28268 != null) {
            BlockPos var4 = !this.field_28269 ? this.method_25254() : this.field_28268;
            Entity var5;
            if (!(var1 instanceof class_1537)) {
               var5 = var1.getLowestRidingEntity();
            } else {
               Entity var6 = ((class_1537)var1).method_26166();
               if (var6 instanceof class_9359) {
                  class_8807.field_45077.method_8117((class_9359)var6, this.field_18364.method_28262(this.method_17399()));
               }

               if (var6 == null) {
                  var5 = var1;
               } else {
                  var5 = var6;
                  var1.method_37204();
               }
            }

            var5.method_37157();
            var5.method_37079((double)var4.method_12173() + 0.5, (double)var4.method_12165(), (double)var4.method_12185() + 0.5);
         }

         this.method_25242();
      }
   }

   private BlockPos method_25254() {
      BlockPos var3 = method_25246(this.field_18364, this.field_28268.method_6104(0, 2, 0), 5, false);
      field_28270.debug("Best exit position for portal at {} is {}", this.field_28268, var3);
      return var3.method_6081();
   }

   private void method_25251(class_6331 var1) {
      class_1343 var4 = new class_1343((double)this.method_17399().method_12173(), 0.0, (double)this.method_17399().method_12185()).method_6213();
      class_1343 var5 = var4.method_6209(1024.0);

      for (int var6 = 16; method_25243(var1, var5).method_27350() > 0 && var6-- > 0; var5 = var5.method_6215(var4.method_6209(-16.0))) {
         field_28270.debug("Skipping backwards past nonempty chunk at {}", var5);
      }

      for (int var7 = 16; method_25243(var1, var5).method_27350() == 0 && var7-- > 0; var5 = var5.method_6215(var4.method_6209(16.0))) {
         field_28270.debug("Skipping forward past empty chunk at {}", var5);
      }

      field_28270.debug("Found chunk at {}", var5);
      class_2654 var8 = method_25243(var1, var5);
      this.field_28268 = method_25247(var8);
      if (this.field_28268 != null) {
         field_28270.debug("Found block at {}", this.field_28268);
      } else {
         this.field_28268 = new BlockPos(var5.field_7336 + 0.5, 75.0, var5.field_7334 + 0.5);
         field_28270.debug("Failed to find suitable block, settling on {}", this.field_28268);
         class_7024.field_36063.method_27104(var1, var1.method_28945().method_10189(), new Random(this.field_28268.method_6077()), this.field_28268);
      }

      this.field_28268 = method_25246(var1, this.field_28268, 16, true);
      field_28270.debug("Creating portal at {}", this.field_28268);
      this.field_28268 = this.field_28268.method_6082(10);
      this.method_25248(var1, this.field_28268);
      this.method_17407();
   }

   private static BlockPos method_25246(class_6163 var0, BlockPos var1, int var2, boolean var3) {
      BlockPos var6 = null;

      for (int var7 = -var2; var7 <= var2; var7++) {
         for (int var8 = -var2; var8 <= var2; var8++) {
            if (var7 != 0 || var8 != 0 || var3) {
               for (int var9 = 255; var9 > (var6 != null ? var6.method_12165() : 0); var9--) {
                  BlockPos var10 = new BlockPos(var1.method_12173() + var7, var9, var1.method_12185() + var8);
                  class_2522 var11 = var0.method_28262(var10);
                  if (var11.method_8306(var0, var10) && (var3 || !var11.method_8350(class_4783.field_23433))) {
                     var6 = var10;
                     break;
                  }
               }
            }
         }
      }

      return var6 != null ? var6 : var1;
   }

   private static class_2654 method_25243(World var0, class_1343 var1) {
      return var0.method_29554(class_9299.method_42847(var1.field_7336 / 16.0), class_9299.method_42847(var1.field_7334 / 16.0));
   }

   @Nullable
   private static BlockPos method_25247(class_2654 var0) {
      class_2034 var3 = var0.method_27352();
      BlockPos var4 = new BlockPos(var3.method_9535(), 30, var3.method_9545());
      int var5 = var0.method_27350() + 16 - 1;
      BlockPos var6 = new BlockPos(var3.method_9536(), var5, var3.method_9538());
      BlockPos var7 = null;
      double var8 = 0.0;

      for (BlockPos var11 : BlockPos.method_6076(var4, var6)) {
         class_2522 var12 = var0.method_28262(var11);
         BlockPos var13 = var11.method_6081();
         BlockPos var14 = var11.method_6082(2);
         if (var12.method_8350(class_4783.field_23894)
            && !var0.method_28262(var13).method_8306(var0, var13)
            && !var0.method_28262(var14).method_8306(var0, var14)) {
            double var15 = var11.method_12178(0.0, 0.0, 0.0, true);
            if (var7 == null || var15 < var8) {
               var7 = var11;
               var8 = var15;
            }
         }
      }

      return var7;
   }

   private void method_25248(class_6331 var1, BlockPos var2) {
      class_4285.field_20750
         .method_19909(class_3043.method_13893(this.method_17399(), false))
         .method_27104(var1, var1.method_28945().method_10189(), new Random(), var2);
   }

   @Override
   public boolean method_45197(Direction var1) {
      return class_6414.method_29283(this.method_17403(), this.field_18364, this.method_17399(), var1);
   }

   public int method_25240() {
      int var3 = 0;

      for (Direction var7 : Direction.values()) {
         var3 += !this.method_45197(var7) ? 0 : 1;
      }

      return var3;
   }

   public void method_25253(BlockPos var1, boolean var2) {
      this.field_28269 = var2;
      this.field_28268 = var1;
   }
}
