package net.minecraft.client.gui.chat;

import net.minecraft.client.Minecraft;
import net.minecraft.util.text.ChatType;
import net.minecraft.util.text.ITextComponent;

public class OverlayChatListener implements IChatListener
{
    private final Minecraft mc;

    public OverlayChatListener(Minecraft p_i2806_1_)
    {
        this.mc = p_i2806_1_;
    }

    public void say(ChatType chatTypeIn, ITextComponent message)
    {
        this.mc.ingameGUI.setOverlayMessage(message, false);
    }
}
