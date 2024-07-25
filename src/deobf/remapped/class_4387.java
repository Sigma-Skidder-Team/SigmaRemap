package remapped;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class class_4387 extends class_6926 {
   private long field_21506;
   private final List<Long> field_21508 = new ArrayList<Long>();

   public class_4387() {
      super("Track Selection Box");
   }

   @Override
   public void method_18109(class_6041 var1) throws IOException {
      super.method_18109(var1);
      this.field_21506 = var1.method_27524(4);

      while (this.method_18113(var1) > 3L) {
         this.field_21508.add(var1.method_27524(4));
      }
   }

   public long method_20452() {
      return this.field_21506;
   }

   public List<Long> method_20451() {
      return Collections.<Long>unmodifiableList(this.field_21508);
   }
}
