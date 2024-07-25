package remapped;

import java.io.DataInput;
import java.io.IOException;

public final class class_9274 implements class_3265<class_3388> {
   public class_3388 method_42727(DataInput var1, int var2, class_4694 var3) throws IOException {
      var3.method_21668(128L);
      return class_3388.method_15658(var1.readLong());
   }

   @Override
   public String method_14892() {
      return "LONG";
   }

   @Override
   public String method_14888() {
      return "TAG_Long";
   }

   @Override
   public boolean method_14889() {
      return true;
   }
}
