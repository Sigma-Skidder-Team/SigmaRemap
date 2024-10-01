package mapped;

import java.io.IOException;

public class Class5061 extends Class5056 {
   private int field23072;
   private int field23073;
   private int field23074;

   public Class5061() {
      super("AMR Specific Box");
   }

   @Override
   public void method15262(DataStreamReader var1) throws IOException {
      this.method15468(var1);
      this.field23072 = (int)var1.readBits(2);
      this.field23073 = var1.readInt();
      this.field23074 = var1.readInt();
   }

   public int method15482() {
      return this.field23072;
   }

   public int method15483() {
      return this.field23073;
   }

   public int method15484() {
      return this.field23074;
   }
}
