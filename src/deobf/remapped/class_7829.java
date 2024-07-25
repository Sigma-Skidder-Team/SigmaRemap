package remapped;

import java.util.ArrayList;
import java.util.List;

public class class_7829 {
   private static String[] field_39716;

   public static boolean method_35453(List<class_7606> var0) {
      if (var0.size() <= 0) {
         return false;
      } else {
         BlockPos var3 = ((class_7606)var0.get(0)).field_38725;
         class_7606[] var4 = new class_7606[]{
            new class_7606(var3.method_6094(), Direction.field_800),
            new class_7606(var3.method_6090(), Direction.field_809),
            new class_7606(var3.method_6073(), Direction.field_818),
            new class_7606(var3.method_6108(), Direction.field_804),
            new class_7606(var3.method_6100(), Direction.field_817),
            new class_7606(var3.method_6081(), Direction.field_802)
         };

         for (class_7606 var8 : var4) {
            if (class_7494.method_34120(var8.field_38725) != class_4783.field_23184) {
               return true;
            }
         }

         return false;
      }
   }

   public static List<class_7606> method_35450(List<class_7606> var0) {
      ArrayList var3 = new ArrayList();

      for (int var4 = var0.size() - 1; var4 >= 0; var4--) {
         var3.add(var0.get(var4));
      }

      return var3;
   }

   public static List<class_7606> method_35452(class_6414 var0, BlockPos var1, int var2) {
      ArrayList var5 = new ArrayList();
      if (var1 != null && var2 >= 0) {
         if (!class_7494.method_34117(var0, var1)) {
            return var5;
         } else {
            class_7606[] var6 = new class_7606[]{
               new class_7606(var1.method_6081(), Direction.field_802),
               new class_7606(var1.method_6094(), Direction.field_800),
               new class_7606(var1.method_6090(), Direction.field_809),
               new class_7606(var1.method_6073(), Direction.field_818),
               new class_7606(var1.method_6108(), Direction.field_804),
               new class_7606(var1.method_6100(), Direction.field_817)
            };

            for (class_7606 var10 : var6) {
               if (!class_7494.method_34117(var0, var10.field_38725)) {
                  var5.add(var10);
                  return var5;
               }
            }

            for (int var13 = 1; var13 < var2; var13++) {
               for (class_7606 var11 : var6) {
                  List var12 = method_35452(var0, var11.field_38725, var13);
                  if (method_35453(method_35450(var12))) {
                     var5.addAll(var12);
                     return (List<class_7606>)(var5.size() <= 1 ? var5 : method_35450(var5));
                  }
               }
            }

            return var5;
         }
      } else {
         return var5;
      }
   }
}
