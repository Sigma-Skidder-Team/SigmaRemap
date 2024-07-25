package remapped;

public class class_1298 extends class_6788 {
   private static String[] field_7157;
   public static final class_7360<class_3665> field_7159 = class_6023.field_30760;
   public static final class_6720 field_7158 = class_6023.field_30696;

   public class_1298(class_3073 var1) {
      super(true, var1);
      this.method_29284(this.field_32751.method_36446().method_10308(field_7159, class_3665.field_17829).method_10308(field_7158, Boolean.valueOf(false)));
   }

   public boolean method_5888(World var1, BlockPos var2, class_2522 var3, boolean var4, int var5) {
      if (var5 >= 8) {
         return false;
      } else {
         int var8 = var2.getX();
         int var9 = var2.method_12165();
         int var10 = var2.method_12185();
         boolean var11 = true;
         class_3665 var12 = var3.<class_3665>method_10313(field_7159);
         switch (var12) {
            case field_17829:
               if (var4) {
                  var10++;
               } else {
                  var10--;
               }
               break;
            case field_17831:
               if (var4) {
                  var8--;
               } else {
                  var8++;
               }
               break;
            case field_17835:
               if (var4) {
                  var8--;
               } else {
                  var8++;
                  var9++;
                  var11 = false;
               }

               var12 = class_3665.field_17831;
               break;
            case field_17826:
               if (var4) {
                  var8--;
                  var9++;
                  var11 = false;
               } else {
                  var8++;
               }

               var12 = class_3665.field_17831;
               break;
            case field_17833:
               if (var4) {
                  var10++;
               } else {
                  var10--;
                  var9++;
                  var11 = false;
               }

               var12 = class_3665.field_17829;
               break;
            case field_17836:
               if (var4) {
                  var10++;
                  var9++;
                  var11 = false;
               } else {
                  var10--;
               }

               var12 = class_3665.field_17829;
         }

         return this.method_5887(var1, new BlockPos(var8, var9, var10), var4, var5, var12)
            ? true
            : var11 && this.method_5887(var1, new BlockPos(var8, var9 - 1, var10), var4, var5, var12);
      }
   }

   public boolean method_5887(World var1, BlockPos var2, boolean var3, int var4, class_3665 var5) {
      class_2522 var8 = var1.method_28262(var2);
      if (!var8.method_8350(this)) {
         return false;
      } else {
         class_3665 var9 = var8.<class_3665>method_10313(field_7159);
         if (var5 != class_3665.field_17831 || var9 != class_3665.field_17829 && var9 != class_3665.field_17833 && var9 != class_3665.field_17836) {
            if (var5 != class_3665.field_17829 || var9 != class_3665.field_17831 && var9 != class_3665.field_17835 && var9 != class_3665.field_17826) {
               if (!var8.<Boolean>method_10313(field_7158)) {
                  return false;
               } else {
                  return !var1.method_29576(var2) ? this.method_5888(var1, var2, var8, var3, var4 + 1) : true;
               }
            } else {
               return false;
            }
         } else {
            return false;
         }
      }
   }

   @Override
   public void method_31118(class_2522 var1, World var2, BlockPos var3, class_6414 var4) {
      boolean var7 = var1.<Boolean>method_10313(field_7158);
      boolean var8 = var2.method_29576(var3) || this.method_5888(var2, var3, var1, true, 0) || this.method_5888(var2, var3, var1, false, 0);
      if (var8 != var7) {
         var2.method_7513(var3, var1.method_10308(field_7158, Boolean.valueOf(var8)), 3);
         var2.method_29563(var3.method_6100(), this);
         if (var1.<class_3665>method_10313(field_7159).method_17011()) {
            var2.method_29563(var3.method_6081(), this);
         }
      }
   }

   @Override
   public class_5019<class_3665> method_31121() {
      return field_7159;
   }

