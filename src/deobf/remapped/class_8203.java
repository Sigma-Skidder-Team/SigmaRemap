package remapped;

import io.netty.buffer.ByteBuf;
import java.util.UUID;

public class class_8203 extends class_8039<UUID> {
   public class_8203() {
      super(UUID.class);
   }

   public UUID method_37567(ByteBuf var1) {
      boolean var4 = var1.readBoolean();
      return var4 ? new UUID(var1.readLong(), var1.readLong()) : null;
   }

   public void method_37566(ByteBuf var1, UUID var2) {
      if (var2 != null) {
         var1.writeBoolean(true);
         var1.writeLong(var2.getMostSignificantBits());
         var1.writeLong(var2.getLeastSignificantBits());
      } else {
         var1.writeBoolean(false);
      }
   }
}
