package remapped;

import java.util.Random;
import javax.annotation.Nullable;

public abstract class class_4607 extends class_1173 {
   private BlockPos field_22413;
   private boolean field_22414;
   private boolean field_22415;

   public class_4607(class_6629<? extends class_4607> var1, World var2) {
      super(var1, var2);
   }

   @Override
   public void method_26851() {
      super.method_26851();
      this.field_29916.method_3485(4, new class_646<class_4607>(this, 0.7, 0.595));
   }

   @Override
   public void method_37376(CompoundNBT var1) {
      super.method_37376(var1);
      if (this.field_22413 != null) {
         var1.put("PatrolTarget", class_4338.method_20190(this.field_22413));
      }

      var1.putBoolean("PatrolLeader", this.field_22414);
      var1.putBoolean("Patrolling", this.field_22415);
   }

   @Override
   public void method_37314(CompoundNBT var1) {
      super.method_37314(var1);
      if (var1.method_25938("PatrolTarget")) {
         this.field_22413 = class_4338.method_20189(var1.getCompound("PatrolTarget"));
      }

      this.field_22414 = var1.getBoolean("PatrolLeader");
      this.field_22415 = var1.getBoolean("Patrolling");
   }

   @Override
   public double method_37106() {
      return -0.45;
   }

   public boolean method_21357() {
      return true;
   }

   @Nullable
   @Override
   public class_8733 method_26864(class_1556 var1, class_9589 var2, class_2417 var3, class_8733 var4, CompoundNBT var5) {
      if (var3 != class_2417.field_12025
         && var3 != class_2417.field_12040
         && var3 != class_2417.field_12033
         && this.field_41717.nextFloat() < 0.06F
         && this.method_21357()) {
         this.field_22414 = true;
      }

      if (this.method_21359()) {
         this.method_37349(class_6943.field_35704, class_2452.method_11292());
         this.method_26861(class_6943.field_35704, 2.0F);
      }

      if (var3 == class_2417.field_12025) {
         this.field_22415 = true;
      }

      return super.method_26864(var1, var2, var3, var4, var5);
   }

   public static boolean method_21355(class_6629<? extends class_4607> var0, class_9379 var1, class_2417 var2, BlockPos var3, Random var4) {
      return var1.method_25266(class_2957.field_14440, var3) <= 8 ? method_5198(var0, var1, var2, var3, var4) : false;
   }

   @Override
   public boolean method_26911(double var1) {
      return !this.field_22415 || var1 > 16384.0;
   }

   public void method_21349(BlockPos var1) {
      this.field_22413 = var1;
      this.field_22415 = true;
   }

   public BlockPos method_21358() {
      return this.field_22413;
   }

   public boolean method_21353() {
      return this.field_22413 != null;
   }

   public void method_21354(boolean var1) {
      this.field_22414 = var1;
      this.field_22415 = true;
   }

   public boolean method_21359() {
      return this.field_22414;
   }

   public boolean method_21350() {
      return true;
   }

   public void method_21356() {
      this.field_22413 = this.method_37075().method_6104(-500 + this.field_41717.nextInt(1000), 0, -500 + this.field_41717.nextInt(1000));
      this.field_22415 = true;
   }

   public boolean method_21352() {
      return this.field_22415;
   }

   public void method_21351(boolean var1) {
      this.field_22415 = var1;
   }
}
