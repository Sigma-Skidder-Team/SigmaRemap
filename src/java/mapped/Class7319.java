package mapped;

import java.util.concurrent.TimeUnit;

public final class Class7319 {
   public static final Class7319 field31386 = new Class8729().method31499().method31507();
   public static final Class7319 field31387 = new Class8729().method31504().method31502(Integer.MAX_VALUE, TimeUnit.SECONDS).method31507();
   private final boolean field31388;
   private final boolean field31389;
   private final int field31390;
   private final int field31391;
   private final boolean field31392;
   private final boolean field31393;
   private final boolean field31394;
   private final int field31395;
   private final int field31396;
   private final boolean field31397;
   private final boolean field31398;
   private final boolean field31399;
   public String field31400;

   private Class7319(
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
      this.field31388 = var1;
      this.field31389 = var2;
      this.field31390 = var3;
      this.field31391 = var4;
      this.field31392 = var5;
      this.field31393 = var6;
      this.field31394 = var7;
      this.field31395 = var8;
      this.field31396 = var9;
      this.field31397 = var10;
      this.field31398 = var11;
      this.field31399 = var12;
      this.field31400 = var13;
   }

   public Class7319(Class8729 var1) {
      this.field31388 = var1.field39368;
      this.field31389 = var1.field39369;
      this.field31390 = var1.field39370;
      this.field31391 = -1;
      this.field31392 = false;
      this.field31393 = false;
      this.field31394 = false;
      this.field31395 = var1.field39371;
      this.field31396 = var1.field39372;
      this.field31397 = var1.field39373;
      this.field31398 = var1.field39374;
      this.field31399 = var1.field39375;
   }

   public boolean method23194() {
      return this.field31388;
   }

   public boolean method23195() {
      return this.field31389;
   }

   public int method23196() {
      return this.field31390;
   }

   public int method23197() {
      return this.field31391;
   }

   public boolean method23198() {
      return this.field31392;
   }

   public boolean method23199() {
      return this.field31393;
   }

   public boolean method23200() {
      return this.field31394;
   }

   public int method23201() {
      return this.field31395;
   }

   public int method23202() {
      return this.field31396;
   }

   public boolean method23203() {
      return this.field31397;
   }

   public boolean method23204() {
      return this.field31398;
   }

   public boolean method23205() {
      return this.field31399;
   }

   public static Class7319 method23206(Class9371 var0) {
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

      for (int var18 = var0.method35546(); var17 < var18; var17++) {
         String var19 = var0.method35547(var17);
         String var20 = var0.method35548(var17);
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
            var30 = Class8394.method29454(var20, var30, "=,;");
            String var23 = var20.substring(var22, var30).trim();
            String var24;
            if (var30 != var20.length() && var20.charAt(var30) != ',' && var20.charAt(var30) != ';') {
               var30 = Class8394.method29455(var20, ++var30);
               if (var30 < var20.length() && var20.charAt(var30) == '"') {
                  int var31 = ++var30;
                  var30 = Class8394.method29454(var20, var30, "\"");
                  var24 = var20.substring(var31, var30);
                  var30++;
               } else {
                  var30 = Class8394.method29454(var20, var30, ",;");
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
                                       var11 = Class8394.method29456(var24, -1);
                                    }
                                 } else {
                                    var10 = Class8394.method29456(var24, Integer.MAX_VALUE);
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
                        var6 = Class8394.method29456(var24, -1);
                     }
                  } else {
                     var5 = Class8394.method29456(var24, -1);
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

      return new Class7319(var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var16);
   }

   @Override
   public String toString() {
      String var3 = this.field31400;
      return var3 == null ? (this.field31400 = this.method23207()) : var3;
   }

   private String method23207() {
      StringBuilder var3 = new StringBuilder();
      if (this.field31388) {
         var3.append("no-cache, ");
      }

      if (this.field31389) {
         var3.append("no-store, ");
      }

      if (this.field31390 != -1) {
         var3.append("max-age=").append(this.field31390).append(", ");
      }

      if (this.field31391 != -1) {
         var3.append("s-maxage=").append(this.field31391).append(", ");
      }

      if (this.field31392) {
         var3.append("private, ");
      }

      if (this.field31393) {
         var3.append("public, ");
      }

      if (this.field31394) {
         var3.append("must-revalidate, ");
      }

      if (this.field31395 != -1) {
         var3.append("max-stale=").append(this.field31395).append(", ");
      }

      if (this.field31396 != -1) {
         var3.append("min-fresh=").append(this.field31396).append(", ");
      }

      if (this.field31397) {
         var3.append("only-if-cached, ");
      }

      if (this.field31398) {
         var3.append("no-transform, ");
      }

      if (this.field31399) {
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
