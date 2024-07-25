package remapped;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import net.minecraft.client.util.JSONException;
import org.apache.commons.io.IOUtils;

public class class_4067 implements AutoCloseable {
   private final class_4230 field_19806;
   private final class_7832 field_19812;
   private final String field_19810;
   public final List<class_7280> field_19813 = Lists.newArrayList();
   private final Map<String, class_4230> field_19803 = Maps.newHashMap();
   private final List<class_4230> field_19811 = Lists.newArrayList();
   private class_8107 field_19814;
   private int field_19808;
   private int field_19805;
   private float field_19809;
   private float field_19807;

   public class_4067(TextureManager var1, class_7832 var2, class_4230 var3, Identifier var4) throws IOException, JsonSyntaxException {
      this.field_19812 = var2;
      this.field_19806 = var3;
      this.field_19809 = 0.0F;
      this.field_19807 = 0.0F;
      this.field_19808 = var3.field_20526;
      this.field_19805 = var3.field_20534;
      this.field_19810 = var4.toString();
      this.method_18754();
      this.method_18756(var1, var4);
   }

   private void method_18756(TextureManager var1, Identifier var2) throws IOException, JsonSyntaxException {
      class_4038 var5 = null;

      try {
         var5 = this.field_19812.method_35458(var2);
         JsonObject var6 = class_6539.method_29805(new InputStreamReader(var5.method_18576(), StandardCharsets.UTF_8));
         if (class_6539.method_29763(var6, "targets")) {
            JsonArray var22 = var6.getAsJsonArray("targets");
            int var24 = 0;

            for (JsonElement var10 : var22) {
               try {
                  this.method_18748(var10);
               } catch (Exception var19) {
                  class_4573 var12 = class_4573.method_21217(var19);
                  var12.method_21220("targets[" + var24 + "]");
                  throw var12;
               }

               var24++;
            }
         }

         if (class_6539.method_29763(var6, "passes")) {
            JsonArray var23 = var6.getAsJsonArray("passes");
            int var25 = 0;

            for (JsonElement var27 : var23) {
               try {
                  this.method_18747(var1, var27);
               } catch (Exception var18) {
                  class_4573 var28 = class_4573.method_21217(var18);
                  var28.method_21220("passes[" + var25 + "]");
                  throw var28;
               }

               var25++;
            }
         }
      } catch (Exception var20) {
         String var7;
         if (var5 != null) {
            var7 = " (" + var5.method_18579() + ")";
         } else {
            var7 = "";
         }

         class_4573 var8 = class_4573.method_21217(var20);
         var8.method_21218(var2.method_21456() + var7);
         throw var8;
      } finally {
         IOUtils.closeQuietly(var5);
      }
   }

   private void method_18748(JsonElement var1) throws JSONException {
      if (!class_6539.method_29792(var1)) {
         JsonObject var4 = class_6539.method_29782(var1, "target");
         String var5 = class_6539.method_29796(var4, "name");
         int var6 = class_6539.method_29768(var4, "width", this.field_19808);
         int var7 = class_6539.method_29768(var4, "height", this.field_19805);
         if (this.field_19803.containsKey(var5)) {
            throw new class_4573(var5 + " is already defined");
         }

         this.method_18749(var5, var6, var7);
      } else {
         this.method_18749(var1.getAsString(), this.field_19808, this.field_19805);
      }
   }

   private void method_18747(TextureManager var1, JsonElement var2) throws IOException {
      JsonObject var5 = class_6539.method_29782(var2, "pass");
      String var6 = class_6539.method_29796(var5, "name");
      String var7 = class_6539.method_29796(var5, "intarget");
      String var8 = class_6539.method_29796(var5, "outtarget");
      class_4230 var9 = this.method_18759(var7);
      class_4230 var10 = this.method_18759(var8);
      if (var9 == null) {
         throw new class_4573("Input target '" + var7 + "' does not exist");
      } else if (var10 == null) {
         throw new class_4573("Output target '" + var8 + "' does not exist");
      } else {
         class_7280 var11 = this.method_18753(var6, var9, var10);
         JsonArray var12 = class_6539.method_29788(var5, "auxtargets", (JsonArray)null);
         if (var12 != null) {
            int var13 = 0;

            for (JsonElement var15 : var12) {
               try {
                  JsonObject var16 = class_6539.method_29782(var15, "auxtarget");
                  String var40 = class_6539.method_29796(var16, "name");
                  String var18 = class_6539.method_29796(var16, "id");
                  boolean var19;
                  String var20;
                  if (var18.endsWith(":depth")) {
                     var19 = true;
                     var20 = var18.substring(0, var18.lastIndexOf(58));
                  } else {
                     var19 = false;
                     var20 = var18;
                  }

                  class_4230 var21 = this.method_18759(var20);
                  if (var21 == null) {
                     if (var19) {
                        throw new class_4573("Render target '" + var20 + "' can't be used as depth buffer");
                     }

                     Identifier var22 = new Identifier("textures/effect/" + var20 + ".png");
                     class_4038 var23 = null;

                     try {
                        var23 = this.field_19812.method_35458(var22);
                     } catch (FileNotFoundException var33) {
                        throw new class_4573("Render target or texture '" + var20 + "' does not exist");
                     } finally {
                        IOUtils.closeQuietly(var23);
                     }

                     var1.bindTexture(var22);
                     class_8143 var24 = var1.method_35679(var22);
                     int var25 = class_6539.method_29767(var16, "width");
                     int var26 = class_6539.method_29767(var16, "height");
                     boolean var27 = class_6539.method_29771(var16, "bilinear");
                     if (var27) {
                        RenderSystem.method_16490(3553, 10241, 9729);
                        RenderSystem.method_16490(3553, 10240, 9729);
                     } else {
                        RenderSystem.method_16490(3553, 10241, 9728);
                        RenderSystem.method_16490(3553, 10240, 9728);
                     }

                     var11.method_33270(var40, var24::method_37055, var25, var26);
                  } else if (var19) {
                     var11.method_33270(var40, var21::method_19706, var21.field_20533, var21.field_20535);
                  } else {
                     var11.method_33270(var40, var21::method_19724, var21.field_20533, var21.field_20535);
                  }
               } catch (Exception var35) {
                  class_4573 var17 = class_4573.method_21217(var35);
                  var17.method_21220("auxtargets[" + var13 + "]");
                  throw var17;
               }

               var13++;
            }
         }

         JsonArray var36 = class_6539.method_29788(var5, "uniforms", (JsonArray)null);
         if (var36 != null) {
            int var37 = 0;

            for (JsonElement var39 : var36) {
               try {
                  this.method_18751(var39);
               } catch (Exception var32) {
                  class_4573 var41 = class_4573.method_21217(var32);
                  var41.method_21220("uniforms[" + var37 + "]");
                  throw var41;
               }

               var37++;
            }
         }
      }
   }

