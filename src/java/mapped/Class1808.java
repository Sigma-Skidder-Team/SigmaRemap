package mapped;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import java.util.function.IntSupplier;
import javax.annotation.Nullable;

import net.minecraft.util.JSONUtils;
import net.minecraft.util.ResourceLocation;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import totalcross.json.JSONException;

public class Class1808 implements Class1809, AutoCloseable {
   private static final Logger field9742 = LogManager.getLogger();
   private static final Class1709 field9743 = new Class1709();
   private static Class1808 field9744;
   private static int field9745 = -1;
   private final Map<String, IntSupplier> field9746 = Maps.newHashMap();
   private final List<String> field9747 = Lists.newArrayList();
   private final List<Integer> field9748 = Lists.newArrayList();
   private final List<Class1708> field9749 = Lists.newArrayList();
   private final List<Integer> field9750 = Lists.newArrayList();
   private final Map<String, Class1708> field9751 = Maps.newHashMap();
   private final int field9752;
   private final String field9753;
   private boolean field9754;
   private final Class5869 field9755;
   private final List<Integer> field9756;
   private final List<String> field9757;
   private final Class8144 field9758;
   private final Class8144 field9759;

   public Class1808(IResourceManager var1, String var2) throws IOException {
      ResourceLocation var5 = new ResourceLocation("shaders/program/" + var2 + ".json");
      this.field9753 = var2;
      JSonShader var6 = null;

      try {
         var6 = var1.getShader(var5);
         JsonObject var7 = JSONUtils.fromJson(new InputStreamReader(var6.getFile(), StandardCharsets.UTF_8));
         String var29 = JSONUtils.getString(var7, "vertex");
         String var30 = JSONUtils.getString(var7, "fragment");
         JsonArray var10 = JSONUtils.method32786(var7, "samplers", (JsonArray)null);
         if (var10 != null) {
            int var11 = 0;

            for (JsonElement var13 : var10) {
               try {
                  this.method7939(var13);
               } catch (Exception var26) {
                  JSONException var15 = JSONException.method10464(var26);
                  var15.method10462("samplers[" + var11 + "]");
                  throw var15;
               }

               var11++;
            }
         }

         JsonArray var31 = JSONUtils.method32786(var7, "attributes", (JsonArray)null);
         if (var31 != null) {
            int var32 = 0;
            this.field9756 = Lists.newArrayListWithCapacity(var31.size());
            this.field9757 = Lists.newArrayListWithCapacity(var31.size());

            for (JsonElement var14 : var31) {
               try {
                  this.field9757.add(JSONUtils.method32762(var14, "attribute"));
               } catch (Exception var25) {
                  JSONException var16 = JSONException.method10464(var25);
                  var16.method10462("attributes[" + var32 + "]");
                  throw var16;
               }

               var32++;
            }
         } else {
            this.field9756 = null;
            this.field9757 = null;
         }

         JsonArray var33 = JSONUtils.method32786(var7, "uniforms", (JsonArray)null);
         if (var33 != null) {
            int var35 = 0;

            for (JsonElement var39 : var33) {
               try {
                  this.method7941(var39);
               } catch (Exception var24) {
                  JSONException var17 = JSONException.method10464(var24);
                  var17.method10462("uniforms[" + var35 + "]");
                  throw var17;
               }

               var35++;
            }
         }

         this.field9755 = method7932(JSONUtils.getJSONObject(var7, "blend", (JsonObject)null));
         this.field9758 = method7931(var1, Class1853.field9872, var29);
         this.field9759 = method7931(var1, Class1853.field9873, var30);
         this.field9752 = Class8692.method31317();
         Class8692.method31318(this);
         this.method7938();
         if (this.field9757 != null) {
            for (String var38 : this.field9757) {
               int var40 = Class1708.method7432(this.field9752, var38);
               this.field9756.add(var40);
            }
         }
      } catch (Exception var27) {
         String var8;
         if (var6 != null) {
            var8 = " (" + var6.method7765() + ")";
         } else {
            var8 = "";
         }

         JSONException var9 = JSONException.method10464(var27);
         var9.method10463(var5.getPath() + var8);
         throw var9;
      } finally {
         IOUtils.closeQuietly(var6);
      }

      this.method7935();
   }

