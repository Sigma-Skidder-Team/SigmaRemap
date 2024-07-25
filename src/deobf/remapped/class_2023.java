package remapped;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Nullable;

public final class class_2023 {
   public String field_10257;
   public String field_10254 = "";
   public String field_10252 = "";
   public String field_10250;
   public int field_10253 = -1;
   public final List<String> field_10256 = new ArrayList<String>();
   public List<String> field_10251;
   public String field_10255;

   public class_2023() {
      this.field_10256.add("");
   }

   public class_2023 method_9419(String var1) {
      if (var1 != null) {
         if (!var1.equalsIgnoreCase("http")) {
            if (!var1.equalsIgnoreCase("https")) {
               throw new IllegalArgumentException("unexpected scheme: " + var1);
            }

            this.field_10257 = "https";
         } else {
            this.field_10257 = "http";
         }

         return this;
      } else {
         throw new NullPointerException("scheme == null");
      }
   }

   public class_2023 method_9404(String var1) {
      if (var1 != null) {
         this.field_10254 = class_1672.method_7475(var1, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
         return this;
      } else {
         throw new NullPointerException("username == null");
      }
   }

   public class_2023 method_9410(String var1) {
      if (var1 != null) {
         this.field_10254 = class_1672.method_7475(var1, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
         return this;
      } else {
         throw new NullPointerException("encodedUsername == null");
      }
   }

   public class_2023 method_9413(String var1) {
      if (var1 != null) {
         this.field_10252 = class_1672.method_7475(var1, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
         return this;
      } else {
         throw new NullPointerException("password == null");
      }
   }

   public class_2023 method_9415(String var1) {
      if (var1 != null) {
         this.field_10252 = class_1672.method_7475(var1, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
         return this;
      } else {
         throw new NullPointerException("encodedPassword == null");
      }
   }

   public class_2023 method_9428(String var1) {
      if (var1 != null) {
         String var4 = method_9424(var1, 0, var1.length());
         if (var4 != null) {
            this.field_10250 = var4;
            return this;
         } else {
            throw new IllegalArgumentException("unexpected host: " + var1);
         }
      } else {
         throw new NullPointerException("host == null");
      }
   }

   public class_2023 method_9426(int var1) {
      if (var1 > 0 && var1 <= 65535) {
         this.field_10253 = var1;
         return this;
      } else {
         throw new IllegalArgumentException("unexpected port: " + var1);
      }
   }

   public int method_9417() {
      return this.field_10253 == -1 ? class_1672.method_7471(this.field_10257) : this.field_10253;
   }

   public class_2023 method_9436(String var1) {
      if (var1 != null) {
         this.method_9402(var1, 0, var1.length(), false, false);
         return this;
      } else {
         throw new NullPointerException("pathSegment == null");
      }
   }

   public class_2023 method_9420(String var1) {
      if (var1 != null) {
         return this.method_9421(var1, false);
      } else {
         throw new NullPointerException("pathSegments == null");
      }
   }

   public class_2023 method_9418(String var1) {
      if (var1 != null) {
         this.method_9402(var1, 0, var1.length(), false, true);
         return this;
      } else {
         throw new NullPointerException("encodedPathSegment == null");
      }
   }

   public class_2023 method_9423(String var1) {
      if (var1 != null) {
         return this.method_9421(var1, true);
      } else {
         throw new NullPointerException("encodedPathSegments == null");
      }
   }

   private class_2023 method_9421(String var1, boolean var2) {
      int var5 = 0;

      do {
         int var6 = class_8515.method_39220(var1, var5, var1.length(), "/\\");
         boolean var7 = var6 < var1.length();
         this.method_9402(var1, var5, var6, var7, var2);
         var5 = var6 + 1;
      } while (var5 <= var1.length());

      return this;
   }

   public class_2023 method_9407(int var1, String var2) {
      if (var2 != null) {
         String var5 = class_1672.method_7474(var2, 0, var2.length(), " \"<>^`{}|/\\?#", false, false, false, true);
         if (!this.method_9411(var5) && !this.method_9401(var5)) {
            this.field_10256.set(var1, var5);
            return this;
         } else {
            throw new IllegalArgumentException("unexpected path segment: " + var2);
         }
      } else {
         throw new NullPointerException("pathSegment == null");
      }
   }

   public class_2023 method_9440(int var1, String var2) {
      if (var2 != null) {
         String var5 = class_1672.method_7474(var2, 0, var2.length(), " \"<>^`{}|/\\?#", true, false, false, true);
         this.field_10256.set(var1, var5);
         if (!this.method_9411(var5) && !this.method_9401(var5)) {
            return this;
         } else {
            throw new IllegalArgumentException("unexpected path segment: " + var2);
         }
      } else {
         throw new NullPointerException("encodedPathSegment == null");
      }
   }

   public class_2023 method_9432(int var1) {
      this.field_10256.remove(var1);
      if (this.field_10256.isEmpty()) {
         this.field_10256.add("");
      }

      return this;
   }

   public class_2023 method_9434(String var1) {
      if (var1 != null) {
         if (var1.startsWith("/")) {
            this.method_9435(var1, 0, var1.length());
            return this;
         } else {
            throw new IllegalArgumentException("unexpected encodedPath: " + var1);
         }
      } else {
         throw new NullPointerException("encodedPath == null");
      }
   }

   public class_2023 method_9433(String var1) {
      this.field_10251 = var1 == null ? null : class_1672.method_7452(class_1672.method_7475(var1, " \"'<>#", false, false, true, true));
      return this;
   }

   public class_2023 method_9425(String var1) {
      this.field_10251 = var1 == null ? null : class_1672.method_7452(class_1672.method_7475(var1, " \"'<>#", true, false, true, true));
      return this;
   }

   public class_2023 method_9408(String var1, String var2) {
      if (var1 != null) {
         if (this.field_10251 == null) {
            this.field_10251 = new ArrayList<String>();
         }

         this.field_10251.add(class_1672.method_7475(var1, " \"'<>#&=", false, false, true, true));
         this.field_10251.add(var2 == null ? null : class_1672.method_7475(var2, " \"'<>#&=", false, false, true, true));
         return this;
      } else {
         throw new NullPointerException("name == null");
      }
   }

   public class_2023 method_9405(String var1, String var2) {
      if (var1 != null) {
         if (this.field_10251 == null) {
            this.field_10251 = new ArrayList<String>();
         }

         this.field_10251.add(class_1672.method_7475(var1, " \"'<>#&=", true, false, true, true));
         this.field_10251.add(var2 == null ? null : class_1672.method_7475(var2, " \"'<>#&=", true, false, true, true));
         return this;
      } else {
         throw new NullPointerException("encodedName == null");
      }
   }

   public class_2023 method_9409(String var1, String var2) {
      this.method_9416(var1);
      this.method_9408(var1, var2);
      return this;
   }

   public class_2023 method_9438(String var1, String var2) {
      this.method_9437(var1);
      this.method_9405(var1, var2);
      return this;
   }

   public class_2023 method_9416(String var1) {
      if (var1 != null) {
         if (this.field_10251 != null) {
            String var4 = class_1672.method_7475(var1, " \"'<>#&=", false, false, true, true);
            this.method_9422(var4);
            return this;
         } else {
            return this;
         }
      } else {
         throw new NullPointerException("name == null");
      }
   }

   public class_2023 method_9437(String var1) {
      if (var1 != null) {
         if (this.field_10251 != null) {
            this.method_9422(class_1672.method_7475(var1, " \"'<>#&=", true, false, true, true));
            return this;
         } else {
            return this;
         }
      } else {
         throw new NullPointerException("encodedName == null");
      }
   }

   private void method_9422(String var1) {
      for (int var4 = this.field_10251.size() - 2; var4 >= 0; var4 -= 2) {
         if (var1.equals(this.field_10251.get(var4))) {
            this.field_10251.remove(var4 + 1);
            this.field_10251.remove(var4);
            if (this.field_10251.isEmpty()) {
               this.field_10251 = null;
               return;
            }
         }
      }
   }

   public class_2023 method_9414(String var1) {
      this.field_10255 = var1 == null ? null : class_1672.method_7475(var1, "", false, false, false, false);
      return this;
   }

   public class_2023 method_9399(String var1) {
      this.field_10255 = var1 == null ? null : class_1672.method_7475(var1, "", true, false, false, false);
      return this;
   }

   public class_2023 method_9441() {
      int var3 = 0;

      for (int var4 = this.field_10256.size(); var3 < var4; var3++) {
         String var5 = this.field_10256.get(var3);
         this.field_10256.set(var3, class_1672.method_7475(var5, "[]", true, true, false, true));
      }

      if (this.field_10251 != null) {
         var3 = 0;

         for (int var7 = this.field_10251.size(); var3 < var7; var3++) {
            String var8 = this.field_10251.get(var3);
            if (var8 != null) {
               this.field_10251.set(var3, class_1672.method_7475(var8, "\\^`{|}", true, true, true, true));
            }
         }
      }

      if (this.field_10255 != null) {
         this.field_10255 = class_1672.method_7475(this.field_10255, " \"#<>\\^`{|}", true, true, false, false);
      }

      return this;
   }

   public class_1672 method_9397() {
      if (this.field_10257 != null) {
         if (this.field_10250 != null) {
            return new class_1672(this);
         } else {
            throw new IllegalStateException("host == null");
         }
      } else {
         throw new IllegalStateException("scheme == null");
      }
   }

   @Override
   public String toString() {
      StringBuilder var3 = new StringBuilder();
      var3.append(this.field_10257);
      var3.append("://");
      if (!this.field_10254.isEmpty() || !this.field_10252.isEmpty()) {
         var3.append(this.field_10254);
         if (!this.field_10252.isEmpty()) {
            var3.append(':');
            var3.append(this.field_10252);
         }

         var3.append('@');
      }

      if (this.field_10250.indexOf(58) == -1) {
         var3.append(this.field_10250);
      } else {
         var3.append('[');
         var3.append(this.field_10250);
         var3.append(']');
      }

      int var4 = this.method_9417();
      if (var4 != class_1672.method_7471(this.field_10257)) {
         var3.append(':');
         var3.append(var4);
      }

      class_1672.method_7446(var3, this.field_10256);
      if (this.field_10251 != null) {
         var3.append('?');
         class_1672.method_7455(var3, this.field_10251);
      }

      if (this.field_10255 != null) {
         var3.append('#');
         var3.append(this.field_10255);
      }

      return var3.toString();
   }

   public class_5508 method_9406(class_1672 var1, String var2) {
      int var5 = class_8515.method_39206(var2, 0, var2.length());
      int var6 = class_8515.method_39216(var2, var5, var2.length());
      int var7 = method_9398(var2, var5, var6);
      if (var7 != -1) {
         if (var2.regionMatches(true, var5, "https:", 0, 6)) {
            this.field_10257 = "https";
            var5 += "https:".length();
         } else {
            if (!var2.regionMatches(true, var5, "http:", 0, 5)) {
               return class_5508.field_28049;
            }

            this.field_10257 = "http";
            var5 += "http:".length();
         }
      } else {
         if (var1 == null) {
            return class_5508.field_28051;
         }

         this.field_10257 = var1.field_8659;
      }

      boolean var8 = false;
      boolean var9 = false;
      int var10 = method_9400(var2, var5, var6);
      if (var10 < 2 && var1 != null && var1.field_8659.equals(this.field_10257)) {
         this.field_10254 = var1.method_7470();
         this.field_10252 = var1.method_7448();
         this.field_10250 = var1.field_8651;
         this.field_10253 = var1.field_8662;
         this.field_10256.clear();
         this.field_10256.addAll(var1.method_7483());
         if (var5 == var6 || var2.charAt(var5) == '#') {
            this.method_9425(var1.method_7487());
         }
      } else {
         var5 += var10;

         label91:
         while (true) {
            int var11 = class_8515.method_39220(var2, var5, var6, "@/\\?#");
            int var12 = var11 != var6 ? var2.charAt(var11) : -1;
            switch (var12) {
               case -1:
               case 35:
               case 47:
               case 63:
               case 92:
                  int var19 = method_9412(var2, var5, var11);
                  if (var19 + 1 < var11) {
                     this.field_10250 = method_9424(var2, var5, var19);
                     this.field_10253 = method_9439(var2, var19 + 1, var11);
                     if (this.field_10253 == -1) {
                        return class_5508.field_28053;
                     }
                  } else {
                     this.field_10250 = method_9424(var2, var5, var19);
                     this.field_10253 = class_1672.method_7471(this.field_10257);
                  }

                  if (this.field_10250 == null) {
                     return class_5508.field_28050;
                  }

                  var5 = var11;
                  break label91;
               case 64:
                  if (!var9) {
                     int var13 = class_8515.method_39219(var2, var5, var11, ':');
                     String var14 = class_1672.method_7474(var2, var5, var13, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
                     this.field_10254 = var8 ? this.field_10254 + "%40" + var14 : var14;
                     if (var13 != var11) {
                        var9 = true;
                        this.field_10252 = class_1672.method_7474(var2, var13 + 1, var11, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
                     }

                     var8 = true;
                  } else {
                     this.field_10252 = this.field_10252
                        + "%40"
                        + class_1672.method_7474(var2, var5, var11, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
                  }

                  var5 = var11 + 1;
            }
         }
      }

      int var17 = class_8515.method_39220(var2, var5, var6, "?#");
      this.method_9435(var2, var5, var17);
      var5 = var17;
      if (var17 < var6 && var2.charAt(var17) == '?') {
         int var18 = class_8515.method_39219(var2, var17, var6, '#');
         this.field_10251 = class_1672.method_7452(class_1672.method_7474(var2, var17 + 1, var18, " \"'<>#", true, false, true, true));
         var5 = var18;
      }

      if (var5 < var6 && var2.charAt(var5) == '#') {
         this.field_10255 = class_1672.method_7474(var2, var5 + 1, var6, "", true, false, false, false);
      }

      return class_5508.field_28055;
   }

   private void method_9435(String var1, int var2, int var3) {
      if (var2 != var3) {
         char var6 = var1.charAt(var2);
         if (var6 != '/' && var6 != '\\') {
            this.field_10256.set(this.field_10256.size() - 1, "");
         } else {
            this.field_10256.clear();
            this.field_10256.add("");
            var2++;
         }

         int var7 = var2;

         while (var7 < var3) {
            int var8 = class_8515.method_39220(var1, var7, var3, "/\\");
            boolean var9 = var8 < var3;
            this.method_9402(var1, var7, var8, var9, true);
            var7 = var8;
            if (var9) {
               var7 = var8 + 1;
            }
         }
      }
   }

   private void method_9402(String var1, int var2, int var3, boolean var4, boolean var5) {
      String var8 = class_1672.method_7474(var1, var2, var3, " \"<>^`{}|/\\?#", var5, false, false, true);
      if (!this.method_9411(var8)) {
         if (!this.method_9401(var8)) {
            if (!this.field_10256.get(this.field_10256.size() - 1).isEmpty()) {
               this.field_10256.add(var8);
            } else {
               this.field_10256.set(this.field_10256.size() - 1, var8);
            }

            if (var4) {
               this.field_10256.add("");
            }
         } else {
            this.method_9429();
         }
      }
   }

   private boolean method_9411(String var1) {
      return var1.equals(".") || var1.equalsIgnoreCase("%2e");
   }

   private boolean method_9401(String var1) {
      return var1.equals("..") || var1.equalsIgnoreCase("%2e.") || var1.equalsIgnoreCase(".%2e") || var1.equalsIgnoreCase("%2e%2e");
   }

   private void method_9429() {
      String var3 = this.field_10256.remove(this.field_10256.size() - 1);
      if (var3.isEmpty() && !this.field_10256.isEmpty()) {
         this.field_10256.set(this.field_10256.size() - 1, "");
      } else {
         this.field_10256.add("");
      }
   }

   private static int method_9398(String var0, int var1, int var2) {
      if (var2 - var1 < 2) {
         return -1;
      } else {
         char var5 = var0.charAt(var1);
         if (var5 >= 'a' && var5 <= 'z' || var5 >= 'A' && var5 <= 'Z') {
            for (int var6 = var1 + 1; var6 < var2; var6++) {
               char var7 = var0.charAt(var6);
               if ((var7 < 'a' || var7 > 'z') && (var7 < 'A' || var7 > 'Z') && (var7 < '0' || var7 > '9') && var7 != '+' && var7 != '-' && var7 != '.') {
                  if (var7 != ':') {
                     return -1;
                  }

                  return var6;
               }
            }

            return -1;
         } else {
            return -1;
         }
      }
   }

   private static int method_9400(String var0, int var1, int var2) {
      int var5 = 0;

      while (var1 < var2) {
         char var6 = var0.charAt(var1);
         if (var6 != '\\' && var6 != '/') {
            break;
         }

         var5++;
         var1++;
      }

      return var5;
   }

   private static int method_9412(String var0, int var1, int var2) {
      for (int var5 = var1; var5 < var2; var5++) {
         switch (var0.charAt(var5)) {
            case ':':
               return var5;
            case '[':
               while (true) {
                  var5++;
                  if (var5 >= var2 || var0.charAt(var5) == ']') {
                     break;
                  }
               }
         }
      }

      return var2;
   }

   private static String method_9424(String var0, int var1, int var2) {
      String var5 = class_1672.method_7460(var0, var1, var2, false);
      if (!var5.contains(":")) {
         return class_8515.method_39199(var5);
      } else {
         InetAddress var6 = var5.startsWith("[") && var5.endsWith("]") ? method_9403(var5, 1, var5.length() - 1) : method_9403(var5, 0, var5.length());
         if (var6 != null) {
            byte[] var7 = var6.getAddress();
            if (var7.length != 16) {
               throw new AssertionError();
            } else {
               return method_9427(var7);
            }
         } else {
            return null;
         }
      }
   }

   @Nullable
   private static InetAddress method_9403(String var0, int var1, int var2) {
      byte[] var5 = new byte[16];
      int var6 = 0;
      int var7 = -1;
      int var8 = -1;
      int var9 = var1;

      while (var9 < var2) {
         if (var6 == var5.length) {
            return null;
         }

         if (var9 + 2 <= var2 && var0.regionMatches(var9, "::", 0, 2)) {
            if (var7 != -1) {
               return null;
            }

            var9 += 2;
            var6 += 2;
            var7 = var6;
            if (var9 == var2) {
               break;
            }
         } else if (var6 != 0) {
            if (!var0.regionMatches(var9, ":", 0, 1)) {
               if (!var0.regionMatches(var9, ".", 0, 1)) {
                  return null;
               }

               if (!method_9430(var0, var8, var2, var5, var6 - 2)) {
                  return null;
               }

               var6 += 2;
               break;
            }

            var9++;
         }

         int var10 = 0;

         for (var8 = var9; var9 < var2; var9++) {
            char var11 = var0.charAt(var9);
            int var12 = class_1672.method_7491(var11);
            if (var12 == -1) {
               break;
            }

            var10 = (var10 << 4) + var12;
         }

         int var15 = var9 - var8;
         if (var15 == 0 || var15 > 4) {
            return null;
         }

         var5[var6++] = (byte)(var10 >>> 8 & 0xFF);
         var5[var6++] = (byte)(var10 & 0xFF);
      }

      if (var6 != var5.length) {
         if (var7 == -1) {
            return null;
         }

         System.arraycopy(var5, var7, var5, var5.length - (var6 - var7), var6 - var7);
         Arrays.fill(var5, var7, var7 + (var5.length - var6), (byte)0);
      }

      try {
         return InetAddress.getByAddress(var5);
      } catch (UnknownHostException var13) {
         throw new AssertionError();
      }
   }

   private static boolean method_9430(String var0, int var1, int var2, byte[] var3, int var4) {
      int var7 = var4;
      int var8 = var1;

      while (var8 < var2) {
         if (var7 == var3.length) {
            return false;
         }

         if (var7 != var4) {
            if (var0.charAt(var8) != '.') {
               return false;
            }

            var8++;
         }

         int var9 = 0;

         int var10;
         for (var10 = var8; var8 < var2; var8++) {
            char var11 = var0.charAt(var8);
            if (var11 < '0' || var11 > '9') {
               break;
            }

            if (var9 == 0 && var10 != var8) {
               return false;
            }

            var9 = var9 * 10 + var11 - 48;
            if (var9 > 255) {
               return false;
            }
         }

         int var12 = var8 - var10;
         if (var12 == 0) {
            return false;
         }

         var3[var7++] = (byte)var9;
      }

      return var7 == var4 + 4;
   }

   private static String method_9427(byte[] var0) {
      byte var3 = -1;
      int var4 = 0;

      for (byte var5 = 0; var5 < var0.length; var5 += 2) {
         byte var6 = var5;

         while (var5 < 16 && var0[var5] == 0 && var0[var5 + 1] == 0) {
            var5 += 2;
         }

         int var7 = var5 - var6;
         if (var7 > var4 && var7 >= 4) {
            var3 = var6;
            var4 = var7;
         }
      }

      class_7059 var8 = new class_7059();
      int var9 = 0;

      while (var9 < var0.length) {
         if (var9 != var3) {
            if (var9 > 0) {
               var8.method_32494(58);
            }

            int var10 = (var0[var9] & 255) << 8 | var0[var9 + 1] & 255;
            var8.method_32462((long)var10);
            var9 += 2;
         } else {
            var8.method_32494(58);
            var9 += var4;
            if (var9 == 16) {
               var8.method_32494(58);
            }
         }
      }

      return var8.method_36592();
   }

   private static int method_9439(String var0, int var1, int var2) {
      try {
         String var5 = class_1672.method_7474(var0, var1, var2, "", false, false, false, true);
         int var6 = Integer.parseInt(var5);
         return var6 > 0 && var6 <= 65535 ? var6 : -1;
      } catch (NumberFormatException var7) {
         return -1;
      }
   }
}
