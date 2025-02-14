package net.minecraft.world.gen.feature.structure;

import com.mojang.serialization.Codec;
import mapped.Class4698;

public class ShipwreckConfig implements Class4698 {
   public static final Codec<ShipwreckConfig> field22431 = Codec.BOOL.fieldOf("is_beached").orElse(false).xmap(ShipwreckConfig::new, var0 -> var0.field22432).codec();
   public final boolean field22432;

   public ShipwreckConfig(boolean var1) {
      this.field22432 = var1;
   }
}
