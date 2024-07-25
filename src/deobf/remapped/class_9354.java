package remapped;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class class_9354 extends class_6926 {
   private List<class_1237> field_47742;

   public class_9354() {
      super("IPMP Info Box");
   }

   @Override
   public void method_18109(class_6041 var1) throws IOException {
      super.method_18109(var1);
      this.field_47742 = new ArrayList<class_1237>();

      while (this.method_18113(var1) > 0L) {
         class_1237 var4 = class_653.method_5492(var1);
         this.field_47742.add(var4);
      }
   }

   public List<class_1237> method_43199() {
      return Collections.<class_1237>unmodifiableList(this.field_47742);
   }
}
