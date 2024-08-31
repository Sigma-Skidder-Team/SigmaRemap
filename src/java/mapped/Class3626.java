package mapped;

import net.minecraft.client.util.Util;
import net.minecraft.network.play.server.SUpdateBossInfoPacket;

public class Class3626 extends Class3625 {
   private static String[] field19641;
   public float field19642;
   public long field19643;

   public Class3626(SUpdateBossInfoPacket var1) {
      super(var1.method17205(), var1.method17207(), var1.method17209(), var1.method17210());
      this.field19642 = var1.method17208();
      this.field19635 = var1.method17208();
      this.field19643 = Util.milliTime();
      this.method12281(var1.method17211());
      this.method12282(var1.method17212());
      this.method12283(var1.method17213());
   }

   @Override
   public void method12278(float var1) {
      this.field19635 = this.method12291();
      this.field19642 = var1;
      this.field19643 = Util.milliTime();
   }

   @Override
   public float method12291() {
      long var3 = Util.milliTime() - this.field19643;
      float var5 = MathHelper.method37777((float)var3 / 100.0F, 0.0F, 1.0F);
      return MathHelper.lerp(var5, this.field19635, this.field19642);
   }

   public void method12297(SUpdateBossInfoPacket var1) {
      switch (Class7071.field30457[var1.method17206().ordinal()]) {
         case 1:
            this.method12284(var1.method17207());
            break;
         case 2:
            this.method12278(var1.method17208());
            break;
         case 3:
            this.method12279(var1.method17209());
            this.method12280(var1.method17210());
            break;
         case 4:
            this.method12281(var1.method17211());
            this.method12282(var1.method17212());
      }
   }
}
