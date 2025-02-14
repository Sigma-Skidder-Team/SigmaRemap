package mapped;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.SectionPos;
import net.minecraft.world.chunk.NibbleArray;
import net.minecraft.world.lighting.IWorldLightListener;

import javax.annotation.Nullable;

public enum Class199 implements IWorldLightListener {
   field743;

   private static final Class199[] field744 = new Class199[]{field743};

   @Nullable
   @Override
   public NibbleArray method642(SectionPos var1) {
      return null;
   }

   @Override
   public int method643(BlockPos var1) {
      return 0;
   }

   @Override
   public void updateSectionStatus(SectionPos var1, boolean var2) {
   }
}
