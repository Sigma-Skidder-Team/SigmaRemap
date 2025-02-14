package mapped;

import com.google.common.collect.Maps;
import net.minecraft.network.INetHandler;
import net.minecraft.network.PacketDirection;

import java.util.Map;

public class Class8779 {
   private static String[] field39487;
   private final Map<PacketDirection, Class7417<?>> field39488 = Maps.newEnumMap(PacketDirection.class);

   public Class8779() {
   }

   public <T extends INetHandler> Class8779 method31658(PacketDirection var1, Class7417<T> var2) {
      this.field39488.put(var1, var2);
      return this;
   }

   // $VF: synthetic method
   public static Map<PacketDirection, Class7417<?>> method31659(Class8779 var0) {
      return var0.field39488;
   }
}
