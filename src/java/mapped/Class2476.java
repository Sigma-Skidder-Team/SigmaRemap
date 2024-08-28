package mapped;

import javax.annotation.Nullable;

public class Class2476 extends Class2475 {
   private final BlockPos field16563 = null;
   private final BlockPos field16564 = null;
   private final long field16565 = 0L;

   @Override
   public String getMessage() {
      String var3 = ""
         + this.field16563.method8304()
         + ","
         + this.field16563.getY()
         + ","
         + this.field16563.method8306()
         + " (relative: "
         + this.field16564.method8304()
         + ","
         + this.field16564.getY()
         + ","
         + this.field16564.method8306()
         + ")";
      return super.getMessage() + " at " + var3 + " (t=" + 0L + ")";
   }

   @Nullable
   public String method10472() {
      return super.getMessage() + " here";
   }

   @Nullable
   public BlockPos method10473() {
      return this.field16563;
   }

   private Class2476() {
      super("Synthetic constructor added by MCP, do not call");
      throw new RuntimeException("Synthetic constructor added by MCP, do not call");
   }
}
