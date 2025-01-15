package net.minecraft.client.gui.spectator.categories;

import com.google.common.base.MoreObjects;
import java.util.List;
import net.minecraft.client.gui.spectator.ISpectatorMenuObject;
import net.minecraft.client.gui.spectator.ISpectatorMenuView;
import net.minecraft.client.gui.spectator.SpectatorMenu;

public class SpectatorDetails
{
    private final ISpectatorMenuView category;
    private final List<ISpectatorMenuObject> items;
    private final int selectedSlot;

    public SpectatorDetails(ISpectatorMenuView p_i2985_1_, List<ISpectatorMenuObject> p_i2985_2_, int p_i2985_3_)
    {
        this.category = p_i2985_1_;
        this.items = p_i2985_2_;
        this.selectedSlot = p_i2985_3_;
    }

    public ISpectatorMenuObject getObject(int index)
    {
        return index >= 0 && index < this.items.size() ? MoreObjects.firstNonNull(this.items.get(index), SpectatorMenu.EMPTY_SLOT) : SpectatorMenu.EMPTY_SLOT;
    }

    public int getSelectedSlot()
    {
        return this.selectedSlot;
    }
}
