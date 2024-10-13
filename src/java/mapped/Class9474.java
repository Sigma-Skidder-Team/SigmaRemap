package mapped;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

public final class Class9474 {
   public static final byte[] field44015 = new byte[0];
   public static final String[] field44016 = new String[0];
   public static final Class1793 field44017 = Class1793.method7842(null, field44015);
   public static final Class4864 field44018 = Class4864.method15012(null, field44015);
   private static final Class2003 field44019 = Class2003.method8450("efbbbf");
   private static final Class2003 field44020 = Class2003.method8450("feff");
   private static final Class2003 field44021 = Class2003.method8450("fffe");
   private static final Class2003 field44022 = Class2003.method8450("0000ffff");
   private static final Class2003 field44023 = Class2003.method8450("ffff0000");
   public static final Charset field44024 = Charset.forName("UTF-8");
   private static final Charset field44025 = Charset.forName("UTF-16BE");
   private static final Charset field44026 = Charset.forName("UTF-16LE");
   private static final Charset field44027 = Charset.forName("UTF-32BE");
   private static final Charset field44028 = Charset.forName("UTF-32LE");
   public static final TimeZone field44029 = TimeZone.getTimeZone("GMT");
   public static final Comparator<String> field44030 = new Class3579();
   private static final Pattern field44031 = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

   private Class9474() {
   }

   public static void method36533(long var0, long var2, long var4) {
      if ((var2 | var4) < 0L || var2 > var0 || var0 - var2 < var4) {
         throw new ArrayIndexOutOfBoundsException();
      }
   }

   public static void method36535(Closeable var0) {
      if (var0 != null) {
         try {
            var0.close();
         } catch (RuntimeException var4) {
            throw var4;
         } catch (Exception var5) {
         }
      }
   }

   public static void method36536(Socket var0) {
      if (var0 != null) {
         try {
            var0.close();
         } catch (AssertionError var4) {
            if (!method36547(var4)) {
               throw var4;
            }
         } catch (RuntimeException var5) {
            throw var5;
         } catch (Exception var6) {
         }
      }
   }

   public static void method36537(ServerSocket var0) {
      if (var0 != null) {
         try {
            var0.close();
         } catch (RuntimeException var4) {
            throw var4;
         } catch (Exception var5) {
         }
      }
   }

   public static boolean method36538(Class1737 var0, int var1, TimeUnit var2) {
      try {
         return method36539(var0, var1, var2);
      } catch (IOException var6) {
         return false;
      }
   }

   public static boolean method36539(Class1737 var0, int var1, TimeUnit var2) throws IOException {
      long var5 = System.nanoTime();
      long var7 = var0.method7541().method15211() ? var0.method7541().method15212() - var5 : Long.MAX_VALUE;
      var0.method7541().method15213(var5 + Math.min(var7, var2.toNanos((long)var1)));

      boolean var10;
      try {
         Class1734 var9 = new Class1734();

         while (var0.method7633(var9, 8192L) != -1L) {
            var9.method7626();
         }

         return true;
      } catch (InterruptedIOException var14) {
         var10 = false;
      } finally {
         if (var7 == Long.MAX_VALUE) {
            var0.method7541().method15216();
         } else {
            var0.method7541().method15213(var5 + var7);
         }
      }

      return var10;
   }

   public static <T> List<T> method36540(List<T> var0) {
      return Collections.<T>unmodifiableList(new ArrayList(var0));
   }

   public static <T> List<T> method36541(T... var0) {
      return Collections.<T>unmodifiableList(Arrays.asList((T[])((Object[])var0.clone())));
   }

   public static ThreadFactory method36542(String var0, boolean var1) {
      return new Class7076(var0, var1);
   }

   public static String[] method36543(Comparator<? super String> var0, String[] var1, String[] var2) {
      ArrayList<String> var5 = new ArrayList();

      for (String var9 : var1) {
         for (String var13 : var2) {
            if (var0.compare(var9, var13) == 0) {
               var5.add(var9);
               break;
            }
         }
      }

      return var5.toArray(new String[var5.size()]);
   }

   public static boolean method36544(Comparator<String> var0, String[] var1, String[] var2) {
      if (var1 != null && var2 != null && var1.length != 0 && var2.length != 0) {
         for (String var8 : var1) {
            for (String var12 : var2) {
               if (var0.compare(var8, var12) == 0) {
                  return true;
               }
            }
         }

         return false;
      } else {
         return false;
      }
   }

   public static String method36545(Class7284 var0, boolean var1) {
      String var4 = !var0.method22942().contains(":") ? var0.method22942() : "[" + var0.method22942() + "]";
      return !var1 && var0.method22943() == Class7284.method22944(var0.method22936()) ? var4 : var4 + ":" + var0.method22943();
   }

