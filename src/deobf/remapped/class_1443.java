package remapped;

import java.util.List;
import java.util.Random;

public class class_1443 extends class_6315 {
   private boolean field_7772;

   public class_1443(int var1, class_9616 var2, Direction var3) {
      super(class_2746.field_13421, var1);
      this.method_32519(var3);
      this.field_36435 = var2;
   }

   public class_1443(class_5799 var1, CompoundNBT var2) {
      super(class_2746.field_13421, var2);
      this.field_7772 = var2.getBoolean("Mob");
   }

   @Override
   public void method_32517(CompoundNBT var1) {
      super.method_32517(var1);
      var1.putBoolean("Mob", this.field_7772);
   }

   public static class_1443 method_6618(List<class_7060> var0, int var1, int var2, int var3, int var4, Direction var5) {
      class_9616 var8 = class_9616.method_44386(var1, var2, var3, -2, 0, 0, 7, 8, 9, var5);
      return method_28781(var8) && class_7060.method_32502(var0, var8) == null ? new class_1443(var4, var8, var5) : null;
   }

   @Override
   public boolean method_32501(class_700 var1, class_2033 var2, class_6541 var3, Random var4, class_9616 var5, class_2034 var6, BlockPos var7) {
      this.method_32500(var1, var5, 0, 2, 0, 6, 7, 7, class_4783.field_23184.method_29260(), class_4783.field_23184.method_29260(), false);
      this.method_32500(var1, var5, 1, 0, 0, 5, 1, 7, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);
      this.method_32500(var1, var5, 1, 2, 1, 5, 2, 7, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);
      this.method_32500(var1, var5, 1, 3, 2, 5, 3, 7, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);
      this.method_32500(var1, var5, 1, 4, 3, 5, 4, 7, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);
      this.method_32500(var1, var5, 1, 2, 0, 1, 4, 2, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);
      this.method_32500(var1, var5, 5, 2, 0, 5, 4, 2, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);
      this.method_32500(var1, var5, 1, 5, 2, 1, 5, 3, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);
      this.method_32500(var1, var5, 5, 5, 2, 5, 5, 3, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);
      this.method_32500(var1, var5, 0, 5, 3, 0, 5, 8, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);
      this.method_32500(var1, var5, 6, 5, 3, 6, 5, 8, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);
      this.method_32500(var1, var5, 1, 5, 8, 5, 5, 8, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);
      class_2522 var10 = class_4783.field_23587
         .method_29260()
         .method_10308(class_3821.field_49664, Boolean.valueOf(true))
         .method_10308(class_3821.field_49667, Boolean.valueOf(true));
      class_2522 var11 = class_4783.field_23587
         .method_29260()
         .method_10308(class_3821.field_49671, Boolean.valueOf(true))
         .method_10308(class_3821.field_49670, Boolean.valueOf(true));
      this.method_32529(var1, class_4783.field_23587.method_29260().method_10308(class_3821.field_49664, Boolean.valueOf(true)), 1, 6, 3, var5);
      this.method_32529(var1, class_4783.field_23587.method_29260().method_10308(class_3821.field_49667, Boolean.valueOf(true)), 5, 6, 3, var5);
      this.method_32529(
         var1,
         class_4783.field_23587
            .method_29260()
            .method_10308(class_3821.field_49667, Boolean.valueOf(true))
            .method_10308(class_3821.field_49671, Boolean.valueOf(true)),
         0,
         6,
         3,
         var5
      );
      this.method_32529(
         var1,
         class_4783.field_23587
            .method_29260()
            .method_10308(class_3821.field_49664, Boolean.valueOf(true))
            .method_10308(class_3821.field_49671, Boolean.valueOf(true)),
         6,
         6,
         3,
         var5
      );
      this.method_32500(var1, var5, 0, 6, 4, 0, 6, 7, var11, var11, false);
      this.method_32500(var1, var5, 6, 6, 4, 6, 6, 7, var11, var11, false);
      this.method_32529(
         var1,
         class_4783.field_23587
            .method_29260()
            .method_10308(class_3821.field_49667, Boolean.valueOf(true))
            .method_10308(class_3821.field_49670, Boolean.valueOf(true)),
         0,
         6,
         8,
         var5
      );
      this.method_32529(
         var1,
         class_4783.field_23587
            .method_29260()
            .method_10308(class_3821.field_49664, Boolean.valueOf(true))
            .method_10308(class_3821.field_49670, Boolean.valueOf(true)),
         6,
         6,
         8,
         var5
      );
      this.method_32500(var1, var5, 1, 6, 8, 5, 6, 8, var10, var10, false);
      this.method_32529(var1, class_4783.field_23587.method_29260().method_10308(class_3821.field_49667, Boolean.valueOf(true)), 1, 7, 8, var5);
      this.method_32500(var1, var5, 2, 7, 8, 4, 7, 8, var10, var10, false);
      this.method_32529(var1, class_4783.field_23587.method_29260().method_10308(class_3821.field_49664, Boolean.valueOf(true)), 5, 7, 8, var5);
      this.method_32529(var1, class_4783.field_23587.method_29260().method_10308(class_3821.field_49667, Boolean.valueOf(true)), 2, 8, 8, var5);
      this.method_32529(var1, var10, 3, 8, 8, var5);
      this.method_32529(var1, class_4783.field_23587.method_29260().method_10308(class_3821.field_49664, Boolean.valueOf(true)), 4, 8, 8, var5);
      if (!this.field_7772) {
         BlockPos var12 = new BlockPos(this.method_32530(3, 5), this.method_32507(5), this.method_32523(3, 5));
         if (var5.method_44395(var12)) {
            this.field_7772 = true;
            var1.method_7513(var12, class_4783.field_23617.method_29260(), 2);
            class_3757 var13 = var1.method_28260(var12);
            if (var13 instanceof class_1896) {
               ((class_1896)var13).method_8621().method_16253(EntityType.field_34301);
            }
         }
      }

      for (int var14 = 0; var14 <= 6; var14++) {
         for (int var15 = 0; var15 <= 6; var15++) {
            this.method_32499(var1, class_4783.field_23484.method_29260(), var14, -1, var15, var5);
         }
      }

      return true;
   }
}
