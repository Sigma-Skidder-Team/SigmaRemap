package net.minecraft.client.renderer;

import com.google.common.collect.ImmutableList;
import it.unimi.dsi.fastutil.Hash.Strategy;
import it.unimi.dsi.fastutil.objects.ObjectOpenCustomHashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import net.minecraft.client.renderer.tileentity.EndPortalTileEntityRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.renderer.vertex.VertexFormat;
import net.minecraft.util.ResourceLocation;
import net.optifine.Config;
import net.optifine.EmissiveTextures;
import net.optifine.RandomEntities;
import net.optifine.SmartAnimations;
import net.optifine.render.RenderUtils;
import net.optifine.shaders.Shaders;
import net.optifine.shaders.ShadersRender;
import net.optifine.util.CompareUtils;
import net.optifine.util.CompoundKey;

public abstract class RenderType extends RenderState
{
    private static final RenderType SOLID = makeType("solid", DefaultVertexFormats.BLOCK, 7, 2097152, true, false, RenderType.State.getBuilder().shadeModel(SHADE_ENABLED).lightmap(LIGHTMAP_ENABLED).texture(BLOCK_SHEET_MIPPED).build(true));
    private static final RenderType CUTOUT_MIPPED = makeType("cutout_mipped", DefaultVertexFormats.BLOCK, 7, 131072, true, false, RenderType.State.getBuilder().shadeModel(SHADE_ENABLED).lightmap(LIGHTMAP_ENABLED).texture(BLOCK_SHEET_MIPPED).alpha(CUTOUT_MIPPED_ALPHA).build(true));
    private static final RenderType CUTOUT = makeType("cutout", DefaultVertexFormats.BLOCK, 7, 131072, true, false, RenderType.State.getBuilder().shadeModel(SHADE_ENABLED).lightmap(LIGHTMAP_ENABLED).texture(BLOCK_SHEET).alpha(CUTOUT_MIPPED_ALPHA).build(true));
    private static final RenderType TRANSLUCENT = makeType("translucent", DefaultVertexFormats.BLOCK, 7, 262144, true, true, getTranslucentState());
    private static final RenderType TRANSLUCENT_NO_CRUMBLING = makeType("translucent_no_crumbling", DefaultVertexFormats.BLOCK, 7, 262144, false, true, getTranslucentState());
    private static final RenderType LEASH = makeType("leash", DefaultVertexFormats.POSITION_COLOR_LIGHTMAP, 7, 256, RenderType.State.getBuilder().texture(NO_TEXTURE).cull(CULL_DISABLED).lightmap(LIGHTMAP_ENABLED).build(false));
    private static final RenderType WATER_MASK = makeType("water_mask", DefaultVertexFormats.POSITION, 7, 256, RenderType.State.getBuilder().texture(NO_TEXTURE).writeMask(DEPTH_WRITE).build(false));
    private static final RenderType GLINT = makeType("glint", DefaultVertexFormats.POSITION_TEX, 7, 256, RenderType.State.getBuilder().texture(new RenderState.TextureState(ItemRenderer.RES_ITEM_GLINT, true, false)).writeMask(COLOR_WRITE).cull(CULL_DISABLED).depthTest(DEPTH_EQUAL).transparency(GLINT_TRANSPARENCY).texturing(GLINT_TEXTURING).build(false));
    private static final RenderType ENTITY_GLINT = makeType("entity_glint", DefaultVertexFormats.POSITION_TEX, 7, 256, RenderType.State.getBuilder().texture(new RenderState.TextureState(ItemRenderer.RES_ITEM_GLINT, true, false)).writeMask(COLOR_WRITE).cull(CULL_DISABLED).depthTest(DEPTH_EQUAL).transparency(GLINT_TRANSPARENCY).texturing(ENTITY_GLINT_TEXTURING).build(false));
    private static final RenderType LIGHTNING = makeType("lightning", DefaultVertexFormats.POSITION_COLOR, 7, 256, false, true, RenderType.State.getBuilder().writeMask(COLOR_WRITE).transparency(LIGHTNING_TRANSPARENCY).shadeModel(SHADE_ENABLED).build(false));
    public static final RenderType.Type LINES = makeType("lines", DefaultVertexFormats.POSITION_COLOR, 1, 256, RenderType.State.getBuilder().line(new RenderState.LineState(OptionalDouble.empty())).layer(PROJECTION_LAYERING).transparency(TRANSLUCENT_TRANSPARENCY).writeMask(COLOR_WRITE).build(false));
    private final VertexFormat vertexFormat;
    private final int drawMode;
    private final int bufferSize;
    private final boolean useDelegate;
    private final boolean needsSorting;
    private final Optional<RenderType> field_230166_ag_;
    private int id = -1;
    public static final RenderType[] CHUNK_RENDER_TYPES = getChunkRenderTypesArray();
    private static Map<CompoundKey, RenderType> RENDER_TYPES;

    public int ordinal()
    {
        return this.id;
    }

