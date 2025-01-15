package net.minecraft.client.util;

public interface ITooltipFlag
{
    boolean isAdvanced();

    public static enum TooltipFlags implements ITooltipFlag
    {
        NORMAL(false),
        ADVANCED(true);

        private final boolean isAdvanced;

        private TooltipFlags(boolean p_i2567_3_)
        {
            this.isAdvanced = p_i2567_3_;
        }

        public boolean isAdvanced()
        {
            return this.isAdvanced;
        }
    }
}
