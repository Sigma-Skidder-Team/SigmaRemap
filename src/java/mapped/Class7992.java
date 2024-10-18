package mapped;

import com.mojang.blaze3d.platform.GlStateManager;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.client.util.Util;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.optifine.Config;
import net.optifine.shaders.Shaders;
import net.optifine.shaders.ShadersRender;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Class7992 {
   private static Class8090[][] field34350 = (Class8090[][])null;
   private static Class8090[][] field34351 = (Class8090[][])null;
   private static Map field34352 = null;
   private static Class8451 field34353 = new Class8451();
   private static boolean field34354 = true;
   private static boolean field34355 = false;
   public static final int field34356 = 16384;
   public static final int field34357 = 63;
   public static final int field34358 = 64;
   public static final String field34359 = "texture.potion_overlay";
   public static final String field34360 = "texture.potion_bottle_splash";
   public static final String field34361 = "texture.potion_bottle_drinkable";
   public static final String field34362 = "item/potion_overlay";
   public static final String field34363 = "item/potion_bottle_splash";
   public static final String field34364 = "item/potion_bottle_drinkable";
   private static final int[][] field34365 = new int[0][];
   private static final Map<String, Integer> field34366 = method27276();
   private static final String field34367 = "normal";
   private static final String field34368 = "splash";
   private static final String field34369 = "linger";

   public static void method27245() {
      field34350 = (Class8090[][])null;
      field34351 = (Class8090[][])null;
      field34354 = true;
      if (Config.method26953()) {
         method27246("optifine/cit.properties");
         IResourcePack[] var2 = Config.method26869();

         for (int var3 = var2.length - 1; var3 >= 0; var3--) {
            IResourcePack var4 = var2[var3];
            method27247(var4);
         }

         method27247(Config.method26871());
         if (field34350.length <= 0) {
            field34350 = (Class8090[][])null;
         }

         if (field34351.length <= 0) {
            field34351 = (Class8090[][])null;
         }
      }
   }

   private static void method27246(String var0) {
      try {
         ResourceLocation var3 = new ResourceLocation(var0);
         InputStream var4 = Config.method26863(var3);
         if (var4 == null) {
            return;
         }

         Config.method26810("CustomItems: Loading " + var0);
         Class20 var5 = new Class20();
         var5.load(var4);
         var4.close();
         field34354 = Config.method26901(var5.getProperty("useGlint"), true);
      } catch (FileNotFoundException var6) {
         return;
      } catch (IOException var7) {
         var7.printStackTrace();
      }
   }

   private static void method27247(IResourcePack var0) {
      String[] var3 = Class9772.method38438(var0, "optifine/cit/", ".properties", (String[])null);
      Map var4 = method27255(var0);
      if (var4.size() > 0) {
         Set<String> var5 = var4.keySet();
         String[] var6 = var5.toArray(new String[var5.size()]);
         var3 = (String[]) Config.method26950(var3, var6);
      }

      Arrays.sort(var3);
      List var15 = method27262(field34350);
      List var16 = method27262(field34351);

      for (int var7 = 0; var7 < var3.length; var7++) {
         String var8 = var3[var7];
         Config.method26810("CustomItems: " + var8);

         try {
            Class8090 var9 = null;
            if (var4.containsKey(var8)) {
               var9 = (Class8090)var4.get(var8);
            }

            if (var9 == null) {
               ResourceLocation var10 = new ResourceLocation(var8);
               InputStream var11 = var0.getResourceStream(ResourcePackType.CLIENT_RESOURCES, var10);
               if (var11 == null) {
                  Config.method26811("CustomItems file not found: " + var8);
                  continue;
               }

               Class20 var12 = new Class20();
               var12.load(var11);
               var11.close();
               var9 = new Class8090(var12, var8);
            }

            if (var9.method28014(var8)) {
               method27264(var9, var15);
               method27265(var9, var16);
            }
         } catch (FileNotFoundException var13) {
            Config.method26811("CustomItems file not found: " + var8);
         } catch (Exception var14) {
            var14.printStackTrace();
         }
      }

      field34350 = method27263(var15);
      field34351 = method27263(var16);
      Comparator var17 = method27248();

      for (int var18 = 0; var18 < field34350.length; var18++) {
         Class8090[] var20 = field34350[var18];
         if (var20 != null) {
            Arrays.sort(var20, var17);
         }
      }

      for (int var19 = 0; var19 < field34351.length; var19++) {
         Class8090[] var21 = field34351[var19];
         if (var21 != null) {
            Arrays.sort(var21, var17);
         }
      }
   }

   private static Comparator method27248() {
      return new Class3585();
   }

   public static void method27249(AtlasTexture var0) {
      for (Class8090 var4 : method27253()) {
         var4.method28016(var0);
      }
   }

   public static void method27250(AtlasTexture var0) {
      for (Class8090 var4 : method27253()) {
         var4.method28017(var0);
      }
   }

   public static void method27251(ModelBakery var0) {
      for (Class8090 var4 : method27253()) {
         var4.method28033(var0);
      }
   }

   public static void method27252() {
      for (Class8090 var3 : method27253()) {
         if (var3.field34770 == 1) {
            AtlasTexture var4 = Config.getTextureMap();
            var3.method28020(var4, field34353);
            var3.method28034();
         }
      }
   }

   private static List<Class8090> method27253() {
      ArrayList var2 = new ArrayList();
      method27254(field34350, var2);
      method27254(field34351, var2);
      return var2;
   }

   private static void method27254(Class8090[][] var0, List<Class8090> var1) {
      if (var0 != null) {
         for (int var4 = 0; var4 < var0.length; var4++) {
            Class8090[] var5 = var0[var4];
            if (var5 != null) {
               for (int var6 = 0; var6 < var5.length; var6++) {
                  Class8090 var7 = var5[var6];
                  if (var7 != null) {
                     var1.add(var7);
                  }
               }
            }
         }
      }
   }

   private static Map<String, Class8090> method27255(IResourcePack var0) {
      HashMap var3 = new HashMap();
      var3.putAll(method27256(var0, "normal", Registry.ITEM.getKey(Items.field37971)));
      var3.putAll(method27256(var0, "splash", Registry.ITEM.getKey(Items.field38115)));
      var3.putAll(method27256(var0, "linger", Registry.ITEM.getKey(Items.field38118)));
      return var3;
   }

   private static Map<String, Class8090> method27256(IResourcePack var0, String var1, ResourceLocation var2) {
      HashMap var5 = new HashMap();
      String var6 = var1 + "/";
      String[] var7 = new String[]{"optifine/cit/potion/" + var6, "optifine/cit/Potion/" + var6};
      String[] var8 = new String[]{".png"};
      String[] var9 = Class9772.method38439(var0, var7, var8);

      for (int var10 = 0; var10 < var9.length; var10++) {
         String var11 = var9[var10];
         String var12 = Class9402.method35771(var11, var7, var8);
         Properties var13 = method27257(var12, var1, var2, var11);
         if (var13 != null) {
            String var14 = Class9402.method35769(var11, var8) + ".properties";
            Class8090 var15 = new Class8090(var13, var14);
            var5.put(var14, var15);
         }
      }

      return var5;
   }

   private static Properties method27257(String var0, String var1, ResourceLocation var2, String var3) {
      if (Class9402.method35761(var0, new String[]{"_n", "_s"})) {
         return null;
      } else if (var0.equals("empty") && var1.equals("normal")) {
         var2 = Registry.ITEM.getKey(Items.field37972);
         Class20 var11 = new Class20();
         var11.put("type", "item");
         var11.put("items", var2.toString());
         return var11;
      } else {
         int[] var6 = (int[])method27258().get(var0);
         if (var6 == null) {
            Config.method26811("Potion not found for image: " + var3);
            return null;
         } else {
            StringBuffer var7 = new StringBuffer();

            for (int var8 = 0; var8 < var6.length; var8++) {
               int var9 = var6[var8];
               if (var1.equals("splash")) {
                  var9 |= 16384;
               }

               if (var8 > 0) {
                  var7.append(" ");
               }

               var7.append(var9);
            }

            int var12 = 16447;
            if (var0.equals("water") || var0.equals("mundane")) {
               var12 |= 64;
            }

            Class20 var13 = new Class20();
            var13.put("type", "item");
            var13.put("items", var2.toString());
            var13.put("damage", var7.toString());
            var13.put("damageMask", "" + var12);
            if (!var1.equals("splash")) {
               var13.put("texture.potion_bottle_drinkable", var0);
            } else {
               var13.put("texture.potion_bottle_splash", var0);
            }

            return var13;
         }
      }
   }

   private static Map method27258() {
      if (field34352 == null) {
         field34352 = new LinkedHashMap();
         field34352.put("water", method27260(0, 0));
         field34352.put("awkward", method27260(0, 1));
         field34352.put("thick", method27260(0, 2));
         field34352.put("potent", method27260(0, 3));
         field34352.put("regeneration", method27259(1));
         field34352.put("movespeed", method27259(2));
         field34352.put("fireresistance", method27259(3));
         field34352.put("poison", method27259(4));
         field34352.put("heal", method27259(5));
         field34352.put("nightvision", method27259(6));
         field34352.put("clear", method27260(7, 0));
         field34352.put("bungling", method27260(7, 1));
         field34352.put("charming", method27260(7, 2));
         field34352.put("rank", method27260(7, 3));
         field34352.put("weakness", method27259(8));
         field34352.put("damageboost", method27259(9));
         field34352.put("moveslowdown", method27259(10));
         field34352.put("leaping", method27259(11));
         field34352.put("harm", method27259(12));
         field34352.put("waterbreathing", method27259(13));
         field34352.put("invisibility", method27259(14));
         field34352.put("thin", method27260(15, 0));
         field34352.put("debonair", method27260(15, 1));
         field34352.put("sparkling", method27260(15, 2));
         field34352.put("stinky", method27260(15, 3));
         field34352.put("mundane", method27260(0, 4));
         field34352.put("speed", field34352.get("movespeed"));
         field34352.put("fire_resistance", field34352.get("fireresistance"));
         field34352.put("instant_health", field34352.get("heal"));
         field34352.put("night_vision", field34352.get("nightvision"));
         field34352.put("strength", field34352.get("damageboost"));
         field34352.put("slowness", field34352.get("moveslowdown"));
         field34352.put("instant_damage", field34352.get("harm"));
         field34352.put("water_breathing", field34352.get("waterbreathing"));
      }

      return field34352;
   }

   private static int[] method27259(int var0) {
      return new int[]{var0, var0 + 16, var0 + 32, var0 + 48};
   }

   private static int[] method27260(int var0, int var1) {
      return new int[]{var0 + var1 * 16};
   }

   private static int method27261(String var0) {
      String var3 = "effect." + var0;

      for (ResourceLocation var5 : Registry.EFFECTS.method9190()) {
         if (Registry.EFFECTS.method9193(var5)) {
            Effect var6 = Registry.EFFECTS.getOrDefault(var5);
            String var7 = var6.getName();
            if (var3.equals(var7)) {
               return Effect.getId(var6);
            }
         }
      }

      return -1;
   }

   private static List<List<Class8090>> method27262(Class8090[][] var0) {
      ArrayList var3 = new ArrayList();
      if (var0 != null) {
         for (int var4 = 0; var4 < var0.length; var4++) {
            Class8090[] var5 = var0[var4];
            ArrayList var6 = null;
            if (var5 != null) {
               var6 = new ArrayList<Class8090>(Arrays.asList(var5));
            }

            var3.add(var6);
         }
      }

      return var3;
   }

   private static Class8090[][] method27263(List var0) {
      Class8090[][] var3 = new Class8090[var0.size()][];

      for (int var4 = 0; var4 < var0.size(); var4++) {
         List<Class8090> var5 = (List)var0.get(var4);
         if (var5 != null) {
            Class8090[] var6 = var5.toArray(new Class8090[var5.size()]);
            Arrays.sort(var6, new Class3584());
            var3[var4] = var6;
         }
      }

      return var3;
   }

   private static void method27264(Class8090 var0, List<List<Class8090>> var1) {
      if (var0.field34771 != null) {
         for (int var4 = 0; var4 < var0.field34771.length; var4++) {
            int var5 = var0.field34771[var4];
            if (var5 > 0) {
               method27267(var0, var1, var5);
            } else {
               Config.method26811("Invalid item ID: " + var5);
            }
         }
      }
   }

   private static void method27265(Class8090 var0, List<List<Class8090>> var1) {
      if (var0.field34770 == 2 && var0.field34780 != null) {
         int var4 = method27266() + 1;

         for (int var5 = 0; var5 < var4; var5++) {
            if (Config.method26944(var5, var0.field34780)) {
               method27267(var0, var1, var5);
            }
         }
      }
   }

   private static int method27266() {
      int var2 = 0;

      while (true) {
         Enchantment var3 = Registry.ENCHANTMENT.getByValue(var2);
         if (var3 == null) {
            return var2;
         }

         var2++;
      }
   }

   private static void method27267(Class8090 var0, List<List<Class8090>> var1, int var2) {
      while (var2 >= var1.size()) {
         var1.add(null);
      }

      List<Class8090> var5 = var1.get(var2);
      if (var5 == null) {
         var5 = new ArrayList<>();
         var1.set(var2, var5);
      }

      var5.add(var0);
   }

   public static IBakedModel method27268(ItemStack var0, IBakedModel var1, ResourceLocation var2, boolean var3) {
      if (!var3 && var1.method22621()) {
         return var1;
      } else if (field34350 != null) {
         Class8090 var6 = method27272(var0, 1);
         if (var6 != null) {
            IBakedModel var7 = var6.method28032(var2, var3);
            return var7 == null ? var1 : var7;
         } else {
            return var1;
         }
      } else {
         return var1;
      }
   }

   public static ResourceLocation method27269(ItemStack var0, EquipmentSlotType var1, String var2, ResourceLocation var3) {
      if (field34350 != null) {
         ResourceLocation var6 = method27270(var0, var1, var2);
         return var6 != null ? var6 : var3;
      } else {
         return var3;
      }
   }

   private static ResourceLocation method27270(ItemStack var0, EquipmentSlotType var1, String var2) {
      Class8090 var5 = method27272(var0, 3);
      if (var5 != null) {
         if (var5.field34791 != null) {
            Item var6 = var0.getItem();
            if (var6 instanceof ArmorItem) {
               ArmorItem var7 = (ArmorItem)var6;
               String var8 = var7.getArmorMaterial().method8790();
               int var9 = var1 != EquipmentSlotType.LEGS ? 1 : 2;
               StringBuffer var10 = new StringBuffer();
               var10.append("texture.");
               var10.append(var8);
               var10.append("_layer_");
               var10.append(var9);
               if (var2 != null) {
                  var10.append("_");
                  var10.append(var2);
               }

               String var11 = var10.toString();
               ResourceLocation var12 = (ResourceLocation)var5.field34791.get(var11);
               return var12 != null ? var12 : var5.field34790;
            } else {
               return null;
            }
         } else {
            return var5.field34790;
         }
      } else {
         return null;
      }
   }

   public static ResourceLocation method27271(ItemStack var0, ResourceLocation var1) {
      if (field34350 != null) {
         Class8090 var4 = method27272(var0, 4);
         if (var4 != null) {
            return var4.field34790 != null ? var4.field34790 : var1;
         } else {
            return var1;
         }
      } else {
         return var1;
      }
   }

   private static Class8090 method27272(ItemStack var0, int var1) {
      if (field34350 != null) {
         if (var0 == null) {
            return null;
         } else {
            Item var4 = var0.getItem();
            int var5 = Item.method11701(var4);
            if (var5 >= 0 && var5 < field34350.length) {
               Class8090[] var6 = field34350[var5];
               if (var6 != null) {
                  for (int var7 = 0; var7 < var6.length; var7++) {
                     Class8090 var8 = var6[var7];
                     if (var8.field34770 == var1 && method27273(var8, var0, (int[][])null)) {
                        return var8;
                     }
                  }
               }
            }

            return null;
         }
      } else {
         return null;
      }
   }

   private static boolean method27273(Class8090 var0, ItemStack var1, int[][] var2) {
      Item var5 = var1.getItem();
      if (var0.field34776 != null) {
         int var6 = method27274(var1);
         if (var6 < 0) {
            return false;
         }

         if (var0.field34778 != 0) {
            var6 &= var0.field34778;
         }

         if (var0.field34777) {
            int var7 = var5.getMaxDamage();
            var6 = (int)((double)(var6 * 100) / (double)var7);
         }

         if (!var0.field34776.method36838(var6)) {
            return false;
         }
      }

      if (var0.field34779 != null && !var0.field34779.method36838(var1.getCount())) {
         return false;
      } else {
         int[][] var10 = var2;
         if (var0.field34780 != null) {
            if (var2 == null) {
               var10 = method27278(var1);
            }

            boolean var11 = false;

            for (int var8 = 0; var8 < var10.length; var8++) {
               int var9 = var10[var8][0];
               if (Config.method26944(var9, var0.field34780)) {
                  var11 = true;
                  break;
               }
            }

            if (!var11) {
               return false;
            }
         }

         if (var0.field34781 != null) {
            if (var10 == null) {
               var10 = method27278(var1);
            }

            boolean var12 = false;

            for (int var14 = 0; var14 < var10.length; var14++) {
               int var16 = var10[var14][1];
               if (var0.field34781.method36838(var16)) {
                  var12 = true;
                  break;
               }
            }

            if (!var12) {
               return false;
            }
         }

         if (var0.field34782 != null) {
            CompoundNBT var13 = var1.method32142();

            for (int var15 = 0; var15 < var0.field34782.length; var15++) {
               Class7305 var17 = var0.field34782[var15];
               if (!var17.method23079(var13)) {
                  return false;
               }
            }
         }

         if (var0.field34783 != 0) {
            if (var0.field34783 == 1 && field34355) {
               return false;
            }

            if (var0.field34783 == 2 && !field34355) {
               return false;
            }
         }

         return true;
      }
   }

   private static int method27274(ItemStack var0) {
      Item var3 = var0.getItem();
      return !(var3 instanceof Class3323) ? var0.method32117() : method27275(var0);
   }

   private static int method27275(ItemStack var0) {
      CompoundNBT var3 = var0.method32142();
      if (var3 != null) {
         String var4 = var3.getString("Potion");
         if (var4 != null && !var4.equals("")) {
            Integer var5 = field34366.get(var4);
            if (var5 != null) {
               int var6 = var5;
               if (var0.getItem() == Items.field38115) {
                  var6 |= 16384;
               }

               return var6;
            } else {
               return -1;
            }
         } else {
            return 0;
         }
      } else {
         return 0;
      }
   }

   private static Map<String, Integer> method27276() {
      HashMap var2 = new HashMap();
      method27277("water", 0, false, var2);
      method27277("awkward", 16, false, var2);
      method27277("thick", 32, false, var2);
      method27277("mundane", 64, false, var2);
      method27277("regeneration", 1, true, var2);
      method27277("swiftness", 2, true, var2);
      method27277("fire_resistance", 3, true, var2);
      method27277("poison", 4, true, var2);
      method27277("healing", 5, true, var2);
      method27277("night_vision", 6, true, var2);
      method27277("weakness", 8, true, var2);
      method27277("strength", 9, true, var2);
      method27277("slowness", 10, true, var2);
      method27277("leaping", 11, true, var2);
      method27277("harming", 12, true, var2);
      method27277("water_breathing", 13, true, var2);
      method27277("invisibility", 14, true, var2);
      return var2;
   }

   private static void method27277(String var0, int var1, boolean var2, Map<String, Integer> var3) {
      if (var2) {
         var1 |= 8192;
      }

      var3.put("minecraft:" + var0, var1);
      if (var2) {
         int var6 = var1 | 32;
         var3.put("minecraft:strong_" + var0, var6);
         int var7 = var1 | 64;
         var3.put("minecraft:long_" + var0, var7);
      }
   }

   private static int[][] method27278(ItemStack var0) {
      Item var3 = var0.getItem();
      ListNBT var4;
      if (var3 != Items.field38070) {
         var4 = var0.method32147();
      } else {
         Class3290 var5 = (Class3290) Items.field38070;
         var4 = Class3290.method11830(var0);
      }

      ListNBT var13 = var4;
      if (var4 != null && var4.size() > 0) {
         int[][] var6 = new int[var4.size()][2];

         for (int var7 = 0; var7 < var13.size(); var7++) {
            CompoundNBT var8 = var13.method153(var7);
            String var9 = var8.getString("id");
            int var10 = var8.getInt("lvl");
            Enchantment var11 = Class7849.method26306(var9);
            if (var11 != null) {
               int var12 = Registry.ENCHANTMENT.getId(var11);
               var6[var7][0] = var12;
               var6[var7][1] = var10;
            }
         }

         return var6;
      } else {
         return field34365;
      }
   }

   public static boolean method27279(ItemRenderer var0, ItemStack var1, IBakedModel var2) {
      if (field34351 == null) {
         return false;
      } else if (var1 == null) {
         return false;
      } else {
         int[][] var5 = method27278(var1);
         if (var5.length <= 0) {
            return false;
         } else {
            HashSet var6 = null;
            boolean var7 = false;
            TextureManager var8 = Config.method26861();

            for (int var9 = 0; var9 < var5.length; var9++) {
               int var10 = var5[var9][0];
               if (var10 >= 0 && var10 < field34351.length) {
                  Class8090[] var11 = field34351[var10];
                  if (var11 != null) {
                     for (int var12 = 0; var12 < var11.length; var12++) {
                        Class8090 var13 = var11[var12];
                        if (var6 == null) {
                           var6 = new HashSet();
                        }

                        if (var6.add(var10) && method27273(var13, var1, var5) && var13.field34790 != null) {
                           var8.bindTexture(var13.field34790);
                           float var14 = var13.method28030(var8);
                           if (!var7) {
                              var7 = true;
                              GlStateManager.depthMask(false);
                              GlStateManager.depthFunc(514);
                              GlStateManager.disableLighting();
                              GlStateManager.matrixMode(5890);
                           }

                           Class6988.method21638(var13.field34784, 1.0F);
                           GlStateManager.pushMatrix();
                           GlStateManager.scalef(var14, var14, var14);
                           float var15 = var13.field34785 * (float)(Util.milliTime() % 3000L) / 3000.0F / 8.0F;
                           GlStateManager.translatef(var15, 0.0F, 0.0F);
                           GlStateManager.rotatef(var13.field34786, 0.0F, 0.0F, 1.0F);
                           GlStateManager.popMatrix();
                        }
                     }
                  }
               }
            }

            if (var7) {
               GlStateManager.enableAlphaTest();
               GlStateManager.enableBlend();
               GlStateManager.blendFunc(770, 771);
               GlStateManager.color4f(1.0F, 1.0F, 1.0F, 1.0F);
               GlStateManager.matrixMode(5888);
               GlStateManager.enableLighting();
               GlStateManager.depthFunc(515);
               GlStateManager.depthMask(true);
               var8.bindTexture(AtlasTexture.LOCATION_BLOCKS_TEXTURE);
            }

            return var7;
         }
      }
   }

   public static boolean method27280(
           LivingEntity var0, ItemStack var1, Class2827 var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9
   ) {
      if (field34351 == null) {
         return false;
      } else if (Config.isShaders() && Shaders.isShadowPass) {
         return false;
      } else if (var1 == null) {
         return false;
      } else {
         int[][] var12 = method27278(var1);
         if (var12.length <= 0) {
            return false;
         } else {
            HashSet var13 = null;
            boolean var14 = false;
            TextureManager var15 = Config.method26861();

            for (int var16 = 0; var16 < var12.length; var16++) {
               int var17 = var12[var16][0];
               if (var17 >= 0 && var17 < field34351.length) {
                  Class8090[] var18 = field34351[var17];
                  if (var18 != null) {
                     for (int var19 = 0; var19 < var18.length; var19++) {
                        Class8090 var20 = var18[var19];
                        if (var13 == null) {
                           var13 = new HashSet();
                        }

                        if (var13.add(var17) && method27273(var20, var1, var12) && var20.field34790 != null) {
                           var15.bindTexture(var20.field34790);
                           float var21 = var20.method28030(var15);
                           if (!var14) {
                              var14 = true;
                              if (Config.isShaders()) {
                                 ShadersRender.method17172();
                              }

                              GlStateManager.enableBlend();
                              GlStateManager.depthFunc(514);
                              GlStateManager.depthMask(false);
                           }

                           Class6988.method21638(var20.field34784, 1.0F);
                           GlStateManager.disableLighting();
                           GlStateManager.matrixMode(5890);
                           GlStateManager.loadIdentity();
                           GlStateManager.rotatef(var20.field34786, 0.0F, 0.0F, 1.0F);
                           float var22 = var21 / 8.0F;
                           GlStateManager.scalef(var22, var22 / 2.0F, var22);
                           float var23 = var20.field34785 * (float)(Util.milliTime() % 3000L) / 3000.0F / 8.0F;
                           GlStateManager.translatef(0.0F, var23, 0.0F);
                           GlStateManager.matrixMode(5888);
                        }
                     }
                  }
               }
            }

            if (var14) {
               GlStateManager.enableAlphaTest();
               GlStateManager.enableBlend();
               GlStateManager.blendFunc(770, 771);
               GlStateManager.color4f(1.0F, 1.0F, 1.0F, 1.0F);
               GlStateManager.matrixMode(5890);
               GlStateManager.loadIdentity();
               GlStateManager.matrixMode(5888);
               GlStateManager.enableLighting();
               GlStateManager.depthMask(true);
               GlStateManager.depthFunc(515);
               GlStateManager.disableBlend();
               if (Config.isShaders()) {
                  ShadersRender.method17173();
               }
            }

            return var14;
         }
      }
   }

   public static boolean method27281() {
      return field34354;
   }

   public static void method27282(boolean var0) {
      field34355 = var0;
   }
}
