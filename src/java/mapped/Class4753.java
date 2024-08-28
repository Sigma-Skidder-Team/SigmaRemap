package mapped;

import com.google.common.base.Preconditions;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufInputStream;
import io.netty.buffer.ByteBufOutputStream;

public class Class4753 extends Class4750<Class72> {
   public Class4753() {
      super(Class72.class);
   }

   public Class72 method14894(ByteBuf var1) throws Exception {
      Preconditions.checkArgument(var1.readableBytes() <= 2097152, "Cannot read NBT (got %s bytes)", var1.readableBytes());
      int var4 = var1.readerIndex();
      byte var5 = var1.readByte();
      if (var5 != 0) {
         var1.readerIndex(var4);
         return (Class72)Class8275.method28920(new ByteBufInputStream(var1));
      } else {
         return null;
      }
   }

   public void method14895(ByteBuf var1, Class72 var2) throws Exception {
      if (var2 != null) {
         ByteBufOutputStream var5 = new ByteBufOutputStream(var1);
         Class8275.method28923(var5, var2);
      } else {
         var1.writeByte(0);
      }
   }

   static {
      Class9509.method36723(60);
      Class9509.method36723(61);
      Class9509.method36723(65);
   }
}
