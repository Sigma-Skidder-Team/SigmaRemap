package mapped;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.network.PacketBuffer;
import net.minecraft.particles.IParticleData;

public final class Class6868 implements IParticleData.IDeserializer<Class7435> {
   private static String[] field29793;

   public Class7435 deserialize(ParticleType<Class7435> var1, StringReader var2) throws CommandSyntaxException {
      return (Class7435)var1;
   }

   public Class7435 read(ParticleType<Class7435> var1, PacketBuffer var2) {
      return (Class7435)var1;
   }
}