   private void method_18751(JsonElement var1) throws JSONException {
      JsonObject var4 = class_6539.method_29782(var1, "uniform");
      String var5 = class_6539.method_29796(var4, "name");
      class_3972 var6 = this.field_19813.get(this.field_19813.size() - 1).method_33272().method_19846(var5);
      if (var6 == null) {
         throw new class_4573("Uniform '" + var5 + "' does not exist");
      } else {
         float[] var7 = new float[4];
         int var8 = 0;

         for (JsonElement var10 : class_6539.method_29787(var4, "values")) {
            try {
               var7[var8] = class_6539.method_29773(var10, "value");
            } catch (Exception var13) {
               class_4573 var12 = class_4573.method_21217(var13);
               var12.method_21220("values[" + var8 + "]");
               throw var12;
            }

            var8++;
         }

         switch (var8) {
            case 0:
            default:
               break;
            case 1:
               var6.method_32385(var7[0]);
               break;
            case 2:
               var6.method_32386(var7[0], var7[1]);
               break;
            case 3:
               var6.method_32387(var7[0], var7[1], var7[2]);
               break;
            case 4:
               var6.method_32388(var7[0], var7[1], var7[2], var7[3]);
         }
      }
   }

   public class_4230 method_18758(String var1) {
      return this.field_19803.get(var1);
   }

   public void method_18749(String var1, int var2, int var3) {
      class_4230 var6 = new class_4230(var2, var3, true, MinecraftClient.IS_SYSTEM_MAC);
      var6.method_19709(0.0F, 0.0F, 0.0F, 0.0F);
      this.field_19803.put(var1, var6);
      if (var2 == this.field_19808 && var3 == this.field_19805) {
         this.field_19811.add(var6);
      }
   }

   @Override
   public void close() {
      for (class_4230 var4 : this.field_19803.values()) {
         var4.method_19722();
      }

      for (class_7280 var6 : this.field_19813) {
         var6.close();
      }

      this.field_19813.clear();
   }

   public class_7280 method_18753(String var1, class_4230 var2, class_4230 var3) throws IOException {
      class_7280 var6 = new class_7280(this.field_19812, var1, var2, var3);
      this.field_19813.add(this.field_19813.size(), var6);
      return var6;
   }

   private void method_18754() {
      this.field_19814 = class_8107.method_36825((float)this.field_19806.field_20533, (float)this.field_19806.field_20535, 0.1F, 1000.0F);
   }

   public void method_18750(int var1, int var2) {
      this.field_19808 = this.field_19806.field_20533;
      this.field_19805 = this.field_19806.field_20535;
      this.method_18754();

      for (class_7280 var6 : this.field_19813) {
         var6.method_33274(this.field_19814);
      }

      for (class_4230 var8 : this.field_19811) {
         var8.method_19708(var1, var2, MinecraftClient.IS_SYSTEM_MAC);
      }
   }

   public void method_18755(float var1) {
      if (!(var1 < this.field_19807)) {
         this.field_19809 = this.field_19809 + (var1 - this.field_19807);
      } else {
         this.field_19809 = this.field_19809 + (1.0F - this.field_19807);
         this.field_19809 += var1;
      }

      this.field_19807 = var1;

      while (this.field_19809 > 20.0F) {
         this.field_19809 -= 20.0F;
      }

      for (class_7280 var5 : this.field_19813) {
         var5.method_33273(this.field_19809 / 20.0F);
      }
   }

   public final String method_18752() {
      return this.field_19810;
   }

   public class_4230 method_18759(String var1) {
      if (var1 != null) {
         return !var1.equals("minecraft:main") ? this.field_19803.get(var1) : this.field_19806;
      } else {
         return null;
      }
   }
}
