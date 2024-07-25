package remapped;

import java.io.IOException;

public class class_5060 extends IOException {
   private static String[] field_26169;
   private final boolean field_26170;

   public class_5060(String var1) {
      this(var1, false);
   }

   public class_5060(String var1, boolean var2) {
      super(var1);
      this.field_26170 = var2;
   }

   public class_5060(Throwable var1) {
      super(var1);
      this.field_26170 = false;
   }

   public boolean method_23320() {
      return this.field_26170;
   }
}
