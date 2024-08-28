package mapped;

import java.io.OutputStream;
import java.io.PrintStream;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class1762 extends PrintStream {
   public static final Logger field9546 = LogManager.getLogger();
   public final String field9547;

   public Class1762(String var1, OutputStream var2) {
      super(var2);
      this.field9547 = var1;
   }

   @Override
   public void println(String var1) {
      this.method7703(var1);
   }

   @Override
   public void println(Object var1) {
      this.method7703(String.valueOf(var1));
   }

   public void method7703(String var1) {
      field9546.info("[{}]: {}", this.field9547, var1);
   }
}
