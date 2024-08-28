package mapped;

import java.io.IOException;

public class Class5062 extends Class5056 {
   private int field23075;

   public Class5062() {
      super("QCELP Specific Box");
   }

   @Override
   public void method15262(Class8827 var1) throws IOException {
      this.method15468(var1);
      this.field23075 = var1.method31861();
   }

   public int method15485() {
      return this.field23075;
   }
}
