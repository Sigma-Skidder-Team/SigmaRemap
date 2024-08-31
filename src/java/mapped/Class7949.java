package mapped;

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

import net.minecraft.util.ResourceLocation;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class7949 {
   public static final Logger field34181 = LogManager.getLogger();
   private final Map<String, File> field34182 = Maps.newHashMap();
   private final Map<ResourceLocation, File> field34183 = Maps.newHashMap();

   public Class7949() {
   }

   public Class7949(File var1, String var2) {
      File var5 = new File(var1, "objects");
      File var6 = new File(var1, "indexes/" + var2 + ".json");
      BufferedReader var7 = null;

      try {
         var7 = Files.newReader(var6, StandardCharsets.UTF_8);
         JsonObject var8 = JSONUtils.method32801(var7);
         JsonObject var9 = JSONUtils.method32783(var8, "objects", (JsonObject)null);
         if (var9 != null) {
            for (Entry var11 : var9.entrySet()) {
               JsonObject var12 = (JsonObject)var11.getValue();
               String var13 = (String)var11.getKey();
               String[] var14 = var13.split("/", 2);
               String var15 = JSONUtils.method32763(var12, "hash");
               File var16 = new File(var5, var15.substring(0, 2) + "/" + var15);
               if (var14.length == 1) {
                  this.field34182.put(var14[0], var16);
               } else {
                  this.field34183.put(new ResourceLocation(var14[0], var14[1]), var16);
               }
            }
         }
      } catch (JsonParseException var21) {
         field34181.error("Unable to parse resource index file: {}", var6);
      } catch (FileNotFoundException var22) {
         field34181.error("Can't find the resource index file: {}", var6);
      } finally {
         IOUtils.closeQuietly(var7);
      }
   }

   @Nullable
   public File method27015(ResourceLocation var1) {
      return this.field34183.get(var1);
   }

   @Nullable
   public File method27016(String var1) {
      return this.field34182.get(var1);
   }

   public Collection<ResourceLocation> method27017(String var1, String var2, int var3, Predicate<String> var4) {
      return this.field34183.keySet().stream().filter(var3x -> {
         String var6 = var3x.getPath();
         return var3x.getNamespace().equals(var2) && !var6.endsWith(".mcmeta") && var6.startsWith(var1 + "/") && var4.test(var6);
      }).collect(Collectors.<ResourceLocation>toList());
   }
}
