package remapped;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

public final class class_8460 {
   private static final Pattern field_43254 = Pattern.compile("(\\d{2,4})[^\\d]*");
   private static final Pattern field_43249 = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
   private static final Pattern field_43250 = Pattern.compile("(\\d{1,2})[^\\d]*");
   private static final Pattern field_43248 = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");
   private final String field_43256;
   private final String field_43251;
   private final long field_43252;
   private final String field_43255;
   private final String field_43246;
   private final boolean field_43257;
   private final boolean field_43245;
   private final boolean field_43258;
   private final boolean field_43247;

   private class_8460(String var1, String var2, long var3, String var5, String var6, boolean var7, boolean var8, boolean var9, boolean var10) {
      this.field_43256 = var1;
      this.field_43251 = var2;
      this.field_43252 = var3;
      this.field_43255 = var5;
      this.field_43246 = var6;
      this.field_43257 = var7;
      this.field_43245 = var8;
      this.field_43247 = var9;
      this.field_43258 = var10;
   }

   public class_8460(class_1844 var1) {
      if (var1.field_9371 != null) {
         if (var1.field_9368 != null) {
            if (var1.field_9365 != null) {
               this.field_43256 = var1.field_9371;
               this.field_43251 = var1.field_9368;
               this.field_43252 = var1.field_9366;
               this.field_43255 = var1.field_9365;
               this.field_43246 = var1.field_9364;
               this.field_43257 = var1.field_9367;
               this.field_43245 = var1.field_9369;
               this.field_43258 = var1.field_9370;
               this.field_43247 = var1.field_9363;
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

   public String method_38918() {
      return this.field_43256;
   }

   public String method_38915() {
      return this.field_43251;
   }

   public boolean method_38926() {
      return this.field_43258;
   }

   public long method_38921() {
      return this.field_43252;
   }

   public boolean method_38916() {
      return this.field_43247;
   }

   public String method_38923() {
      return this.field_43255;
   }

   public String method_38913() {
      return this.field_43246;
   }

   public boolean method_38919() {
      return this.field_43245;
   }

   public boolean method_38908() {
      return this.field_43257;
   }

   public boolean method_38909(class_1672 var1) {
      boolean var4 = !this.field_43247 ? method_38912(var1.method_7449(), this.field_43255) : var1.method_7449().equals(this.field_43255);
      if (var4) {
         return method_38924(var1, this.field_43246) ? !this.field_43257 || var1.method_7485() : false;
      } else {
         return false;
      }
   }

   private static boolean method_38912(String var0, String var1) {
      return !var0.equals(var1) ? var0.endsWith(var1) && var0.charAt(var0.length() - var1.length() - 1) == '.' && !class_8515.method_39204(var0) : true;
   }

   private static boolean method_38924(class_1672 var0, String var1) {
      String var4 = var0.method_7481();
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
   public static class_8460 method_38911(class_1672 var0, String var1) {
      return method_38910(System.currentTimeMillis(), var0, var1);
   }

   @Nullable
   public static class_8460 method_38910(long var0, class_1672 var2, String var3) {
      int var6 = 0;
      int var7 = var3.length();
      int var8 = class_8515.method_39219(var3, var6, var7, ';');
      int var9 = class_8515.method_39219(var3, var6, var8, '=');
      if (var9 == var8) {
         return null;
      } else {
         String var10 = class_8515.method_39212(var3, var6, var9);
         if (!var10.isEmpty() && class_8515.method_39195(var10) == -1) {
            String var11 = class_8515.method_39212(var3, var9 + 1, var8);
            if (class_8515.method_39195(var11) != -1) {
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
                  int var22 = class_8515.method_39219(var3, var6, var7, ';');
                  int var23 = class_8515.method_39219(var3, var6, var22, '=');
                  String var24 = class_8515.method_39212(var3, var6, var23);
                  String var25 = var23 < var22 ? class_8515.method_39212(var3, var23 + 1, var22) : "";
                  if (var24.equalsIgnoreCase("expires")) {
                     try {
                        var12 = method_38907(var25, 0, var25.length());
                        var21 = true;
                     } catch (IllegalArgumentException var31) {
                     }
                  } else if (var24.equalsIgnoreCase("max-age")) {
                     try {
                        var14 = method_38920(var25);
                        var21 = true;
                     } catch (NumberFormatException var30) {
                     }
                  } else if (var24.equalsIgnoreCase("domain")) {
                     try {
                        var16 = method_38914(var25);
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

               String var33 = var2.method_7449();
               if (var16 == null) {
                  var16 = var33;
               } else if (!method_38912(var33, var16)) {
                  return null;
               }

               if (var33.length() != var16.length() && class_3339.method_15322().method_15319(var16) == null) {
                  return null;
               } else {
                  if (var17 == null || !var17.startsWith("/")) {
                     String var34 = var2.method_7481();
                     int var35 = var34.lastIndexOf(47);
                     var17 = var35 != 0 ? var34.substring(0, var35) : "/";
                  }

                  return new class_8460(var10, var11, var12, var16, var17, var18, var19, var20, var21);
               }
            }
         } else {
            return null;
         }
      }
   }

   private static long method_38907(String var0, int var1, int var2) {
      var1 = method_38925(var0, var1, var2, false);
      int var5 = -1;
      int var6 = -1;
      int var7 = -1;
      int var8 = -1;
      int var9 = -1;
      int var10 = -1;
      Matcher var11 = field_43248.matcher(var0);

      while (var1 < var2) {
         int var12 = method_38925(var0, var1 + 1, var2, true);
         var11.region(var1, var12);
         if (var5 == -1 && var11.usePattern(field_43248).matches()) {
            var5 = Integer.parseInt(var11.group(1));
            var6 = Integer.parseInt(var11.group(2));
            var7 = Integer.parseInt(var11.group(3));
         } else if (var8 == -1 && var11.usePattern(field_43250).matches()) {
            var8 = Integer.parseInt(var11.group(1));
         } else if (var9 == -1 && var11.usePattern(field_43249).matches()) {
            String var13 = var11.group(1).toLowerCase(Locale.US);
            var9 = field_43249.pattern().indexOf(var13) / 4;
         } else if (var10 == -1 && var11.usePattern(field_43254).matches()) {
            var10 = Integer.parseInt(var11.group(1));
         }

         var1 = method_38925(var0, var12 + 1, var2, false);
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
         GregorianCalendar var15 = new GregorianCalendar(class_8515.field_43584);
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

   private static int method_38925(String var0, int var1, int var2, boolean var3) {
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

   private static long method_38920(String var0) {
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

   private static String method_38914(String var0) {
      if (!var0.endsWith(".")) {
         if (var0.startsWith(".")) {
            var0 = var0.substring(1);
         }

         String var3 = class_8515.method_39199(var0);
         if (var3 != null) {
            return var3;
         } else {
            throw new IllegalArgumentException();
         }
      } else {
         throw new IllegalArgumentException();
      }
   }

   public static List<class_8460> method_38922(class_1672 var0, class_8121 var1) {
      List var4 = var1.values("Set-Cookie");
      ArrayList var5 = null;
      int var6 = 0;

      for (int var7 = var4.size(); var6 < var7; var6++) {
         class_8460 var8 = method_38911(var0, (String)var4.get(var6));
         if (var8 != null) {
            if (var5 == null) {
               var5 = new ArrayList();
            }

            var5.add(var8);
         }
      }

      return var5 == null ? Collections.<class_8460>emptyList() : Collections.<class_8460>unmodifiableList(var5);
   }

   @Override
   public String toString() {
      return this.toString(false);
   }

   public String toString(boolean var1) {
      StringBuilder var4 = new StringBuilder();
      var4.append(this.field_43256);
      var4.append('=');
      var4.append(this.field_43251);
      if (this.field_43258) {
         if (this.field_43252 != Long.MIN_VALUE) {
            var4.append("; expires=").append(class_7611.method_34526(new Date(this.field_43252)));
         } else {
            var4.append("; max-age=0");
         }
      }

      if (!this.field_43247) {
         var4.append("; domain=");
         if (var1) {
            var4.append(".");
         }

         var4.append(this.field_43255);
      }

      var4.append("; path=").append(this.field_43246);
      if (this.field_43257) {
         var4.append("; secure");
      }

      if (this.field_43245) {
         var4.append("; httponly");
      }

      return var4.toString();
   }

   @Override
   public boolean equals(Object var1) {
      if (!(var1 instanceof class_8460)) {
         return false;
      } else {
         class_8460 var4 = (class_8460)var1;
         return var4.field_43256.equals(this.field_43256)
            && var4.field_43251.equals(this.field_43251)
            && var4.field_43255.equals(this.field_43255)
            && var4.field_43246.equals(this.field_43246)
            && var4.field_43252 == this.field_43252
            && var4.field_43257 == this.field_43257
            && var4.field_43245 == this.field_43245
            && var4.field_43258 == this.field_43258
            && var4.field_43247 == this.field_43247;
      }
   }

   @Override
   public int hashCode() {
      int var3 = 17;
      var3 = 31 * var3 + this.field_43256.hashCode();
      var3 = 31 * var3 + this.field_43251.hashCode();
      var3 = 31 * var3 + this.field_43255.hashCode();
      var3 = 31 * var3 + this.field_43246.hashCode();
      var3 = 31 * var3 + (int)(this.field_43252 ^ this.field_43252 >>> 32);
      var3 = 31 * var3 + (!this.field_43257 ? 1 : 0);
      var3 = 31 * var3 + (!this.field_43245 ? 1 : 0);
      var3 = 31 * var3 + (!this.field_43258 ? 1 : 0);
      return 31 * var3 + (!this.field_43247 ? 1 : 0);
   }
}
