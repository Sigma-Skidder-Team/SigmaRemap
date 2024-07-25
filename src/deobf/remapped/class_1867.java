package remapped;

import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType.StringType;

public class class_1867 implements class_5590<StringArgumentType> {
   public void method_8293(StringArgumentType var1, class_8248 var2) {
      var2.method_37750(var1.getType());
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public StringArgumentType method_8291(class_8248 var1) {
      StringType var4 = var1.<StringType>method_37787(StringType.class);
      switch (var4) {
         case SINGLE_WORD:
            return StringArgumentType.word();
         case QUOTABLE_PHRASE:
            return StringArgumentType.string();
         case GREEDY_PHRASE:
         default:
            return StringArgumentType.greedyString();
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void method_8292(StringArgumentType var1, JsonObject var2) {
      switch (var1.getType()) {
         case SINGLE_WORD:
            var2.addProperty("type", "word");
            break;
         case QUOTABLE_PHRASE:
            var2.addProperty("type", "phrase");
            break;
         case GREEDY_PHRASE:
         default:
            var2.addProperty("type", "greedy");
      }
   }
}
