package net.minecraft.client.renderer;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import mapped.*;
import net.minecraft.util.ResourceLocation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Nullable;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class GPUWarning extends Class269<Class4678> {
   private static final Logger field1039 = LogManager.getLogger();
   private static final ResourceLocation field1040 = new ResourceLocation("gpu_warnlist.json");
   private ImmutableMap<String, String> field1041 = ImmutableMap.of();
   private boolean field1042;
   private boolean field1043;
   private boolean field1044;

   public boolean method974() {
      return !this.field1041.isEmpty();
   }

   public boolean method975() {
      return this.method974() && !this.field1043;
   }

   public void method976() {
      this.field1042 = true;
   }

   public void method977() {
      this.field1043 = true;
   }

   public void method978() {
      this.field1043 = true;
      this.field1044 = true;
   }

   public boolean method979() {
      return this.field1042 && !this.field1043;
   }

   public boolean func_241701_h_() {
      return this.field1044;
   }

   public void method981() {
      this.field1042 = false;
      this.field1043 = false;
      this.field1044 = false;
   }

   @Nullable
   public String method982() {
      return (String)this.field1041.get("renderer");
   }

   @Nullable
   public String method983() {
      return (String)this.field1041.get("version");
   }

   @Nullable
   public String method984() {
      return (String)this.field1041.get("vendor");
   }

   @Nullable
   public String func_243499_m() {
      StringBuilder var3 = new StringBuilder();
      this.field1041.forEach((var1, var2) -> var3.append(var1).append(": ").append(var2));
      return var3.length() != 0 ? var3.toString() : null;
   }

   public Class4678 method970(IResourceManager var1, IProfiler var2) {
      ArrayList var5 = Lists.newArrayList();
      ArrayList var6 = Lists.newArrayList();
      ArrayList var7 = Lists.newArrayList();
      var2.startTick();
      JsonObject var8 = method987(var1, var2);
      if (var8 != null) {
         var2.startSection("compile_regex");
         method986(var8.getAsJsonArray("renderer"), var5);
         method986(var8.getAsJsonArray("version"), var6);
         method986(var8.getAsJsonArray("vendor"), var7);
         var2.endSection();
      }

      var2.endTick();
      return new Class4678(var5, var6, var7);
   }

   public void method971(Class4678 var1, IResourceManager var2, IProfiler var3) {
      this.field1041 = Class4678.method14671(var1);
   }

   private static void method986(JsonArray var0, List<Pattern> var1) {
      var0.forEach(var1x -> var1.add(Pattern.compile(var1x.getAsString(), 2)));
   }

   @Nullable
   private static JsonObject method987(IResourceManager var0, IProfiler var1) {
      var1.startSection("parse_json");
      JsonObject var4 = null;

      try (
              JSonShader var5 = var0.getShader(field1040);
              BufferedReader var7 = new BufferedReader(new InputStreamReader(var5.getFile(), StandardCharsets.UTF_8));
      ) {
         var4 = new JsonParser().parse(var7).getAsJsonObject();
      } catch (IOException | JsonSyntaxException var37) {
         field1039.warn("Failed to load GPU warnlist");
      }

      var1.endSection();
      return var4;
   }
}
