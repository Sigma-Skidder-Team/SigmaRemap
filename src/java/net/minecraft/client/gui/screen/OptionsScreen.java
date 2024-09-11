package net.minecraft.client.gui.screen;

import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.matrix.MatrixStack;
import mapped.*;
import net.minecraft.client.AbstractOption;
import net.minecraft.client.GameSettings;
import net.minecraft.client.gui.AccessibilityScreen;
import net.minecraft.client.gui.DialogTexts;
import net.minecraft.client.gui.widget.Widget;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.client.gui.widget.button.LockIconButton;
import net.minecraft.client.gui.widget.button.OptionButton;
import net.minecraft.network.play.client.CLockDifficultyPacket;
import net.minecraft.network.play.client.CSetDifficultyPacket;
import net.minecraft.resources.ResourcePackInfo;
import net.minecraft.resources.ResourcePackList;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.Difficulty;

public class OptionsScreen extends Screen {
   private static final AbstractOption[] SCREEN_OPTIONS = new AbstractOption[]{AbstractOption.FOV};
   private final Screen lastScreen;
   private final GameSettings settings;
   private Button difficultyButton;
   private LockIconButton lockButton;
   private Difficulty worldDifficulty;

   public OptionsScreen(Screen var1, GameSettings var2) {
      super(new TranslationTextComponent("options.title"));
      this.lastScreen = var1;
      this.settings = var2;
   }

   @Override
   public void init() {
      int var3 = 0;

      for (AbstractOption var7 : SCREEN_OPTIONS) {
         int var8 = this.width / 2 - 155 + var3 % 2 * 160;
         int var9 = this.height / 6 - 12 + 24 * (var3 >> 1);
         this.<Widget>addButton(var7.createWidget(this.mc.gameSettings, var8, var9, 150));
         var3++;
      }

      if (this.mc.world == null) {
         this.<OptionButton>addButton(
            new OptionButton(
               this.width / 2 - 155 + var3 % 2 * 160,
               this.height / 6 - 12 + 24 * (var3 >> 1),
               150,
               20,
               AbstractOption.REALMS_NOTIFICATIONS,
               AbstractOption.REALMS_NOTIFICATIONS.func_238152_c_(this.settings),
               var1 -> {
                  AbstractOption.REALMS_NOTIFICATIONS.nextValue(this.settings);
                  this.settings.saveOptions();
                  var1.setMessage(AbstractOption.REALMS_NOTIFICATIONS.func_238152_c_(this.settings));
               }
            )
         );
      } else {
         this.worldDifficulty = this.mc.world.method6997();
         this.difficultyButton = this.addButton(
            new Button(
               this.width / 2 - 155 + var3 % 2 * 160, this.height / 6 - 12 + 24 * (var3 >> 1), 150, 20, this.method5431(this.worldDifficulty), var1 -> {
                  this.worldDifficulty = Difficulty.method8907(this.worldDifficulty.getId() + 1);
                  this.mc.getConnection().sendPacket(new CSetDifficultyPacket(this.worldDifficulty));
                  this.difficultyButton.setMessage(this.method5431(this.worldDifficulty));
               }
            )
         );
         if (this.mc.isSingleplayer() && !this.mc.world.getWorldInfo().isHardcore()) {
            this.difficultyButton.method5741(this.difficultyButton.method5740() - 20);
            this.lockButton = this.<LockIconButton>addButton(
               new LockIconButton(
                  this.difficultyButton.field6477 + this.difficultyButton.method5740(),
                  this.difficultyButton.field6478,
                  var1 -> this.mc
                        .displayGuiScreen(
                           new ConfirmScreen(
                              this::accept,
                              new TranslationTextComponent("difficulty.lock.title"),
                              new TranslationTextComponent(
                                 "difficulty.lock.question",
                                 new TranslationTextComponent("options.difficulty." + this.mc.world.getWorldInfo().method20047().method8909())
                              )
                           )
                        )
               )
            );
            this.lockButton.setLocked(this.mc.world.getWorldInfo().method20048());
            this.lockButton.active = !this.lockButton.method5807();
            this.difficultyButton.active = !this.lockButton.method5807();
         } else {
            this.difficultyButton.active = false;
         }
      }

      this.<Button>addButton(
         new Button(
            this.width / 2 - 155,
            this.height / 6 + 48 - 6,
            150,
            20,
            new TranslationTextComponent("options.skinCustomisation"),
            var1 -> this.mc.displayGuiScreen(new CustomizeSkinScreen(this, this.settings))
         )
      );
      this.<Button>addButton(
         new Button(
            this.width / 2 + 5,
            this.height / 6 + 48 - 6,
            150,
            20,
            new TranslationTextComponent("options.sounds"),
            var1 -> this.mc.displayGuiScreen(new OptionsSoundsScreen(this, this.settings))
         )
      );
      this.<Button>addButton(
         new Button(
            this.width / 2 - 155,
            this.height / 6 + 72 - 6,
            150,
            20,
            new TranslationTextComponent("options.video"),
            var1 -> this.mc.displayGuiScreen(new VideoSettingsScreen(this, this.settings))
         )
      );
      this.<Button>addButton(
         new Button(
            this.width / 2 + 5,
            this.height / 6 + 72 - 6,
            150,
            20,
            new TranslationTextComponent("options.controls"),
            var1 -> this.mc.displayGuiScreen(new ControlsScreen(this, this.settings))
         )
      );
      this.<Button>addButton(
         new Button(
            this.width / 2 - 155,
            this.height / 6 + 96 - 6,
            150,
            20,
            new TranslationTextComponent("options.language"),
            var1 -> this.mc.displayGuiScreen(new LanguageScreen(this, this.settings, this.mc.getLanguageManager()))
         )
      );
      this.<Button>addButton(
         new Button(
            this.width / 2 + 5,
            this.height / 6 + 96 - 6,
            150,
            20,
            new TranslationTextComponent("options.chat.title"),
            var1 -> this.mc.displayGuiScreen(new ChatOptionsScreen(this, this.settings))
         )
      );
      this.<Button>addButton(
         new Button(
            this.width / 2 - 155,
            this.height / 6 + 120 - 6,
            150,
            20,
            new TranslationTextComponent("options.resourcepack"),
            var1 -> this.mc
                  .displayGuiScreen(
                     new PackScreen(
                        this, this.mc.getResourcePackList(), this::func_241584_a_, this.mc.getFileResourcePacks(), new TranslationTextComponent("resourcePack.title")
                     )
                  )
         )
      );
      this.<Button>addButton(
         new Button(
            this.width / 2 + 5,
            this.height / 6 + 120 - 6,
            150,
            20,
            new TranslationTextComponent("options.accessibility.title"),
            var1 -> this.mc.displayGuiScreen(new AccessibilityScreen(this, this.settings))
         )
      );
      this.<Button>addButton(
         new Button(this.width / 2 - 100, this.height / 6 + 168, 200, 20, DialogTexts.field30658, var1 -> this.mc.displayGuiScreen(this.lastScreen))
      );
   }

