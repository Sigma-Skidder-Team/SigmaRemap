package mapped;

import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType.StringType;
import net.minecraft.network.PacketBuffer;

public class Class2587 implements Class2586<StringArgumentType> {
   public void method10796(StringArgumentType var1, PacketBuffer var2) {
      var2.method35713(var1.getType());
   }

   public StringArgumentType method10795(PacketBuffer var1) {
      StringType var4 = var1.<StringType>method35712(StringType.class);
      switch (Class6599.field29036[var4.ordinal()]) {
         case 1:
            return StringArgumentType.word();
         case 2:
            return StringArgumentType.string();
         case 3:
         default:
            return StringArgumentType.greedyString();
      }
   }

   @Override
   public void method10794(StringArgumentType var1, JsonObject var2) {
      switch (Class6599.field29036[var1.getType().ordinal()]) {
         case 1:
            var2.addProperty("type", "word");
            break;
         case 2:
            var2.addProperty("type", "phrase");
            break;
         case 3:
         default:
            var2.addProperty("type", "greedy");
      }
   }
}
