package mapped;

import com.mojang.serialization.Codec;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.network.PacketBuffer;
import net.minecraft.particles.IParticleData;
import net.minecraft.util.registry.Registry;

public class BlockParticleData implements IParticleData {
   public static final IDeserializer<BlockParticleData> field32010 = new Class6867();
   private final ParticleType<BlockParticleData> field32011;
   private final BlockState field32012;

   public static Codec<BlockParticleData> method24025(ParticleType<BlockParticleData> var0) {
      return BlockState.field31585.xmap(var1 -> new BlockParticleData(var0, var1), var0x -> var0x.field32012);
   }

   public BlockParticleData(ParticleType<BlockParticleData> var1, BlockState var2) {
      this.field32011 = var1;
      this.field32012 = var2;
   }

   @Override
   public void write(PacketBuffer var1) {
      var1.writeVarInt(Block.BLOCK_STATE_IDS.getId(this.field32012));
   }

   @Override
   public String getParameters() {
      return Registry.PARTICLE_TYPE.getKey(this.getType()) + " " + Class8268.toString(this.field32012);
   }

   @Override
   public ParticleType<BlockParticleData> getType() {
      return this.field32011;
   }

   public BlockState method24026() {
      return this.field32012;
   }
}