   public static Class8144 method7931(IResourceManager var0, Class1853 var1, String var2) throws IOException {
      Class8144 var5 = var1.method8097().get(var2);
      if (var5 == null) {
         ResourceLocation var6 = new ResourceLocation("shaders/program/" + var2 + var1.method8095());
         JSonShader var7 = var0.getShader(var6);

         try {
            var5 = Class8144.method28250(var1, var2, var7.getFile(), var7.method7765());
         } finally {
            IOUtils.closeQuietly(var7);
         }
      }

      return var5;
   }

   public static Class5869 method7932(JsonObject var0) {
      if (var0 != null) {
         int var3 = 32774;
         int var4 = 1;
         int var5 = 0;
         int var6 = 1;
         int var7 = 0;
         boolean var8 = true;
         boolean var9 = false;
         if (JSONUtils.method32755(var0, "func")) {
            var3 = Class5869.method18287(var0.get("func").getAsString());
            if (var3 != 32774) {
               var8 = false;
            }
         }

         if (JSONUtils.method32755(var0, "srcrgb")) {
            var4 = Class5869.method18288(var0.get("srcrgb").getAsString());
            if (var4 != 1) {
               var8 = false;
            }
         }

         if (JSONUtils.method32755(var0, "dstrgb")) {
            var5 = Class5869.method18288(var0.get("dstrgb").getAsString());
            if (var5 != 0) {
               var8 = false;
            }
         }

         if (JSONUtils.method32755(var0, "srcalpha")) {
            var6 = Class5869.method18288(var0.get("srcalpha").getAsString());
            if (var6 != 1) {
               var8 = false;
            }

            var9 = true;
         }

         if (JSONUtils.method32755(var0, "dstalpha")) {
            var7 = Class5869.method18288(var0.get("dstalpha").getAsString());
            if (var7 != 0) {
               var8 = false;
            }

            var9 = true;
         }

         if (!var8) {
            return !var9 ? new Class5869(var4, var5, var3) : new Class5869(var4, var5, var6, var7, var3);
         } else {
            return new Class5869();
         }
      } else {
         return new Class5869();
      }
   }

   @Override
   public void close() {
      for (Class1708 var4 : this.field9749) {
         var4.close();
      }

      Class8692.method31316(this);
   }

   public void method7933() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      Class8692.method31315(0);
      field9745 = -1;
      field9744 = null;

