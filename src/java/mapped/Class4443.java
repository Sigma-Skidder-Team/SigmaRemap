package mapped;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mojang.brigadier.CommandDispatcher;

import java.io.IOException;
import java.nio.file.Path;

public class Class4443 implements Class4442 {
   private static final Gson field21603 = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
   private final Class9068 field21604;

   public Class4443(Class9068 var1) {
      this.field21604 = var1;
   }

   @Override
   public void method14013(Class8297 var1) throws IOException {
      Path var4 = this.field21604.method33776().resolve("reports/commands.json");
      CommandDispatcher var5 = new Class6099(Commands.field13575).method18842();
      Class4442.method14020(field21603, var1, Class8651.method31102(var5, var5.getRoot()), var4);
   }

   @Override
   public String method14012() {
      return "Command Syntax";
   }
}
