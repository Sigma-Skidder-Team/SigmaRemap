package net.minecraft.client.renderer.entity.layers;

import com.google.common.collect.Maps;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.IEntityRenderer;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IDyeableArmorItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.optifine.Config;
import net.optifine.CustomItems;
import net.optifine.reflect.Reflector;

public abstract class ArmorLayer<T extends LivingEntity, M extends BipedModel<T>, A extends BipedModel<T>> extends LayerRenderer<T, M>
{
    protected final A modelLeggings;
    protected final A modelArmor;
    private static final Map<String, ResourceLocation> ARMOR_TEXTURE_RES_MAP = Maps.newHashMap();

    protected ArmorLayer(IEntityRenderer<T, M> p_i219_1_, A p_i219_2_, A p_i219_3_)
    {
        super(p_i219_1_);
        this.modelLeggings = p_i219_2_;
        this.modelArmor = p_i219_3_;
    }

    public void render(MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn, T entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch)
    {
        this.renderArmorPart(matrixStackIn, bufferIn, entitylivingbaseIn, limbSwing, limbSwingAmount, partialTicks, ageInTicks, netHeadYaw, headPitch, EquipmentSlotType.CHEST, packedLightIn);
        this.renderArmorPart(matrixStackIn, bufferIn, entitylivingbaseIn, limbSwing, limbSwingAmount, partialTicks, ageInTicks, netHeadYaw, headPitch, EquipmentSlotType.LEGS, packedLightIn);
        this.renderArmorPart(matrixStackIn, bufferIn, entitylivingbaseIn, limbSwing, limbSwingAmount, partialTicks, ageInTicks, netHeadYaw, headPitch, EquipmentSlotType.FEET, packedLightIn);
        this.renderArmorPart(matrixStackIn, bufferIn, entitylivingbaseIn, limbSwing, limbSwingAmount, partialTicks, ageInTicks, netHeadYaw, headPitch, EquipmentSlotType.HEAD, packedLightIn);
    }

