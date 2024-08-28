package mapped;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Class7526 {
   public static void main(String[] var0) throws Exception {
      Class9380 var3 = new Class9380();
      ArrayList var4 = new ArrayList();
      ArrayList var5 = new ArrayList();
      Random var6 = new Random();
      byte var7 = 100;

      for (int var8 = 0; var8 < var7; var8++) {
         Class8697 var9 = new Class8697();
         var9.method31338(var8);
         var4.add(var9);
      }

      for (int var13 = 0; var13 < 100000; var13++) {
         method24575(var4, var5, var7);
         method24574(var3, var5.size());
         if (var13 % 5 == 0) {
            method24573(var3);
         }

         if (!var6.nextBoolean()) {
            if (!var5.isEmpty()) {
               Class8697 var14 = (Class8697)var5.get(var6.nextInt(var5.size()));
               Class7678 var10 = var14.method31340();
               var3.method35596(var10);
               method24576("Remove: " + var14.method31335());
               var5.remove(var14);
               var4.add(var14);
            }
         } else if (!var4.isEmpty()) {
            Class8697 var15 = (Class8697)var4.get(var6.nextInt(var4.size()));
            Class7678 var16 = var15.method31340();
            if (!var6.nextBoolean()) {
               if (!var6.nextBoolean()) {
                  if (var5.isEmpty()) {
                     continue;
                  }

                  Class8697 var11 = (Class8697)var5.get(var6.nextInt(var5.size()));
                  Class7678 var12 = var11.method31340();
                  var3.method35595(var12, var16);
                  method24576("Add after: " + var11.method31335() + ", " + var15.method31335());
               } else {
                  var3.method35594(var16);
                  method24576("Add last: " + var15.method31335());
               }
            } else {
               var3.method35593(var16);
               method24576("Add first: " + var15.method31335());
            }

            var4.remove(var15);
            var5.add(var15);
         }
      }
   }

   private static void method24573(Class9380<Class8697> var0) {
      StringBuffer var3 = new StringBuffer();
      Iterator var4 = var0.method35602();

      while (var4.hasNext()) {
         Class7678 var5 = (Class7678)var4.next();
         Class8697 var6 = (Class8697)var5.method25253();
         if (var3.length() > 0) {
            var3.append(", ");
         }

         var3.append(var6.method31335());
      }

      method24576("List: " + var3);
   }

   private static void method24574(Class9380<Class8697> var0, int var1) {
      if (var0.method35605() != var1) {
         throw new RuntimeException("Wrong size, linked: " + var0.method35605() + ", used: " + var1);
      } else {
         int var4 = 0;

         for (Class7678 var5 = var0.method35603(); var5 != null; var5 = var5.method25255()) {
            var4++;
         }

         if (var0.method35605() != var4) {
            throw new RuntimeException("Wrong count, linked: " + var0.method35605() + ", count: " + var4);
         } else {
            int var7 = 0;

            for (Class7678 var6 = var0.method35604(); var6 != null; var6 = var6.method25254()) {
               var7++;
            }

            if (var0.method35605() != var7) {
               throw new RuntimeException("Wrong count back, linked: " + var0.method35605() + ", count: " + var7);
            }
         }
      }
   }

   private static void method24575(List<Class8697> var0, List<Class8697> var1, int var2) {
      int var5 = var0.size() + var1.size();
      if (var5 != var2) {
         throw new RuntimeException("Total size: " + var5);
      }
   }

   private static void method24576(String var0) {
      System.out.println(var0);
   }
}
