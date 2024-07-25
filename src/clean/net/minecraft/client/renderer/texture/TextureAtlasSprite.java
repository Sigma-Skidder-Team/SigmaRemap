package net.minecraft.client.renderer.texture;

import com.google.common.collect.Lists;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.datafixers.util.Pair;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.SpriteAwareVertexBuilder;
import net.minecraft.client.resources.data.AnimationFrame;
import net.minecraft.client.resources.data.AnimationMetadataSection;
import net.minecraft.crash.CrashReport;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.crash.ReportedException;
import net.minecraft.resources.IResource;
import net.minecraft.resources.IResourceManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.extensions.IForgeTextureAtlasSprite;
import net.optifine.Config;
import net.optifine.SmartAnimations;
import net.optifine.shaders.Shaders;
import net.optifine.util.CounterInt;
import net.optifine.util.TextureUtils;

public class TextureAtlasSprite implements AutoCloseable, IForgeTextureAtlasSprite
{
    private final AtlasTexture atlasTexture;
    private final TextureAtlasSprite.Info spriteInfo;
    private final AnimationMetadataSection animationMetadata;
    protected final NativeImage[] frames;
    private final int[] framesX;
    private final int[] framesY;
    @Nullable
    private final TextureAtlasSprite.InterpolationData interpolationData;
    private final int x;
    private final int y;
    private final float minU;
    private final float maxU;
    private final float minV;
    private final float maxV;
    private int frameCounter;
    private int tickCounter;
    private int indexInMap = -1;
    public float baseU;
    public float baseV;
    public int sheetWidth;
    public int sheetHeight;
    public int glSpriteTextureId = -1;
    public TextureAtlasSprite spriteSingle = null;
    public boolean isSpriteSingle = false;
    public static final String SUFFIX_SPRITE_SINGLE = ".sprite_single";
    public int mipmapLevels = 0;
    public TextureAtlasSprite spriteNormal = null;
    public TextureAtlasSprite spriteSpecular = null;
    public boolean isSpriteShaders = false;
    public TextureAtlasSprite spriteEmissive = null;
    public boolean isSpriteEmissive = false;
    private int animationIndex = -1;
    private boolean animationActive = false;
    private boolean terrain;
    private boolean shaders;
    private boolean multiTexture;
    private IResourceManager resourceManager;

    public TextureAtlasSprite(ResourceLocation p_i242109_1_)
    {
        this.atlasTexture = null;
        this.spriteInfo = new TextureAtlasSprite.Info(p_i242109_1_, 0, 0, (AnimationMetadataSection)null);
        this.animationMetadata = null;
        this.frames = null;
        this.framesX = new int[0];
        this.framesY = new int[0];
        this.interpolationData = null;
        this.x = 0;
        this.y = 0;
        this.minU = 0.0F;
        this.maxU = 0.0F;
        this.minV = 0.0F;
        this.maxV = 0.0F;
    }

    private TextureAtlasSprite(TextureAtlasSprite p_i242110_1_)
    {
        this.atlasTexture = p_i242110_1_.atlasTexture;
        TextureAtlasSprite.Info textureatlassprite$info = p_i242110_1_.spriteInfo;
        ResourceLocation resourcelocation = textureatlassprite$info.getSpriteLocation();
        ResourceLocation resourcelocation1 = new ResourceLocation(resourcelocation.getNamespace(), resourcelocation.getPath() + ".sprite_single");
        int i = textureatlassprite$info.getSpriteWidth();
        int j = textureatlassprite$info.getSpriteHeight();
        AnimationMetadataSection animationmetadatasection = textureatlassprite$info.getSpriteAnimationMetadata();
        this.spriteInfo = new TextureAtlasSprite.Info(resourcelocation1, i, j, animationmetadatasection);
        this.animationMetadata = p_i242110_1_.animationMetadata;
        this.frames = p_i242110_1_.frames;
        this.framesX = p_i242110_1_.framesX;
        this.framesY = p_i242110_1_.framesY;
        this.interpolationData = p_i242110_1_.interpolationData;
        this.x = 0;
        this.y = 0;
        this.minU = 0.0F;
        this.maxU = 1.0F;
        this.minV = 0.0F;
        this.maxV = 1.0F;
        this.frameCounter = p_i242110_1_.frameCounter;
        this.tickCounter = p_i242110_1_.tickCounter;
        this.indexInMap = p_i242110_1_.indexInMap;
        this.baseU = p_i242110_1_.baseU;
        this.baseV = p_i242110_1_.baseV;
        this.sheetWidth = p_i242110_1_.sheetWidth;
        this.sheetHeight = p_i242110_1_.sheetHeight;
        this.isSpriteSingle = true;
        this.mipmapLevels = p_i242110_1_.mipmapLevels;
        this.animationIndex = p_i242110_1_.animationIndex;
        this.animationActive = p_i242110_1_.animationActive;
    }