    public boolean isNeedsSorting()
    {
        return this.needsSorting;
    }

    private static RenderType[] getChunkRenderTypesArray()
    {
        RenderType[] arendertype = getBlockRenderTypes().toArray(new RenderType[0]);
        RenderType rendertype;

        for (int i = 0; i < arendertype.length; rendertype.id = i++)
        {
            rendertype = arendertype[i];
        }

        return arendertype;
    }

    public static RenderType getSolid()
    {
        return SOLID;
    }

    public static RenderType getCutoutMipped()
    {
        return CUTOUT_MIPPED;
    }

    public static RenderType getCutout()
    {
        return CUTOUT;
    }

    private static RenderType.State getTranslucentState()
    {
        return RenderType.State.getBuilder().shadeModel(SHADE_ENABLED).lightmap(LIGHTMAP_ENABLED).texture(BLOCK_SHEET_MIPPED).transparency(TRANSLUCENT_TRANSPARENCY).build(true);
    }

    public static RenderType getTranslucent()
    {
        return TRANSLUCENT;
    }

    public static RenderType getTranslucentNoCrumbling()
    {
        return TRANSLUCENT_NO_CRUMBLING;
    }

    public static RenderType getEntitySolid(ResourceLocation locationIn)
    {
        locationIn = getCustomTexture(locationIn);
        ResourceLocation resourcelocation = locationIn;
        return getRenderType("entity_solid", locationIn, () ->
        {
            RenderType.State rendertype$state = RenderType.State.getBuilder().texture(new RenderState.TextureState(resourcelocation, false, false)).transparency(NO_TRANSPARENCY).diffuseLighting(DIFFUSE_LIGHTING_ENABLED).lightmap(LIGHTMAP_ENABLED).overlay(OVERLAY_ENABLED).build(true);
            return makeType("entity_solid", DefaultVertexFormats.ENTITY, 7, 256, true, false, rendertype$state);
        });
    }

    public static RenderType getEntityCutout(ResourceLocation locationIn)
    {
        locationIn = getCustomTexture(locationIn);
        ResourceLocation resourcelocation = locationIn;
        return getRenderType("entity_cutout", locationIn, () ->
        {
            RenderType.State rendertype$state = RenderType.State.getBuilder().texture(new RenderState.TextureState(resourcelocation, false, false)).transparency(NO_TRANSPARENCY).diffuseLighting(DIFFUSE_LIGHTING_ENABLED).alpha(DEFAULT_ALPHA).lightmap(LIGHTMAP_ENABLED).overlay(OVERLAY_ENABLED).build(true);
            return makeType("entity_cutout", DefaultVertexFormats.ENTITY, 7, 256, true, false, rendertype$state);
        });
    }

    public static RenderType func_230167_a_(ResourceLocation p_230167_0_, boolean p_230167_1_)
    {
        p_230167_0_ = getCustomTexture(p_230167_0_);
        ResourceLocation resourcelocation = p_230167_0_;
        return getRenderType("entity_cutout_no_cull", p_230167_0_, p_230167_1_, () ->
        {
            RenderType.State rendertype$state = RenderType.State.getBuilder().texture(new RenderState.TextureState(resourcelocation, false, false)).transparency(NO_TRANSPARENCY).diffuseLighting(DIFFUSE_LIGHTING_ENABLED).alpha(DEFAULT_ALPHA).cull(CULL_DISABLED).lightmap(LIGHTMAP_ENABLED).overlay(OVERLAY_ENABLED).build(p_230167_1_);
            return makeType("entity_cutout_no_cull", DefaultVertexFormats.ENTITY, 7, 256, true, false, rendertype$state);
        });
    }

    public static RenderType getEntityCutoutNoCull(ResourceLocation locationIn)
    {
        return func_230167_a_(locationIn, true);
    }

    public static RenderType getEntityTranslucentCull(ResourceLocation locationIn)
    {
        locationIn = getCustomTexture(locationIn);
        ResourceLocation resourcelocation = locationIn;
        return getRenderType("entity_translucent_cull", locationIn, () ->
        {
            RenderType.State rendertype$state = RenderType.State.getBuilder().texture(new RenderState.TextureState(resourcelocation, false, false)).transparency(TRANSLUCENT_TRANSPARENCY).diffuseLighting(DIFFUSE_LIGHTING_ENABLED).alpha(DEFAULT_ALPHA).lightmap(LIGHTMAP_ENABLED).overlay(OVERLAY_ENABLED).build(true);
            return makeType("entity_translucent_cull", DefaultVertexFormats.ENTITY, 7, 256, true, true, rendertype$state);
        });
    }

