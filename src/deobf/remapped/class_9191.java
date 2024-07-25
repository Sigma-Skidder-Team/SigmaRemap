package remapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class class_9191 {
   public static final Codec<class_9191> field_47012 = RecordCodecBuilder.create(
      var0 -> var0.group(
               Codec.INT.fieldOf("centerX").orElse(0).forGetter(var0x -> var0x.field_47010),
               Codec.INT.fieldOf("centerZ").orElse(0).forGetter(var0x -> var0x.field_47013),
               Codec.INT.fieldOf("radius").orElse(0).forGetter(var0x -> var0x.field_47017),
               Codec.INT.fieldOf("height").orElse(0).forGetter(var0x -> var0x.field_47016),
               Codec.BOOL.fieldOf("guarded").orElse(false).forGetter(var0x -> var0x.field_47011)
            )
            .apply(var0, class_9191::new)
   );
   private final int field_47010;
   private final int field_47013;
   private final int field_47017;
   private final int field_47016;
   private final boolean field_47011;
   private final class_4092 field_47014;

   public class_9191(int var1, int var2, int var3, int var4, boolean var5) {
      this.field_47010 = var1;
      this.field_47013 = var2;
      this.field_47017 = var3;
      this.field_47016 = var4;
      this.field_47011 = var5;
      this.field_47014 = new class_4092((double)(var1 - var3), 0.0, (double)(var2 - var3), (double)(var1 + var3), 256.0, (double)(var2 + var3));
   }

   public boolean method_42368(BlockPos var1) {
      return var1.method_12173() >> 4 == this.field_47010 >> 4 && var1.method_12185() >> 4 == this.field_47013 >> 4;
   }

   public int method_42371() {
      return this.field_47010;
   }

   public int method_42373() {
      return this.field_47013;
   }

   public int method_42367() {
      return this.field_47017;
   }

   public int method_42370() {
      return this.field_47016;
   }

   public boolean method_42366() {
      return this.field_47011;
   }

   public class_4092 method_42372() {
      return this.field_47014;
   }
}
