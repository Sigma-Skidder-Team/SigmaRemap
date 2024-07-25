package remapped;

import javax.annotation.Nullable;

public class class_2832 extends class_699 {
   private final BlockPos field_13874 = null;
   private final BlockPos field_13876 = null;
   private final long field_13875 = 0L;

   @Override
   public String getMessage() {
      String var3 = ""
         + this.field_13874.getX()
         + ","
         + this.field_13874.getY()
         + ","
         + this.field_13874.getZ()
         + " (relative: "
         + this.field_13876.getX()
         + ","
         + this.field_13876.getY()
         + ","
         + this.field_13876.getZ()
         + ")";
      return super.getMessage() + " at " + var3 + " (t=" + 0L + ")";
   }

   @Nullable
   public String method_12876() {
      return super.getMessage() + " here";
   }

   @Nullable
   public BlockPos method_12875() {
      return this.field_13874;
   }

   private class_2832() {
      super("Synthetic constructor added by MCP, do not call");
      throw new RuntimeException("Synthetic constructor added by MCP, do not call");
   }
}
