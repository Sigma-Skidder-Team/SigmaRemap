package mapped;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class Class9402 {
   public static boolean method35744(String var0, String var1, char var2, char var3) {
      if (var1 == null || var0 == null) {
         return var1 == var0;
      } else if (var1.indexOf(var2) < 0) {
         return var1.indexOf(var3) >= 0 ? method35745(var0, var1, var3) : var1.equals(var0);
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
         if (method35748(var0, var9, var3)) {
            String var10 = (String)var6.get(var6.size() - 1);
            if (method35747(var0, var10, var3)) {
               int var11 = 0;

               for (int var12 = 0; var12 < var6.size(); var12++) {
                  String var13 = (String)var6.get(var12);
                  if (var13.length() > 0) {
                     int var14 = method35746(var0, var13, var11, var3);
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

   private static boolean method35745(String var0, String var1, char var2) {
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

   private static int method35746(String var0, String var1, int var2, char var3) {
      if (var0 == null || var1 == null) {
         return -1;
      } else if (var2 >= 0 && var2 <= var0.length()) {
         if (var0.length() < var2 + var1.length()) {
            return -1;
         } else {
            for (int var6 = var2; var6 + var1.length() <= var0.length(); var6++) {
               String var7 = var0.substring(var6, var6 + var1.length());
               if (method35745(var7, var1, var3)) {
                  return var6;
               }
            }

            return -1;
         }
      } else {
         return -1;
      }
   }

   private static boolean method35747(String var0, String var1, char var2) {
      if (var0 != null && var1 != null) {
         if (var0.length() >= var1.length()) {
            String var5 = var0.substring(var0.length() - var1.length(), var0.length());
            return method35745(var5, var1, var2);
         } else {
            return false;
         }
      } else {
         return var0 == var1;
      }
   }

   private static boolean method35748(String var0, String var1, char var2) {
      if (var0 != null && var1 != null) {
         if (var0.length() >= var1.length()) {
            String var5 = var0.substring(0, var1.length());
            return method35745(var5, var1, var2);
         } else {
            return false;
         }
      } else {
         return var0 == var1;
      }
   }

   public static boolean method35749(String var0, String[] var1, char var2) {
      for (int var5 = 0; var5 < var1.length; var5++) {
         String var6 = var1[var5];
         if (method35750(var0, var6, var2)) {
            return true;
         }
      }

      return false;
   }

   public static boolean method35750(String var0, String var1, char var2) {
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

   public static String[] method35751(String var0, String var1) {
      if (var0 != null && var0.length() > 0) {
         if (var1 != null) {
            ArrayList<String> var4 = new ArrayList();
            int var5 = 0;

            for (int var6 = 0; var6 < var0.length(); var6++) {
               char var7 = var0.charAt(var6);
               if (equals(var7, var1)) {
                  var4.add(var0.substring(var5, var6));
                  var5 = var6 + 1;
               }
            }

            var4.add(var0.substring(var5, var0.length()));
            return var4.toArray(new String[var4.size()]);
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

   public static boolean method35752(String var0, String var1) {
      if (var0 != null) {
         var0 = var0.trim();
      }

      if (var1 != null) {
         var1 = var1.trim();
      }

      return equals(var0, var1);
   }

   public static boolean method35753(String var0) {
      return var0 != null ? var0.trim().length() <= 0 : true;
   }

   public static String method35754(String var0) {
      int var3 = method35755(var0, -1);
      if (var3 != -1) {
         String var4 = "" + ++var3;
         return var4.length() <= var0.length() ? method35758("" + var3, var0.length(), '0') : "";
      } else {
         return "";
      }
   }

   public static int method35755(String var0, int var1) {
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

   public static boolean method35756(String var0) {
      return !method35753(var0);
   }

   public static String method35757(String var0, String var1) {
      for (int var4 = 0; var4 < var1.length(); var4++) {
         if (var0.indexOf(var1.charAt(var4)) < 0) {
            var0 = var0 + var1.charAt(var4);
         }
      }

      return var0;
   }

   public static String method35758(String var0, int var1, char var2) {
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

   public static String method35759(String var0, int var1, char var2) {
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

   public static boolean method35760(String var0, String[] var1) {
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

   public static boolean method35761(String var0, String[] var1) {
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

   public static String method35762(String var0, String var1) {
      if (var0 != null && var1 != null) {
         if (var0.startsWith(var1)) {
            var0 = var0.substring(var1.length());
         }

         return var0;
      } else {
         return var0;
      }
   }

   public static String method35763(String var0, String var1) {
      if (var0 != null && var1 != null) {
         if (var0.endsWith(var1)) {
            var0 = var0.substring(0, var0.length() - var1.length());
         }

         return var0;
      } else {
         return var0;
      }
   }

   public static String method35764(String var0, String var1, String var2) {
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

   public static String method35765(String var0, String var1, String var2) {
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

   public static int method35766(String[] var0, String var1) {
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

   public static int method35767(String[] var0, String var1) {
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

   public static String[] method35768(String[] var0, int var1, int var2) {
      if (var0 == null) {
         return var0;
      } else if (var2 > 0 && var1 < var0.length) {
         if (var1 >= var2) {
            return var0;
         } else {
            ArrayList<String> var5 = new ArrayList(var0.length);

            for (int var6 = 0; var6 < var0.length; var6++) {
               String var7 = var0[var6];
               if (var6 < var1 || var6 >= var2) {
                  var5.add(var7);
               }
            }

            return var5.toArray(new String[var5.size()]);
         }
      } else {
         return var0;
      }
   }

   public static String method35769(String var0, String[] var1) {
      if (var0 != null && var1 != null) {
         int var4 = var0.length();

         for (int var5 = 0; var5 < var1.length; var5++) {
            String var6 = var1[var5];
            var0 = method35763(var0, var6);
            if (var0.length() != var4) {
               break;
            }
         }

         return var0;
      } else {
         return var0;
      }
   }

   public static String method35770(String var0, String[] var1) {
      if (var0 != null && var1 != null) {
         int var4 = var0.length();

         for (int var5 = 0; var5 < var1.length; var5++) {
            String var6 = var1[var5];
            var0 = method35762(var0, var6);
            if (var0.length() != var4) {
               break;
            }
         }

         return var0;
      } else {
         return var0;
      }
   }

   public static String method35771(String var0, String[] var1, String[] var2) {
      var0 = method35770(var0, var1);
      return method35769(var0, var2);
   }

   public static String method35772(String var0, String var1, String var2) {
      return method35771(var0, new String[]{var1}, new String[]{var2});
   }

   public static String method35773(String var0, String var1, String var2) {
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

   public static String method35774(String var0, String var1) {
      if (var0 != null && var1 != null) {
         return !var0.endsWith(var1) ? var0 + var1 : var0;
      } else {
         return var0;
      }
   }

   public static String method35775(String var0, String var1) {
      if (var0 != null && var1 != null) {
         return !var0.endsWith(var1) ? var1 + var0 : var0;
      } else {
         return var0;
      }
   }

   public static String method35776(String var0, String var1) {
      if (var0 != null && var1 != null) {
         var0 = method35777(var0, var1);
         return method35778(var0, var1);
      } else {
         return var0;
      }
   }

   public static String method35777(String var0, String var1) {
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

   public static String method35778(String var0, String var1) {
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
