package mapped;

import javax.annotation.Nullable;

public final class Class8126 {
   public final Class9371 field34949;
   public final Class4864 field34950;

   public static Class8126 method28148(Class4864 var0) {
      return method28149(null, var0);
   }

   public static Class8126 method28149(Class9371 var0, Class4864 var1) {
      if (var1 != null) {
         if (var0 != null && var0.method35544("Content-Type") != null) {
            throw new IllegalArgumentException("Unexpected header: Content-Type");
         } else if (var0 != null && var0.method35544("Content-Length") != null) {
            throw new IllegalArgumentException("Unexpected header: Content-Length");
         } else {
            return new Class8126(var0, var1);
         }
      } else {
         throw new NullPointerException("body == null");
      }
   }

   public static Class8126 method28150(String var0, String var1) {
      return method28151(var0, null, Class4864.method15010(null, var1));
   }

   public static Class8126 method28151(String var0, String var1, Class4864 var2) {
      if (var0 != null) {
         StringBuilder var5 = new StringBuilder("form-data; name=");
         Class4865.method15021(var5, var0);
         if (var1 != null) {
            var5.append("; filename=");
            Class4865.method15021(var5, var1);
         }

         return method28149(Class9371.method35553("Content-Disposition", var5.toString()), var2);
      } else {
         throw new NullPointerException("name == null");
      }
   }

   private Class8126(Class9371 var1, Class4864 var2) {
      this.field34949 = var1;
      this.field34950 = var2;
   }

   @Nullable
   public Class9371 method28152() {
      return this.field34949;
   }

   public Class4864 method28153() {
      return this.field34950;
   }
}
