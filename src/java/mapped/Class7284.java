package mapped;

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

public final class Class7284 {
   private static final char[] field31238 = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
   public static final String field31239 = " \"':;<=>@[]^`{}|/\\?#";
   public static final String field31240 = " \"':;<=>@[]^`{}|/\\?#";
   public static final String field31241 = " \"<>^`{}|/\\?#";
   public static final String field31242 = "[]";
   public static final String field31243 = " \"'<>#";
   public static final String field31244 = " \"'<>#&=";
   public static final String field31245 = "\\^`{|}";
   public static final String field31246 = " \"':;<=>@[]^`{}|/\\?#&!$(),~";
   public static final String field31247 = "";
   public static final String field31248 = " \"#<>\\^`{|}";
   public final String field31249;
   private final String field31250;
   private final String field31251;
   public final String field31252;
   public final int field31253;
   private final List<String> field31254;
   private final List<String> field31255;
   private final String field31256;
   private final String field31257;

   public Class7284(Class7477 var1) {
      this.field31249 = var1.field32127;
      this.field31250 = method22971(var1.field32128, false);
      this.field31251 = method22971(var1.field32129, false);
      this.field31252 = var1.field32130;
      this.field31253 = var1.method24239();
      this.field31254 = this.method22972(var1.field32132, false);
      this.field31255 = var1.field32133 == null ? null : this.method22972(var1.field32133, true);
      this.field31256 = var1.field32134 == null ? null : method22971(var1.field32134, false);
      this.field31257 = var1.toString();
   }

   public URL method22934() {
      try {
         return new URL(this.field31257);
      } catch (MalformedURLException var4) {
         throw new RuntimeException(var4);
      }
   }

