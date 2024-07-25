package remapped;

import java.io.UnsupportedEncodingException;

public class class_3341 extends RuntimeException {
   private static String[] field_16487;
   private final UnsupportedEncodingException field_16488;

   public class_3341(UnsupportedEncodingException var1) {
      if (var1 != null) {
         this.field_16488 = var1;
      } else {
         throw new IllegalArgumentException();
      }
   }

   public UnsupportedEncodingException method_15338() {
      return this.field_16488;
   }
}
