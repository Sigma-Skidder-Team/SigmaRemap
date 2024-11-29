package mapped;

import java.io.IOException;

public abstract class Class5050 extends Class5046 {
   private String field23041;

   public Class5050(String var1) {
      super(var1);
   }

   @Override
   public void method15262(DataStreamReader var1) throws IOException {
      super.method15262(var1);
      this.field23041 = var1.method31866((int)this.method15430(var1), "UTF-8");
   }

   public String method15453() {
      return this.field23041;
   }
}
