package mapped;

import net.minecraft.client.util.Util;
import net.minecraft.network.play.server.SUpdateBossInfoPacket;
import net.minecraft.util.math.MathHelper;

public class Class3626 extends Class3625 {
   private static String[] field19641;
   public float field19642;
   public long field19643;

   public Class3626(SUpdateBossInfoPacket var1) {
      super(var1.getUniqueId(), var1.getName(), var1.getColor(), var1.getOverlay());
      this.field19642 = var1.getPercent();
      this.field19635 = var1.getPercent();
      this.field19643 = Util.milliTime();
      this.method12281(var1.shouldDarkenSky());
      this.method12282(var1.shouldPlayEndBossMusic());
      this.method12283(var1.shouldCreateFog());
   }

   @Override
   public void method12278(float var1) {
      this.field19635 = this.getPercent();
      this.field19642 = var1;
      this.field19643 = Util.milliTime();
   }

   @Override
   public float getPercent() {
      long var3 = Util.milliTime() - this.field19643;
      float var5 = MathHelper.clamp((float)var3 / 100.0F, 0.0F, 1.0F);
      return MathHelper.lerp(var5, this.field19635, this.field19642);
   }

   public void method12297(SUpdateBossInfoPacket var1) {
      switch (Class7071.field30457[var1.getOperation().ordinal()]) {
         case 1:
            this.method12284(var1.getName());
            break;
         case 2:
            this.method12278(var1.getPercent());
            break;
         case 3:
            this.method12279(var1.getColor());
            this.method12280(var1.getOverlay());
            break;
         case 4:
            this.method12281(var1.shouldDarkenSky());
            this.method12282(var1.shouldPlayEndBossMusic());
      }
   }
}
