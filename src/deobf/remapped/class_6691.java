package remapped;

import java.io.DataInput;
import java.io.IOException;

public final class class_6691 implements class_3265<class_5718> {
   public class_5718 method_30680(DataInput var1, int var2, class_4694 var3) throws IOException {
      var3.method_21668(96L);
      return class_5718.method_25854(var1.readFloat());
   }

   @Override
   public String method_14892() {
      return "FLOAT";
   }

   @Override
   public String method_14888() {
      return "TAG_Float";
   }

   @Override
   public boolean method_14889() {
      return true;
   }
}
