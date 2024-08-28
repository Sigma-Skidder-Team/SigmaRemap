package mapped;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

public final class Class9454 {
   private static final Pattern field43922 = Pattern.compile("(\\d{2,4})[^\\d]*");
   private static final Pattern field43923 = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
   private static final Pattern field43924 = Pattern.compile("(\\d{1,2})[^\\d]*");
   private static final Pattern field43925 = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");
   private final String field43926;
   private final String field43927;
   private final long field43928;
   private final String field43929;
   private final String field43930;
   private final boolean field43931;
   private final boolean field43932;
   private final boolean field43933;
   private final boolean field43934;

   private Class9454(String var1, String var2, long var3, String var5, String var6, boolean var7, boolean var8, boolean var9, boolean var10) {
      this.field43926 = var1;
      this.field43927 = var2;
      this.field43928 = var3;
      this.field43929 = var5;
      this.field43930 = var6;
      this.field43931 = var7;
      this.field43932 = var8;
      this.field43934 = var9;
      this.field43933 = var10;
   }

   public Class9454(Class7348 var1) {
      if (var1.field31458 != null) {
         if (var1.field31459 != null) {
            if (var1.field31461 != null) {
               this.field43926 = var1.field31458;
               this.field43927 = var1.field31459;
               this.field43928 = var1.field31460;
               this.field43929 = var1.field31461;
               this.field43930 = var1.field31462;
               this.field43931 = var1.field31463;
               this.field43932 = var1.field31464;
               this.field43933 = var1.field31465;
               this.field43934 = var1.field31466;
            } else {
               throw new NullPointerException("builder.domain == null");
            }
         } else {
            throw new NullPointerException("builder.value == null");
         }
      } else {
         throw new NullPointerException("builder.name == null");
      }
   }

   public String method36364() {
      return this.field43926;
   }

   public String method36365() {
      return this.field43927;
   }

   public boolean method36366() {
      return this.field43933;
   }

   public long method36367() {
      return this.field43928;
   }

   public boolean method36368() {
      return this.field43934;
   }

   public String method36369() {
      return this.field43929;
   }

   public String method36370() {
      return this.field43930;
   }

   public boolean method36371() {
      return this.field43932;
   }

   public boolean method36372() {
      return this.field43931;
   }

   public boolean method36373(Class7284 var1) {
      boolean var4 = !this.field43934 ? method36374(var1.method22942(), this.field43929) : var1.method22942().equals(this.field43929);
      if (var4) {
         return method36375(var1, this.field43930) ? !this.field43931 || var1.method22937() : false;
      } else {
         return false;
      }
   }

   private static boolean method36374(String var0, String var1) {
      return !var0.equals(var1) ? var0.endsWith(var1) && var0.charAt(var0.length() - var1.length() - 1) == '.' && !Class9474.method36558(var0) : true;
   }

   private static boolean method36375(Class7284 var0, String var1) {
      String var4 = var0.method22946();
      if (!var4.equals(var1)) {
         if (var4.startsWith(var1)) {
            if (var1.endsWith("/")) {
               return true;
            }

            if (var4.charAt(var1.length()) == '/') {
               return true;
            }
         }

         return false;
      } else {
         return true;
      }
   }

   @Nullable
   public static Class9454 method36376(Class7284 var0, String var1) {
      return method36377(System.currentTimeMillis(), var0, var1);
   }

