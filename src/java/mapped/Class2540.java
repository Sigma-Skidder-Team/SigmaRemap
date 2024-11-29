package mapped;

import lol.Log;

import java.security.PrivilegedAction;

public final class Class2540 implements PrivilegedAction {
   @Override
   public Object run() {
      String var3 = System.getProperty("org.newdawn.slick.forceVerboseLog");
      if (var3 != null && var3.equalsIgnoreCase("true")) {
         Log.method25659();
      }

      return null;
   }
}
