package remapped;

import com.google.common.collect.Queues;
import java.util.Arrays;
import java.util.Deque;
import javax.annotation.Nullable;

public class class_9184 extends AbstractGui {
   private static String[] field_46994;
   private final MinecraftClient field_46992;
   private final class_9623<?>[] field_46993 = new class_9623[5];
   private final Deque<class_6406> field_46991 = Queues.newArrayDeque();

   public class_9184(MinecraftClient var1) {
      this.field_46992 = var1;
   }

   public void method_42331(class_7966 var1) {
      if (!this.field_46992.gameOptions.hideGUI) {
         for (int var4 = 0; var4 < this.field_46993.length; var4++) {
            class_9623 var5 = this.field_46993[var4];
            if (var5 != null && var5.method_44422(this.field_46992.getMainWindow().getScaledWidth(), var4, var1)) {
               this.field_46993[var4] = null;
            }

            if (this.field_46993[var4] == null && !this.field_46991.isEmpty()) {
               this.field_46993[var4] = new class_9623(this, this.field_46991.removeFirst(), null);
            }
         }
      }
   }

   @Nullable
   public <T extends class_6406> T method_42328(Class<? extends T> var1, Object var2) {
      for (class_9623 var8 : this.field_46993) {
         if (var8 != null && var1.isAssignableFrom(var8.method_44421().getClass()) && var8.method_44421().method_29237().equals(var2)) {
            return (T)var8.method_44421();
         }
      }

      for (class_6406 var10 : this.field_46991) {
         if (var1.isAssignableFrom(var10.getClass()) && var10.method_29237().equals(var2)) {
            return (T)var10;
         }
      }

      return null;
   }

   public void method_42332() {
      Arrays.fill(this.field_46993, null);
      this.field_46991.clear();
   }

   public void method_42329(class_6406 var1) {
      this.field_46991.add(var1);
   }

   public MinecraftClient method_42327() {
      return this.field_46992;
   }
}
