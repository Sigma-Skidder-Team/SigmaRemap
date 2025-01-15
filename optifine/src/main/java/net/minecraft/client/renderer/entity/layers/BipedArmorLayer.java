package net.minecraft.client.renderer.entity.layers;

import net.minecraft.client.renderer.entity.IEntityRenderer;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;

public class BipedArmorLayer<T extends LivingEntity, M extends BipedModel<T>, A extends BipedModel<T>> extends ArmorLayer<T, M, A>
{
    public BipedArmorLayer(IEntityRenderer<T, M> buttonId, A x, A y)
    {
        super(buttonId, x, y);
    }

    protected void setModelSlotVisible(A modelIn, EquipmentSlotType slotIn)
    {
        this.setModelVisible(modelIn);

        switch (slotIn)
        {
            case HEAD:
                modelIn.bipedHead.showModel = true;
                modelIn.bipedHeadwear.showModel = true;
                break;

            case CHEST:
                modelIn.bipedBody.showModel = true;
                modelIn.bipedRightArm.showModel = true;
                modelIn.bipedLeftArm.showModel = true;
                break;

            case LEGS:
                modelIn.bipedBody.showModel = true;
                modelIn.bipedRightLeg.showModel = true;
                modelIn.bipedLeftLeg.showModel = true;
                break;

            case FEET:
                modelIn.bipedRightLeg.showModel = true;
                modelIn.bipedLeftLeg.showModel = true;
        }
    }

    protected void setModelVisible(A model)
    {
        model.setVisible(false);
    }
}
