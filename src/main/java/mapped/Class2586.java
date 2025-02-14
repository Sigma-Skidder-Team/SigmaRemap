package mapped;

import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.ArgumentType;
import net.minecraft.network.PacketBuffer;

public interface Class2586<T extends ArgumentType<?>> {
   void method10796(T var1, PacketBuffer var2);

   T method10795(PacketBuffer var1);

   void method10794(T var1, JsonObject var2);
}
