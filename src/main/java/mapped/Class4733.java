package mapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class Class4733 implements Class4698 {
   public static final Codec<Class4733> field22410 = RecordCodecBuilder.create(
      var0 -> var0.group(
               Class6698.field29330.fieldOf("trunk_provider").forGetter(var0x -> var0x.field22411),
               Class6698.field29330.fieldOf("leaves_provider").forGetter(var0x -> var0x.field22412),
               Class6819.field29685.fieldOf("foliage_placer").forGetter(var0x -> var0x.field22415),
               Class6896.field29884.fieldOf("trunk_placer").forGetter(var0x -> var0x.field22416),
               Class7617.field32672.fieldOf("minimum_size").forGetter(var0x -> var0x.field22417),
               Class7139.field30696.listOf().fieldOf("decorators").forGetter(var0x -> var0x.field22413),
               Codec.INT.fieldOf("max_water_depth").orElse(0).forGetter(var0x -> var0x.field22418),
               Codec.BOOL.fieldOf("ignore_vines").orElse(false).forGetter(var0x -> var0x.field22419),
               Heightmap.Type.field301.fieldOf("heightmap").forGetter(var0x -> var0x.field22420)
            )
            .apply(var0, Class4733::new)
   );
   public final Class6698 field22411;
   public final Class6698 field22412;
   public final List<Class7139> field22413;
   public transient boolean field22414;
   public final Class6819 field22415;
   public final Class6896 field22416;
   public final Class7617 field22417;
   public final int field22418;
   public final boolean field22419;
   public final Heightmap.Type field22420;

   public Class4733(Class6698 var1, Class6698 var2, Class6819 var3, Class6896 var4, Class7617 var5, List<Class7139> var6, int var7, boolean var8, Heightmap.Type var9) {
      this.field22411 = var1;
      this.field22412 = var2;
      this.field22413 = var6;
      this.field22415 = var3;
      this.field22417 = var5;
      this.field22416 = var4;
      this.field22418 = var7;
      this.field22419 = var8;
      this.field22420 = var9;
   }

   public void method14849() {
      this.field22414 = true;
   }

   public Class4733 method14850(List<Class7139> var1) {
      return new Class4733(
         this.field22411, this.field22412, this.field22415, this.field22416, this.field22417, var1, this.field22418, this.field22419, this.field22420
      );
   }
}