    public static RenderType func_230168_b_(ResourceLocation p_230168_0_, boolean p_230168_1_)
    {
        p_230168_0_ = getCustomTexture(p_230168_0_);
        ResourceLocation resourcelocation = p_230168_0_;
        return getRenderType("entity_translucent", p_230168_0_, p_230168_1_, () ->
        {
            RenderType.State rendertype$state = RenderType.State.getBuilder().texture(new RenderState.TextureState(resourcelocation, false, false)).transparency(TRANSLUCENT_TRANSPARENCY).diffuseLighting(DIFFUSE_LIGHTING_ENABLED).alpha(DEFAULT_ALPHA).cull(CULL_DISABLED).lightmap(LIGHTMAP_ENABLED).overlay(OVERLAY_ENABLED).build(p_230168_1_);
            return makeType("entity_translucent", DefaultVertexFormats.ENTITY, 7, 256, true, true, rendertype$state);
        });
    }

    public static RenderType getEntityTranslucent(ResourceLocation locationIn)
    {
        return func_230168_b_(locationIn, true);
    }

    public static RenderType getEntitySmoothCutout(ResourceLocation locationIn)
    {
        locationIn = getCustomTexture(locationIn);
        ResourceLocation resourcelocation = locationIn;
        return getRenderType("entity_smooth_cutout", locationIn, () ->
        {
            RenderType.State rendertype$state = RenderType.State.getBuilder().texture(new RenderState.TextureState(resourcelocation, false, false)).alpha(HALF_ALPHA).diffuseLighting(DIFFUSE_LIGHTING_ENABLED).shadeModel(SHADE_ENABLED).cull(CULL_DISABLED).lightmap(LIGHTMAP_ENABLED).build(true);
            return makeType("entity_smooth_cutout", DefaultVertexFormats.ENTITY, 7, 256, rendertype$state);
        });
    }

    public static RenderType getBeaconBeam(ResourceLocation locationIn, boolean colorFlagIn)
    {
        locationIn = getCustomTexture(locationIn);
        ResourceLocation resourcelocation = locationIn;
        return getRenderType("beacon_beam", locationIn, colorFlagIn, () ->
        {
            RenderType.State rendertype$state = RenderType.State.getBuilder().texture(new RenderState.TextureState(resourcelocation, false, false)).transparency(colorFlagIn ? TRANSLUCENT_TRANSPARENCY : NO_TRANSPARENCY).writeMask(colorFlagIn ? COLOR_WRITE : COLOR_DEPTH_WRITE).fog(NO_FOG).build(false);
            return makeType("beacon_beam", DefaultVertexFormats.BLOCK, 7, 256, false, true, rendertype$state);
        });
    }

    public static RenderType getEntityDecal(ResourceLocation locationIn)
    {
        locationIn = getCustomTexture(locationIn);
        ResourceLocation resourcelocation = locationIn;
        return getRenderType("entity_decal", locationIn, () ->
        {
            RenderType.State rendertype$state = RenderType.State.getBuilder().texture(new RenderState.TextureState(resourcelocation, false, false)).diffuseLighting(DIFFUSE_LIGHTING_ENABLED).alpha(DEFAULT_ALPHA).depthTest(DEPTH_EQUAL).cull(CULL_DISABLED).lightmap(LIGHTMAP_ENABLED).overlay(OVERLAY_ENABLED).build(false);
            return makeType("entity_decal", DefaultVertexFormats.ENTITY, 7, 256, rendertype$state);
        });
    }

    public static RenderType getEntityNoOutline(ResourceLocation locationIn)
    {
        locationIn = getCustomTexture(locationIn);
        ResourceLocation resourcelocation = locationIn;
        return getRenderType("entity_no_outline", locationIn, () ->
        {
            RenderType.State rendertype$state = RenderType.State.getBuilder().texture(new RenderState.TextureState(resourcelocation, false, false)).transparency(TRANSLUCENT_TRANSPARENCY).diffuseLighting(DIFFUSE_LIGHTING_ENABLED).alpha(DEFAULT_ALPHA).cull(CULL_DISABLED).lightmap(LIGHTMAP_ENABLED).overlay(OVERLAY_ENABLED).writeMask(COLOR_WRITE).build(false);
            return makeType("entity_no_outline", DefaultVertexFormats.ENTITY, 7, 256, false, true, rendertype$state);
        });
    }

    public static RenderType getEntityAlpha(ResourceLocation locationIn, float alphaIn)
    {
        locationIn = getCustomTexture(locationIn);
        ResourceLocation resourcelocation = locationIn;
        return getRenderType("entity_alpha", locationIn, alphaIn, () ->
        {
            RenderType.State rendertype$state = RenderType.State.getBuilder().texture(new RenderState.TextureState(resourcelocation, false, false)).alpha(new RenderState.AlphaState(alphaIn)).cull(CULL_DISABLED).build(true);
            return makeType("entity_alpha", DefaultVertexFormats.ENTITY, 7, 256, rendertype$state);
        });
    }

