package remapped;

import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.arguments.DoubleArgumentType;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.arguments.LongArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;

public class class_621 {
   public static void method_2899() {
      class_5398.method_24581("brigadier:bool", BoolArgumentType.class, new class_383(BoolArgumentType::bool));
      class_5398.method_24581("brigadier:float", FloatArgumentType.class, new class_1362());
      class_5398.method_24581("brigadier:double", DoubleArgumentType.class, new class_8655());
      class_5398.method_24581("brigadier:integer", IntegerArgumentType.class, new class_8297());
      class_5398.method_24581("brigadier:long", LongArgumentType.class, new class_1956());
      class_5398.method_24581("brigadier:string", StringArgumentType.class, new class_1867());
   }

   public static byte method_2898(boolean var0, boolean var1) {
      byte var4 = 0;
      if (var0) {
         var4 = (byte)(var4 | 1);
      }

      if (var1) {
         var4 = (byte)(var4 | 2);
      }

      return var4;
   }

   public static boolean method_2902(byte var0) {
      return false;
   }

   public static boolean method_2900(byte var0) {
      return false;
   }
}
