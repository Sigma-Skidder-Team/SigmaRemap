package mapped;

import net.minecraft.client.util.Util;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeRegistry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class7345 {
   private static final Logger field31450 = LogManager.getLogger();
   private final Class7900 field31451;

   public Class7345(Class7962<Class7900> var1) {
      this.field31451 = (Class7900)var1.method27085();
   }

   public Biome method23287(Registry<Biome> var1, int var2, int var3) {
      int var6 = this.field31451.method26471(var2, var3);
      RegistryKey var7 = BiomeRegistry.method32443(var6);
      if (var7 != null) {
         Biome var8 = (Biome)var1.getValueForKey(var7);
         if (var8 != null) {
            return var8;
         } else if (!SharedConstants.developmentMode) {
            field31450.warn("Unknown biome id: ", var6);
            return var1.getValueForKey(BiomeRegistry.method32443(0));
         } else {
            throw (IllegalStateException) Util.pauseDevMode(new IllegalStateException("Unknown biome id: " + var6));
         }
      } else {
         throw new IllegalStateException("Unknown biome id emitted by layers: " + var6);
      }
   }
}
