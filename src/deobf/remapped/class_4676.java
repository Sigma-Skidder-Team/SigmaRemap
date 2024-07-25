package remapped;

import java.io.DataInput;
import java.io.IOException;

public final class class_4676 implements class_3265<class_9708> {
   public class_9708 method_21626(DataInput var1, int var2, class_4694 var3) throws IOException {
      var3.method_21668(128L);
      return class_9708.method_44846(var1.readDouble());
   }

   @Override
   public String method_14892() {
      return "DOUBLE";
   }

   @Override
   public String method_14888() {
      return "TAG_Double";
   }

   @Override
   public boolean method_14889() {
      return true;
   }
}
