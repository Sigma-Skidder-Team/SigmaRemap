package remapped;

import java.security.PrivilegedAction;

public final class class_6347 implements PrivilegedAction {
   @Override
   public Object run() {
      String var3 = System.getProperty("org.newdawn.slick.pngloader");
      if ("false".equalsIgnoreCase(var3)) {
         class_5449.method_24835(false);
      }

      class_2598.method_11779("Use Java PNG Loader = " + class_5449.method_24834());
      return null;
   }
}
