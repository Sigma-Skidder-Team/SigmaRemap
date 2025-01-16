package net.optifine.util;

import com.mojang.blaze3d.platform.GlStateManager;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.IntBuffer;
import java.util.Iterator;
import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;
import net.minecraft.client.renderer.entity.layers.MooshroomMushroomLayer;
import net.minecraft.client.renderer.model.ModelBakery;
import net.minecraft.client.renderer.texture.AtlasTexture;
import net.minecraft.client.renderer.texture.MissingTextureSprite;
import net.minecraft.client.renderer.texture.NativeImage;
import net.minecraft.client.renderer.texture.SimpleTexture;
import net.minecraft.client.renderer.texture.Texture;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.resources.ReloadListener;
import net.minecraft.profiler.IProfiler;
import net.minecraft.resources.IReloadableResourceManager;
import net.minecraft.resources.IResourceManager;
import net.minecraft.resources.IResourceManagerReloadListener;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.optifine.BetterGrass;
import net.optifine.BetterSnow;
import net.optifine.Config;
import net.optifine.ConnectedTextures;
import net.optifine.CustomBlockLayers;
import net.optifine.CustomColors;
import net.optifine.CustomGuis;
import net.optifine.CustomItems;
import net.optifine.CustomLoadingScreens;
import net.optifine.CustomPanorama;
import net.optifine.CustomSky;
import net.optifine.EmissiveTextures;
import net.optifine.Lang;
import net.optifine.NaturalTextures;
import net.optifine.RandomEntities;
import net.optifine.SmartLeaves;
import net.optifine.TextureAnimations;
import net.optifine.entity.model.CustomEntityModels;
import net.optifine.reflect.ReflectorForge;
import net.optifine.shaders.MultiTexID;
import net.optifine.shaders.Shaders;
import org.apache.commons.io.IOUtils;
import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

public class TextureUtils
{
    private static final String texGrassTop = "grass_block_top";
    private static final String texGrassSide = "grass_block_side";
    private static final String texGrassSideOverlay = "grass_block_side_overlay";
    private static final String texSnow = "snow";
    private static final String texGrassSideSnowed = "grass_block_snow";
    private static final String texMyceliumSide = "mycelium_side";
    private static final String texMyceliumTop = "mycelium_top";
    private static final String texWaterStill = "water_still";
    private static final String texWaterFlow = "water_flow";
    private static final String texLavaStill = "lava_still";
    private static final String texLavaFlow = "lava_flow";
    private static final String texFireLayer0 = "fire_0";
    private static final String texFireLayer1 = "fire_1";
    private static final String texPortal = "nether_portal";
    private static final String texGlass = "glass";
    private static final String texGlassPaneTop = "glass_pane_top";
    public static TextureAtlasSprite iconGrassTop;
    public static TextureAtlasSprite iconGrassSide;
    public static TextureAtlasSprite iconGrassSideOverlay;
    public static TextureAtlasSprite iconSnow;
    public static TextureAtlasSprite iconGrassSideSnowed;
    public static TextureAtlasSprite iconMyceliumSide;
    public static TextureAtlasSprite iconMyceliumTop;
    public static TextureAtlasSprite iconWaterStill;
    public static TextureAtlasSprite iconWaterFlow;
    public static TextureAtlasSprite iconLavaStill;
    public static TextureAtlasSprite iconLavaFlow;
    public static TextureAtlasSprite iconFireLayer0;
    public static TextureAtlasSprite iconFireLayer1;
    public static TextureAtlasSprite iconPortal;
    public static TextureAtlasSprite iconGlass;
    public static TextureAtlasSprite iconGlassPaneTop;
    public static final String SPRITE_PREFIX_BLOCKS = "minecraft:block/";
    public static final String SPRITE_PREFIX_ITEMS = "minecraft:item/";
    private static IntBuffer staticBuffer = Config.createDirectIntBuffer(256);
    private static int glMaximumTextureSize = -1;

