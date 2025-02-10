package mapped;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Class5065 extends Class5041 {
   private String field23091;
   private List<Long> field23092 = new ArrayList<Long>();

   public Class5065() {
      super("Track Reference Box");
   }

   @Override
   public void method15262(MP4InputStream var1) throws IOException {
      this.field23091 = var1.readString(4);

      while (this.method15430(var1) > 3L) {
         this.field23092.add(var1.readBits(4));
      }
   }

   public String method15501() {
      return this.field23091;
   }

   public List<Long> method15502() {
      return Collections.<Long>unmodifiableList(this.field23092);
   }
}
