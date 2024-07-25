package remapped;

import java.util.List;

public class class_6401 implements Runnable {
   private class_6401(class_8264 var1) {
      this.field_32676 = var1;
   }

   @Override
   public void run() {
      if (class_8264.method_38100(this.field_32676)) {
         this.method_29219();
      }
   }

   private void method_29219() {
      try {
         class_176 var3 = class_176.method_777();
         List var4 = var3.method_803().field_49553;
         if (var4 != null) {
            var4.sort(new class_3716(MinecraftClient.getInstance().method_8502().method_5366()));
            class_8264.method_38087(this.field_32676, var4);
            class_8264.method_38088(this.field_32676).put(class_2845.field_13948, true);
         } else {
            class_8264.method_38092().warn("Realms server list was null or empty");
         }
      } catch (Exception var5) {
         class_8264.method_38088(this.field_32676).put(class_2845.field_13948, true);
         class_8264.method_38092().error("Couldn't get server list", var5);
      }
   }
}
