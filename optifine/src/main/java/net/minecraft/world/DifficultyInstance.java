package net.minecraft.world;

import javax.annotation.concurrent.Immutable;
import net.minecraft.util.math.MathHelper;

@Immutable
public class DifficultyInstance
{
    private final Difficulty worldDifficulty;
    private final float additionalDifficulty;

    public DifficultyInstance(Difficulty p_i1922_1_, long p_i1922_2_, long p_i1922_4_, float p_i1922_6_)
    {
        this.worldDifficulty = p_i1922_1_;
        this.additionalDifficulty = this.calculateAdditionalDifficulty(p_i1922_1_, p_i1922_2_, p_i1922_4_, p_i1922_6_);
    }

    public Difficulty getDifficulty()
    {
        return this.worldDifficulty;
    }

    public float getAdditionalDifficulty()
    {
        return this.additionalDifficulty;
    }

    public boolean isHarderThan(float p_193845_1_)
    {
        return this.additionalDifficulty > p_193845_1_;
    }

    public float getClampedAdditionalDifficulty()
    {
        if (this.additionalDifficulty < 2.0F)
        {
            return 0.0F;
        }
        else
        {
            return this.additionalDifficulty > 4.0F ? 1.0F : (this.additionalDifficulty - 2.0F) / 2.0F;
        }
    }

    private float calculateAdditionalDifficulty(Difficulty difficulty, long worldTime, long chunkInhabitedTime, float moonPhaseFactor)
    {
        if (difficulty == Difficulty.PEACEFUL)
        {
            return 0.0F;
        }
        else
        {
            boolean flag = difficulty == Difficulty.HARD;
            float f = 0.75F;
            float f1 = MathHelper.clamp(((float)worldTime + -72000.0F) / 1440000.0F, 0.0F, 1.0F) * 0.25F;
            f = f + f1;
            float f2 = 0.0F;
            f2 = f2 + MathHelper.clamp((float)chunkInhabitedTime / 3600000.0F, 0.0F, 1.0F) * (flag ? 1.0F : 0.75F);
            f2 = f2 + MathHelper.clamp(moonPhaseFactor * 0.25F, 0.0F, f1);

            if (difficulty == Difficulty.EASY)
            {
                f2 *= 0.5F;
            }

            f = f + f2;
            return (float)difficulty.getId() * f;
        }
    }
}
