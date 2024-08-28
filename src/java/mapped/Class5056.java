package mapped;

import java.io.IOException;

public abstract class Class5056 extends Class5041 {
   private long field23059;
   private int field23060;

   public Class5056(String var1) {
      super(var1);
   }

   public void method15468(Class8827 var1) throws IOException {
      this.field23059 = var1.method31863(4);
      this.field23060 = var1.method31861();
   }

   public long method15469() {
      return this.field23059;
   }

   public int method15470() {
      return this.field23060;
   }
}