   public URI method22935() {
      String var3 = this.method22964().method24260().toString();

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

   public String method22936() {
      return this.field31249;
   }

   public boolean method22937() {
      return this.field31249.equals("https");
   }

   public String method22938() {
      if (!this.field31250.isEmpty()) {
         int var3 = this.field31249.length() + 3;
         int var4 = Class9474.method36553(this.field31257, var3, this.field31257.length(), ":@");
         return this.field31257.substring(var3, var4);
      } else {
         return "";
      }
   }

   public String method22939() {
      return this.field31250;
   }

   public String method22940() {
      if (!this.field31251.isEmpty()) {
         int var3 = this.field31257.indexOf(58, this.field31249.length() + 3) + 1;
         int var4 = this.field31257.indexOf(64);
         return this.field31257.substring(var3, var4);
      } else {
         return "";
      }
   }

   public String method22941() {
      return this.field31251;
   }

   public String method22942() {
      return this.field31252;
   }

   public int method22943() {
      return this.field31253;
   }

   public static int method22944(String var0) {
      if (!var0.equals("http")) {
         return !var0.equals("https") ? -1 : 443;
      } else {
         return 80;
      }
   }

   public int method22945() {
      return this.field31254.size();
   }

   public String method22946() {
      int var3 = this.field31257.indexOf(47, this.field31249.length() + 3);
      int var4 = Class9474.method36553(this.field31257, var3, this.field31257.length(), "?#");
      return this.field31257.substring(var3, var4);
   }

   public static void method22947(StringBuilder var0, List<String> var1) {
      int var4 = 0;

      for (int var5 = var1.size(); var4 < var5; var4++) {
         var0.append('/');
         var0.append((String)var1.get(var4));
      }
   }

   public List<String> method22948() {
      int var3 = this.field31257.indexOf(47, this.field31249.length() + 3);
      int var4 = Class9474.method36553(this.field31257, var3, this.field31257.length(), "?#");
      ArrayList var5 = new ArrayList();
      int var6 = var3;

      while (var6 < var4) {
         int var7 = Class9474.method36554(this.field31257, ++var6, var4, '/');
         var5.add(this.field31257.substring(var6, var7));
         var6 = var7;
      }

      return var5;
   }

   public List<String> method22949() {
      return this.field31254;
   }

   @Nullable
   public String method22950() {
      if (this.field31255 != null) {
         int var3 = this.field31257.indexOf(63) + 1;
         int var4 = Class9474.method36554(this.field31257, var3 + 1, this.field31257.length(), '#');
         return this.field31257.substring(var3, var4);
      } else {
         return null;
      }
   }

   public static void method22951(StringBuilder var0, List<String> var1) {
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

   public static List<String> method22952(String var0) {
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
   public String method22953() {
      if (this.field31255 != null) {
         StringBuilder var3 = new StringBuilder();
         method22951(var3, this.field31255);
         return var3.toString();
      } else {
         return null;
      }
   }

   public int method22954() {
      return this.field31255 == null ? 0 : this.field31255.size() / 2;
   }

   @Nullable
   public String method22955(String var1) {
      if (this.field31255 == null) {
         return null;
      } else {
         byte var4 = 0;

         for (int var5 = this.field31255.size(); var4 < var5; var4 += 2) {
            if (var1.equals(this.field31255.get(var4))) {
               return this.field31255.get(var4 + 1);
            }
         }

         return null;
      }
   }

   public Set<String> method22956() {
      if (this.field31255 == null) {
         return Collections.<String>emptySet();
      } else {
         LinkedHashSet var3 = new LinkedHashSet();
         byte var4 = 0;

         for (int var5 = this.field31255.size(); var4 < var5; var4 += 2) {
            var3.add(this.field31255.get(var4));
         }

         return Collections.<String>unmodifiableSet(var3);
      }
   }

   public List<String> method22957(String var1) {
      if (this.field31255 != null) {
         ArrayList var4 = new ArrayList();
         byte var5 = 0;

         for (int var6 = this.field31255.size(); var5 < var6; var5 += 2) {
            if (var1.equals(this.field31255.get(var5))) {
               var4.add(this.field31255.get(var5 + 1));
            }
         }

         return Collections.<String>unmodifiableList(var4);
      } else {
         return Collections.<String>emptyList();
      }
   }

   public String method22958(int var1) {
      if (this.field31255 != null) {
         return this.field31255.get(var1 * 2);
      } else {
         throw new IndexOutOfBoundsException();
      }
   }

   public String method22959(int var1) {
      if (this.field31255 != null) {
         return this.field31255.get(var1 * 2 + 1);
      } else {
         throw new IndexOutOfBoundsException();
      }
   }

   @Nullable
   public String method22960() {
      if (this.field31256 != null) {
         int var3 = this.field31257.indexOf(35) + 1;
         return this.field31257.substring(var3);
      } else {
         return null;
      }
   }

   @Nullable
   public String method22961() {
      return this.field31256;
   }

   public String method22962() {
      return this.method22965("/...").method24233("").method24235("").method24261().toString();
   }

   @Nullable
   public Class7284 method22963(String var1) {
      Class7477 var4 = this.method22965(var1);
      return var4 == null ? null : var4.method24261();
   }

   public Class7477 method22964() {
      Class7477 var3 = new Class7477();
      var3.field32127 = this.field31249;
      var3.field32128 = this.method22938();
      var3.field32129 = this.method22940();
      var3.field32130 = this.field31252;
      var3.field32131 = this.field31253 == method22944(this.field31249) ? -1 : this.field31253;
      var3.field32132.clear();
      var3.field32132.addAll(this.method22948());
      var3.method24250(this.method22950());
      var3.field32134 = this.method22960();
      return var3;
   }

   @Nullable
   public Class7477 method22965(String var1) {
      Class7477 var4 = new Class7477();
      Class2333 var5 = var4.method24262(this, var1);
      return var5 != Class2333.field15955 ? null : var4;
   }

   @Nullable
   public static Class7284 method22966(String var0) {
      Class7477 var3 = new Class7477();
      Class2333 var4 = var3.method24262(null, var0);
      return var4 != Class2333.field15955 ? null : var3.method24261();
   }

   @Nullable
   public static Class7284 method22967(URL var0) {
      return method22966(var0.toString());
   }

   public static Class7284 method22968(String var0) throws MalformedURLException, UnknownHostException {
      Class7477 var3 = new Class7477();
      Class2333 var4 = var3.method24262(null, var0);
      switch (Class5433.field24175[var4.ordinal()]) {
         case 1:
            return var3.method24261();
         case 2:
            throw new UnknownHostException("Invalid host: " + var0);
         case 3:
         case 4:
         case 5:
         default:
            throw new MalformedURLException("Invalid URL: " + var4 + " for " + var0);
      }
   }

   @Nullable
   public static Class7284 method22969(URI var0) {
      return method22966(var0.toString());
   }

   @Override
   public boolean equals(Object var1) {
      return var1 instanceof Class7284 && ((Class7284)var1).field31257.equals(this.field31257);
   }

   @Override
   public int hashCode() {
      return this.field31257.hashCode();
   }

   @Override
   public String toString() {
      return this.field31257;
   }

   public static String method22971(String var0, boolean var1) {
      return method22973(var0, 0, var0.length(), var1);
   }

   private List<String> method22972(List<String> var1, boolean var2) {
      int var5 = var1.size();
      ArrayList var6 = new ArrayList(var5);

      for (int var7 = 0; var7 < var5; var7++) {
         String var8 = (String)var1.get(var7);
         var6.add(var8 == null ? null : method22971(var8, var2));
      }

      return Collections.<String>unmodifiableList(var6);
   }

   public static String method22973(String var0, int var1, int var2, boolean var3) {
      for (int var6 = var1; var6 < var2; var6++) {
         char var7 = var0.charAt(var6);
         if (var7 == '%' || var7 == '+' && var3) {
            Class1734 var8 = new Class1734();
            var8.method7628(var0, var1, var6);
            method22974(var8, var0, var6, var2, var3);
            return var8.method7612();
         }
      }

      return var0.substring(var1, var2);
   }

   public static void method22974(Class1734 var0, String var1, int var2, int var3, boolean var4) {
      int var7 = var2;

      while (var7 < var3) {
         int var8;
         label45: {
            var8 = var1.codePointAt(var7);
            if (var8 == 37 && var7 + 2 < var3) {
               int var9 = method22976(var1.charAt(var7 + 1));
               int var10 = method22976(var1.charAt(var7 + 2));
               if (var9 != -1 && var10 != -1) {
                  var0.method7570((var9 << 4) + var10);
                  var7 += 2;
                  break label45;
               }
            } else if (var8 == 43 && var4) {
               var0.method7570(32);
               break label45;
            }

            var0.method7567(var8);
         }

         var7 += Character.charCount(var8);
      }
   }

   public static boolean method22975(String var0, int var1, int var2) {
      return var1 + 2 < var2 && var0.charAt(var1) == '%' && method22976(var0.charAt(var1 + 1)) != -1 && method22976(var0.charAt(var1 + 2)) != -1;
   }

   public static int method22976(char var0) {
      if (var0 >= '0' && var0 <= '9') {
         return var0 - 48;
      } else if (var0 >= 'a' && var0 <= 'f') {
         return var0 - 97 + 10;
      } else {
         return var0 >= 65 && var0 <= 70 ? var0 - 65 + 10 : -1;
      }
   }

   public static String method22977(String var0, int var1, int var2, String var3, boolean var4, boolean var5, boolean var6, boolean var7) {
      int var10 = var1;

      while (var10 < var2) {
         int var11 = var0.codePointAt(var10);
         if (var11 < 32
            || var11 == 127
            || var11 >= 128 && var7
            || var3.indexOf(var11) != -1
            || var11 == 37 && (!var4 || var5 && !method22975(var0, var10, var2))
            || var11 == 43 && var6) {
            Class1734 var12 = new Class1734();
            var12.method7628(var0, var1, var10);
            method22978(var12, var0, var10, var2, var3, var4, var5, var6, var7);
            return var12.method7612();
         }

         var10 += Character.charCount(var11);
      }

      return var0.substring(var1, var2);
   }

   public static void method22978(Class1734 var0, String var1, int var2, int var3, String var4, boolean var5, boolean var6, boolean var7, boolean var8) {
      Class1734 var11 = null;
      int var12 = var2;

      while (var12 < var3) {
         int var13 = var1.codePointAt(var12);
         if (!var5 || var13 != 9 && var13 != 10 && var13 != 12 && var13 != 13) {
            if (var13 == 43 && var7) {
               var0.method7566(!var5 ? "%2B" : "+");
            } else if (var13 < 32
               || var13 == 127
               || var13 >= 128 && var8
               || var4.indexOf(var13) != -1
               || var13 == 37 && (!var5 || var6 && !method22975(var1, var12, var3))) {
               if (var11 == null) {
                  var11 = new Class1734();
               }

               var11.method7567(var13);

               while (!var11.method7583()) {
                  int var14 = var11.method7596() & 255;
                  var0.method7570(37);
                  var0.method7570(field31238[var14 >> 4 & 15]);
                  var0.method7570(field31238[var14 & 15]);
               }
            } else {
               var0.method7567(var13);
            }
         }

         var12 += Character.charCount(var13);
      }
   }

   public static String method22979(String var0, String var1, boolean var2, boolean var3, boolean var4, boolean var5) {
      return method22977(var0, 0, var0.length(), var1, var2, var3, var4, var5);
   }
}
