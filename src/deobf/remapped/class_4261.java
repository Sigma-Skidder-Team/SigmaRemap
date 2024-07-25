package remapped;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import java.util.function.IntSupplier;
import javax.annotation.Nullable;
import net.minecraft.client.util.JSONException;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_4261 implements class_2072, AutoCloseable {
   private static final Logger field_20640 = LogManager.getLogger();
   private static final class_7049 field_20654 = new class_7049();
   private static class_4261 field_20645;
   private static int field_20639 = -1;
   private final Map<String, IntSupplier> field_20650 = Maps.newHashMap();
   private final List<String> field_20642 = Lists.newArrayList();
   private final List<Integer> field_20643 = Lists.newArrayList();
   private final List<class_3972> field_20649 = Lists.newArrayList();
   private final List<Integer> field_20652 = Lists.newArrayList();
   private final Map<String, class_3972> field_20653 = Maps.newHashMap();
   private final int field_20641;
   private final String field_20638;
   private boolean field_20648;
   private final class_348 field_20636;
   private final List<Integer> field_20651;
   private final List<String> field_20644;
   private final class_3710 field_20646;
   private final class_3710 field_20637;

   public class_4261(class_7832 var1, String var2) throws IOException {
      Identifier var5 = new Identifier("shaders/program/" + var2 + ".json");
      this.field_20638 = var2;
      class_4038 var6 = null;

      try {
         var6 = var1.method_35458(var5);
         JsonObject var7 = class_6539.method_29805(new InputStreamReader(var6.method_18576(), StandardCharsets.UTF_8));
         String var29 = class_6539.method_29796(var7, "vertex");
         String var30 = class_6539.method_29796(var7, "fragment");
         JsonArray var10 = class_6539.method_29788(var7, "samplers", (JsonArray)null);
         if (var10 != null) {
            int var11 = 0;

            for (JsonElement var13 : var10) {
               try {
                  this.method_19849(var13);
               } catch (Exception var26) {
                  class_4573 var15 = class_4573.method_21217(var26);
                  var15.method_21220("samplers[" + var11 + "]");
                  throw var15;
               }

               var11++;
            }
         }

         JsonArray var31 = class_6539.method_29788(var7, "attributes", (JsonArray)null);
         if (var31 != null) {
            int var32 = 0;
            this.field_20651 = Lists.newArrayListWithCapacity(var31.size());
            this.field_20644 = Lists.newArrayListWithCapacity(var31.size());

            for (JsonElement var14 : var31) {
               try {
                  this.field_20644.add(class_6539.method_29795(var14, "attribute"));
               } catch (Exception var25) {
                  class_4573 var16 = class_4573.method_21217(var25);
                  var16.method_21220("attributes[" + var32 + "]");
                  throw var16;
               }

               var32++;
            }
         } else {
            this.field_20651 = null;
            this.field_20644 = null;
         }

         JsonArray var33 = class_6539.method_29788(var7, "uniforms", (JsonArray)null);
         if (var33 != null) {
            int var35 = 0;

            for (JsonElement var39 : var33) {
               try {
                  this.method_19848(var39);
               } catch (Exception var24) {
                  class_4573 var17 = class_4573.method_21217(var24);
                  var17.method_21220("uniforms[" + var35 + "]");
                  throw var17;
               }

               var35++;
            }
         }

         this.field_20636 = method_19850(class_6539.method_29784(var7, "blend", (JsonObject)null));
         this.field_20646 = method_19844(var1, class_7667.field_38986, var29);
         this.field_20637 = method_19844(var1, class_7667.field_38983, var30);
         this.field_20641 = class_5564.method_25273();
         class_5564.method_25270(this);
         this.method_19851();
         if (this.field_20644 != null) {
            for (String var38 : this.field_20644) {
               int var40 = class_3972.method_18338(this.field_20641, var38);
               this.field_20651.add(var40);
            }
         }
      } catch (Exception var27) {
         String var8;
         if (var6 != null) {
            var8 = " (" + var6.method_18579() + ")";
         } else {
            var8 = "";
         }

         class_4573 var9 = class_4573.method_21217(var27);
         var9.method_21218(var5.method_21456() + var8);
         throw var9;
      } finally {
         IOUtils.closeQuietly(var6);
      }

      this.method_9675();
   }

   public static class_3710 method_19844(class_7832 var0, class_7667 var1, String var2) throws IOException {
      class_3710 var5 = var1.method_34733().get(var2);
      if (var5 == null) {
         Identifier var6 = new Identifier("shaders/program/" + var2 + var1.method_34737());
         class_4038 var7 = var0.method_35458(var6);

         try {
            var5 = class_3710.method_17225(var1, var2, var7.method_18576(), var7.method_18579());
         } finally {
            IOUtils.closeQuietly(var7);
         }
      }

      return var5;
   }

   public static class_348 method_19850(JsonObject var0) {
      if (var0 != null) {
         int var3 = 32774;
         int var4 = 1;
         int var5 = 0;
         int var6 = 1;
         int var7 = 0;
         boolean var8 = true;
         boolean var9 = false;
         if (class_6539.method_29793(var0, "func")) {
            var3 = class_348.method_1771(var0.get("func").getAsString());
            if (var3 != 32774) {
               var8 = false;
            }
         }

         if (class_6539.method_29793(var0, "srcrgb")) {
            var4 = class_348.method_1768(var0.get("srcrgb").getAsString());
            if (var4 != 1) {
               var8 = false;
            }
         }

         if (class_6539.method_29793(var0, "dstrgb")) {
            var5 = class_348.method_1768(var0.get("dstrgb").getAsString());
            if (var5 != 0) {
               var8 = false;
            }
         }

         if (class_6539.method_29793(var0, "srcalpha")) {
            var6 = class_348.method_1768(var0.get("srcalpha").getAsString());
            if (var6 != 1) {
               var8 = false;
            }

            var9 = true;
         }

         if (class_6539.method_29793(var0, "dstalpha")) {
            var7 = class_348.method_1768(var0.get("dstalpha").getAsString());
            if (var7 != 0) {
               var8 = false;
            }

            var9 = true;
         }

         if (!var8) {
            return !var9 ? new class_348(var4, var5, var3) : new class_348(var4, var5, var6, var7, var3);
         } else {
            return new class_348();
         }
      } else {
         return new class_348();
      }
   }

   @Override
   public void close() {
      for (class_3972 var4 : this.field_20649) {
         var4.close();
      }

      class_5564.method_25272(this);
   }

   public void method_19843() {
      class_3542.method_16431(class_3542::method_16366);
      class_5564.method_25269(0);
      field_20639 = -1;
      field_20645 = null;

      for (int var3 = 0; var3 < this.field_20643.size(); var3++) {
         if (this.field_20650.get(this.field_20642.get(var3)) != null) {
            class_1920.method_8899(33984 + var3);
            class_1920.method_8848();
            class_1920.method_8791(0);
         }
      }
   }

   public void method_19852() {
      class_3542.method_16431(class_3542::method_16429);
      this.field_20648 = false;
      field_20645 = this;
      this.field_20636.method_1769();
      if (this.field_20641 != field_20639) {
         class_5564.method_25269(this.field_20641);
         field_20639 = this.field_20641;
      }

      for (int var3 = 0; var3 < this.field_20643.size(); var3++) {
         String var4 = this.field_20642.get(var3);
         IntSupplier var5 = this.field_20650.get(var4);
         if (var5 != null) {
            class_3542.method_16492(33984 + var3);
            class_3542.method_16432();
            int var6 = var5.getAsInt();
            if (var6 != -1) {
               class_3542.method_16446(var6);
               class_3972.method_18331(this.field_20643.get(var3), var3);
            }
         }
      }

      for (class_3972 var8 : this.field_20649) {
         var8.method_18339();
      }
   }

   @Override
   public void method_9675() {
      this.field_20648 = true;
   }

   @Nullable
   public class_3972 method_19846(String var1) {
      class_3542.method_16431(class_3542::method_16366);
      return this.field_20653.get(var1);
   }

   public class_7049 method_19853(String var1) {
      class_3542.method_16431(class_3542::method_16429);
      class_3972 var4 = this.method_19846(var1);
      return (class_7049)(var4 != null ? var4 : field_20654);
   }

   private void method_19851() {
      class_3542.method_16431(class_3542::method_16366);
      IntArrayList var3 = new IntArrayList();

      for (int var4 = 0; var4 < this.field_20642.size(); var4++) {
         String var5 = this.field_20642.get(var4);
         int var6 = class_3972.method_18332(this.field_20641, var5);
         if (var6 != -1) {
            this.field_20643.add(var6);
         } else {
            field_20640.warn("Shader {} could not find sampler named {} in the specified shader program.", this.field_20638, var5);
            this.field_20650.remove(var5);
            var3.add(var4);
         }
      }

      for (int var8 = var3.size() - 1; var8 >= 0; var8--) {
         this.field_20642.remove(var3.getInt(var8));
      }

      for (class_3972 var10 : this.field_20649) {
         String var11 = var10.method_18340();
         int var7 = class_3972.method_18332(this.field_20641, var11);
         if (var7 != -1) {
            this.field_20652.add(var7);
            var10.method_18337(var7);
            this.field_20653.put(var11, var10);
         } else {
            field_20640.warn("Could not find uniform named {} in the specified shader program.", var11);
         }
      }
   }

   private void method_19849(JsonElement var1) {
      JsonObject var4 = class_6539.method_29782(var1, "sampler");
      String var5 = class_6539.method_29796(var4, "name");
      if (class_6539.method_29793(var4, "file")) {
         this.field_20642.add(var5);
      } else {
         this.field_20650.put(var5, (IntSupplier)null);
         this.field_20642.add(var5);
      }
   }

   public void method_19847(String var1, IntSupplier var2) {
      if (this.field_20650.containsKey(var1)) {
         this.field_20650.remove(var1);
      }

      this.field_20650.put(var1, var2);
      this.method_9675();
   }

   private void method_19848(JsonElement var1) throws JSONException {
      JsonObject var4 = class_6539.method_29782(var1, "uniform");
      String var5 = class_6539.method_29796(var4, "name");
      int var6 = class_3972.method_18330(class_6539.method_29796(var4, "type"));
      int var7 = class_6539.method_29767(var4, "count");
      float[] var8 = new float[Math.max(var7, 16)];
      JsonArray var9 = class_6539.method_29787(var4, "values");
      if (var9.size() != var7 && var9.size() > 1) {
         throw new class_4573("Invalid amount of values specified (expected " + var7 + ", found " + var9.size() + ")");
      } else {
         int var10 = 0;

         for (JsonElement var12 : var9) {
            try {
               var8[var10] = class_6539.method_29773(var12, "value");
            } catch (Exception var15) {
               class_4573 var14 = class_4573.method_21217(var15);
               var14.method_21220("values[" + var10 + "]");
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
         class_3972 var17 = new class_3972(var5, var6 + var16, var7, this);
         if (var6 <= 3) {
            var17.method_32389((int)var8[0], (int)var8[1], (int)var8[2], (int)var8[3]);
         } else if (var6 <= 7) {
            var17.method_32392(var8[0], var8[1], var8[2], var8[3]);
         } else {
            var17.method_32391(var8);
         }

         this.field_20649.add(var17);
      }
   }

   @Override
   public class_3710 method_9674() {
      return this.field_20646;
   }

   @Override
   public class_3710 method_9673() {
      return this.field_20637;
   }

   @Override
   public int method_9672() {
      return this.field_20641;
   }
}
