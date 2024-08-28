package mapped;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Class8473 implements Class8474 {
   private static String[] field36299;
   private List<Class5931> field36300 = new ArrayList<Class5931>(100);

   private Class8473() {
   }

   public List<Class5931> method29887() {
      return this.field36300;
   }

   @Override
   public void method29888(Class5931 var1) throws IOException {
      this.field36300.add(var1);
   }

   // $VF: synthetic method
   public Class8473(Class4541 var1) {
      this();
   }
}
