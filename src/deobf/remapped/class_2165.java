package remapped;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.stb.STBTTFontinfo;
import org.lwjgl.stb.STBTruetype;
import org.lwjgl.system.MemoryUtil;

public class class_2165 implements class_3592 {
   private static final Logger field_10801 = LogManager.getLogger();
   private final class_4639 field_10800;
   private final float field_10796;
   private final float field_10797;
   private final float field_10798;
   private final float field_10799;
   private final String field_10802;

   public class_2165(class_4639 var1, float var2, float var3, float var4, float var5, String var6) {
      this.field_10800 = var1;
      this.field_10796 = var2;
      this.field_10797 = var3;
      this.field_10798 = var4;
      this.field_10799 = var5;
      this.field_10802 = var6;
   }

   public static class_3592 method_10068(JsonObject var0) {
      float var3 = 0.0F;
      float var4 = 0.0F;
      if (var0.has("shift")) {
         JsonArray var5 = var0.getAsJsonArray("shift");
         if (var5.size() != 2) {
            throw new JsonParseException("Expected 2 elements in 'shift', found " + var5.size());
         }

         var3 = class_6539.method_29773(var5.get(0), "shift[0]");
         var4 = class_6539.method_29773(var5.get(1), "shift[1]");
      }

      StringBuilder var9 = new StringBuilder();
      if (var0.has("skip")) {
         JsonElement var6 = var0.get("skip");
         if (!var6.isJsonArray()) {
            var9.append(class_6539.method_29795(var6, "skip"));
         } else {
            JsonArray var7 = class_6539.method_29786(var6, "skip");

            for (int var8 = 0; var8 < var7.size(); var8++) {
               var9.append(class_6539.method_29795(var7.get(var8), "skip[" + var8 + "]"));
            }
         }
      }

      return new class_2165(
         new class_4639(class_6539.method_29796(var0, "file")),
         class_6539.method_29775(var0, "size", 11.0F),
         class_6539.method_29775(var0, "oversample", 1.0F),
         var3,
         var4,
         var9.toString()
      );
   }

   @Nullable
   @Override
   public class_3293 method_16786(class_7832 var1) {
      STBTTFontinfo var4 = null;
      ByteBuffer var5 = null;

      try (class_4038 var6 = var1.method_35458(new class_4639(this.field_10800.method_21461(), "font/" + this.field_10800.method_21456()))) {
         field_10801.debug("Loading font {}", this.field_10800);
         var4 = STBTTFontinfo.malloc();
         var5 = class_4970.method_22844(var6.method_18576());
         ((Buffer)var5).flip();
         field_10801.debug("Reading font {}", this.field_10800);
         if (!STBTruetype.stbtt_InitFont(var4, var5)) {
            throw new IOException("Invalid ttf");
         } else {
            return new class_2979(var5, var4, this.field_10796, this.field_10797, this.field_10798, this.field_10799, this.field_10802);
         }
      } catch (Exception var20) {
         field_10801.error("Couldn't load truetype font {}", this.field_10800, var20);
         if (var4 != null) {
            var4.free();
         }

         MemoryUtil.memFree(var5);
         return null;
      }
   }
}
