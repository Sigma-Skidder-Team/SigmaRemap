package mapped;

import java.util.Locale;

public class Class6111 extends Class6109 implements Class6112 {
   private final String field27375;
   private final int field27376;

   public Class6111(String var1, int var2) {
      this.field27375 = var1;
      this.field27376 = var2;
   }

   public int method18874() {
      return this.field27376;
   }

   @Override
   public String toString() {
      return String.format(Locale.ROOT, "%s --> %.2f ms", this.field27375, (float)this.field27376);
   }
}
