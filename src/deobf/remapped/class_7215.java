package remapped;

import io.netty.channel.Channel;

public class class_7215 {
   public class_4397 field_37051;
   public class_4384 field_37052;

   public class_7215(Channel var1) {
      class_1455 var4 = new class_1455(var1);
      new class_9200(var4);
      var4.method_6737(new class_3202(var4));
      var1.pipeline().addBefore("encoder", "via-encoder", this.field_37051 = new class_4397(var4));
      var1.pipeline().addBefore("decoder", "via-decoder", this.field_37052 = new class_4384(var4));
   }

   public void method_33051(Channel var1) {
      if (this.field_37051 != null && this.field_37052 != null) {
         if (var1.pipeline().get("via-encoder") != null) {
            var1.pipeline().remove("via-encoder");
         }

         if (var1.pipeline().get("via-decoder") != null) {
            var1.pipeline().remove("via-decoder");
         }

         var1.pipeline().addBefore("encoder", "via-encoder", this.field_37051);
         var1.pipeline().addBefore("decoder", "via-decoder", this.field_37052);
      }
   }

   public class_7215(class_4397 var1, class_4384 var2) {
      this.field_37051 = var1;
      this.field_37052 = var2;
   }
}