    protected TextureAtlasSprite(AtlasTexture atlasTextureIn, TextureAtlasSprite.Info spriteInfoIn, int mipmapLevelsIn, int atlasWidthIn, int atlasHeightIn, int xIn, int yIn, NativeImage imageIn)
    {
        this.atlasTexture = atlasTextureIn;
        AnimationMetadataSection animationmetadatasection = spriteInfoIn.spriteAnimationMetadata;
        int i = spriteInfoIn.spriteWidth;
        int j = spriteInfoIn.spriteHeight;
        this.x = xIn;
        this.y = yIn;
        this.minU = (float)xIn / (float)atlasWidthIn;
        this.maxU = (float)(xIn + i) / (float)atlasWidthIn;
        this.minV = (float)yIn / (float)atlasHeightIn;
        this.maxV = (float)(yIn + j) / (float)atlasHeightIn;

        if (spriteInfoIn.scaleFactor > 1.0D)
        {
            int k = (int)Math.round((double)imageIn.getWidth() * spriteInfoIn.scaleFactor);
            NativeImage nativeimage = TextureUtils.scaleImage(imageIn, k);

            if (nativeimage != imageIn)
            {
                imageIn.close();
                imageIn = nativeimage;
            }
        }

        if (!this.isSpriteShaders && !spriteInfoIn.getSpriteLocation().getPath().endsWith("_leaves"))
        {
            this.fixTransparentColor(imageIn);
        }

        NativeImage nativeimage1 = imageIn;
        int i2 = imageIn.getWidth() / animationmetadatasection.getFrameWidth(i);
        int l = imageIn.getHeight() / animationmetadatasection.getFrameHeight(j);

        if (animationmetadatasection.getFrameCount() > 0)
        {
            int i1 = animationmetadatasection.getFrameIndexSet().stream().max(Integer::compareTo).get() + 1;
            this.framesX = new int[i1];
            this.framesY = new int[i1];
            Arrays.fill(this.framesX, -1);
            Arrays.fill(this.framesY, -1);

            for (int j1 : animationmetadatasection.getFrameIndexSet())
            {
                if (j1 >= i2 * l)
                {
                    throw new RuntimeException("invalid frameindex " + j1);
                }

                int k1 = j1 / i2;
                int l1 = j1 % i2;
                this.framesX[j1] = l1;
                this.framesY[j1] = k1;
            }
        }
        else
        {
            List<AnimationFrame> list = Lists.newArrayList();
            int j2 = i2 * l;
            this.framesX = new int[j2];
            this.framesY = new int[j2];

            for (int k2 = 0; k2 < l; ++k2)
            {
                for (int l2 = 0; l2 < i2; ++l2)
                {
                    int i3 = k2 * i2 + l2;
                    this.framesX[i3] = l2;
                    this.framesY[i3] = k2;
                    list.add(new AnimationFrame(i3, -1));
                }
            }

            animationmetadatasection = new AnimationMetadataSection(list, i, j, animationmetadatasection.getFrameTime(), animationmetadatasection.isInterpolate());
        }

        this.spriteInfo = new TextureAtlasSprite.Info(spriteInfoIn.spriteLocation, i, j, animationmetadatasection);
        this.animationMetadata = animationmetadatasection;

        try
        {
            try
            {
                this.frames = MipmapGenerator.generateMipmaps(imageIn, mipmapLevelsIn);
            }
            catch (Throwable throwable)
            {
                CrashReport crashreport1 = CrashReport.makeCrashReport(throwable, "Generating mipmaps for frame");
                CrashReportCategory crashreportcategory1 = crashreport1.makeCategory("Frame being iterated");
                crashreportcategory1.addDetail("First frame", () ->
                {
                    StringBuilder stringbuilder = new StringBuilder();

                    if (stringbuilder.length() > 0)
                    {
                        stringbuilder.append(", ");
                    }

                    stringbuilder.append(nativeimage1.getWidth()).append("x").append(nativeimage1.getHeight());
                    return stringbuilder.toString();
                });
                throw new ReportedException(crashreport1);
            }
        }
        catch (Throwable throwable11)
        {
            CrashReport crashreport = CrashReport.makeCrashReport(throwable11, "Applying mipmap");
            CrashReportCategory crashreportcategory = crashreport.makeCategory("Sprite being mipmapped");
            crashreportcategory.addDetail("Sprite name", () ->
            {
                return this.getName().toString();
            });
            crashreportcategory.addDetail("Sprite size", () ->
            {
                return this.getWidth() + " x " + this.getHeight();
            });
            crashreportcategory.addDetail("Sprite frames", () ->
            {
                return this.getFrameCount() + " frames";
            });
            crashreportcategory.addDetail("Mipmap levels", mipmapLevelsIn);
            throw new ReportedException(crashreport);
        }

        if (animationmetadatasection.isInterpolate())
        {
            this.interpolationData = new TextureAtlasSprite.InterpolationData(spriteInfoIn, mipmapLevelsIn);
        }
        else
        {
            this.interpolationData = null;
        }

        this.mipmapLevels = mipmapLevelsIn;
        this.baseU = Math.min(this.minU, this.maxU);
        this.baseV = Math.min(this.minV, this.maxV);
        this.sheetWidth = atlasWidthIn;
        this.sheetHeight = atlasHeightIn;
    }

