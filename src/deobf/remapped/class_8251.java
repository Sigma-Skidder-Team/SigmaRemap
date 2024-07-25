package remapped;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class class_8251 {
   public static boolean method_37812(String var0, String var1, char var2, char var3) {
      if (var1 == null || var0 == null) {
         return var1 == var0;
      } else if (var1.indexOf(var2) < 0) {
         return var1.indexOf(var3) >= 0 ? method_37810(var0, var1, var3) : var1.equals(var0);
      } else {
         ArrayList var6 = new ArrayList();
         String var7 = "" + var2;
         if (var1.startsWith(var7)) {
            var6.add("");
         }

         StringTokenizer var8 = new StringTokenizer(var1, var7);

         while (var8.hasMoreElements()) {
            var6.add(var8.nextToken());
         }

         if (var1.endsWith(var7)) {
            var6.add("");
         }

         String var9 = (String)var6.get(0);
         if (method_37821(var0, var9, var3)) {
            String var10 = (String)var6.get(var6.size() - 1);
            if (method_37824(var0, var10, var3)) {
               int var11 = 0;

               for (int var12 = 0; var12 < var6.size(); var12++) {
                  String var13 = (String)var6.get(var12);
                  if (var13.length() > 0) {
                     int var14 = method_37827(var0, var13, var11, var3);
                     if (var14 < 0) {
                        return false;
                     }

                     var11 = var14 + var13.length();
                  }
               }

               return true;
            } else {
               return false;
            }
         } else {
            return false;
         }
      }
   }

   private static boolean method_37810(String var0, String var1, char var2) {
      if (var0 != null && var1 != null) {
         if (var0.length() == var1.length()) {
            for (int var5 = 0; var5 < var1.length(); var5++) {
               char var6 = var1.charAt(var5);
               if (var6 != var2 && var0.charAt(var5) != var6) {
                  return false;
               }
            }

            return true;
         } else {
            return false;
         }
      } else {
         return var0 == var1;
      }
   }

   private static int method_37827(String var0, String var1, int var2, char var3) {
      if (var0 == null || var1 == null) {
         return -1;
      } else if (var2 >= 0 && var2 <= var0.length()) {
         if (var0.length() < var2 + var1.length()) {
            return -1;
         } else {
            for (int var6 = var2; var6 + var1.length() <= var0.length(); var6++) {
               String var7 = var0.substring(var6, var6 + var1.length());
               if (method_37810(var7, var1, var3)) {
                  return var6;
               }
            }

            return -1;
         }
      } else {
         return -1;
      }
   }

   private static boolean method_37824(String var0, String var1, char var2) {
      if (var0 != null && var1 != null) {
         if (var0.length() >= var1.length()) {
            String var5 = var0.substring(var0.length() - var1.length(), var0.length());
            return method_37810(var5, var1, var2);
         } else {
            return false;
         }
      } else {
         return var0 == var1;
      }
   }

   private static boolean method_37821(String var0, String var1, char var2) {
      if (var0 != null && var1 != null) {
         if (var0.length() >= var1.length()) {
            String var5 = var0.substring(0, var1.length());
            return method_37810(var5, var1, var2);
         } else {
            return false;
         }
      } else {
         return var0 == var1;
      }
   }

   public static boolean method_37813(String var0, String[] var1, char var2) {
      for (int var5 = 0; var5 < var1.length; var5++) {
         String var6 = var1[var5];
         if (method_37811(var0, var6, var2)) {
            return true;
         }
      }

      return false;
   }

   public static boolean method_37811(String var0, String var1, char var2) {
      if (var1 == null || var0 == null) {
         return var1 == var0;
      } else if (var1.indexOf(var2) < 0) {
         return var1.equals(var0);
      } else {
         ArrayList var5 = new ArrayList();
         String var6 = "" + var2;
         if (var1.startsWith(var6)) {
            var5.add("");
         }

         StringTokenizer var7 = new StringTokenizer(var1, var6);

         while (var7.hasMoreElements()) {
            var5.add(var7.nextToken());
         }

         if (var1.endsWith(var6)) {
            var5.add("");
         }

         String var8 = (String)var5.get(0);
         if (var0.startsWith(var8)) {
            String var9 = (String)var5.get(var5.size() - 1);
            if (var0.endsWith(var9)) {
               int var10 = 0;

               for (int var11 = 0; var11 < var5.size(); var11++) {
                  String var12 = (String)var5.get(var11);
                  if (var12.length() > 0) {
                     int var13 = var0.indexOf(var12, var10);
                     if (var13 < 0) {
                        return false;
                     }

                     var10 = var13 + var12.length();
                  }
               }

               return true;
            } else {
               return false;
            }
         } else {
            return false;
         }
      }
   }

   public static String[] method_37802(String var0, String var1) {
      if (var0 != null && var0.length() > 0) {
         if (var1 != null) {
            ArrayList var4 = new ArrayList();
            int var5 = 0;

            for (int var6 = 0; var6 < var0.length(); var6++) {
               char var7 = var0.charAt(var6);
               if (equals(var7, var1)) {
                  var4.add(var0.substring(var5, var6));
                  var5 = var6 + 1;
               }
            }

            var4.add(var0.substring(var5, var0.length()));
            return var4.<String>toArray(new String[var4.size()]);
         } else {
            return new String[]{var0};
         }
      } else {
         return new String[0];
      }
   }

   private static boolean equals(char var0, String var1) {
      for (int var4 = 0; var4 < var1.length(); var4++) {
         if (var1.charAt(var4) == var0) {
            return true;
         }
      }

      return false;
   }

   public static boolean method_37829(String var0, String var1) {
      if (var0 != null) {
         var0 = var0.trim();
      }

      if (var1 != null) {
         var1 = var1.trim();
      }

      return equals(var0, var1);
   }

   public static boolean method_37825(String var0) {
      return var0 != null ? var0.trim().length() <= 0 : true;
   }

   public static String method_37816(String var0) {
      int var3 = method_37801(var0, -1);
      if (var3 != -1) {
         String var4 = "" + ++var3;
         return var4.length() <= var0.length() ? method_37808("" + var3, var0.length(), '0') : "";
      } else {
         return "";
      }
   }

   public static int method_37801(String var0, int var1) {
      if (var0 == null) {
         return var1;
      } else {
         try {
            return Integer.parseInt(var0);
         } catch (NumberFormatException var5) {
            return var1;
         }
      }
   }

   public static boolean method_37834(String var0) {
      return !method_37825(var0);
   }

   public static String method_37805(String var0, String var1) {
      for (int var4 = 0; var4 < var1.length(); var4++) {
         if (var0.indexOf(var1.charAt(var4)) < 0) {
            var0 = var0 + var1.charAt(var4);
         }
      }

      return var0;
   }

   public static String method_37808(String var0, int var1, char var2) {
      if (var0 == null) {
         var0 = "";
      }

      if (var0.length() >= var1) {
         return var0;
      } else {
         StringBuffer var5 = new StringBuffer();
         int var6 = var1 - var0.length();

         while (var5.length() < var6) {
            var5.append(var2);
         }

         return var5.toString() + var0;
      }
   }

   public static String method_37835(String var0, int var1, char var2) {
      if (var0 == null) {
         var0 = "";
      }

      if (var0.length() >= var1) {
         return var0;
      } else {
         StringBuffer var5 = new StringBuffer(var0);

         while (var5.length() < var1) {
            var5.append(var2);
         }

         return var5.toString();
      }
   }

   public static boolean equals(Object var0, Object var1) {
      if (var0 != var1) {
         return var0 != null && var0.equals(var1) ? true : var1 != null && var1.equals(var0);
      } else {
         return true;
      }
   }

   public static boolean method_37803(String var0, String[] var1) {
      if (var0 == null) {
         return false;
      } else if (var1 == null) {
         return false;
      } else {
         for (int var4 = 0; var4 < var1.length; var4++) {
            String var5 = var1[var4];
            if (var0.startsWith(var5)) {
               return true;
            }
         }

         return false;
      }
   }

   public static boolean method_37815(String var0, String[] var1) {
      if (var0 == null) {
         return false;
      } else if (var1 == null) {
         return false;
      } else {
         for (int var4 = 0; var4 < var1.length; var4++) {
            String var5 = var1[var4];
            if (var0.endsWith(var5)) {
               return true;
            }
         }

         return false;
      }
   }

   public static String method_37832(String var0, String var1) {
      if (var0 != null && var1 != null) {
         if (var0.startsWith(var1)) {
            var0 = var0.substring(var1.length());
         }

         return var0;
      } else {
         return var0;
      }
   }

   public static String method_37822(String var0, String var1) {
      if (var0 != null && var1 != null) {
         if (var0.endsWith(var1)) {
            var0 = var0.substring(0, var0.length() - var1.length());
         }

         return var0;
      } else {
         return var0;
      }
   }

   public static String method_37836(String var0, String var1, String var2) {
      if (var0 == null || var1 == null) {
         return var0;
      } else if (var0.endsWith(var1)) {
         if (var2 == null) {
            var2 = "";
         }

         var0 = var0.substring(0, var0.length() - var1.length());
         return var0 + var2;
      } else {
         return var0;
      }
   }

   public static String method_37807(String var0, String var1, String var2) {
      if (var0 == null || var1 == null) {
         return var0;
      } else if (var0.startsWith(var1)) {
         if (var2 == null) {
            var2 = "";
         }

         var0 = var0.substring(var1.length());
         return var2 + var0;
      } else {
         return var0;
      }
   }

   public static int method_37814(String[] var0, String var1) {
      if (var0 != null && var1 != null) {
         for (int var4 = 0; var4 < var0.length; var4++) {
            String var5 = var0[var4];
            if (var5.startsWith(var1)) {
               return var4;
            }
         }

         return -1;
      } else {
         return -1;
      }
   }

   public static int method_37809(String[] var0, String var1) {
      if (var0 != null && var1 != null) {
         for (int var4 = 0; var4 < var0.length; var4++) {
            String var5 = var0[var4];
            if (var5.endsWith(var1)) {
               return var4;
            }
         }

         return -1;
      } else {
         return -1;
      }
   }

   public static String[] method_37826(String[] var0, int var1, int var2) {
      if (var0 == null) {
         return var0;
      } else if (var2 > 0 && var1 < var0.length) {
         if (var1 >= var2) {
            return var0;
         } else {
            ArrayList var5 = new ArrayList(var0.length);

            for (int var6 = 0; var6 < var0.length; var6++) {
               String var7 = var0[var6];
               if (var6 < var1 || var6 >= var2) {
                  var5.add(var7);
               }
            }

            return var5.<String>toArray(new String[var5.size()]);
         }
      } else {
         return var0;
      }
   }

   public static String method_37823(String var0, String[] var1) {
      if (var0 != null && var1 != null) {
         int var4 = var0.length();

         for (int var5 = 0; var5 < var1.length; var5++) {
            String var6 = var1[var5];
            var0 = method_37822(var0, var6);
            if (var0.length() != var4) {
               break;
            }
         }

         return var0;
      } else {
         return var0;
      }
   }

   public static String method_37833(String var0, String[] var1) {
      if (var0 != null && var1 != null) {
         int var4 = var0.length();

         for (int var5 = 0; var5 < var1.length; var5++) {
            String var6 = var1[var5];
            var0 = method_37832(var0, var6);
            if (var0.length() != var4) {
               break;
            }
         }

         return var0;
      } else {
         return var0;
      }
   }

   public static String method_37820(String var0, String[] var1, String[] var2) {
      var0 = method_37833(var0, var1);
      return method_37823(var0, var2);
   }

   public static String method_37819(String var0, String var1, String var2) {
      return method_37820(var0, new String[]{var1}, new String[]{var2});
   }

   public static String method_37831(String var0, String var1, String var2) {
      if (var0 != null && var1 != null && var2 != null) {
         int var5 = var0.indexOf(var1);
         if (var5 >= 0) {
            int var6 = var0.indexOf(var2, var5);
            return var6 >= 0 ? var0.substring(var5, var6 + var2.length()) : null;
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   public static String method_37817(String var0, String var1) {
      if (var0 != null && var1 != null) {
         return !var0.endsWith(var1) ? var0 + var1 : var0;
      } else {
         return var0;
      }
   }

   public static String method_37828(String var0, String var1) {
      if (var0 != null && var1 != null) {
         return !var0.endsWith(var1) ? var1 + var0 : var0;
      } else {
         return var0;
      }
   }

   public static String method_37830(String var0, String var1) {
      if (var0 != null && var1 != null) {
         var0 = method_37806(var0, var1);
         return method_37818(var0, var1);
      } else {
         return var0;
      }
   }

   public static String method_37806(String var0, String var1) {
      if (var0 != null && var1 != null) {
         int var4 = var0.length();

         for (int var5 = 0; var5 < var4; var5++) {
            char var6 = var0.charAt(var5);
            if (var1.indexOf(var6) < 0) {
               return var0.substring(var5);
            }
         }

         return "";
      } else {
         return var0;
      }
   }

   public static String method_37818(String var0, String var1) {
      if (var0 != null && var1 != null) {
         int var4 = var0.length();

         int var5;
         for (var5 = var4; var5 > 0; var5--) {
            char var6 = var0.charAt(var5 - 1);
            if (var1.indexOf(var6) < 0) {
               break;
            }
         }

         return var5 != var4 ? var0.substring(0, var5) : var0;
      } else {
         return var0;
      }
   }
}
