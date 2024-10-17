package mapped;

import com.mentalfrostbyte.jello.gui.screens.JelloMaps;
import com.mentalfrostbyte.jello.unmapped.IconPanel;

public class Class605 implements Runnable {
   private static String[] field2986;
   public final JelloMaps field2987;
   public final IconPanel field2988;
   public final JelloMaps field2989;

   public Class605(JelloMaps var1, JelloMaps var2, IconPanel var3) {
      this.field2989 = var1;
      this.field2987 = var2;
      this.field2988 = var3;
   }

   @Override
   public void run() {
      this.field2987.method13236(this.field2988);
      this.field2987.field21041 = null;
   }
}
