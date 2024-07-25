package remapped;

import java.nio.charset.Charset;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

public final class class_1972 {
   private static final String field_9993 = "([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)";
   private static final String field_9999 = "\"([^\"]*)\"";
   private static final Pattern field_9998 = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
   private static final Pattern field_10000 = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");
   private final String field_10001;
   private final String field_9994;
   private final String field_9995;
   private final String field_9996;

   private class_1972(String var1, String var2, String var3, String var4) {
      this.field_10001 = var1;
      this.field_9994 = var2;
      this.field_9995 = var3;
      this.field_9996 = var4;
   }

   @Nullable
   public static class_1972 method_9069(String var0) {
      Matcher var3 = field_9998.matcher(var0);
      if (!var3.lookingAt()) {
         return null;
      } else {
         String var4 = var3.group(1).toLowerCase(Locale.US);
         String var5 = var3.group(2).toLowerCase(Locale.US);
         String var6 = null;
         Matcher var7 = field_10000.matcher(var0);

         for (int var8 = var3.end(); var8 < var0.length(); var8 = var7.end()) {
            var7.region(var8, var0.length());
            if (!var7.lookingAt()) {
               return null;
            }

            String var9 = var7.group(1);
            if (var9 != null && var9.equalsIgnoreCase("charset")) {
               String var10 = var7.group(2);
               String var11;
               if (var10 == null) {
                  var11 = var7.group(3);
               } else {
                  var11 = var10.startsWith("'") && var10.endsWith("'") && var10.length() > 2 ? var10.substring(1, var10.length() - 1) : var10;
               }

               if (var6 != null && !var11.equalsIgnoreCase(var6)) {
                  return null;
               }

               var6 = var11;
            }
         }

         return new class_1972(var0, var4, var5, var6);
      }
   }

   public String method_9068() {
      return this.field_9994;
   }

   public String method_9071() {
      return this.field_9995;
   }

   @Nullable
   public Charset method_9072() {
      return this.method_9073(null);
   }

   @Nullable
   public Charset method_9073(Charset var1) {
      try {
         return this.field_9996 != null ? Charset.forName(this.field_9996) : var1;
      } catch (IllegalArgumentException var5) {
         return var1;
      }
   }

   @Override
   public String toString() {
      return this.field_10001;
   }

   @Override
   public boolean equals(Object var1) {
      return var1 instanceof class_1972 && ((class_1972)var1).field_10001.equals(this.field_10001);
   }

   @Override
   public int hashCode() {
      return this.field_10001.hashCode();
   }
}
