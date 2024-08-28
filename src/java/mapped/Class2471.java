package mapped;

import java.io.UnsupportedEncodingException;

public class Class2471 extends RuntimeException {
   private static String[] field16555;
   private final UnsupportedEncodingException field16556;

   public Class2471(UnsupportedEncodingException var1) {
      if (var1 != null) {
         this.field16556 = var1;
      } else {
         throw new IllegalArgumentException();
      }
   }

   public UnsupportedEncodingException method10470() {
      return this.field16556;
   }
}
