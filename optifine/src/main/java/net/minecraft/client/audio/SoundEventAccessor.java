package net.minecraft.client.audio;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class SoundEventAccessor implements ISoundEventAccessor<Sound>
{
    private final List<ISoundEventAccessor<Sound>> accessorList = Lists.newArrayList();
    private final Random rnd = new Random();
    private final ResourceLocation location;
    private final ITextComponent subtitle;

    public SoundEventAccessor(ResourceLocation p_i415_1_, @Nullable String p_i415_2_)
    {
        this.location = p_i415_1_;
        this.subtitle = p_i415_2_ == null ? null : new TranslationTextComponent(p_i415_2_);
    }

    public int getWeight()
    {
        int i = 0;

        for (ISoundEventAccessor<Sound> isoundeventaccessor : this.accessorList)
        {
            i += isoundeventaccessor.getWeight();
        }

        return i;
    }

    public Sound cloneEntry()
    {
        int i = this.getWeight();

        if (!this.accessorList.isEmpty() && i != 0)
        {
            int j = this.rnd.nextInt(i);

            for (ISoundEventAccessor<Sound> isoundeventaccessor : this.accessorList)
            {
                j -= isoundeventaccessor.getWeight();

                if (j < 0)
                {
                    return isoundeventaccessor.cloneEntry();
                }
            }

            return SoundHandler.MISSING_SOUND;
        }
        else
        {
            return SoundHandler.MISSING_SOUND;
        }
    }

    public void addSound(ISoundEventAccessor<Sound> accessor)
    {
        this.accessorList.add(accessor);
    }

    @Nullable
    public ITextComponent getSubtitle()
    {
        return this.subtitle;
    }

    public void enqueuePreload(SoundEngine engine)
    {
        for (ISoundEventAccessor<Sound> isoundeventaccessor : this.accessorList)
        {
            isoundeventaccessor.enqueuePreload(engine);
        }
    }
}