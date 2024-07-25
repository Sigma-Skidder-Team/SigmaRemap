package remapped;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public final class class_8121 {
   private final String[] field_41613;

   public class_8121(class_7414 var1) {
      this.field_41613 = var1.field_37846.<String>toArray(new String[var1.field_37846.size()]);
   }

   private class_8121(String[] var1) {
      this.field_41613 = var1;
   }

   @Nullable
   public String method_36955(String var1) {
      return method_36956(this.field_41613, var1);
   }

   @Nullable
   public Date method_36949(String var1) {
      String var4 = this.method_36955(var1);
      return var4 == null ? null : class_7611.method_34525(var4);
   }

   public int method_36948() {
      return this.field_41613.length / 2;
   }

   public String method_36954(int var1) {
      return this.field_41613[var1 * 2];
   }

   public String method_36953(int var1) {
      return this.field_41613[var1 * 2 + 1];
   }

   public Set<String> method_36951() {
      TreeSet var3 = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
      int var4 = 0;

      for (int var5 = this.method_36948(); var4 < var5; var4++) {
         var3.add(this.method_36954(var4));
      }

      return Collections.<String>unmodifiableSet(var3);
   }

   public List<String> values(String var1) {
      ArrayList var4 = null;
      int var5 = 0;

      for (int var6 = this.method_36948(); var5 < var6; var5++) {
         if (var1.equalsIgnoreCase(this.method_36954(var5))) {
            if (var4 == null) {
               var4 = new ArrayList(2);
            }

            var4.add(this.method_36953(var5));
         }
      }

      return var4 == null ? Collections.<String>emptyList() : Collections.<String>unmodifiableList(var4);
   }

   public class_7414 method_36952() {
      class_7414 var3 = new class_7414();
      Collections.addAll(var3.field_37846, this.field_41613);
      return var3;
   }

   @Override
   public boolean equals(Object var1) {
      return var1 instanceof class_8121 && Arrays.equals((Object[])((class_8121)var1).field_41613, (Object[])this.field_41613);
   }

   @Override
   public int hashCode() {
      return Arrays.hashCode((Object[])this.field_41613);
   }

   @Override
   public String toString() {
      StringBuilder var3 = new StringBuilder();
      int var4 = 0;

      for (int var5 = this.method_36948(); var4 < var5; var4++) {
         var3.append(this.method_36954(var4)).append(": ").append(this.method_36953(var4)).append("\n");
      }

      return var3.toString();
   }

   public Map<String, List<String>> method_36950() {
      TreeMap var3 = new TreeMap(String.CASE_INSENSITIVE_ORDER);
      int var4 = 0;

      for (int var5 = this.method_36948(); var4 < var5; var4++) {
         String var6 = this.method_36954(var4).toLowerCase(Locale.US);
         Object var7 = (List)var3.get(var6);
         if (var7 == null) {
            var7 = new ArrayList(2);
            var3.put(var6, var7);
         }

         var7.add(this.method_36953(var4));
      }

      return var3;
   }

   private static String method_36956(String[] var0, String var1) {
      for (int var4 = var0.length - 2; var4 >= 0; var4 -= 2) {
         if (var1.equalsIgnoreCase(var0[var4])) {
            return var0[var4 + 1];
         }
      }

      return null;
   }

   public static class_8121 method_36959(String... var0) {
      if (var0 == null) {
         throw new NullPointerException("namesAndValues == null");
      } else if (var0.length % 2 != 0) {
         throw new IllegalArgumentException("Expected alternating header names and values");
      } else {
         var0 = (String[])var0.clone();

         for (int var3 = 0; var3 < var0.length; var3++) {
            if (var0[var3] == null) {
               throw new IllegalArgumentException("Headers cannot be null");
            }

            var0[var3] = var0[var3].trim();
         }

         for (byte var7 = 0; var7 < var0.length; var7 += 2) {
            String var4 = var0[var7];
            String var5 = var0[var7 + 1];
            if (var4.length() == 0 || var4.indexOf(0) != -1 || var5.indexOf(0) != -1) {
               throw new IllegalArgumentException("Unexpected header: " + var4 + ": " + var5);
            }
         }

         return new class_8121(var0);
      }
   }

   public static class_8121 method_36958(Map<String, String> var0) {
      if (var0 == null) {
         throw new NullPointerException("headers == null");
      } else {
         String[] var3 = new String[var0.size() * 2];
         byte var4 = 0;

         for (Entry var6 : var0.entrySet()) {
            if (var6.getKey() != null && var6.getValue() != null) {
               String var7 = ((String)var6.getKey()).trim();
               String var8 = ((String)var6.getValue()).trim();
               if (var7.length() != 0 && var7.indexOf(0) == -1 && var8.indexOf(0) == -1) {
                  var3[var4] = var7;
                  var3[var4 + 1] = var8;
                  var4 += 2;
                  continue;
               }

               throw new IllegalArgumentException("Unexpected header: " + var7 + ": " + var8);
            }

            throw new IllegalArgumentException("Headers cannot be null");
         }

         return new class_8121(var3);
      }
   }
}
