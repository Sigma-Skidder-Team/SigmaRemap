package remapped;

import com.google.common.base.Preconditions;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufInputStream;
import io.netty.buffer.ByteBufOutputStream;

public class class_5341 extends class_8039<class_5531> {
   public class_5341() {
      super(class_5531.class);
   }

   public class_5531 method_24329(ByteBuf var1) throws Exception {
      Preconditions.checkArgument(var1.readableBytes() <= 2097152, "Cannot read NBT (got %s bytes)", var1.readableBytes());
      int var4 = var1.readerIndex();
      byte var5 = var1.readByte();
      if (var5 != 0) {
         var1.readerIndex(var4);
         return (class_5531)class_4129.method_19186(new ByteBufInputStream(var1));
      } else {
         return null;
      }
   }

   public void method_24328(ByteBuf var1, class_5531 var2) throws Exception {
      if (var2 != null) {
         ByteBufOutputStream var5 = new ByteBufOutputStream(var1);
         class_4129.method_19179(var5, var2);
      } else {
         var1.writeByte(0);
      }
   }

   static {
      class_8657.method_39698(60);
      class_8657.method_39698(61);
      class_8657.method_39698(65);
   }
}
