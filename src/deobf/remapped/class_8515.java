package remapped;

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

public final class class_8515 {
   public static final byte[] field_43585 = new byte[0];
   public static final String[] field_43588 = new String[0];
   public static final class_8856 field_43594 = class_8856.method_40733(null, field_43585);
   public static final class_9001 field_43591 = class_9001.method_41294(null, field_43585);
   private static final class_9091 field_43582 = class_9091.method_41907("efbbbf");
   private static final class_9091 field_43586 = class_9091.method_41907("feff");
   private static final class_9091 field_43596 = class_9091.method_41907("fffe");
   private static final class_9091 field_43583 = class_9091.method_41907("0000ffff");
   private static final class_9091 field_43587 = class_9091.method_41907("ffff0000");
   public static final Charset field_43592 = Charset.forName("UTF-8");
   private static final Charset field_43579 = Charset.forName("UTF-16BE");
   private static final Charset field_43593 = Charset.forName("UTF-16LE");
   private static final Charset field_43590 = Charset.forName("UTF-32BE");
   private static final Charset field_43595 = Charset.forName("UTF-32LE");
   public static final TimeZone field_43584 = TimeZone.getTimeZone("GMT");
   public static final Comparator<String> field_43581 = new class_3601();
   private static final Pattern field_43580 = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

   private class_8515() {
   }

   public static void method_39203(long var0, long var2, long var4) {
      if ((var2 | var4) < 0L || var2 > var0 || var0 - var2 < var4) {
         throw new ArrayIndexOutOfBoundsException();
      }
   }

   public static boolean method_39214(Object var0, Object var1) {
      return var0 == var1 || var0 != null && var0.equals(var1);
   }

   public static void method_39200(Closeable var0) {
      if (var0 != null) {
         try {
            var0.close();
         } catch (RuntimeException var4) {
            throw var4;
         } catch (Exception var5) {
         }
      }
   }

   public static void method_39202(Socket var0) {
      if (var0 != null) {
         try {
            var0.close();
         } catch (AssertionError var4) {
            if (!method_39213(var4)) {
               throw var4;
            }
         } catch (RuntimeException var5) {
            throw var5;
         } catch (Exception var6) {
         }
      }
   }

   public static void method_39201(ServerSocket var0) {
      if (var0 != null) {
         try {
            var0.close();
         } catch (RuntimeException var4) {
            throw var4;
         } catch (Exception var5) {
         }
      }
   }

   public static boolean method_39198(class_5322 var0, int var1, TimeUnit var2) {
      try {
         return method_39194(var0, var1, var2);
      } catch (IOException var6) {
         return false;
      }
   }

   public static boolean method_39194(class_5322 var0, int var1, TimeUnit var2) throws IOException {
      long var5 = System.nanoTime();
      long var7 = var0.method_19192().method_1079() ? var0.method_19192().method_1073() - var5 : Long.MAX_VALUE;
      var0.method_19192().method_1074(var5 + Math.min(var7, var2.toNanos((long)var1)));

      boolean var10;
      try {
         class_7059 var9 = new class_7059();

         while (var0.method_24273(var9, 8192L) != -1L) {
            var9.method_32455();
         }

         return true;
      } catch (InterruptedIOException var14) {
         var10 = false;
      } finally {
         if (var7 == Long.MAX_VALUE) {
            var0.method_19192().method_1077();
         } else {
            var0.method_19192().method_1074(var5 + var7);
         }
      }

      return var10;
   }

   public static <T> List<T> method_39210(List<T> var0) {
      return Collections.<T>unmodifiableList(new ArrayList(var0));
   }

   public static <T> List<T> method_39211(T... var0) {
      return Collections.<T>unmodifiableList(Arrays.asList((T[])((Object[])var0.clone())));
   }

   public static ThreadFactory method_39209(String var0, boolean var1) {
      return new class_3063(var0, var1);
   }

   public static String[] method_39207(Comparator<? super String> var0, String[] var1, String[] var2) {
      ArrayList var5 = new ArrayList();

      for (String var9 : var1) {
         for (String var13 : var2) {
            if (var0.compare(var9, var13) == 0) {
               var5.add(var9);
               break;
            }
         }
      }

      return var5.<String>toArray(new String[var5.size()]);
   }

