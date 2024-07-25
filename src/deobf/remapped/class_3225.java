package remapped;

import io.netty.buffer.ByteBuf;
import java.util.UUID;

public class class_3225 extends class_8039<UUID> {
   public class_3225() {
      super(UUID.class);
   }

   public UUID method_14779(ByteBuf var1) {
      return new UUID(var1.readLong(), var1.readLong());
   }

   public void method_14778(ByteBuf var1, UUID var2) {
      var1.writeLong(var2.getMostSignificantBits());
      var1.writeLong(var2.getLeastSignificantBits());
   }
}
