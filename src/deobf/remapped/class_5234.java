package remapped;

import io.netty.channel.ChannelFuture;

public class class_5234 implements class_857 {
   private static String[] field_26840;

   public class_5234(class_9500 var1) {
      this.field_26839 = var1;
   }

   @Override
   public void method_3722(class_5051 var1) throws Exception {
      int var4 = var1.method_23255().method_6744().method_17604();
      if (class_3446.method_15884().method_25842().contains(var4)) {
         if (!var1.method_23255().method_6733().isOpen()) {
            return;
         }

         if (!var1.method_23255().method_6701()) {
            return;
         }

         class_5051 var5 = new class_5051(0, null, var1.method_23255());
         class_6890.field_35446.method_6684(var5, class_2909.method_13307('&', class_3446.method_15884().method_25840()));
         var1.method_23245();
         ChannelFuture var6 = var5.method_23247(class_3839.class);
         var6.addListener(var1x -> var1.method_23255().method_6733().close());
      }
   }
}
