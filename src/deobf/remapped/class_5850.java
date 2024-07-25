package remapped;

import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.context.CommandContext;
import java.util.function.BiConsumer;

public class class_5850 extends class_9152<class_5850> {
   private static String[] field_29724;
   private boolean field_29725;

   private static class_3275<class_5850> method_26683(boolean var0, BiConsumer<class_341, class_5850> var1) {
      return new class_3275<class_5850>(BoolArgumentType::bool, var1x -> new class_5850(var1x, var0), var1, class_2237::method_10290, null);
   }

   private static class_3275<class_5850> method_26682(boolean var0) {
      return method_26683(var0, (var0x, var1) -> {
      });
   }

   public class_5850(class_3275<class_5850> var1, boolean var2) {
      super(var1);
      this.field_29725 = var2;
   }

   @Override
   public void method_42120(CommandContext<class_9155> var1, String var2) {
      this.field_29725 = BoolArgumentType.getBool(var1, var2);
   }

   public boolean method_26681() {
      return this.field_29725;
   }

   public void method_26684(boolean var1, class_341 var2) {
      this.field_29725 = var1;
      this.method_42125(var2);
   }

   @Override
   public String method_42124() {
      return Boolean.toString(this.field_29725);
   }

   @Override
   public void method_42118(String var1) {
      this.field_29725 = Boolean.parseBoolean(var1);
   }

   @Override
   public int method_42122() {
      return !this.field_29725 ? 0 : 1;
   }

   public class_5850 method_26676() {
      return this;
   }

   public class_5850 method_26678() {
      return new class_5850(this.field_46823, this.field_29725);
   }

   public void method_26680(class_5850 var1, class_341 var2) {
      this.field_29725 = var1.field_29725;
      this.method_42125(var2);
   }
}
