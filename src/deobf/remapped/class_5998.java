package remapped;

import com.google.common.hash.HashFunction;
import com.google.common.hash.Hashing;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Objects;

public interface class_5998 {
   HashFunction field_30556 = Hashing.sha1();

   void method_27389(class_4162 var1) throws IOException;

   String method_27387();

   static void method_27388(Gson var0, class_4162 var1, JsonElement var2, Path var3) throws IOException {
      String var6 = var0.toJson(var2);
      String var7 = field_30556.hashUnencodedChars(var6).toString();
      if (!Objects.equals(var1.method_19313(var3), var7) || !Files.exists(var3)) {
         Files.createDirectories(var3.getParent());

         try (BufferedWriter var8 = Files.newBufferedWriter(var3)) {
            var8.write(var6);
         }
      }

      var1.method_19317(var3, var7);
   }
}
