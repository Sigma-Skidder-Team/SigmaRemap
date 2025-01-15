package net.minecraft.dispenser;

public abstract class OptionalDispenseBehavior extends DefaultDispenseItemBehavior
{
    protected boolean successful = true;

    protected void playDispenseSound(IBlockSource source)
    {
        source.getWorld().playEvent(this.successful ? 1000 : 1001, source.getBlockPos(), 0);
    }
}