    private void uploadFrames(int index)
    {
        int i = this.framesX[index] * this.spriteInfo.spriteWidth;
        int j = this.framesY[index] * this.spriteInfo.spriteHeight;
        this.uploadFrames(i, j, this.frames);
    }

    private void uploadFrames(int xOffsetIn, int yOffsetIn, NativeImage[] framesIn)
    {
        boolean flag = false;
        boolean flag1 = this.isSpriteSingle;

        for (int i = 0; i < framesIn.length && this.getWidth() >> i > 0 && this.getHeight() >> i > 0; ++i)
        {
            framesIn[i].uploadTextureSub(i, this.x >> i, this.y >> i, xOffsetIn >> i, yOffsetIn >> i, this.spriteInfo.spriteWidth >> i, this.spriteInfo.spriteHeight >> i, flag, flag1, framesIn.length > 1, false);
        }

        if (this.spriteSingle != null)
        {
            this.spriteSingle.uploadFrames(xOffsetIn, yOffsetIn, framesIn);
        }
    }

    /**
     * Returns the width of the icon, in pixels.
     */
    public int getWidth()
    {
        return this.spriteInfo.spriteWidth;
    }

    /**
     * Returns the height of the icon, in pixels.
     */
    public int getHeight()
    {
        return this.spriteInfo.spriteHeight;
    }

    /**
     * Returns the minimum U coordinate to use when rendering with this icon.
     */
    public float getMinU()
    {
        return this.minU;
    }

    /**
     * Returns the maximum U coordinate to use when rendering with this icon.
     */
    public float getMaxU()
    {
        return this.maxU;
    }

    /**
     * Gets a U coordinate on the icon. 0 returns uMin and 16 returns uMax. Other arguments return in-between values.
     */
    public float getInterpolatedU(double u)
    {
        float f = this.maxU - this.minU;
        return this.minU + f * (float)u / 16.0F;
    }

    /**
     * Returns the minimum V coordinate to use when rendering with this icon.
     */
    public float getMinV()
    {
        return this.minV;
    }

