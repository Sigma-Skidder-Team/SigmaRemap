package mapped;

import com.mojang.serialization.Codec;
import net.minecraft.world.gen.feature.structure.ShipwreckConfig;

public class Class2964 extends Structure<ShipwreckConfig> {
   public Class2964(Codec<ShipwreckConfig> var1) {
      super(var1);
   }

   @Override
   public Class7072<ShipwreckConfig> method11359() {
      return Class5445::new;
   }
}
