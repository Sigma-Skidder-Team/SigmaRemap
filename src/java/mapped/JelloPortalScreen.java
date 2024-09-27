package mapped;

import com.mentalfrostbyte.jello.gui.GuiManager;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screen.MultiplayerScreen;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.Widget;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.util.text.StringTextComponent;

import java.util.ArrayList;
import java.util.List;

public class JelloPortalScreen extends MultiplayerScreen {
    private Button portalButton;
    public static int currentVersionIndex = 0;
    private Widget versionSelectorWidget;

    public JelloPortalScreen() {
        super(new VanillaMainMenuScreen());
    }

    public JelloPortalScreen(Screen parentScreen) {
        super(parentScreen);
    }

    @Override
    public void init() {
        super.init();
        /*
        Class5807 versionSelector = new Class5807(
                "jello.portaloption",
                0,
                15,
                1,
                (var1) -> 4D,
                (var1, var2) -> {

                },
                (var1, var2) -> new StringTextComponent("1.8.x")
        );
        this.versionSelectorWidget = this.addButton(versionSelector.createWidget(this.mc.gameSettings, this.width / 2 + 40, 7, 114));

         */
    }

    @Override
    public void render(MatrixStack matrixStack, int mouseX, int mouseY, float partialTicks) {
        super.render(matrixStack, mouseX, mouseY, partialTicks);
        RenderUtil.drawPortalBackground(
                0, 0, Minecraft.getInstance().mainWindow.getWidth(), (int)(30.0 * Minecraft.getInstance().mainWindow.getGuiScaleFactor() / (double) GuiManager.portalScaleFactor)
        );
        this.renderBackground(matrixStack);
        RenderUtil.endScissor();
        //this.versionSelectorWidget.render(matrixStack, mouseX, mouseY, partialTicks);
        //drawString(matrixStack, this.fontRenderer, this.getTextComponent().getString(), this.width / 2 - 146, 13, 16777215);
        //drawString(matrixStack, this.fontRenderer, "Jello Portal:", this.width / 2 - 30, 13, MultiUtilities.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, 0.5F));
    }


    @Override
    public boolean isPauseScreen() {
        return false;
    }
}
