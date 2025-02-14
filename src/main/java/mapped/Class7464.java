package mapped;

import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.context.CommandContext;
import net.minecraft.command.CommandSource;
import net.minecraft.world.GameRules;

import java.util.function.BiConsumer;

public class Class7464 extends Class7465<Class7464> {
   private int field32100;

   private static Class7989<Class7464> method24152(int var0, BiConsumer<MinecraftServer, Class7464> var1) {
      return new Class7989<>(IntegerArgumentType::integer, var1x -> new Class7464(var1x, var0), var1, Class7567::method24778);
   }

   private static Class7989<Class7464> method24153(int var0) {
      return method24152(var0, (var0x, var1) -> {
      });
   }

   public Class7464(Class7989<Class7464> var1, int var2) {
      super(var1);
      this.field32100 = var2;
   }

   @Override
   public void method24154(CommandContext<CommandSource> var1, String var2) {
      this.field32100 = IntegerArgumentType.getInteger(var1, var2);
   }

   public int method24155() {
      return this.field32100;
   }

   @Override
   public String method24156() {
      return Integer.toString(this.field32100);
   }

   @Override
   public void method24157(String var1) {
      this.field32100 = method24159(var1);
   }

   public boolean method24158(String var1) {
      try {
         this.field32100 = Integer.parseInt(var1);
         return true;
      } catch (NumberFormatException var5) {
         return false;
      }
   }

   private static int method24159(String var0) {
      if (!var0.isEmpty()) {
         try {
            return Integer.parseInt(var0);
         } catch (NumberFormatException var4) {
            GameRules.method17146().warn("Failed to parse integer {}", var0);
         }
      }

      return 0;
   }

   @Override
   public int method24160() {
      return this.field32100;
   }

   public Class7464 method24166() {
      return this;
   }

   public Class7464 method24165() {
      return new Class7464(this.field32101, this.field32100);
   }

   public void method24164(Class7464 var1, MinecraftServer var2) {
      this.field32100 = var1.field32100;
      this.method24171(var2);
   }

   // $VF: synthetic method
   public static Class7989 method24169(int var0) {
      return method24153(var0);
   }
}
