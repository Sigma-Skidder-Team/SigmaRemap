package net.minecraft.client.renderer;

import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.entity.player.ClientPlayerEntity;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.fluid.Fluids;
import net.minecraft.fluid.IFluidState;
import net.minecraft.potion.Effects;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.Util;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.optifine.Config;
import net.optifine.CustomColors;
import net.optifine.reflect.Reflector;
import net.optifine.shaders.Shaders;

public class FogRenderer
{
    public static float red;
    public static float green;
    public static float blue;
    private static int lastWaterFogColor = -1;
    private static int waterFogColor = -1;
    private static long waterFogUpdateTime = -1L;
    public static boolean fogStandard = false;

    public static void updateFogColor(ActiveRenderInfo activeRenderInfoIn, float partialTicks, ClientWorld worldIn, int renderDistanceChunks, float bossColorModifier)
    {
        IFluidState ifluidstate = activeRenderInfoIn.getFluidState();

        if (ifluidstate.isTagged(FluidTags.WATER))
        {
            long i = Util.milliTime();
            int j = worldIn.getBiome(new BlockPos(activeRenderInfoIn.getProjectedView())).getWaterFogColor();

            if (waterFogUpdateTime < 0L)
            {
                lastWaterFogColor = j;
                waterFogColor = j;
                waterFogUpdateTime = i;
            }

            int k = lastWaterFogColor >> 16 & 255;
            int l = lastWaterFogColor >> 8 & 255;
            int i1 = lastWaterFogColor & 255;
            int j1 = waterFogColor >> 16 & 255;
            int k1 = waterFogColor >> 8 & 255;
            int l1 = waterFogColor & 255;
            float f = MathHelper.clamp((float)(i - waterFogUpdateTime) / 5000.0F, 0.0F, 1.0F);
            float f1 = MathHelper.lerp(f, (float)j1, (float)k);
            float f2 = MathHelper.lerp(f, (float)k1, (float)l);
            float f3 = MathHelper.lerp(f, (float)l1, (float)i1);
            red = f1 / 255.0F;
            green = f2 / 255.0F;
            blue = f3 / 255.0F;

            if (lastWaterFogColor != j)
            {
                lastWaterFogColor = j;
                waterFogColor = MathHelper.floor(f1) << 16 | MathHelper.floor(f2) << 8 | MathHelper.floor(f3);
                waterFogUpdateTime = i;
            }
        }
        else if (ifluidstate.isTagged(FluidTags.LAVA))
        {
            red = 0.6F;
            green = 0.1F;
            blue = 0.0F;
            waterFogUpdateTime = -1L;
        }
        else
        {
            float f4 = 0.25F + 0.75F * (float)renderDistanceChunks / 32.0F;
            f4 = 1.0F - (float)Math.pow((double)f4, 0.25D);
            Vec3d vec3d = worldIn.getSkyColor(activeRenderInfoIn.getBlockPos(), partialTicks);
            vec3d = CustomColors.getWorldSkyColor(vec3d, worldIn, activeRenderInfoIn.getRenderViewEntity(), partialTicks);
            float f5 = (float)vec3d.x;
            float f8 = (float)vec3d.y;
            float f11 = (float)vec3d.z;
            Vec3d vec3d3 = worldIn.getFogColor(partialTicks);
            vec3d3 = CustomColors.getWorldFogColor(vec3d3, worldIn, activeRenderInfoIn.getRenderViewEntity(), partialTicks);
            red = (float)vec3d3.x;
            green = (float)vec3d3.y;
            blue = (float)vec3d3.z;

            if (renderDistanceChunks >= 4)
            {
                float f12 = MathHelper.sin(worldIn.getCelestialAngleRadians(partialTicks)) > 0.0F ? -1.0F : 1.0F;
                Vector3f vector3f = new Vector3f(f12, 0.0F, 0.0F);
                float f16 = activeRenderInfoIn.getViewVector().dot(vector3f);

                if (f16 < 0.0F)
                {
                    f16 = 0.0F;
                }

                if (f16 > 0.0F)
                {
                    float[] afloat = worldIn.dimension.calcSunriseSunsetColors(worldIn.getCelestialAngle(partialTicks), partialTicks);

                    if (afloat != null)
                    {
                        f16 = f16 * afloat[3];
                        red = red * (1.0F - f16) + afloat[0] * f16;
                        green = green * (1.0F - f16) + afloat[1] * f16;
                        blue = blue * (1.0F - f16) + afloat[2] * f16;
                    }
                }
            }

            red += (f5 - red) * f4;
            green += (f8 - green) * f4;
            blue += (f11 - blue) * f4;
            float f13 = worldIn.getRainStrength(partialTicks);

            if (f13 > 0.0F)
            {
                float f14 = 1.0F - f13 * 0.5F;
                float f17 = 1.0F - f13 * 0.4F;
                red *= f14;
                green *= f14;
                blue *= f17;
            }

            float f15 = worldIn.getThunderStrength(partialTicks);

            if (f15 > 0.0F)
            {
                float f18 = 1.0F - f15 * 0.5F;
                red *= f18;
                green *= f18;
                blue *= f18;
            }

            waterFogUpdateTime = -1L;
        }

        double d0 = activeRenderInfoIn.getProjectedView().y * worldIn.dimension.getVoidFogYFactor();

        if (activeRenderInfoIn.getRenderViewEntity() instanceof LivingEntity && ((LivingEntity)activeRenderInfoIn.getRenderViewEntity()).isPotionActive(Effects.BLINDNESS))
        {
            int i2 = ((LivingEntity)activeRenderInfoIn.getRenderViewEntity()).getActivePotionEffect(Effects.BLINDNESS).getDuration();

            if (i2 < 20)
            {
                d0 *= (double)(1.0F - (float)i2 / 20.0F);
            }
            else
            {
                d0 = 0.0D;
            }
        }

        if (d0 < 1.0D)
        {
            if (d0 < 0.0D)
            {
                d0 = 0.0D;
            }

            d0 = d0 * d0;
            red = (float)((double)red * d0);
            green = (float)((double)green * d0);
            blue = (float)((double)blue * d0);
        }

        if (bossColorModifier > 0.0F)
        {
            red = red * (1.0F - bossColorModifier) + red * 0.7F * bossColorModifier;
            green = green * (1.0F - bossColorModifier) + green * 0.6F * bossColorModifier;
            blue = blue * (1.0F - bossColorModifier) + blue * 0.6F * bossColorModifier;
        }

        if (ifluidstate.isTagged(FluidTags.WATER))
        {
            float f6 = 0.0F;

            if (activeRenderInfoIn.getRenderViewEntity() instanceof ClientPlayerEntity)
            {
                ClientPlayerEntity clientplayerentity = (ClientPlayerEntity)activeRenderInfoIn.getRenderViewEntity();
                f6 = clientplayerentity.getWaterBrightness();
            }

            float f9 = Math.min(1.0F / red, Math.min(1.0F / green, 1.0F / blue));

            if (Float.isInfinite(f9))
            {
                f9 = Math.nextAfter(f9, 0.0D);
            }

            red = red * (1.0F - f6) + red * f9 * f6;
            green = green * (1.0F - f6) + green * f9 * f6;
            blue = blue * (1.0F - f6) + blue * f9 * f6;
        }
        else if (activeRenderInfoIn.getRenderViewEntity() instanceof LivingEntity && ((LivingEntity)activeRenderInfoIn.getRenderViewEntity()).isPotionActive(Effects.NIGHT_VISION))
        {
            float f7 = GameRenderer.getNightVisionBrightness((LivingEntity)activeRenderInfoIn.getRenderViewEntity(), partialTicks);
            float f10 = Math.min(1.0F / red, Math.min(1.0F / green, 1.0F / blue));

            if (Float.isInfinite(f10))
            {
                f10 = Math.nextAfter(f10, 0.0D);
            }

            red = red * (1.0F - f7) + red * f10 * f7;
            green = green * (1.0F - f7) + green * f10 * f7;
            blue = blue * (1.0F - f7) + blue * f10 * f7;
        }

        if (ifluidstate.isTagged(FluidTags.WATER))
        {
            Entity entity = activeRenderInfoIn.getRenderViewEntity();
            Vec3d vec3d1 = CustomColors.getUnderwaterColor(worldIn, entity.getPosX(), entity.getPosY() + 1.0D, entity.getPosZ());

            if (vec3d1 != null)
            {
                red = (float)vec3d1.x;
                green = (float)vec3d1.y;
                blue = (float)vec3d1.z;
            }
        }
        else if (ifluidstate.isTagged(FluidTags.LAVA))
        {
            Entity entity1 = activeRenderInfoIn.getRenderViewEntity();
            Vec3d vec3d2 = CustomColors.getUnderlavaColor(worldIn, entity1.getPosX(), entity1.getPosY() + 1.0D, entity1.getPosZ());

            if (vec3d2 != null)
            {
                red = (float)vec3d2.x;
                green = (float)vec3d2.y;
                blue = (float)vec3d2.z;
            }
        }

        if (Reflector.EntityViewRenderEvent_FogColors_Constructor.exists())
        {
            Object object = Reflector.newInstance(Reflector.EntityViewRenderEvent_FogColors_Constructor, activeRenderInfoIn, partialTicks, red, green, blue);
            Reflector.postForgeBusEvent(object);
            red = Reflector.callFloat(object, Reflector.EntityViewRenderEvent_FogColors_getRed);
            green = Reflector.callFloat(object, Reflector.EntityViewRenderEvent_FogColors_getGreen);
            blue = Reflector.callFloat(object, Reflector.EntityViewRenderEvent_FogColors_getBlue);
        }

        Shaders.setClearColor(red, green, blue, 0.0F);
        RenderSystem.clearColor(red, green, blue, 0.0F);
    }

