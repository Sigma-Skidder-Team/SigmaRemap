package mapped;

import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.context.CommandContext;
import java.util.function.BiConsumer;

public class Class7466 extends Class7465<Class7466> {
   private boolean field32103;

   private static Class7989<Class7466> method24172(boolean var0, BiConsumer<Class314, Class7466> var1) {
      return new Class7989<>(BoolArgumentType::bool, var1x -> new Class7466(var1x, var0), var1, Class7567::method24777);
   }

   private static Class7989<Class7466> method24173(boolean var0) {
      return method24172(var0, (var0x, var1) -> {
      });
   }

   public Class7466(Class7989<Class7466> var1, boolean var2) {
      super(var1);
      this.field32103 = var2;
   }

   @Override
   public void method24154(CommandContext<Class6619> var1, String var2) {
      this.field32103 = BoolArgumentType.getBool(var1, var2);
   }

   public boolean method24174() {
      return this.field32103;
   }

   public void method24175(boolean var1, Class314 var2) {
      this.field32103 = var1;
      this.method24171(var2);
   }

   @Override
   public String method24156() {
      return Boolean.toString(this.field32103);
   }

   @Override
   public void method24157(String var1) {
      this.field32103 = Boolean.parseBoolean(var1);
   }

   @Override
   public int method24160() {
      return !this.field32103 ? 0 : 1;
   }

   public Class7466 method24166() {
      return this;
   }

   public Class7466 method24165() {
      return new Class7466(this.field32101, this.field32103);
   }

   public void method24164(Class7466 var1, Class314 var2) {
      this.field32103 = var1.field32103;
      this.method24171(var2);
   }

   // $VF: synthetic method
   public static Class7989 method24178(boolean var0) {
      return method24173(var0);
   }

   // $VF: synthetic method
   public static Class7989 method24179(boolean var0, BiConsumer<Class314, Class7466> var1) {
      return method24172(var0, var1);
   }
}
