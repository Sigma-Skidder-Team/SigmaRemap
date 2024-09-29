package net.minecraft.client.gui.screen;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.datafixers.DataFixer;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenCustomHashMap;
import mapped.*;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.DialogTexts;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.client.util.Util;
import net.minecraft.util.WorldOptimizer;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Nullable;

public class OptimizeWorldScreen extends Screen {
   private static final Logger field4624 = LogManager.getLogger();
   private static final Object2IntMap<RegistryKey<World>> PROGRESS_BAR_COLORS = Util.<Object2IntMap<RegistryKey<World>>>make(
      new Object2IntOpenCustomHashMap(Util.method38509()), var0 -> {
         var0.put(World.OVERWORLD, -13408734);
         var0.put(World.THE_NETHER, -10075085);
         var0.put(World.THE_END, -8943531);
         var0.defaultReturnValue(-2236963);
      }
   );
   private final BooleanConsumer field4626;
   private final WorldOptimizer optimizer;

   @Nullable
   public static OptimizeWorldScreen method2560(Minecraft var0, BooleanConsumer var1, DataFixer var2, SaveFormat.LevelSave var3, boolean var4) {
      DynamicRegistriesImpl var7 = DynamicRegistries.func_239770_b_();

      try (Minecraft.PackManager var8 = var0.reloadDatapacks(var7, Minecraft::loadDataPackCodec, Minecraft::loadWorld, false, var3)) {
         IServerConfiguration var10 = var8.getServerConfiguration();
         var3.saveLevel(var7, var10);
         ImmutableSet var11 = var10.getDimensionGeneratorSettings().method26266();
         return new OptimizeWorldScreen(var1, var2, var3, var10.method20099(), var4, var11);
      } catch (Exception var24) {
         field4624.warn("Failed to load datapacks, can't optimize world", var24);
         return null;
      }
   }

   private OptimizeWorldScreen(BooleanConsumer var1, DataFixer var2, SaveFormat.LevelSave var3, WorldSettings var4, boolean var5, ImmutableSet<RegistryKey<World>> var6) {
      super(new TranslationTextComponent("optimizeWorld.title", var4.method32426()));
      this.field4626 = var1;
      this.optimizer = new WorldOptimizer(var3, var2, var6, var5);
   }

   @Override
   public void init() {
      super.init();
      this.<Button>addButton(new Button(this.width / 2 - 100, this.height / 4 + 150, 200, 20, DialogTexts.GUI_CANCEL, var1 -> {
         this.optimizer.cancel();
         this.field4626.accept(false);
      }));
   }

   public void tick() {
      if (this.optimizer.isFinished()) {
         this.field4626.accept(true);
      }
   }

   public void method1945() {
      this.field4626.accept(false);
   }

   public void onClose() {
      this.optimizer.cancel();
   }

   public void render(MatrixStack matrixStack, int mouseX, int mouseY, float partialTicks) {
      this.renderBackground(matrixStack);
      drawCenteredString(matrixStack, this.font, this.title, this.width / 2, 20, 16777215);
      int i = this.width / 2 - 150;
      int j = this.width / 2 + 150;
      int k = this.height / 4 + 100;
      int l = k + 10;
      drawCenteredString(matrixStack, this.font, this.optimizer.getStatusText(), this.width / 2, k - 9 - 2, 10526880);

      if (this.optimizer.getTotalChunks() > 0)
      {
         fill(matrixStack, i - 1, k - 1, j + 1, l + 1, -16777216);
         drawString(matrixStack, this.font, new TranslationTextComponent("optimizeWorld.info.converted", this.optimizer.getConverted()), i, 40, 10526880);
         drawString(matrixStack, this.font, new TranslationTextComponent("optimizeWorld.info.skipped", this.optimizer.getSkipped()), i, 40 + 9 + 3, 10526880);
         drawString(matrixStack, this.font, new TranslationTextComponent("optimizeWorld.info.total", this.optimizer.getTotalChunks()), i, 40 + (9 + 3) * 2, 10526880);
         int i1 = 0;

         for (RegistryKey<World> registrykey : this.optimizer.func_233533_c_())
         {
            int j1 = MathHelper.floor(this.optimizer.func_233531_a_(registrykey) * (float)(j - i));
            fill(matrixStack, i + i1, k, i + i1 + j1, l, PROGRESS_BAR_COLORS.getInt(registrykey));
            i1 += j1;
         }

         int k1 = this.optimizer.getConverted() + this.optimizer.getSkipped();
         drawCenteredString(matrixStack, this.font, k1 + " / " + this.optimizer.getTotalChunks(), this.width / 2, k + 2 * 9 + 2, 10526880);
         drawCenteredString(matrixStack, this.font, MathHelper.floor(this.optimizer.getTotalProgress() * 100.0F) + "%", this.width / 2, k + (l - k) / 2 - 9 / 2, 10526880);
      }

      super.render(matrixStack, mouseX, mouseY, partialTicks);
   }
}
