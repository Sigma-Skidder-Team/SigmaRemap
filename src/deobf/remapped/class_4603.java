package remapped;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class class_4603 {
   public static Pattern field_22390 = Pattern.compile("\\s*uniform\\s+\\w+\\s+(\\w+).*");
   public static Pattern field_22393 = Pattern.compile("\\s*attribute\\s+\\w+\\s+(\\w+).*");
   public static Pattern field_22395 = Pattern.compile("\\s*const\\s+int\\s+(\\w+)\\s*=\\s*([-+.\\w]+)\\s*;.*");
   public static Pattern field_22383 = Pattern.compile("\\s*const\\s+float\\s+(\\w+)\\s*=\\s*([-+.\\w]+)\\s*;.*");
   public static Pattern field_22384 = Pattern.compile("\\s*const\\s+vec4\\s+(\\w+)\\s*=\\s*(.+)\\s*;.*");
   public static Pattern field_22392 = Pattern.compile("\\s*const\\s+bool\\s+(\\w+)\\s*=\\s*(\\w+)\\s*;.*");
   public static Pattern field_22394 = Pattern.compile("\\s*(/\\*|//)?\\s*([A-Z]+):\\s*(\\w+)\\s*(\\*/.*|\\s*)");
   public static Pattern field_22388 = Pattern.compile("\\s*#\\s*extension\\s+(\\w+)\\s*:\\s*(\\w+).*");
   public static Pattern field_22391 = Pattern.compile(".*deferred[0-9]*\\.fsh");
   public static Pattern field_22386 = Pattern.compile(".*composite[0-9]*\\.fsh");
   public static Pattern field_22385 = Pattern.compile(".*final\\.fsh");
   public static Pattern field_22387 = Pattern.compile("[0-7N]*");

   public static class_6964 method_21324(String var0) {
      Matcher var3 = field_22390.matcher(var0);
      if (!var3.matches()) {
         Matcher var4 = field_22393.matcher(var0);
         if (!var4.matches()) {
            Matcher var5 = field_22394.matcher(var0);
            if (!var5.matches()) {
               Matcher var6 = field_22395.matcher(var0);
               if (!var6.matches()) {
                  Matcher var7 = field_22383.matcher(var0);
                  if (!var7.matches()) {
                     Matcher var8 = field_22392.matcher(var0);
                     if (!var8.matches()) {
                        Matcher var9 = field_22388.matcher(var0);
                        if (!var9.matches()) {
                           Matcher var10 = field_22384.matcher(var0);
                           return !var10.matches() ? null : new class_6964(8, var10.group(1), var10.group(2), var0);
                        } else {
                           return new class_6964(7, var9.group(1), var9.group(2), var0);
                        }
                     } else {
                        return new class_6964(5, var8.group(1), var8.group(2), var0);
                     }
                  } else {
                     return new class_6964(4, var7.group(1), var7.group(2), var0);
                  }
               } else {
                  return new class_6964(3, var6.group(1), var6.group(2), var0);
               }
            } else {
               return new class_6964(6, var5.group(2), var5.group(3), var0);
            }
         } else {
            return new class_6964(2, var4.group(1), "", var0);
         }
      } else {
         return new class_6964(1, var3.group(1), "", var0);
      }
   }

   public static int method_21332(String var0, String var1, int var2, int var3) {
      if (var0.length() == var1.length() + 1) {
         if (!var0.startsWith(var1)) {
            return -1;
         } else {
            int var6 = var0.charAt(var1.length()) - '0';
            return var6 >= var2 && var6 <= var3 ? var6 : -1;
         }
      } else {
         return -1;
      }
   }

   public static int method_21328(String var0) {
      switch (var0) {
         case "shadow":
            return 0;
         case "watershadow":
            return 1;
         default:
            return method_21332(var0, "shadowtex", 0, 1);
      }
   }

   public static int method_21323(String var0) {
      byte var3 = -1;
      switch (var0.hashCode()) {
         case -1560188349:
            if (var0.equals("shadowcolor")) {
               var3 = 0;
            }
         default:
            switch (var3) {
               case 0:
                  return 0;
               default:
                  return method_21332(var0, "shadowcolor", 0, 1);
            }
      }
   }

   public static int method_21326(String var0) {
      return method_21332(var0, "depthtex", 0, 2);
   }

   public static int method_21327(String var0) {
      int var3 = method_21332(var0, "gaux", 1, 4);
      return var3 <= 0 ? method_21332(var0, "colortex", 4, 7) : var3 + 3;
   }

   public static boolean method_21330(String var0) {
      return field_22391.matcher(var0).matches();
   }

   public static boolean method_21331(String var0) {
      return field_22386.matcher(var0).matches();
   }

   public static boolean method_21329(String var0) {
      return field_22385.matcher(var0).matches();
   }

   public static boolean method_21322(String var0) {
      return field_22387.matcher(var0).matches();
   }
}
