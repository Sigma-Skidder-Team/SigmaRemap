package mapped;

import com.mojang.serialization.Lifecycle;
import net.minecraft.util.registry.Registry;

import java.util.OptionalInt;

public abstract class MutableRegistry<T> extends Registry<T> {
   public MutableRegistry(RegistryKey<? extends Registry<T>> var1, Lifecycle var2) {
      super(var1, var2);
   }

   public abstract <V extends T> V method9249(int var1, RegistryKey<T> var2, V var3, Lifecycle var4);

   public abstract <V extends T> V register(RegistryKey<T> var1, V var2, Lifecycle var3);

   public abstract <V extends T> V method9251(OptionalInt var1, RegistryKey<T> var2, V var3, Lifecycle var4);
}
