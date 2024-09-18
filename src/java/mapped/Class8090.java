package mapped;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.TreeSet;

import com.mojang.blaze3d.platform.GlStateManager;
import net.minecraft.client.Minecraft;
import net.minecraft.item.Items;
import net.minecraft.util.Direction;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import org.lwjgl.opengl.GL11;

public class Class8090 {
   public String field34768 = null;
   public String field34769 = null;
   public int field34770 = 1;
   public int[] field34771 = null;
   public String field34772 = null;
   public Map<String, String> field34773 = null;
   public String field34774 = null;
   public Map<String, String> field34775 = null;
   public Class9532 field34776 = null;
   public boolean field34777 = false;
   public int field34778 = 0;
   public Class9532 field34779 = null;
   public int[] field34780 = null;
   public Class9532 field34781 = null;
   public Class7305[] field34782 = null;
   public int field34783 = 0;
   public int field34784 = 1;
   public float field34785 = 0.0F;
   public float field34786 = 0.0F;
   public int field34787 = 0;
   public float field34788 = 1.0F;
   public int field34789 = 0;
   public ResourceLocation field34790 = null;
   public Map field34791 = null;
   public TextureAtlasSprite field34792 = null;
   public Map<String, TextureAtlasSprite> field34793 = null;
   public IBakedModel field34794 = null;
   public Map<String, IBakedModel> field34795 = null;
   public IBakedModel field34796 = null;
   public Map<String, IBakedModel> field34797 = null;
   private int field34798 = 0;
   private int field34799 = 0;
   public static final int field34800 = 0;
   public static final int field34801 = 1;
   public static final int field34802 = 2;
   public static final int field34803 = 3;
   public static final int field34804 = 4;
   public static final int field34805 = 0;
   public static final int field34806 = 1;
   public static final int field34807 = 2;
   public static final String field34808 = "inventory";

   public Class8090(Properties var1, String var2) {
      this.field34768 = method27995(var2);
      this.field34769 = method27996(var2);
      this.field34770 = this.method27997(var1.getProperty("type"));
      this.field34771 = this.method27998(var1.getProperty("items"), var1.getProperty("matchItems"));
      this.field34775 = method28004(var1, this.field34769);
      this.field34774 = method28003(var1.getProperty("model"), var2, this.field34769, this.field34770, this.field34775);
      this.field34773 = method28001(var1, this.field34769);
      boolean var5 = this.field34775 == null && this.field34774 == null;
      this.field34772 = method28000(
         var1.getProperty("texture"), var1.getProperty("tile"), var1.getProperty("source"), var2, this.field34769, this.field34770, this.field34773, var5
      );
      String var6 = var1.getProperty("damage");
      if (var6 != null) {
         this.field34777 = var6.contains("%");
         var6 = var6.replace("%", "");
         this.field34776 = this.method28009(var6);
         this.field34778 = this.method28006(var1.getProperty("damageMask"), 0);
      }

      this.field34779 = this.method28009(var1.getProperty("stackSize"));
      this.field34780 = this.method28008(method27994(var1, "enchantmentIDs", "enchantments"), new Class8231());
      this.field34781 = this.method28009(var1.getProperty("enchantmentLevels"));
      this.field34782 = this.method28011(var1);
      this.field34783 = this.method28013(var1.getProperty("hand"));
      this.field34784 = Class6988.method21637(var1.getProperty("blend"));
      this.field34785 = this.method28007(var1.getProperty("speed"), 0.0F);
      this.field34786 = this.method28007(var1.getProperty("rotation"), 0.0F);
      this.field34787 = this.method28006(var1.getProperty("layer"), 0);
      this.field34789 = this.method28006(var1.getProperty("weight"), 0);
      this.field34788 = this.method28007(var1.getProperty("duration"), 1.0F);
   }

   private static String method27994(Properties var0, String... var1) {
      for (int var4 = 0; var4 < var1.length; var4++) {
         String var5 = var1[var4];
         String var6 = var0.getProperty(var5);
         if (var6 != null) {
            return var6;
         }
      }

      return null;
   }

