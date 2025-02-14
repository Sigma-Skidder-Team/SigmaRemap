package mapped;

import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.SectionPos;
import net.minecraft.world.LightType;
import net.minecraft.world.chunk.IChunkLightProvider;
import net.minecraft.world.chunk.NibbleArray;
import net.minecraft.world.lighting.SectionLightStorage;

public class Class209 extends SectionLightStorage<Class7585> {

   public Class209(IChunkLightProvider var1) {
      super(LightType.BLOCK, var1, new Class7585(new Long2ObjectOpenHashMap<>()));
   }

   @Override
   public int method702(long var1) {
      long var5 = SectionPos.worldToSection(var1);
      NibbleArray var7 = this.method699(var5, false);
      return var7 != null
         ? var7.get(
            SectionPos.mask(BlockPos.unpackX(var1)),
            SectionPos.mask(BlockPos.unpackY(var1)),
            SectionPos.mask(BlockPos.unpackZ(var1))
         )
         : 0;
   }
}
