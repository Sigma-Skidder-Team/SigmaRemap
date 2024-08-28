package mapped;

import io.netty.channel.Channel;

public class Class9144 {
   public Class8374 field42018;
   public Class8370 field42019;

   public Class9144(Channel var1) {
      Class7161 var4 = new Class7161(var1);
      new Class6376(var4);
      var4.method22440(new Class6046(var4));
      var1.pipeline().addBefore("encoder", "via-encoder", this.field42018 = new Class8374(var4));
      var1.pipeline().addBefore("decoder", "via-decoder", this.field42019 = new Class8370(var4));
   }

   public void method34157(Channel var1) {
   /*   if (this.field42018 != null && this.field42019 != null) {
         if (var1.pipeline().get("via-encoder") != null) {
            var1.pipeline().remove("via-encoder");
         }

         if (var1.pipeline().get("via-decoder") != null) {
            var1.pipeline().remove("via-decoder");
         }

         var1.pipeline().addBefore("encoder", "via-encoder", this.field42018);
         var1.pipeline().addBefore("decoder", "via-decoder", this.field42019);
      }*/
   }

   public Class9144(Class8374 var1, Class8370 var2) {
      this.field42018 = var1;
      this.field42019 = var2;
   }
}
