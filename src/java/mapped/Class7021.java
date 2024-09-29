package mapped;

import net.minecraft.util.math.ChunkPos;

public class Class7021 implements Class7022 {
   public final ChunkPos field30329;
   public final Class1649 field30330;

   public Class7021(Class1649 var1, ChunkPos var2) {
      this.field30330 = var1;
      this.field30329 = var2;
   }

   @Override
   public String toString() {
      return "Unloaded " + this.field30329.toString();
   }
}
