package net.minecraft.client.gui.chat;

import net.minecraft.client.Minecraft;
import net.minecraft.util.text.ChatType;
import net.minecraft.util.text.ITextComponent;

public class NormalChatListener implements IChatListener
{
    private final Minecraft mc;

    public NormalChatListener(Minecraft p_i3497_1_)
    {
        this.mc = p_i3497_1_;
    }

    public void say(ChatType chatTypeIn, ITextComponent message)
    {
        this.mc.ingameGUI.getChatGUI().printChatMessage(message);
    }
}
