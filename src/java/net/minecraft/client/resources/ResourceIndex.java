package net.minecraft.client.resources;

import com.google.common.collect.Maps;
import com.google.common.io.Files;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

import mapped.JSONUtils;
import net.minecraft.util.ResourceLocation;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ResourceIndex {
   public static final Logger LOGGER = LogManager.getLogger();
   private final Map<String, File> rootFiles = Maps.newHashMap();
   private final Map<ResourceLocation, File> namespaceFiles = Maps.newHashMap();

   public ResourceIndex() {
   }

   public ResourceIndex(File assetsFolder, String indexName)
   {
      File file1 = new File(assetsFolder, "objects");
      File file2 = new File(assetsFolder, "indexes/" + indexName + ".json");
      BufferedReader bufferedreader = null;

      try
      {
         bufferedreader = Files.newReader(file2, StandardCharsets.UTF_8);
         JsonObject jsonobject = JSONUtils.fromJson(bufferedreader);
         JsonObject jsonobject1 = JSONUtils.getJSONObject(jsonobject, "objects", (JsonObject)null);

         if (jsonobject1 != null)
         {
            for (Entry<String, JsonElement> entry : jsonobject1.entrySet())
            {
               JsonObject jsonobject2 = (JsonObject)entry.getValue();
               String s = entry.getKey();
               String[] astring = s.split("/", 2);
               String s1 = JSONUtils.getString(jsonobject2, "hash");
               File file3 = new File(file1, s1.substring(0, 2) + "/" + s1);

               if (astring.length == 1)
               {
                  this.rootFiles.put(astring[0], file3);
               }
               else
               {
                  this.namespaceFiles.put(new ResourceLocation(astring[0], astring[1]), file3);
               }
            }
         }
      }
      catch (JsonParseException jsonparseexception)
      {
         LOGGER.error("Unable to parse resource index file: {}", (Object)file2);
      }
      catch (FileNotFoundException filenotfoundexception)
      {
         LOGGER.error("Can't find the resource index file: {}", (Object)file2);
      }
      finally
      {
         IOUtils.closeQuietly((Reader)bufferedreader);
      }
   }

   @Nullable
   public File getFile(ResourceLocation var1) {
      return this.namespaceFiles.get(var1);
   }

   @Nullable
   public File getFile(String var1) {
      return this.rootFiles.get(var1);
   }

   public Collection<ResourceLocation> getFiles(String var1, String var2, int var3, Predicate<String> var4) {
      return this.namespaceFiles.keySet().stream().filter(var3x -> {
         String var6 = var3x.getPath();
         return var3x.getNamespace().equals(var2) && !var6.endsWith(".mcmeta") && var6.startsWith(var1 + "/") && var4.test(var6);
      }).collect(Collectors.<ResourceLocation>toList());
   }
}
