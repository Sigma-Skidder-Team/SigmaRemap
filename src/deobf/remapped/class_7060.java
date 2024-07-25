package remapped;

import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import javax.annotation.Nullable;

public abstract class class_7060 {
   public static final class_2522 field_36439 = class_4783.field_23765.method_29260();
   public class_9616 field_36435;
   private Direction field_36437;
   private class_9022 field_36440;
   private class_6631 field_36436;
   public int field_36441;
   private final class_2746 field_36438;
   private static final Set<class_6414> field_36442 = ImmutableSet.builder()
      .add(class_4783.field_23587)
      .add(class_4783.field_23521)
      .add(class_4783.field_23740)
      .add(class_4783.field_23778)
      .add(class_4783.field_23792)
      .add(class_4783.field_23499)
      .add(class_4783.field_23915)
      .add(class_4783.field_23703)
      .add(class_4783.field_23694)
      .add(class_4783.field_23748)
      .add(class_4783.field_23817)
      .build();

   public class_7060(class_2746 var1, int var2) {
      this.field_36438 = var1;
      this.field_36441 = var2;
   }

   public class_7060(class_2746 var1, CompoundNBT var2) {
      this(var1, var2.method_25947("GD"));
      if (var2.method_25938("BB")) {
         this.field_36435 = new class_9616(var2.method_25922("BB"));
      }

      int var5 = var2.method_25947("O");
      this.method_32519(var5 != -1 ? Direction.method_1040(var5) : null);
   }

   public final CompoundNBT method_32520() {
      CompoundNBT var3 = new CompoundNBT();
      var3.method_25941("id", class_8669.field_44364.method_39797(this.method_32521()).toString());
      var3.put("BB", this.field_36435.method_44388());
      Direction var4 = this.method_32518();
      var3.method_25931("O", var4 != null ? var4.method_1031() : -1);
      var3.method_25931("GD", this.field_36441);
      this.method_32517(var3);
      return var3;
   }

   public abstract void method_32517(CompoundNBT var1);

   public void method_32527(class_7060 var1, List<class_7060> var2, Random var3) {
   }

   public abstract boolean method_32501(class_700 var1, class_2033 var2, class_6541 var3, Random var4, class_9616 var5, class_2034 var6, BlockPos var7);

   public class_9616 method_32512() {
      return this.field_36435;
   }

   public int method_32515() {
      return this.field_36441;
   }

   public boolean method_32510(class_2034 var1, int var2) {
      int var5 = var1.field_10328 << 4;
      int var6 = var1.field_10327 << 4;
      return this.field_36435.method_44401(var5 - var2, var6 - var2, var5 + 15 + var2, var6 + 15 + var2);
   }

   public static class_7060 method_32502(List<class_7060> var0, class_9616 var1) {
      for (class_7060 var5 : var0) {
         if (var5.method_32512() != null && var5.method_32512().method_44402(var1)) {
            return var5;
         }
      }

      return null;
   }

