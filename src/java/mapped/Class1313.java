package mapped;

import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.DialogTexts;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.TextFieldWidget;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.item.Items;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.gen.settings.DimensionStructuresSettings;
import net.minecraft.world.gen.settings.StructureSpreadSettings;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Nullable;
import java.util.*;

public class Class1313 extends Screen {
   private static final Logger field6925 = LogManager.getLogger();
   private static final List<Class5966> field6926 = Lists.newArrayList();
   private final Class1324 field6927;
   private ITextComponent field6928;
   private ITextComponent field6929;
   private Class1281 field6930;
   private Button field6931;
   private TextFieldWidget field6932;
   private Class9733 field6933;

   public Class1313(Class1324 var1) {
      super(new TranslationTextComponent("createWorld.customize.presets.title"));
      this.field6927 = var1;
   }

   @Nullable
   private static Class9537 method6201(String var0, int var1) {
      String[] var4 = var0.split("\\*", 2);
      int var5;
      if (var4.length == 2) {
         try {
            var5 = Math.max(Integer.parseInt(var4[0]), 0);
         } catch (NumberFormatException var12) {
            field6925.error("Error while parsing flat world string => {}", var12.getMessage());
            return null;
         }
      } else {
         var5 = 1;
      }

      int var6 = Math.min(var1 + var5, 256);
      int var7 = var6 - var1;
      String var8 = var4[var4.length - 1];

      Block var9;
      try {
         var9 = Registry.BLOCK.method9187(new ResourceLocation(var8)).orElse((Block)null);
      } catch (Exception var11) {
         field6925.error("Error while parsing flat world string => {}", var11.getMessage());
         return null;
      }

      if (var9 == null) {
         field6925.error("Error while parsing flat world string => Unknown block, {}", var8);
         return null;
      } else {
         Class9537 var10 = new Class9537(var7, var9);
         var10.method36908(var1);
         return var10;
      }
   }

   private static List<Class9537> method6202(String var0) {
      ArrayList var3 = Lists.newArrayList();
      String[] var4 = var0.split(",");
      int var5 = 0;

      for (String var9 : var4) {
         Class9537 var10 = method6201(var9, var5);
         if (var10 == null) {
            return Collections.<Class9537>emptyList();
         }

         var3.add(var10);
         var5 += var10.method36905();
      }

      return var3;
   }

   public static Class9733 method6203(Registry<Biome> var0, String var1, Class9733 var2) {
      Iterator var5 = Splitter.on(';').split(var1).iterator();
      if (!var5.hasNext()) {
         return Class9733.method38132(var0);
      } else {
         List var6 = method6202((String)var5.next());
         if (var6.isEmpty()) {
            return Class9733.method38132(var0);
         } else {
            Class9733 var7 = var2.method38122(var6, var2.method38126());
            RegistryKey<Biome> var8 = Biomes.PLAINS;
            if (var5.hasNext()) {
               try {
                  ResourceLocation var9 = new ResourceLocation((String)var5.next());
                  var8 = RegistryKey.<Biome>getOrCreateKey(Registry.BIOME_KEY, var9);
                  var0.method9188(var8).orElseThrow(() -> new IllegalArgumentException("Invalid Biome: " + var9));
               } catch (Exception var10) {
                  field6925.error("Error while parsing flat world string => {}", var10.getMessage());
               }
            }

            RegistryKey var11 = var8;
            var7.method38128(() -> (Biome)var0.getOrThrow(var11));
            return var7;
         }
      }
   }

   private static String method6204(Registry<Biome> var0, Class9733 var1) {
      StringBuilder var4 = new StringBuilder();

      for (int var5 = 0; var5 < var1.method38129().size(); var5++) {
         if (var5 > 0) {
            var4.append(",");
         }

         var4.append(var1.method38129().get(var5));
      }

      var4.append(";");
      var4.append(var0.getKey(var1.method38127()));
      return var4.toString();
   }

