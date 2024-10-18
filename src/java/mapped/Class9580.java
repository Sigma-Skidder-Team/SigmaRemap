package mapped;

import net.minecraft.command.CommandSource;
import net.minecraft.util.math.MathHelper;

public final class Class9580 {
   private static String[] field44784;
   private final float field44785;
   private final boolean field44786;

   public Class9580(float var1, boolean var2) {
      this.field44785 = var1;
      this.field44786 = var2;
   }

   public float method37196(CommandSource var1) {
      return MathHelper.wrapDegrees(!this.field44786 ? this.field44785 : this.field44785 + var1.method20176().y);
   }
}
