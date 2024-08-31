package mapped;

import com.mojang.serialization.Codec;
import net.minecraft.particles.IParticleData;

public abstract class ParticleType<T extends IParticleData> {
   private final boolean field31995;
   private final IParticleData.IDeserializer<T> field31996;

   public ParticleType(boolean var1, IParticleData.IDeserializer<T> var2) {
      this.field31995 = var1;
      this.field31996 = var2;
   }

   public boolean method24006() {
      return this.field31995;
   }

   public IParticleData.IDeserializer<T> getDeserializer() {
      return this.field31996;
   }

   public abstract Codec<T> method24005();
}
