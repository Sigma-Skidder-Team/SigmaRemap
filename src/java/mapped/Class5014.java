package mapped;

import java.io.IOException;

public class Class5014 extends Class4975 {
   private String field22968;

   public Class5014() {
      super("iTunes Metadata Mean Box");
   }

   @Override
   public void method15262(DataStreamReader var1) throws IOException {
      super.method15262(var1);
      this.field22968 = var1.readString((int)this.method15430(var1));
   }

   public String method15371() {
      return this.field22968;
   }
}
