package mapped;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IPMPControlInfo extends Class4975 {
   private List<AudioByteManager> field22938;

   public IPMPControlInfo() {
      super("IPMP Info Box");
   }

   @Override
   public void method15262(Class8827 var1) throws IOException {
      super.method15262(var1);
      this.field22938 = new ArrayList<>();

      while (this.method15430(var1) > 0L) {
         AudioByteManager var4 = Class6442.method19559(var1);
         this.field22938.add(var4);
      }
   }

   public List<AudioByteManager> method15353() {
      return Collections.unmodifiableList(this.field22938);
   }
}
