package remapped;

import java.io.DataInput;
import java.io.IOException;

public final class class_2216 implements class_3265<class_7745> {
   public class_7745 method_10244(DataInput var1, int var2, class_4694 var3) throws IOException {
      var3.method_21668(80L);
      return class_7745.method_35070(var1.readShort());
   }

   @Override
   public String method_14892() {
      return "SHORT";
   }

   @Override
   public String method_14888() {
      return "TAG_Short";
   }

   @Override
   public boolean method_14889() {
      return true;
   }
}