    public static RenderType getEyes(ResourceLocation locationIn)
    {
        locationIn = getCustomTexture(locationIn);
        ResourceLocation resourcelocation = locationIn;
        return getRenderType("eyes", locationIn, () ->
        {
            RenderState.TextureState renderstate$texturestate = new RenderState.TextureState(resourcelocation, false, false);
            return makeType("eyes", DefaultVertexFormats.ENTITY, 7, 256, false, true, RenderType.State.getBuilder().texture(renderstate$texturestate).transparency(ADDITIVE_TRANSPARENCY).writeMask(COLOR_WRITE).fog(BLACK_FOG).build(false));
        });
    }

    public static RenderType getEnergySwirl(ResourceLocation locationIn, float uIn, float vIn)
    {
        locationIn = getCustomTexture(locationIn);
        ResourceLocation resourcelocation = locationIn;
        return getRenderType("energy_swirl", locationIn, uIn, vIn, () ->
        {
            return makeType("energy_swirl", DefaultVertexFormats.ENTITY, 7, 256, false, true, RenderType.State.getBuilder().texture(new RenderState.TextureState(resourcelocation, false, false)).texturing(new RenderState.OffsetTexturingState(uIn, vIn)).fog(BLACK_FOG).transparency(ADDITIVE_TRANSPARENCY).diffuseLighting(DIFFUSE_LIGHTING_ENABLED).alpha(DEFAULT_ALPHA).cull(CULL_DISABLED).lightmap(LIGHTMAP_ENABLED).overlay(OVERLAY_ENABLED).build(false));
        });
    }

    public static RenderType getLeash()
    {
        return LEASH;
    }

    public static RenderType getWaterMask()
    {
        return WATER_MASK;
    }

    public static RenderType getOutline(ResourceLocation locationIn)
    {
        return getRenderType("outline", locationIn, () ->
        {
            return makeType("outline", DefaultVertexFormats.POSITION_COLOR_TEX, 7, 256, RenderType.State.getBuilder().texture(new RenderState.TextureState(locationIn, false, false)).cull(CULL_DISABLED).depthTest(DEPTH_ALWAYS).alpha(DEFAULT_ALPHA).texturing(OUTLINE_TEXTURING).fog(NO_FOG).target(OUTLINE_TARGET).func_230173_a_(RenderType.OutlineState.IS_OUTLINE));
        });
    }

    public static RenderType getGlint()
    {
        return GLINT;
    }

    public static RenderType getEntityGlint()
    {
        return ENTITY_GLINT;
    }

    public static RenderType getCrumbling(ResourceLocation locationIn)
    {
        return getRenderType("crumbling", locationIn, () ->
        {
            RenderState.TextureState renderstate$texturestate = new RenderState.TextureState(locationIn, false, false);
            return makeType("crumbling", DefaultVertexFormats.BLOCK, 7, 256, false, true, RenderType.State.getBuilder().texture(renderstate$texturestate).alpha(DEFAULT_ALPHA).transparency(CRUMBLING_TRANSPARENCY).writeMask(COLOR_WRITE).layer(POLYGON_OFFSET_LAYERING).build(false));
        });
    }

    public static RenderType getText(ResourceLocation locationIn)
    {
        return getRenderType("text", locationIn, () ->
        {
            return makeType("text", DefaultVertexFormats.POSITION_COLOR_TEX_LIGHTMAP, 7, 256, false, true, RenderType.State.getBuilder().texture(new RenderState.TextureState(locationIn, false, false)).alpha(DEFAULT_ALPHA).transparency(TRANSLUCENT_TRANSPARENCY).lightmap(LIGHTMAP_ENABLED).build(false));
        });
    }

    public static RenderType getTextSeeThrough(ResourceLocation locationIn)
    {
        return getRenderType("text_see_through", locationIn, () ->
        {
            return makeType("text_see_through", DefaultVertexFormats.POSITION_COLOR_TEX_LIGHTMAP, 7, 256, false, true, RenderType.State.getBuilder().texture(new RenderState.TextureState(locationIn, false, false)).alpha(DEFAULT_ALPHA).transparency(TRANSLUCENT_TRANSPARENCY).lightmap(LIGHTMAP_ENABLED).depthTest(DEPTH_ALWAYS).writeMask(COLOR_WRITE).build(false));
        });
    }

    public static RenderType getLightning()
    {
        return LIGHTNING;
    }

    public static RenderType getEndPortal(int iterationIn)
    {
        return getRenderType("end_portal", iterationIn, () ->
        {
            RenderState.TransparencyState renderstate$transparencystate;
            RenderState.TextureState renderstate$texturestate;

            if (iterationIn <= 1)
            {
                renderstate$transparencystate = TRANSLUCENT_TRANSPARENCY;
                renderstate$texturestate = new RenderState.TextureState(EndPortalTileEntityRenderer.END_SKY_TEXTURE, false, false);
            }
            else {
                renderstate$transparencystate = ADDITIVE_TRANSPARENCY;
                renderstate$texturestate = new RenderState.TextureState(EndPortalTileEntityRenderer.END_PORTAL_TEXTURE, false, false);
            }

            return makeType("end_portal", DefaultVertexFormats.POSITION_COLOR, 7, 256, false, true, RenderType.State.getBuilder().transparency(renderstate$transparencystate).texture(renderstate$texturestate).texturing(new RenderState.PortalTexturingState(iterationIn)).fog(BLACK_FOG).build(false));
        });
    }

