package remapped;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.lang3.StringEscapeUtils;

public class class_1719 {
   private String[] field_8875 = null;
   private String field_8881 = null;
   private boolean field_8883 = false;
   private int field_8878 = 0;
   private String field_8874 = null;
   private int field_8870 = 0;
   private static final int field_8885 = 0;
   private static final int field_8886 = 1;
   private static final int field_8871 = 2;
   private static final int field_8884 = 3;
   private static final int field_8879 = 4;
   private static final String field_8869 = "pattern:";
   private static final String field_8882 = "ipattern:";
   private static final String field_8877 = "regex:";
   private static final String field_8887 = "iregex:";
   private static final int field_8873 = 0;
   private static final int field_8868 = 1;
   private static final String field_8872 = "#";
   private static final Pattern field_8876 = Pattern.compile("^#[0-9a-f]{6}+$");
   private static final Pattern field_8880 = Pattern.compile(".*\"text\":\"([^\"]+)\".*");

   public class_1719(String var1, String var2) {
      String[] var5 = Config.method_14302(var1, ".");
      this.field_8875 = Arrays.<String>copyOfRange(var5, 0, var5.length - 1);
      this.field_8881 = var5[var5.length - 1];
      if (var2.startsWith("!")) {
         this.field_8883 = true;
         var2 = var2.substring(1);
      }

      if (!var2.startsWith("pattern:")) {
         if (!var2.startsWith("ipattern:")) {
            if (!var2.startsWith("regex:")) {
               if (!var2.startsWith("iregex:")) {
                  this.field_8878 = 0;
               } else {
                  this.field_8878 = 4;
                  var2 = var2.substring("iregex:".length()).toLowerCase();
               }
            } else {
               this.field_8878 = 3;
               var2 = var2.substring("regex:".length());
            }
         } else {
            this.field_8878 = 2;
            var2 = var2.substring("ipattern:".length()).toLowerCase();
         }
      } else {
         this.field_8878 = 1;
         var2 = var2.substring("pattern:".length());
      }

      var2 = StringEscapeUtils.unescapeJava(var2);
      if (this.field_8878 == 0 && field_8876.matcher(var2).matches()) {
         this.field_8870 = 1;
      }

      this.field_8874 = var2;
   }

   public boolean method_7705(class_5734 var1) {
      return !this.field_8883 ? this.method_7703(var1) : !this.method_7703(var1);
   }

   public boolean method_7703(class_5734 var1) {
      if (var1 == null) {
         return false;
      } else {
         Object var4 = var1;

         for (int var5 = 0; var5 < this.field_8875.length; var5++) {
            String var6 = this.field_8875[var5];
            var4 = method_7701((class_8406)var4, var6);
            if (var4 == null) {
               return false;
            }
         }

         if (!this.field_8881.equals("*")) {
            class_8406 var7 = method_7701((class_8406)var4, this.field_8881);
            return var7 != null ? this.method_7699(var7) : false;
         } else {
            return this.method_7704((class_8406)var4);
         }
      }
   }

   private boolean method_7704(class_8406 var1) {
      if (var1 instanceof class_5734) {
         class_5734 var4 = (class_5734)var1;

         for (String var6 : var4.method_25952()) {
            class_8406 var7 = var4.method_25929(var6);
            if (this.method_7699(var7)) {
               return true;
            }
         }
      }

      if (var1 instanceof class_3416) {
         class_3416 var8 = (class_3416)var1;
         int var9 = var8.size();

         for (int var10 = 0; var10 < var9; var10++) {
            class_8406 var11 = var8.get(var10);
            if (this.method_7699(var11)) {
               return true;
            }
         }
      }

      return false;
   }

   private static class_8406 method_7701(class_8406 var0, String var1) {
      if (var0 instanceof class_5734) {
         class_5734 var6 = (class_5734)var0;
         return var6.method_25929(var1);
      } else if (!(var0 instanceof class_3416)) {
         return null;
      } else {
         class_3416 var4 = (class_3416)var0;
         if (var1.equals("count")) {
            return class_9413.method_43597(var4.size());
         } else {
            int var5 = Config.method_14361(var1, -1);
            return var5 >= 0 && var5 < var4.size() ? var4.get(var5) : null;
         }
      }
   }

   public boolean method_7699(class_8406 var1) {
      if (var1 != null) {
         String var4 = method_7702(var1, this.field_8870);
         return this.method_7706(var4);
      } else {
         return false;
      }
   }

   public boolean method_7706(String var1) {
      if (var1 == null) {
         return false;
      } else {
         switch (this.field_8878) {
            case 0:
               return var1.equals(this.field_8874);
            case 1:
               return this.method_7697(var1, this.field_8874);
            case 2:
               return this.method_7697(var1.toLowerCase(), this.field_8874);
            case 3:
               return this.method_7700(var1, this.field_8874);
            case 4:
               return this.method_7700(var1.toLowerCase(), this.field_8874);
            default:
               throw new IllegalArgumentException("Unknown NbtTagValue type: " + this.field_8878);
         }
      }
   }

   private boolean method_7697(String var1, String var2) {
      return class_8251.method_37812(var1, var2, '*', '?');
   }

   private boolean method_7700(String var1, String var2) {
      return var1.matches(var2);
   }

   private static String method_7702(class_8406 var0, int var1) {
      if (var0 != null) {
         if (!(var0 instanceof class_473)) {
            if (!(var0 instanceof class_9413)) {
               if (!(var0 instanceof class_5284)) {
                  if (!(var0 instanceof class_7745)) {
                     if (!(var0 instanceof class_3388)) {
                        if (!(var0 instanceof class_5718)) {
                           if (!(var0 instanceof class_9708)) {
                              return var0.toString();
                           } else {
                              class_9708 var12 = (class_9708)var0;
                              return Double.toString(var12.method_26642());
                           }
                        } else {
                           class_5718 var11 = (class_5718)var0;
                           return Float.toString(var11.method_26639());
                        }
                     } else {
                        class_3388 var10 = (class_3388)var0;
                        return Long.toString(var10.method_26635());
                     }
                  } else {
                     class_7745 var9 = (class_7745)var0;
                     return Short.toString(var9.method_26640());
                  }
               } else {
                  class_5284 var8 = (class_5284)var0;
                  return Byte.toString(var8.method_26641());
               }
            } else {
               class_9413 var7 = (class_9413)var0;
               return var1 != 1 ? Integer.toString(var7.method_26636()) : "#" + class_8251.method_37808(Integer.toHexString(var7.method_26636()), 6, '0');
            }
         } else {
            class_473 var4 = (class_473)var0;
            String var5 = var4.method_38710();
            if (var5.startsWith("{")) {
               Matcher var6 = field_8880.matcher(var5);
               if (var6.matches()) {
                  return var6.group(1);
               }
            }

            return var5;
         }
      } else {
         return null;
      }
   }

   @Override
   public String toString() {
      StringBuffer var3 = new StringBuffer();

      for (int var4 = 0; var4 < this.field_8875.length; var4++) {
         String var5 = this.field_8875[var4];
         if (var4 > 0) {
            var3.append(".");
         }

         var3.append(var5);
      }

      if (var3.length() > 0) {
         var3.append(".");
      }

      var3.append(this.field_8881);
      var3.append(" = ");
      var3.append(this.field_8874);
      return var3.toString();
   }
}
