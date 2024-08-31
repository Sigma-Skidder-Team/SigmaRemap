package mapped;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.network.PacketBuffer;
import net.minecraft.particles.IParticleData;

@Deprecated
public interface Class6865<T extends IParticleData> {
   T method20913(ParticleType<T> var1, StringReader var2) throws CommandSyntaxException;

   T read(ParticleType<T> var1, PacketBuffer var2);
}
