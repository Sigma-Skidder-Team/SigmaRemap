package remapped;

import java.security.PrivilegedAction;

public final class class_4083 implements PrivilegedAction {
   @Override
   public Object run() {
      String var3 = System.getProperty("org.newdawn.slick.forceVerboseLog");
      if (var3 != null && var3.equalsIgnoreCase("true")) {
         class_2598.method_11786();
      }

      return null;
   }
}
