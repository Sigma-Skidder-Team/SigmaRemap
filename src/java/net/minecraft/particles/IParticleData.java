package net.minecraft.particles;

import mapped.ParticleType;
import net.minecraft.network.PacketBuffer;

public interface IParticleData {
   ParticleType<?> getType();

   void write(PacketBuffer var1);

   String method24010();
}