    public static RenderType getLines()
    {
        return LINES;
    }

    public RenderType(String p_i24_1_, VertexFormat p_i24_2_, int p_i24_3_, int p_i24_4_, boolean p_i24_5_, boolean p_i24_6_, Runnable p_i24_7_, Runnable p_i24_8_)
    {
        super(p_i24_1_, p_i24_7_, p_i24_8_);
        this.vertexFormat = p_i24_2_;
        this.drawMode = p_i24_3_;
        this.bufferSize = p_i24_4_;
        this.useDelegate = p_i24_5_;
        this.needsSorting = p_i24_6_;
        this.field_230166_ag_ = Optional.of(this);
    }

    public static RenderType.Type makeType(String p_228632_0_, VertexFormat p_228632_1_, int p_228632_2_, int p_228632_3_, RenderType.State p_228632_4_)
    {
        return makeType(p_228632_0_, p_228632_1_, p_228632_2_, p_228632_3_, false, false, p_228632_4_);
    }

    public static RenderType.Type makeType(String name, VertexFormat vertexFormatIn, int glMode, int p_228633_3_, boolean p_228633_4_, boolean p_228633_5_, RenderType.State p_228633_6_)
    {
        return RenderType.Type.getOrCreate(name, vertexFormatIn, glMode, p_228633_3_, p_228633_4_, p_228633_5_, p_228633_6_);
    }

    public void finish(BufferBuilder p_228631_1_, int p_228631_2_, int p_228631_3_, int p_228631_4_)
    {
        if (p_228631_1_.isDrawing())
        {
            if (this.needsSorting)
            {
                p_228631_1_.sortVertexData((float)p_228631_2_, (float)p_228631_3_, (float)p_228631_4_);
            }

            if (p_228631_1_.animatedSprites != null)
            {
                SmartAnimations.spritesRendered(p_228631_1_.animatedSprites);
            }

            p_228631_1_.finishDrawing();
            this.setupRenderState();

            if (Config.isShaders())
            {
                RenderUtils.setFlushRenderBuffers(false);
                Shaders.pushProgram();
                ShadersRender.preRender(this, p_228631_1_);
            }

            WorldVertexBufferUploader.draw(p_228631_1_);

            if (Config.isShaders())
            {
                ShadersRender.postRender(this, p_228631_1_);
                Shaders.popProgram();
                RenderUtils.setFlushRenderBuffers(true);
            }

            this.clearRenderState();
        }
    }

    public String toString()
    {
        return this.name;
    }

    public static List<RenderType> getBlockRenderTypes()
    {
        return ImmutableList.of(getSolid(), getCutoutMipped(), getCutout(), getTranslucent());
    }

    public int getBufferSize()
    {
        return this.bufferSize;
    }

    public VertexFormat getVertexFormat()
    {
        return this.vertexFormat;
    }

    public int getDrawMode()
    {
        return this.drawMode;
    }

    public Optional<RenderType> getOutline()
    {
        return Optional.empty();
    }

    public boolean func_230041_s_()
    {
        return false;
    }

    public boolean isUseDelegate()
    {
        return this.useDelegate;
    }

    public Optional<RenderType> func_230169_u_()
    {
        return this.field_230166_ag_;
    }

    private static RenderType getRenderType(String p_getRenderType_0_, ResourceLocation p_getRenderType_1_, Supplier<RenderType> p_getRenderType_2_)
    {
        CompoundKey compoundkey = new CompoundKey(p_getRenderType_0_, p_getRenderType_1_);
        return getRenderType(compoundkey, p_getRenderType_2_);
    }

    private static RenderType getRenderType(String p_getRenderType_0_, ResourceLocation p_getRenderType_1_, boolean p_getRenderType_2_, Supplier<RenderType> p_getRenderType_3_)
    {
        CompoundKey compoundkey = new CompoundKey(p_getRenderType_0_, p_getRenderType_1_, p_getRenderType_2_);
        return getRenderType(compoundkey, p_getRenderType_3_);
    }

    private static RenderType getRenderType(String p_getRenderType_0_, ResourceLocation p_getRenderType_1_, float p_getRenderType_2_, Supplier<RenderType> p_getRenderType_3_)
    {
        CompoundKey compoundkey = new CompoundKey(p_getRenderType_0_, p_getRenderType_1_, p_getRenderType_2_);
        return getRenderType(compoundkey, p_getRenderType_3_);
    }

    private static RenderType getRenderType(String p_getRenderType_0_, ResourceLocation p_getRenderType_1_, float p_getRenderType_2_, float p_getRenderType_3_, Supplier<RenderType> p_getRenderType_4_)
    {
        CompoundKey compoundkey = new CompoundKey(p_getRenderType_0_, p_getRenderType_1_, p_getRenderType_2_, p_getRenderType_3_);
        return getRenderType(compoundkey, p_getRenderType_4_);
    }