    public static void update()
    {
        AtlasTexture atlastexture = getTextureMapBlocks();

        if (atlastexture != null)
        {
            String s = "minecraft:block/";
            iconGrassTop = getSpriteCheck(atlastexture, s + "grass_block_top");
            iconGrassSide = getSpriteCheck(atlastexture, s + "grass_block_side");
            iconGrassSideOverlay = getSpriteCheck(atlastexture, s + "grass_block_side_overlay");
            iconSnow = getSpriteCheck(atlastexture, s + "snow");
            iconGrassSideSnowed = getSpriteCheck(atlastexture, s + "grass_block_snow");
            iconMyceliumSide = getSpriteCheck(atlastexture, s + "mycelium_side");
            iconMyceliumTop = getSpriteCheck(atlastexture, s + "mycelium_top");
            iconWaterStill = getSpriteCheck(atlastexture, s + "water_still");
            iconWaterFlow = getSpriteCheck(atlastexture, s + "water_flow");
            iconLavaStill = getSpriteCheck(atlastexture, s + "lava_still");
            iconLavaFlow = getSpriteCheck(atlastexture, s + "lava_flow");
            iconFireLayer0 = getSpriteCheck(atlastexture, s + "fire_0");
            iconFireLayer1 = getSpriteCheck(atlastexture, s + "fire_1");
            iconPortal = getSpriteCheck(atlastexture, s + "nether_portal");
            iconGlass = getSpriteCheck(atlastexture, s + "glass");
            iconGlassPaneTop = getSpriteCheck(atlastexture, s + "glass_pane_top");
            String s1 = "minecraft:item/";
        }
    }

    public static TextureAtlasSprite getSpriteCheck(AtlasTexture textureMap, String name)
    {
        TextureAtlasSprite textureatlassprite = textureMap.getUploadedSprite(name);

        if (textureatlassprite == null || textureatlassprite instanceof MissingTextureSprite)
        {
            Config.warn("Sprite not found: " + name);
        }

        return textureatlassprite;
    }

    public static BufferedImage fixTextureDimensions(String name, BufferedImage bi)
    {
        if (name.startsWith("/mob/zombie") || name.startsWith("/mob/pigzombie"))
        {
            int i = bi.getWidth();
            int j = bi.getHeight();

            if (i == j * 2)
            {
                BufferedImage bufferedimage = new BufferedImage(i, j * 2, 2);
                Graphics2D graphics2d = bufferedimage.createGraphics();
                graphics2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
                graphics2d.drawImage(bi, 0, 0, i, j, (ImageObserver)null);
                return bufferedimage;
            }
        }

        return bi;
    }

    public static int ceilPowerOfTwo(int val)
    {
        int i;

        for (i = 1; i < val; i *= 2)
        {
            ;
        }

        return i;
    }

    public static int getPowerOfTwo(int val)
    {
        int i = 1;
        int j;

        for (j = 0; i < val; ++j)
        {
            i *= 2;
        }

        return j;
    }

    public static int twoToPower(int power)
    {
        int i = 1;

        for (int j = 0; j < power; ++j)
        {
            i *= 2;
        }

        return i;
    }

    public static Texture getTexture(ResourceLocation loc)
    {
        Texture texture = Config.getTextureManager().getTexture(loc);

        if (texture != null)
        {
            return texture;
        }
        else if (!Config.hasResource(loc))
        {
            return null;
        }
        else
        {
            Texture simpletexture = new SimpleTexture(loc);
            Config.getTextureManager().loadTexture(loc, simpletexture);
            return simpletexture;
        }
    }

    public static void resourcesReloaded(IResourceManager rm)
    {
        if (getTextureMapBlocks() != null)
        {
            Config.dbg("*** Reloading custom textures ***");
            CustomSky.reset();
            TextureAnimations.reset();
            update();
            NaturalTextures.update();
            BetterGrass.update();
            BetterSnow.update();
            TextureAnimations.update();
            CustomColors.update();
            CustomSky.update();
            RandomEntities.update();
            CustomItems.updateModels();
            CustomEntityModels.update();
            Shaders.resourcesReloaded();
            Lang.resourcesReloaded();
            Config.updateTexturePackClouds();
            SmartLeaves.updateLeavesModels();
            CustomPanorama.update();
            CustomGuis.update();
            MooshroomMushroomLayer.update();
            CustomLoadingScreens.update();
            CustomBlockLayers.update();
            Config.getTextureManager().tick();
            Config.dbg("Disable Forge light pipeline");
            ReflectorForge.setForgeLightPipelineEnabled(false);
        }
    }

