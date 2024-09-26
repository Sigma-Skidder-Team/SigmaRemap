package com.mentalfrostbyte.jello.viaversion.managers;

import io.netty.channel.Channel;
import mapped.*;

public class PacketManager {
   public ViaEncoder viaEncode;
   public ViaDecoder viaDecode;

   public PacketManager(Channel channel) {
      Class7161 var4 = new Class7161(channel);
      new Class6376(var4);
      var4.method22440(new Class6046(var4));
      channel.pipeline().addBefore("encoder", "via-encoder", this.viaEncode = new ViaEncoder(var4));
      channel.pipeline().addBefore("decoder", "via-decoder", this.viaDecode = new ViaDecoder(var4));
   }

   public void method34157(Channel var1) {
      if (this.viaEncode != null && this.viaDecode != null) {
         if (var1.pipeline().get("via-encoder") != null) {
            var1.pipeline().remove("via-encoder");
         }

         if (var1.pipeline().get("via-decoder") != null) {
            var1.pipeline().remove("via-decoder");
         }

         var1.pipeline().addBefore("encoder", "via-encoder", this.viaEncode);
         var1.pipeline().addBefore("decoder", "via-decoder", this.viaDecode);
      }
   }

   public PacketManager(mapped.ViaEncoder var1, mapped.ViaDecoder var2) {
      this.viaEncode = var1;
      this.viaDecode = var2;
   }
}
