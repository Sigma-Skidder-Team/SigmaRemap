package mapped;

import java.io.IOException;

public class Class5043 extends Class5041 {
   private long field23029;
   private long field23030;
   private long field23031;

   public Class5043() {
      super("Bitrate Box");
   }

   @Override
   public void method15262(Class8827 var1) throws IOException {
      this.field23029 = var1.method31863(4);
      this.field23030 = var1.method31863(4);
      this.field23031 = var1.method31863(4);
   }

   public long method15444() {
      return this.field23029;
   }

   public long method15445() {
      return this.field23030;
   }

   public long method15446() {
      return this.field23031;
   }
}
