package mapped;

import java.io.IOException;

public class Class5058 extends Class5056 {
   private int field23062;
   private int field23063;

   public Class5058() {
      super("H.263 Specific Box");
   }

   @Override
   public void method15262(Class8827 var1) throws IOException {
      this.method15468(var1);
      this.field23062 = var1.method31861();
      this.field23063 = var1.method31861();
   }

   public int method15472() {
      return this.field23062;
   }

   public int method15473() {
      return this.field23063;
   }
}
