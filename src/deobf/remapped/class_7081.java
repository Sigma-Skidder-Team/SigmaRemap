package remapped;

import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_7081 {
   private static final Splitter field_36569 = Splitter.on('\u0000').limit(6);
   private static final Logger field_36567 = LogManager.getLogger();
   private final List<class_5121> field_36566 = Collections.<class_5121>synchronizedList(Lists.newArrayList());

   public void method_32592(class_2560 var1, Runnable var2) throws UnknownHostException {
      class_8140 var5 = class_8140.method_37037(var1.field_12675);
      class_5121 var6 = class_5121.method_23489(InetAddress.getByName(var5.method_37039()), var5.method_37038(), false);
      this.field_36566.add(var6);
      var1.field_12672 = new TranslationTextComponent("multiplayer.status.pinging");
      var1.field_12674 = -1L;
      var1.field_12664 = null;
      var6.method_23495(new class_9444(this, var6, var1, var2));

      try {
         var6.method_23485(new class_8135(var5.method_37039(), var5.method_37038(), class_5776.field_29173));
         var6.method_23485(new class_3079());
      } catch (Throwable var8) {
         field_36567.error(var8);
      }
   }

   private void method_32590(class_2560 var1) {
      class_8140 var4 = class_8140.method_37037(var1.field_12675);
      ((Bootstrap)((Bootstrap)((Bootstrap)new Bootstrap().group((EventLoopGroup)class_5121.field_26413.method_16960()))
               .handler(new class_1635(this, var4, var1)))
            .channel(NioSocketChannel.class))
         .connect(var4.method_37039(), var4.method_37038());
   }

   private static ITextComponent method_32586(int var0, int var1) {
      return new StringTextComponent(Integer.toString(var0))
         .append(new StringTextComponent("/").mergeStyle(TextFormatting.DARK_GRAY))
         .appendString(Integer.toString(var1))
         .mergeStyle(TextFormatting.GRAY);
   }

   public void method_32584() {
      synchronized (this.field_36566) {
         Iterator var4 = this.field_36566.iterator();

         while (var4.hasNext()) {
            class_5121 var5 = (class_5121)var4.next();
            if (var5.method_23493()) {
               var5.method_23483();
            } else {
               var4.remove();
               var5.method_23480();
            }
         }
      }
   }

   public void method_32583() {
      synchronized (this.field_36566) {
         Iterator var4 = this.field_36566.iterator();

         while (var4.hasNext()) {
            class_5121 var5 = (class_5121)var4.next();
            if (var5.method_23493()) {
               var4.remove();
               var5.method_23482(new TranslationTextComponent("multiplayer.status.cancelled"));
            }
         }
      }
   }
}
