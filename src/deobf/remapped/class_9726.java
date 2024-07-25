package remapped;

import java.util.Random;

public class class_9726 extends class_7896 {
   private boolean field_49438;
   private boolean field_49439;

   public class_9726(Random var1, int var2, int var3) {
      super(class_2746.field_13404, var1, var2, 64, var3, 7, 7, 9);
   }

   public class_9726(class_5799 var1, CompoundNBT var2) {
      super(class_2746.field_13404, var2);
      this.field_49438 = var2.getBoolean("Witch");
      this.field_49439 = var2.getBoolean("Cat");
   }

   @Override
   public void method_32517(CompoundNBT var1) {
      super.method_32517(var1);
      var1.putBoolean("Witch", this.field_49438);
      var1.putBoolean("Cat", this.field_49439);
   }

   @Override
   public boolean method_32501(class_700 var1, class_2033 var2, class_6541 var3, Random var4, class_9616 var5, class_2034 var6, BlockPos var7) {
      if (!this.method_35693(var1, var5, 0)) {
         return false;
      } else {
         this.method_32500(var1, var5, 1, 1, 1, 5, 1, 7, class_4783.field_23464.method_29260(), class_4783.field_23464.method_29260(), false);
         this.method_32500(var1, var5, 1, 4, 2, 5, 4, 7, class_4783.field_23464.method_29260(), class_4783.field_23464.method_29260(), false);
         this.method_32500(var1, var5, 2, 1, 0, 4, 1, 0, class_4783.field_23464.method_29260(), class_4783.field_23464.method_29260(), false);
         this.method_32500(var1, var5, 2, 2, 2, 3, 3, 2, class_4783.field_23464.method_29260(), class_4783.field_23464.method_29260(), false);
         this.method_32500(var1, var5, 1, 2, 3, 1, 3, 6, class_4783.field_23464.method_29260(), class_4783.field_23464.method_29260(), false);
         this.method_32500(var1, var5, 5, 2, 3, 5, 3, 6, class_4783.field_23464.method_29260(), class_4783.field_23464.method_29260(), false);
         this.method_32500(var1, var5, 2, 2, 7, 4, 3, 7, class_4783.field_23464.method_29260(), class_4783.field_23464.method_29260(), false);
         this.method_32500(var1, var5, 1, 0, 2, 1, 3, 2, class_4783.field_23365.method_29260(), class_4783.field_23365.method_29260(), false);
         this.method_32500(var1, var5, 5, 0, 2, 5, 3, 2, class_4783.field_23365.method_29260(), class_4783.field_23365.method_29260(), false);
         this.method_32500(var1, var5, 1, 0, 7, 1, 3, 7, class_4783.field_23365.method_29260(), class_4783.field_23365.method_29260(), false);
         this.method_32500(var1, var5, 5, 0, 7, 5, 3, 7, class_4783.field_23365.method_29260(), class_4783.field_23365.method_29260(), false);
         this.method_32529(var1, class_4783.field_23778.method_29260(), 2, 3, 2, var5);
         this.method_32529(var1, class_4783.field_23778.method_29260(), 3, 3, 7, var5);
         this.method_32529(var1, class_4783.field_23184.method_29260(), 1, 3, 4, var5);
         this.method_32529(var1, class_4783.field_23184.method_29260(), 5, 3, 4, var5);
         this.method_32529(var1, class_4783.field_23184.method_29260(), 5, 3, 5, var5);
         this.method_32529(var1, class_4783.field_23356.method_29260(), 1, 3, 5, var5);
         this.method_32529(var1, class_4783.field_23794.method_29260(), 3, 2, 6, var5);
         this.method_32529(var1, class_4783.field_23673.method_29260(), 4, 2, 6, var5);
         this.method_32529(var1, class_4783.field_23778.method_29260(), 1, 2, 1, var5);
         this.method_32529(var1, class_4783.field_23778.method_29260(), 5, 2, 1, var5);
         class_2522 var10 = class_4783.field_23759.method_29260().method_10308(class_3049.field_14946, Direction.field_818);
         class_2522 var11 = class_4783.field_23759.method_29260().method_10308(class_3049.field_14946, Direction.field_804);
         class_2522 var12 = class_4783.field_23759.method_29260().method_10308(class_3049.field_14946, Direction.field_809);
         class_2522 var13 = class_4783.field_23759.method_29260().method_10308(class_3049.field_14946, Direction.field_800);
         this.method_32500(var1, var5, 0, 4, 1, 6, 4, 1, var10, var10, false);
         this.method_32500(var1, var5, 0, 4, 2, 0, 4, 7, var11, var11, false);
         this.method_32500(var1, var5, 6, 4, 2, 6, 4, 7, var12, var12, false);
         this.method_32500(var1, var5, 0, 4, 8, 6, 4, 8, var13, var13, false);
         this.method_32529(var1, var10.method_10308(class_3049.field_14957, class_476.field_2960), 0, 4, 1, var5);
         this.method_32529(var1, var10.method_10308(class_3049.field_14957, class_476.field_2964), 6, 4, 1, var5);
         this.method_32529(var1, var13.method_10308(class_3049.field_14957, class_476.field_2964), 0, 4, 8, var5);
         this.method_32529(var1, var13.method_10308(class_3049.field_14957, class_476.field_2960), 6, 4, 8, var5);

         for (byte var14 = 2; var14 <= 7; var14 += 5) {
            for (byte var15 = 1; var15 <= 5; var15 += 4) {
               this.method_32499(var1, class_4783.field_23365.method_29260(), var15, -1, var14, var5);
            }
         }

         if (!this.field_49438) {
            int var18 = this.method_32530(2, 5);
            int var19 = this.method_32507(2);
            int var16 = this.method_32523(2, 5);
            if (var5.method_44395(new BlockPos(var18, var19, var16))) {
               this.field_49438 = true;
               class_1609 var17 = class_6629.field_34220.method_30484(var1.method_7066());
               var17.method_26883();
               var17.method_37144((double)var18 + 0.5, (double)var19, (double)var16 + 0.5, 0.0F, 0.0F);
               var17.method_26864(var1, var1.method_43368(new BlockPos(var18, var19, var16)), class_2417.field_12033, (class_8733)null, (CompoundNBT)null);
               var1.method_7065(var17);
            }
         }

         this.method_44927(var1, var5);
         return true;
      }
   }

   private void method_44927(class_1556 var1, class_9616 var2) {
      if (!this.field_49439) {
         int var5 = this.method_32530(2, 5);
         int var6 = this.method_32507(2);
         int var7 = this.method_32523(2, 5);
         if (var2.method_44395(new BlockPos(var5, var6, var7))) {
            this.field_49439 = true;
            class_5583 var8 = class_6629.field_34249.method_30484(var1.method_7066());
            var8.method_26883();
            var8.method_37144((double)var5 + 0.5, (double)var6, (double)var7 + 0.5, 0.0F, 0.0F);
            var8.method_26864(var1, var1.method_43368(new BlockPos(var5, var6, var7)), class_2417.field_12033, (class_8733)null, (CompoundNBT)null);
            var1.method_7065(var8);
         }
      }
   }
}