   private static String method27995(String var0) {
      String var3 = var0;
      int var4 = var0.lastIndexOf(47);
      if (var4 >= 0) {
         var3 = var0.substring(var4 + 1);
      }

      int var5 = var3.lastIndexOf(46);
      if (var5 >= 0) {
         var3 = var3.substring(0, var5);
      }

      return var3;
   }

   private static String method27996(String var0) {
      int var3 = var0.lastIndexOf(47);
      return var3 >= 0 ? var0.substring(0, var3) : "";
   }

   private int method27997(String var1) {
      if (var1 != null) {
         if (!var1.equals("item")) {
            if (!var1.equals("enchantment")) {
               if (!var1.equals("armor")) {
                  if (!var1.equals("elytra")) {
                     Class7944.method26811("Unknown method: " + var1);
                     return 0;
                  } else {
                     return 4;
                  }
               } else {
                  return 3;
               }
            } else {
               return 2;
            }
         } else {
            return 1;
         }
      } else {
         return 1;
      }
   }

   private int[] method27998(String var1, String var2) {
      if (var1 == null) {
         var1 = var2;
      }

      if (var1 == null) {
         return null;
      } else {
         var1 = var1.trim();
         TreeSet<Integer> var5 = new TreeSet();
         String[] var6 = Class7944.method26903(var1, " ");

         for (int var7 = 0; var7 < var6.length; var7++) {
            String var8 = var6[var7];
            Item var9 = this.method27999(var8);
            if (var9 != null) {
               int var10 = Item.method11701(var9);
               if (var10 >= 0) {
                  var5.add(new Integer(var10));
               } else {
                  Class7944.method26811("Item ID not found: " + var8);
               }
            } else {
               Class7944.method26811("Item not found: " + var8);
            }
         }

         Integer[] var12 = var5.toArray(new Integer[var5.size()]);
         int[] var13 = new int[var12.length];

         for (int var14 = 0; var14 < var13.length; var14++) {
            var13[var14] = var12[var14];
         }

         return var13;
      }
   }

   private Item method27999(String var1) {
      ResourceLocation var4 = new ResourceLocation(var1);
      return Registry.ITEM.method9193(var4) ? Registry.ITEM.getOrDefault(var4) : null;
   }

   private static String method28000(String var0, String var1, String var2, String var3, String var4, int var5, Map<String, String> var6, boolean var7) {
      if (var0 == null) {
         var0 = var1;
      }

      if (var0 == null) {
         var0 = var2;
      }

      if (var0 == null) {
         if (var5 != 3) {
            if (var6 != null) {
               String var13 = (String)var6.get("texture.bow_standby");
               if (var13 != null) {
                  return var13;
               }
            }

            if (var7) {
               String var14 = var3;
               int var11 = var3.lastIndexOf(47);
               if (var11 >= 0) {
                  var14 = var3.substring(var11 + 1);
               }

               int var12 = var14.lastIndexOf(46);
               if (var12 >= 0) {
                  var14 = var14.substring(0, var12);
               }

               return method28002(var14, var4);
            } else {
               return null;
            }
         } else {
            return null;
         }
      } else {
         String var10 = ".png";
         if (var0.endsWith(var10)) {
            var0 = var0.substring(0, var0.length() - var10.length());
         }

         return method28002(var0, var4);
      }
   }

   private static Map method28001(Properties var0, String var1) {
      String var4 = "texture.";
      Map<String, String> var5 = method28012(var0, var4);
      if (var5.size() <= 0) {
         return null;
      } else {
         Set<String> var6 = var5.keySet();
         LinkedHashMap var7 = new LinkedHashMap();

         for (String var9 : var6) {
            String var10 = (String)var5.get(var9);
            var10 = method28002(var10, var1);
            var7.put(var9, var10);
         }

         return var7;
      }
   }

   private static String method28002(String var0, String var1) {
      var0 = Class8684.method31274(var0, var1);
      if (!var0.startsWith(var1) && !var0.startsWith("textures/") && !var0.startsWith("optifine/")) {
         var0 = var1 + "/" + var0;
      }

      if (var0.endsWith(".png")) {
         var0 = var0.substring(0, var0.length() - 4);
      }

      if (var0.startsWith("/")) {
         var0 = var0.substring(1);
      }

      return var0;
   }

