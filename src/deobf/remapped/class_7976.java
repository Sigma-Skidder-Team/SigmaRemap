package remapped;

import java.io.IOException;

public enum class_7976 {
   field_40848("http/1.0"),
   field_40847("http/1.1"),
   /** @deprecated */
   field_40850("spdy/3.1"),
   field_40849("h2");

   private final String field_40846;

   private class_7976(String var3) {
      this.field_40846 = var3;
   }

   public static class_7976 method_36139(String var0) throws IOException {
      if (!var0.equals(field_40848.field_40846)) {
         if (!var0.equals(field_40847.field_40846)) {
            if (!var0.equals(field_40849.field_40846)) {
               if (!var0.equals(field_40850.field_40846)) {
                  throw new IOException("Unexpected protocol: " + var0);
               } else {
                  return field_40850;
               }
            } else {
               return field_40849;
            }
         } else {
            return field_40847;
         }
      } else {
         return field_40848;
      }
   }

   @Override
   public String toString() {
      return this.field_40846;
   }
}