    /**
     * Returns the maximum V coordinate to use when rendering with this icon.
     */
    public float getMaxV()
    {
        return this.maxV;
    }

    /**
     * Gets a V coordinate on the icon. 0 returns vMin and 16 returns vMax. Other arguments return in-between values.
     */
    public float getInterpolatedV(double v)
    {
        float f = this.maxV - this.minV;
        return this.minV + f * (float)v / 16.0F;
    }

    public ResourceLocation getName()
    {
        return this.spriteInfo.spriteLocation;
    }

    public AtlasTexture getAtlasTexture()
    {
        return this.atlasTexture;
    }

    public int getFrameCount()
    {
        return this.framesX.length;
    }

    public void close()
    {
        for (NativeImage nativeimage : this.frames)
        {
            if (nativeimage != null)
            {
                nativeimage.close();
            }
        }

        if (this.interpolationData != null)
        {
            this.interpolationData.close();
        }

        if (this.spriteSingle != null)
        {
        }

        if (this.spriteNormal != null)
        {
            this.spriteNormal.close();
        }

        if (this.spriteSpecular != null)
        {
            this.spriteSpecular.close();
        }
    }

    public String toString()
    {
        int i = this.framesX.length;
        return "TextureAtlasSprite{name='" + this.spriteInfo.spriteLocation + '\'' + ", frameCount=" + i + ", x=" + this.x + ", y=" + this.y + ", height=" + this.spriteInfo.spriteHeight + ", width=" + this.spriteInfo.spriteWidth + ", u0=" + this.minU + ", u1=" + this.maxU + ", v0=" + this.minV + ", v1=" + this.maxV + '}';
    }

    public boolean isPixelTransparent(int frameIndex, int pixelX, int pixelY)
    {
        return (this.frames[0].getPixelRGBA(pixelX + this.framesX[frameIndex] * this.spriteInfo.spriteWidth, pixelY + this.framesY[frameIndex] * this.spriteInfo.spriteHeight) >> 24 & 255) == 0;
    }

    public void uploadMipmaps()
    {
        this.uploadFrames(0);
    }

    private float getAtlasSize()
    {
        float f = (float)this.spriteInfo.spriteWidth / (this.maxU - this.minU);
        float f1 = (float)this.spriteInfo.spriteHeight / (this.maxV - this.minV);
        return Math.max(f1, f);
    }

    public float getUvShrinkRatio()
    {
        return 4.0F / this.getAtlasSize();
    }

    public void updateAnimation()
    {
        if (this.animationMetadata != null)
        {
            this.animationActive = SmartAnimations.isActive() ? SmartAnimations.isSpriteRendered(this) : true;

            if (this.animationMetadata.getFrameCount() <= 1)
            {
                this.animationActive = false;
            }

            ++this.tickCounter;

            if (this.tickCounter >= this.animationMetadata.getFrameTimeSingle(this.frameCounter))
            {
                int i = this.animationMetadata.getFrameIndex(this.frameCounter);
                int j = this.animationMetadata.getFrameCount() == 0 ? this.getFrameCount() : this.animationMetadata.getFrameCount();
                this.frameCounter = (this.frameCounter + 1) % j;
                this.tickCounter = 0;
                int k = this.animationMetadata.getFrameIndex(this.frameCounter);

                if (!this.animationActive)
                {
                    return;
                }

                if (i != k && k >= 0 && k < this.getFrameCount())
                {
                    this.uploadFrames(k);
                }
            }
            else if (this.interpolationData != null)
            {
                if (!this.animationActive)
                {
                    return;
                }

                if (!RenderSystem.isOnRenderThread())
                {
                    RenderSystem.recordRenderCall(() ->
                    {
                        this.interpolationData.uploadInterpolated();
                    });
                }
                else
                {
                    this.interpolationData.uploadInterpolated();
                }
            }
        }
    }

    public boolean hasAnimationMetadata()
    {
        return this.animationMetadata.getFrameCount() > 1;
    }

