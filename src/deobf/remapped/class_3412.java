package remapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Random;

public class class_3412 extends class_5892 {
   public static final Codec<class_3412> field_16802 = RecordCodecBuilder.create(
      var0 -> var0.group(
               Codec.FLOAT.fieldOf("min_chance").orElse(0.0F).forGetter(var0x -> var0x.field_16797),
               Codec.FLOAT.fieldOf("max_chance").orElse(0.0F).forGetter(var0x -> var0x.field_16798),
               Codec.INT.fieldOf("min_dist").orElse(0).forGetter(var0x -> var0x.field_16799),
               Codec.INT.fieldOf("max_dist").orElse(0).forGetter(var0x -> var0x.field_16801)
            )
            .apply(var0, class_3412::new)
   );
   private final float field_16797;
   private final float field_16798;
   private final int field_16799;
   private final int field_16801;

   public class_3412(float var1, float var2, int var3, int var4) {
      if (var3 < var4) {
         this.field_16797 = var1;
         this.field_16798 = var2;
         this.field_16799 = var3;
         this.field_16801 = var4;
      } else {
         throw new IllegalArgumentException("Invalid range: [" + var3 + "," + var4 + "]");
      }
   }

   @Override
   public boolean method_26953(BlockPos var1, BlockPos var2, BlockPos var3, Random var4) {
      int var7 = var2.method_12176(var3);
      float var8 = var4.nextFloat();
      return (double)var8
         <= MathHelper.clampedLerp(
            (double)this.field_16797, (double)this.field_16798, MathHelper.method_42851((double)var7, (double)this.field_16799, (double)this.field_16801)
         );
   }

   @Override
   public class_6614<?> method_26952() {
      return class_6614.field_34166;
   }
}
