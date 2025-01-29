package mapped;

import org.newdawn.slick.util.Log;

import java.security.PrivilegedAction;

public class Class2539 implements PrivilegedAction {
   public final Class9219 field16762;

   public Class2539(Class9219 var1) {
      this.field16762 = var1;
   }

   @Override
   public Object run() {
      try {
         Class9219.field42429 = new Class7426("org/newdawn/slick/data/defaultfont.fnt", "org/newdawn/slick/data/defaultfont.png");
      } catch (Class2451 var4) {
         Log.error(var4);
      }

      return null;
   }
}
