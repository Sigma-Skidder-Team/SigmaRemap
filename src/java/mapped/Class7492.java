package mapped;

import net.minecraft.util.Util;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class7492 implements Class7493 {
   private static final Logger field32195 = LogManager.getLogger();

   @Override
   public void method24422(Class8262 var1) {
      if (!var1.method28818()) {
         field32195.warn("(optional) " + var1.method28806() + " failed. " + Util.getMessage(var1.method28815()));
      } else {
         field32195.error(var1.method28806() + " failed! " + Util.getMessage(var1.method28815()));
      }
   }
}
