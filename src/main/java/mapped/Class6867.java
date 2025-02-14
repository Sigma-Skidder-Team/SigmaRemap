package mapped;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.block.Block;
import net.minecraft.network.PacketBuffer;
import net.minecraft.particles.IParticleData;

public final class Class6867 implements IParticleData.IDeserializer<BlockParticleData> {
   private static String[] field29792;

   public BlockParticleData deserialize(ParticleType<BlockParticleData> var1, StringReader var2) throws CommandSyntaxException {
      var2.expect(' ');
      return new BlockParticleData(var1, new Class8268(var2, false).method28840(false).method28837());
   }

   public BlockParticleData read(ParticleType<BlockParticleData> var1, PacketBuffer var2) {
      return new BlockParticleData(var1, Block.BLOCK_STATE_IDS.getByValue(var2.readVarInt()));
   }
}
