package remapped;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class class_5537 {
   public final long field_28222;
   public final class_3918 field_28230;
   public final class_7839 field_28224;
   private Date field_28218;
   private String field_28227;
   private Date field_28226;
   private String field_28220;
   private Date field_28229;
   private long field_28219;
   private long field_28221;
   private String field_28228;
   private int field_28225 = -1;

   public class_5537(long var1, class_3918 var3, class_7839 var4) {
      this.field_28222 = var1;
      this.field_28230 = var3;
      this.field_28224 = var4;
      if (var4 != null) {
         this.field_28219 = var4.method_35478();
         this.field_28221 = var4.method_35471();
         class_8121 var7 = var4.method_35479();
         int var8 = 0;

         for (int var9 = var7.method_36948(); var8 < var9; var8++) {
            String var10 = var7.method_36954(var8);
            String var11 = var7.method_36953(var8);
            if (!"Date".equalsIgnoreCase(var10)) {
               if (!"Expires".equalsIgnoreCase(var10)) {
                  if (!"Last-Modified".equalsIgnoreCase(var10)) {
                     if (!"ETag".equalsIgnoreCase(var10)) {
                        if ("Age".equalsIgnoreCase(var10)) {
                           this.field_28225 = class_4464.method_20710(var11, -1);
                        }
                     } else {
                        this.field_28228 = var11;
                     }
                  } else {
                     this.field_28226 = class_7611.method_34525(var11);
                     this.field_28220 = var11;
                  }
               } else {
                  this.field_28229 = class_7611.method_34525(var11);
               }
            } else {
               this.field_28218 = class_7611.method_34525(var11);
               this.field_28227 = var11;
            }
         }
      }
   }

   public class_9227 method_25143() {
      class_9227 var3 = this.method_25147();
      return var3.field_47173 != null && this.field_28230.method_18143().method_7893() ? new class_9227(null, null) : var3;
   }

   private class_9227 method_25147() {
      if (this.field_28224 != null) {
         if (this.field_28230.method_18142() && this.field_28224.method_35489() == null) {
            return new class_9227(this.field_28230, null);
         } else if (class_9227.method_42581(this.field_28224, this.field_28230)) {
            class_1766 var3 = this.field_28230.method_18143();
            if (!var3.method_7889() && !method_25149(this.field_28230)) {
               long var4 = this.method_25146();
               long var6 = this.method_25145();
               if (var3.method_7896() != -1) {
                  var6 = Math.min(var6, TimeUnit.SECONDS.toMillis((long)var3.method_7896()));
               }

               long var8 = 0L;
               if (var3.method_7890() != -1) {
                  var8 = TimeUnit.SECONDS.toMillis((long)var3.method_7890());
               }

               long var10 = 0L;
               class_1766 var12 = this.field_28224.method_35470();
               if (!var12.method_7895() && var3.method_7884() != -1) {
                  var10 = TimeUnit.SECONDS.toMillis((long)var3.method_7884());
               }

               if (!var12.method_7889() && var4 + var8 < var6 + var10) {
                  class_7775 var19 = this.field_28224.method_35485();
                  if (var4 + var8 >= var6) {
                     var19.method_35273("Warning", "110 HttpURLConnection \"Response is stale\"");
                  }

                  long var14 = 86400000L;
                  if (var4 > var14 && this.method_25148()) {
                     var19.method_35273("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                  }

                  return new class_9227(null, var19.method_35268());
               } else {
                  String var13;
                  String var16;
                  if (this.field_28228 == null) {
                     if (this.field_28226 == null) {
                        if (this.field_28218 == null) {
                           return new class_9227(this.field_28230, null);
                        }

                        var13 = "If-Modified-Since";
                        var16 = this.field_28227;
                     } else {
                        var13 = "If-Modified-Since";
                        var16 = this.field_28220;
                     }
                  } else {
                     var13 = "If-None-Match";
                     var16 = this.field_28228;
                  }

                  class_7414 var17 = this.field_28230.method_18138().method_36952();
                  class_1850.field_9389.method_8187(var17, var13, var16);
                  class_3918 var18 = this.field_28230.method_18140().method_11012(var17.method_33781()).method_11013();
                  return new class_9227(var18, this.field_28224);
               }
            } else {
               return new class_9227(this.field_28230, null);
            }
         } else {
            return new class_9227(this.field_28230, null);
         }
      } else {
         return new class_9227(this.field_28230, null);
      }
   }

   private long method_25145() {
      class_1766 var3 = this.field_28224.method_35470();
      if (var3.method_7896() == -1) {
         if (this.field_28229 == null) {
            if (this.field_28226 != null && this.field_28224.method_35474().method_18136().method_7451() == null) {
               long var8 = this.field_28218 == null ? this.field_28219 : this.field_28218.getTime();
               long var9 = var8 - this.field_28226.getTime();
               return var9 <= 0L ? 0L : var9 / 10L;
            } else {
               return 0L;
            }
         } else {
            long var4 = this.field_28218 == null ? this.field_28221 : this.field_28218.getTime();
            long var6 = this.field_28229.getTime() - var4;
            return var6 <= 0L ? 0L : var6;
         }
      } else {
         return TimeUnit.SECONDS.toMillis((long)var3.method_7896());
      }
   }

   private long method_25146() {
      long var3 = this.field_28218 == null ? 0L : Math.max(0L, this.field_28221 - this.field_28218.getTime());
      long var5 = this.field_28225 == -1 ? var3 : Math.max(var3, TimeUnit.SECONDS.toMillis((long)this.field_28225));
      long var7 = this.field_28221 - this.field_28219;
      long var9 = this.field_28222 - this.field_28221;
      return var5 + var7 + var9;
   }

   private boolean method_25148() {
      return this.field_28224.method_35470().method_7896() == -1 && this.field_28229 == null;
   }

   private static boolean method_25149(class_3918 var0) {
      return var0.method_18135("If-Modified-Since") != null || var0.method_18135("If-None-Match") != null;
   }
}
