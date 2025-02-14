package mapped;

import com.google.common.base.Joiner;

import java.util.Arrays;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Class2025 implements Comparable<Class2025> {
   private static final Pattern field13150 = Pattern.compile("(?<a>0|[1-9]\\d*)\\.(?<b>0|[1-9]\\d*)(?:\\.(?<c>0|[1-9]\\d*))?(?:-(?<tag>[A-z0-9.-]*))?");
   private final int[] field13151 = new int[3];
   private final String field13152;

   public Class2025(String var1) {
      if (var1 != null) {
         Matcher var4 = field13150.matcher(var1);
         if (var4.matches()) {
            this.field13151[0] = Integer.parseInt(var4.group("a"));
            this.field13151[1] = Integer.parseInt(var4.group("b"));
            this.field13151[2] = var4.group("c") != null ? Integer.parseInt(var4.group("c")) : 0;
            this.field13152 = var4.group("tag") != null ? var4.group("tag") : "";
         } else {
            throw new IllegalArgumentException("Invalid version format");
         }
      } else {
         throw new IllegalArgumentException("Version can not be null");
      }
   }

   public static int method8659(Class2025 var0, Class2025 var1) {
      if (var0 != var1) {
         if (var0 != null) {
            if (var1 != null) {
               int var4 = Math.max(var0.field13151.length, var1.field13151.length);

               for (int var5 = 0; var5 < var4; var5++) {
                  int var6 = var5 >= var0.field13151.length ? 0 : var0.field13151[var5];
                  int var7 = var5 >= var1.field13151.length ? 0 : var1.field13151[var5];
                  if (var6 < var7) {
                     return -1;
                  }

                  if (var6 > var7) {
                     return 1;
                  }
               }

               if (var0.field13152.isEmpty() && !var1.field13152.isEmpty()) {
                  return 1;
               } else {
                  return !var0.field13152.isEmpty() && var1.field13152.isEmpty() ? -1 : 0;
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

   public static boolean equals(Class2025 var0, Class2025 var1) {
      return var0 == var1 || var0 != null && var1 != null && method8659(var0, var1) == 0;
   }

   @Override
   public String toString() {
      String[] var3 = new String[this.field13151.length];

      for (int var4 = 0; var4 < this.field13151.length; var4++) {
         var3[var4] = String.valueOf(this.field13151[var4]);
      }

      return Joiner.on(".").join(var3) + (this.field13152.isEmpty() ? "" : "-" + this.field13152);
   }

   public int compareTo(Class2025 var1) {
      return method8659(this, var1);
   }

   @Override
   public boolean equals(Object var1) {
      return var1 instanceof Class2025 && equals(this, (Class2025)var1);
   }

   @Override
   public int hashCode() {
      int var3 = Objects.hash(this.field13152);
      return 31 * var3 + Arrays.hashCode(this.field13151);
   }

   public String method8660() {
      return this.field13152;
   }
}
