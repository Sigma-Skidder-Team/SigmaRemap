package mapped;

import com.mentalfrostbyte.jello.module.impl.world.AutoCrystal;
import net.minecraft.entity.Entity;

import java.util.Comparator;

public class Class3603 implements Comparator<Entity> {
   private static String[] field19564;
   public final AutoCrystal field19565;

   public Class3603(AutoCrystal var1) {
      this.field19565 = var1;
   }

   public int compare(Entity var1, Entity var2) {
      float var5 = AutoCrystal.method16403().player.method3275(var1);
      float var6 = AutoCrystal.method16404().player.method3275(var2);
      if (!(var5 - var6 < 0.0F)) {
         return var5 - var6 != 0.0F ? 1 : 0;
      } else {
         return -1;
      }
   }
}
