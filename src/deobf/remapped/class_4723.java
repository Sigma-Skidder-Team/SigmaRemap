package remapped;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class class_4723 implements class_6743 {
   private static String[] field_22906;
   private List<class_8087> field_22905 = new ArrayList<class_8087>(100);

   private class_4723() {
   }

   public List<class_8087> method_21838() {
      return this.field_22905;
   }

   @Override
   public void method_30889(class_8087 var1) throws IOException {
      this.field_22905.add(var1);
   }
}
