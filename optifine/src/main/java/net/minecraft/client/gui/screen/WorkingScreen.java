package net.minecraft.client.gui.screen;

import java.util.Objects;
import net.minecraft.client.gui.chat.NarratorChatListener;
import net.minecraft.util.IProgressUpdate;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.optifine.CustomLoadingScreen;
import net.optifine.CustomLoadingScreens;

public class WorkingScreen extends Screen implements IProgressUpdate
{
    private String title = "";
    private String stage = "";
    private int progress;
    private boolean doneWorking;
    private CustomLoadingScreen customLoadingScreen = CustomLoadingScreens.getCustomLoadingScreen();

    public WorkingScreen()
    {
        super(NarratorChatListener.EMPTY);
    }

    public boolean shouldCloseOnEsc()
    {
        return false;
    }

    public void displaySavingString(ITextComponent component)
    {
        this.resetProgressAndMessage(component);
    }

    public void resetProgressAndMessage(ITextComponent component)
    {
        this.title = component.getFormattedText();
        this.displayLoadingString(new TranslationTextComponent("progress.working"));
    }

    public void displayLoadingString(ITextComponent component)
    {
        this.stage = component.getFormattedText();
        this.setLoadingProgress(0);
    }

    public void setLoadingProgress(int progress)
    {
        this.progress = progress;
    }

    public void setDoneWorking()
    {
        this.doneWorking = true;
    }

    public void render(int p_render_1_, int p_render_2_, float p_render_3_)
    {
        if (this.doneWorking)
        {
            if (!this.minecraft.isConnectedToRealms())
            {
                this.minecraft.displayGuiScreen((Screen)null);
            }
        }
        else
        {
            if (this.customLoadingScreen != null && this.minecraft.world == null)
            {
                this.customLoadingScreen.drawBackground(this.width, this.height);
            }
            else
            {
                this.renderBackground();
            }

            if (this.progress > 0)
            {
                this.drawCenteredString(this.font, this.title, this.width / 2, 70, 16777215);

                if (!Objects.equals(this.stage, "") && this.progress != 0)
                {
                    this.drawCenteredString(this.font, this.stage + " " + this.progress + "%", this.width / 2, 90, 16777215);
                }
            }

            super.render(p_render_1_, p_render_2_, p_render_3_);
        }
    }
}
