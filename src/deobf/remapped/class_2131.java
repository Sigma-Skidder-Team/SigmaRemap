package remapped;

import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Set;
import java.util.function.Predicate;

public class class_2131 {
   private static String[] field_10670;
   private static final Predicate<class_2522> field_10669 = var0 -> !var0.method_8345();
   private static final Predicate<class_2522> field_10668 = var0 -> var0.method_8362().method_24502();
   private final class_2721 field_10667 = new class_2721(9, 256);
   private final Predicate<class_2522> field_10672;
   private final class_5990 field_10671;

   public class_2131(class_5990 var1, class_3801 var2) {
      this.field_10672 = var2.method_17675();
      this.field_10671 = var1;
   }

   public static void method_9953(class_5990 var0, Set<class_3801> var1) {
      int var4 = var1.size();
      ObjectArrayList var5 = new ObjectArrayList(var4);
      ObjectListIterator var6 = var5.iterator();
      int var7 = var0.method_27350() + 16;
      class_2921 var8 = new class_2921();

      for (int var9 = 0; var9 < 16; var9++) {
         for (int var10 = 0; var10 < 16; var10++) {
            for (class_3801 var12 : var1) {
               var5.add(var0.method_27353(var12));
            }

            for (int var14 = var7 - 1; var14 >= 0; var14--) {
               var8.method_13362(var9, var14, var10);
               class_2522 var15 = var0.method_28262(var8);
               if (!var15.method_8350(class_4783.field_23184)) {
                  while (var6.hasNext()) {
                     class_2131 var13 = (class_2131)var6.next();
                     if (var13.field_10672.test(var15)) {
                        var13.method_9951(var9, var10, var14 + 1);
                        var6.remove();
                     }
                  }

                  if (var5.isEmpty()) {
                     break;
                  }

                  var6.back(var4);
               }
            }
         }
      }
   }

   public boolean method_9958(int var1, int var2, int var3, class_2522 var4) {
      int var7 = this.method_9957(var1, var3);
      if (var2 <= var7 - 2) {
         return false;
      } else {
         if (!this.field_10672.test(var4)) {
            if (var7 - 1 == var2) {
               class_2921 var8 = new class_2921();

               for (int var9 = var2 - 1; var9 >= 0; var9--) {
                  var8.method_13362(var1, var9, var3);
                  if (this.field_10672.test(this.field_10671.method_28262(var8))) {
                     this.method_9951(var1, var3, var9 + 1);
                     return true;
                  }
               }

               this.method_9951(var1, var3, 0);
               return true;
            }
         } else if (var2 >= var7) {
            this.method_9951(var1, var3, var2 + 1);
            return true;
         }

         return false;
      }
   }

   public int method_9957(int var1, int var2) {
      return this.method_9956(method_9948(var1, var2));
   }

   private int method_9956(int var1) {
      return this.field_10667.method_12247(var1);
   }

   private void method_9951(int var1, int var2, int var3) {
      this.field_10667.method_12248(method_9948(var1, var2), var3);
   }

   public void method_9955(long[] var1) {
      System.arraycopy(var1, 0, this.field_10667.method_12246(), 0, var1.length);
   }

   public long[] method_9954() {
      return this.field_10667.method_12246();
   }

   private static int method_9948(int var0, int var1) {
      return var0 + var1 * 16;
   }
}