   @Nullable
   public static Class9454 method36377(long var0, Class7284 var2, String var3) {
      int var6 = 0;
      int var7 = var3.length();
      int var8 = Class9474.method36554(var3, var6, var7, ';');
      int var9 = Class9474.method36554(var3, var6, var8, '=');
      if (var9 == var8) {
         return null;
      } else {
         String var10 = Class9474.method36552(var3, var6, var9);
         if (!var10.isEmpty() && Class9474.method36557(var10) == -1) {
            String var11 = Class9474.method36552(var3, var9 + 1, var8);
            if (Class9474.method36557(var11) != -1) {
               return null;
            } else {
               long var12 = 253402300799999L;
               long var14 = -1L;
               String var16 = null;
               String var17 = null;
               boolean var18 = false;
               boolean var19 = false;
               boolean var20 = true;
               boolean var21 = false;
               var6 = var8 + 1;

               while (var6 < var7) {
                  int var22 = Class9474.method36554(var3, var6, var7, ';');
                  int var23 = Class9474.method36554(var3, var6, var22, '=');
                  String var24 = Class9474.method36552(var3, var6, var23);
                  String var25 = var23 < var22 ? Class9474.method36552(var3, var23 + 1, var22) : "";
                  if (var24.equalsIgnoreCase("expires")) {
                     try {
                        var12 = method36378(var25, 0, var25.length());
                        var21 = true;
                     } catch (IllegalArgumentException var31) {
                     }
                  } else if (var24.equalsIgnoreCase("max-age")) {
                     try {
                        var14 = method36380(var25);
                        var21 = true;
                     } catch (NumberFormatException var30) {
                     }
                  } else if (var24.equalsIgnoreCase("domain")) {
                     try {
                        var16 = method36381(var25);
                        var20 = false;
                     } catch (IllegalArgumentException var29) {
                     }
                  } else if (var24.equalsIgnoreCase("path")) {
                     var17 = var25;
                  } else if (var24.equalsIgnoreCase("secure")) {
                     var18 = true;
                  } else if (var24.equalsIgnoreCase("httponly")) {
                     var19 = true;
                  }

                  var6 = var22 + 1;
               }

               if (var14 == Long.MIN_VALUE) {
                  var12 = Long.MIN_VALUE;
               } else if (var14 != -1L) {
                  long var27 = var14 <= 9223372036854775L ? var14 * 1000L : Long.MAX_VALUE;
                  var12 = var0 + var27;
                  if (var12 < var0 || var12 > 253402300799999L) {
                     var12 = 253402300799999L;
                  }
               }

               String var33 = var2.method22942();
               if (var16 == null) {
                  var16 = var33;
               } else if (!method36374(var33, var16)) {
                  return null;
               }

               if (var33.length() != var16.length() && Class8003.method27342().method27343(var16) == null) {
                  return null;
               } else {
                  if (var17 == null || !var17.startsWith("/")) {
                     String var34 = var2.method22946();
                     int var35 = var34.lastIndexOf(47);
                     var17 = var35 != 0 ? var34.substring(0, var35) : "/";
                  }

                  return new Class9454(var10, var11, var12, var16, var17, var18, var19, var20, var21);
               }
            }
         } else {
            return null;
         }
      }
   }

   private static long method36378(String var0, int var1, int var2) {
      var1 = method36379(var0, var1, var2, false);
      int var5 = -1;
      int var6 = -1;
      int var7 = -1;
      int var8 = -1;
      int var9 = -1;
      int var10 = -1;
      Matcher var11 = field43925.matcher(var0);

      while (var1 < var2) {
         int var12 = method36379(var0, var1 + 1, var2, true);
         var11.region(var1, var12);
         if (var5 == -1 && var11.usePattern(field43925).matches()) {
            var5 = Integer.parseInt(var11.group(1));
            var6 = Integer.parseInt(var11.group(2));
            var7 = Integer.parseInt(var11.group(3));
         } else if (var8 == -1 && var11.usePattern(field43924).matches()) {
            var8 = Integer.parseInt(var11.group(1));
         } else if (var9 == -1 && var11.usePattern(field43923).matches()) {
            String var13 = var11.group(1).toLowerCase(Locale.US);
            var9 = field43923.pattern().indexOf(var13) / 4;
         } else if (var10 == -1 && var11.usePattern(field43922).matches()) {
            var10 = Integer.parseInt(var11.group(1));
         }

         var1 = method36379(var0, var12 + 1, var2, false);
      }

      if (var10 >= 70 && var10 <= 99) {
         var10 += 1900;
      }

      if (var10 >= 0 && var10 <= 69) {
         var10 += 2000;
      }

      if (var10 < 1601) {
         throw new IllegalArgumentException();
      } else if (var9 == -1) {
         throw new IllegalArgumentException();
      } else if (var8 < 1 || var8 > 31) {
         throw new IllegalArgumentException();
      } else if (var5 < 0 || var5 > 23) {
         throw new IllegalArgumentException();
      } else if (var6 < 0 || var6 > 59) {
         throw new IllegalArgumentException();
      } else if (var7 >= 0 && var7 <= 59) {
         GregorianCalendar var15 = new GregorianCalendar(Class9474.field44029);
         var15.setLenient(false);
         var15.set(1, var10);
         var15.set(2, var9 - 1);
         var15.set(5, var8);
         var15.set(11, var5);
         var15.set(12, var6);
         var15.set(13, var7);
         var15.set(14, 0);
         return var15.getTimeInMillis();
      } else {
         throw new IllegalArgumentException();
      }
   }

