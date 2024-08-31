package mapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import net.minecraft.util.ResourceLocation;

import java.util.Optional;

public class WorldGenSettingsExport<T> extends Class6712<T> {
   private static String[] field29418;
   private final DynamicRegistries field29419;

   public static <T> WorldGenSettingsExport<T> create(DynamicOps<T> var0, DynamicRegistries var1) {
      return new WorldGenSettingsExport<T>(var0, var1);
   }

   private WorldGenSettingsExport(DynamicOps<T> var1, DynamicRegistries var2) {
      super(var1);
      this.field29419 = var2;
   }

   public <E> DataResult<T> method20492(E var1, T var2, RegistryKey<? extends Registry<E>> var3, Codec<E> var4) {
      Optional var7 = this.field29419.method32452(var3);
      if (var7.isPresent()) {
         MutableRegistry var8 = (MutableRegistry)var7.get();
         Optional var9 = var8.method9182(var1);
         if (var9.isPresent()) {
            RegistryKey var10 = (RegistryKey)var9.get();
            return ResourceLocation.CODEC.encode(var10.getLocation(), this.field29417, var2);
         }
      }

      return var4.encode(var1, this, var2);
   }
}
