package mapped;

import java.nio.charset.Charset;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

public final class Class7450 {
   private static final String field32050 = "([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)";
   private static final String field32051 = "\"([^\"]*)\"";
   private static final Pattern field32052 = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
   private static final Pattern field32053 = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");
   private final String field32054;
   private final String field32055;
   private final String field32056;
   private final String field32057;

   private Class7450(String var1, String var2, String var3, String var4) {
      this.field32054 = var1;
      this.field32055 = var2;
      this.field32056 = var3;
      this.field32057 = var4;
   }

   @Nullable
   public static Class7450 method24082(String var0) {
      Matcher var3 = field32052.matcher(var0);
      if (!var3.lookingAt()) {
         return null;
      } else {
         String var4 = var3.group(1).toLowerCase(Locale.US);
         String var5 = var3.group(2).toLowerCase(Locale.US);
         String var6 = null;
         Matcher var7 = field32053.matcher(var0);

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

         return new Class7450(var0, var4, var5, var6);
      }
   }

   public String method24083() {
      return this.field32055;
   }

   public String method24084() {
      return this.field32056;
   }

   @Nullable
   public Charset method24085() {
      return this.method24086(null);
   }

   @Nullable
   public Charset method24086(Charset var1) {
      try {
         return this.field32057 != null ? Charset.forName(this.field32057) : var1;
      } catch (IllegalArgumentException var5) {
         return var1;
      }
   }

   @Override
   public String toString() {
      return this.field32054;
   }

   @Override
   public boolean equals(Object var1) {
      return var1 instanceof Class7450 && ((Class7450)var1).field32054.equals(this.field32054);
   }

   @Override
   public int hashCode() {
      return this.field32054.hashCode();
   }
}
