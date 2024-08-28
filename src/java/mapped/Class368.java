package mapped;

import com.mentalfrostbyte.jello.sound.Sound;

public class Class368 extends Thread {
   private static String[] field1613;
   public final Sound field1614;

   public Class368(Sound var1) {
      this.field1614 = var1;
   }

   @Override
   public void run() {
      synchronized (this.field1614) {
         if (!Sound.access$200(this.field1614)) {
            Sound.method10540(this.field1614).drain();
         } else {
            Sound.method10540(this.field1614).flush();
         }

         Sound.method10540(this.field1614).stop();
         Sound.method10540(this.field1614).close();
         Sound.method10544(this.field1614, null);
      }
   }
}
