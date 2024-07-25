package remapped;

import io.netty.channel.ChannelHandlerContext;

public abstract class class_3858 implements class_7978 {
   public abstract Object method_17898();

   public abstract Object method_17899();

   public void method_17897(class_1455 var1) {
      ChannelHandlerContext var4 = class_3844.method_17838("decoder", var1.method_6733().pipeline());
      if (var4 != null) {
         if (!var1.<class_4257>method_6746(class_4257.class).method_19838()) {
            var4.fireChannelRead(this.method_17898());
         } else {
            var4.fireChannelRead(this.method_17899());
         }

         var1.<class_4257>method_6746(class_4257.class).method_19835();
      }
   }
}