   private static String method28003(String var0, String var1, String var2, int var3, Map<String, String> var4) {
      if (var0 == null) {
         if (var3 != 3) {
            if (var4 != null) {
               String var8 = (String)var4.get("model.bow_standby");
               if (var8 != null) {
                  return var8;
               }
            }

            return var0;
         } else {
            return null;
         }
      } else {
         String var7 = ".json";
         if (var0.endsWith(var7)) {
            var0 = var0.substring(0, var0.length() - var7.length());
         }

         return method28005(var0, var2);
      }
   }

   private static Map method28004(Properties var0, String var1) {
      String var4 = "model.";
      Map<String, String> var5 = method28012(var0, var4);
      if (var5.size() <= 0) {
         return null;
      } else {
         Set<String> var6 = var5.keySet();
         LinkedHashMap var7 = new LinkedHashMap();

         for (String var9 : var6) {
            String var10 = (String)var5.get(var9);
            var10 = method28005(var10, var1);
            var7.put(var9, var10);
         }

         return var7;
      }
   }

   private static String method28005(String var0, String var1) {
      var0 = Class8684.method31274(var0, var1);
      boolean var4 = var0.startsWith("block/") || var0.startsWith("item/");
      if (!var0.startsWith(var1) && !var4 && !var0.startsWith("optifine/")) {
         var0 = var1 + "/" + var0;
      }

      String var5 = ".json";
      if (var0.endsWith(var5)) {
         var0 = var0.substring(0, var0.length() - var5.length());
      }

      if (var0.startsWith("/")) {
         var0 = var0.substring(1);
      }

      return var0;
   }

   private int method28006(String var1, int var2) {
      if (var1 != null) {
         var1 = var1.trim();
         int var5 = Class7944.method26899(var1, Integer.MIN_VALUE);
         if (var5 != Integer.MIN_VALUE) {
            return var5;
         } else {
            Class7944.method26811("Invalid integer: " + var1);
            return var2;
         }
      } else {
         return var2;
      }
   }

   private float method28007(String var1, float var2) {
      if (var1 != null) {
         var1 = var1.trim();
         float var5 = Class7944.method26900(var1, Float.MIN_VALUE);
         if (var5 != Float.MIN_VALUE) {
            return var5;
         } else {
            Class7944.method26811("Invalid float: " + var1);
            return var2;
         }
      } else {
         return var2;
      }
   }

   private int[] method28008(String var1, Class8232 var2) {
      if (var1 != null) {
         String[] var5 = Class7944.method26903(var1, " ");
         ArrayList<Integer>  var6 = new ArrayList();

         for (int var7 = 0; var7 < var5.length; var7++) {
            String var8 = var5[var7];
            int var9 = var2.method28653(var8, Integer.MIN_VALUE);
            if (var9 != Integer.MIN_VALUE) {
               var6.add(var9);
            } else {
               Class7944.method26811("Invalid value: " + var8);
            }
         }

         Integer[] var10 = var6.toArray(new Integer[var6.size()]);
         return Class7944.method26976(var10);
      } else {
         return null;
      }
   }

   private Class9532 method28009(String var1) {
      if (var1 == null) {
         return null;
      } else {
         String[] var4 = Class7944.method26903(var1, " ");
         Class9532 var5 = new Class9532();

         for (int var6 = 0; var6 < var4.length; var6++) {
            String var7 = var4[var6];
            Class7589 var8 = this.method28010(var7);
            if (var8 == null) {
               Class7944.method26811("Invalid range list: " + var1);
               return null;
            }

            var5.method36837(var8);
         }

         return var5;
      }
   }