    private void renderArmorPart(MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, T entityLivingBaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, EquipmentSlotType slotIn, int packedLightIn)
    {
        ItemStack itemstack = entityLivingBaseIn.getItemStackFromSlot(slotIn);

        if (itemstack.getItem() instanceof ArmorItem)
        {
            ArmorItem armoritem = (ArmorItem)itemstack.getItem();

            if (armoritem.getEquipmentSlot() == slotIn)
            {
                A a = this.getModelFromSlot(slotIn);

                if (Reflector.ForgeHooksClient.exists())
                {
                    a = this.getArmorModelHook(entityLivingBaseIn, itemstack, slotIn, a);
                }

                ((BipedModel)this.getEntityModel()).setModelAttributes(a);
                a.setLivingAnimations(entityLivingBaseIn, limbSwing, limbSwingAmount, partialTicks);
                this.setModelSlotVisible(a, slotIn);
                a.setRotationAngles(entityLivingBaseIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
                this.isLegSlot(slotIn);
                boolean flag = itemstack.hasEffect();

                if (armoritem instanceof IDyeableArmorItem)
                {
                    int i = ((IDyeableArmorItem)armoritem).getColor(itemstack);
                    float f = (float)(i >> 16 & 255) / 255.0F;
                    float f1 = (float)(i >> 8 & 255) / 255.0F;
                    float f2 = (float)(i & 255) / 255.0F;
                    this.renderArmor(matrixStackIn, bufferIn, packedLightIn, flag, a, f, f1, f2, this.getArmorResource(entityLivingBaseIn, itemstack, slotIn, (String)null));
                    this.renderArmor(matrixStackIn, bufferIn, packedLightIn, flag, a, 1.0F, 1.0F, 1.0F, this.getArmorResource(entityLivingBaseIn, itemstack, slotIn, "overlay"));
                }
                else
                {
                    this.renderArmor(matrixStackIn, bufferIn, packedLightIn, flag, a, 1.0F, 1.0F, 1.0F, this.getArmorResource(entityLivingBaseIn, itemstack, slotIn, (String)null));
                }
            }
        }
    }

    private void renderModel(MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn, ArmorItem armorItemIn, boolean glintIn, A modelIn, boolean legSlotIn, float red, float green, float blue, @Nullable String overlayIn)
    {
        this.renderArmor(matrixStackIn, bufferIn, packedLightIn, glintIn, modelIn, red, green, blue, this.getArmorResource(armorItemIn, legSlotIn, overlayIn));
    }

    private void renderArmor(MatrixStack p_renderArmor_1_, IRenderTypeBuffer p_renderArmor_2_, int p_renderArmor_3_, boolean p_renderArmor_4_, A p_renderArmor_5_, float p_renderArmor_6_, float p_renderArmor_7_, float p_renderArmor_8_, ResourceLocation p_renderArmor_9_)
    {
        IVertexBuilder ivertexbuilder = ItemRenderer.getBuffer(p_renderArmor_2_, RenderType.getEntityCutoutNoCull(p_renderArmor_9_), false, p_renderArmor_4_);
        p_renderArmor_5_.render(p_renderArmor_1_, ivertexbuilder, p_renderArmor_3_, OverlayTexture.NO_OVERLAY, p_renderArmor_6_, p_renderArmor_7_, p_renderArmor_8_, 1.0F);
    }

    public A getModelFromSlot(EquipmentSlotType slotIn)
    {
        return (A)(this.isLegSlot(slotIn) ? this.modelLeggings : this.modelArmor);
    }

    private boolean isLegSlot(EquipmentSlotType slotIn)
    {
        return slotIn == EquipmentSlotType.LEGS;
    }

    private ResourceLocation getArmorResource(ArmorItem armor, boolean legSlotIn, @Nullable String suffixOverlayIn)
    {
        String s = "textures/models/armor/" + armor.getArmorMaterial().getName() + "_layer_" + (legSlotIn ? 2 : 1) + (suffixOverlayIn == null ? "" : "_" + suffixOverlayIn) + ".png";
        return ARMOR_TEXTURE_RES_MAP.computeIfAbsent(s, ResourceLocation::new);
    }

    protected abstract void setModelSlotVisible(A modelIn, EquipmentSlotType slotIn);

    protected abstract void setModelVisible(A model);

    protected A getArmorModelHook(T p_getArmorModelHook_1_, ItemStack p_getArmorModelHook_2_, EquipmentSlotType p_getArmorModelHook_3_, A p_getArmorModelHook_4_)
    {
        return p_getArmorModelHook_4_;
    }

    public ResourceLocation getArmorResource(Entity p_getArmorResource_1_, ItemStack p_getArmorResource_2_, EquipmentSlotType p_getArmorResource_3_, String p_getArmorResource_4_)
    {
        ArmorItem armoritem = (ArmorItem)p_getArmorResource_2_.getItem();
        String s = armoritem.getArmorMaterial().getName();
        String s1 = "minecraft";
        int i = s.indexOf(58);

        if (i != -1)
        {
            s1 = s.substring(0, i);
            s = s.substring(i + 1);
        }

        String s2 = String.format("%s:textures/models/armor/%s_layer_%d%s.png", s1, s, this.isLegSlot(p_getArmorResource_3_) ? 2 : 1, p_getArmorResource_4_ == null ? "" : String.format("_%s", p_getArmorResource_4_));

        if (Reflector.ForgeHooksClient_getArmorTexture.exists())
        {
            s2 = Reflector.callString(Reflector.ForgeHooksClient_getArmorTexture, p_getArmorResource_1_, p_getArmorResource_2_, s2, p_getArmorResource_3_, p_getArmorResource_4_);
        }

        ResourceLocation resourcelocation = ARMOR_TEXTURE_RES_MAP.get(s2);

        if (resourcelocation == null)
        {
            resourcelocation = new ResourceLocation(s2);
            ARMOR_TEXTURE_RES_MAP.put(s2, resourcelocation);
        }

        if (Config.isCustomItems())
        {
            resourcelocation = CustomItems.getCustomArmorTexture(p_getArmorResource_2_, p_getArmorResource_3_, p_getArmorResource_4_, resourcelocation);
        }

        return resourcelocation;
    }
}