    public IVertexBuilder wrapBuffer(IVertexBuilder bufferIn)
    {
        if (this.getName() == TextureUtils.LOCATION_SPRITE_EMPTY)
        {
            IRenderTypeBuffer.Impl irendertypebuffer$impl = bufferIn.getRenderTypeBuffer();

            if (irendertypebuffer$impl != null)
            {
                return irendertypebuffer$impl.getDummyBuffer();
            }
        }

        return new SpriteAwareVertexBuilder(bufferIn, this);
    }

    public int getIndexInMap()
    {
        return this.indexInMap;
    }

    public void updateIndexInMap(CounterInt p_updateIndexInMap_1_)
    {
        if (this.indexInMap < 0)
        {
            if (this.atlasTexture != null)
            {
                TextureAtlasSprite textureatlassprite = this.atlasTexture.getRegisteredSprite(this.getName());

                if (textureatlassprite != null)
                {
                    this.indexInMap = textureatlassprite.getIndexInMap();
                }
            }

            if (this.indexInMap < 0)
            {
                this.indexInMap = p_updateIndexInMap_1_.nextValue();
            }
        }
    }

    public int getAnimationIndex()
    {
        return this.animationIndex;
    }

    public void setAnimationIndex(int p_setAnimationIndex_1_)
    {
        this.animationIndex = p_setAnimationIndex_1_;

        if (this.spriteSingle != null)
        {
            this.spriteSingle.setAnimationIndex(p_setAnimationIndex_1_);
        }

        if (this.spriteNormal != null)
        {
            this.spriteNormal.setAnimationIndex(p_setAnimationIndex_1_);
        }

        if (this.spriteSpecular != null)
        {
            this.spriteSpecular.setAnimationIndex(p_setAnimationIndex_1_);
        }
    }

    public boolean isAnimationActive()
    {
        return this.animationActive;
    }

    private void fixTransparentColor(NativeImage p_fixTransparentColor_1_)
    {
        int[] aint = new int[p_fixTransparentColor_1_.getWidth() * p_fixTransparentColor_1_.getHeight()];
        p_fixTransparentColor_1_.getBufferRGBA().get(aint);
        this.fixTransparentColor(aint);
        p_fixTransparentColor_1_.getBufferRGBA().put(aint);
    }

    private void fixTransparentColor(int[] p_fixTransparentColor_1_)
    {
        if (p_fixTransparentColor_1_ != null)
        {
            long i = 0L;
            long j = 0L;
            long k = 0L;
            long l = 0L;

            for (int i1 = 0; i1 < p_fixTransparentColor_1_.length; ++i1)
            {
                int j1 = p_fixTransparentColor_1_[i1];
                int k1 = j1 >> 24 & 255;

                if (k1 >= 16)
                {
                    int l1 = j1 >> 16 & 255;
                    int i2 = j1 >> 8 & 255;
                    int j2 = j1 & 255;
                    i += (long)l1;
                    j += (long)i2;
                    k += (long)j2;
                    ++l;
                }
            }

            if (l > 0L)
            {
                int l2 = (int)(i / l);
                int i3 = (int)(j / l);
                int j3 = (int)(k / l);
                int k3 = l2 << 16 | i3 << 8 | j3;

                for (int l3 = 0; l3 < p_fixTransparentColor_1_.length; ++l3)
                {
                    int i4 = p_fixTransparentColor_1_[l3];
                    int k2 = i4 >> 24 & 255;

                    if (k2 <= 16)
                    {
                        p_fixTransparentColor_1_[l3] = k3;
                    }
                }
            }
        }
    }

    public double getSpriteU16(float p_getSpriteU16_1_)
    {
        float f = this.maxU - this.minU;
        return (double)((p_getSpriteU16_1_ - this.minU) / f * 16.0F);
    }

    public double getSpriteV16(float p_getSpriteV16_1_)
    {
        float f = this.maxV - this.minV;
        return (double)((p_getSpriteV16_1_ - this.minV) / f * 16.0F);
    }

