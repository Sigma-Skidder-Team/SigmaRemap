package mapped;

import java.util.regex.Pattern;

public final class Class8260 {
   private final Class9757 field35504;
   private final Pattern field35505;

   public Class8260(Class9757 var1, Pattern var2) {
      this.field35504 = var1;
      this.field35505 = var2;
   }

   public Class9757 method28797() {
      return this.field35504;
   }

   public Pattern method28798() {
      return this.field35505;
   }

   @Override
   public String toString() {
      return "Tuple tag=" + this.field35504 + " regexp=" + this.field35505;
   }
}