    private static RenderType getRenderType(String p_getRenderType_0_, int p_getRenderType_1_, Supplier<RenderType> p_getRenderType_2_)
    {
        CompoundKey compoundkey = new CompoundKey(p_getRenderType_0_, p_getRenderType_1_);
        return getRenderType(compoundkey, p_getRenderType_2_);
    }

    private static RenderType getRenderType(CompoundKey p_getRenderType_0_, Supplier<RenderType> p_getRenderType_1_)
    {
        if (RENDER_TYPES == null)
        {
            RENDER_TYPES = new HashMap<>();
        }

        RenderType rendertype = RENDER_TYPES.get(p_getRenderType_0_);

        if (rendertype != null)
        {
            return rendertype;
        }
        else
        {
            rendertype = p_getRenderType_1_.get();
            RENDER_TYPES.put(p_getRenderType_0_, rendertype);
            return rendertype;
        }
    }

    private static ResourceLocation getCustomTexture(ResourceLocation p_getCustomTexture_0_)
    {
        if (Config.isRandomEntities())
        {
            p_getCustomTexture_0_ = RandomEntities.getTextureLocation(p_getCustomTexture_0_);
        }

        if (EmissiveTextures.isActive())
        {
            p_getCustomTexture_0_ = EmissiveTextures.getEmissiveTexture(p_getCustomTexture_0_);
        }

        return p_getCustomTexture_0_;
    }

    public boolean isEntitySolid()
    {
        return this.getName().equals("entity_solid");
    }

    static enum OutlineState
    {
        NONE,
        IS_OUTLINE,
        AFFECTS_OUTLINE;
    }

    public static final class State
    {
        private final RenderState.TextureState texture;
        private final RenderState.TransparencyState transparency;
        private final RenderState.DiffuseLightingState diffuseLighting;
        private final RenderState.ShadeModelState shadowModel;
        private final RenderState.AlphaState alpha;
        private final RenderState.DepthTestState depthTest;
        private final RenderState.CullState cull;
        private final RenderState.LightmapState lightmap;
        private final RenderState.OverlayState overlay;
        private final RenderState.FogState fog;
        private final RenderState.LayerState layer;
        private final RenderState.TargetState target;
        private final RenderState.TexturingState texturing;
        private final RenderState.WriteMaskState writeMask;
        private final RenderState.LineState line;
        private final RenderType.OutlineState field_230171_p_;
        private final ImmutableList<RenderState> renderStates;

        private State(RenderState.TextureState p_i237_1_, RenderState.TransparencyState p_i237_2_, RenderState.DiffuseLightingState p_i237_3_, RenderState.ShadeModelState p_i237_4_, RenderState.AlphaState p_i237_5_, RenderState.DepthTestState p_i237_6_, RenderState.CullState p_i237_7_, RenderState.LightmapState p_i237_8_, RenderState.OverlayState p_i237_9_, RenderState.FogState p_i237_10_, RenderState.LayerState p_i237_11_, RenderState.TargetState p_i237_12_, RenderState.TexturingState p_i237_13_, RenderState.WriteMaskState p_i237_14_, RenderState.LineState p_i237_15_, RenderType.OutlineState p_i237_16_)
        {
            this.texture = p_i237_1_;
            this.transparency = p_i237_2_;
            this.diffuseLighting = p_i237_3_;
            this.shadowModel = p_i237_4_;
            this.alpha = p_i237_5_;
            this.depthTest = p_i237_6_;
            this.cull = p_i237_7_;
            this.lightmap = p_i237_8_;
            this.overlay = p_i237_9_;
            this.fog = p_i237_10_;
            this.layer = p_i237_11_;
            this.target = p_i237_12_;
            this.texturing = p_i237_13_;
            this.writeMask = p_i237_14_;
            this.line = p_i237_15_;
            this.field_230171_p_ = p_i237_16_;
            this.renderStates = ImmutableList.of(this.texture, this.transparency, this.diffuseLighting, this.shadowModel, this.alpha, this.depthTest, this.cull, this.lightmap, this.overlay, this.fog, this.layer, this.target, this.texturing, this.writeMask, this.line);
        }

        public boolean equals(Object p_equals_1_)
        {
            if (this == p_equals_1_)
            {
                return true;
            }
            else if (p_equals_1_ != null && this.getClass() == p_equals_1_.getClass())
            {
                RenderType.State rendertype$state = (RenderType.State)p_equals_1_;
                return this.field_230171_p_ == rendertype$state.field_230171_p_ && this.renderStates.equals(rendertype$state.renderStates);
            }
            else
            {
                return false;
            }
        }

        public int hashCode()
        {
            return CompareUtils.hash(this.renderStates, this.field_230171_p_);
        }

        public static RenderType.State.Builder getBuilder()
        {
            return new RenderType.State.Builder();
        }

