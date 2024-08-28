package mapped;

import io.netty.buffer.ByteBuf;
import java.util.UUID;

public class Class4816 extends Class4750<UUID> {
   public Class4816() {
      super(UUID.class);
   }

   public UUID method14894(ByteBuf var1) {
      return new UUID(var1.readLong(), var1.readLong());
   }

   public void method14895(ByteBuf var1, UUID var2) {
      var1.writeLong(var2.getMostSignificantBits());
      var1.writeLong(var2.getLeastSignificantBits());
   }
}
