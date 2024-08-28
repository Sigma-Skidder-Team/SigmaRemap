package mapped;

import com.mojang.serialization.Lifecycle;
import java.util.Set;
import javax.annotation.Nullable;

public interface Class6611 {
   Class7818 method20091();

   void method20092(Class7818 var1);

   boolean method20096();

   Set<String> method20097();

   void method20095(String var1, boolean var2);

   default void method20049(Class8965 var1) {
      var1.method32806("Known server brands", () -> String.join(", ", this.method20097()));
      var1.method32806("Level was modded", () -> Boolean.toString(this.method20096()));
      var1.method32806("Level storage version", () -> {
         int var3 = this.method20084();
         return String.format("0x%05X - %s", var3, this.method20104(var3));
      });
   }

   default String method20104(int var1) {
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
   Class39 method20093();

   void method20094(Class39 var1);

   Class6608 method20098();

   Class8898 method20099();

   Class39 method20080(Class8904 var1, Class39 var2);

   boolean method20045();

   int method20084();

   String method20054();

   Class1894 method20067();

   void method20073(Class1894 var1);

   boolean method20072();

   Class2197 method20047();

   void method20085(Class2197 var1);

   boolean method20048();

   void method20086(boolean var1);

   Class5462 method20046();

   Class39 method20083();

   Class39 method20089();

   void method20090(Class39 var1);

   Class7846 method20087();

   Lifecycle method20088();
}
