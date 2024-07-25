package remapped;

import javax.annotation.Nullable;

public class class_2832 extends class_699 {
   private final class_1331 field_13874 = null;
   private final class_1331 field_13876 = null;
   private final long field_13875 = 0L;

   @Override
   public String getMessage() {
      String var3 = ""
         + this.field_13874.method_12173()
         + ","
         + this.field_13874.method_12165()
         + ","
         + this.field_13874.method_12185()
         + " (relative: "
         + this.field_13876.method_12173()
         + ","
         + this.field_13876.method_12165()
         + ","
         + this.field_13876.method_12185()
         + ")";
      return super.getMessage() + " at " + var3 + " (t=" + 0L + ")";
   }

   @Nullable
   public String method_12876() {
      return super.getMessage() + " here";
   }

   @Nullable
   public class_1331 method_12875() {
      return this.field_13874;
   }

   private class_2832() {
      super("Synthetic constructor added by MCP, do not call");
      throw new RuntimeException("Synthetic constructor added by MCP, do not call");
   }
}
