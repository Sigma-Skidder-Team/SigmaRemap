package remapped;

import java.io.IOException;

public final class class_740 implements class_9833 {
   public final class_4957 field_4039;

   public class_740(class_4957 var1) {
      this.field_4039 = var1;
   }

   @Override
   public class_7839 method_45321(class_8047 var1) throws IOException {
      class_7839 var4 = this.field_4039 != null ? this.field_4039.method_22703(var1.method_36516()) : null;
      long var5 = System.currentTimeMillis();
      class_9227 var7 = new class_5537(var5, var1.method_36516(), var4).method_25143();
      class_3918 var8 = var7.field_47173;
      class_7839 var9 = var7.field_47172;
      if (this.field_4039 != null) {
         this.field_4039.method_22704(var7);
      }

      if (var4 != null && var9 == null) {
         class_8515.method_39200(var4.method_35481());
      }

      if (var8 == null && var9 == null) {
         return new class_7775()
            .method_35283(var1.method_36516())
            .method_35269(class_7976.field_40847)
            .method_35267(504)
            .method_35281("Unsatisfiable Request (only-if-cached)")
            .method_35282(class_8515.field_43594)
            .method_35276(-1L)
            .method_35278(System.currentTimeMillis())
            .method_35268();
      } else if (var8 == null) {
         return var9.method_35485().method_35275(method_3369(var9)).method_35268();
      } else {
         class_7839 var10 = null;

         try {
            var10 = var1.method_36514(var8);
         } finally {
            if (var10 == null && var4 != null) {
               class_8515.method_39200(var4.method_35481());
            }
         }

         if (var9 != null) {
            if (var10.method_35490() == 304) {
               class_7839 var17 = var9.method_35485()
                  .method_35271(method_3368(var9.method_35479(), var10.method_35479()))
                  .method_35276(var10.method_35478())
                  .method_35278(var10.method_35471())
                  .method_35275(method_3369(var9))
                  .method_35280(method_3369(var10))
                  .method_35268();
               var10.method_35481().close();
               this.field_4039.method_22702();
               this.field_4039.method_22707(var9, var17);
               return var17;
            }

            class_8515.method_39200(var9.method_35481());
         }

         class_7839 var11 = var10.method_35485().method_35275(method_3369(var9)).method_35280(method_3369(var10)).method_35268();
         if (this.field_4039 != null) {
            if (class_4464.method_20709(var11) && class_9227.method_42581(var11, var8)) {
               class_9474 var12 = this.field_4039.method_22706(var11);
               return this.method_3370(var12, var11);
            }

            if (class_3493.method_16061(var8.method_18137())) {
               try {
                  this.field_4039.method_22705(var8);
               } catch (IOException var15) {
               }
            }
         }

         return var11;
      }
   }

   private static class_7839 method_3369(class_7839 var0) {
      return var0 != null && var0.method_35481() != null ? var0.method_35485().method_35282(null).method_35268() : var0;
   }

   private class_7839 method_3370(class_9474 var1, class_7839 var2) throws IOException {
      if (var1 != null) {
         class_4131 var5 = var1.method_43761();
         if (var5 != null) {
            class_8067 var6 = var2.method_35481().method_40735();
            class_3947 var7 = class_1259.method_5670(var5);
            class_2314 var8 = new class_2314(this, var6, var1, var7);
            return var2.method_35485().method_35282(new class_2536(var2.method_35479(), class_1259.method_5671(var8))).method_35268();
         } else {
            return var2;
         }
      } else {
         return var2;
      }
   }

   private static class_8121 method_3368(class_8121 var0, class_8121 var1) {
      class_7414 var4 = new class_7414();
      int var5 = 0;

      for (int var6 = var0.method_36948(); var5 < var6; var5++) {
         String var7 = var0.method_36954(var5);
         String var8 = var0.method_36953(var5);
         if ((!"Warning".equalsIgnoreCase(var7) || !var8.startsWith("1")) && (!method_3366(var7) || var1.method_36955(var7) == null)) {
            class_1850.field_9389.method_8187(var4, var7, var8);
         }
      }

      var5 = 0;

      for (int var10 = var1.method_36948(); var5 < var10; var5++) {
         String var11 = var1.method_36954(var5);
         if (!"Content-Length".equalsIgnoreCase(var11) && method_3366(var11)) {
            class_1850.field_9389.method_8187(var4, var11, var1.method_36953(var5));
         }
      }

      return var4.method_33781();
   }

   public static boolean method_3366(String var0) {
      return !"Connection".equalsIgnoreCase(var0)
         && !"Keep-Alive".equalsIgnoreCase(var0)
         && !"Proxy-Authenticate".equalsIgnoreCase(var0)
         && !"Proxy-Authorization".equalsIgnoreCase(var0)
         && !"TE".equalsIgnoreCase(var0)
         && !"Trailers".equalsIgnoreCase(var0)
         && !"Transfer-Encoding".equalsIgnoreCase(var0)
         && !"Upgrade".equalsIgnoreCase(var0);
   }
}
