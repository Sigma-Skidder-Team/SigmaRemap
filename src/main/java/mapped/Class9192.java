package mapped;

import java.util.ArrayList;
import java.util.List;

public final class Class9192 {
   public final List<String> field42222 = new ArrayList<String>(20);

   public Class9192 method34434(String var1) {
      int var4 = var1.indexOf(":", 1);
      if (var4 == -1) {
         return !var1.startsWith(":") ? this.method34437("", var1) : this.method34437("", var1.substring(1));
      } else {
         return this.method34437(var1.substring(0, var4), var1.substring(var4 + 1));
      }
   }

   public Class9192 method34435(String var1) {
      int var4 = var1.indexOf(":");
      if (var4 != -1) {
         return this.method34436(var1.substring(0, var4).trim(), var1.substring(var4 + 1));
      } else {
         throw new IllegalArgumentException("Unexpected header: " + var1);
      }
   }

   public Class9192 method34436(String var1, String var2) {
      this.method34440(var1, var2);
      return this.method34437(var1, var2);
   }

   public Class9192 method34437(String var1, String var2) {
      this.field42222.add(var1);
      this.field42222.add(var2.trim());
      return this;
   }

   public Class9192 method34438(String var1) {
      for (int var4 = 0; var4 < this.field42222.size(); var4 += 2) {
         if (var1.equalsIgnoreCase(this.field42222.get(var4))) {
            this.field42222.remove(var4);
            this.field42222.remove(var4);
            var4 -= 2;
         }
      }

      return this;
   }

   public Class9192 method34439(String var1, String var2) {
      this.method34440(var1, var2);
      this.method34438(var1);
      this.method34437(var1, var2);
      return this;
   }

   private void method34440(String var1, String var2) {
      if (var1 == null) {
         throw new NullPointerException("name == null");
      } else if (var1.isEmpty()) {
         throw new IllegalArgumentException("name is empty");
      } else {
         int var5 = 0;

         for (int var6 = var1.length(); var5 < var6; var5++) {
            char var7 = var1.charAt(var5);
            if (var7 <= ' ' || var7 >= 127) {
               throw new IllegalArgumentException(Class9474.method36559("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(var7), var5, var1));
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
                     Class9474.method36559("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(var10), var5, var1, var2)
                  );
               }
            }
         }
      }
   }

   public String method34441(String var1) {
      for (int var4 = this.field42222.size() - 2; var4 >= 0; var4 -= 2) {
         if (var1.equalsIgnoreCase(this.field42222.get(var4))) {
            return this.field42222.get(var4 + 1);
         }
      }

      return null;
   }

   public Class9371 method34442() {
      return new Class9371(this);
   }
}