   private Class7589 method28010(String var1) {
      if (var1 == null) {
         return null;
      } else {
         var1 = var1.trim();
         int var4 = var1.length() - var1.replace("-", "").length();
         if (var4 > 1) {
            Class7944.method26811("Invalid range: " + var1);
            return null;
         } else {
            String[] var5 = Class7944.method26903(var1, "- ");
            int[] var6 = new int[var5.length];

            for (int var7 = 0; var7 < var5.length; var7++) {
               String var8 = var5[var7];
               int var9 = Class7944.method26899(var8, -1);
               if (var9 < 0) {
                  Class7944.method26811("Invalid range: " + var1);
                  return null;
               }

               var6[var7] = var9;
            }

            if (var6.length != 1) {
               if (var6.length != 2) {
                  Class7944.method26811("Invalid range: " + var1);
                  return null;
               } else {
                  int var12 = Math.min(var6[0], var6[1]);
                  int var13 = Math.max(var6[0], var6[1]);
                  return new Class7589(var12, var13);
               }
            } else {
               int var11 = var6[0];
               if (!var1.startsWith("-")) {
                  return !var1.endsWith("-") ? new Class7589(var11, var11) : new Class7589(var11, 65535);
               } else {
                  return new Class7589(0, var11);
               }
            }
         }
      }
   }

   private Class7305[] method28011(Properties var1) {
      String var4 = "nbt.";
      Map<String, String>  var5 = method28012(var1, var4);
      if (var5.size() <= 0) {
         return null;
      } else {
         ArrayList<Class7305> var6 = new ArrayList();

         for (String var8 : var5.keySet()) {
            String var9 = (String)var5.get(var8);
            String var10 = var8.substring(var4.length());
            Class7305 var11 = new Class7305(var10, var9);
            var6.add(var11);
         }

         return var6.toArray(new Class7305[var6.size()]);
      }
   }

   private static Map<String, String>  method28012(Properties var0, String var1) {
      LinkedHashMap<String, String> var4 = new LinkedHashMap();

      for (String var6 : (Set<String>)(Set<?>)var0.keySet()) {
         String var7 = var0.getProperty(var6);
         if (var6.startsWith(var1)) {
            var4.put(var6, var7);
         }
      }

      return var4;
   }

   private int method28013(String var1) {
      if (var1 != null) {
         var1 = var1.toLowerCase();
         if (!var1.equals("any")) {
            if (!var1.equals("main")) {
               if (!var1.equals("off")) {
                  Class7944.method26811("Invalid hand: " + var1);
                  return 0;
               } else {
                  return 2;
               }
            } else {
               return 1;
            }
         } else {
            return 0;
         }
      } else {
         return 0;
      }
   }

   public boolean method28014(String var1) {
      if (this.field34768 == null || this.field34768.length() <= 0) {
         Class7944.method26811("No name found: " + var1);
         return false;
      } else if (this.field34769 == null) {
         Class7944.method26811("No base path found: " + var1);
         return false;
      } else if (this.field34770 != 0) {
         if (this.field34770 == 4 && this.field34771 == null) {
            this.field34771 = new int[]{Item.method11701(Items.field38120)};
         }

         if (this.field34770 == 1 || this.field34770 == 3 || this.field34770 == 4) {
            if (this.field34771 == null) {
               this.field34771 = this.method28015();
            }

            if (this.field34771 == null) {
               Class7944.method26811("No items defined: " + var1);
               return false;
            }
         }

         if (this.field34772 == null && this.field34773 == null && this.field34774 == null && this.field34775 == null) {
            Class7944.method26811("No texture or model specified: " + var1);
            return false;
         } else if (this.field34770 == 2 && this.field34780 == null) {
            Class7944.method26811("No enchantmentIDs specified: " + var1);
            return false;
         } else {
            return true;
         }
      } else {
         Class7944.method26811("No type defined: " + var1);
         return false;
      }
   }

   private int[] method28015() {
      Item var3 = this.method27999(this.field34768);
      if (var3 != null) {
         int var4 = Item.method11701(var3);
         return var4 >= 0 ? new int[]{var4} : null;
      } else {
         return null;
      }
   }

