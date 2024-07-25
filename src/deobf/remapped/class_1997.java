package remapped;

import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.context.CommandContext;
import java.util.function.BiConsumer;

public class class_1997 extends class_9152<class_1997> {
   private int field_10146;

   private static class_3275<class_1997> method_9279(int var0, BiConsumer<class_341, class_1997> var1) {
      return new class_3275<class_1997>(IntegerArgumentType::integer, var1x -> new class_1997(var1x, var0), var1, class_2237::method_10291, null);
   }

   private static class_3275<class_1997> method_9278(int var0) {
      return method_9279(var0, (var0x, var1) -> {
      });
   }

   public class_1997(class_3275<class_1997> var1, int var2) {
      super(var1);
      this.field_10146 = var2;
   }

   @Override
   public void method_42120(CommandContext<class_9155> var1, String var2) {
      this.field_10146 = IntegerArgumentType.getInteger(var1, var2);
   }

   public int method_9272() {
      return this.field_10146;
   }

   @Override
   public String method_42124() {
      return Integer.toString(this.field_10146);
   }

   @Override
   public void method_42118(String var1) {
      this.field_10146 = method_9273(var1);
   }

   public boolean method_9275(String var1) {
      try {
         this.field_10146 = Integer.parseInt(var1);
         return true;
      } catch (NumberFormatException var5) {
         return false;
      }
   }

   private static int method_9273(String var0) {
      if (!var0.isEmpty()) {
         try {
            return Integer.parseInt(var0);
         } catch (NumberFormatException var4) {
            GameRules.method_1290().warn("Failed to parse integer {}", var0);
         }
      }

      return 0;
   }

   @Override
   public int method_42122() {
      return this.field_10146;
   }

   public class_1997 method_9271() {
      return this;
   }

   public class_1997 method_9274() {
      return new class_1997(this.field_46823, this.field_10146);
   }

   public void method_9277(class_1997 var1, class_341 var2) {
      this.field_10146 = var1.field_10146;
      this.method_42125(var2);
   }
}
