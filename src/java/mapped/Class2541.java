package mapped;

import org.newdawn.slick.util.Log;

import java.security.PrivilegedAction;

public class Class2541 implements PrivilegedAction {
   private static String[] field16763;
   public final Class9365 field16764;

   public Class2541(Class9365 var1) {
      this.field16764 = var1;
   }

   @Override
   public Object run() {
      try {
         if (Class9365.method35493(this.field16764) != null) {
            Class9365.method35494(this.field16764, new Image(Class9365.method35495(this.field16764), Class9365.method35493(this.field16764)));
         } else {
            Class9365.method35494(this.field16764, new Image(Class9365.method35495(this.field16764)));
         }
      } catch (Class2451 var4) {
         Log.error(var4);
         Class9365.method35496(this.field16764, null);
      }

      return null;
   }
}