        public RenderType.State.Builder getCopyBuilder()
        {
            RenderType.State.Builder rendertype$state$builder = new RenderType.State.Builder();
            rendertype$state$builder.texture(this.texture);
            rendertype$state$builder.transparency(this.transparency);
            rendertype$state$builder.diffuseLighting(this.diffuseLighting);
            rendertype$state$builder.shadeModel(this.shadowModel);
            rendertype$state$builder.alpha(this.alpha);
            rendertype$state$builder.depthTest(this.depthTest);
            rendertype$state$builder.cull(this.cull);
            rendertype$state$builder.lightmap(this.lightmap);
            rendertype$state$builder.overlay(this.overlay);
            rendertype$state$builder.fog(this.fog);
            rendertype$state$builder.layer(this.layer);
            rendertype$state$builder.target(this.target);
            rendertype$state$builder.texturing(this.texturing);
            rendertype$state$builder.writeMask(this.writeMask);
            rendertype$state$builder.line(this.line);
            return rendertype$state$builder;
        }

        public static class Builder
        {
            private RenderState.TextureState texture = RenderState.NO_TEXTURE;
            private RenderState.TransparencyState transparency = RenderState.NO_TRANSPARENCY;
            private RenderState.DiffuseLightingState diffuseLighting = RenderState.DIFFUSE_LIGHTING_DISABLED;
            private RenderState.ShadeModelState shadeModel = RenderState.SHADE_DISABLED;
            private RenderState.AlphaState alpha = RenderState.ZERO_ALPHA;
            private RenderState.DepthTestState depthTest = RenderState.DEPTH_LEQUAL;
            private RenderState.CullState cull = RenderState.CULL_ENABLED;
            private RenderState.LightmapState lightmap = RenderState.LIGHTMAP_DISABLED;
            private RenderState.OverlayState overlay = RenderState.OVERLAY_DISABLED;
            private RenderState.FogState fog = RenderState.FOG;
            private RenderState.LayerState layer = RenderState.NO_LAYERING;
            private RenderState.TargetState target = RenderState.MAIN_TARGET;
            private RenderState.TexturingState texturing = RenderState.DEFAULT_TEXTURING;
            private RenderState.WriteMaskState writeMask = RenderState.COLOR_DEPTH_WRITE;
            private RenderState.LineState line = RenderState.DEFAULT_LINE;

            private Builder()
            {
            }

            public RenderType.State.Builder texture(RenderState.TextureState p_228724_1_)
            {
                this.texture = p_228724_1_;
                return this;
            }

            public RenderType.State.Builder transparency(RenderState.TransparencyState p_228726_1_)
            {
                this.transparency = p_228726_1_;
                return this;
            }

            public RenderType.State.Builder diffuseLighting(RenderState.DiffuseLightingState p_228716_1_)
            {
                this.diffuseLighting = p_228716_1_;
                return this;
            }

            public RenderType.State.Builder shadeModel(RenderState.ShadeModelState p_228723_1_)
            {
                this.shadeModel = p_228723_1_;
                return this;
            }

            public RenderType.State.Builder alpha(RenderState.AlphaState p_228713_1_)
            {
                this.alpha = p_228713_1_;
                return this;
            }

            public RenderType.State.Builder depthTest(RenderState.DepthTestState p_228715_1_)
            {
                this.depthTest = p_228715_1_;
                return this;
            }

            public RenderType.State.Builder cull(RenderState.CullState p_228714_1_)
            {
                this.cull = p_228714_1_;
                return this;
            }

            public RenderType.State.Builder lightmap(RenderState.LightmapState p_228719_1_)
            {
                this.lightmap = p_228719_1_;
                return this;
            }

            public RenderType.State.Builder overlay(RenderState.OverlayState p_228722_1_)
            {
                this.overlay = p_228722_1_;
                return this;
            }

            public RenderType.State.Builder fog(RenderState.FogState p_228717_1_)
            {
                this.fog = p_228717_1_;
                return this;
            }

            public RenderType.State.Builder layer(RenderState.LayerState p_228718_1_)
            {
                this.layer = p_228718_1_;
                return this;
            }

            public RenderType.State.Builder target(RenderState.TargetState p_228721_1_)
            {
                this.target = p_228721_1_;
                return this;
            }

            public RenderType.State.Builder texturing(RenderState.TexturingState p_228725_1_)
            {
                this.texturing = p_228725_1_;
                return this;
            }

            public RenderType.State.Builder writeMask(RenderState.WriteMaskState p_228727_1_)
            {
                this.writeMask = p_228727_1_;
                return this;
            }

            public RenderType.State.Builder line(RenderState.LineState p_228720_1_)
            {
                this.line = p_228720_1_;
                return this;
            }

            public RenderType.State build(boolean outlineIn)
            {
                return this.func_230173_a_(outlineIn ? RenderType.OutlineState.AFFECTS_OUTLINE : RenderType.OutlineState.NONE);
            }

