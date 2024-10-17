package mapped;

import com.mentalfrostbyte.jello.gui.screens.JelloMaps;
import net.minecraft.util.math.vector.Vector3i;

public class Class774 implements Runnable {
   public final JelloMaps field4039;
   public final int field4040;
   public final int field4041;
   public final Vector3i field4042;
   public final JelloMaps field4043;

   public Class774(JelloMaps var1, JelloMaps var2, int var3, int var4, Vector3i var5) {
      this.field4043 = var1;
      this.field4039 = var2;
      this.field4040 = var3;
      this.field4041 = var4;
      this.field4042 = var5;
   }

   @Override
   public void run() {
      if (this.field4043.field21041 == null) {
         this.field4039.addToList(this.field4043.field21041 = new Class4276(this.field4039, "popover", this.field4040, this.field4041, this.field4042));
         JelloMaps.method13394(this.field4043, this.field4043.field21041);
      }
   }
}
