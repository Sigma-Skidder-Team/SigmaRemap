package net.minecraft.util.datafix.fixes;

import com.mojang.datafixers.schemas.Schema;
import java.util.Objects;

public class TippedArrow extends TypedEntityRenameHelper
{
    public TippedArrow(Schema p_i3029_1_, boolean p_i3029_2_)
    {
        super("EntityTippedArrowFix", p_i3029_1_, p_i3029_2_);
    }

    protected String rename(String name)
    {
        return Objects.equals(name, "TippedArrow") ? "Arrow" : name;
    }
}
