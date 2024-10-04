package mapped;

import lol.ImageDataFactory;
import lol.Log;

public final class PrivilegedAction implements java.security.PrivilegedAction {
   @Override
   public Object run() {
      String var3 = System.getProperty("org.newdawn.slick.pngloader");
      if ("false".equalsIgnoreCase(var3)) {
         ImageDataFactory.method31205(false);
      }

      Log.method25665("Use Java PNG Loader = " + ImageDataFactory.method31206());
      return null;
   }
}
