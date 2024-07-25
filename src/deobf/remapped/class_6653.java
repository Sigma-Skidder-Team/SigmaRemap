package remapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Random;

public class class_6653 extends class_5892 {
   public static final Codec<class_6653> field_34426 = RecordCodecBuilder.create(
      var0 -> var0.group(
               Codec.FLOAT.fieldOf("min_chance").orElse(0.0F).forGetter(var0x -> var0x.field_34421),
               Codec.FLOAT.fieldOf("max_chance").orElse(0.0F).forGetter(var0x -> var0x.field_34425),
               Codec.INT.fieldOf("min_dist").orElse(0).forGetter(var0x -> var0x.field_34423),
               Codec.INT.fieldOf("max_dist").orElse(0).forGetter(var0x -> var0x.field_34427),
               class_9249.field_47222.fieldOf("axis").orElse(class_9249.field_47216).forGetter(var0x -> var0x.field_34422)
            )
            .apply(var0, class_6653::new)
   );
   private final float field_34421;
   private final float field_34425;
   private final int field_34423;
   private final int field_34427;
   private final class_9249 field_34422;

   public class_6653(float var1, float var2, int var3, int var4, class_9249 var5) {
      if (var3 < var4) {
         this.field_34421 = var1;
         this.field_34425 = var2;
         this.field_34423 = var3;
         this.field_34427 = var4;
         this.field_34422 = var5;
      } else {
         throw new IllegalArgumentException("Invalid range: [" + var3 + "," + var4 + "]");
      }
   }

   @Override
   public boolean method_26953(class_1331 var1, class_1331 var2, class_1331 var3, Random var4) {
      Direction var7 = Direction.method_1043(class_137.field_405, this.field_34422);
      float var8 = (float)Math.abs((var2.method_12173() - var3.method_12173()) * var7.method_1041());
      float var9 = (float)Math.abs((var2.method_12165() - var3.method_12165()) * var7.method_1054());
      float var10 = (float)Math.abs((var2.method_12185() - var3.method_12185()) * var7.method_1034());
      int var11 = (int)(var8 + var9 + var10);
      float var12 = var4.nextFloat();
      return (double)var12
         <= class_9299.method_42841(
            (double)this.field_34421, (double)this.field_34425, class_9299.method_42851((double)var11, (double)this.field_34423, (double)this.field_34427)
         );
   }

   @Override
   public class_6614<?> method_26952() {
      return class_6614.field_34168;
   }
}
