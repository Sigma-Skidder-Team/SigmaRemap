package mapped;

import com.mentalfrostbyte.jello.module.impl.world.AutoCrystal;
import com.mentalfrostbyte.jello.util.MultiUtilities;

public class Class540 implements Runnable {
   private static String[] field2585;
   public final EnderCrystalEntity field2586;
   public final AutoCrystal field2587;

   public Class540(AutoCrystal var1, EnderCrystalEntity var2) {
      this.field2587 = var1;
      this.field2586 = var2;
   }

   @Override
   public void run() {
      MultiUtilities.swing(this.field2586, true);

      for (int var3 = 0; var3 < 10; var3++) {
         AutoCrystal.method16394().particles.method1195(this.field2586, ParticleTypes.field34054);
      }
   }
}
