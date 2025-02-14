package mapped;

import net.minecraft.world.IWorldReader;

public interface IDayTimeReader extends IWorldReader {
   long getLunarTime();

   default float method7000() {
      return DimensionType.MOON_PHASE_FACTORS[this.getDimensionType().getMoonPhase(this.getLunarTime())];
   }

   default float method7001(float var1) {
      return this.getDimensionType().getCelestrialAngleByTime(this.getLunarTime());
   }

   default int method7002() {
      return this.getDimensionType().getMoonPhase(this.getLunarTime());
   }
}
