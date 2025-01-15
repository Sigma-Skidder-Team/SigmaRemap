package net.minecraft.client.gui;

import com.google.common.collect.Lists;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.client.MainWindow;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.client.renderer.Matrix4f;
import net.minecraft.entity.player.ChatVisibility;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class NewChatGui extends AbstractGui
{
    private static final Logger LOGGER = LogManager.getLogger();
    private final Minecraft mc;
    private final List<String> sentMessages = Lists.newArrayList();
    private final List<ChatLine> chatLines = Lists.newArrayList();
    private final List<ChatLine> drawnChatLines = Lists.newArrayList();
    private int scrollPos;
    private boolean isScrolled;
    private int lastChatWidth = 0;

    public NewChatGui(Minecraft p_i250_1_)
    {
        this.mc = p_i250_1_;
    }

    public void render(int updateCounter)
    {
        int i = this.getChatWidth();

        if (this.lastChatWidth != i)
        {
            this.lastChatWidth = i;
            this.refreshChat();
        }

        if (this.isChatVisible())
        {
            int j = this.getLineCount();
            int k = this.drawnChatLines.size();

            if (k > 0)
            {
                boolean flag = false;

                if (this.getChatOpen())
                {
                    flag = true;
                }

                double d0 = this.getScale();
                int l = MathHelper.ceil((double)this.getChatWidth() / d0);
                RenderSystem.pushMatrix();
                RenderSystem.translatef(2.0F, 8.0F, 0.0F);
                RenderSystem.scaled(d0, d0, 1.0D);
                double d1 = this.mc.gameSettings.chatOpacity * (double)0.9F + (double)0.1F;
                double d2 = this.mc.gameSettings.accessibilityTextBackgroundOpacity;
                int i1 = 0;
                Matrix4f matrix4f = Matrix4f.makeTranslate(0.0F, 0.0F, -100.0F);

                for (int j1 = 0; j1 + this.scrollPos < this.drawnChatLines.size() && j1 < j; ++j1)
                {
                    ChatLine chatline = this.drawnChatLines.get(j1 + this.scrollPos);

                    if (chatline != null)
                    {
                        int k1 = updateCounter - chatline.getUpdatedCounter();

                        if (k1 < 200 || flag)
                        {
                            double d3 = flag ? 1.0D : getLineBrightness(k1);
                            int i2 = (int)(255.0D * d3 * d1);
                            int j2 = (int)(255.0D * d3 * d2);
                            ++i1;

                            if (i2 > 3)
                            {
                                int k2 = 0;
                                int l2 = -j1 * 9;

                                if (this.mc.gameSettings.ofChatBackground == 5)
                                {
                                    l = this.mc.fontRenderer.getStringWidth(chatline.getChatComponent().getFormattedText()) - 2;
                                }

                                if (this.mc.gameSettings.ofChatBackground != 3)
                                {
                                    fill(matrix4f, -2, l2 - 9, 0 + l + 4, l2, j2 << 24);
                                }

                                String s = chatline.getChatComponent().getFormattedText();
                                RenderSystem.enableBlend();

                                if (!this.mc.gameSettings.ofChatShadow)
                                {
                                    this.mc.fontRenderer.drawString(s, 0.0F, (float)(l2 - 8), 16777215 + (i2 << 24));
                                }
                                else
                                {
                                    this.mc.fontRenderer.drawStringWithShadow(s, 0.0F, (float)(l2 - 8), 16777215 + (i2 << 24));
                                }

                                RenderSystem.disableAlphaTest();
                                RenderSystem.disableBlend();
                            }
                        }
                    }
                }

                if (flag)
                {
                    int i3 = 9;
                    RenderSystem.translatef(-3.0F, 0.0F, 0.0F);
                    int j3 = k * i3 + k;
                    int k3 = i1 * i3 + i1;
                    int l3 = this.scrollPos * k3 / k;
                    int l1 = k3 * k3 / j3;

                    if (j3 != k3)
                    {
                        int i4 = l3 > 0 ? 170 : 96;
                        int j4 = this.isScrolled ? 13382451 : 3355562;
                        fill(0, -l3, 2, -l3 - l1, j4 + (i4 << 24));
                        fill(2, -l3, 1, -l3 - l1, 13421772 + (i4 << 24));
                    }
                }

                RenderSystem.popMatrix();
            }
        }
    }

    private boolean isChatVisible()
    {
        return this.mc.gameSettings.chatVisibility != ChatVisibility.HIDDEN;
    }

    private static double getLineBrightness(int counterIn)
    {
        double d0 = (double)counterIn / 200.0D;
        d0 = 1.0D - d0;
        d0 = d0 * 10.0D;
        d0 = MathHelper.clamp(d0, 0.0D, 1.0D);
        d0 = d0 * d0;
        return d0;
    }

    public void clearChatMessages(boolean clearSentMsgHistory)
    {
        this.drawnChatLines.clear();
        this.chatLines.clear();

        if (clearSentMsgHistory)
        {
            this.sentMessages.clear();
        }
    }

    public void printChatMessage(ITextComponent chatComponent)
    {
        this.printChatMessageWithOptionalDeletion(chatComponent, 0);
    }

    public void printChatMessageWithOptionalDeletion(ITextComponent chatComponent, int chatLineId)
    {
        this.setChatLine(chatComponent, chatLineId, this.mc.ingameGUI.getTicks(), false);
        LOGGER.info("[CHAT] {}", (Object)chatComponent.getString().replaceAll("\r", "\\\\r").replaceAll("\n", "\\\\n"));
    }

    private void setChatLine(ITextComponent chatComponent, int chatLineId, int updateCounter, boolean displayOnly)
    {
        if (chatLineId != 0)
        {
            this.deleteChatLine(chatLineId);
        }

        int i = MathHelper.floor((double)this.getChatWidth() / this.getScale());
        List<ITextComponent> list = RenderComponentsUtil.splitText(chatComponent, i, this.mc.fontRenderer, false, false);
        boolean flag = this.getChatOpen();

        for (ITextComponent itextcomponent : list)
        {
            if (flag && this.scrollPos > 0)
            {
                this.isScrolled = true;
                this.addScrollPos(1.0D);
            }

            this.drawnChatLines.add(0, new ChatLine(updateCounter, itextcomponent, chatLineId));
        }

        while (this.drawnChatLines.size() > 100)
        {
            this.drawnChatLines.remove(this.drawnChatLines.size() - 1);
        }

        if (!displayOnly)
        {
            this.chatLines.add(0, new ChatLine(updateCounter, chatComponent, chatLineId));

            while (this.chatLines.size() > 100)
            {
                this.chatLines.remove(this.chatLines.size() - 1);
            }
        }
    }

    public void refreshChat()
    {
        this.drawnChatLines.clear();
        this.resetScroll();

        for (int i = this.chatLines.size() - 1; i >= 0; --i)
        {
            ChatLine chatline = this.chatLines.get(i);
            this.setChatLine(chatline.getChatComponent(), chatline.getChatLineID(), chatline.getUpdatedCounter(), true);
        }
    }

    public List<String> getSentMessages()
    {
        return this.sentMessages;
    }

    public void addToSentMessages(String message)
    {
        if (this.sentMessages.isEmpty() || !this.sentMessages.get(this.sentMessages.size() - 1).equals(message))
        {
            this.sentMessages.add(message);
        }
    }

    public void resetScroll()
    {
        this.scrollPos = 0;
        this.isScrolled = false;
    }

    public void addScrollPos(double posInc)
    {
        this.scrollPos = (int)((double)this.scrollPos + posInc);
        int i = this.drawnChatLines.size();

        if (this.scrollPos > i - this.getLineCount())
        {
            this.scrollPos = i - this.getLineCount();
        }

        if (this.scrollPos <= 0)
        {
            this.scrollPos = 0;
            this.isScrolled = false;
        }
    }

    @Nullable
    public ITextComponent getTextComponent(double p_194817_1_, double p_194817_3_)
    {
        if (this.getChatOpen() && !this.mc.gameSettings.hideGUI && this.isChatVisible())
        {
            double d0 = this.getScale();
            double d1 = p_194817_1_ - 2.0D;
            double d2 = (double)this.mc.getMainWindow().getScaledHeight() - p_194817_3_ - 40.0D;
            d1 = (double)MathHelper.floor(d1 / d0);
            d2 = (double)MathHelper.floor(d2 / d0);

            if (!(d1 < 0.0D) && !(d2 < 0.0D))
            {
                int i = Math.min(this.getLineCount(), this.drawnChatLines.size());

                if (d1 <= (double)MathHelper.floor((double)this.getChatWidth() / this.getScale()) && d2 < (double)(9 * i + i))
                {
                    int j = (int)(d2 / 9.0D + (double)this.scrollPos);

                    if (j >= 0 && j < this.drawnChatLines.size())
                    {
                        ChatLine chatline = this.drawnChatLines.get(j);
                        int k = 0;

                        for (ITextComponent itextcomponent : chatline.getChatComponent())
                        {
                            if (itextcomponent instanceof StringTextComponent)
                            {
                                k += this.mc.fontRenderer.getStringWidth(RenderComponentsUtil.removeTextColorsIfConfigured(((StringTextComponent)itextcomponent).getText(), false));

                                if ((double)k > d1)
                                {
                                    return itextcomponent;
                                }
                            }
                        }
                    }

                    return null;
                }
                else
                {
                    return null;
                }
            }
            else
            {
                return null;
            }
        }
        else
        {
            return null;
        }
    }

    public boolean getChatOpen()
    {
        return this.mc.currentScreen instanceof ChatScreen;
    }

    public void deleteChatLine(int id)
    {
        Iterator<ChatLine> iterator = this.drawnChatLines.iterator();

        while (iterator.hasNext())
        {
            ChatLine chatline = iterator.next();

            if (chatline.getChatLineID() == id)
            {
                iterator.remove();
            }
        }

        iterator = this.chatLines.iterator();

        while (iterator.hasNext())
        {
            ChatLine chatline1 = iterator.next();

            if (chatline1.getChatLineID() == id)
            {
                iterator.remove();
                break;
            }
        }
    }

    public int getChatWidth()
    {
        int i = calculateChatboxWidth(this.mc.gameSettings.chatWidth);
        MainWindow mainwindow = Minecraft.getInstance().getMainWindow();
        int j = (int)((double)(mainwindow.getFramebufferWidth() - 3) / mainwindow.getGuiScaleFactor());
        return MathHelper.clamp(i, 0, j);
    }

    public int getChatHeight()
    {
        return calculateChatboxHeight(this.getChatOpen() ? this.mc.gameSettings.chatHeightFocused : this.mc.gameSettings.chatHeightUnfocused);
    }

    public double getScale()
    {
        return this.mc.gameSettings.chatScale;
    }

    public static int calculateChatboxWidth(double p_194814_0_)
    {
        int i = 320;
        int j = 40;
        return MathHelper.floor(p_194814_0_ * 280.0D + 40.0D);
    }

    public static int calculateChatboxHeight(double p_194816_0_)
    {
        int i = 180;
        int j = 20;
        return MathHelper.floor(p_194816_0_ * 160.0D + 20.0D);
    }

    public int getLineCount()
    {
        return this.getChatHeight() / 9;
    }
}
