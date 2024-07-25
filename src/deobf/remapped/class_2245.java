package remapped;

import com.google.common.base.Joiner;
import java.util.Arrays;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class class_2245 implements Comparable<class_2245> {
   private static final Pattern field_11178 = Pattern.compile("(?<a>0|[1-9]\\d*)\\.(?<b>0|[1-9]\\d*)(?:\\.(?<c>0|[1-9]\\d*))?(?:-(?<tag>[A-z0-9.-]*))?");
   private final int[] field_11179 = new int[3];
   private final String field_11180;

   public class_2245(String var1) {
      if (var1 != null) {
         Matcher var4 = field_11178.matcher(var1);
         if (var4.matches()) {
            this.field_11179[0] = Integer.parseInt(var4.group("a"));
            this.field_11179[1] = Integer.parseInt(var4.group("b"));
            this.field_11179[2] = var4.group("c") != null ? Integer.parseInt(var4.group("c")) : 0;
            this.field_11180 = var4.group("tag") != null ? var4.group("tag") : "";
         } else {
            throw new IllegalArgumentException("Invalid version format");
         }
      } else {
         throw new IllegalArgumentException("Version can not be null");
      }
   }

   public static int method_10322(class_2245 var0, class_2245 var1) {
      if (var0 != var1) {
         if (var0 != null) {
            if (var1 != null) {
               int var4 = Math.max(var0.field_11179.length, var1.field_11179.length);

               for (int var5 = 0; var5 < var4; var5++) {
                  int var6 = var5 >= var0.field_11179.length ? 0 : var0.field_11179[var5];
                  int var7 = var5 >= var1.field_11179.length ? 0 : var1.field_11179[var5];
                  if (var6 < var7) {
                     return -1;
                  }

                  if (var6 > var7) {
                     return 1;
                  }
               }

               if (var0.field_11180.isEmpty() && !var1.field_11180.isEmpty()) {
                  return 1;
               } else {
                  return !var0.field_11180.isEmpty() && var1.field_11180.isEmpty() ? -1 : 0;
               }
            } else {
               return 1;
            }
         } else {
            return -1;
         }
      } else {
         return 0;
      }
   }

   public static boolean equals(class_2245 var0, class_2245 var1) {
      return var0 == var1 || var0 != null && var1 != null && method_10322(var0, var1) == 0;
   }

   @Override
   public String toString() {
      String[] var3 = new String[this.field_11179.length];

      for (int var4 = 0; var4 < this.field_11179.length; var4++) {
         var3[var4] = String.valueOf(this.field_11179[var4]);
      }

      return Joiner.on(".").join(var3) + (this.field_11180.isEmpty() ? "" : "-" + this.field_11180);
   }

   public int compareTo(class_2245 var1) {
      return method_10322(this, var1);
   }

   @Override
   public boolean equals(Object var1) {
      return var1 instanceof class_2245 && equals(this, (class_2245)var1);
   }

   @Override
   public int hashCode() {
      int var3 = Objects.hash(this.field_11180);
      return 31 * var3 + Arrays.hashCode(this.field_11179);
   }

   public String method_10324() {
      return this.field_11180;
   }
}
