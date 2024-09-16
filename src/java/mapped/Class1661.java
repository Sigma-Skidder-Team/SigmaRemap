package mapped;

import net.minecraft.world.IWorldReader;

public interface Class1661 extends IWorldReader {
   long method6996();

   default float method7000() {
      return DimensionType.MOON_PHASE_FACTORS[this.method6812().getMoonPhase(this.method6996())];
   }

   default float method7001(float var1) {
      return this.method6812().getCelestrialAngleByTime(this.method6996());
   }

   default int method7002() {
      return this.method6812().getMoonPhase(this.method6996());
   }
}
