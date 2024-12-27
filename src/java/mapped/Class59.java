package mapped;

import com.google.common.math.IntMath;
import it.unimi.dsi.fastutil.doubles.DoubleList;
import net.minecraft.util.math.shapes.VoxelShapes;

public final class Class59 implements Class56 {
   private static String[] field127;
   private final Class53 field128;
   private final int field129;
   private final int field130;
   private final int field131;

   public Class59(int var1, int var2) {
      this.field128 = new Class53((int) VoxelShapes.method27430(var1, var2));
      this.field129 = var1;
      this.field130 = var2;
      this.field131 = IntMath.gcd(var1, var2);
   }

   @Override
   public boolean method192(Class7775 var1) {
      int var4 = this.field129 / this.field131;
      int var5 = this.field130 / this.field131;

      for (int var6 = 0; var6 <= this.field128.size(); var6++) {
         if (!var1.method25758(var6 / var5, var6 / var4, var6)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public DoubleList method194() {
      return this.field128;
   }
}
