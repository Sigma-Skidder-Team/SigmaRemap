package mapped;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import net.minecraft.block.BlockState;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.horse.AbstractHorseEntity;
import net.minecraft.state.properties.ChestType;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.IBlockDisplayReader;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.biome.Biome;
import net.optifine.Config;
import net.optifine.CustomGuis;
import net.optifine.config.BiomeId;

public class Class8149 {
   private String field35046 = null;
   private String field35047 = null;
   private Class2295 field35048 = null;
   private Map<ResourceLocation, ResourceLocation> field35049 = null;
   private Class7305 field35050 = null;
   private BiomeId[] field35051 = null;
   private Class9532 field35052 = null;
   private Boolean field35053 = null;
   private Boolean field35054 = null;
   private Boolean field35055 = null;
   private Boolean field35056 = null;
   private Class9532 field35057 = null;
   private Class9710[] field35058 = null;
   private Class2224[] field35059 = null;
   private Class112[] field35060 = null;
   private static final Class2224[] field35061 = new Class2224[]{Class2224.field14547, Class2224.field14548, Class2224.field14549, Class2224.field14550};
   private static final Class2224[] field35062 = new Class2224[]{Class2224.field14551, Class2224.field14552};
   private static final Class2224[] field35063 = new Class2224[0];
   private static final Class112[] field35064 = new Class112[0];
   private static final ResourceLocation field35065 = new ResourceLocation("textures/gui/container/anvil.png");
   private static final ResourceLocation field35066 = new ResourceLocation("textures/gui/container/beacon.png");
   private static final ResourceLocation field35067 = new ResourceLocation("textures/gui/container/brewing_stand.png");
   private static final ResourceLocation field35068 = new ResourceLocation("textures/gui/container/generic_54.png");
   private static final ResourceLocation field35069 = new ResourceLocation("textures/gui/container/crafting_table.png");
   private static final ResourceLocation field35070 = new ResourceLocation("textures/gui/container/horse.png");
   private static final ResourceLocation field35071 = new ResourceLocation("textures/gui/container/dispenser.png");
   private static final ResourceLocation field35072 = new ResourceLocation("textures/gui/container/enchanting_table.png");
   private static final ResourceLocation field35073 = new ResourceLocation("textures/gui/container/furnace.png");
   private static final ResourceLocation field35074 = new ResourceLocation("textures/gui/container/hopper.png");
   private static final ResourceLocation field35075 = new ResourceLocation("textures/gui/container/inventory.png");
   private static final ResourceLocation field35076 = new ResourceLocation("textures/gui/container/shulker_box.png");
   private static final ResourceLocation field35077 = new ResourceLocation("textures/gui/container/villager2.png");

   public Class8149(Properties var1, String var2) {
      Class8896 var5 = new Class8896("CustomGuis");
      this.field35046 = var5.method32382(var2);
      this.field35047 = var5.method32383(var2);
      this.field35048 = (Class2295)var5.method32413(var1.getProperty("container"), Class2295.values(), "container");
      this.field35049 = method28257(var1, "texture", this.field35048, "textures/gui/", this.field35047);
      this.field35050 = var5.method32417("name", var1.getProperty("name"));
      this.field35051 = var5.method32396(var1.getProperty("biomes"));
      this.field35052 = var5.method32404(var1.getProperty("heights"));
      this.field35053 = var5.method32407(var1.getProperty("large"));
      this.field35054 = var5.method32407(var1.getProperty("trapped"));
      this.field35055 = var5.method32407(var1.getProperty("christmas"));
      this.field35056 = var5.method32407(var1.getProperty("ender"));
      this.field35057 = var5.method32404(var1.getProperty("levels"));
      this.field35058 = var5.method32418(var1.getProperty("professions"));
      Class2224[] var6 = method28253(this.field35048);
      this.field35059 = (Class2224[])var5.method32414(var1.getProperty("variants"), var6, "variants", field35063);
      this.field35060 = method28254(var1.getProperty("colors"));
   }

   private static Class2224[] method28253(Class2295 var0) {
      if (var0 != Class2295.field15262) {
         return var0 != Class2295.field15258 ? new Class2224[0] : field35062;
      } else {
         return field35061;
      }
   }

   private static Class112[] method28254(String var0) {
      if (var0 == null) {
         return null;
      } else {
         var0 = var0.toLowerCase();
         String[] var3 = Config.method26903(var0, " ");
         Class112[] var4 = new Class112[var3.length];

         for (int var5 = 0; var5 < var3.length; var5++) {
            String var6 = var3[var5];
            Class112 var7 = method28255(var6);
            if (var7 == null) {
               method28260("Invalid color: " + var6);
               return field35064;
            }

            var4[var5] = var7;
         }

         return var4;
      }
   }

