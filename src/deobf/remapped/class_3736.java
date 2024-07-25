package remapped;

import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class class_3736 implements class_8169 {
   private static final Logger field_18259 = LogManager.getLogger();
   public final File field_18260;

   public class_3736(File var1) {
      this.field_18260 = var1;
   }

   private static String method_17310(class_3168 var0, class_4639 var1) {
      return String.format("%s/%s/%s", var0.method_14619(), var1.method_21461(), var1.method_21456());
   }

   public static String method_17309(File var0, File var1) {
      return var0.toURI().relativize(var1.toURI()).getPath();
   }

   public InputStream 䴂쬫ಽ䩉㐖쬫(class_3168 var1, class_4639 var2) throws IOException {
      return this.method_17304(method_17310(var1, var2));
   }

   public boolean 郝䡸㹔柿Ꮺ쟗(class_3168 var1, class_4639 var2) {
      return this.method_17308(method_17310(var1, var2));
   }

   public abstract InputStream method_17304(String var1) throws IOException;

   public InputStream 㢸聛䬾뗴缰鼒(String var1) throws IOException {
      if (!var1.contains("/") && !var1.contains("\\")) {
         return this.method_17304(var1);
      } else {
         throw new IllegalArgumentException("Root resources can only be filenames, not paths (no / allowed!)");
      }
   }

   public abstract boolean method_17308(String var1);

   public void method_17306(String var1) {
      field_18259.warn("ResourcePack: ignored non-lowercase namespace: {} in {}", var1, this.field_18260);
   }

   @Nullable
   public <T> T 웨室殢ใ藸褕(class_6146<T> var1) throws IOException {
      Object var6;
      try (InputStream var4 = this.method_17304("pack.mcmeta")) {
         var6 = method_17307(var1, var4);
      }

      return (T)var6;
   }

   @Nullable
   public static <T> T method_17307(class_6146<T> var0, InputStream var1) {
      JsonObject var6;
      try (BufferedReader var4 = new BufferedReader(new InputStreamReader(var1, StandardCharsets.UTF_8))) {
         var6 = class_6539.method_29805(var4);
      } catch (JsonParseException | IOException var20) {
         field_18259.error("Couldn't load {} metadata", var0.method_28196(), var20);
         return null;
      }

      if (!var6.has(var0.method_28196())) {
         return null;
      } else {
         try {
            return (T)var0.method_28197(class_6539.method_29783(var6, var0.method_28196()));
         } catch (JsonParseException var17) {
            field_18259.error("Couldn't load {} metadata", var0.method_28196(), var17);
            return null;
         }
      }
   }

   public String 콵樽웎柿㥇竁() {
      return this.field_18260.getName();
   }
}
