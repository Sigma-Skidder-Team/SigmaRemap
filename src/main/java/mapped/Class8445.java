package mapped;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Class8445 {
   public static Pattern field36187 = Pattern.compile("\\s*uniform\\s+\\w+\\s+(\\w+).*");
   public static Pattern field36188 = Pattern.compile("\\s*attribute\\s+\\w+\\s+(\\w+).*");
   public static Pattern field36189 = Pattern.compile("\\s*const\\s+int\\s+(\\w+)\\s*=\\s*([-+.\\w]+)\\s*;.*");
   public static Pattern field36190 = Pattern.compile("\\s*const\\s+float\\s+(\\w+)\\s*=\\s*([-+.\\w]+)\\s*;.*");
   public static Pattern field36191 = Pattern.compile("\\s*const\\s+vec4\\s+(\\w+)\\s*=\\s*(.+)\\s*;.*");
   public static Pattern field36192 = Pattern.compile("\\s*const\\s+bool\\s+(\\w+)\\s*=\\s*(\\w+)\\s*;.*");
   public static Pattern field36193 = Pattern.compile("\\s*(/\\*|//)?\\s*([A-Z]+):\\s*(\\w+)\\s*(\\*/.*|\\s*)");
   public static Pattern field36194 = Pattern.compile("\\s*#\\s*extension\\s+(\\w+)\\s*:\\s*(\\w+).*");
   public static Pattern field36195 = Pattern.compile(".*deferred[0-9]*\\.fsh");
   public static Pattern field36196 = Pattern.compile(".*composite[0-9]*\\.fsh");
   public static Pattern field36197 = Pattern.compile(".*final\\.fsh");
   public static Pattern field36198 = Pattern.compile("[0-7N]*");

   public static Class9090 method29699(String var0) {
      Matcher var3 = field36187.matcher(var0);
      if (!var3.matches()) {
         Matcher var4 = field36188.matcher(var0);
         if (!var4.matches()) {
            Matcher var5 = field36193.matcher(var0);
            if (!var5.matches()) {
               Matcher var6 = field36189.matcher(var0);
               if (!var6.matches()) {
                  Matcher var7 = field36190.matcher(var0);
                  if (!var7.matches()) {
                     Matcher var8 = field36192.matcher(var0);
                     if (!var8.matches()) {
                        Matcher var9 = field36194.matcher(var0);
                        if (!var9.matches()) {
                           Matcher var10 = field36191.matcher(var0);
                           return !var10.matches() ? null : new Class9090(8, var10.group(1), var10.group(2), var0);
                        } else {
                           return new Class9090(7, var9.group(1), var9.group(2), var0);
                        }
                     } else {
                        return new Class9090(5, var8.group(1), var8.group(2), var0);
                     }
                  } else {
                     return new Class9090(4, var7.group(1), var7.group(2), var0);
                  }
               } else {
                  return new Class9090(3, var6.group(1), var6.group(2), var0);
               }
            } else {
               return new Class9090(6, var5.group(2), var5.group(3), var0);
            }
         } else {
            return new Class9090(2, var4.group(1), "", var0);
         }
      } else {
         return new Class9090(1, var3.group(1), "", var0);
      }
   }

   public static int method29700(String var0, String var1, int var2, int var3) {
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

   public static int method29701(String var0) {
      switch (var0) {
         case "shadow":
            return 0;
         case "watershadow":
            return 1;
         default:
            return method29700(var0, "shadowtex", 0, 1);
      }
   }

   public static int method29702(String var0) {
      int var3 = -1;
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
                  return method29700(var0, "shadowcolor", 0, 1);
            }
      }
   }

   public static int method29703(String var0) {
      return method29700(var0, "depthtex", 0, 2);
   }

   public static int method29704(String var0) {
      int var3 = method29700(var0, "gaux", 1, 4);
      return var3 <= 0 ? method29700(var0, "colortex", 4, 7) : var3 + 3;
   }

   public static boolean method29705(String var0) {
      return field36195.matcher(var0).matches();
   }

   public static boolean method29706(String var0) {
      return field36196.matcher(var0).matches();
   }

   public static boolean method29707(String var0) {
      return field36197.matcher(var0).matches();
   }

   public static boolean method29708(String var0) {
      return field36198.matcher(var0).matches();
   }
}
