package mapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Supplier;

public class Class1687 extends Class1685 {
   public static final Codec<Class1687> field9178 = RecordCodecBuilder.create(
      var0 -> var0.group(
               Biome.field40310.fieldOf("biomes").forGetter(var0x -> var0x.field9179),
               Codec.intRange(0, 62).fieldOf("scale").orElse(2).forGetter(var0x -> var0x.field9181)
            )
            .apply(var0, Class1687::new)
   );
   private final List<Supplier<Biome>> field9179;
   private final int field9180;
   private final int field9181;

   public Class1687(List<Supplier<Biome>> var1, int var2) {
      super(var1.stream());
      this.field9179 = var1;
      this.field9180 = var2 + 2;
      this.field9181 = var2;
   }

   @Override
   public Codec<? extends Class1685> method7199() {
      return field9178;
   }

   @Override
   public Class1685 method7200(long var1) {
      return this;
   }

   @Override
   public Biome method7005(int var1, int var2, int var3) {
      return this.field9179.get(Math.floorMod((var1 >> this.field9180) + (var3 >> this.field9180), this.field9179.size())).get();
   }
}
