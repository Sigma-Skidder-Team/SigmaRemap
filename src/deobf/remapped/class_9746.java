package remapped;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class class_9746 extends class_3912 {
   private String field_49506;
   private List<Long> field_49508 = new ArrayList<Long>();

   public class_9746() {
      super("Track Reference Box");
   }

   @Override
   public void method_18109(class_6041 var1) throws IOException {
      this.field_49506 = var1.method_27533(4);

      while (this.method_18113(var1) > 3L) {
         this.field_49508.add(var1.method_27524(4));
      }
   }

   public String method_44990() {
      return this.field_49506;
   }

   public List<Long> method_44989() {
      return Collections.<Long>unmodifiableList(this.field_49508);
   }
}