   public void method28016(AtlasTexture var1) {
      if (this.field34772 != null) {
         this.field34790 = this.method28018(this.field34772);
         if (this.field34770 == 1) {
            ResourceLocation var4 = this.method28019(this.field34790);
            this.field34792 = var1.method1119(var4);
         }
      }

      if (this.field34773 != null) {
         this.field34791 = new HashMap();
         this.field34793 = new HashMap();

         for (String var5 : this.field34773.keySet()) {
            String var6 = this.field34773.get(var5);
            ResourceLocation var7 = this.method28018(var6);
            this.field34791.put(var5, var7);
            if (this.field34770 == 1) {
               ResourceLocation var8 = this.method28019(var7);
               TextureAtlasSprite var9 = var1.method1119(var8);
               this.field34793.put(var5, var9);
            }
         }
      }
   }

   public void method28017(AtlasTexture var1) {
      if (this.field34792 != null) {
         this.field34792 = var1.getSprite(this.field34792.method7465());
      }

      if (this.field34793 != null) {
         for (String var5 : this.field34793.keySet()) {
            TextureAtlasSprite var6 = (TextureAtlasSprite)this.field34793.get(var5);
            if (var6 != null) {
               ResourceLocation var7 = var6.method7465();
               TextureAtlasSprite var8 = var1.getSprite(var7);
               if (var8 == null || var8 instanceof Class1714) {
                  Class7944.method26811("Missing CIT sprite: " + var7 + ", properties: " + this.field34769);
               }

               this.field34793.put(var5, var8);
            }
         }
      }
   }

   private ResourceLocation method28018(String var1) {
      if (var1 != null) {
         ResourceLocation var4 = new ResourceLocation(var1);
         String var5 = var4.getNamespace();
         String var6 = var4.getPath();
         if (!var6.contains("/")) {
            var6 = "textures/item/" + var6;
         }

         String var7 = var6 + ".png";
         ResourceLocation var8 = new ResourceLocation(var5, var7);
         boolean var9 = Class7944.method26866(var8);
         if (!var9) {
            Class7944.method26811("File not found: " + var7);
         }

         return var8;
      } else {
         return null;
      }
   }

   private ResourceLocation method28019(ResourceLocation var1) {
      String var4 = var1.getPath();
      var4 = Class9402.method35762(var4, "textures/");
      var4 = Class9402.method35763(var4, ".png");
      return new ResourceLocation(var1.getNamespace(), var4);
   }

   public void method28020(AtlasTexture var1, Class8451 var2) {
      if (this.field34772 != null || this.field34773 != null) {
         String[] var5 = this.method28025();
         boolean var6 = this.method28022();
         this.field34794 = method28023(var1, var2, var5, var6);
         if (this.field34770 == 1 && this.field34773 != null) {
            for (String var8 : this.field34773.keySet()) {
               String var9 = this.field34773.get(var8);
               String var10 = Class9402.method35762(var8, "texture.");
               if (this.method28021(var10)) {
                  String[] var11 = new String[]{var9};
                  IBakedModel var12 = method28023(var1, var2, var11, var6);
                  if (this.field34795 == null) {
                     this.field34795 = new HashMap<String, IBakedModel>();
                  }

                  String var13 = "item/" + var10;
                  this.field34795.put(var13, var12);
               }
            }
         }
      }
   }

   private boolean method28021(String var1) {
      return var1.startsWith("bow") || var1.startsWith("crossbow") || var1.startsWith("fishing_rod") || var1.startsWith("shield");
   }

   private boolean method28022() {
      return true;
   }

   private static IBakedModel method28023(AtlasTexture var0, Class8451 var1, String[] var2, boolean var3) {
      String[] var6 = new String[var2.length];

      for (int var7 = 0; var7 < var6.length; var7++) {
         String var8 = var2[var7];
         var6[var7] = Class9402.method35762(var8, "textures/");
      }

      Class7496 var9 = method28027(var6);
      Class7496 var10 = var1.method29717(Class8090::method28024, var9);
      return method28028(var0, var10, var3);
   }

   public static TextureAtlasSprite method28024(Class7826 var0) {
      AtlasTexture var3 = Minecraft.getInstance().getModelManager().getAtlasTexture(var0.method26196());
      return var3.getSprite(var0.method26197());
   }

