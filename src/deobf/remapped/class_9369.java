package remapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Supplier;

public class class_9369 extends class_3498 {
   public static final Codec<class_9369> field_47905 = RecordCodecBuilder.create(
      var0 -> var0.group(
               class_6325.field_32306.fieldOf("biomes").forGetter(var0x -> var0x.field_47907),
               Codec.intRange(0, 62).fieldOf("scale").orElse(2).forGetter(var0x -> var0x.field_47908)
            )
            .apply(var0, class_9369::new)
   );
   private final List<Supplier<class_6325>> field_47907;
   private final int field_47906;
   private final int field_47908;

   public class_9369(List<Supplier<class_6325>> var1, int var2) {
      super(var1.stream());
      this.field_47907 = var1;
      this.field_47906 = var2 + 2;
      this.field_47908 = var2;
   }

   @Override
   public Codec<? extends class_3498> method_16088() {
      return field_47905;
   }

   @Override
   public class_3498 method_16083(long var1) {
      return this;
   }

   @Override
   public class_6325 method_28192(int var1, int var2, int var3) {
      return this.field_47907.get(Math.floorMod((var1 >> this.field_47906) + (var3 >> this.field_47906), this.field_47907.size())).get();
   }
}
