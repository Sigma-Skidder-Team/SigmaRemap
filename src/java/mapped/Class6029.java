package mapped;

import com.mojang.datafixers.types.templates.Hook.HookFunction;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;

public final class Class6029 implements HookFunction {
   public <T> T apply(DynamicOps<T> var1, T var2) {
      return (T) Class8604.method30797(new Dynamic(var1, var2), Class8604.method30834(), "ArmorStand");
   }
}
