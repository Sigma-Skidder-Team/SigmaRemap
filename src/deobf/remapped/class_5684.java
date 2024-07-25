package remapped;

import com.mojang.serialization.Lifecycle;
import java.util.Set;
import javax.annotation.Nullable;

public interface class_5684 {
   class_2805 method_25697();

   void method_25695(class_2805 var1);

   boolean method_25700();

   Set<String> method_25701();

   void method_25715(String var1, boolean var2);

   default void method_8656(class_6544 var1) {
      var1.method_29851("Known server brands", () -> String.join(", ", this.method_25701()));
      var1.method_29851("Level was modded", () -> Boolean.toString(this.method_25700()));
      var1.method_29851("Level storage version", () -> {
         int var3 = this.method_25704();
         return String.format("0x%05X - %s", var3, this.method_25696(var3));
      });
   }

   default String method_25696(int var1) {
      switch (var1) {
         case 19132:
            return "McRegion";
         case 19133:
            return "Anvil";
         default:
            return "Unknown?";
      }
   }

   @Nullable
   class_5734 method_25708();

   void method_25698(class_5734 var1);

   class_7203 method_25706();

   class_6292 method_25699();

   class_5734 method_25713(class_6322 var1, class_5734 var2);

   boolean method_8659();

   int method_25704();

   String method_25716();

   class_4666 method_25709();

   void method_25711(class_4666 var1);

   boolean method_25714();

   class_423 method_8661();

   void method_25702(class_423 var1);

   boolean method_8662();

   void method_25707(boolean var1);

   class_291 method_8653();

   class_5734 method_25712();

   class_5734 method_25717();

   void method_25705(class_5734 var1);

   class_2904 method_25703();

   Lifecycle method_25710();
}
