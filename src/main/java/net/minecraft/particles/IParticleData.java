package net.minecraft.particles;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import mapped.ParticleType;
import net.minecraft.network.PacketBuffer;

public interface IParticleData {
   ParticleType<?> getType();

   void write(PacketBuffer var1);

   String getParameters();

   @Deprecated
   interface IDeserializer<T extends IParticleData> {
      T deserialize(ParticleType<T> var1, StringReader var2) throws CommandSyntaxException;

      T read(ParticleType<T> var1, PacketBuffer var2);
   }
}
