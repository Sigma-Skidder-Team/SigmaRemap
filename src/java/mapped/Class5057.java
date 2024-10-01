package mapped;

import java.io.IOException;

public class Class5057 extends Class5056 {
   private int field23061;

   public Class5057() {
      super("SMV Specific Structure");
   }

   @Override
   public void method15262(DataStreamReader var1) throws IOException {
      this.method15468(var1);
      this.field23061 = var1.readInt();
   }

   public int method15471() {
      return this.field23061;
   }
}
