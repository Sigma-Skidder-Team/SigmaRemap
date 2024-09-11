package mapped;

import com.mentalfrostbyte.jello.gui.GuiManager;
import com.mentalfrostbyte.jello.unmapped.JelloPortal;
import com.mentalfrostbyte.jello.util.ColorUtils;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.Minecraft;
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
        Class5807 versionSelector = new Class5807(
                "jello.portaloption",
                0.0,
                (double)(this.getAvailableVersions().size() - 1),
                1.0F,
                (var1) -> (double)this.getCurrentVersionIndex(),
                (var1, var2) -> JelloPortal.currentVersion = this.getVersion(var2.intValue()),
                (var1, var2) -> {
                    int versionIndex = (int)var2.getValue(var1);
                    return new StringTextComponent(this.getVersion(versionIndex).getVersionName());
                }
        );
        this.versionSelectorWidget = this.addButton(versionSelector.createWidget(this.mc.gameSettings, this.width / 2 + 40, 7, 114));
    }

    @Override
    public void render(MatrixStack matrixStack, int mouseX, int mouseY, float partialTicks) {
        super.render(matrixStack, mouseX, mouseY, partialTicks);
        RenderUtil.drawPortalBackground(
                0, 0, Minecraft.getInstance().mainWindow.getWidth(), (int)(30.0 * Minecraft.getInstance().mainWindow.getGuiScaleFactor() / (double) GuiManager.portalScaleFactor)
        );
        this.renderBackground(matrixStack);
        RenderUtil.endScissor();
        this.versionSelectorWidget.render(matrixStack, mouseX, mouseY, partialTicks);
        drawString(matrixStack, this.fontRenderer, this.getTextComponent().getString(), this.width / 2 - 146, 13, 16777215);
        drawString(matrixStack, this.fontRenderer, "Jello Portal:", this.width / 2 - 30, 13, ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, 0.5F));
    }

    private int getCurrentVersionIndex() {
        currentVersionIndex = 0;

        for (ViaVerList version : this.getAvailableVersions()) {
            if (this.getVersion(currentVersionIndex).equals(JelloPortal.getCurrentVersion())) {
                break;
            }

            currentVersionIndex++;
        }

        return currentVersionIndex;
    }

    private List<ViaVerList> getAvailableVersions() {
        ArrayList<ViaVerList> availableVersions = new ArrayList<>();

        for (ViaVerList version : ViaVerList.versionList) {
            if (version.getVersionNumber() >= ViaVerList._1_8_x.getVersionNumber()) {
                availableVersions.add(version);
            }
        }

        return availableVersions;
    }

    private ViaVerList getVersion(int index) {
        List<ViaVerList> availableVersions = this.getAvailableVersions();
        if (index < 0 || index >= availableVersions.size()) {
            return ViaVerList._1_16_4;
        }
        return availableVersions.get(index);
    }


    @Override
    public boolean isPauseScreen() {
        return false;
    }
}
