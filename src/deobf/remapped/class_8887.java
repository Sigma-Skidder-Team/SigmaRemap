package remapped;

import io.socket.utf8.UTF8Exception;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class class_8887 {
   private static final int field_45592 = String.valueOf(Integer.MAX_VALUE).length();
   public static final int field_45588 = 3;
   private static final Map<String, Integer> field_45594 = new class_586();
   private static final Map<Integer, String> field_45593 = new HashMap<Integer, String>();
   private static class_8970<String> field_45590;
   private static class_7922 field_45591;

   private class_8887() {
   }

   public static void method_40911(class_8970 var0, class_4388 var1) throws UTF8Exception {
      method_40912(var0, false, var1);
   }

   public static void method_40912(class_8970 var0, boolean var1, class_4388 var2) throws UTF8Exception {
      if (!(var0.field_45952 instanceof byte[])) {
         String var5 = String.valueOf(field_45594.get(var0.field_45957));
         if (null != var0.field_45952) {
            var5 = var5 + (!var1 ? String.valueOf(var0.field_45952) : class_8799.method_40454(String.valueOf(var0.field_45952), field_45591));
         }

         var2.method_20453(var5);
      } else {
         method_40910(var0, var2);
      }
   }

   private static void method_40910(class_8970<byte[]> var0, class_4388<byte[]> var1) {
      byte[] var4 = (byte[])var0.field_45952;
      byte[] var5 = new byte[1 + var4.length];
      var5[0] = field_45594.get(var0.field_45957).byteValue();
      System.arraycopy(var4, 0, var5, 1, var4.length);
      var1.method_20453(var5);
   }

   public static class_8970<String> method_40913(String var0) {
      return method_40914(var0, false);
   }

   public static class_8970<String> method_40914(String var0, boolean var1) {
      if (var0 == null) {
         return field_45590;
      } else {
         int var4;
         try {
            var4 = Character.getNumericValue(var0.charAt(0));
         } catch (IndexOutOfBoundsException var7) {
            var4 = -1;
         }

         if (var1) {
            try {
               var0 = class_8799.method_40449(var0, field_45591);
            } catch (class_4819 var6) {
               return field_45590;
            }
         }

         if (var4 >= 0 && var4 < field_45593.size()) {
            return var0.length() > 1 ? new class_8970<String>(field_45593.get(var4), var0.substring(1)) : new class_8970<String>(field_45593.get(var4));
         } else {
            return field_45590;
         }
      }
   }

   public static class_8970<byte[]> method_40915(byte[] var0) {
      byte var3 = var0[0];
      byte[] var4 = new byte[var0.length - 1];
      System.arraycopy(var0, 1, var4, 0, var4.length);
      return new class_8970<byte[]>(field_45593.get(Integer.valueOf(var3)), var4);
   }

   public static void method_40907(class_8970[] var0, class_4388 var1) throws UTF8Exception {
      for (class_8970 var7 : var0) {
         if (var7.field_45952 instanceof byte[]) {
            method_40920(var0, var1);
            return;
         }
      }

      if (var0.length == 0) {
         var1.method_20453("0:");
      } else {
         StringBuilder var9 = new StringBuilder();

         for (class_8970 var8 : var0) {
            method_40912(var8, false, new class_135(var9));
         }

         var1.method_20453(var9.toString());
      }
   }

   private static String method_40905(String var0) {
      return var0.length() + ":" + var0;
   }

   private static void method_40920(class_8970[] var0, class_4388<byte[]> var1) throws UTF8Exception {
      if (var0.length == 0) {
         var1.method_20453(new byte[0]);
      } else {
         ArrayList var4 = new ArrayList(var0.length);

         for (class_8970 var8 : var0) {
            method_40918(var8, new class_410(var4));
         }

         var1.method_20453(class_2055.method_9598(var4.<byte[]>toArray(new byte[var4.size()][])));
      }
   }

   private static void method_40918(class_8970 var0, class_4388<byte[]> var1) throws UTF8Exception {
      method_40912(var0, true, new class_7165(var1));
   }

   public static void method_40908(String var0, class_7446<String> var1) {
      if (var0 != null && var0.length() != 0) {
         StringBuilder var4 = new StringBuilder();
         int var5 = 0;

         for (int var6 = var0.length(); var5 < var6; var5++) {
            char var7 = var0.charAt(var5);
            if (':' != var7) {
               var4.append(var7);
            } else {
               int var8;
               try {
                  var8 = Integer.parseInt(var4.toString());
               } catch (NumberFormatException var13) {
                  var1.method_33885(field_45590, 0, 1);
                  return;
               }

               String var9;
               try {
                  var9 = var0.substring(var5 + 1, var5 + 1 + var8);
               } catch (IndexOutOfBoundsException var12) {
                  var1.method_33885(field_45590, 0, 1);
                  return;
               }

               if (var9.length() != 0) {
                  class_8970 var10 = method_40914(var9, false);
                  if (field_45590.field_45957.equals(var10.field_45957) && field_45590.field_45952.equals(var10.field_45952)) {
                     var1.method_33885(field_45590, 0, 1);
                     return;
                  }

                  boolean var11 = var1.method_33885(var10, var5 + var8, var6);
                  if (!var11) {
                     return;
                  }
               }

               var5 += var8;
               var4 = new StringBuilder();
            }
         }

         if (var4.length() > 0) {
            var1.method_33885(field_45590, 0, 1);
         }
      } else {
         var1.method_33885(field_45590, 0, 1);
      }
   }

   public static void method_40909(byte[] var0, class_7446 var1) {
      ByteBuffer var4 = ByteBuffer.wrap(var0);
      ArrayList var5 = new ArrayList();

      while (var4.capacity() > 0) {
         StringBuilder var6 = new StringBuilder();
         boolean var7 = (var4.get(0) & 255) == 0;
         int var8 = 1;

         while (true) {
            int var9 = var4.get(var8) & 255;
            if (var9 == 255) {
               ((Buffer)var4).position(var6.length() + 1);
               var4 = var4.slice();
               var8 = Integer.parseInt(var6.toString());
               ((Buffer)var4).position(1);
               ((Buffer)var4).limit(var8 + 1);
               byte[] var15 = new byte[var4.remaining()];
               var4.get(var15);
               if (!var7) {
                  var5.add(var15);
               } else {
                  var5.add(method_40921(var15));
               }

               ((Buffer)var4).clear();
               ((Buffer)var4).position(var8 + 1);
               var4 = var4.slice();
               break;
            }

            if (var6.length() > field_45592) {
               var1.method_33885(field_45590, 0, 1);
               return;
            }

            var6.append(var9);
            var8++;
         }
      }

      int var11 = var5.size();

      for (int var12 = 0; var12 < var11; var12++) {
         Object var14 = var5.get(var12);
         if (!(var14 instanceof String)) {
            if (var14 instanceof byte[]) {
               var1.method_33885(method_40915((byte[])var14), var12, var11);
            }
         } else {
            var1.method_33885(method_40914((String)var14, true), var12, var11);
         }
      }
   }

   private static String method_40921(byte[] var0) {
      StringBuilder var3 = new StringBuilder();

      for (byte var7 : var0) {
         var3.appendCodePoint(var7 & 255);
      }

      return var3.toString();
   }

   private static byte[] method_40906(String var0) {
      int var3 = var0.length();
      byte[] var4 = new byte[var3];

      for (int var5 = 0; var5 < var3; var5++) {
         var4[var5] = (byte)Character.codePointAt(var0, var5);
      }

      return var4;
   }

   static {
      for (Entry var7 : field_45594.entrySet()) {
         field_45593.put((Integer)var7.getValue(), (String)var7.getKey());
      }

      field_45590 = new class_8970<String>("error", "parser error");
      field_45591 = new class_7922();
      field_45591.field_40540 = false;
   }
}
