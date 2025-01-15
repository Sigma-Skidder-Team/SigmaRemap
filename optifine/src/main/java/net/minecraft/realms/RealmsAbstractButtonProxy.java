package net.minecraft.realms;

public interface RealmsAbstractButtonProxy < T extends AbstractRealmsButton<? >>
{
    T getButton();

    boolean active();

    void active(boolean p_active_1_);

    boolean isVisible();

    void setVisible(boolean p_setVisible_1_);
}
