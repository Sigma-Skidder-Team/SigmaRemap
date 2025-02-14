package mapped;

import com.mojang.datafixers.types.templates.Hook.HookFunction;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;

public final class Class9381 implements HookFunction {
   public <T> T apply(DynamicOps<T> var1, T var2) {
      return (T) Class8604.method30797(new Dynamic(var1, var2), Class7506.field32228, "ArmorStand");
   }
}