   public static boolean method_39196(Comparator<String> var0, String[] var1, String[] var2) {
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

   public static String method_39215(class_1672 var0, boolean var1) {
      String var4 = !var0.method_7449().contains(":") ? var0.method_7449() : "[" + var0.method_7449() + "]";
      return !var1 && var0.method_7472() == class_1672.method_7471(var0.method_7488()) ? var4 : var4 + ":" + var0.method_7472();
   }

   public static String method_39197(String var0) {
      int var3 = 0;
      int var4 = var0.length();

      while (var3 < var4) {
         int var5 = var0.codePointAt(var3);
         if (var5 <= 31 || var5 >= 127) {
            class_7059 var6 = new class_7059();
            var6.method_32492(var0, 0, var3);
            int var7 = var3;

            while (var7 < var4) {
               var5 = var0.codePointAt(var7);
               var6.method_32483(var5 > 31 && var5 < 127 ? var5 : 63);
               var7 += Character.charCount(var5);
            }

            return var6.method_36592();
         }

         var3 += Character.charCount(var5);
      }

      return var0;
   }

   public static boolean method_39213(AssertionError var0) {
      return var0.getCause() != null && var0.getMessage() != null && var0.getMessage().contains("getsockname failed");
   }

   public static int method_39222(Comparator<String> var0, String[] var1, String var2) {
      int var5 = 0;

      for (int var6 = var1.length; var5 < var6; var5++) {
         if (var0.compare(var1[var5], var2) == 0) {
            return var5;
         }
      }

      return -1;
   }

   public static String[] method_39208(String[] var0, String var1) {
      String[] var4 = new String[var0.length + 1];
      System.arraycopy(var0, 0, var4, 0, var0.length);
      var4[var4.length - 1] = var1;
      return var4;
   }

   public static int method_39206(String var0, int var1, int var2) {
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

   public static int method_39216(String var0, int var1, int var2) {
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

   public static String method_39212(String var0, int var1, int var2) {
      int var5 = method_39206(var0, var1, var2);
      int var6 = method_39216(var0, var5, var2);
      return var0.substring(var5, var6);
   }

   public static int method_39220(String var0, int var1, int var2, String var3) {
      for (int var6 = var1; var6 < var2; var6++) {
         if (var3.indexOf(var0.charAt(var6)) != -1) {
            return var6;
         }
      }

      return var2;
   }

   public static int method_39219(String var0, int var1, int var2, char var3) {
      for (int var6 = var1; var6 < var2; var6++) {
         if (var0.charAt(var6) == var3) {
            return var6;
         }
      }

      return var2;
   }

   public static String method_39199(String var0) {
      try {
         String var3 = IDN.toASCII(var0).toLowerCase(Locale.US);
         if (var3.isEmpty()) {
            return null;
         } else {
            return method_39205(var3) ? null : var3;
         }
      } catch (IllegalArgumentException var4) {
         return null;
      }
   }

   private static boolean method_39205(String var0) {
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

   public static int method_39195(String var0) {
      int var3 = 0;

      for (int var4 = var0.length(); var3 < var4; var3++) {
         char var5 = var0.charAt(var3);
         if (var5 <= 31 || var5 >= 127) {
            return var3;
         }
      }

      return -1;
   }

   public static boolean method_39204(String var0) {
      return field_43580.matcher(var0).matches();
   }

   public static String method_39218(String var0, Object... var1) {
      return String.format(Locale.US, var0, var1);
   }

   public static Charset method_39217(class_8067 var0, Charset var1) throws IOException {
      if (!var0.method_36589(0L, field_43582)) {
         if (!var0.method_36589(0L, field_43586)) {
            if (!var0.method_36589(0L, field_43596)) {
               if (!var0.method_36589(0L, field_43583)) {
                  if (!var0.method_36589(0L, field_43587)) {
                     return var1;
                  } else {
                     var0.method_36583((long)field_43587.method_41902());
                     return field_43595;
                  }
               } else {
                  var0.method_36583((long)field_43583.method_41902());
                  return field_43590;
               }
            } else {
               var0.method_36583((long)field_43596.method_41902());
               return field_43593;
            }
         } else {
            var0.method_36583((long)field_43586.method_41902());
            return field_43579;
         }
      } else {
         var0.method_36583((long)field_43582.method_41902());
         return field_43592;
      }
   }
}
