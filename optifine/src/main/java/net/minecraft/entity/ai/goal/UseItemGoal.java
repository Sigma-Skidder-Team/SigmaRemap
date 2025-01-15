package net.minecraft.entity.ai.goal;

import java.util.function.Predicate;
import javax.annotation.Nullable;
import net.minecraft.entity.MobEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundEvent;

public class UseItemGoal<T extends MobEntity> extends Goal
{
    private final T field_220766_a;
    private final ItemStack field_220767_b;
    private final Predicate <? super T > field_220768_c;
    private final SoundEvent field_220769_d;

    public UseItemGoal(T p_i2532_1_, ItemStack p_i2532_2_, @Nullable SoundEvent p_i2532_3_, Predicate <? super T > p_i2532_4_)
    {
        this.field_220766_a = p_i2532_1_;
        this.field_220767_b = p_i2532_2_;
        this.field_220769_d = p_i2532_3_;
        this.field_220768_c = p_i2532_4_;
    }

    public boolean shouldExecute()
    {
        return this.field_220768_c.test(this.field_220766_a);
    }

    public boolean shouldContinueExecuting()
    {
        return this.field_220766_a.isHandActive();
    }

    public void startExecuting()
    {
        this.field_220766_a.setItemStackToSlot(EquipmentSlotType.MAINHAND, this.field_220767_b.copy());
        this.field_220766_a.setActiveHand(Hand.MAIN_HAND);
    }

    public void resetTask()
    {
        this.field_220766_a.setItemStackToSlot(EquipmentSlotType.MAINHAND, ItemStack.EMPTY);

        if (this.field_220769_d != null)
        {
            this.field_220766_a.playSound(this.field_220769_d, 1.0F, this.field_220766_a.getRNG().nextFloat() * 0.2F + 0.9F);
        }
    }
}
