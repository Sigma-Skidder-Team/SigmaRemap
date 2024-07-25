package remapped;

import java.io.IOException;

public class class_505 implements class_120 {
   private static String[] field_3126;

   public class_505(class_3624 var1, class_3624 var2) {
      this.field_3128 = var1;
      this.field_3127 = var2;
   }

   @Override
   public void method_350(class_4365 var1, IOException var2) {
      class_3624.method_16883(this.field_3127, var2);
   }

   @Override
   public void method_351(class_4365 var1, class_7839 var2) throws IOException {
      class_3624.method_16887(this.field_3127, var2);
      class_3624.method_16881(this.field_3127, var2.method_35479().method_36950());

      try {
         if (var2.method_35491()) {
            class_3624.method_16889(this.field_3127);
         } else {
            class_3624.method_16883(this.field_3127, new IOException(Integer.toString(var2.method_35490())));
         }
      } finally {
         var2.close();
      }
   }
}