   private String[] method28025() {
      if (this.field34770 == 1 && this.field34771.length == 1) {
         Item var3 = Item.method11702(this.field34771[0]);
         boolean var4 = var3 == Items.field37971 || var3 == Items.field38115 || var3 == Items.field38118;
         if (var4 && this.field34776 != null && this.field34776.method36839() > 0) {
            Class7589 var12 = this.field34776.method36840(0);
            int var13 = var12.method24846();
            boolean var14 = (var13 & 16384) != 0;
            String var15 = this.method28026(this.field34773, "texture.potion_overlay", "item/potion_overlay");
            Object var16 = null;
            if (!var14) {
               var16 = this.method28026(this.field34773, "texture.potion_bottle_drinkable", "item/potion_bottle_drinkable");
            } else {
               var16 = this.method28026(this.field34773, "texture.potion_bottle_splash", "item/potion_bottle_splash");
            }

            return new String[]{var15, (String)var16};
         }

         if (var3 instanceof ArmorItem) {
            ArmorItem var5 = (ArmorItem)var3;
            if (var5.getArmorMaterial() == Class2114.field13773) {
               String var6 = "leather";
               String var7 = "helmet";
               EquipmentSlotType var8 = var5.method11805();
               if (var8 == EquipmentSlotType.field13736) {
                  var7 = "helmet";
               }

               if (var8 == EquipmentSlotType.field13735) {
                  var7 = "chestplate";
               }

               if (var8 == EquipmentSlotType.field13734) {
                  var7 = "leggings";
               }

               if (var8 == EquipmentSlotType.field13733) {
                  var7 = "boots";
               }

               String var9 = var6 + "_" + var7;
               String var10 = this.method28026(this.field34773, "texture." + var9, "item/" + var9);
               String var11 = this.method28026(this.field34773, "texture." + var9 + "_overlay", "item/" + var9 + "_overlay");
               return new String[]{var10, var11};
            }
         }
      }

      return new String[]{this.field34772};
   }

   private String method28026(Map<String, String> var1, String var2, String var3) {
      if (var1 != null) {
         String var6 = (String)var1.get(var2);
         return var6 != null ? var6 : var3;
      } else {
         return var3;
      }
   }

   private static Class7496 method28027(String[] var0) {
      StringBuffer var3 = new StringBuffer();
      var3.append("{\"parent\": \"builtin/generated\",\"textures\": {");

      for (int var4 = 0; var4 < var0.length; var4++) {
         String var5 = var0[var4];
         if (var4 > 0) {
            var3.append(", ");
         }

         var3.append("\"layer" + var4 + "\": \"" + var5 + "\"");
      }

      var3.append("}}");
      String var6 = var3.toString();
      return Class7496.method24427(var6);
   }

   private static IBakedModel method28028(AtlasTexture var0, Class7496 var1, boolean var2) {
      Class1901 var5 = Class1901.field11159;
      Class7826 var6 = var1.method24436("particle");
      TextureAtlasSprite var7 = var6.getSprite();
      Class9071 var8 = new Class9071(var1, Class6391.field27973, false).method33812(var7);

      for (Class9726 var10 : var1.method24428()) {
         for (Direction var12 : var10.field45425.keySet()) {
            Class9163 var13 = var10.field45425.get(var12);
            if (!var2) {
               var13 = new Class9163(var13.field42066, -1, var13.field42068, var13.field42069);
            }

            Class7826 var14 = var1.method24436(var13.field42068);
            TextureAtlasSprite var15 = var14.getSprite();
            Class8557 var16 = method28029(var10, var13, var15, var12, var5);
            if (var13.field42066 != null) {
               var8.method33810(Direction.method531(var5.method8166().method21548(), var13.field42066), var16);
            } else {
               var8.method33811(var16);
            }
         }
      }

      return var8.method33813();
   }

   private static Class8557 method28029(Class9726 var0, Class9163 var1, TextureAtlasSprite var2, Direction var3, Class1901 var4) {
      Class9155 var7 = new Class9155();
      return var7.method34175(var0.field45423, var0.field45424, var1, var2, var3, var4, var0.field45426, var0.field45427, var2.method7465());
   }

