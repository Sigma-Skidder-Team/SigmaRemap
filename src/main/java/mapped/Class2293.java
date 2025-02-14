package mapped;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public enum Class2293 {
   field15234(0, "normal", false),
   field15235(1, "lazy", false),
   field15236(2, "worried", false),
   field15237(3, "playful", false),
   field15238(4, "brown", true),
   field15239(5, "weak", true),
   field15240(6, "aggressive", false);

   private static final Class2293[] field15241 = Arrays.<Class2293>stream(values())
      .sorted(Comparator.comparingInt(Class2293::method9042))
      .<Class2293>toArray(Class2293[]::new);
   private final int field15242;
   private final String field15243;
   private final boolean field15244;
   private static final Class2293[] field15245 = new Class2293[]{field15234, field15235, field15236, field15237, field15238, field15239, field15240};

   private Class2293(int var3, String var4, boolean var5) {
      this.field15242 = var3;
      this.field15243 = var4;
      this.field15244 = var5;
   }

   public int method9042() {
      return this.field15242;
   }

   public String method9043() {
      return this.field15243;
   }

   public boolean method9044() {
      return this.field15244;
   }

   private static Class2293 method9045(Class2293 var0, Class2293 var1) {
      if (!var0.method9044()) {
         return var0;
      } else {
         return var0 != var1 ? field15234 : var0;
      }
   }

   public static Class2293 method9046(int var0) {
      if (var0 < 0 || var0 >= field15241.length) {
         var0 = 0;
      }

      return field15241[var0];
   }

   public static Class2293 method9047(String var0) {
      for (Class2293 var6 : values()) {
         if (var6.field15243.equals(var0)) {
            return var6;
         }
      }

      return field15234;
   }

   public static Class2293 method9048(Random var0) {
      int var3 = var0.nextInt(16);
      if (var3 != 0) {
         if (var3 != 1) {
            if (var3 != 2) {
               if (var3 != 4) {
                  if (var3 >= 9) {
                     return var3 >= 11 ? field15234 : field15238;
                  } else {
                     return field15239;
                  }
               } else {
                  return field15240;
               }
            } else {
               return field15237;
            }
         } else {
            return field15236;
         }
      } else {
         return field15235;
      }
   }

   // $VF: synthetic method
   public static Class2293 method9050(Class2293 var0, Class2293 var1) {
      return method9045(var0, var1);
   }
}