    public void bindSpriteTexture()
    {
        if (this.glSpriteTextureId < 0)
        {
            this.glSpriteTextureId = TextureUtil.generateTextureId();
            TextureUtil.prepareImage(this.glSpriteTextureId, this.mipmapLevels, this.getWidth(), this.getHeight());
            TextureUtils.applyAnisotropicLevel();
        }

        TextureUtils.bindTexture(this.glSpriteTextureId);
    }

    public void deleteSpriteTexture()
    {
        if (this.glSpriteTextureId >= 0)
        {
            TextureUtil.releaseTextureId(this.glSpriteTextureId);
            this.glSpriteTextureId = -1;
        }
    }

    public float toSingleU(float p_toSingleU_1_)
    {
        p_toSingleU_1_ = p_toSingleU_1_ - this.baseU;
        float f = (float)this.sheetWidth / (float)this.getWidth();
        return p_toSingleU_1_ * f;
    }

    public float toSingleV(float p_toSingleV_1_)
    {
        p_toSingleV_1_ = p_toSingleV_1_ - this.baseV;
        float f = (float)this.sheetHeight / (float)this.getHeight();
        return p_toSingleV_1_ * f;
    }

    public NativeImage[] getMipmapImages()
    {
        return this.frames;
    }

    public AnimationMetadataSection getAnimationMetadata()
    {
        return this.animationMetadata;
    }

    public int getOriginX()
    {
        return this.x;
    }

    public int getOriginY()
    {
        return this.y;
    }

    public float getUnInterpolatedU(float p_getUnInterpolatedU_1_)
    {
        float f = this.maxU - this.minU;
        return (p_getUnInterpolatedU_1_ - this.minU) / f * 16.0F;
    }

    public float getUnInterpolatedV(float p_getUnInterpolatedV_1_)
    {
        float f = this.maxV - this.minV;
        return (p_getUnInterpolatedV_1_ - this.minV) / f * 16.0F;
    }

    public TextureAtlasSprite makeSpriteSingle()
    {
        TextureAtlasSprite textureatlassprite = new TextureAtlasSprite(this);
        textureatlassprite.isSpriteSingle = true;
        return textureatlassprite;
    }

    public TextureAtlasSprite makeSpriteShaders(String p_makeSpriteShaders_1_, int p_makeSpriteShaders_2_)
    {
        ResourceLocation resourcelocation = new ResourceLocation(this.getName().getNamespace(), this.getName().getPath() + p_makeSpriteShaders_1_);
        ResourceLocation resourcelocation1 = this.atlasTexture.getSpritePath(resourcelocation);
        TextureAtlasSprite textureatlassprite = null;

        if (this.resourceManager.hasResource(resourcelocation1))
        {
            try (IResource iresource = this.resourceManager.getResource(resourcelocation1))
            {
                IResource iresource1 = this.resourceManager.getResource(resourcelocation1);
                PngSizeInfo pngsizeinfo = new PngSizeInfo(resourcelocation1.toString(), iresource1.getInputStream());
                AnimationMetadataSection animationmetadatasection = iresource.getMetadata(AnimationMetadataSection.SERIALIZER);

                if (animationmetadatasection == null)
                {
                    animationmetadatasection = AnimationMetadataSection.EMPTY;
                }

                Pair<Integer, Integer> pair = animationmetadatasection.getSpriteSize(pngsizeinfo.width, pngsizeinfo.height);
                TextureAtlasSprite.Info textureatlassprite$info = new TextureAtlasSprite.Info(resourcelocation, pair.getFirst(), pair.getSecond(), animationmetadatasection);
                NativeImage nativeimage = NativeImage.read(iresource.getInputStream());

                if (nativeimage.getWidth() != this.getWidth())
                {
                    NativeImage nativeimage1 = TextureUtils.scaleImage(nativeimage, this.getWidth());

                    if (nativeimage1 != nativeimage)
                    {
                        double d0 = 1.0D * (double)this.getWidth() / (double)nativeimage.getWidth();
                        nativeimage.close();
                        nativeimage = nativeimage1;
                        textureatlassprite$info = new TextureAtlasSprite.Info(resourcelocation, (int)((double)pair.getFirst().intValue() * d0), (int)((double)pair.getSecond().intValue() * d0), animationmetadatasection);
                    }
                }

                textureatlassprite = new TextureAtlasSprite(this.atlasTexture, textureatlassprite$info, this.mipmapLevels, this.sheetWidth, this.sheetHeight, this.x, this.y, nativeimage);
            }
            catch (IOException ioexception)
            {
            }
        }

        if (textureatlassprite == null)
        {
            NativeImage nativeimage2 = new NativeImage(this.getWidth(), this.getHeight(), false);
            int i = TextureUtils.toAbgr(p_makeSpriteShaders_2_);
            nativeimage2.fillAreaRGBA(0, 0, nativeimage2.getWidth(), nativeimage2.getHeight(), i);
            TextureAtlasSprite.Info textureatlassprite$info1 = new TextureAtlasSprite.Info(resourcelocation, this.getWidth(), this.getHeight(), AnimationMetadataSection.EMPTY);
            textureatlassprite = new TextureAtlasSprite(this.atlasTexture, textureatlassprite$info1, this.mipmapLevels, this.sheetWidth, this.sheetHeight, this.x, this.y, nativeimage2);
        }

        textureatlassprite.isSpriteShaders = true;
        return textureatlassprite;
    }

