package remapped;

import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class class_7779 extends Logger {
   private final Logger field_39430;

   public class_7779(Logger var1) {
      super("logger", null);
      this.field_39430 = var1;
   }

   @Override
   public void log(LogRecord var1) {
      this.log(var1.getLevel(), var1.getMessage());
   }

   @Override
   public void log(Level var1, String var2) {
   }

   @Override
   public void log(Level var1, String var2, Object var3) {
   }

   @Override
   public void log(Level var1, String var2, Object[] var3) {
      this.log(var1, MessageFormat.format(var2.replaceAll("ViaVersion", "Jello Portal"), var3));
   }

   @Override
   public void log(Level var1, String var2, Throwable var3) {
   }
}