   @Override
   public class_2522 method_10785(class_2522 var1, class_6631 var2) {
      switch (var2) {
         case field_34338:
            switch ((class_3665)var1.method_10313(field_7159)) {
               case field_17835:
                  return var1.method_10308(field_7159, class_3665.field_17826);
               case field_17826:
                  return var1.method_10308(field_7159, class_3665.field_17835);
               case field_17833:
                  return var1.method_10308(field_7159, class_3665.field_17836);
               case field_17836:
                  return var1.method_10308(field_7159, class_3665.field_17833);
               case field_17830:
                  return var1.method_10308(field_7159, class_3665.field_17837);
               case field_17825:
                  return var1.method_10308(field_7159, class_3665.field_17832);
               case field_17837:
                  return var1.method_10308(field_7159, class_3665.field_17830);
               case field_17832:
                  return var1.method_10308(field_7159, class_3665.field_17825);
            }
         case field_34335:
            switch ((class_3665)var1.method_10313(field_7159)) {
               case field_17829:
                  return var1.method_10308(field_7159, class_3665.field_17831);
               case field_17831:
                  return var1.method_10308(field_7159, class_3665.field_17829);
               case field_17835:
                  return var1.method_10308(field_7159, class_3665.field_17833);
               case field_17826:
                  return var1.method_10308(field_7159, class_3665.field_17836);
               case field_17833:
                  return var1.method_10308(field_7159, class_3665.field_17826);
               case field_17836:
                  return var1.method_10308(field_7159, class_3665.field_17835);
               case field_17830:
                  return var1.method_10308(field_7159, class_3665.field_17832);
               case field_17825:
                  return var1.method_10308(field_7159, class_3665.field_17830);
               case field_17837:
                  return var1.method_10308(field_7159, class_3665.field_17825);
               case field_17832:
                  return var1.method_10308(field_7159, class_3665.field_17837);
            }
         case field_34334:
            switch ((class_3665)var1.method_10313(field_7159)) {
               case field_17829:
                  return var1.method_10308(field_7159, class_3665.field_17831);
               case field_17831:
                  return var1.method_10308(field_7159, class_3665.field_17829);
               case field_17835:
                  return var1.method_10308(field_7159, class_3665.field_17836);
               case field_17826:
                  return var1.method_10308(field_7159, class_3665.field_17833);
               case field_17833:
                  return var1.method_10308(field_7159, class_3665.field_17835);
               case field_17836:
                  return var1.method_10308(field_7159, class_3665.field_17826);
               case field_17830:
                  return var1.method_10308(field_7159, class_3665.field_17825);
               case field_17825:
                  return var1.method_10308(field_7159, class_3665.field_17837);
               case field_17837:
                  return var1.method_10308(field_7159, class_3665.field_17832);
               case field_17832:
                  return var1.method_10308(field_7159, class_3665.field_17830);
            }
         default:
            return var1;
      }
   }

   @Override
   public class_2522 method_10773(class_2522 var1, class_9022 var2) {
      class_3665 var5 = var1.<class_3665>method_10313(field_7159);
      switch (var2) {
         case field_46148:
            switch (var5) {
               case field_17833:
                  return var1.method_10308(field_7159, class_3665.field_17836);
               case field_17836:
                  return var1.method_10308(field_7159, class_3665.field_17833);
               case field_17830:
                  return var1.method_10308(field_7159, class_3665.field_17832);
               case field_17825:
                  return var1.method_10308(field_7159, class_3665.field_17837);
               case field_17837:
                  return var1.method_10308(field_7159, class_3665.field_17825);
               case field_17832:
                  return var1.method_10308(field_7159, class_3665.field_17830);
               default:
                  return super.method_10773(var1, var2);
            }
         case field_46144:
            switch (var5) {
               case field_17835:
                  return var1.method_10308(field_7159, class_3665.field_17826);
               case field_17826:
                  return var1.method_10308(field_7159, class_3665.field_17835);
               case field_17833:
               case field_17836:
               default:
                  break;
               case field_17830:
                  return var1.method_10308(field_7159, class_3665.field_17825);
               case field_17825:
                  return var1.method_10308(field_7159, class_3665.field_17830);
               case field_17837:
                  return var1.method_10308(field_7159, class_3665.field_17832);
               case field_17832:
                  return var1.method_10308(field_7159, class_3665.field_17837);
            }
         default:
            return super.method_10773(var1, var2);
      }
   }

   @Override
   public void method_29282(class_2203<class_6414, class_2522> var1) {
      var1.method_10162(field_7159, field_7158);
   }
}
