package remapped;

import com.mojang.datafixers.types.templates.Hook.HookFunction;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;

public final class class_6381 implements HookFunction {
   public <T> T apply(DynamicOps<T> var1, T var2) {
      return class_5185.<T>method_23814(new Dynamic(var1, var2), class_2063.field_10421, "minecraft:armor_stand");
   }
}