            public RenderType.State func_230173_a_(RenderType.OutlineState p_230173_1_)
            {
                return new RenderType.State(this.texture, this.transparency, this.diffuseLighting, this.shadeModel, this.alpha, this.depthTest, this.cull, this.lightmap, this.overlay, this.fog, this.layer, this.target, this.texturing, this.writeMask, this.line, p_230173_1_);
            }
        }
    }

    static final class Type extends RenderType
    {
        private static final ObjectOpenCustomHashSet<RenderType.Type> TYPES = new ObjectOpenCustomHashSet<>(RenderType.Type.EqualityStrategy.INSTANCE);
        private final RenderType.State renderState;
        private final int hashCode;
        private final Optional<RenderType> outlineRenderType;
        private final boolean field_230170_V_;
        private Map<ResourceLocation, RenderType.Type> mapTextured = new HashMap<>();

        private Type(String p_i186_1_, VertexFormat p_i186_2_, int p_i186_3_, int p_i186_4_, boolean p_i186_5_, boolean p_i186_6_, RenderType.State p_i186_7_)
        {
            super(p_i186_1_, p_i186_2_, p_i186_3_, p_i186_4_, p_i186_5_, p_i186_6_, () ->
            {
                p_i186_7_.renderStates.forEach(RenderState::setupRenderState);
            }, () ->
            {
                p_i186_7_.renderStates.forEach(RenderState::clearRenderState);
            });
            this.renderState = p_i186_7_;
            this.outlineRenderType = p_i186_7_.field_230171_p_ == RenderType.OutlineState.AFFECTS_OUTLINE ? p_i186_7_.texture.func_228606_c_().map(RenderType::getOutline) : Optional.empty();
            this.field_230170_V_ = p_i186_7_.field_230171_p_ == RenderType.OutlineState.IS_OUTLINE;
            this.hashCode = CompareUtils.hash(super.hashCode(), p_i186_7_);
        }

        private static RenderType.Type getOrCreate(String p_228676_0_, VertexFormat p_228676_1_, int p_228676_2_, int p_228676_3_, boolean p_228676_4_, boolean p_228676_5_, RenderType.State p_228676_6_)
        {
            return TYPES.addOrGet(new RenderType.Type(p_228676_0_, p_228676_1_, p_228676_2_, p_228676_3_, p_228676_4_, p_228676_5_, p_228676_6_));
        }

        public Optional<RenderType> getOutline()
        {
            return this.outlineRenderType;
        }

        public boolean func_230041_s_()
        {
            return this.field_230170_V_;
        }

        public boolean equals(@Nullable Object p_equals_1_)
        {
            return this == p_equals_1_;
        }

        public int hashCode()
        {
            return this.hashCode;
        }

        public RenderType.Type getTextured(ResourceLocation p_getTextured_1_)
        {
            if (p_getTextured_1_ == null)
            {
                return this;
            }
            else
            {
                Optional<ResourceLocation> optional = this.renderState.texture.func_228606_c_();

                if (!optional.isPresent())
                {
                    return this;
                }
                else
                {
                    ResourceLocation resourcelocation = optional.get();

                    if (resourcelocation == null)
                    {
                        return this;
                    }
                    else if (p_getTextured_1_.equals(resourcelocation))
                    {
                        return this;
                    }
                    else
                    {
                        RenderType.Type rendertype$type = this.mapTextured.get(p_getTextured_1_);

                        if (rendertype$type == null)
                        {
                            RenderType.State.Builder rendertype$state$builder = this.renderState.getCopyBuilder();
                            rendertype$state$builder.texture(new RenderState.TextureState(p_getTextured_1_, this.renderState.texture.isBlur(), this.renderState.texture.isMipmap()));
                            RenderType.State rendertype$state = rendertype$state$builder.build(this.field_230170_V_);
                            rendertype$type = makeType(this.name, this.getVertexFormat(), this.getDrawMode(), this.getBufferSize(), this.isUseDelegate(), this.isNeedsSorting(), rendertype$state);
                            this.mapTextured.put(p_getTextured_1_, rendertype$type);
                        }

                        return rendertype$type;
                    }
                }
            }
        }

        public String toString()
        {
            return "" + this.name + ", " + this.renderState.texture.func_228606_c_();
        }

        static enum EqualityStrategy implements Strategy<RenderType.Type>
        {
            INSTANCE;

            public int hashCode(@Nullable RenderType.Type p_hashCode_1_)
            {
                return p_hashCode_1_ == null ? 0 : p_hashCode_1_.hashCode;
            }

            public boolean equals(@Nullable RenderType.Type p_equals_1_, @Nullable RenderType.Type p_equals_2_)
            {
                if (p_equals_1_ == p_equals_2_)
                {
                    return true;
                }
                else
                {
                    return p_equals_1_ != null && p_equals_2_ != null ? Objects.equals(p_equals_1_.renderState, p_equals_2_.renderState) : false;
                }
            }
        }
    }
}