    public static AtlasTexture getTextureMapBlocks()
    {
        return Config.getTextureMap();
    }

    public static void registerResourceListener()
    {
        IResourceManager iresourcemanager = Config.getResourceManager();

        if (iresourcemanager instanceof IReloadableResourceManager)
        {
            IReloadableResourceManager ireloadableresourcemanager = (IReloadableResourceManager)iresourcemanager;
            ReloadListener reloadlistener = new ReloadListener()
            {
                protected Object prepare(IResourceManager resourceManagerIn, IProfiler profilerIn)
                {
                    return null;
                }
                protected void apply(Object objectIn, IResourceManager resourceManagerIn, IProfiler profilerIn)
                {
                }
            };
            ireloadableresourcemanager.addReloadListener(reloadlistener);
            IResourceManagerReloadListener iresourcemanagerreloadlistener = new IResourceManagerReloadListener()
            {
                public void onResourceManagerReload(IResourceManager resourceManager)
                {
                    TextureUtils.resourcesReloaded(resourceManager);
                }
            };
            ireloadableresourcemanager.addReloadListener(iresourcemanagerreloadlistener);
        }
    }

    public static void registerTickableTextures()
    {
        TickableTexture tickabletexture = new TickableTexture()
        {
            public void tick()
            {
                TextureAnimations.updateAnimations();
            }
            public void loadTexture(IResourceManager var1) throws IOException
            {
            }
            public int getGlTextureId()
            {
                return 0;
            }
            public void restoreLastBlurMipmap()
            {
            }
            public MultiTexID getMultiTexID()
            {
                return null;
            }
        };
        ResourceLocation resourcelocation = new ResourceLocation("optifine/tickable_textures");
        Config.getTextureManager().loadTexture(resourcelocation, tickabletexture);
    }

    public static void registerCustomModels(ModelBakery modelBakery)
    {
        CustomItems.update();
        CustomItems.loadModels(modelBakery);
    }

    public static void registerCustomSprites(AtlasTexture textureMap)
    {
        if (textureMap.getTextureLocation().equals(AtlasTexture.LOCATION_BLOCKS_TEXTURE))
        {
            ConnectedTextures.updateIcons(textureMap);
            CustomItems.updateIcons(textureMap);
            BetterGrass.updateIcons(textureMap);
        }
    }

    public static void refreshCustomSprites(AtlasTexture textureMap)
    {
        if (textureMap.getTextureLocation().equals(AtlasTexture.LOCATION_BLOCKS_TEXTURE))
        {
            ConnectedTextures.refreshIcons(textureMap);
            CustomItems.refreshIcons(textureMap);
            BetterGrass.refreshIcons(textureMap);
        }

        EmissiveTextures.refreshIcons(textureMap);
    }

    public static ResourceLocation fixResourceLocation(ResourceLocation loc, String basePath)
    {
        if (!loc.getNamespace().equals("minecraft"))
        {
            return loc;
        }
        else
        {
            String s = loc.getPath();
            String s1 = fixResourcePath(s, basePath);

            if (s1 != s)
            {
                loc = new ResourceLocation(loc.getNamespace(), s1);
            }

            return loc;
        }
    }

    public static String fixResourcePath(String path, String basePath)
    {
        String s = "assets/minecraft/";

        if (path.startsWith(s))
        {
            path = path.substring(s.length());
            return path;
        }
        else if (path.startsWith("./"))
        {
            path = path.substring(2);

            if (!basePath.endsWith("/"))
            {
                basePath = basePath + "/";
            }

            path = basePath + path;
            return path;
        }
        else
        {
            if (path.startsWith("/~"))
            {
                path = path.substring(1);
            }

            String s1 = "optifine/";

            if (path.startsWith("~/"))
            {
                path = path.substring(2);
                path = s1 + path;
                return path;
            }
            else if (path.startsWith("/"))
            {
                path = s1 + path.substring(1);
                return path;
            }
            else
            {
                return path;
            }
        }
    }

