package mapped;

import java.io.IOException;

public enum Class2201 {
   field14385("http/1.0"),
   field14386("http/1.1"),
   /** @deprecated */
   field14387("spdy/3.1"),
   field14388("h2");

   private final String field14389;
   private static final Class2201[] field14390 = new Class2201[]{field14385, field14386, field14387, field14388};

   private Class2201(String var3) {
      this.field14389 = var3;
   }

   public static Class2201 method8918(String var0) throws IOException {
      if (!var0.equals(field14385.field14389)) {
         if (!var0.equals(field14386.field14389)) {
            if (!var0.equals(field14388.field14389)) {
               if (!var0.equals(field14387.field14389)) {
                  throw new IOException("Unexpected protocol: " + var0);
               } else {
                  return field14387;
               }
            } else {
               return field14388;
            }
         } else {
            return field14386;
         }
      } else {
         return field14385;
      }
   }

   @Override
   public String toString() {
      return this.field14389;
   }
}