    public static void resetFog()
    {
        RenderSystem.fogDensity(0.0F);
        RenderSystem.fogMode(GlStateManager.FogMode.EXP2);
    }

    public static void setupFog(ActiveRenderInfo activeRenderInfoIn, FogRenderer.FogType fogTypeIn, float farPlaneDistance, boolean nearFog)
    {
        setupFog(activeRenderInfoIn, fogTypeIn, farPlaneDistance, nearFog, 0.0F);
    }

    public static void setupFog(ActiveRenderInfo p_setupFog_0_, FogRenderer.FogType p_setupFog_1_, float p_setupFog_2_, boolean p_setupFog_3_, float p_setupFog_4_)
    {
        fogStandard = false;
        IFluidState ifluidstate = p_setupFog_0_.getFluidState();
        Entity entity = p_setupFog_0_.getRenderViewEntity();
        boolean flag = ifluidstate.getFluid() != Fluids.EMPTY;
        float f = -1.0F;

        if (Reflector.ForgeHooksClient_getFogDensity.exists())
        {
            f = Reflector.callFloat(Reflector.ForgeHooksClient_getFogDensity, p_setupFog_1_, p_setupFog_0_, p_setupFog_4_, 0.1F);
        }

        if (f >= 0.0F)
        {
            GlStateManager.fogDensity(f);
        }
        else if (flag)
        {
            float f1 = 1.0F;

            if (ifluidstate.isTagged(FluidTags.WATER))
            {
                f1 = 0.05F;

                if (entity instanceof ClientPlayerEntity)
                {
                    ClientPlayerEntity clientplayerentity = (ClientPlayerEntity)entity;
                    f1 -= clientplayerentity.getWaterBrightness() * clientplayerentity.getWaterBrightness() * 0.03F;
                    Biome biome = clientplayerentity.world.getBiome(new BlockPos(clientplayerentity));

                    if (biome == Biomes.SWAMP || biome == Biomes.SWAMP_HILLS)
                    {
                        f1 += 0.005F;
                    }
                }
            }
            else if (ifluidstate.isTagged(FluidTags.LAVA))
            {
                f1 = 2.0F;
            }

            RenderSystem.fogDensity(f1);
            RenderSystem.fogMode(GlStateManager.FogMode.EXP2);
        }
        else
        {
            float f3;
            float f4;

            if (entity instanceof LivingEntity && ((LivingEntity)entity).isPotionActive(Effects.BLINDNESS))
            {
                int i = ((LivingEntity)entity).getActivePotionEffect(Effects.BLINDNESS).getDuration();
                float f2 = MathHelper.lerp(Math.min(1.0F, (float)i / 20.0F), p_setupFog_2_, 5.0F);

                if (p_setupFog_1_ == FogRenderer.FogType.FOG_SKY)
                {
                    f3 = 0.0F;
                    f4 = f2 * 0.8F;
                }
                else
                {
                    f3 = f2 * 0.25F;
                    f4 = f2;
                }
            }
            else if (p_setupFog_3_)
            {
                fogStandard = true;
                f3 = p_setupFog_2_ * 0.05F;
                f4 = Math.min(p_setupFog_2_, 192.0F) * 0.5F;
            }
            else if (p_setupFog_1_ == FogRenderer.FogType.FOG_SKY)
            {
                fogStandard = true;
                f3 = 0.0F;
                f4 = p_setupFog_2_;
            }
            else
            {
                fogStandard = true;
                f3 = p_setupFog_2_ * Config.getFogStart();
                f4 = p_setupFog_2_;
            }

            RenderSystem.fogStart(f3);
            RenderSystem.fogEnd(f4);
            RenderSystem.fogMode(GlStateManager.FogMode.LINEAR);
            RenderSystem.setupNvFogDistance();

            if (Reflector.ForgeHooksClient_onFogRender.exists())
            {
                Reflector.callVoid(Reflector.ForgeHooksClient_onFogRender, p_setupFog_1_, p_setupFog_0_, p_setupFog_4_, f4);
            }
        }
    }

    public static void applyFog()
    {
        RenderSystem.fog(2918, red, green, blue, 1.0F);

        if (Config.isShaders())
        {
            Shaders.setFogColor(red, green, blue);
        }
    }

    public static enum FogType
    {
        FOG_SKY,
        FOG_TERRAIN;
    }
}
