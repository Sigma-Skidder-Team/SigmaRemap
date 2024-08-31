package mapped;

import net.minecraft.network.PacketBuffer;
import net.minecraft.particles.IParticleData;

public final class Class6482 implements Class6466<IParticleData> {
   private static String[] field28429;

   public void method19646(PacketBuffer var1, IParticleData var2) {
      var1.writeVarInt(Registry.PARTICLE_TYPE.getId(var2.getType()));
      var2.write(var1);
   }

   public IParticleData method19645(PacketBuffer var1) {
      return this.<IParticleData>method19648(var1, (ParticleType<IParticleData>) Registry.PARTICLE_TYPE.method9172(var1.readVarInt()));
   }

   private <T extends IParticleData> T method19648(PacketBuffer var1, ParticleType<T> var2) {
      return (T)var2.getDeserializer().read(var2, var1);
   }

   public IParticleData method19644(IParticleData var1) {
      return var1;
   }
}
