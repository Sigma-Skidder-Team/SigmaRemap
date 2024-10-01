package mapped;

import java.io.IOException;

public class Class5008 extends Class4975 {
   private String field22958;

   public Class5008() {
      super("XML Box");
   }

   @Override
   public void method15262(DataStreamReader var1) throws IOException {
      super.method15262(var1);
      this.field22958 = var1.method31867((int)this.method15430(var1));
   }

   public String method15361() {
      return this.field22958;
   }
}