      for (int var3 = 0; var3 < this.field9748.size(); var3++) {
         if (this.field9746.get(this.field9747.get(var3)) != null) {
            GlStateManager.activeTexture(33984 + var3);
            GlStateManager.method23805();
            GlStateManager.bindTexture(0);
         }
      }
   }

   public void method7934() {
      RenderSystem.assertThread(RenderSystem::isOnGameThread);
      this.field9754 = false;
      field9744 = this;
      this.field9755.method18285();
      if (this.field9752 != field9745) {
         Class8692.method31315(this.field9752);
         field9745 = this.field9752;
      }

      for (int var3 = 0; var3 < this.field9748.size(); var3++) {
         String var4 = this.field9747.get(var3);
         IntSupplier var5 = this.field9746.get(var4);
         if (var5 != null) {
            RenderSystem.activeTexture(33984 + var3);
            RenderSystem.enableTexture();
            int var6 = var5.getAsInt();
            if (var6 != -1) {
               RenderSystem.bindTexture(var6);
               Class1708.method7431(this.field9748.get(var3), var3);
            }
         }
      }

      for (Class1708 var8 : this.field9749) {
         var8.method7445();
      }
   }

   @Override
   public void method7935() {
      this.field9754 = true;
   }

   @Nullable
   public Class1708 method7936(String var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      return this.field9751.get(var1);
   }

   public Class1709 getFromName(String var1) {
      RenderSystem.assertThread(RenderSystem::isOnGameThread);
      Class1708 var4 = this.method7936(var1);
      return (Class1709)(var4 != null ? var4 : field9743);
   }

   private void method7938() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      IntArrayList var3 = new IntArrayList();

      for (int var4 = 0; var4 < this.field9747.size(); var4++) {
         String var5 = this.field9747.get(var4);
         int var6 = Class1708.method7430(this.field9752, var5);
         if (var6 != -1) {
            this.field9748.add(var6);
         } else {
            field9742.warn("ShaderGroup {} could not find sampler named {} in the specified shader program.", this.field9753, var5);
            this.field9746.remove(var5);
            var3.add(var4);
         }
      }

      for (int var8 = var3.size() - 1; var8 >= 0; var8--) {
         this.field9747.remove(var3.getInt(var8));
      }

      for (Class1708 var10 : this.field9749) {
         String var11 = var10.method7436();
         int var7 = Class1708.method7430(this.field9752, var11);
         if (var7 != -1) {
            this.field9750.add(var7);
            var10.method7435(var7);
            this.field9751.put(var11, var10);
         } else {
            field9742.warn("Could not find uniform named {} in the specified shader program.", var11);
         }
      }
   }

   private void method7939(JsonElement var1) {
      JsonObject var4 = JSONUtils.getJSONObject(var1, "sampler");
      String var5 = JSONUtils.getString(var4, "name");
      if (JSONUtils.method32755(var4, "file")) {
         this.field9747.add(var5);
      } else {
         this.field9746.put(var5, (IntSupplier)null);
         this.field9747.add(var5);
      }
   }

   public void method7940(String var1, IntSupplier var2) {
      if (this.field9746.containsKey(var1)) {
         this.field9746.remove(var1);
      }

      this.field9746.put(var1, var2);
      this.method7935();
   }

   private void method7941(JsonElement var1) throws JSONException {
      JsonObject var4 = JSONUtils.getJSONObject(var1, "uniform");
      String var5 = JSONUtils.getString(var4, "name");
      int var6 = Class1708.method7434(JSONUtils.getString(var4, "type"));
      int var7 = JSONUtils.method32777(var4, "count");
      float[] var8 = new float[Math.max(var7, 16)];
      JsonArray var9 = JSONUtils.method32785(var4, "values");
      if (var9.size() != var7 && var9.size() > 1) {
         throw new JSONException("Invalid amount of values specified (expected " + var7 + ", found " + var9.size() + ")");
      } else {
         int var10 = 0;

         for (JsonElement var12 : var9) {
            try {
               var8[var10] = JSONUtils.method32770(var12, "value");
            } catch (Exception var15) {
               JSONException var14 = JSONException.method10464(var15);
               var14.method10462("values[" + var10 + "]");
               throw var14;
            }

            var10++;
         }

         if (var7 > 1 && var9.size() == 1) {
            while (var10 < var7) {
               var8[var10] = var8[0];
               var10++;
            }
         }

         int var16 = var7 > 1 && var7 <= 4 && var6 < 8 ? var7 - 1 : 0;
         Class1708 var17 = new Class1708(var5, var6 + var16, var7, this);
         if (var6 <= 3) {
            var17.method7442((int)var8[0], (int)var8[1], (int)var8[2], (int)var8[3]);
         } else if (var6 <= 7) {
            var17.method7441(var8[0], var8[1], var8[2], var8[3]);
         } else {
            var17.method7443(var8);
         }

         this.field9749.add(var17);
      }
   }

   @Override
   public Class8144 method7942() {
      return this.field9758;
   }

   @Override
   public Class8144 method7943() {
      return this.field9759;
   }

   @Override
   public int method7944() {
      return this.field9752;
   }
}
