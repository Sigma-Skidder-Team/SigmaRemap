package mapped;

import io.netty.buffer.ByteBuf;
import java.util.UUID;

public class Class4798 extends Class4750<UUID> {
   public Class4798() {
      super(UUID.class);
   }

   public UUID method14894(ByteBuf var1) {
      boolean var4 = var1.readBoolean();
      return var4 ? new UUID(var1.readLong(), var1.readLong()) : null;
   }

   public void method14895(ByteBuf var1, UUID var2) {
      if (var2 != null) {
         var1.writeBoolean(true);
         var1.writeLong(var2.getMostSignificantBits());
         var1.writeLong(var2.getLeastSignificantBits());
      } else {
         var1.writeBoolean(false);
      }
   }
}
