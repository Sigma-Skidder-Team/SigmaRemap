package remapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class class_3161 {
   public static final Codec<class_3161> field_15713 = RecordCodecBuilder.create(
      var0 -> var0.group(
               class_8461.field_43261.fieldOf("sound").forGetter(var0x -> var0x.field_15712),
               Codec.INT.fieldOf("tick_delay").forGetter(var0x -> var0x.field_15711),
               Codec.INT.fieldOf("block_search_extent").forGetter(var0x -> var0x.field_15714),
               Codec.DOUBLE.fieldOf("offset").forGetter(var0x -> var0x.field_15710)
            )
            .apply(var0, class_3161::new)
   );
   public static final class_3161 field_15715 = new class_3161(class_463.field_1965, 6000, 8, 2.0);
   private class_8461 field_15712;
   private int field_15711;
   private int field_15714;
   private double field_15710;

   public class_3161(class_8461 var1, int var2, int var3, double var4) {
      this.field_15712 = var1;
      this.field_15711 = var2;
      this.field_15714 = var3;
      this.field_15710 = var4;
   }

   public class_8461 method_14592() {
      return this.field_15712;
   }

   public int method_14590() {
      return this.field_15711;
   }

   public int method_14589() {
      return this.field_15714;
   }

   public double method_14591() {
      return this.field_15710;
   }
}
