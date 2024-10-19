package mapped;

import net.minecraft.world.server.ChunkHolder;

public class Class7023 implements ChunkHolder.IChunkLoadingError {
   public final ChunkHolder field30332;

   public Class7023(ChunkHolder var1) {
      this.field30332 = var1;
   }

   @Override
   public String toString() {
      return "Unloaded ticket level " + ChunkHolder.method31073(this.field30332).toString();
   }
}