   private static Class112 method28255(String var0) {
      if (var0 == null) {
         return null;
      } else {
         Class112[] var3 = Class112.values();

         for (int var4 = 0; var4 < var3.length; var4++) {
            Class112 var5 = var3[var4];
            if (var5.getString().equals(var0)) {
               return var5;
            }

            if (var5.method310().equals(var0)) {
               return var5;
            }
         }

         return null;
      }
   }

   private static ResourceLocation method28256(String var0, String var1) {
      if (var0 != null) {
         var0 = var0.trim();
         String var4 = Class8684.method31274(var0, var1);
         if (!var4.endsWith(".png")) {
            var4 = var4 + ".png";
         }

         return new ResourceLocation(var1 + "/" + var4);
      } else {
         return null;
      }
   }

   private static Map<ResourceLocation, ResourceLocation> method28257(Properties var0, String var1, Class2295 var2, String var3, String var4) {
      HashMap var7 = new HashMap();
      String var8 = var0.getProperty(var1);
      if (var8 != null) {
         ResourceLocation var9 = method28258(var2);
         ResourceLocation var10 = method28256(var8, var4);
         if (var9 != null && var10 != null) {
            var7.put(var9, var10);
         }
      }

      String var17 = var1 + ".";

      for (String var11 : (((Set<String>) (Set<?>) var0.keySet()))) {
         if (var11.startsWith(var17)) {
            String var12 = var11.substring(var17.length());
            var12 = var12.replace('\\', '/');
            var12 = Class9402.method35772(var12, "/", ".png");
            String var13 = var3 + var12 + ".png";
            String var14 = var0.getProperty(var11);
            ResourceLocation var15 = new ResourceLocation(var13);
            ResourceLocation var16 = method28256(var14, var4);
            var7.put(var15, var16);
         }
      }

      return var7;
   }

   private static ResourceLocation method28258(Class2295 var0) {
      if (var0 == null) {
         return null;
      } else {
         switch (Class7674.field32880[var0.ordinal()]) {
            case 1:
               return field35065;
            case 2:
               return field35066;
            case 3:
               return field35067;
            case 4:
               return field35068;
            case 5:
               return field35069;
            case 6:
               return null;
            case 7:
               return field35071;
            case 8:
               return field35072;
            case 9:
               return field35073;
            case 10:
               return field35074;
            case 11:
               return field35070;
            case 12:
               return field35075;
            case 13:
               return field35076;
            case 14:
               return field35077;
            default:
               return null;
         }
      }
   }

   public boolean method28259(String var1) {
      if (this.field35046 == null || this.field35046.length() <= 0) {
         method28260("No name found: " + var1);
         return false;
      } else if (this.field35047 == null) {
         method28260("No base path found: " + var1);
         return false;
      } else if (this.field35048 == null) {
         method28260("No container found: " + var1);
         return false;
      } else if (this.field35049.isEmpty()) {
         method28260("No texture found: " + var1);
         return false;
      } else if (this.field35058 == Class8896.field40259) {
         method28260("Invalid professions or careers: " + var1);
         return false;
      } else if (this.field35059 == field35063) {
         method28260("Invalid variants: " + var1);
         return false;
      } else if (this.field35060 != field35064) {
         return true;
      } else {
         method28260("Invalid colors: " + var1);
         return false;
      }
   }

   private static void method28260(String var0) {
      Config.method26811("[CustomGuis] " + var0);
   }

   private boolean method28261(Class2295 var1, BlockPos var2, IWorldReader var3) {
      if (this.field35048 == var1) {
         if (this.field35051 != null) {
            Biome var6 = var3.getBiome(var2);
            if (!Class7542.method24662(var6, this.field35051)) {
               return false;
            }
         }

         return this.field35052 == null || this.field35052.method36838(var2.getY());
      } else {
         return false;
      }
   }

   public boolean method28262(Class2295 var1, BlockPos var2, IWorldReader var3, Screen var4) {
      if (!this.method28261(var1, var2, var3)) {
         return false;
      } else {
         if (this.field35050 != null) {
            String var7 = method28263(var4);
            if (!this.field35050.method23084(var7)) {
               return false;
            }
         }

         switch (Class7674.field32880[var1.ordinal()]) {
            case 2:
               return this.method28264(var2, var3);
            case 4:
               return this.method28265(var2, var3);
            case 7:
               return this.method28269(var2, var3);
            case 13:
               return this.method28271(var2, var3);
            default:
               return true;
         }
      }
   }

   public static String method28263(Screen var0) {
      ITextComponent var3 = var0.getTextComponent();
      return var3 != null ? var3.getUnformattedComponentText() : null;
   }