    public boolean isTerrain()
    {
        return this.terrain;
    }

    private void setTerrain(boolean p_setTerrain_1_)
    {
        this.terrain = p_setTerrain_1_;
        this.multiTexture = false;
        this.shaders = false;

        if (this.spriteSingle != null)
        {
            this.spriteSingle.deleteSpriteTexture();
            this.spriteSingle = null;
        }

        if (this.spriteNormal != null)
        {
            this.spriteNormal.close();
            this.spriteNormal = null;
        }

        if (this.spriteSpecular != null)
        {
            this.spriteSpecular.close();
            this.spriteSpecular = null;
        }

        this.multiTexture = Config.isMultiTexture();
        this.shaders = Config.isShaders();

        if (this.multiTexture && !this.isSpriteSingle)
        {
            this.spriteSingle = this.makeSpriteSingle();
        }

        if (this.shaders && !this.isSpriteSingle)
        {
            if (this.spriteNormal == null && Shaders.configNormalMap)
            {
                this.spriteNormal = this.makeSpriteShaders("_n", -8421377);
            }

            if (this.spriteSpecular == null && Shaders.configSpecularMap)
            {
                this.spriteSpecular = this.makeSpriteShaders("_s", 0);
            }
        }
    }

    public void update(IResourceManager p_update_1_)
    {
        this.resourceManager = p_update_1_;
        this.updateIndexInMap(this.atlasTexture.getCounterIndexInMap());
        this.setTerrain(this.atlasTexture.isTerrain());
    }

    public int getPixelRGBA(int p_getPixelRGBA_1_, int p_getPixelRGBA_2_, int p_getPixelRGBA_3_)
    {
        return this.frames[0].getPixelRGBA(p_getPixelRGBA_2_ + this.framesX[p_getPixelRGBA_1_] * this.getWidth(), p_getPixelRGBA_3_ + this.framesY[p_getPixelRGBA_1_] * this.getHeight());
    }

    public static final class Info
    {
        private final ResourceLocation spriteLocation;
        private int spriteWidth;
        private int spriteHeight;
        private final AnimationMetadataSection spriteAnimationMetadata;
        private double scaleFactor = 1.0D;

        public Info(ResourceLocation locationIn, int widthIn, int heightIn, AnimationMetadataSection animationMetadataIn)
        {
            this.spriteLocation = locationIn;
            this.spriteWidth = widthIn;
            this.spriteHeight = heightIn;
            this.spriteAnimationMetadata = animationMetadataIn;
        }

        public ResourceLocation getSpriteLocation()
        {
            return this.spriteLocation;
        }

        public int getSpriteWidth()
        {
            return this.spriteWidth;
        }

        public int getSpriteHeight()
        {
            return this.spriteHeight;
        }

        public void setSpriteWidth(int p_setSpriteWidth_1_)
        {
            this.spriteWidth = p_setSpriteWidth_1_;
        }

