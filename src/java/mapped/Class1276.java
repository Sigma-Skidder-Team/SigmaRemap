package mapped;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screen.CreateWorldScreen;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.WorldSelectionScreen;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.function.Supplier;

public class Class1276 extends Class1274<Class1173> {
   private static final Logger field6805 = LogManager.getLogger();
   private static final DateFormat field6806 = new SimpleDateFormat();
   private static final ResourceLocation field6807 = new ResourceLocation("textures/misc/unknown_server.png");
   private static final ResourceLocation field6808 = new ResourceLocation("textures/gui/world_selection.png");
   private static final ITextComponent field6809 = new TranslationTextComponent("selectWorld.tooltip.fromNewerVersion1").mergeStyle(TextFormatting.RED);
   private static final ITextComponent field6810 = new TranslationTextComponent("selectWorld.tooltip.fromNewerVersion2").mergeStyle(TextFormatting.RED);
   private static final ITextComponent field6811 = new TranslationTextComponent("selectWorld.tooltip.snapshot1").mergeStyle(TextFormatting.GOLD);
   private static final ITextComponent field6812 = new TranslationTextComponent("selectWorld.tooltip.snapshot2").mergeStyle(TextFormatting.GOLD);
   private static final ITextComponent field6813 = new TranslationTextComponent("selectWorld.locked").mergeStyle(TextFormatting.RED);
   private final WorldSelectionScreen field6814;
   private List<Class2024> field6815;

   public Class1276(WorldSelectionScreen var1, Minecraft var2, int var3, int var4, int var5, int var6, int var7, Supplier<String> var8, Class1276 var9) {
      super(var2, var3, var4, var5, var6, var7);
      this.field6814 = var1;
      if (var9 != null) {
         this.field6815 = var9.field6815;
      }

      this.method6066(var8, false);
   }

   public void method6066(Supplier<String> var1, boolean var2) {
      this.method6027();
      SaveFormat var5 = this.field6782.getSaveLoader();
      if (this.field6815 == null || var2) {
         try {
            this.field6815 = var5.method38458();
         } catch (Class2428 var9) {
            field6805.error("Couldn't load level list", var9);
            this.field6782.displayGuiScreen(new Class1134(new TranslationTextComponent("selectWorld.unable_to_load"), new StringTextComponent(var9.getMessage())));
            return;
         }

         Collections.sort(this.field6815);
      }

      if (this.field6815.isEmpty()) {
         this.field6782.displayGuiScreen(CreateWorldScreen.func_243425_a((Screen)null));
      } else {
         String var6 = ((String)var1.get()).toLowerCase(Locale.ROOT);

         for (Class2024 var8 : this.field6815) {
            if (var8.method8644().toLowerCase(Locale.ROOT).contains(var6) || var8.method8643().toLowerCase(Locale.ROOT).contains(var6)) {
               this.method6030(new Class1173(this, this, var8));
            }
         }
      }
   }

   @Override
   public int method6048() {
      return super.method6048() + 20;
   }

   @Override
   public int method6022() {
      return super.method6022() + 50;
   }

   @Override
   public boolean method6057() {
      return this.field6814.getListener() == this;
   }

   public void method6024(Class1173 var1) {
      super.method6024(var1);
      if (var1 != null) {
         Class2024 var4 = Class1173.method5595(var1);
         NarratorChatListener.INSTANCE
            .say(
               new TranslationTextComponent(
                     "narrator.select",
                     new TranslationTextComponent(
                        "narrator.select.world",
                        var4.method8644(),
                        new Date(var4.method8647()),
                        !var4.method8649()
                           ? new TranslationTextComponent("gameMode." + var4.method8648().method8153())
                           : new TranslationTextComponent("gameMode.hardcore"),
                        !var4.method8650() ? StringTextComponent.EMPTY : new TranslationTextComponent("selectWorld.cheats"),
                        var4.method8651()
                     )
                  )
                  .getString()
            );
      }

      this.field6814.method6422(var1 != null && !Class1173.method5595(var1).method8656());
   }

   @Override
   public void method6049(Class2220 var1) {
      this.method6051(var1, var0 -> !Class1173.method5595(var0).method8656());
   }

   public Optional<Class1173> method6067() {
      return Optional.<Class1173>ofNullable(this.getSelected());
   }

   public WorldSelectionScreen method6068() {
      return this.field6814;
   }

   // $VF: synthetic method
   public static DateFormat method6070() {
      return field6806;
   }

   // $VF: synthetic method
   public static ResourceLocation method6071() {
      return field6807;
   }

   // $VF: synthetic method
   public static ResourceLocation method6072() {
      return field6808;
   }

   // $VF: synthetic method
   public static ITextComponent method6073() {
      return field6813;
   }

   // $VF: synthetic method
   public static ITextComponent method6074() {
      return field6809;
   }

   // $VF: synthetic method
   public static ITextComponent method6075() {
      return field6810;
   }

   // $VF: synthetic method
   public static ITextComponent method6076() {
      return field6811;
   }

   // $VF: synthetic method
   public static ITextComponent method6077() {
      return field6812;
   }

   // $VF: synthetic method
   public static Logger method6078() {
      return field6805;
   }
}
