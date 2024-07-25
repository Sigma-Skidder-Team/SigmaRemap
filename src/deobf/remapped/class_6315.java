package remapped;

import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;

public abstract class class_6315 extends class_7060 {
   public class_6315(class_2746 var1, int var2) {
      super(var1, var2);
   }

   public class_6315(class_2746 var1, CompoundNBT var2) {
      super(var1, var2);
   }

   @Override
   public void method_32517(CompoundNBT var1) {
   }

   private int method_28782(List<class_1608> var1) {
      boolean var4 = false;
      int var5 = 0;

      for (class_1608 var7 : var1) {
         if (var7.field_8342 > 0 && var7.field_8343 < var7.field_8342) {
            var4 = true;
         }

         var5 += var7.field_8346;
      }

      return !var4 ? -1 : var5;
   }

   private class_6315 method_28787(
           class_1695 var1, List<class_1608> var2, List<class_7060> var3, Random var4, int var5, int var6, int var7, Direction var8, int var9
   ) {
      int var12 = this.method_28782(var2);
      boolean var13 = var12 > 0 && var9 <= 30;
      int var14 = 0;

      while (var14 < 5 && var13) {
         var14++;
         int var15 = var4.nextInt(var12);

         for (class_1608 var17 : var2) {
            var15 -= var17.field_8346;
            if (var15 < 0) {
               if (!var17.method_7184(var9) || var17 == var1.field_8766 && !var17.field_8345) {
                  break;
               }

               class_6315 var18 = class_1588.method_7136(var17, var3, var4, var5, var6, var7, var8, var9);
               if (var18 != null) {
                  var17.field_8343++;
                  var1.field_8766 = var17;
                  if (!var17.method_7185()) {
                     var2.remove(var17);
                  }

                  return var18;
               }
            }
         }
      }

      return class_9622.method_44418(var3, var4, var5, var6, var7, var8, var9);
   }

   private class_7060 method_28783(class_1695 var1, List<class_7060> var2, Random var3, int var4, int var5, int var6, Direction var7, int var8, boolean var9) {
      if (Math.abs(var4 - var1.method_32512().field_48996) <= 112 && Math.abs(var6 - var1.method_32512().field_48992) <= 112) {
         List var12 = var1.field_8769;
         if (var9) {
            var12 = var1.field_8765;
         }

         class_6315 var13 = this.method_28787(var1, var12, var2, var3, var4, var5, var6, var7, var8 + 1);
         if (var13 != null) {
            var2.add(var13);
            var1.field_8767.add(var13);
         }

         return var13;
      } else {
         return class_9622.method_44418(var2, var3, var4, var5, var6, var7, var8);
      }
   }

   @Nullable
   public class_7060 method_28784(class_1695 var1, List<class_7060> var2, Random var3, int var4, int var5, boolean var6) {
      Direction var9 = this.method_32518();
      if (var9 != null) {
         switch (var9) {
            case field_818:
               return this.method_28783(
                  var1,
                  var2,
                  var3,
                  this.field_36435.field_48996 + var4,
                  this.field_36435.field_48995 + var5,
                  this.field_36435.field_48992 - 1,
                  var9,
                  this.method_32515(),
                  var6
               );
            case field_800:
               return this.method_28783(
                  var1,
                  var2,
                  var3,
                  this.field_36435.field_48996 + var4,
                  this.field_36435.field_48995 + var5,
                  this.field_36435.field_48994 + 1,
                  var9,
                  this.method_32515(),
                  var6
               );
            case field_809:
               return this.method_28783(
                  var1,
                  var2,
                  var3,
                  this.field_36435.field_48996 - 1,
                  this.field_36435.field_48995 + var5,
                  this.field_36435.field_48992 + var4,
                  var9,
                  this.method_32515(),
                  var6
               );
            case field_804:
               return this.method_28783(
                  var1,
                  var2,
                  var3,
                  this.field_36435.field_48991 + 1,
                  this.field_36435.field_48995 + var5,
                  this.field_36435.field_48992 + var4,
                  var9,
                  this.method_32515(),
                  var6
               );
         }
      }

      return null;
   }

   @Nullable
   public class_7060 method_28785(class_1695 var1, List<class_7060> var2, Random var3, int var4, int var5, boolean var6) {
      Direction var9 = this.method_32518();
      if (var9 != null) {
         switch (var9) {
            case field_818:
               return this.method_28783(
                  var1,
                  var2,
                  var3,
                  this.field_36435.field_48996 - 1,
                  this.field_36435.field_48995 + var4,
                  this.field_36435.field_48992 + var5,
                  Direction.field_809,
                  this.method_32515(),
                  var6
               );
            case field_800:
               return this.method_28783(
                  var1,
                  var2,
                  var3,
                  this.field_36435.field_48996 - 1,
                  this.field_36435.field_48995 + var4,
                  this.field_36435.field_48992 + var5,
                  Direction.field_809,
                  this.method_32515(),
                  var6
               );
            case field_809:
               return this.method_28783(
                  var1,
                  var2,
                  var3,
                  this.field_36435.field_48996 + var5,
                  this.field_36435.field_48995 + var4,
                  this.field_36435.field_48992 - 1,
                  Direction.field_818,
                  this.method_32515(),
                  var6
               );
            case field_804:
               return this.method_28783(
                  var1,
                  var2,
                  var3,
                  this.field_36435.field_48996 + var5,
                  this.field_36435.field_48995 + var4,
                  this.field_36435.field_48992 - 1,
                  Direction.field_818,
                  this.method_32515(),
                  var6
               );
         }
      }

      return null;
   }

   @Nullable
   public class_7060 method_28786(class_1695 var1, List<class_7060> var2, Random var3, int var4, int var5, boolean var6) {
      Direction var9 = this.method_32518();
      if (var9 != null) {
         switch (var9) {
            case field_818:
               return this.method_28783(
                  var1,
                  var2,
                  var3,
                  this.field_36435.field_48991 + 1,
                  this.field_36435.field_48995 + var4,
                  this.field_36435.field_48992 + var5,
                  Direction.field_804,
                  this.method_32515(),
                  var6
               );
            case field_800:
               return this.method_28783(
                  var1,
                  var2,
                  var3,
                  this.field_36435.field_48991 + 1,
                  this.field_36435.field_48995 + var4,
                  this.field_36435.field_48992 + var5,
                  Direction.field_804,
                  this.method_32515(),
                  var6
               );
            case field_809:
               return this.method_28783(
                  var1,
                  var2,
                  var3,
                  this.field_36435.field_48996 + var5,
                  this.field_36435.field_48995 + var4,
                  this.field_36435.field_48994 + 1,
                  Direction.field_800,
                  this.method_32515(),
                  var6
               );
            case field_804:
               return this.method_28783(
                  var1,
                  var2,
                  var3,
                  this.field_36435.field_48996 + var5,
                  this.field_36435.field_48995 + var4,
                  this.field_36435.field_48994 + 1,
                  Direction.field_800,
                  this.method_32515(),
                  var6
               );
         }
      }

      return null;
   }

   public static boolean method_28781(class_9616 var0) {
      return var0 != null && var0.field_48995 > 10;
   }
}
