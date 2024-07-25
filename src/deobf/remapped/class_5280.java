package remapped;

import com.google.gson.JsonObject;
import java.io.IOException;
import javax.annotation.Nullable;

public class class_5280 implements class_3592 {
   private final Identifier field_27005;
   private final String field_27007;

   public class_5280(Identifier var1, String var2) {
      this.field_27005 = var1;
      this.field_27007 = var2;
   }

   public static class_3592 method_24105(JsonObject var0) {
      return new class_5280(new Identifier(class_6539.method_29796(var0, "sizes")), class_6539.method_29796(var0, "template"));
   }

   @Nullable
   @Override
   public class_3293 method_16786(class_7832 var1) {
      try (class_4038 var4 = MinecraftClient.getInstance().method_8498().method_35458(this.field_27005)) {
         byte[] var6 = new byte[65536];
         var4.method_18576().read(var6);
         return new class_5350(var1, var6, this.field_27007);
      } catch (IOException var19) {
         class_5350.method_24428().error("Cannot load {}, unicode glyphs will not render correctly", this.field_27005);
         return null;
      }
   }
}
