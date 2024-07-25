package remapped;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class class_2119 {
   public static void main(String[] var0) throws Exception {
      class_8161 var3 = new class_8161();
      ArrayList var4 = new ArrayList();
      ArrayList var5 = new ArrayList();
      Random var6 = new Random();
      byte var7 = 100;

      for (int var8 = 0; var8 < var7; var8++) {
         class_5584 var9 = new class_5584();
         var9.method_25373(var8);
         var4.add(var9);
      }

      for (int var13 = 0; var13 < 100000; var13++) {
         method_9917(var4, var5, var7);
         method_9916(var3, var5.size());
         if (var13 % 5 == 0) {
            method_9915(var3);
         }

         if (!var6.nextBoolean()) {
            if (!var5.isEmpty()) {
               class_5584 var14 = (class_5584)var5.get(var6.nextInt(var5.size()));
               class_2418 var10 = var14.method_25370();
               var3.method_37437(var10);
               method_9914("Remove: " + var14.method_25378());
               var5.remove(var14);
               var4.add(var14);
            }
         } else if (!var4.isEmpty()) {
            class_5584 var15 = (class_5584)var4.get(var6.nextInt(var4.size()));
            class_2418 var16 = var15.method_25370();
            if (!var6.nextBoolean()) {
               if (!var6.nextBoolean()) {
                  if (var5.isEmpty()) {
                     continue;
                  }

                  class_5584 var11 = (class_5584)var5.get(var6.nextInt(var5.size()));
                  class_2418 var12 = var11.method_25370();
                  var3.method_37439(var12, var16);
                  method_9914("Add after: " + var11.method_25378() + ", " + var15.method_25378());
               } else {
                  var3.method_37446(var16);
                  method_9914("Add last: " + var15.method_25378());
               }
            } else {
               var3.method_37441(var16);
               method_9914("Add first: " + var15.method_25378());
            }

            var4.remove(var15);
            var5.add(var15);
         }
      }
   }

   private static void method_9915(class_8161<class_5584> var0) {
      StringBuffer var3 = new StringBuffer();
      Iterator var4 = var0.method_37438();

      while (var4.hasNext()) {
         class_2418 var5 = (class_2418)var4.next();
         class_5584 var6 = (class_5584)var5.method_11037();
         if (var3.length() > 0) {
            var3.append(", ");
         }

         var3.append(var6.method_25378());
      }

      method_9914("List: " + var3);
   }

   private static void method_9916(class_8161<class_5584> var0, int var1) {
      if (var0.method_37445() != var1) {
         throw new RuntimeException("Wrong size, linked: " + var0.method_37445() + ", used: " + var1);
      } else {
         int var4 = 0;

         for (class_2418 var5 = var0.method_37448(); var5 != null; var5 = var5.method_11027()) {
            var4++;
         }

         if (var0.method_37445() != var4) {
            throw new RuntimeException("Wrong count, linked: " + var0.method_37445() + ", count: " + var4);
         } else {
            int var7 = 0;

            for (class_2418 var6 = var0.method_37440(); var6 != null; var6 = var6.method_11034()) {
               var7++;
            }

            if (var0.method_37445() != var7) {
               throw new RuntimeException("Wrong count back, linked: " + var0.method_37445() + ", count: " + var7);
            }
         }
      }
   }

   private static void method_9917(List<class_5584> var0, List<class_5584> var1, int var2) {
      int var5 = var0.size() + var1.size();
      if (var5 != var2) {
         throw new RuntimeException("Total size: " + var5);
      }
   }

   private static void method_9914(String var0) {
      System.out.println(var0);
   }
}