   @Override
   public String toString() {
      return ""
         + this.field34769
         + "/"
         + this.field34768
         + ", type: "
         + this.field34770
         + ", items: ["
         + Class7944.method26856(this.field34771)
         + "], textture: "
         + this.field34772;
   }

   public float method28030(TextureManager var1) {
      if (this.field34798 <= 0) {
         if (this.field34790 != null) {
            Class290 var4 = var1.getTexture(this.field34790);
            int var5 = var4.getGlTextureId();
            int var6 = GlStateManager.method23865();
            GlStateManager.bindTexture(var5);
            this.field34798 = GL11.glGetTexLevelParameteri(3553, 0, 4096);
            GlStateManager.bindTexture(var6);
         }

         if (this.field34798 <= 0) {
            this.field34798 = 16;
         }
      }

      return (float)this.field34798;
   }

   public float method28031(TextureManager var1) {
      if (this.field34799 <= 0) {
         if (this.field34790 != null) {
            Class290 var4 = var1.getTexture(this.field34790);
            int var5 = var4.getGlTextureId();
            int var6 = GlStateManager.method23865();
            GlStateManager.bindTexture(var5);
            this.field34799 = GL11.glGetTexLevelParameteri(3553, 0, 4097);
            GlStateManager.bindTexture(var6);
         }

         if (this.field34799 <= 0) {
            this.field34799 = 16;
         }
      }

      return (float)this.field34799;
   }

   public IBakedModel method28032(ResourceLocation var1, boolean var2) {
      IBakedModel var5;
      Map var6;
      if (!var2) {
         var5 = this.field34794;
         var6 = this.field34795;
      } else {
         var5 = this.field34796;
         var6 = this.field34797;
      }

      if (var1 != null && var6 != null) {
         String var7 = var1.getPath();
         IBakedModel var8 = (IBakedModel)var6.get(var7);
         if (var8 != null) {
            return var8;
         }
      }

      return var5;
   }

   public void method28033(ModelBakery var1) {
      if (this.field34774 != null) {
         method28035(var1, this.field34774);
      }

      if (this.field34770 == 1 && this.field34775 != null) {
         for (String var5 : this.field34775.keySet()) {
            String var6 = this.field34775.get(var5);
            String var7 = Class9402.method35762(var5, "model.");
            if (this.method28021(var7)) {
               method28035(var1, var6);
            }
         }
      }
   }

   public void method28034() {
      ModelManager var3 = Class7944.method26825();
      IBakedModel var4 = var3.getMissingModel();
      if (this.field34774 != null) {
         ResourceLocation var5 = method28036(this.field34774);
         Class1997 var6 = new Class1997(var5, "inventory");
         this.field34796 = var3.method1023(var6);
         if (this.field34796 == var4) {
            Class7944.method26811("Custom Items: Model not found " + var6.getPath());
            this.field34796 = null;
         }
      }

      if (this.field34770 == 1 && this.field34775 != null) {
         for (String var14 : this.field34775.keySet()) {
            String var7 = this.field34775.get(var14);
            String var8 = Class9402.method35762(var14, "model.");
            if (this.method28021(var8)) {
               ResourceLocation var9 = method28036(var7);
               Class1997 var10 = new Class1997(var9, "inventory");
               IBakedModel var11 = var3.method1023(var10);
               if (var11 != var4) {
                  if (this.field34797 == null) {
                     this.field34797 = new HashMap<String, IBakedModel>();
                  }

                  String var12 = "item/" + var8;
                  this.field34797.put(var12, var11);
               } else {
                  Class7944.method26811("Custom Items: Model not found " + var10.getPath());
               }
            }
         }
      }
   }

   private static void method28035(ModelBakery var0, String var1) {
      ResourceLocation var4 = method28036(var1);
      Class1997 var5 = new Class1997(var4, "inventory");
      var0.method32845(var5);
   }

   private static ResourceLocation method28036(String var0) {
      return new ResourceLocation(var0);
   }
}
