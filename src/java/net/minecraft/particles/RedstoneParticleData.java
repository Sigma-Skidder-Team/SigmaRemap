package net.minecraft.particles;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import mapped.*;
import net.minecraft.network.PacketBuffer;

import java.util.Locale;

public class RedstoneParticleData implements IParticleData {
   public static final RedstoneParticleData REDSTONE_DUST = new RedstoneParticleData(1.0F, 0.0F, 0.0F, 1.0F);
   public static final Codec<RedstoneParticleData> field_239802_b_ = RecordCodecBuilder.create(
      var0 -> var0.group(
               Codec.FLOAT.fieldOf("r").forGetter(var0x -> var0x.red),
               Codec.FLOAT.fieldOf("g").forGetter(var0x -> var0x.green),
               Codec.FLOAT.fieldOf("b").forGetter(var0x -> var0x.blue),
               Codec.FLOAT.fieldOf("scale").forGetter(var0x -> var0x.alpha)
            )
            .apply(var0, RedstoneParticleData::new)
   );
   public static final IParticleData.IDeserializer<RedstoneParticleData> DESERIALIZER = new IParticleData.IDeserializer<RedstoneParticleData>()
   {
      public RedstoneParticleData deserialize(ParticleType<RedstoneParticleData> particleTypeIn, StringReader reader) throws CommandSyntaxException
      {
         reader.expect(' ');
         float f = (float)reader.readDouble();
         reader.expect(' ');
         float f1 = (float)reader.readDouble();
         reader.expect(' ');
         float f2 = (float)reader.readDouble();
         reader.expect(' ');
         float f3 = (float)reader.readDouble();
         return new RedstoneParticleData(f, f1, f2, f3);
      }
      public RedstoneParticleData read(ParticleType<RedstoneParticleData> particleTypeIn, PacketBuffer buffer)
      {
         return new RedstoneParticleData(buffer.readFloat(), buffer.readFloat(), buffer.readFloat(), buffer.readFloat());
      }
   };
   private final float red;
   private final float green;
   private final float blue;
   private final float alpha;

   public RedstoneParticleData(float var1, float var2, float var3, float var4) {
      this.red = var1;
      this.green = var2;
      this.blue = var3;
      this.alpha = MathHelper.clamp(var4, 0.01F, 4.0F);
   }

   @Override
   public void write(PacketBuffer var1) {
      var1.writeFloat(this.red);
      var1.writeFloat(this.green);
      var1.writeFloat(this.blue);
      var1.writeFloat(this.alpha);
   }

   @Override
   public String getParameters() {
      return String.format(
         Locale.ROOT,
         "%s %.2f %.2f %.2f %.2f",
         Registry.PARTICLE_TYPE.getKey(this.getType()),
         this.red,
         this.green,
         this.blue,
         this.alpha
      );
   }

   @Override
   public ParticleType<RedstoneParticleData> getType() {
      return ParticleTypes.field34062;
   }

   public float getRed() {
      return this.red;
   }

   public float getGreen() {
      return this.green;
   }

   public float getBlue() {
      return this.blue;
   }

   public float getAlpha() {
      return this.alpha;
   }
}
