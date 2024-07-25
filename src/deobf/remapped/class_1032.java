package remapped;

import java.io.OutputStream;
import java.io.PrintStream;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_1032 extends PrintStream {
   public static final Logger field_5712 = LogManager.getLogger();
   public final String field_5713;

   public class_1032(String var1, OutputStream var2) {
      super(var2);
      this.field_5713 = var1;
   }

   @Override
   public void println(String var1) {
      this.method_4562(var1);
   }

   @Override
   public void println(Object var1) {
      this.method_4562(String.valueOf(var1));
   }

   public void method_4562(String var1) {
      field_5712.info("[{}]: {}", this.field_5713, var1);
   }
}
