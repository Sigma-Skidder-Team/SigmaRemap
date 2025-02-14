package mapped;

import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.arguments.DoubleArgumentType;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.arguments.LongArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;

public class Class6397 {
   public static void method19493() {
      Class8651.method31095("brigadier:bool", BoolArgumentType.class, new Class2591(BoolArgumentType::bool));
      Class8651.method31095("brigadier:float", FloatArgumentType.class, new Class2590());
      Class8651.method31095("brigadier:double", DoubleArgumentType.class, new Class2592());
      Class8651.method31095("brigadier:integer", IntegerArgumentType.class, new Class2593());
      Class8651.method31095("brigadier:long", LongArgumentType.class, new Class2588());
      Class8651.method31095("brigadier:string", StringArgumentType.class, new Class2587());
   }

   public static byte method19494(boolean var0, boolean var1) {
      byte var4 = 0;
      if (var0) {
         var4 = (byte)(var4 | 1);
      }

      if (var1) {
         var4 = (byte)(var4 | 2);
      }

      return var4;
   }

   public static boolean method19495(byte var0) {
      return false;
   }

   public static boolean method19496(byte var0) {
      return false;
   }
}