   @Override
   public void init() {
      this.mc.keyboardListener.enableRepeatEvents(true);
      this.field6928 = new TranslationTextComponent("createWorld.customize.presets.share");
      this.field6929 = new TranslationTextComponent("createWorld.customize.presets.list");
      this.field6932 = new TextFieldWidget(this.font, 50, 40, this.width - 100, 20, this.field6928);
      this.field6932.method5657(1230);
      MutableRegistry var3 = this.field6927.field7000.field7092.method5789().<Biome>getRegistry(Registry.BIOME_KEY);
      this.field6932.method5635(method6204(var3, this.field6927.method6294()));
      this.field6933 = this.field6927.method6294();
      this.children.add(this.field6932);
      this.field6930 = new Class1281(this);
      this.children.add(this.field6930);
      this.field6931 = this.<Button>addButton(
         new Button(this.width / 2 - 155, this.height - 28, 150, 20, new TranslationTextComponent("createWorld.customize.presets.select"), var2 -> {
            Class9733 var5 = method6203(var3, this.field6932.getText(), this.field6933);
            this.field6927.method6295(var5);
            this.mc.displayGuiScreen(this.field6927);
         })
      );
      this.<Button>addButton(
         new Button(this.width / 2 + 5, this.height - 28, 150, 20, DialogTexts.GUI_CANCEL, var1 -> this.mc.displayGuiScreen(this.field6927))
      );
      this.method6205(this.field6930.getSelected() != null);
   }

   @Override
   public boolean mouseScrolled(double var1, double var3, double var5) {
      return this.field6930.mouseScrolled(var1, var3, var5);
   }

   @Override
   public void resize(Minecraft var1, int var2, int var3) {
      String var6 = this.field6932.getText();
      this.init(var1, var2, var3);
      this.field6932.method5635(var6);
   }

   @Override
   public void method1945() {
      this.mc.displayGuiScreen(this.field6927);
   }

   @Override
   public void onClose() {
      this.mc.keyboardListener.enableRepeatEvents(false);
   }

   @Override
   public void render(MatrixStack var1, int var2, int var3, float var4) {
      this.renderBackground(var1);
      this.field6930.render(var1, var2, var3, var4);
      RenderSystem.pushMatrix();
      RenderSystem.translatef(0.0F, 0.0F, 400.0F);
      drawCenteredString(var1, this.font, this.title, this.width / 2, 8, 16777215);
      drawString(var1, this.font, this.field6928, 50, 30, 10526880);
      drawString(var1, this.font, this.field6929, 50, 70, 10526880);
      RenderSystem.popMatrix();
      this.field6932.render(var1, var2, var3, var4);
      super.render(var1, var2, var3, var4);
   }

   @Override
   public void tick() {
      this.field6932.method5633();
      super.tick();
   }

   public void method6205(boolean var1) {
      this.field6931.active = var1 || this.field6932.getText().length() > 1;
   }

   private static void method6206(
           ITextComponent var0, IItemProvider var1, RegistryKey<Biome> var2, List<Structure<?>> var3, boolean var4, boolean var5, boolean var6, Class9537... var7
   ) {
      field6926.add(new Class5966(var1.method11581(), var0, var6x -> {
         HashMap var9 = Maps.newHashMap();

         for (Structure var11 : var3) {
            var9.put(var11, DimensionStructuresSettings.field45674.get(var11));
         }

         DimensionStructuresSettings var13 = new DimensionStructuresSettings(!var4 ? Optional.<StructureSpreadSettings>empty() : Optional.<StructureSpreadSettings>of(DimensionStructuresSettings.field45675), var9);
         Class9733 var14 = new Class9733(var13, var6x);
         if (var5) {
            var14.method38123();
         }

         if (var6) {
            var14.method38124();
         }

         for (int var12 = var7.length - 1; var12 >= 0; var12--) {
            var14.method38129().add(var7[var12]);
         }

         var14.method38128(() -> (Biome)var6x.getOrThrow(var2));
         var14.method38131();
         return var14.method38121(var13);
      }));
   }

   // $VF: synthetic method
   public static List method6213() {
      return field6926;
   }

   // $VF: synthetic method
   public static Class1324 method6214(Class1313 var0) {
      return var0.field6927;
   }

   // $VF: synthetic method
   public static Class9733 method6215(Class1313 var0, Class9733 var1) {
      return var0.field6933 = var1;
   }

   // $VF: synthetic method
   public static Class9733 method6216(Class1313 var0) {
      return var0.field6933;
   }

   // $VF: synthetic method
   public static String method6217(Registry var0, Class9733 var1) {
      return method6204(var0, var1);
   }

   // $VF: synthetic method
   public static TextFieldWidget method6218(Class1313 var0) {
      return var0.field6932;
   }

