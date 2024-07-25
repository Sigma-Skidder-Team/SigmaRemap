package remapped;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;

public class class_644 implements class_1504 {
   private final int field_3604;
   private final int field_3607;
   private final class_2831<class_8137> field_3606;
   private final class_6098 field_3603;
   private final Identifier field_3605;
   private final String field_3602;

   public class_644(Identifier var1, String var2, int var3, int var4, class_2831<class_8137> var5, class_6098 var6) {
      this.field_3605 = var1;
      this.field_3602 = var2;
      this.field_3604 = var3;
      this.field_3607 = var4;
      this.field_3606 = var5;
      this.field_3603 = var6;
   }

   @Override
   public Identifier method_41050() {
      return this.field_3605;
   }

   @Override
   public class_2994<?> method_41048() {
      return class_2994.field_14711;
   }

   @Override
   public String method_41051() {
      return this.field_3602;
   }

   @Override
   public class_6098 method_41044() {
      return this.field_3603;
   }

   @Override
   public class_2831<class_8137> method_41043() {
      return this.field_3606;
   }

   @Override
   public boolean method_41047(int var1, int var2) {
      return var1 >= this.field_3604 && var2 >= this.field_3607;
   }

   public boolean method_2959(class_6946 var1, class_6486 var2) {
      for (int var5 = 0; var5 <= var1.method_31781() - this.field_3604; var5++) {
         for (int var6 = 0; var6 <= var1.method_31782() - this.field_3607; var6++) {
            if (this.method_2958(var1, var5, var6, true)) {
               return true;
            }

            if (this.method_2958(var1, var5, var6, false)) {
               return true;
            }
         }
      }

      return false;
   }

   private boolean method_2958(class_6946 var1, int var2, int var3, boolean var4) {
      for (int var7 = 0; var7 < var1.method_31781(); var7++) {
         for (int var8 = 0; var8 < var1.method_31782(); var8++) {
            int var9 = var7 - var2;
            int var10 = var8 - var3;
            class_8137 var11 = class_8137.field_41675;
            if (var9 >= 0 && var10 >= 0 && var9 < this.field_3604 && var10 < this.field_3607) {
               if (!var4) {
                  var11 = this.field_3606.get(var9 + var10 * this.field_3604);
               } else {
                  var11 = this.field_3606.get(this.field_3604 - var9 - 1 + var10 * this.field_3604);
               }
            }

            if (!var11.test(var1.method_31498(var7 + var8 * var1.method_31781()))) {
               return false;
            }
         }
      }

      return true;
   }

   public class_6098 method_2946(class_6946 var1) {
      return this.method_41044().method_27973();
   }

   public int method_2957() {
      return this.field_3604;
   }

   public int method_2966() {
      return this.field_3607;
   }

   private static class_2831<class_8137> method_2950(String[] var0, Map<String, class_8137> var1, int var2, int var3) {
      class_2831 var6 = class_2831.<class_8137>method_12872(var2 * var3, class_8137.field_41675);
      HashSet var7 = Sets.newHashSet(var1.keySet());
      var7.remove(" ");

      for (int var8 = 0; var8 < var0.length; var8++) {
         for (int var9 = 0; var9 < var0[var8].length(); var9++) {
            String var10 = var0[var8].substring(var9, var9 + 1);
            class_8137 var11 = (class_8137)var1.get(var10);
            if (var11 == null) {
               throw new JsonSyntaxException("Pattern references symbol '" + var10 + "' but it's not defined in the key");
            }

            var7.remove(var10);
            var6.set(var9 + var2 * var8, var11);
         }
      }

      if (var7.isEmpty()) {
         return var6;
      } else {
         throw new JsonSyntaxException("Key defines symbols that aren't used in pattern: " + var7);
      }
   }

   @VisibleForTesting
   public static String[] method_2963(String... var0) {
      int var3 = Integer.MAX_VALUE;
      int var4 = 0;
      int var5 = 0;
      int var6 = 0;

      for (int var7 = 0; var7 < var0.length; var7++) {
         String var8 = var0[var7];
         var3 = Math.min(var3, method_2949(var8));
         int var9 = method_2965(var8);
         var4 = Math.max(var4, var9);
         if (var9 >= 0) {
            var6 = 0;
         } else {
            if (var5 == var7) {
               var5++;
            }

            var6++;
         }
      }

      if (var0.length == var6) {
         return new String[0];
      } else {
         String[] var10 = new String[var0.length - var6 - var5];

         for (int var11 = 0; var11 < var10.length; var11++) {
            var10[var11] = var0[var11 + var5].substring(var3, var4 + 1);
         }

         return var10;
      }
   }

   private static int method_2949(String var0) {
      int var3 = 0;

      while (var3 < var0.length() && var0.charAt(var3) == ' ') {
         var3++;
      }

      return var3;
   }

   private static int method_2965(String var0) {
      int var3 = var0.length() - 1;

      while (var3 >= 0 && var0.charAt(var3) == ' ') {
         var3--;
      }

      return var3;
   }

   private static String[] method_2955(JsonArray var0) {
      String[] var3 = new String[var0.size()];
      if (var3.length > 3) {
         throw new JsonSyntaxException("Invalid pattern: too many rows, 3 is maximum");
      } else if (var3.length == 0) {
         throw new JsonSyntaxException("Invalid pattern: empty pattern not allowed");
      } else {
         for (int var4 = 0; var4 < var3.length; var4++) {
            String var5 = class_6539.method_29795(var0.get(var4), "pattern[" + var4 + "]");
            if (var5.length() > 3) {
               throw new JsonSyntaxException("Invalid pattern: too many columns, 3 is maximum");
            }

            if (var4 > 0 && var3[0].length() != var5.length()) {
               throw new JsonSyntaxException("Invalid pattern: each row must be the same width");
            }

            var3[var4] = var5;
         }

         return var3;
      }
   }

   private static Map<String, class_8137> method_2964(JsonObject var0) {
      HashMap var3 = Maps.newHashMap();

      for (Entry var5 : var0.entrySet()) {
         if (((String)var5.getKey()).length() != 1) {
            throw new JsonSyntaxException("Invalid key entry: '" + (String)var5.getKey() + "' is an invalid symbol (must be 1 character only).");
         }

         if (" ".equals(var5.getKey())) {
            throw new JsonSyntaxException("Invalid key entry: ' ' is a reserved symbol.");
         }

         var3.put(var5.getKey(), class_8137.method_37024((JsonElement)var5.getValue()));
      }

      var3.put(" ", class_8137.field_41675);
      return var3;
   }

   public static class_6098 method_2961(JsonObject var0) {
      String var3 = class_6539.method_29796(var0, "item");
      class_2451 var4 = class_8669.field_44382.method_39794(new Identifier(var3)).orElseThrow(() -> new JsonSyntaxException("Unknown item '" + var3 + "'"));
      if (!var0.has("data")) {
         int var5 = class_6539.method_29768(var0, "count", 1);
         return new class_6098(var4, var5);
      } else {
         throw new JsonParseException("Disallowed data tag found");
      }
   }
}
