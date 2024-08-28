package mapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Random;

public class Class8035 extends Class8033 {
   public static final Codec<Class8035> field34523 = RecordCodecBuilder.create(
      var0 -> var0.group(
               Codec.FLOAT.fieldOf("min_chance").orElse(0.0F).forGetter(var0x -> var0x.field34524),
               Codec.FLOAT.fieldOf("max_chance").orElse(0.0F).forGetter(var0x -> var0x.field34525),
               Codec.INT.fieldOf("min_dist").orElse(0).forGetter(var0x -> var0x.field34526),
               Codec.INT.fieldOf("max_dist").orElse(0).forGetter(var0x -> var0x.field34527),
               Class113.field417.fieldOf("axis").orElse(Class113.field414).forGetter(var0x -> var0x.field34528)
            )
            .apply(var0, Class8035::new)
   );
   private final float field34524;
   private final float field34525;
   private final int field34526;
   private final int field34527;
   private final Class113 field34528;

   public Class8035(float var1, float var2, int var3, int var4, Class113 var5) {
      if (var3 < var4) {
         this.field34524 = var1;
         this.field34525 = var2;
         this.field34526 = var3;
         this.field34527 = var4;
         this.field34528 = var5;
      } else {
         throw new IllegalArgumentException("Invalid range: [" + var3 + "," + var4 + "]");
      }
   }

   @Override
   public boolean method27553(BlockPos var1, BlockPos var2, BlockPos var3, Random var4) {
      Direction var7 = Direction.method555(Class1892.field11092, this.field34528);
      float var8 = (float)Math.abs((var2.method8304() - var3.method8304()) * var7.method539());
      float var9 = (float)Math.abs((var2.getY() - var3.getY()) * var7.method540());
      float var10 = (float)Math.abs((var2.method8306() - var3.method8306()) * var7.method541());
      int var11 = (int)(var8 + var9 + var10);
      float var12 = var4.nextFloat();
      return (double)var12
         <= Class9679.method37779(
            (double)this.field34524, (double)this.field34525, Class9679.method37813((double)var11, (double)this.field34526, (double)this.field34527)
         );
   }

   @Override
   public Class8989<?> method27554() {
      return Class8989.field41003;
   }
}
