package mapped;

import java.io.IOException;

public class Class5059 extends Class5056 {
   private int field23064;

   public Class5059() {
      super("EVCR Specific Box");
   }

   @Override
   public void method15262(DataStreamReader var1) throws IOException {
      this.method15468(var1);
      this.field23064 = var1.readInt();
   }

   public int method15474() {
      return this.field23064;
   }
}
