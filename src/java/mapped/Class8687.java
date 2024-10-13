package mapped;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Class8687 {
   public final long field39215;
   public final Class8223 field39216;
   public final Class1797 field39217;
   private Date field39218;
   private String field39219;
   private Date field39220;
   private String field39221;
   private Date field39222;
   private long field39223;
   private long field39224;
   private String field39225;
   private int field39226 = -1;

   public Class8687(long var1, Class8223 var3, Class1797 var4) {
      this.field39215 = var1;
      this.field39216 = var3;
      this.field39217 = var4;
      if (var4 != null) {
         this.field39223 = var4.method7863();
         this.field39224 = var4.method7864();
         Class9371 var7 = var4.method7853();
         int var8 = 0;

         for (int var9 = var7.method35546(); var8 < var9; var8++) {
            String var10 = var7.method35547(var8);
            String var11 = var7.method35548(var8);
            if (!"Date".equalsIgnoreCase(var10)) {
               if (!"Expires".equalsIgnoreCase(var10)) {
                  if (!"Last-Modified".equalsIgnoreCase(var10)) {
                     if (!"ETag".equalsIgnoreCase(var10)) {
                        if ("Age".equalsIgnoreCase(var10)) {
                           this.field39226 = Class8394.method29456(var11, -1);
                        }
                     } else {
                        this.field39225 = var11;
                     }
                  } else {
                     this.field39220 = Class9240.method34752(var11);
                     this.field39221 = var11;
                  }
               } else {
                  this.field39222 = Class9240.method34752(var11);
               }
            } else {
               this.field39218 = Class9240.method34752(var11);
               this.field39219 = var11;
            }
         }
      }
   }

   public Class9660 method31302() {
      Class9660 var3 = this.method31303();
      return var3.field45146 != null && this.field39216.method28620().method23203() ? new Class9660(null, null) : var3;
   }

   private Class9660 method31303() {
      if (this.field39217 != null) {
         if (this.field39216.method28621()) {
            return new Class9660(this.field39216, null);
         } else if (Class9660.method37711(this.field39217, this.field39216)) {
            Class7319 var3 = this.field39216.method28620();
            if (!var3.method23194() && !method31307(this.field39216)) {
               long var4 = this.method31305();
               long var6 = this.method31304();
               if (var3.method23196() != -1) {
                  var6 = Math.min(var6, TimeUnit.SECONDS.toMillis((long)var3.method23196()));
               }

               long var8 = 0L;
               if (var3.method23202() != -1) {
                  var8 = TimeUnit.SECONDS.toMillis((long)var3.method23202());
               }

               long var10 = 0L;
               Class7319 var12 = this.field39217.method7862();
               if (!var12.method23200() && var3.method23201() != -1) {
                  var10 = TimeUnit.SECONDS.toMillis((long)var3.method23201());
               }

               if (!var12.method23194() && var4 + var8 < var6 + var10) {
                  Class9279 var19 = this.field39217.method7856();
                  if (var4 + var8 >= var6) {
                     var19.method34983("Warning", "110 HttpURLConnection \"Response is stale\"");
                  }

                  long var14 = 86400000L;
                  if (var4 > var14 && this.method31306()) {
                     var19.method34983("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                  }

                  return new Class9660(null, var19.method34994());
               } else {
                  String var13;
                  String var16;
                  if (this.field39225 == null) {
                     if (this.field39220 == null) {
                        if (this.field39218 == null) {
                           return new Class9660(this.field39216, null);
                        }

                        var13 = "If-Modified-Since";
                        var16 = this.field39219;
                     } else {
                        var13 = "If-Modified-Since";
                        var16 = this.field39221;
                     }
                  } else {
                     var13 = "If-None-Match";
                     var16 = this.field39225;
                  }

                  Class9192 var17 = this.field39216.method28614().method35550();
                  Class6605.field29047.method20015(var17, var13, var16);
                  Class8223 var18 = this.field39216.method28619().method25241(var17.method34442()).method25252();
                  return new Class9660(var18, this.field39217);
               }
            } else {
               return new Class9660(this.field39216, null);
            }
         } else {
            return new Class9660(this.field39216, null);
         }
      } else {
         return new Class9660(this.field39216, null);
      }
   }

   private long method31304() {
      Class7319 var3 = this.field39217.method7862();
      if (var3.method23196() == -1) {
         if (this.field39222 == null) {
            if (this.field39220 != null && this.field39217.method7844().method28612().method22953() == null) {
               long var8 = this.field39218 == null ? this.field39223 : this.field39218.getTime();
               long var9 = var8 - this.field39220.getTime();
               return var9 <= 0L ? 0L : var9 / 10L;
            } else {
               return 0L;
            }
         } else {
            long var4 = this.field39218 == null ? this.field39224 : this.field39218.getTime();
            long var6 = this.field39222.getTime() - var4;
            return var6 <= 0L ? 0L : var6;
         }
      } else {
         return TimeUnit.SECONDS.toMillis((long)var3.method23196());
      }
   }

   private long method31305() {
      long var3 = this.field39218 == null ? 0L : Math.max(0L, this.field39224 - this.field39218.getTime());
      long var5 = this.field39226 == -1 ? var3 : Math.max(var3, TimeUnit.SECONDS.toMillis((long)this.field39226));
      long var7 = this.field39224 - this.field39223;
      long var9 = this.field39215 - this.field39224;
      return var5 + var7 + var9;
   }

   private boolean method31306() {
      return this.field39217.method7862().method23196() == -1 && this.field39222 == null;
   }

   private static boolean method31307(Class8223 var0) {
      return var0.method28615("If-Modified-Since") != null || var0.method28615("If-None-Match") != null;
   }
}
