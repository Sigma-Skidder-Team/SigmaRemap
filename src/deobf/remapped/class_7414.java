package remapped;

import java.util.ArrayList;
import java.util.List;

public final class class_7414 {
   public final List<String> field_37846 = new ArrayList<String>(20);

   public class_7414 method_33779(String var1) {
      int var4 = var1.indexOf(":", 1);
      if (var4 == -1) {
         return !var1.startsWith(":") ? this.method_33780("", var1) : this.method_33780("", var1.substring(1));
      } else {
         return this.method_33780(var1.substring(0, var4), var1.substring(var4 + 1));
      }
   }

   public class_7414 method_33777(String var1) {
      int var4 = var1.indexOf(":");
      if (var4 != -1) {
         return this.method_33778(var1.substring(0, var4).trim(), var1.substring(var4 + 1));
      } else {
         throw new IllegalArgumentException("Unexpected header: " + var1);
      }
   }

   public class_7414 method_33778(String var1, String var2) {
      this.method_33775(var1, var2);
      return this.method_33780(var1, var2);
   }

   public class_7414 method_33780(String var1, String var2) {
      this.field_37846.add(var1);
      this.field_37846.add(var2.trim());
      return this;
   }

   public class_7414 method_33783(String var1) {
      for (byte var4 = 0; var4 < this.field_37846.size(); var4 += 2) {
         if (var1.equalsIgnoreCase(this.field_37846.get(var4))) {
            this.field_37846.remove(var4);
            this.field_37846.remove(var4);
            var4 -= 2;
         }
      }

      return this;
   }

   public class_7414 method_33774(String var1, String var2) {
      this.method_33775(var1, var2);
      this.method_33783(var1);
      this.method_33780(var1, var2);
      return this;
   }

   private void method_33775(String var1, String var2) {
      if (var1 == null) {
         throw new NullPointerException("name == null");
      } else if (var1.isEmpty()) {
         throw new IllegalArgumentException("name is empty");
      } else {
         int var5 = 0;

         for (int var6 = var1.length(); var5 < var6; var5++) {
            char var7 = var1.charAt(var5);
            if (var7 <= ' ' || var7 >= 127) {
               throw new IllegalArgumentException(class_8515.method_39218("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(var7), var5, var1));
            }
         }

         if (var2 == null) {
            throw new NullPointerException("value for name " + var1 + " == null");
         } else {
            var5 = 0;

            for (int var9 = var2.length(); var5 < var9; var5++) {
               char var10 = var2.charAt(var5);
               if (var10 <= 31 && var10 != '\t' || var10 >= 127) {
                  throw new IllegalArgumentException(
                     class_8515.method_39218("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(var10), var5, var1, var2)
                  );
               }
            }
         }
      }
   }

   public String method_33776(String var1) {
      for (int var4 = this.field_37846.size() - 2; var4 >= 0; var4 -= 2) {
         if (var1.equalsIgnoreCase(this.field_37846.get(var4))) {
            return this.field_37846.get(var4 + 1);
         }
      }

      return null;
   }

   public class_8121 method_33781() {
      return new class_8121(this);
   }
}
