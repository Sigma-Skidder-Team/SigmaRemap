package remapped;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_5180 extends class_2840<class_192> {
   private static final Logger field_26661 = LogManager.getLogger();
   private static final Identifier field_26664 = new Identifier("gpu_warnlist.json");
   private ImmutableMap<String, String> field_26662 = ImmutableMap.of();
   private boolean field_26659;
   private boolean field_26663;
   private boolean field_26665;

   public boolean method_23746() {
      return !this.field_26662.isEmpty();
   }

   public boolean method_23757() {
      return this.method_23746() && !this.field_26663;
   }

   public void method_23753() {
      this.field_26659 = true;
   }

   public void method_23750() {
      this.field_26663 = true;
   }

   public void method_23748() {
      this.field_26663 = true;
      this.field_26665 = true;
   }

   public boolean method_23758() {
      return this.field_26659 && !this.field_26663;
   }

   public boolean method_23752() {
      return this.field_26665;
   }

   public void method_23759() {
      this.field_26659 = false;
      this.field_26663 = false;
      this.field_26665 = false;
   }

   @Nullable
   public String method_23749() {
      return (String)this.field_26662.get("renderer");
   }

   @Nullable
   public String method_23760() {
      return (String)this.field_26662.get("version");
   }

   @Nullable
   public String method_23747() {
      return (String)this.field_26662.get("vendor");
   }

   @Nullable
   public String method_23751() {
      StringBuilder var3 = new StringBuilder();
      this.field_26662.forEach((var1, var2) -> var3.append(var1).append(": ").append(var2));
      return var3.length() != 0 ? var3.toString() : null;
   }

   public class_192 method_23761(class_7832 var1, class_3492 var2) {
      ArrayList var5 = Lists.newArrayList();
      ArrayList var6 = Lists.newArrayList();
      ArrayList var7 = Lists.newArrayList();
      var2.method_16059();
      JsonObject var8 = method_23755(var1, var2);
      if (var8 != null) {
         var2.startSection("compile_regex");
         method_23754(var8.getAsJsonArray("renderer"), var5);
         method_23754(var8.getAsJsonArray("version"), var6);
         method_23754(var8.getAsJsonArray("vendor"), var7);
         var2.endSection();
      }

      var2.method_16052();
      return new class_192(var5, var6, var7, null);
   }

   public void method_23756(class_192 var1, class_7832 var2, class_3492 var3) {
      this.field_26662 = class_192.method_854(var1);
   }

   private static void method_23754(JsonArray var0, List<Pattern> var1) {
      var0.forEach(var1x -> var1.add(Pattern.compile(var1x.getAsString(), 2)));
   }

   @Nullable
   private static JsonObject method_23755(class_7832 var0, class_3492 var1) {
      var1.startSection("parse_json");
      JsonObject var4 = null;

      try (
         class_4038 var5 = var0.method_35458(field_26664);
         BufferedReader var7 = new BufferedReader(new InputStreamReader(var5.method_18576(), StandardCharsets.UTF_8));
      ) {
         var4 = new JsonParser().parse(var7).getAsJsonObject();
      } catch (IOException | JsonSyntaxException var37) {
         field_26661.warn("Failed to load GPU warnlist");
      }

      var1.endSection();
      return var4;
   }
}
