package remapped;

import com.google.common.collect.Maps;
import com.google.common.io.Files;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_5217 {
   public static final Logger field_26786 = LogManager.getLogger();
   private final Map<String, File> field_26784 = Maps.newHashMap();
   private final Map<Identifier, File> field_26787 = Maps.newHashMap();

   public class_5217() {
   }

   public class_5217(File var1, String var2) {
      File var5 = new File(var1, "objects");
      File var6 = new File(var1, "indexes/" + var2 + ".json");
      BufferedReader var7 = null;

      try {
         var7 = Files.newReader(var6, StandardCharsets.UTF_8);
         JsonObject var8 = class_6539.method_29805(var7);
         JsonObject var9 = class_6539.method_29784(var8, "objects", (JsonObject)null);
         if (var9 != null) {
            for (Entry var11 : var9.entrySet()) {
               JsonObject var12 = (JsonObject)var11.getValue();
               String var13 = (String)var11.getKey();
               String[] var14 = var13.split("/", 2);
               String var15 = class_6539.method_29796(var12, "hash");
               File var16 = new File(var5, var15.substring(0, 2) + "/" + var15);
               if (var14.length == 1) {
                  this.field_26784.put(var14[0], var16);
               } else {
                  this.field_26787.put(new Identifier(var14[0], var14[1]), var16);
               }
            }
         }
      } catch (JsonParseException var21) {
         field_26786.error("Unable to parse resource index file: {}", var6);
      } catch (FileNotFoundException var22) {
         field_26786.error("Can't find the resource index file: {}", var6);
      } finally {
         IOUtils.closeQuietly(var7);
      }
   }

   @Nullable
   public File method_23900(Identifier var1) {
      return this.field_26787.get(var1);
   }

   @Nullable
   public File method_23899(String var1) {
      return this.field_26784.get(var1);
   }

   public Collection<Identifier> method_23898(String var1, String var2, int var3, Predicate<String> var4) {
      return this.field_26787.keySet().stream().filter(var3x -> {
         String var6 = var3x.method_21456();
         return var3x.method_21461().equals(var2) && !var6.endsWith(".mcmeta") && var6.startsWith(var1 + "/") && var4.test(var6);
      }).collect(Collectors.<Identifier>toList());
   }
}