   private void func_241584_a_(ResourcePackList var1) {
      ImmutableList var4 = ImmutableList.copyOf(this.settings.resourcePacks);
      this.settings.resourcePacks.clear();
      this.settings.incompatibleResourcePacks.clear();

      for (ResourcePackInfo var6 : var1.getEnabledPacks()) {
         if (!var6.isOrderLocked()) {
            this.settings.resourcePacks.add(var6.getName());
            if (!var6.getCompatibility().isCompatible()) {
               this.settings.incompatibleResourcePacks.add(var6.getName());
            }
         }
      }

      this.settings.saveOptions();
      ImmutableList var7 = ImmutableList.copyOf(this.settings.resourcePacks);
      if (!var7.equals(var4)) {
         this.mc.reloadResources();
      }
   }

   private ITextComponent method5431(Difficulty var1) {
      return new TranslationTextComponent("options.difficulty").appendString(": ").append(var1.getDisplayName());
   }

   private void accept(boolean value) {
      this.mc.displayGuiScreen(this);
      if (value && this.mc.world != null) {
         this.mc.getConnection().sendPacket(new CLockDifficultyPacket(true));
         this.lockButton.setLocked(true);
         this.lockButton.active = false;
         this.difficultyButton.active = false;
      }
   }

   @Override
   public void onClose() {
      this.settings.saveOptions();
   }

   @Override
   public void render(MatrixStack var1, int var2, int var3, float var4) {
      this.renderBackground(var1);
      drawCenteredString(var1, this.fontRenderer, this.title, this.width / 2, 15, 16777215);
      super.render(var1, var2, var3, var4);
   }
}