   private static int method36379(String var0, int var1, int var2, boolean var3) {
      for (int var6 = var1; var6 < var2; var6++) {
         char var7 = var0.charAt(var6);
         boolean var8 = var7 < ' ' && var7 != '\t'
            || var7 >= 127
            || var7 >= '0' && var7 <= '9'
            || var7 >= 'a' && var7 <= 'z'
            || var7 >= 'A' && var7 <= 'Z'
            || var7 == ':';
         if (var8 == !var3) {
            return var6;
         }
      }

      return var2;
   }

   private static long method36380(String var0) {
      try {
         long var3 = Long.parseLong(var0);
         return var3 <= 0L ? Long.MIN_VALUE : var3;
      } catch (NumberFormatException var6) {
         if (var0.matches("-?\\d+")) {
            return var0.startsWith("-") ? Long.MIN_VALUE : Long.MAX_VALUE;
         } else {
            throw var6;
         }
      }
   }

   private static String method36381(String var0) {
      if (!var0.endsWith(".")) {
         if (var0.startsWith(".")) {
            var0 = var0.substring(1);
         }

         String var3 = Class9474.method36555(var0);
         if (var3 != null) {
            return var3;
         } else {
            throw new IllegalArgumentException();
         }
      } else {
         throw new IllegalArgumentException();
      }
   }

   public static List<Class9454> method36382(Class7284 var0, Class9371 var1) {
      List var4 = var1.values("Set-Cookie");
      ArrayList var5 = null;
      int var6 = 0;

      for (int var7 = var4.size(); var6 < var7; var6++) {
         Class9454 var8 = method36376(var0, (String)var4.get(var6));
         if (var8 != null) {
            if (var5 == null) {
               var5 = new ArrayList();
            }

            var5.add(var8);
         }
      }

      return var5 == null ? Collections.<Class9454>emptyList() : Collections.<Class9454>unmodifiableList(var5);
   }

   @Override
   public String toString() {
      return this.toString(false);
   }

   public String toString(boolean var1) {
      StringBuilder var4 = new StringBuilder();
      var4.append(this.field43926);
      var4.append('=');
      var4.append(this.field43927);
      if (this.field43933) {
         if (this.field43928 != Long.MIN_VALUE) {
            var4.append("; expires=").append(Class9240.method34753(new Date(this.field43928)));
         } else {
            var4.append("; max-age=0");
         }
      }

      if (!this.field43934) {
         var4.append("; domain=");
         if (var1) {
            var4.append(".");
         }

         var4.append(this.field43929);
      }

      var4.append("; path=").append(this.field43930);
      if (this.field43931) {
         var4.append("; secure");
      }

      if (this.field43932) {
         var4.append("; httponly");
      }

      return var4.toString();
   }

   @Override
   public boolean equals(Object var1) {
      if (!(var1 instanceof Class9454)) {
         return false;
      } else {
         Class9454 var4 = (Class9454)var1;
         return var4.field43926.equals(this.field43926)
            && var4.field43927.equals(this.field43927)
            && var4.field43929.equals(this.field43929)
            && var4.field43930.equals(this.field43930)
            && var4.field43928 == this.field43928
            && var4.field43931 == this.field43931
            && var4.field43932 == this.field43932
            && var4.field43933 == this.field43933
            && var4.field43934 == this.field43934;
      }
   }

   @Override
   public int hashCode() {
      int var3 = 17;
      var3 = 31 * var3 + this.field43926.hashCode();
      var3 = 31 * var3 + this.field43927.hashCode();
      var3 = 31 * var3 + this.field43929.hashCode();
      var3 = 31 * var3 + this.field43930.hashCode();
      var3 = 31 * var3 + (int)(this.field43928 ^ this.field43928 >>> 32);
      var3 = 31 * var3 + (!this.field43931 ? 1 : 0);
      var3 = 31 * var3 + (!this.field43932 ? 1 : 0);
      var3 = 31 * var3 + (!this.field43933 ? 1 : 0);
      return 31 * var3 + (!this.field43934 ? 1 : 0);
   }
}
