package mapped;

import com.google.gson.JsonObject;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.nbt.INBT;

import java.util.List;
import java.util.function.Supplier;

public class Class9603 {
   private final String field44918;
   private final Class9670 field44919;
   private final String field44920;
   private final Class9670 field44921;
   private final Class1819 field44922;

   public Class9603(String var1, String var2, Class1819 var3) {
      this.field44918 = var1;
      this.field44919 = Class142.method434(var1);
      this.field44920 = var2;
      this.field44921 = Class142.method434(var2);
      this.field44922 = var3;
   }

   public void method37313(Supplier<INBT> var1, INBT var2) {
      try {
         List var5 = this.field44919.method37725(var2);
         if (!var5.isEmpty()) {
            this.field44922.method8068((INBT)var1.get(), this.field44921, var5);
         }
      } catch (CommandSyntaxException var6) {
      }
   }

   public JsonObject method37314() {
      JsonObject var3 = new JsonObject();
      var3.addProperty("source", this.field44918);
      var3.addProperty("target", this.field44920);
      var3.addProperty("op", Class1819.method8070(this.field44922));
      return var3;
   }

   public static Class9603 method37315(JsonObject var0) {
      String var3 = JSONUtils.method32763(var0, "source");
      String var4 = JSONUtils.method32763(var0, "target");
      Class1819 var5 = Class1819.method8069(JSONUtils.method32763(var0, "op"));
      return new Class9603(var3, var4, var5);
   }
}