   public static String method36546(String var0) {
      int var3 = 0;
      int var4 = var0.length();

      while (var3 < var4) {
         int var5 = var0.codePointAt(var3);
         if (var5 <= 31 || var5 >= 127) {
            Class1734 var6 = new Class1734();
            var6.method7628(var0, 0, var3);
            int var7 = var3;

            while (var7 < var4) {
               var5 = var0.codePointAt(var7);
               var6.method7567(var5 > 31 && var5 < 127 ? var5 : 63);
               var7 += Character.charCount(var5);
            }

            return var6.method7612();
         }

         var3 += Character.charCount(var5);
      }

      return var0;
   }

   public static boolean method36547(AssertionError var0) {
      return var0.getCause() != null && var0.getMessage() != null && var0.getMessage().contains("getsockname failed");
   }

   public static int method36548(Comparator<String> var0, String[] var1, String var2) {
      int var5 = 0;

      for (int var6 = var1.length; var5 < var6; var5++) {
         if (var0.compare(var1[var5], var2) == 0) {
            return var5;
         }
      }

      return -1;
   }

   public static String[] method36549(String[] var0, String var1) {
      String[] var4 = new String[var0.length + 1];
      System.arraycopy(var0, 0, var4, 0, var0.length);
      var4[var4.length - 1] = var1;
      return var4;
   }

   public static int method36550(String var0, int var1, int var2) {
      for (int var5 = var1; var5 < var2; var5++) {
         switch (var0.charAt(var5)) {
            case '\t':
            case '\n':
            case '\f':
            case '\r':
            case ' ':
            default:
               return var5;
         }
      }

      return var2;
   }

   public static int method36551(String var0, int var1, int var2) {
      for (int var5 = var2 - 1; var5 >= var1; var5--) {
         switch (var0.charAt(var5)) {
            case '\t':
            case '\n':
            case '\f':
            case '\r':
            case ' ':
            default:
               return var5 + 1;
         }
      }

      return var1;
   }

   public static String method36552(String var0, int var1, int var2) {
      int var5 = method36550(var0, var1, var2);
      int var6 = method36551(var0, var5, var2);
      return var0.substring(var5, var6);
   }

   public static int method36553(String var0, int var1, int var2, String var3) {
      for (int var6 = var1; var6 < var2; var6++) {
         if (var3.indexOf(var0.charAt(var6)) != -1) {
            return var6;
         }
      }

      return var2;
   }

   public static int method36554(String var0, int var1, int var2, char var3) {
      for (int var6 = var1; var6 < var2; var6++) {
         if (var0.charAt(var6) == var3) {
            return var6;
         }
      }

      return var2;
   }

   public static String method36555(String var0) {
      try {
         String var3 = IDN.toASCII(var0).toLowerCase(Locale.US);
         if (var3.isEmpty()) {
            return null;
         } else {
            return method36556(var3) ? null : var3;
         }
      } catch (IllegalArgumentException var4) {
         return null;
      }
   }

   private static boolean method36556(String var0) {
      for (int var3 = 0; var3 < var0.length(); var3++) {
         char var4 = var0.charAt(var3);
         if (var4 <= 31 || var4 >= 127) {
            return true;
         }

         if (" #%/:?@[\\]".indexOf(var4) != -1) {
            return true;
         }
      }

      return false;
   }

   public static int method36557(String var0) {
      int var3 = 0;

      for (int var4 = var0.length(); var3 < var4; var3++) {
         char var5 = var0.charAt(var3);
         if (var5 <= 31 || var5 >= 127) {
            return var3;
         }
      }

      return -1;
   }

   public static boolean method36558(String var0) {
      return field44031.matcher(var0).matches();
   }

   public static String method36559(String var0, Object... var1) {
      return String.format(Locale.US, var0, var1);
   }

   public static Charset method36560(Class1735 var0, Charset var1) throws IOException {
      if (!var0.method7641(0L, field44019)) {
         if (!var0.method7641(0L, field44020)) {
            if (!var0.method7641(0L, field44021)) {
               if (!var0.method7641(0L, field44022)) {
                  if (!var0.method7641(0L, field44023)) {
                     return var1;
                  } else {
                     var0.method7627((long)field44023.method8458());
                     return field44028;
                  }
               } else {
                  var0.method7627((long)field44022.method8458());
                  return field44027;
               }
            } else {
               var0.method7627((long)field44021.method8458());
               return field44026;
            }
         } else {
            var0.method7627((long)field44020.method8458());
            return field44025;
         }
      } else {
         var0.method7627((long)field44019.method8458());
         return field44024;
      }
   }
}