        public void setSpriteHeight(int p_setSpriteHeight_1_)
        {
            this.spriteHeight = p_setSpriteHeight_1_;
        }

        public AnimationMetadataSection getSpriteAnimationMetadata()
        {
            return this.spriteAnimationMetadata;
        }

        public double getScaleFactor()
        {
            return this.scaleFactor;
        }

        public void setScaleFactor(double p_setScaleFactor_1_)
        {
            this.scaleFactor = p_setScaleFactor_1_;
        }

        public String toString()
        {
            return "" + this.spriteLocation + ", width: " + this.spriteWidth + ", height: " + this.spriteHeight + ", frames: " + this.spriteAnimationMetadata.getFrameCount() + ", scale: " + this.scaleFactor;
        }
    }

    final class InterpolationData implements AutoCloseable
    {
        private final NativeImage[] images;

        private InterpolationData(TextureAtlasSprite.Info spriteInfoIn, int mipmapLevelsIn)
        {
            this.images = new NativeImage[mipmapLevelsIn + 1];

            for (int i = 0; i < this.images.length; ++i)
            {
                int j = spriteInfoIn.spriteWidth >> i;
                int k = spriteInfoIn.spriteHeight >> i;

                if (this.images[i] == null)
                {
                    this.images[i] = new NativeImage(j, k, false);
                }
            }
        }

        private void uploadInterpolated()
        {
            double d0 = 1.0D - (double)TextureAtlasSprite.this.tickCounter / (double)TextureAtlasSprite.this.animationMetadata.getFrameTimeSingle(TextureAtlasSprite.this.frameCounter);
            int i = TextureAtlasSprite.this.animationMetadata.getFrameIndex(TextureAtlasSprite.this.frameCounter);
            int j = TextureAtlasSprite.this.animationMetadata.getFrameCount() == 0 ? TextureAtlasSprite.this.getFrameCount() : TextureAtlasSprite.this.animationMetadata.getFrameCount();
            int k = TextureAtlasSprite.this.animationMetadata.getFrameIndex((TextureAtlasSprite.this.frameCounter + 1) % j);

            if (i != k && k >= 0 && k < TextureAtlasSprite.this.getFrameCount())
            {
                for (int l = 0; l < this.images.length; ++l)
                {
                    int i1 = TextureAtlasSprite.this.spriteInfo.spriteWidth >> l;
                    int j1 = TextureAtlasSprite.this.spriteInfo.spriteHeight >> l;

                    for (int k1 = 0; k1 < j1; ++k1)
                    {
                        for (int l1 = 0; l1 < i1; ++l1)
                        {
                            int i2 = this.getPixelColor(i, l, l1, k1);
                            int j2 = this.getPixelColor(k, l, l1, k1);
                            int k2 = this.mix(d0, i2 >> 16 & 255, j2 >> 16 & 255);
                            int l2 = this.mix(d0, i2 >> 8 & 255, j2 >> 8 & 255);
                            int i3 = this.mix(d0, i2 & 255, j2 & 255);
                            this.images[l].setPixelRGBA(l1, k1, i2 & -16777216 | k2 << 16 | l2 << 8 | i3);
                        }
                    }
                }

                TextureAtlasSprite.this.uploadFrames(0, 0, this.images);
            }
        }

        private int getPixelColor(int frameIndex, int mipmapLevel, int x, int y)
        {
            return TextureAtlasSprite.this.frames[mipmapLevel].getPixelRGBA(x + (TextureAtlasSprite.this.framesX[frameIndex] * TextureAtlasSprite.this.spriteInfo.spriteWidth >> mipmapLevel), y + (TextureAtlasSprite.this.framesY[frameIndex] * TextureAtlasSprite.this.spriteInfo.spriteHeight >> mipmapLevel));
        }

        private int mix(double ratio, int val1, int val2)
        {
            return (int)(ratio * (double)val1 + (1.0D - ratio) * (double)val2);
        }

        public void close()
        {
            for (NativeImage nativeimage : this.images)
            {
                if (nativeimage != null)
                {
                    nativeimage.close();
                }
            }
        }
    }
}
