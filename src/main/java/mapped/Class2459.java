package mapped;

import java.io.IOException;

public class Class2459 extends IOException {
   private static final long field16538 = -3001637554903912905L;
   private final CharSequence field16539;
   private final int field16540;

   public Class2459(String var1, CharSequence var2, int var3) {
      super(var1);
      this.field16539 = var2;
      this.field16540 = var3;
   }

   @Override
   public String getMessage() {
      return super.getMessage() + "(at position " + this.field16540 + ")";
   }
}
