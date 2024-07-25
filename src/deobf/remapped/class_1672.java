package remapped;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public final class class_1672 {
   private static final char[] field_8652 = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
   public static final String field_8668 = " \"':;<=>@[]^`{}|/\\?#";
   public static final String field_8661 = " \"':;<=>@[]^`{}|/\\?#";
   public static final String field_8649 = " \"<>^`{}|/\\?#";
   public static final String field_8667 = "[]";
   public static final String field_8666 = " \"'<>#";
   public static final String field_8663 = " \"'<>#&=";
   public static final String field_8656 = "\\^`{|}";
   public static final String field_8650 = " \"':;<=>@[]^`{}|/\\?#&!$(),~";
   public static final String field_8664 = "";
   public static final String field_8658 = " \"#<>\\^`{|}";
   public final String field_8659;
   private final String field_8669;
   private final String field_8655;
   public final String field_8651;
   public final int field_8662;
   private final List<String> field_8660;
   private final List<String> field_8657;
   private final String field_8665;
   private final String field_8654;

   public class_1672(class_2023 var1) {
      this.field_8659 = var1.field_10257;
      this.field_8669 = method_7461(var1.field_10254, false);
      this.field_8655 = method_7461(var1.field_10252, false);
      this.field_8651 = var1.field_10250;
      this.field_8662 = var1.method_9417();
      this.field_8660 = this.method_7462(var1.field_10256, false);
      this.field_8657 = var1.field_10251 == null ? null : this.method_7462(var1.field_10251, true);
      this.field_8665 = var1.field_10255 == null ? null : method_7461(var1.field_10255, false);
      this.field_8654 = var1.toString();
   }

   public URL method_7464() {
      try {
         return new URL(this.field_8654);
      } catch (MalformedURLException var4) {
         throw new RuntimeException(var4);
      }
   }

   public URI method_7478() {
      String var3 = this.method_7479().method_9441().toString();

      try {
         return new URI(var3);
      } catch (URISyntaxException var7) {
         try {
            String var5 = var3.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", "");
            return URI.create(var5);
         } catch (Exception var6) {
            throw new RuntimeException(var7);
         }
      }
   }

   public String method_7488() {
      return this.field_8659;
   }

   public boolean method_7485() {
      return this.field_8659.equals("https");
   }

   public String method_7470() {
      if (!this.field_8669.isEmpty()) {
         int var3 = this.field_8659.length() + 3;
         int var4 = class_8515.method_39220(this.field_8654, var3, this.field_8654.length(), ":@");
         return this.field_8654.substring(var3, var4);
      } else {
         return "";
      }
   }

   public String method_7458() {
      return this.field_8669;
   }

   public String method_7448() {
      if (!this.field_8655.isEmpty()) {
         int var3 = this.field_8654.indexOf(58, this.field_8659.length() + 3) + 1;
         int var4 = this.field_8654.indexOf(64);
         return this.field_8654.substring(var3, var4);
      } else {
         return "";
      }
   }

   public String method_7447() {
      return this.field_8655;
   }

   public String method_7449() {
      return this.field_8651;
   }

   public int method_7472() {
      return this.field_8662;
   }

   public static int method_7471(String var0) {
      if (!var0.equals("http")) {
         return !var0.equals("https") ? -1 : 443;
      } else {
         return 80;
      }
   }

   public int method_7473() {
      return this.field_8660.size();
   }

   public String method_7481() {
      int var3 = this.field_8654.indexOf(47, this.field_8659.length() + 3);
      int var4 = class_8515.method_39220(this.field_8654, var3, this.field_8654.length(), "?#");
      return this.field_8654.substring(var3, var4);
   }

   public static void method_7446(StringBuilder var0, List<String> var1) {
      int var4 = 0;

      for (int var5 = var1.size(); var4 < var5; var4++) {
         var0.append('/');
         var0.append((String)var1.get(var4));
      }
   }

   public List<String> method_7483() {
      int var3 = this.field_8654.indexOf(47, this.field_8659.length() + 3);
      int var4 = class_8515.method_39220(this.field_8654, var3, this.field_8654.length(), "?#");
      ArrayList var5 = new ArrayList();
      int var6 = var3;

      while (var6 < var4) {
         int var7 = class_8515.method_39219(this.field_8654, ++var6, var4, '/');
         var5.add(this.field_8654.substring(var6, var7));
         var6 = var7;
      }

      return var5;
   }

   public List<String> method_7468() {
      return this.field_8660;
   }

   @Nullable
   public String method_7487() {
      if (this.field_8657 != null) {
         int var3 = this.field_8654.indexOf(63) + 1;
         int var4 = class_8515.method_39219(this.field_8654, var3 + 1, this.field_8654.length(), '#');
         return this.field_8654.substring(var3, var4);
      } else {
         return null;
      }
   }

   public static void method_7455(StringBuilder var0, List<String> var1) {
      byte var4 = 0;

      for (int var5 = var1.size(); var4 < var5; var4 += 2) {
         String var6 = (String)var1.get(var4);
         String var7 = (String)var1.get(var4 + 1);
         if (var4 > 0) {
            var0.append('&');
         }

         var0.append(var6);
         if (var7 != null) {
            var0.append('=');
            var0.append(var7);
         }
      }
   }

   public static List<String> method_7452(String var0) {
      ArrayList var3 = new ArrayList();
      int var4 = 0;

      while (var4 <= var0.length()) {
         int var5 = var0.indexOf(38, var4);
         if (var5 == -1) {
            var5 = var0.length();
         }

         int var6 = var0.indexOf(61, var4);
         if (var6 != -1 && var6 <= var5) {
            var3.add(var0.substring(var4, var6));
            var3.add(var0.substring(var6 + 1, var5));
         } else {
            var3.add(var0.substring(var4, var5));
            var3.add(null);
         }

         var4 = var5 + 1;
      }

      return var3;
   }

   @Nullable
   public String method_7451() {
      if (this.field_8657 != null) {
         StringBuilder var3 = new StringBuilder();
         method_7455(var3, this.field_8657);
         return var3.toString();
      } else {
         return null;
      }
   }

   public int method_7467() {
      return this.field_8657 == null ? 0 : this.field_8657.size() / 2;
   }

   @Nullable
   public String method_7490(String var1) {
      if (this.field_8657 == null) {
         return null;
      } else {
         byte var4 = 0;

         for (int var5 = this.field_8657.size(); var4 < var5; var4 += 2) {
            if (var1.equals(this.field_8657.get(var4))) {
               return this.field_8657.get(var4 + 1);
            }
         }

         return null;
      }
   }

   public Set<String> method_7459() {
      if (this.field_8657 == null) {
         return Collections.<String>emptySet();
      } else {
         LinkedHashSet var3 = new LinkedHashSet();
         byte var4 = 0;

         for (int var5 = this.field_8657.size(); var4 < var5; var4 += 2) {
            var3.add(this.field_8657.get(var4));
         }

         return Collections.<String>unmodifiableSet(var3);
      }
   }

   public List<String> method_7454(String var1) {
      if (this.field_8657 != null) {
         ArrayList var4 = new ArrayList();
         byte var5 = 0;

         for (int var6 = this.field_8657.size(); var5 < var6; var5 += 2) {
            if (var1.equals(this.field_8657.get(var5))) {
               var4.add(this.field_8657.get(var5 + 1));
            }
         }

         return Collections.<String>unmodifiableList(var4);
      } else {
         return Collections.<String>emptyList();
      }
   }

   public String method_7489(int var1) {
      if (this.field_8657 != null) {
         return this.field_8657.get(var1 * 2);
      } else {
         throw new IndexOutOfBoundsException();
      }
   }

   public String method_7450(int var1) {
      if (this.field_8657 != null) {
         return this.field_8657.get(var1 * 2 + 1);
      } else {
         throw new IndexOutOfBoundsException();
      }
   }

   @Nullable
   public String method_7453() {
      if (this.field_8665 != null) {
         int var3 = this.field_8654.indexOf(35) + 1;
         return this.field_8654.substring(var3);
      } else {
         return null;
      }
   }

   @Nullable
   public String method_7477() {
      return this.field_8665;
   }

   public String method_7482() {
      return this.method_7480("/...").method_9404("").method_9413("").method_9397().toString();
   }

   @Nullable
   public class_1672 method_7465(String var1) {
      class_2023 var4 = this.method_7480(var1);
      return var4 == null ? null : var4.method_9397();
   }

   public class_2023 method_7479() {
      class_2023 var3 = new class_2023();
      var3.field_10257 = this.field_8659;
      var3.field_10254 = this.method_7470();
      var3.field_10252 = this.method_7448();
      var3.field_10250 = this.field_8651;
      var3.field_10253 = this.field_8662 == method_7471(this.field_8659) ? -1 : this.field_8662;
      var3.field_10256.clear();
      var3.field_10256.addAll(this.method_7483());
      var3.method_9425(this.method_7487());
      var3.field_10255 = this.method_7453();
      return var3;
   }

   @Nullable
   public class_2023 method_7480(String var1) {
      class_2023 var4 = new class_2023();
      class_5508 var5 = var4.method_9406(this, var1);
      return var5 != class_5508.field_28055 ? null : var4;
   }

   @Nullable
   public static class_1672 method_7484(String var0) {
      class_2023 var3 = new class_2023();
      class_5508 var4 = var3.method_9406(null, var0);
      return var4 != class_5508.field_28055 ? null : var3.method_9397();
   }

   @Nullable
   public static class_1672 method_7457(URL var0) {
      return method_7484(var0.toString());
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static class_1672 method_7469(String var0) throws MalformedURLException, UnknownHostException {
      class_2023 var3 = new class_2023();
      class_5508 var4 = var3.method_9406(null, var0);
      switch (var4) {
         case field_28055:
            return var3.method_9397();
         case field_28050:
            throw new UnknownHostException("Invalid host: " + var0);
         case field_28049:
         case field_28051:
         case field_28053:
         default:
            throw new MalformedURLException("Invalid URL: " + var4 + " for " + var0);
      }
   }

   @Nullable
   public static class_1672 method_7456(URI var0) {
      return method_7484(var0.toString());
   }

   @Override
   public boolean equals(Object var1) {
      return var1 instanceof class_1672 && ((class_1672)var1).field_8654.equals(this.field_8654);
   }

   @Override
   public int hashCode() {
      return this.field_8654.hashCode();
   }

   @Override
   public String toString() {
      return this.field_8654;
   }

   @Nullable
   public String method_7486() {
      return !class_8515.method_39204(this.field_8651) ? class_3339.method_15322().method_15319(this.field_8651) : null;
   }

   public static String method_7461(String var0, boolean var1) {
      return method_7460(var0, 0, var0.length(), var1);
   }

   private List<String> method_7462(List<String> var1, boolean var2) {
      int var5 = var1.size();
      ArrayList var6 = new ArrayList(var5);

      for (int var7 = 0; var7 < var5; var7++) {
         String var8 = (String)var1.get(var7);
         var6.add(var8 == null ? null : method_7461(var8, var2));
      }

      return Collections.<String>unmodifiableList(var6);
   }

   public static String method_7460(String var0, int var1, int var2, boolean var3) {
      for (int var6 = var1; var6 < var2; var6++) {
         char var7 = var0.charAt(var6);
         if (var7 == '%' || var7 == '+' && var3) {
            class_7059 var8 = new class_7059();
            var8.method_32492(var0, var1, var6);
            method_7463(var8, var0, var6, var2, var3);
            return var8.method_36592();
         }
      }

      return var0.substring(var1, var2);
   }

   public static void method_7463(class_7059 var0, String var1, int var2, int var3, boolean var4) {
      int var7 = var2;

      while (var7 < var3) {
         int var8;
         label45: {
            var8 = var1.codePointAt(var7);
            if (var8 == 37 && var7 + 2 < var3) {
               int var9 = method_7491(var1.charAt(var7 + 1));
               int var10 = method_7491(var1.charAt(var7 + 2));
               if (var9 != -1 && var10 != -1) {
                  var0.method_32494((var9 << 4) + var10);
                  var7 += 2;
                  break label45;
               }
            } else if (var8 == 43 && var4) {
               var0.method_32494(32);
               break label45;
            }

            var0.method_32483(var8);
         }

         var7 += Character.charCount(var8);
      }
   }

   public static boolean method_7466(String var0, int var1, int var2) {
      return var1 + 2 < var2 && var0.charAt(var1) == '%' && method_7491(var0.charAt(var1 + 1)) != -1 && method_7491(var0.charAt(var1 + 2)) != -1;
   }

   public static int method_7491(char var0) {
      if (var0 >= '0' && var0 <= '9') {
         return var0 - 48;
      } else if (var0 >= 'a' && var0 <= 'f') {
         return var0 - 97 + 10;
      } else {
         return var0 >= 65 && var0 <= 70 ? var0 - 65 + 10 : -1;
      }
   }

   public static String method_7474(String var0, int var1, int var2, String var3, boolean var4, boolean var5, boolean var6, boolean var7) {
      int var10 = var1;

      while (var10 < var2) {
         int var11 = var0.codePointAt(var10);
         if (var11 < 32
            || var11 == 127
            || var11 >= 128 && var7
            || var3.indexOf(var11) != -1
            || var11 == 37 && (!var4 || var5 && !method_7466(var0, var10, var2))
            || var11 == 43 && var6) {
            class_7059 var12 = new class_7059();
            var12.method_32492(var0, var1, var10);
            method_7476(var12, var0, var10, var2, var3, var4, var5, var6, var7);
            return var12.method_36592();
         }

         var10 += Character.charCount(var11);
      }

      return var0.substring(var1, var2);
   }

   public static void method_7476(class_7059 var0, String var1, int var2, int var3, String var4, boolean var5, boolean var6, boolean var7, boolean var8) {
      class_7059 var11 = null;
      int var12 = var2;

      while (var12 < var3) {
         int var13 = var1.codePointAt(var12);
         if (!var5 || var13 != 9 && var13 != 10 && var13 != 12 && var13 != 13) {
            if (var13 == 43 && var7) {
               var0.method_32491(!var5 ? "%2B" : "+");
            } else if (var13 < 32
               || var13 == 127
               || var13 >= 128 && var8
               || var4.indexOf(var13) != -1
               || var13 == 37 && (!var5 || var6 && !method_7466(var1, var12, var3))) {
               if (var11 == null) {
                  var11 = new class_7059();
               }

               var11.method_32483(var13);

               while (!var11.method_36605()) {
                  int var14 = var11.method_36602() & 255;
                  var0.method_32494(37);
                  var0.method_32494(field_8652[var14 >> 4 & 15]);
                  var0.method_32494(field_8652[var14 & 15]);
               }
            } else {
               var0.method_32483(var13);
            }
         }

         var12 += Character.charCount(var13);
      }
   }

   public static String method_7475(String var0, String var1, boolean var2, boolean var3, boolean var4, boolean var5) {
      return method_7474(var0, 0, var0.length(), var1, var2, var3, var4, var5);
   }
}
