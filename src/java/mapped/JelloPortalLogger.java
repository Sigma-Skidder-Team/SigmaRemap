package mapped;

import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class JelloPortalLogger extends Logger {
   private final Logger field42696;

   public JelloPortalLogger(Logger var1) {
      super("logger", null);
      this.field42696 = var1;
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
