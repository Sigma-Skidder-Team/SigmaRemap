package mapped;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Class5090 extends FullBox {
   private long field23175;
   private final List<Long> field23176 = new ArrayList<Long>();

   public Class5090() {
      super("Track Selection Box");
   }

   @Override
   public void method15262(MP4InputStream var1) throws IOException {
      super.method15262(var1);
      this.field23175 = var1.readBits(4);

      while (this.method15430(var1) > 3L) {
         this.field23176.add(var1.readBits(4));
      }
   }

   public long method15573() {
      return this.field23175;
   }

   public List<Long> method15574() {
      return Collections.<Long>unmodifiableList(this.field23176);
   }
}
