package mapped;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Class5002 extends Class4975 {
   private List<Class6443> field22938;

   public Class5002() {
      super("IPMP Info Box");
   }

   @Override
   public void method15262(Class8827 var1) throws IOException {
      super.method15262(var1);
      this.field22938 = new ArrayList<Class6443>();

      while (this.method15430(var1) > 0L) {
         Class6443 var4 = Class6442.method19559(var1);
         this.field22938.add(var4);
      }
   }

   public List<Class6443> method15353() {
      return Collections.<Class6443>unmodifiableList(this.field22938);
   }
}
