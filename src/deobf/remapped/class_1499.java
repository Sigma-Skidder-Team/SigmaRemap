package remapped;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mojang.brigadier.CommandDispatcher;
import java.io.IOException;
import java.nio.file.Path;

public class class_1499 implements class_5998 {
   private static final Gson field_7967 = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
   private final class_6901 field_7968;

   public class_1499(class_6901 var1) {
      this.field_7968 = var1;
   }

   @Override
   public void method_27389(class_4162 var1) throws IOException {
      Path var4 = this.field_7968.method_31600().resolve("reports/commands.json");
      CommandDispatcher var5 = new class_465(class_9019.field_46138).method_2229();
      class_5998.method_27388(field_7967, var1, class_5398.method_24576(var5, var5.getRoot()), var4);
   }

   @Override
   public String method_27387() {
      return "Command Syntax";
   }
}