   private boolean method28264(BlockPos var1, IBlockDisplayReader var2) {
      TileEntity var5 = var2.getTileEntity(var1);
      if (var5 instanceof Class950) {
         Class950 var6 = (Class950)var5;
         if (this.field35057 != null) {
            int var7 = var6.method3824();
            if (!this.field35057.method36838(var7)) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean method28265(BlockPos var1, IBlockDisplayReader var2) {
      TileEntity var5 = var2.getTileEntity(var1);
      if (!(var5 instanceof ChestTileEntity)) {
         if (!(var5 instanceof Class943)) {
            return false;
         } else {
            Class943 var7 = (Class943)var5;
            return this.method28267(var7, var1, var2);
         }
      } else {
         ChestTileEntity var6 = (ChestTileEntity)var5;
         return this.method28266(var6, var1, var2);
      }
   }

   private boolean method28266(ChestTileEntity var1, BlockPos var2, IBlockDisplayReader var3) {
      BlockState var6 = var3.getBlockState(var2);
      ChestType var7 = !var6.method23462(ChestBlock.TYPE) ? ChestType.field379 : var6.<ChestType>get(ChestBlock.TYPE);
      boolean var8 = var7 == ChestType.field379;
      boolean var9 = var1 instanceof Class970;
      boolean var10 = CustomGuis.field30441;
      boolean var11 = false;
      return this.method28268(var8, var9, var10, var11);
   }

   private boolean method28267(Class943 var1, BlockPos var2, IBlockDisplayReader var3) {
      return this.method28268(false, false, false, true);
   }

   private boolean method28268(boolean var1, boolean var2, boolean var3, boolean var4) {
      if (this.field35053 != null && this.field35053 != var1) {
         return false;
      } else if (this.field35054 != null && this.field35054 != var2) {
         return false;
      } else {
         return this.field35055 != null && this.field35055 != var3 ? false : this.field35056 == null || this.field35056 == var4;
      }
   }

   private boolean method28269(BlockPos var1, IBlockDisplayReader var2) {
      TileEntity var5 = var2.getTileEntity(var1);
      if (var5 instanceof Class971) {
         Class971 var6 = (Class971)var5;
         if (this.field35059 != null) {
            Class2224 var7 = this.method28270(var6);
            if (!Config.method26943(var7, this.field35059)) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private Class2224 method28270(Class971 var1) {
      return !(var1 instanceof Class972) ? Class2224.field14551 : Class2224.field14552;
   }

   private boolean method28271(BlockPos var1, IBlockDisplayReader var2) {
      TileEntity var5 = var2.getTileEntity(var1);
      if (var5 instanceof Class940) {
         Class940 var6 = (Class940)var5;
         if (this.field35060 != null) {
            Class112 var7 = var6.method3756();
            if (!Config.method26943(var7, this.field35060)) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public boolean method28272(Class2295 var1, Entity var2, IWorldReader var3) {
      if (!this.method28261(var1, var2.getPosition(), var3)) {
         return false;
      } else {
         if (this.field35050 != null) {
            String var6 = var2.method2956();
            if (!this.field35050.method23084(var6)) {
               return false;
            }
         }

         switch (Class7674.field32880[var1.ordinal()]) {
            case 11:
               return this.method28274(var2, var3);
            case 14:
               return this.method28273(var2, var3);
            default:
               return true;
         }
      }
   }

   private boolean method28273(Entity var1, IBlockDisplayReader var2) {
      if (var1 instanceof Class1042) {
         Class1042 var5 = (Class1042)var1;
         if (this.field35058 != null) {
            Class7921 var6 = var5.method4674();
            Class8395 var7 = var6.method26571();
            int var8 = var6.method26572();
            if (!Class9710.method38046(var7, var8, this.field35058)) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean method28274(Entity var1, IBlockDisplayReader var2) {
      if (var1 instanceof AbstractHorseEntity) {
         AbstractHorseEntity var5 = (AbstractHorseEntity)var1;
         if (this.field35059 != null) {
            Class2224 var6 = this.method28275(var5);
            if (!Config.method26943(var6, this.field35059)) {
               return false;
            }
         }

         if (this.field35060 != null && var5 instanceof Class1064) {
            Class1064 var8 = (Class1064)var5;
            Class112 var7 = var8.method4906();
            if (!Config.method26943(var7, this.field35060)) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private Class2224 method28275(AbstractHorseEntity var1) {
      if (!(var1 instanceof Class1074)) {
         if (!(var1 instanceof Class1067)) {
            if (!(var1 instanceof Class1078)) {
               return !(var1 instanceof Class1064) ? null : Class2224.field14550;
            } else {
               return Class2224.field14549;
            }
         } else {
            return Class2224.field14548;
         }
      } else {
         return Class2224.field14547;
      }
   }

   public Class2295 method28276() {
      return this.field35048;
   }

   public ResourceLocation method28277(ResourceLocation var1) {
      ResourceLocation var4 = this.field35049.get(var1);
      return var4 != null ? var4 : var1;
   }

   @Override
   public String toString() {
      return "name: " + this.field35046 + ", container: " + this.field35048 + ", textures: " + this.field35049;
   }
}
