package mapped;

import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import net.minecraft.world.chunk.NibbleArray;
import net.minecraft.world.lighting.LightDataMap;

public final class Class7585 extends LightDataMap<Class7585> {

   public Class7585(Long2ObjectOpenHashMap<NibbleArray> var1) {
      super(var1);
   }

   public Class7585 method24828() {
      return new Class7585(this.field32568.clone());
   }
}
