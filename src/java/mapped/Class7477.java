package mapped;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Nullable;

public final class Class7477 {
   public String field32127;
   public String field32128 = "";
   public String field32129 = "";
   public String field32130;
   public int field32131 = -1;
   public final List<String> field32132 = new ArrayList<String>();
   public List<String> field32133;
   public String field32134;

   public Class7477() {
      this.field32132.add("");
   }

   public Class7477 method24232(String var1) {
      if (var1 != null) {
         if (!var1.equalsIgnoreCase("http")) {
            if (!var1.equalsIgnoreCase("https")) {
               throw new IllegalArgumentException("unexpected scheme: " + var1);
            }

            this.field32127 = "https";
         } else {
            this.field32127 = "http";
         }

         return this;
      } else {
         throw new NullPointerException("scheme == null");
      }
   }

   public Class7477 method24233(String var1) {
      if (var1 != null) {
         this.field32128 = Class7284.method22979(var1, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
         return this;
      } else {
         throw new NullPointerException("username == null");
      }
   }

   public Class7477 method24234(String var1) {
      if (var1 != null) {
         this.field32128 = Class7284.method22979(var1, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
         return this;
      } else {
         throw new NullPointerException("encodedUsername == null");
      }
   }

   public Class7477 method24235(String var1) {
      if (var1 != null) {
         this.field32129 = Class7284.method22979(var1, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
         return this;
      } else {
         throw new NullPointerException("password == null");
      }
   }

   public Class7477 method24236(String var1) {
      if (var1 != null) {
         this.field32129 = Class7284.method22979(var1, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
         return this;
      } else {
         throw new NullPointerException("encodedPassword == null");
      }
   }

   public Class7477 method24237(String var1) {
      if (var1 != null) {
         String var4 = method24271(var1, 0, var1.length());
         if (var4 != null) {
            this.field32130 = var4;
            return this;
         } else {
            throw new IllegalArgumentException("unexpected host: " + var1);
         }
      } else {
         throw new NullPointerException("host == null");
      }
   }

   public Class7477 method24238(int var1) {
      if (var1 > 0 && var1 <= 65535) {
         this.field32131 = var1;
         return this;
      } else {
         throw new IllegalArgumentException("unexpected port: " + var1);
      }
   }

   public int method24239() {
      return this.field32131 == -1 ? Class7284.method22944(this.field32127) : this.field32131;
   }

   public Class7477 method24240(String var1) {
      if (var1 != null) {
         this.method24264(var1, 0, var1.length(), false, false);
         return this;
      } else {
         throw new NullPointerException("pathSegment == null");
      }
   }

   public Class7477 method24241(String var1) {
      if (var1 != null) {
         return this.method24244(var1, false);
      } else {
         throw new NullPointerException("pathSegments == null");
      }
   }

   public Class7477 method24242(String var1) {
      if (var1 != null) {
         this.method24264(var1, 0, var1.length(), false, true);
         return this;
      } else {
         throw new NullPointerException("encodedPathSegment == null");
      }
   }

   public Class7477 method24243(String var1) {
      if (var1 != null) {
         return this.method24244(var1, true);
      } else {
         throw new NullPointerException("encodedPathSegments == null");
      }
   }

   private Class7477 method24244(String var1, boolean var2) {
      int var5 = 0;

      do {
         int var6 = Class9474.method36553(var1, var5, var1.length(), "/\\");
         boolean var7 = var6 < var1.length();
         this.method24264(var1, var5, var6, var7, var2);
         var5 = var6 + 1;
      } while (var5 <= var1.length());

      return this;
   }

   public Class7477 method24245(int var1, String var2) {
      if (var2 != null) {
         String var5 = Class7284.method22977(var2, 0, var2.length(), " \"<>^`{}|/\\?#", false, false, false, true);
         if (!this.method24265(var5) && !this.method24266(var5)) {
            this.field32132.set(var1, var5);
            return this;
         } else {
            throw new IllegalArgumentException("unexpected path segment: " + var2);
         }
      } else {
         throw new NullPointerException("pathSegment == null");
      }
   }

   public Class7477 method24246(int var1, String var2) {
      if (var2 != null) {
         String var5 = Class7284.method22977(var2, 0, var2.length(), " \"<>^`{}|/\\?#", true, false, false, true);
         this.field32132.set(var1, var5);
         if (!this.method24265(var5) && !this.method24266(var5)) {
            return this;
         } else {
            throw new IllegalArgumentException("unexpected path segment: " + var2);
         }
      } else {
         throw new NullPointerException("encodedPathSegment == null");
      }
   }

   public Class7477 method24247(int var1) {
      this.field32132.remove(var1);
      if (this.field32132.isEmpty()) {
         this.field32132.add("");
      }

      return this;
   }

   public Class7477 method24248(String var1) {
      if (var1 != null) {
         if (var1.startsWith("/")) {
            this.method24263(var1, 0, var1.length());
            return this;
         } else {
            throw new IllegalArgumentException("unexpected encodedPath: " + var1);
         }
      } else {
         throw new NullPointerException("encodedPath == null");
      }
   }

   public Class7477 method24249(String var1) {
      this.field32133 = var1 == null ? null : Class7284.method22952(Class7284.method22979(var1, " \"'<>#", false, false, true, true));
      return this;
   }

   public Class7477 method24250(String var1) {
      this.field32133 = var1 == null ? null : Class7284.method22952(Class7284.method22979(var1, " \"'<>#", true, false, true, true));
      return this;
   }

   public Class7477 method24251(String var1, String var2) {
      if (var1 != null) {
         if (this.field32133 == null) {
            this.field32133 = new ArrayList<String>();
         }

         this.field32133.add(Class7284.method22979(var1, " \"'<>#&=", false, false, true, true));
         this.field32133.add(var2 == null ? null : Class7284.method22979(var2, " \"'<>#&=", false, false, true, true));
         return this;
      } else {
         throw new NullPointerException("name == null");
      }
   }

   public Class7477 method24252(String var1, String var2) {
      if (var1 != null) {
         if (this.field32133 == null) {
            this.field32133 = new ArrayList<String>();
         }

         this.field32133.add(Class7284.method22979(var1, " \"'<>#&=", true, false, true, true));
         this.field32133.add(var2 == null ? null : Class7284.method22979(var2, " \"'<>#&=", true, false, true, true));
         return this;
      } else {
         throw new NullPointerException("encodedName == null");
      }
   }

   public Class7477 method24253(String var1, String var2) {
      this.method24255(var1);
      this.method24251(var1, var2);
      return this;
   }

   public Class7477 method24254(String var1, String var2) {
      this.method24256(var1);
      this.method24252(var1, var2);
      return this;
   }

   public Class7477 method24255(String var1) {
      if (var1 != null) {
         if (this.field32133 != null) {
            String var4 = Class7284.method22979(var1, " \"'<>#&=", false, false, true, true);
            this.method24257(var4);
            return this;
         } else {
            return this;
         }
      } else {
         throw new NullPointerException("name == null");
      }
   }

   public Class7477 method24256(String var1) {
      if (var1 != null) {
         if (this.field32133 != null) {
            this.method24257(Class7284.method22979(var1, " \"'<>#&=", true, false, true, true));
            return this;
         } else {
            return this;
         }
      } else {
         throw new NullPointerException("encodedName == null");
      }
   }

   private void method24257(String var1) {
      for (int var4 = this.field32133.size() - 2; var4 >= 0; var4 -= 2) {
         if (var1.equals(this.field32133.get(var4))) {
            this.field32133.remove(var4 + 1);
            this.field32133.remove(var4);
            if (this.field32133.isEmpty()) {
               this.field32133 = null;
               return;
            }
         }
      }
   }

   public Class7477 method24258(String var1) {
      this.field32134 = var1 == null ? null : Class7284.method22979(var1, "", false, false, false, false);
      return this;
   }

   public Class7477 method24259(String var1) {
      this.field32134 = var1 == null ? null : Class7284.method22979(var1, "", true, false, false, false);
      return this;
   }

   public Class7477 method24260() {
      int var3 = 0;

      for (int var4 = this.field32132.size(); var3 < var4; var3++) {
         String var5 = this.field32132.get(var3);
         this.field32132.set(var3, Class7284.method22979(var5, "[]", true, true, false, true));
      }

      if (this.field32133 != null) {
         var3 = 0;

         for (int var7 = this.field32133.size(); var3 < var7; var3++) {
            String var8 = this.field32133.get(var3);
            if (var8 != null) {
               this.field32133.set(var3, Class7284.method22979(var8, "\\^`{|}", true, true, true, true));
            }
         }
      }

      if (this.field32134 != null) {
         this.field32134 = Class7284.method22979(this.field32134, " \"#<>\\^`{|}", true, true, false, false);
      }

      return this;
   }

   public Class7284 method24261() {
      if (this.field32127 != null) {
         if (this.field32130 != null) {
            return new Class7284(this);
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
      var3.append(this.field32127);
      var3.append("://");
      if (!this.field32128.isEmpty() || !this.field32129.isEmpty()) {
         var3.append(this.field32128);
         if (!this.field32129.isEmpty()) {
            var3.append(':');
            var3.append(this.field32129);
         }

         var3.append('@');
      }

      if (this.field32130.indexOf(58) == -1) {
         var3.append(this.field32130);
      } else {
         var3.append('[');
         var3.append(this.field32130);
         var3.append(']');
      }

      int var4 = this.method24239();
      if (var4 != Class7284.method22944(this.field32127)) {
         var3.append(':');
         var3.append(var4);
      }

      Class7284.method22947(var3, this.field32132);
      if (this.field32133 != null) {
         var3.append('?');
         Class7284.method22951(var3, this.field32133);
      }

      if (this.field32134 != null) {
         var3.append('#');
         var3.append(this.field32134);
      }

      return var3.toString();
   }

   public Class2333 method24262(Class7284 var1, String var2) {
      int var5 = Class9474.method36550(var2, 0, var2.length());
      int var6 = Class9474.method36551(var2, var5, var2.length());
      int var7 = method24268(var2, var5, var6);
      if (var7 != -1) {
         if (var2.regionMatches(true, var5, "https:", 0, 6)) {
            this.field32127 = "https";
            var5 += "https:".length();
         } else {
            if (!var2.regionMatches(true, var5, "http:", 0, 5)) {
               return Class2333.field15957;
            }

            this.field32127 = "http";
            var5 += "http:".length();
         }
      } else {
         if (var1 == null) {
            return Class2333.field15956;
         }

         this.field32127 = var1.field31249;
      }

      boolean var8 = false;
      boolean var9 = false;
      int var10 = method24269(var2, var5, var6);
      if (var10 < 2 && var1 != null && var1.field31249.equals(this.field32127)) {
         this.field32128 = var1.method22938();
         this.field32129 = var1.method22940();
         this.field32130 = var1.field31252;
         this.field32131 = var1.field31253;
         this.field32132.clear();
         this.field32132.addAll(var1.method22948());
         if (var5 == var6 || var2.charAt(var5) == '#') {
            this.method24250(var1.method22950());
         }
      } else {
         var5 += var10;

         label91:
         while (true) {
            int var11 = Class9474.method36553(var2, var5, var6, "@/\\?#");
            int var12 = var11 != var6 ? var2.charAt(var11) : -1;
            switch (var12) {
               case -1:
               case 35:
               case 47:
               case 63:
               case 92:
                  int var19 = method24270(var2, var5, var11);
                  if (var19 + 1 < var11) {
                     this.field32130 = method24271(var2, var5, var19);
                     this.field32131 = method24275(var2, var19 + 1, var11);
                     if (this.field32131 == -1) {
                        return Class2333.field15958;
                     }
                  } else {
                     this.field32130 = method24271(var2, var5, var19);
                     this.field32131 = Class7284.method22944(this.field32127);
                  }

                  if (this.field32130 == null) {
                     return Class2333.field15959;
                  }

                  var5 = var11;
                  break label91;
               case 64:
                  if (!var9) {
                     int var13 = Class9474.method36554(var2, var5, var11, ':');
                     String var14 = Class7284.method22977(var2, var5, var13, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
                     this.field32128 = var8 ? this.field32128 + "%40" + var14 : var14;
                     if (var13 != var11) {
                        var9 = true;
                        this.field32129 = Class7284.method22977(var2, var13 + 1, var11, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
                     }

                     var8 = true;
                  } else {
                     this.field32129 = this.field32129 + "%40" + Class7284.method22977(var2, var5, var11, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
                  }

                  var5 = var11 + 1;
            }
         }
      }

      int var17 = Class9474.method36553(var2, var5, var6, "?#");
      this.method24263(var2, var5, var17);
      var5 = var17;
      if (var17 < var6 && var2.charAt(var17) == '?') {
         int var18 = Class9474.method36554(var2, var17, var6, '#');
         this.field32133 = Class7284.method22952(Class7284.method22977(var2, var17 + 1, var18, " \"'<>#", true, false, true, true));
         var5 = var18;
      }

      if (var5 < var6 && var2.charAt(var5) == '#') {
         this.field32134 = Class7284.method22977(var2, var5 + 1, var6, "", true, false, false, false);
      }

      return Class2333.field15955;
   }

   private void method24263(String var1, int var2, int var3) {
      if (var2 != var3) {
         char var6 = var1.charAt(var2);
         if (var6 != '/' && var6 != '\\') {
            this.field32132.set(this.field32132.size() - 1, "");
         } else {
            this.field32132.clear();
            this.field32132.add("");
            var2++;
         }

         int var7 = var2;

         while (var7 < var3) {
            int var8 = Class9474.method36553(var1, var7, var3, "/\\");
            boolean var9 = var8 < var3;
            this.method24264(var1, var7, var8, var9, true);
            var7 = var8;
            if (var9) {
               var7 = var8 + 1;
            }
         }
      }
   }

   private void method24264(String var1, int var2, int var3, boolean var4, boolean var5) {
      String var8 = Class7284.method22977(var1, var2, var3, " \"<>^`{}|/\\?#", var5, false, false, true);
      if (!this.method24265(var8)) {
         if (!this.method24266(var8)) {
            if (!this.field32132.get(this.field32132.size() - 1).isEmpty()) {
               this.field32132.add(var8);
            } else {
               this.field32132.set(this.field32132.size() - 1, var8);
            }

            if (var4) {
               this.field32132.add("");
            }
         } else {
            this.method24267();
         }
      }
   }

   private boolean method24265(String var1) {
      return var1.equals(".") || var1.equalsIgnoreCase("%2e");
   }

   private boolean method24266(String var1) {
      return var1.equals("..") || var1.equalsIgnoreCase("%2e.") || var1.equalsIgnoreCase(".%2e") || var1.equalsIgnoreCase("%2e%2e");
   }

   private void method24267() {
      String var3 = this.field32132.remove(this.field32132.size() - 1);
      if (var3.isEmpty() && !this.field32132.isEmpty()) {
         this.field32132.set(this.field32132.size() - 1, "");
      } else {
         this.field32132.add("");
      }
   }

   private static int method24268(String var0, int var1, int var2) {
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

   private static int method24269(String var0, int var1, int var2) {
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

   private static int method24270(String var0, int var1, int var2) {
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

   private static String method24271(String var0, int var1, int var2) {
      String var5 = Class7284.method22973(var0, var1, var2, false);
      if (!var5.contains(":")) {
         return Class9474.method36555(var5);
      } else {
         InetAddress var6 = var5.startsWith("[") && var5.endsWith("]") ? method24272(var5, 1, var5.length() - 1) : method24272(var5, 0, var5.length());
         if (var6 != null) {
            byte[] var7 = var6.getAddress();
            if (var7.length != 16) {
               throw new AssertionError();
            } else {
               return method24274(var7);
            }
         } else {
            return null;
         }
      }
   }

   @Nullable
   private static InetAddress method24272(String var0, int var1, int var2) {
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

               if (!method24273(var0, var8, var2, var5, var6 - 2)) {
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
            int var12 = Class7284.method22976(var11);
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

   private static boolean method24273(String var0, int var1, int var2, byte[] var3, int var4) {
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

   private static String method24274(byte[] var0) {
      int var3 = -1;
      int var4 = 0;

      for (int var5 = 0; var5 < var0.length; var5 += 2) {
         int var6 = var5;

         while (var5 < 16 && var0[var5] == 0 && var0[var5 + 1] == 0) {
            var5 += 2;
         }

         int var7 = var5 - var6;
         if (var7 > var4 && var7 >= 4) {
            var3 = var6;
            var4 = var7;
         }
      }

      Class1734 var8 = new Class1734();
      int var9 = 0;

      while (var9 < var0.length) {
         if (var9 != var3) {
            if (var9 > 0) {
               var8.method7570(58);
            }

            int var10 = (var0[var9] & 255) << 8 | var0[var9 + 1] & 255;
            var8.method7578((long)var10);
            var9 += 2;
         } else {
            var8.method7570(58);
            var9 += var4;
            if (var9 == 16) {
               var8.method7570(58);
            }
         }
      }

      return var8.method7612();
   }

   private static int method24275(String var0, int var1, int var2) {
      try {
         String var5 = Class7284.method22977(var0, var1, var2, "", false, false, false, true);
         int var6 = Integer.parseInt(var5);
         return var6 > 0 && var6 <= 65535 ? var6 : -1;
      } catch (NumberFormatException var7) {
         return -1;
      }
   }
}
