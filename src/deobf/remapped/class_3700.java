package remapped;

import java.io.DataInput;
import java.io.IOException;

public final class class_3700 implements class_3265<class_9413> {
   public class_9413 method_17194(DataInput var1, int var2, class_4694 var3) throws IOException {
      var3.method_21668(96L);
      return class_9413.method_43597(var1.readInt());
   }

   @Override
   public String method_14892() {
      return "INT";
   }

   @Override
   public String method_14888() {
      return "TAG_Int";
   }

   @Override
   public boolean method_14889() {
      return true;
   }
}
