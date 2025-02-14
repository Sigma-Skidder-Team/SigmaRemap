package mapped;

import com.google.common.hash.HashFunction;
import com.google.common.hash.Hashing;
import com.google.gson.Gson;
import com.google.gson.JsonElement;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Objects;

public interface Class4442 {
   HashFunction field21602 = Hashing.sha1();

   void method14013(Class8297 var1) throws IOException;

   String method14012();

   static void method14020(Gson var0, Class8297 var1, JsonElement var2, Path var3) throws IOException {
      String var6 = var0.toJson(var2);
      String var7 = field21602.hashUnencodedChars(var6).toString();
      if (!Objects.equals(var1.method29001(var3), var7) || !Files.exists(var3)) {
         Files.createDirectories(var3.getParent());

         try (BufferedWriter var8 = Files.newBufferedWriter(var3)) {
            var8.write(var6);
         }
      }

      var1.method29002(var3, var7);
   }
}
