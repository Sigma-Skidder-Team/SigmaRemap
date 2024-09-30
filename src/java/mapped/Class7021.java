package mapped;

import net.minecraft.util.math.ChunkPos;
import net.minecraft.world.server.ChunkManager;

public class Class7021 implements Class7022 {
   public final ChunkPos field30329;
   public final ChunkManager field30330;

   public Class7021(ChunkManager var1, ChunkPos var2) {
      this.field30330 = var1;
      this.field30329 = var2;
   }

   @Override
   public String toString() {
      return "Unloaded " + this.field30329.toString();
   }
}
