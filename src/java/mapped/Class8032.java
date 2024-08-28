package mapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Random;

public class Class8032 extends Class8033 {
   public static final Codec<Class8032> field34514 = RecordCodecBuilder.create(
      var0 -> var0.group(
               Codec.FLOAT.fieldOf("min_chance").orElse(0.0F).forGetter(var0x -> var0x.field34515),
               Codec.FLOAT.fieldOf("max_chance").orElse(0.0F).forGetter(var0x -> var0x.field34516),
               Codec.INT.fieldOf("min_dist").orElse(0).forGetter(var0x -> var0x.field34517),
               Codec.INT.fieldOf("max_dist").orElse(0).forGetter(var0x -> var0x.field34518)
            )
            .apply(var0, Class8032::new)
   );
   private final float field34515;
   private final float field34516;
   private final int field34517;
   private final int field34518;

   public Class8032(float var1, float var2, int var3, int var4) {
      if (var3 < var4) {
         this.field34515 = var1;
         this.field34516 = var2;
         this.field34517 = var3;
         this.field34518 = var4;
      } else {
         throw new IllegalArgumentException("Invalid range: [" + var3 + "," + var4 + "]");
      }
   }

   @Override
   public boolean method27553(BlockPos var1, BlockPos var2, BlockPos var3, Random var4) {
      int var7 = var2.method8321(var3);
      float var8 = var4.nextFloat();
      return (double)var8
         <= MathHelper.method37779(
            (double)this.field34515, (double)this.field34516, MathHelper.method37813((double)var7, (double)this.field34517, (double)this.field34518)
         );
   }

   @Override
   public Class8989<?> method27554() {
      return Class8989.field41002;
   }
}
