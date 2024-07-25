package remapped;

import java.io.IOException;

public class class_5381 extends IOException {
   private static final long field_27464 = -3001637554903912905L;
   private final CharSequence field_27461;
   private final int field_27463;

   public class_5381(String var1, CharSequence var2, int var3) {
      super(var1);
      this.field_27461 = var2;
      this.field_27463 = var3;
   }

   @Override
   public String getMessage() {
      return super.getMessage() + "(at position " + this.field_27463 + ")";
   }
}
