package mapped;

import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.ArgumentType;

import java.util.function.Supplier;

public class Class2591<T extends ArgumentType<?>> implements Class2586<T> {
   private static String[] field16809;
   private final Supplier<T> field16810;

   public Class2591(Supplier<T> var1) {
      this.field16810 = var1;
   }

   @Override
   public void method10796(T var1, PacketBuffer var2) {
   }

   @Override
   public T method10795(PacketBuffer var1) {
      return this.field16810.get();
   }

   @Override
   public void method10794(T var1, JsonObject var2) {
   }
}