    public static String getBasePath(String path)
    {
        int i = path.lastIndexOf(47);
        return i < 0 ? "" : path.substring(0, i);
    }

    public static void applyAnisotropicLevel()
    {
        if (GL.getCapabilities().GL_EXT_texture_filter_anisotropic)
        {
            float f = GL11.glGetFloat(34047);
            float f1 = (float)Config.getAnisotropicFilterLevel();
            f1 = Math.min(f1, f);
            GL11.glTexParameterf(GL11.GL_TEXTURE_2D, 34046, f1);
        }
    }

    public static void bindTexture(int glTexId)
    {
        GlStateManager.bindTexture(glTexId);
    }

    public static boolean isPowerOfTwo(int x)
    {
        int i = MathHelper.smallestEncompassingPowerOfTwo(x);
        return i == x;
    }

    public static NativeImage scaleImage(NativeImage ni, int w2)
    {
        BufferedImage bufferedimage = toBufferedImage(ni);
        BufferedImage bufferedimage1 = scaleImage(bufferedimage, w2);
        NativeImage nativeimage = toNativeImage(bufferedimage1);
        return nativeimage;
    }

    public static BufferedImage toBufferedImage(NativeImage ni)
    {
        int i = ni.getWidth();
        int j = ni.getHeight();
        int[] aint = new int[i * j];
        ni.getBufferRGBA().get(aint);
        BufferedImage bufferedimage = new BufferedImage(i, j, 2);
        bufferedimage.setRGB(0, 0, i, j, aint, 0, i);
        return bufferedimage;
    }

    private static NativeImage toNativeImage(BufferedImage bi)
    {
        int i = bi.getWidth();
        int j = bi.getHeight();
        int[] aint = new int[i * j];
        bi.getRGB(0, 0, i, j, aint, 0, i);
        NativeImage nativeimage = new NativeImage(i, j, false);
        nativeimage.getBufferRGBA().put(aint);
        return nativeimage;
    }