   static {
      method6206(
         new TranslationTextComponent("createWorld.customize.preset.classic_flat"),
         Blocks.GRASS_BLOCK,
         Biomes.PLAINS,
         Arrays.<Structure<?>>asList(Structure.field18073),
         false,
         false,
         false,
         new Class9537(1, Blocks.GRASS_BLOCK),
         new Class9537(2, Blocks.DIRT),
         new Class9537(1, Blocks.BEDROCK)
      );
      method6206(
         new TranslationTextComponent("createWorld.customize.preset.tunnelers_dream"),
         Blocks.STONE,
         Biomes.MOUNTAINS,
         Arrays.<Structure<?>>asList(Structure.MINESHAFT),
         true,
         true,
         false,
         new Class9537(1, Blocks.GRASS_BLOCK),
         new Class9537(5, Blocks.DIRT),
         new Class9537(230, Blocks.STONE),
         new Class9537(1, Blocks.BEDROCK)
      );
      method6206(
         new TranslationTextComponent("createWorld.customize.preset.water_world"),
         Items.WATER_BUCKET,
         Biomes.DEEP_OCEAN,
         Arrays.<Structure<?>>asList(Structure.field18069, Structure.SHIPWRECK, Structure.MONUMENT),
         false,
         false,
         false,
         new Class9537(90, Blocks.WATER),
         new Class9537(5, Blocks.SAND),
         new Class9537(5, Blocks.DIRT),
         new Class9537(5, Blocks.STONE),
         new Class9537(1, Blocks.BEDROCK)
      );
      method6206(
         new TranslationTextComponent("createWorld.customize.preset.overworld"),
         Blocks.GRASS,
         Biomes.PLAINS,
         Arrays.<Structure<?>>asList(Structure.field18073, Structure.MINESHAFT, Structure.PILLAGER_OUTPOST, Structure.RUINED_PORTAL),
         true,
         true,
         true,
         new Class9537(1, Blocks.GRASS_BLOCK),
         new Class9537(3, Blocks.DIRT),
         new Class9537(59, Blocks.STONE),
         new Class9537(1, Blocks.BEDROCK)
      );
      method6206(
         new TranslationTextComponent("createWorld.customize.preset.snowy_kingdom"),
         Blocks.SNOW,
         Biomes.SNOWY_TUNDRA,
         Arrays.<Structure<?>>asList(Structure.field18073, Structure.IGLOO),
         false,
         false,
         false,
         new Class9537(1, Blocks.SNOW),
         new Class9537(1, Blocks.GRASS_BLOCK),
         new Class9537(3, Blocks.DIRT),
         new Class9537(59, Blocks.STONE),
         new Class9537(1, Blocks.BEDROCK)
      );
      method6206(
         new TranslationTextComponent("createWorld.customize.preset.bottomless_pit"),
         Items.field37839,
         Biomes.PLAINS,
         Arrays.<Structure<?>>asList(Structure.field18073),
         false,
         false,
         false,
         new Class9537(1, Blocks.GRASS_BLOCK),
         new Class9537(3, Blocks.DIRT),
         new Class9537(2, Blocks.field36399)
      );
      method6206(
         new TranslationTextComponent("createWorld.customize.preset.desert"),
         Blocks.SAND,
         Biomes.DESERT,
         Arrays.<Structure<?>>asList(Structure.field18073, Structure.DESERT_PYRAMID, Structure.MINESHAFT),
         true,
         true,
         false,
         new Class9537(8, Blocks.SAND),
         new Class9537(52, Blocks.SANDSTONE),
         new Class9537(3, Blocks.STONE),
         new Class9537(1, Blocks.BEDROCK)
      );
      method6206(
         new TranslationTextComponent("createWorld.customize.preset.redstone_ready"),
         Items.REDSTONE_DUST,
         Biomes.DESERT,
         Collections.<Structure<?>>emptyList(),
         false,
         false,
         false,
         new Class9537(52, Blocks.SANDSTONE),
         new Class9537(3, Blocks.STONE),
         new Class9537(1, Blocks.BEDROCK)
      );
      method6206(
         new TranslationTextComponent("createWorld.customize.preset.the_void"),
         Blocks.field36765,
         Biomes.field44172,
         Collections.<Structure<?>>emptyList(),
         false,
         true,
         false,
         new Class9537(1, Blocks.AIR)
      );
   }
}
