package net.minecraft.client.gui.widget.list;

import net.minecraft.client.Minecraft;

public abstract class ExtendedList<E extends AbstractList.AbstractListEntry<E>> extends AbstractList<E>
{
    private boolean inFocus;

    public ExtendedList(Minecraft p_i3727_1_, int p_i3727_2_, int p_i3727_3_, int p_i3727_4_, int p_i3727_5_, int p_i3727_6_)
    {
        super(p_i3727_1_, p_i3727_2_, p_i3727_3_, p_i3727_4_, p_i3727_5_, p_i3727_6_);
    }

    public boolean changeFocus(boolean p_changeFocus_1_)
    {
        if (!this.inFocus && this.getItemCount() == 0)
        {
            return false;
        }
        else
        {
            this.inFocus = !this.inFocus;

            if (this.inFocus && this.getSelected() == null && this.getItemCount() > 0)
            {
                this.moveSelection(1);
            }
            else if (this.inFocus && this.getSelected() != null)
            {
                this.moveSelection(0);
            }

            return this.inFocus;
        }
    }

    public abstract static class AbstractListEntry<E extends ExtendedList.AbstractListEntry<E>> extends AbstractList.AbstractListEntry<E>
    {
        public boolean changeFocus(boolean p_changeFocus_1_)
        {
            return false;
        }
    }
}
