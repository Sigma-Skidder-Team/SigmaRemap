package remapped;

import java.util.concurrent.TimeUnit;

public final class class_1766 {
   public static final class_1766 field_9065 = new class_5689().method_25732().method_25730();
   public static final class_1766 field_9061 = new class_5689().method_25739().method_25731(Integer.MAX_VALUE, TimeUnit.SECONDS).method_25730();
   private final boolean field_9057;
   private final boolean field_9056;
   private final int field_9060;
   private final int field_9069;
   private final boolean field_9058;
   private final boolean field_9059;
   private final boolean field_9068;
   private final int field_9066;
   private final int field_9067;
   private final boolean field_9064;
   private final boolean field_9055;
   private final boolean field_9062;
   public String field_9054;

   private class_1766(
      boolean var1,
      boolean var2,
      int var3,
      int var4,
      boolean var5,
      boolean var6,
      boolean var7,
      int var8,
      int var9,
      boolean var10,
      boolean var11,
      boolean var12,
      String var13
   ) {
      this.field_9057 = var1;
      this.field_9056 = var2;
      this.field_9060 = var3;
      this.field_9069 = var4;
      this.field_9058 = var5;
      this.field_9059 = var6;
      this.field_9068 = var7;
      this.field_9066 = var8;
      this.field_9067 = var9;
      this.field_9064 = var10;
      this.field_9055 = var11;
      this.field_9062 = var12;
      this.field_9054 = var13;
   }

   public class_1766(class_5689 var1) {
      this.field_9057 = var1.field_28811;
      this.field_9056 = var1.field_28815;
      this.field_9060 = var1.field_28807;
      this.field_9069 = -1;
      this.field_9058 = false;
      this.field_9059 = false;
      this.field_9068 = false;
      this.field_9066 = var1.field_28813;
      this.field_9067 = var1.field_28809;
      this.field_9064 = var1.field_28812;
      this.field_9055 = var1.field_28808;
      this.field_9062 = var1.field_28810;
   }

   public boolean method_7889() {
      return this.field_9057;
   }

   public boolean method_7894() {
      return this.field_9056;
   }

   public int method_7896() {
      return this.field_9060;
   }

   public int method_7885() {
      return this.field_9069;
   }

   public boolean method_7891() {
      return this.field_9058;
   }

   public boolean method_7898() {
      return this.field_9059;
   }

   public boolean method_7895() {
      return this.field_9068;
   }

   public int method_7884() {
      return this.field_9066;
   }

   public int method_7890() {
      return this.field_9067;
   }

   public boolean method_7893() {
      return this.field_9064;
   }

   public boolean method_7897() {
      return this.field_9055;
   }

   public boolean method_7886() {
      return this.field_9062;
   }

   public static class_1766 method_7888(class_8121 var0) {
      boolean var3 = false;
      boolean var4 = false;
      int var5 = -1;
      int var6 = -1;
      boolean var7 = false;
      boolean var8 = false;
      boolean var9 = false;
      int var10 = -1;
      int var11 = -1;
      boolean var12 = false;
      boolean var13 = false;
      boolean var14 = false;
      boolean var15 = true;
      String var16 = null;
      int var17 = 0;

      for (int var18 = var0.method_36948(); var17 < var18; var17++) {
         String var19 = var0.method_36954(var17);
         String var20 = var0.method_36953(var17);
         if (!var19.equalsIgnoreCase("Cache-Control")) {
            if (!var19.equalsIgnoreCase("Pragma")) {
               continue;
            }

            var15 = false;
         } else if (var16 == null) {
            var16 = var20;
         } else {
            var15 = false;
         }

         int var30 = 0;

         while (var30 < var20.length()) {
            int var22 = var30;
            var30 = class_4464.method_20712(var20, var30, "=,;");
            String var23 = var20.substring(var22, var30).trim();
            String var24;
            if (var30 != var20.length() && var20.charAt(var30) != ',' && var20.charAt(var30) != ';') {
               var30 = class_4464.method_20706(var20, ++var30);
               if (var30 < var20.length() && var20.charAt(var30) == '"') {
                  int var31 = ++var30;
                  var30 = class_4464.method_20712(var20, var30, "\"");
                  var24 = var20.substring(var31, var30);
                  var30++;
               } else {
                  var30 = class_4464.method_20712(var20, var30, ",;");
                  var24 = var20.substring(var30, var30).trim();
               }
            } else {
               var30++;
               var24 = null;
            }

            if (!"no-cache".equalsIgnoreCase(var23)) {
               if (!"no-store".equalsIgnoreCase(var23)) {
                  if (!"max-age".equalsIgnoreCase(var23)) {
                     if (!"s-maxage".equalsIgnoreCase(var23)) {
                        if (!"private".equalsIgnoreCase(var23)) {
                           if (!"public".equalsIgnoreCase(var23)) {
                              if (!"must-revalidate".equalsIgnoreCase(var23)) {
                                 if (!"max-stale".equalsIgnoreCase(var23)) {
                                    if (!"min-fresh".equalsIgnoreCase(var23)) {
                                       if (!"only-if-cached".equalsIgnoreCase(var23)) {
                                          if (!"no-transform".equalsIgnoreCase(var23)) {
                                             if ("immutable".equalsIgnoreCase(var23)) {
                                                var14 = true;
                                             }
                                          } else {
                                             var13 = true;
                                          }
                                       } else {
                                          var12 = true;
                                       }
                                    } else {
                                       var11 = class_4464.method_20710(var24, -1);
                                    }
                                 } else {
                                    var10 = class_4464.method_20710(var24, Integer.MAX_VALUE);
                                 }
                              } else {
                                 var9 = true;
                              }
                           } else {
                              var8 = true;
                           }
                        } else {
                           var7 = true;
                        }
                     } else {
                        var6 = class_4464.method_20710(var24, -1);
                     }
                  } else {
                     var5 = class_4464.method_20710(var24, -1);
                  }
               } else {
                  var4 = true;
               }
            } else {
               var3 = true;
            }
         }
      }

      if (!var15) {
         var16 = null;
      }

      return new class_1766(var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var16);
   }

   @Override
   public String toString() {
      String var3 = this.field_9054;
      return var3 == null ? (this.field_9054 = this.method_7887()) : var3;
   }

   private String method_7887() {
      StringBuilder var3 = new StringBuilder();
      if (this.field_9057) {
         var3.append("no-cache, ");
      }

      if (this.field_9056) {
         var3.append("no-store, ");
      }

      if (this.field_9060 != -1) {
         var3.append("max-age=").append(this.field_9060).append(", ");
      }

      if (this.field_9069 != -1) {
         var3.append("s-maxage=").append(this.field_9069).append(", ");
      }

      if (this.field_9058) {
         var3.append("private, ");
      }

      if (this.field_9059) {
         var3.append("public, ");
      }

      if (this.field_9068) {
         var3.append("must-revalidate, ");
      }

      if (this.field_9066 != -1) {
         var3.append("max-stale=").append(this.field_9066).append(", ");
      }

      if (this.field_9067 != -1) {
         var3.append("min-fresh=").append(this.field_9067).append(", ");
      }

      if (this.field_9064) {
         var3.append("only-if-cached, ");
      }

      if (this.field_9055) {
         var3.append("no-transform, ");
      }

      if (this.field_9062) {
         var3.append("immutable, ");
      }

      if (var3.length() != 0) {
         var3.delete(var3.length() - 2, var3.length());
         return var3.toString();
      } else {
         return "";
      }
   }
}