   public boolean method_32503(class_6163 var1, class_9616 var2) {
      int var5 = Math.max(this.field_36435.field_48996 - 1, var2.field_48996);
      int var6 = Math.max(this.field_36435.field_48995 - 1, var2.field_48995);
      int var7 = Math.max(this.field_36435.field_48992 - 1, var2.field_48992);
      int var8 = Math.min(this.field_36435.field_48991 + 1, var2.field_48991);
      int var9 = Math.min(this.field_36435.field_48993 + 1, var2.field_48993);
      int var10 = Math.min(this.field_36435.field_48994 + 1, var2.field_48994);
      class_2921 var11 = new class_2921();

      for (int var12 = var5; var12 <= var8; var12++) {
         for (int var13 = var7; var13 <= var10; var13++) {
            if (var1.method_28262(var11.method_13362(var12, var6, var13)).method_8362().method_24494()) {
               return true;
            }

            if (var1.method_28262(var11.method_13362(var12, var9, var13)).method_8362().method_24494()) {
               return true;
            }
         }
      }

      for (int var14 = var5; var14 <= var8; var14++) {
         for (int var16 = var6; var16 <= var9; var16++) {
            if (var1.method_28262(var11.method_13362(var14, var16, var7)).method_8362().method_24494()) {
               return true;
            }

            if (var1.method_28262(var11.method_13362(var14, var16, var10)).method_8362().method_24494()) {
               return true;
            }
         }
      }

      for (int var15 = var7; var15 <= var10; var15++) {
         for (int var17 = var6; var17 <= var9; var17++) {
            if (var1.method_28262(var11.method_13362(var5, var17, var15)).method_8362().method_24494()) {
               return true;
            }

            if (var1.method_28262(var11.method_13362(var8, var17, var15)).method_8362().method_24494()) {
               return true;
            }
         }
      }

      return false;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public int method_32530(int var1, int var2) {
      Direction var5 = this.method_32518();
      if (var5 == null) {
         return var1;
      } else {
         switch (var5) {
            case field_818:
            case field_800:
               return this.field_36435.field_48996 + var1;
            case field_809:
               return this.field_36435.field_48991 - var2;
            case field_804:
               return this.field_36435.field_48996 + var2;
            default:
               return var1;
         }
      }
   }

   public int method_32507(int var1) {
      return this.method_32518() != null ? var1 + this.field_36435.field_48995 : var1;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public int method_32523(int var1, int var2) {
      Direction var5 = this.method_32518();
      if (var5 == null) {
         return var2;
      } else {
         switch (var5) {
            case field_818:
               return this.field_36435.field_48994 - var2;
            case field_800:
               return this.field_36435.field_48992 + var2;
            case field_809:
            case field_804:
               return this.field_36435.field_48992 + var1;
            default:
               return var2;
         }
      }
   }

   public void method_32529(class_700 var1, class_2522 var2, int var3, int var4, int var5, class_9616 var6) {
      BlockPos var9 = new BlockPos(this.method_32530(var3, var5), this.method_32507(var4), this.method_32523(var3, var5));
      if (var6.method_44395(var9)) {
         if (this.field_36440 != class_9022.field_46145) {
            var2 = var2.method_8372(this.field_36440);
         }

         if (this.field_36436 != class_6631.field_34340) {
            var2 = var2.method_8318(this.field_36436);
         }

         var1.method_7513(var9, var2, 2);
         class_4774 var10 = var1.method_28258(var9);
         if (!var10.method_22001()) {
            var1.method_43362().method_14011(var9, var10.method_22005(), 0);
         }

         if (field_36442.contains(var2.method_8360())) {
            var1.method_22556(var9).method_27365(var9);
         }
      }
   }

   public class_2522 method_32514(class_6163 var1, int var2, int var3, int var4, class_9616 var5) {
      int var8 = this.method_32530(var2, var4);
      int var9 = this.method_32507(var3);
      int var10 = this.method_32523(var2, var4);
      BlockPos var11 = new BlockPos(var8, var9, var10);
      return var5.method_44395(var11) ? var1.method_28262(var11) : class_4783.field_23184.method_29260();
   }

   public boolean method_32522(class_4924 var1, int var2, int var3, int var4, class_9616 var5) {
      int var8 = this.method_32530(var2, var4);
      int var9 = this.method_32507(var3 + 1);
      int var10 = this.method_32523(var2, var4);
      BlockPos var11 = new BlockPos(var8, var9, var10);
      return var5.method_44395(var11) ? var9 < var1.method_22562(class_3801.field_18591, var8, var10) : false;
   }

   public void method_32505(class_700 var1, class_9616 var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      for (int var11 = var4; var11 <= var7; var11++) {
         for (int var12 = var3; var12 <= var6; var12++) {
            for (int var13 = var5; var13 <= var8; var13++) {
               this.method_32529(var1, class_4783.field_23184.method_29260(), var12, var11, var13, var2);
            }
         }
      }
   }

   public void method_32500(
      class_700 var1, class_9616 var2, int var3, int var4, int var5, int var6, int var7, int var8, class_2522 var9, class_2522 var10, boolean var11
   ) {
      for (int var14 = var4; var14 <= var7; var14++) {
         for (int var15 = var3; var15 <= var6; var15++) {
            for (int var16 = var5; var16 <= var8; var16++) {
               if (!var11 || !this.method_32514(var1, var15, var14, var16, var2).method_8345()) {
                  if (var14 != var4 && var14 != var7 && var15 != var3 && var15 != var6 && var16 != var5 && var16 != var8) {
                     this.method_32529(var1, var10, var15, var14, var16, var2);
                  } else {
                     this.method_32529(var1, var9, var15, var14, var16, var2);
                  }
               }
            }
         }
      }
   }

   public void method_32511(
      class_700 var1, class_9616 var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, Random var10, class_7230 var11
   ) {
      for (int var14 = var4; var14 <= var7; var14++) {
         for (int var15 = var3; var15 <= var6; var15++) {
            for (int var16 = var5; var16 <= var8; var16++) {
               if (!var9 || !this.method_32514(var1, var15, var14, var16, var2).method_8345()) {
                  var11.method_33092(
                     var10, var15, var14, var16, var14 == var4 || var14 == var7 || var15 == var3 || var15 == var6 || var16 == var5 || var16 == var8
                  );
                  this.method_32529(var1, var11.method_33093(), var15, var14, var16, var2);
               }
            }
         }
      }
   }

   public void method_32506(
      class_700 var1,
      class_9616 var2,
      Random var3,
      float var4,
      int var5,
      int var6,
      int var7,
      int var8,
      int var9,
      int var10,
      class_2522 var11,
      class_2522 var12,
      boolean var13,
      boolean var14
   ) {
      for (int var17 = var6; var17 <= var9; var17++) {
         for (int var18 = var5; var18 <= var8; var18++) {
            for (int var19 = var7; var19 <= var10; var19++) {
               if (!(var3.nextFloat() > var4)
                  && (!var13 || !this.method_32514(var1, var18, var17, var19, var2).method_8345())
                  && (!var14 || this.method_32522(var1, var18, var17, var19, var2))) {
                  if (var17 != var6 && var17 != var9 && var18 != var5 && var18 != var8 && var19 != var7 && var19 != var10) {
                     this.method_32529(var1, var12, var18, var17, var19, var2);
                  } else {
                     this.method_32529(var1, var11, var18, var17, var19, var2);
                  }
               }
            }
         }
      }
   }

   public void method_32524(class_700 var1, class_9616 var2, Random var3, float var4, int var5, int var6, int var7, class_2522 var8) {
      if (var3.nextFloat() < var4) {
         this.method_32529(var1, var8, var5, var6, var7, var2);
      }
   }

   public void method_32516(class_700 var1, class_9616 var2, int var3, int var4, int var5, int var6, int var7, int var8, class_2522 var9, boolean var10) {
      float var13 = (float)(var6 - var3 + 1);
      float var14 = (float)(var7 - var4 + 1);
      float var15 = (float)(var8 - var5 + 1);
      float var16 = (float)var3 + var13 / 2.0F;
      float var17 = (float)var5 + var15 / 2.0F;

      for (int var18 = var4; var18 <= var7; var18++) {
         float var19 = (float)(var18 - var4) / var14;

         for (int var20 = var3; var20 <= var6; var20++) {
            float var21 = ((float)var20 - var16) / (var13 * 0.5F);

            for (int var22 = var5; var22 <= var8; var22++) {
               float var23 = ((float)var22 - var17) / (var15 * 0.5F);
               if (!var10 || !this.method_32514(var1, var20, var18, var22, var2).method_8345()) {
                  float var24 = var21 * var21 + var19 * var19 + var23 * var23;
                  if (var24 <= 1.05F) {
                     this.method_32529(var1, var9, var20, var18, var22, var2);
                  }
               }
            }
         }
      }
   }

   public void method_32499(class_700 var1, class_2522 var2, int var3, int var4, int var5, class_9616 var6) {
      int var9 = this.method_32530(var3, var5);
      int var10 = this.method_32507(var4);
      int var11 = this.method_32523(var3, var5);
      if (var6.method_44395(new BlockPos(var9, var10, var11))) {
         while (
            (var1.method_22548(new BlockPos(var9, var10, var11)) || var1.method_28262(new BlockPos(var9, var10, var11)).method_8362().method_24494())
               && var10 > 1
         ) {
            var1.method_7513(new BlockPos(var9, var10, var11), var2, 2);
            var10--;
         }
      }
   }

   public boolean method_32525(class_700 var1, class_9616 var2, Random var3, int var4, int var5, int var6, Identifier var7) {
      BlockPos var10 = new BlockPos(this.method_32530(var4, var6), this.method_32507(var5), this.method_32523(var4, var6));
      return this.method_32526(var1, var2, var3, var10, var7, (class_2522)null);
   }

   public static class_2522 method_32509(class_6163 var0, BlockPos var1, class_2522 var2) {
      Direction var5 = null;

      for (Direction var7 : class_9594.field_48893) {
         BlockPos var8 = var1.method_6098(var7);
         class_2522 var9 = var0.method_28262(var8);
         if (var9.method_8350(class_4783.field_23471)) {
            return var2;
         }

         if (var9.method_8321(var0, var8)) {
            if (var5 != null) {
               var5 = null;
               break;
            }

            var5 = var7;
         }
      }

      if (var5 == null) {
         Direction var10 = var2.<Direction>method_10313(class_380.field_1543);
         BlockPos var11 = var1.method_6098(var10);
         if (var0.method_28262(var11).method_8321(var0, var11)) {
            var10 = var10.method_1046();
            var11 = var1.method_6098(var10);
         }

         if (var0.method_28262(var11).method_8321(var0, var11)) {
            var10 = var10.method_1042();
            var11 = var1.method_6098(var10);
         }

         if (var0.method_28262(var11).method_8321(var0, var11)) {
            var10 = var10.method_1046();
            var1.method_6098(var10);
         }

         return var2.method_10308(class_380.field_1543, var10);
      } else {
         return var2.method_10308(class_380.field_1543, var5.method_1046());
      }
   }

   public boolean method_32526(class_1556 var1, class_9616 var2, Random var3, BlockPos var4, Identifier var5, class_2522 var6) {
      if (var2.method_44395(var4) && !var1.method_28262(var4).method_8350(class_4783.field_23471)) {
         if (var6 == null) {
            var6 = method_32509(var1, var4, class_4783.field_23471.method_29260());
         }

         var1.method_7513(var4, var6, 2);
         class_3757 var9 = var1.method_28260(var4);
         if (var9 instanceof class_7099) {
            ((class_7099)var9).method_10816(var5, var3.nextLong());
         }

         return true;
      } else {
         return false;
      }
   }

   public boolean method_32504(class_700 var1, class_9616 var2, Random var3, int var4, int var5, int var6, Direction var7, Identifier var8) {
      BlockPos var11 = new BlockPos(this.method_32530(var4, var6), this.method_32507(var5), this.method_32523(var4, var6));
      if (var2.method_44395(var11) && !var1.method_28262(var11).method_8350(class_4783.field_23304)) {
         this.method_32529(var1, class_4783.field_23304.method_29260().method_10308(class_6451.field_32900, var7), var4, var5, var6, var2);
         class_3757 var12 = var1.method_28260(var11);
         if (var12 instanceof class_7434) {
            ((class_7434)var12).method_10816(var8, var3.nextLong());
         }

         return true;
      } else {
         return false;
      }
   }

   public void method_32508(int var1, int var2, int var3) {
      this.field_36435.method_44391(var1, var2, var3);
   }

   @Nullable
   public Direction method_32518() {
      return this.field_36437;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void method_32519(Direction var1) {
      this.field_36437 = var1;
      if (var1 == null) {
         this.field_36436 = class_6631.field_34340;
         this.field_36440 = class_9022.field_46145;
      } else {
         switch (var1) {
            case field_800:
               this.field_36440 = class_9022.field_46148;
               this.field_36436 = class_6631.field_34340;
               break;
            case field_809:
               this.field_36440 = class_9022.field_46148;
               this.field_36436 = class_6631.field_34334;
               break;
            case field_804:
               this.field_36440 = class_9022.field_46145;
               this.field_36436 = class_6631.field_34334;
               break;
            default:
               this.field_36440 = class_9022.field_46145;
               this.field_36436 = class_6631.field_34340;
         }
      }
   }

   public class_6631 method_32528() {
      return this.field_36436;
   }

   public class_2746 method_32521() {
      return this.field_36438;
   }
}
