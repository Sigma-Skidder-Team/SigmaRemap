package mapped;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.gui.GuiManager;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import de.florianmichael.vialoadingbase.ViaLoadingBase;
import de.florianmichael.viamcp.protocolinfo.ProtocolInfo;
import com.mentalfrostbyte.jello.util.ClientColors;
import net.minecraft.client.GameSettings;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screen.MultiplayerScreen;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.Widget;
import net.minecraft.client.settings.SliderPercentageOption;
import net.minecraft.util.text.StringTextComponent;

import java.util.ArrayList;
import java.util.List;

import static de.florianmichael.viamcp.protocolinfo.ProtocolInfo.PROTOCOL_INFOS;

public class JelloPortalScreen extends MultiplayerScreen {
    private Widget versionSelectorWidget;

    public JelloPortalScreen(Screen parentScreen) {
        super(parentScreen);
    }

    @Override
    public void init() {
        super.init();
        // Create the slider
        SliderPercentageOption versionSelector = new SliderPercentageOption(
                "jello.portaloption",
                0.0,
                this.getAvailableVersions().size() - 1,
                1.0F,
                (var1) -> (double) getCurrentVersionIndex(),
                this::onSliderChange,
                (settings, slider) -> new StringTextComponent(getVersion(getCurrentVersionIndex()).getName())
        );
        this.versionSelectorWidget = this.addButton(versionSelector.createWidget(this.mc.gameSettings, this.width / 2 + 40, 7, 114));
    }

    private void onSliderChange(GameSettings settings, Double aDouble) {
        int newIndex = aDouble.intValue();
        if (newIndex >= 0 && newIndex < getAvailableVersions().size()) {
            ViaLoadingBase.getInstance().reload(getVersion(newIndex));
            Client.currentVersionIndex = newIndex;
        }
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
        drawString(matrixStack, this.font, this.getTextComponent().getString(), this.width / 2 - 146, 13, 16777215);
        drawString(matrixStack, this.font, "Jello Portal:", this.width / 2 - 30, 13, MultiUtilities.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, 0.5F));
    }

    private int getCurrentVersionIndex() {
        return Client.currentVersionIndex;
    }

    private List<ProtocolVersion> getAvailableVersions() {
        ArrayList<ProtocolVersion> availableVersions = new ArrayList<>();

        for (ProtocolInfo version : PROTOCOL_INFOS) {
            availableVersions.add(version.getProtocolVersion());
        }

        return availableVersions;
    }

    private ProtocolVersion getVersion(int index) {
        List<ProtocolVersion> availableVersions = getAvailableVersions();
        if (index < 0 || index >= availableVersions.size()) {
            return ProtocolInfo.R1_16_4.getProtocolVersion(); // Fallback version
        }
        return availableVersions.get(index);
    }

    @Override
    public boolean isPauseScreen() {
        return false;
    }
}
