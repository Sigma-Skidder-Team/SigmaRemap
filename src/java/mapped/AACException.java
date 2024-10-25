package mapped;

import java.io.IOException;

public class AACException extends IOException {
   private static String[] field16541;
   private final boolean field16542;

   public AACException(String var1) {
      this(var1, false);
   }

   public AACException(String var1, boolean var2) {
      super(var1);
      this.field16542 = var2;
   }

   public AACException(Throwable var1) {
      super(var1);
      this.field16542 = false;
   }

   public boolean method10466() {
      return this.field16542;
   }
}
