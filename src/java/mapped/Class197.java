package mapped;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.SectionPos;

public interface Class197 {
   default void method641(BlockPos var1, boolean var2) {
      this.updateSectionStatus(SectionPos.method8390(var1), var2);
   }

   void updateSectionStatus(SectionPos var1, boolean var2);
}
