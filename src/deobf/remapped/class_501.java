package remapped;

import java.util.concurrent.atomic.AtomicInteger;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_501 extends class_266 {
   private static final AtomicInteger field_3121 = new AtomicInteger(0);
   private static final Logger field_3119 = LogManager.getLogger();
   private class_5121 field_3117;
   private boolean field_3120;
   private final class_266 field_3116;
   private ITextComponent field_3118 = new TranslationTextComponent("connect.connecting");
   private long field_3122 = -1L;

   public class_501(class_266 var1, MinecraftClient var2, class_2560 var3) {
      super(class_7542.field_38486);
      this.field_943 = var2;
      this.field_3116 = var1;
      class_8140 var6 = class_8140.method_37037(var3.field_12675);
      var2.method_8499();
      var2.method_8604(var3);
      this.method_2493(var6.method_37039(), var6.method_37038());
   }

   public class_501(class_266 var1, MinecraftClient var2, String var3, int var4) {
      super(class_7542.field_38486);
      this.field_943 = var2;
      this.field_3116 = var1;
      var2.method_8499();
      this.method_2493(var3, var4);
   }

   private void method_2493(String var1, int var2) {
      field_3119.info("Connecting to {}, {}", var1, var2);
      class_733 var5 = new class_733(this, "Server Connector #" + field_3121.incrementAndGet(), var1, var2);
      var5.setUncaughtExceptionHandler(new class_447(field_3119));
      var5.start();
   }

   private void method_2497(ITextComponent var1) {
      this.field_3118 = var1;
   }

   @Override
   public void method_5312() {
      if (this.field_3117 != null) {
         if (!this.field_3117.method_23493()) {
            this.field_3117.method_23480();
         } else {
            this.field_3117.method_23483();
         }
      }
   }

   @Override
   public boolean method_1178() {
      return false;
   }

   @Override
   public void method_1163() {
      this.<class_9521>method_1186(new class_9521(this.field_941 / 2 - 100, this.field_940 / 4 + 120 + 12, 200, 20, class_1402.field_7633, var1 -> {
         this.field_3120 = true;
         if (this.field_3117 != null) {
            this.field_3117.method_23482(new TranslationTextComponent("connect.aborted"));
         }

         this.field_943.method_8609(this.field_3116);
      }));
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      this.method_1183(var1);
      long var7 = Util.getMeasuringTimeMs();
      if (var7 - this.field_3122 > 2000L) {
         this.field_3122 = var7;
         class_7542.field_38482.method_34341(new TranslationTextComponent("narrator.joining").getString());
      }

      method_9788(var1, this.field_948, this.field_3118, this.field_941 / 2, this.field_940 / 2 - 50, 16777215);
      super.method_6767(var1, var2, var3, var4);
   }
}
