package mapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.concurrent.atomic.AtomicInteger;

public class Class1314 extends Screen {
   private static final AtomicInteger field6934 = new AtomicInteger(0);
   private static final Logger field6935 = LogManager.getLogger();
   private NetworkManager field6936;
   private boolean field6937;
   private final Screen field6938;
   private ITextComponent field6939 = new TranslationTextComponent("connect.connecting");
   private long field6940 = -1L;

   public Class1314(Screen var1, Minecraft var2, Class7730 var3) {
      super(NarratorChatListener.field29300);
      this.field4562 = var2;
      this.field6938 = var1;
      Class9375 var6 = Class9375.method35574(var3.field33189);
      var2.unloadWorld();
      var2.method1527(var3);
      this.method6219(var6.method35572(), var6.method35573());
   }

   public Class1314(Screen var1, Minecraft var2, String var3, int var4) {
      super(NarratorChatListener.field29300);
      this.field4562 = var2;
      this.field6938 = var1;
      var2.unloadWorld();
      this.method6219(var3, var4);
   }

   private void method6219(String var1, int var2) {
      field6935.info("Connecting to {}, {}", var1, var2);
      Class381 var5 = new Class381(this, "Server Connector #" + field6934.incrementAndGet(), var1, var2);
      var5.setUncaughtExceptionHandler(new Class6030(field6935));
      var5.start();
   }

   private void method6220(ITextComponent var1) {
      this.field6939 = var1;
   }

   @Override
   public void method1919() {
      if (this.field6936 != null) {
         if (!this.field6936.method30707()) {
            this.field6936.method30713();
         } else {
            this.field6936.method30698();
         }
      }
   }

   @Override
   public boolean method2454() {
      return false;
   }

   @Override
   public void method1921() {
      this.<Class1206>method2455(new Class1206(this.field4564 / 2 - 100, this.field4565 / 4 + 120 + 12, 200, 20, Class7127.field30659, var1 -> {
         this.field6937 = true;
         if (this.field6936 != null) {
            this.field6936.method30701(new TranslationTextComponent("connect.aborted"));
         }

         this.field4562.displayGuiScreen(this.field6938);
      }));
   }

   @Override
   public void method1923(MatrixStack var1, int var2, int var3, float var4) {
      this.method2469(var1);
      long var7 = Util.milliTime();
      if (var7 - this.field6940 > 2000L) {
         this.field6940 = var7;
         NarratorChatListener.INSTANCE.say(new TranslationTextComponent("narrator.joining").getString());
      }

      method5691(var1, this.field4568, this.field6939, this.field4564 / 2, this.field4565 / 2 - 50, 16777215);
      super.method1923(var1, var2, var3, var4);
   }

   // $VF: synthetic method
   public static boolean method6222(Class1314 var0) {
      return var0.field6937;
   }

   // $VF: synthetic method
   public static NetworkManager method6223(Class1314 var0, NetworkManager var1) {
      return var0.field6936 = var1;
   }

   // $VF: synthetic method
   public static NetworkManager method6224(Class1314 var0) {
      return var0.field6936;
   }

   // $VF: synthetic method
   public static Screen method6225(Class1314 var0) {
      return var0.field6938;
   }

   // $VF: synthetic method
   public static Logger method6226() {
      return field6935;
   }

   // $VF: synthetic method
   public static void method6227(Class1314 var0, ITextComponent var1) {
      var0.method6220(var1);
   }
}
