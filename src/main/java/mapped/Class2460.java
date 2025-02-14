package mapped;

import java.io.IOException;

public class Class2460 extends IOException {
   private static String[] field16541;
   private final boolean field16542;

   public Class2460(String var1) {
      this(var1, false);
   }

   public Class2460(String var1, boolean var2) {
      super(var1);
      this.field16542 = var2;
   }

   public Class2460(Throwable var1) {
      super(var1);
      this.field16542 = false;
   }

   public boolean method10466() {
      return this.field16542;
   }
}
