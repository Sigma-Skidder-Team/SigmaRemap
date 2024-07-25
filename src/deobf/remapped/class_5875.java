package remapped;

import net.minecraft.util.text.ITextComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class class_5875 implements class_8266, Runnable {
   public static final Logger field_29831 = LogManager.getLogger();
   public class_1065 field_29830;

   public static void method_26757(int var0) {
      try {
         Thread.sleep((long)(var0 * 1000));
      } catch (InterruptedException var4) {
         field_29831.error("", var4);
      }
   }

   public static void method_26755(Screen var0) {
      MinecraftClient var3 = MinecraftClient.getInstance();
      var3.execute(() -> var3.method_8609(var0));
   }

   public void method_26753(class_1065 var1) {
      this.field_29830 = var1;
   }

   @Override
   public void method_38113(ITextComponent var1) {
      this.field_29830.method_38113(var1);
   }

   public void method_26756(ITextComponent var1) {
      this.field_29830.method_4674(var1);
   }

   public boolean method_26759() {
      return this.field_29830.method_4677();
   }

   public void method_26754() {
   }

   public void method_26758() {
   }

   public void method_26751() {
   }
}
