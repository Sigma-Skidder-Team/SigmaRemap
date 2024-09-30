package net.minecraft.world.gen.settings;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class StructureSpreadSettings {
   public static final Codec<StructureSpreadSettings> field42537 = RecordCodecBuilder.create(
      var0 -> var0.group(
               Codec.intRange(0, 1023).fieldOf("distance").forGetter(StructureSpreadSettings::func_236660_a_),
               Codec.intRange(0, 1023).fieldOf("spread").forGetter(StructureSpreadSettings::func_236662_b_),
               Codec.intRange(1, 4095).fieldOf("count").forGetter(StructureSpreadSettings::func_236663_c_)
            )
            .apply(var0, StructureSpreadSettings::new)
   );
   private final int field42538;
   private final int field42539;
   private final int field42540;

   public StructureSpreadSettings(int var1, int var2, int var3) {
      this.field42538 = var1;
      this.field42539 = var2;
      this.field42540 = var3;
   }

   public int func_236660_a_() {
      return this.field42538;
   }

   public int func_236662_b_() {
      return this.field42539;
   }

   public int func_236663_c_() {
      return this.field42540;
   }
}