    public static BufferedImage scaleImage(BufferedImage bi, int w2)
    {
        int i = bi.getWidth();
        int j = bi.getHeight();
        int k = j * w2 / i;
        BufferedImage bufferedimage = new BufferedImage(w2, k, 2);
        Graphics2D graphics2d = bufferedimage.createGraphics();
        Object object = RenderingHints.VALUE_INTERPOLATION_NEAREST_NEIGHBOR;

        if (w2 < i || w2 % i != 0)
        {
            object = RenderingHints.VALUE_INTERPOLATION_BILINEAR;
        }

        graphics2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION, object);
        graphics2d.drawImage(bi, 0, 0, w2, k, (ImageObserver)null);
        return bufferedimage;
    }

    public static int scaleToGrid(int size, int sizeGrid)
    {
        if (size == sizeGrid)
        {
            return size;
        }
        else
        {
            int i;

            for (i = size / sizeGrid * sizeGrid; i < size; i += sizeGrid)
            {
                ;
            }

            return i;
        }
    }

    public static int scaleToMin(int size, int sizeMin)
    {
        if (size >= sizeMin)
        {
            return size;
        }
        else
        {
            int i;

            for (i = sizeMin / size * size; i < sizeMin; i += size)
            {
                ;
            }

            return i;
        }
    }

    public static Dimension getImageSize(InputStream in, String suffix)
    {
        Iterator iterator = ImageIO.getImageReadersBySuffix(suffix);

        while (true)
        {
            if (iterator.hasNext())
            {
                ImageReader imagereader = (ImageReader)iterator.next();
                Dimension dimension;

                try
                {
                    ImageInputStream imageinputstream = ImageIO.createImageInputStream(in);
                    imagereader.setInput(imageinputstream);
                    int i = imagereader.getWidth(imagereader.getMinIndex());
                    int j = imagereader.getHeight(imagereader.getMinIndex());
                    dimension = new Dimension(i, j);
                }
                catch (IOException var11)
                {
                    continue;
                }
                finally
                {
                    imagereader.dispose();
                }

                return dimension;
            }

            return null;
        }
    }

    public static void dbgMipmaps(TextureAtlasSprite textureatlassprite)
    {
        NativeImage[] anativeimage = textureatlassprite.getMipmapImages();

        for (int i = 0; i < anativeimage.length; ++i)
        {
            NativeImage nativeimage = anativeimage[i];

            if (nativeimage == null)
            {
                Config.dbg("" + i + ": " + nativeimage);
            }
            else
            {
                Config.dbg("" + i + ": " + nativeimage.getWidth() * nativeimage.getHeight());
            }
        }
    }

    public static void saveGlTexture(String name, int textureId, int mipmapLevels, int width, int height)
    {
        bindTexture(textureId);
        GL11.glPixelStorei(GL11.GL_PACK_ALIGNMENT, 1);
        GL11.glPixelStorei(GL11.GL_UNPACK_ALIGNMENT, 1);
        File file1 = new File(name);
        File file2 = file1.getParentFile();

        if (file2 != null)
        {
            file2.mkdirs();
        }

        for (int i = 0; i < 16; ++i)
        {
            String s = name.endsWith(".png") ? name.replace(".png", "_" + i + ".png") : name + "_" + i + ".png";
            File file3 = new File(s);
            file3.delete();
        }

        for (int l = 0; l <= mipmapLevels; ++l)
        {
            File file4 = new File(name + "_" + l + ".png");
            int i1 = width >> l;
            int j = height >> l;
            int k = i1 * j;
            IntBuffer intbuffer = org.lwjgl.BufferUtils.createIntBuffer(k);
            int[] aint = new int[k];
            GL11.glGetTexImage(GL11.GL_TEXTURE_2D, l, GL12.GL_BGRA, GL12.GL_UNSIGNED_INT_8_8_8_8_REV, intbuffer);
            intbuffer.get(aint);
            BufferedImage bufferedimage = new BufferedImage(i1, j, 2);
            bufferedimage.setRGB(0, 0, i1, j, aint, 0, i1);

            try
            {
                ImageIO.write(bufferedimage, "png", file4);
                Config.dbg("Exported: " + file4);
            }
            catch (Exception exception)
            {
                Config.warn("Error writing: " + file4);
                Config.warn("" + exception.getClass().getName() + ": " + exception.getMessage());
            }
        }
    }

    public static int getGLMaximumTextureSize()
    {
        if (glMaximumTextureSize < 0)
        {
            glMaximumTextureSize = detectGLMaximumTextureSize();
        }

        return glMaximumTextureSize;
    }

    private static int detectGLMaximumTextureSize()
    {
        for (int i = 65536; i > 0; i >>= 1)
        {
            GlStateManager.texImage2D(32868, 0, 6408, i, i, 0, 6408, 5121, (IntBuffer)null);
            int j = GL11.glGetError();
            int k = GlStateManager.getTexLevelParameter(32868, 0, 4096);

            if (k != 0)
            {
                return i;
            }
        }

        return 0;
    }

    public static BufferedImage readBufferedImage(InputStream imageStream) throws IOException
    {
        if (imageStream == null)
        {
            return null;
        }
        else
        {
            BufferedImage bufferedimage1;

            try
            {
                BufferedImage bufferedimage = ImageIO.read(imageStream);
                bufferedimage1 = bufferedimage;
            }
            finally
            {
                IOUtils.closeQuietly(imageStream);
            }

            return bufferedimage1;
        }
    }

    public static int toAbgr(int argb)
    {
        int i = argb >> 24 & 255;
        int j = argb >> 16 & 255;
        int k = argb >> 8 & 255;
        int l = argb >> 0 & 255;
        int i1 = i << 24 | l << 16 | k << 8 | j;
        return i1;
    }

    public static void resetDataUnpacking()
    {
        GlStateManager.pixelStore(3314, 0);
        GlStateManager.pixelStore(3316, 0);
        GlStateManager.pixelStore(3315, 0);
        GlStateManager.pixelStore(3317, 4);
    }
}