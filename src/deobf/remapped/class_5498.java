package remapped;

import java.io.DataInput;
import java.io.IOException;

public final class class_5498 implements class_3265<class_5284> {
   public class_5284 method_24964(DataInput var1, int var2, class_4694 var3) throws IOException {
      var3.method_21668(72L);
      return class_5284.method_24120(var1.readByte());
   }

   @Override
   public String method_14892() {
      return "BYTE";
   }

   @Override
   public String method_14888() {
      return "TAG_Byte";
   }

   @Override
   public boolean method_14889() {
      return true;
   }
}
