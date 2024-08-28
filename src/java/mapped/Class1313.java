package mapped;

import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
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
   private Class1206 field6931;
   private Class1189 field6932;
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
         var9 = Registry.field16072.method9187(new ResourceLocation(var8)).orElse((Block)null);
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
            RegistryKey<Biome> var8 = Class9495.field44122;
            if (var5.hasNext()) {
               try {
                  ResourceLocation var9 = new ResourceLocation((String)var5.next());
                  var8 = RegistryKey.<Biome>method31395(Registry.BIOME_KEY, var9);
                  var0.method9188(var8).orElseThrow(() -> new IllegalArgumentException("Invalid Biome: " + var9));
               } catch (Exception var10) {
                  field6925.error("Error while parsing flat world string => {}", var10.getMessage());
               }
            }

            RegistryKey var11 = var8;
            var7.method38128(() -> (Biome)var0.method9189(var11));
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
      var4.append(var0.method9181(var1.method38127()));
      return var4.toString();
   }

   @Override
   public void method1921() {
      this.field4562.field1302.method36347(true);
      this.field6928 = new TranslationTextComponent("createWorld.customize.presets.share");
      this.field6929 = new TranslationTextComponent("createWorld.customize.presets.list");
      this.field6932 = new Class1189(this.field4568, 50, 40, this.field4564 - 100, 20, this.field6928);
      this.field6932.method5657(1230);
      Class2349 var3 = this.field6927.field7000.field7092.method5789().<Biome>method32453(Registry.BIOME_KEY);
      this.field6932.method5635(method6204(var3, this.field6927.method6294()));
      this.field6933 = this.field6927.method6294();
      this.field4561.add(this.field6932);
      this.field6930 = new Class1281(this);
      this.field4561.add(this.field6930);
      this.field6931 = this.<Class1206>method2455(
         new Class1206(this.field4564 / 2 - 155, this.field4565 - 28, 150, 20, new TranslationTextComponent("createWorld.customize.presets.select"), var2 -> {
            Class9733 var5 = method6203(var3, this.field6932.method5636(), this.field6933);
            this.field6927.method6295(var5);
            this.field4562.displayGuiScreen(this.field6927);
         })
      );
      this.<Class1206>method2455(
         new Class1206(this.field4564 / 2 + 5, this.field4565 - 28, 150, 20, Class7127.field30659, var1 -> this.field4562.displayGuiScreen(this.field6927))
      );
      this.method6205(this.field6930.method6023() != null);
   }

   @Override
   public boolean method2649(double var1, double var3, double var5) {
      return this.field6930.method2649(var1, var3, var5);
   }

   @Override
   public void method2482(Minecraft var1, int var2, int var3) {
      String var6 = this.field6932.method5636();
      this.method2467(var1, var2, var3);
      this.field6932.method5635(var6);
   }

   @Override
   public void method1945() {
      this.field4562.displayGuiScreen(this.field6927);
   }

   @Override
   public void onClose() {
      this.field4562.field1302.method36347(false);
   }

   @Override
   public void method1923(MatrixStack var1, int var2, int var3, float var4) {
      this.method2469(var1);
      this.field6930.method1923(var1, var2, var3, var4);
      RenderSystem.pushMatrix();
      RenderSystem.translatef(0.0F, 0.0F, 400.0F);
      method5691(var1, this.field4568, this.field4560, this.field4564 / 2, 8, 16777215);
      method5693(var1, this.field4568, this.field6928, 50, 30, 10526880);
      method5693(var1, this.field4568, this.field6929, 50, 70, 10526880);
      RenderSystem.popMatrix();
      this.field6932.method1923(var1, var2, var3, var4);
      super.method1923(var1, var2, var3, var4);
   }

   @Override
   public void method1919() {
      this.field6932.method5633();
      super.method1919();
   }

   public void method6205(boolean var1) {
      this.field6931.field6482 = var1 || this.field6932.method5636().length() > 1;
   }

   private static void method6206(
           ITextComponent var0, Class3303 var1, RegistryKey<Biome> var2, List<Class2961<?>> var3, boolean var4, boolean var5, boolean var6, Class9537... var7
   ) {
      field6926.add(new Class5966(var1.method11581(), var0, var6x -> {
         HashMap var9 = Maps.newHashMap();

         for (Class2961 var11 : var3) {
            var9.put(var11, Class9763.field45674.get(var11));
         }

         Class9763 var13 = new Class9763(!var4 ? Optional.<Class9245>empty() : Optional.<Class9245>of(Class9763.field45675), var9);
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

         var14.method38128(() -> (Biome)var6x.method9189(var2));
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
   public static Class1189 method6218(Class1313 var0) {
      return var0.field6932;
   }

   static {
      method6206(
         new TranslationTextComponent("createWorld.customize.preset.classic_flat"),
         Blocks.field36395,
         Class9495.field44122,
         Arrays.<Class2961<?>>asList(Class2961.field18073),
         false,
         false,
         false,
         new Class9537(1, Blocks.field36395),
         new Class9537(2, Blocks.field36396),
         new Class9537(1, Blocks.BEDROCK)
      );
      method6206(
         new TranslationTextComponent("createWorld.customize.preset.tunnelers_dream"),
         Blocks.STONE,
         Class9495.field44124,
         Arrays.<Class2961<?>>asList(Class2961.field18059),
         true,
         true,
         false,
         new Class9537(1, Blocks.field36395),
         new Class9537(5, Blocks.field36396),
         new Class9537(230, Blocks.STONE),
         new Class9537(1, Blocks.BEDROCK)
      );
      method6206(
         new TranslationTextComponent("createWorld.customize.preset.water_world"),
         Class8514.field37883,
         Class9495.field44145,
         Arrays.<Class2961<?>>asList(Class2961.field18069, Class2961.field18065, Class2961.field18068),
         false,
         false,
         false,
         new Class9537(90, Blocks.WATER),
         new Class9537(5, Blocks.SAND),
         new Class9537(5, Blocks.field36396),
         new Class9537(5, Blocks.STONE),
         new Class9537(1, Blocks.BEDROCK)
      );
      method6206(
         new TranslationTextComponent("createWorld.customize.preset.overworld"),
         Blocks.GRASS,
         Class9495.field44122,
         Arrays.<Class2961<?>>asList(Class2961.field18073, Class2961.field18059, Class2961.field18058, Class2961.field18064),
         true,
         true,
         true,
         new Class9537(1, Blocks.field36395),
         new Class9537(3, Blocks.field36396),
         new Class9537(59, Blocks.STONE),
         new Class9537(1, Blocks.BEDROCK)
      );
      method6206(
         new TranslationTextComponent("createWorld.customize.preset.snowy_kingdom"),
         Blocks.SNOW,
         Class9495.field44133,
         Arrays.<Class2961<?>>asList(Class2961.field18073, Class2961.field18063),
         false,
         false,
         false,
         new Class9537(1, Blocks.SNOW),
         new Class9537(1, Blocks.field36395),
         new Class9537(3, Blocks.field36396),
         new Class9537(59, Blocks.STONE),
         new Class9537(1, Blocks.BEDROCK)
      );
      method6206(
         new TranslationTextComponent("createWorld.customize.preset.bottomless_pit"),
         Class8514.field37839,
         Class9495.field44122,
         Arrays.<Class2961<?>>asList(Class2961.field18073),
         false,
         false,
         false,
         new Class9537(1, Blocks.field36395),
         new Class9537(3, Blocks.field36396),
         new Class9537(2, Blocks.field36399)
      );
      method6206(
         new TranslationTextComponent("createWorld.customize.preset.desert"),
         Blocks.SAND,
         Class9495.field44123,
         Arrays.<Class2961<?>>asList(Class2961.field18073, Class2961.field18062, Class2961.field18059),
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
         Class8514.field37887,
         Class9495.field44123,
         Collections.<Class2961<?>>emptyList(),
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
         Class9495.field44172,
         Collections.<Class2961<?>>emptyList(),
         false,
         true,
         false,
         new Class9537(1, Blocks.AIR)
      );
   }
}
