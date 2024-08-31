package mapped;

import com.mojang.serialization.Codec;
import net.minecraft.block.BlockState;
import net.minecraft.network.PacketBuffer;
import net.minecraft.particles.IParticleData;

public class Class7439 implements IParticleData {
   public static final Class6865<Class7439> field32010 = new Class6867();
   private final ParticleType<Class7439> field32011;
   private final BlockState field32012;

   public static Codec<Class7439> method24025(ParticleType<Class7439> var0) {
      return BlockState.field31585.xmap(var1 -> new Class7439(var0, var1), var0x -> var0x.field32012);
   }

   public Class7439(ParticleType<Class7439> var1, BlockState var2) {
      this.field32011 = var1;
      this.field32012 = var2;
   }

   @Override
   public void write(PacketBuffer var1) {
      var1.writeVarInt(Block.field18610.getId(this.field32012));
   }

   @Override
   public String method24010() {
      return Registry.PARTICLE_TYPE.getKey(this.getType()) + " " + Class8268.toString(this.field32012);
   }

   @Override
   public ParticleType<Class7439> getType() {
      return this.field32011;
   }

   public BlockState method24026() {
      return this.field32012;
   }
}
