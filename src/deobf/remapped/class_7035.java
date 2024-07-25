package remapped;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufInputStream;
import io.netty.buffer.ByteBufOutputStream;
import io.netty.buffer.Unpooled;
import java.io.IOException;

public class class_7035 extends class_1694 {
   private static String[] field_36220;

   @Override
   public class_9530 method_7622(class_1455 var1) {
      MinecraftClient var4 = MinecraftClient.getInstance();
      class_6098 var5 = !class_7051.method_32417(class_1857.field_9414)
         ? class_6098.field_31203
         : var4.field_9632.field_3853.field_36401.get(class_1857.field_9414);
      class_2451 var6 = var5.method_27960();
      if (var6 != null) {
         class_9530 var7 = new class_9530(
            (short)class_2451.method_11244(var6), (byte)var5.field_31206, (short)var5.method_28026(), this.method_32088(var5.method_27990())
         );
         class_8806.method_40473(var7);
         class_3663.method_17006(var7);
         class_5619.method_25490(var7);
         class_5830.method_26387(var7);
         class_3166.method_14613(var7);
         class_9330.method_43071(var7);
         class_5825.method_26373(var7);
         return var7;
      } else {
         return new class_9530(0, (byte)0, (short)0, null);
      }
   }

   public class_5531 method_32088(class_5734 var1) {
      if (var1 == null) {
         return null;
      } else {
         ByteBuf var4 = Unpooled.wrappedBuffer(new byte[2048]);
         var4.resetWriterIndex();

         try {
            class_5957.method_27224(var1, new ByteBufOutputStream(var4));
            var4.writeByte(0);
            ByteBufInputStream var5 = new ByteBufInputStream(var4);
            return (class_5531)class_4129.method_19188(var5, false);
         } catch (IOException var6) {
            var6.printStackTrace();
            return null;
         }
      }
   }
}
