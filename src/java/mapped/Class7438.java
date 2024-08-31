package mapped;

import com.mojang.serialization.Codec;
import net.minecraft.network.PacketBuffer;
import net.minecraft.particles.IParticleData;

public class Class7438 implements IParticleData {
   public static final Class6865<Class7438> field32007 = new Class6866();
   private final ParticleType<Class7438> field32008;
   private final ItemStack field32009;

   public static Codec<Class7438> method24021(ParticleType<Class7438> var0) {
      return ItemStack.field39971.xmap(var1 -> new Class7438(var0, var1), var0x -> var0x.field32009);
   }

   public Class7438(ParticleType<Class7438> var1, ItemStack var2) {
      this.field32008 = var1;
      this.field32009 = var2;
   }

   @Override
   public void write(PacketBuffer var1) {
      var1.method35724(this.field32009);
   }

   @Override
   public String method24010() {
      return Registry.PARTICLE_TYPE.getKey(this.getType()) + " " + new Class176(this.field32009.getItem(), this.field32009.method32142()).method504();
   }

   @Override
   public ParticleType<Class7438> getType() {
      return this.field32008;
   }

   public ItemStack method24022() {
      return this.field32009;
   }
}
