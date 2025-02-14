package net.optifine.entity.model;

import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import it.unimi.dsi.fastutil.objects.ObjectList;
import mapped.*;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityType;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.ResourceLocation;
import net.optifine.Config;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CustomEntityModels {
   private static boolean field45853 = false;
   private static Map<EntityType, EntityRenderer> field45854 = null;
   private static Map<TileEntityType, Class5942> field45855 = null;
   private static Map<Class2137, Class2828> field45856 = null;

   public static void method38688() {
      Map var2 = method38689();
      Map var3 = method38690();
      Map var4 = method38691();
      if (var2 != null) {
         if (var3 != null) {
            field45853 = false;
            var2.clear();
            var3.clear();
            var4.clear();
            var2.putAll(field45854);
            var3.putAll(field45855);
            var4.putAll(field45856);
            if (Config.method26973()) {
               ResourceLocation[] var5 = method38692();

               for (int var6 = 0; var6 < var5.length; var6++) {
                  ResourceLocation var7 = var5[var6];
                  Config.method26810("CustomEntityModel: " + var7.getPath());
                  Class9492 var8 = method38693(var7);
                  if (var8 != null) {
                     Class4862 var9 = var8.method36665();
                     if (!(var8 instanceof EntityRenderer)) {
                        if (!(var8 instanceof Class5942)) {
                           Config.method26811("Unknown renderer type: " + var8.getClass().getName());
                        } else {
                           var3.put(var9.method15004().get(), (Class5942)var8);
                        }
                     } else {
                        var2.put(var9.method15003().get(), (EntityRenderer)var8);
                     }

                     field45853 = true;
                  }
               }
            }
         } else {
            Config.method26811("Tile entity render map not found, custom entity models are DISABLED.");
         }
      } else {
         Config.method26811("Entity render map not found, custom entity models are DISABLED.");
      }
   }

   private static Map<EntityType, EntityRenderer> method38689() {
      EntityRendererManager var2 = Minecraft.getInstance().getRenderManager();
      Map var3 = var2.method32232();
      if (var3 != null) {
         if (field45854 == null) {
            field45854 = new HashMap<EntityType, EntityRenderer>(var3);
         }

         return var3;
      } else {
         return null;
      }
   }

   private static Map<TileEntityType, Class5942> method38690() {
      Map var2 = TileEntityRendererDispatcher.instance.field34742;
      if (field45855 == null) {
         field45855 = new HashMap<TileEntityType, Class5942>(var2);
      }

      return var2;
   }

   private static Map<Class2137, Class2828> method38691() {
      Object var2 = (Map) Reflector.field43169.method20234();
      if (var2 == null) {
         Config.method26811("Field not found: TileEntitySkullRenderer.MODELS");
         var2 = new HashMap();
      }

      if (field45856 == null) {
         field45856 = new HashMap<Class2137, Class2828>((Map<? extends Class2137, ? extends Class2828>)var2);
      }

      return (Map<Class2137, Class2828>)var2;
   }

   private static ResourceLocation[] method38692() {
      String var2 = "optifine/cem/";
      String var3 = ".jem";
      ArrayList<ResourceLocation> var4 = new ArrayList();
      String[] var5 = Class9250.method34797();

      for (int var6 = 0; var6 < var5.length; var6++) {
         String var7 = var5[var6];
         String var8 = var2 + var7 + var3;
         ResourceLocation var9 = new ResourceLocation(var8);
         if (Config.method26866(var9)) {
            var4.add(var9);
         }
      }

      return var4.toArray(new ResourceLocation[var4.size()]);
   }

   private static Class9492 method38693(ResourceLocation var0) {
      try {
         JsonObject var3 = Class8331.method29218(var0);
         return method38694(var3, var0.getPath());
      } catch (IOException var4) {
         Config.method26813("" + var4.getClass().getName() + ": " + var4.getMessage());
         return null;
      } catch (JsonParseException var5) {
         Config.method26813("" + var5.getClass().getName() + ": " + var5.getMessage());
         return null;
      } catch (Exception var6) {
         var6.printStackTrace();
         return null;
      }
   }

   private static Class9492 method38694(JsonObject var0, String var1) {
      Class9135 var4 = Class8331.method29210(var0, var1);
      String var5 = var4.method34107();
      Class4057 var6 = Class9250.method34796(var5);
      method38698(var6, "Entity not found: " + var5);
      Class4862 var7 = var6.method12826();
      method38698(var7, "Entity type not found: " + var5);
      Class9492 var8 = method38695(var6, var4);
      if (var8 != null) {
         var8.method36666(var7);
         return var8;
      } else {
         return null;
      }
   }

   private static Class9492 method38695(Class4057 var0, Class9135 var1) {
      ResourceLocation var4 = var1.method34109();
      Class9734[] var5 = var1.method34110();
      float var6 = var1.method34111();
      if (var6 < 0.0F) {
         var6 = var0.method12829();
      }

      Class2828 var7 = var0.method12822();
      if (var7 != null) {
         Class6265 var8 = new Class6265(var0, var7, var5);
         if (method38696(var0, var7, var5, var8)) {
            Class9492 var9 = var0.method12825(var7, var6);
            if (var9 != null) {
               if (var4 != null) {
                  var9.method36668(var4);
               }

               return var9;
            } else {
               throw new JsonParseException("Entity renderer is null, model: " + var0.method12827() + ", adapter: " + var0.getClass().getName());
            }
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   private static boolean method38696(Class4057 var0, Class2828 var1, Class9734[] var2, Class6265 var3) {
      for (int var6 = 0; var6 < var2.length; var6++) {
         Class9734 var7 = var2[var6];
         if (!method38697(var0, var1, var7, var3)) {
            return false;
         }
      }

      return true;
   }

   private static boolean method38697(Class4057 var0, Class2828 var1, Class9734 var2, Class6265 var3) {
      String var6 = var2.method38143();
      ModelRenderer var7 = var0.method12823(var1, var6);
      if (var7 == null) {
         Config.method26811("Model part not found: " + var6 + ", model: " + var1);
         return false;
      } else {
         if (!var2.method38144()) {
            if (var7.field31040 != null) {
               var7.field31040.clear();
            }

            if (var7.field31042 != null) {
               var7.field31042.clear();
            }

            if (var7.field31041 != null) {
               ModelRenderer[] var8 = var0.method12830(var1);
               Set var9 = Collections.newSetFromMap(new IdentityHashMap());
               var9.addAll(Arrays.asList(var8));
               ObjectList var10 = var7.field31041;
               Iterator var11 = var10.iterator();

               while (var11.hasNext()) {
                  ModelRenderer var12 = (ModelRenderer)var11.next();
                  if (!var9.contains(var12)) {
                     var11.remove();
                  }
               }
            }
         }

         var7.method22670(var2.method38142());
         Class8486 var13 = var2.method38145();
         if (var13 != null) {
            var3.method19234(var2.method38142());
            var3.method19233(var7);
            if (!var13.method30010(var3)) {
               return false;
            }

            var2.method38142().method22695(var13);
         }

         return true;
      }
   }

   private static void method38698(Object var0, String var1) {
      if (var0 == null) {
         throw new JsonParseException(var1);
      }
   }

   public static boolean isActive() {
      return field45853;
   }
}
