package remapped;

import java.util.Map;
import java.util.Map.Entry;

public class class_7348 implements Runnable {
   private static String[] field_37574;

   public class_7348(class_6590 var1, Map var2, Map var3) {
      this.field_37571 = var1;
      this.field_37572 = var2;
      this.field_37573 = var3;
   }

   @Override
   public void run() {
      for (Entry var4 : this.field_37572.entrySet()) {
         if (var4.getValue() != null) {
            MinecraftClient.getInstance().theWorld.method_29594((BlockPos)var4.getKey(), ((class_3841)var4.getValue()).field_18752);
         }
      }

      for (Entry var6 : this.field_37573.entrySet()) {
         if (var6.getValue() != null) {
            MinecraftClient.getInstance().theWorld.method_29594((BlockPos)var6.getKey(), (class_2522)var6.getValue());
         }
      }
   }
}
