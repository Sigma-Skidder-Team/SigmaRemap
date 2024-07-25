package remapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class class_1297 implements class_6157 {
   public static final Codec<class_1297> field_7152 = RecordCodecBuilder.create(
      var0 -> var0.group(
               class_7732.field_39221.fieldOf("trunk_provider").forGetter(var0x -> var0x.field_7145),
               class_7732.field_39221.fieldOf("leaves_provider").forGetter(var0x -> var0x.field_7151),
               class_2062.field_10418.fieldOf("foliage_placer").forGetter(var0x -> var0x.field_7147),
               class_1131.field_6447.fieldOf("trunk_placer").forGetter(var0x -> var0x.field_7154),
               class_8294.field_42499.fieldOf("minimum_size").forGetter(var0x -> var0x.field_7146),
               class_6291.field_32155.listOf().fieldOf("decorators").forGetter(var0x -> var0x.field_7156),
               Codec.INT.fieldOf("max_water_depth").orElse(0).forGetter(var0x -> var0x.field_7149),
               Codec.BOOL.fieldOf("ignore_vines").orElse(false).forGetter(var0x -> var0x.field_7148),
               class_3801.field_18596.fieldOf("heightmap").forGetter(var0x -> var0x.field_7150)
            )
            .apply(var0, class_1297::new)
   );
   public final class_7732 field_7145;
   public final class_7732 field_7151;
   public final List<class_6291> field_7156;
   public transient boolean field_7153;
   public final class_2062 field_7147;
   public final class_1131 field_7154;
   public final class_8294 field_7146;
   public final int field_7149;
   public final boolean field_7148;
   public final class_3801 field_7150;

   public class_1297(
      class_7732 var1, class_7732 var2, class_2062 var3, class_1131 var4, class_8294 var5, List<class_6291> var6, int var7, boolean var8, class_3801 var9
   ) {
      this.field_7145 = var1;
      this.field_7151 = var2;
      this.field_7156 = var6;
      this.field_7147 = var3;
      this.field_7146 = var5;
      this.field_7154 = var4;
      this.field_7149 = var7;
      this.field_7148 = var8;
      this.field_7150 = var9;
   }

   public void method_5885() {
      this.field_7153 = true;
   }

   public class_1297 method_5886(List<class_6291> var1) {
      return new class_1297(
         this.field_7145, this.field_7151, this.field_7147, this.field_7154, this.field_7146, var1, this.field_7149, this.field_7148, this.field_7150
      );
   }
}
