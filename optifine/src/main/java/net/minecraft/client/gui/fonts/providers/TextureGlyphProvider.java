package net.minecraft.client.gui.fonts.providers;

import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import it.unimi.dsi.fastutil.chars.Char2ObjectMap;
import it.unimi.dsi.fastutil.chars.Char2ObjectOpenHashMap;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import javax.annotation.Nullable;
import net.minecraft.client.gui.fonts.IGlyphInfo;
import net.minecraft.client.renderer.texture.NativeImage;
import net.minecraft.resources.IResource;
import net.minecraft.resources.IResourceManager;
import net.minecraft.util.JSONUtils;
import net.minecraft.util.ResourceLocation;
import net.optifine.util.FontUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TextureGlyphProvider implements IGlyphProvider
{
    private static final Logger LOGGER = LogManager.getLogger();
    private final NativeImage texture;
    private final Char2ObjectMap<TextureGlyphProvider.GlyphInfo> glyphInfos;
    private boolean blend = false;
    private float widthSpace = -1.0F;

    public TextureGlyphProvider(NativeImage p_i176_1_, Char2ObjectMap<TextureGlyphProvider.GlyphInfo> p_i176_2_)
    {
        this.texture = p_i176_1_;
        this.glyphInfos = p_i176_2_;
    }

    public void close()
    {
        this.texture.close();
    }

    @Nullable
    public IGlyphInfo getGlyphInfo(char character)
    {
        return this.glyphInfos.get(character);
    }

    public boolean isBlend()
    {
        return this.blend;
    }

    public float getWidthSpace()
    {
        return this.widthSpace;
    }

    public static class Factory implements IGlyphProviderFactory
    {
        private ResourceLocation file;
        private final List<String> chars;
        private final int height;
        private final int ascent;

        public Factory(ResourceLocation p_i30_1_, int p_i30_2_, int p_i30_3_, List<String> p_i30_4_)
        {
            this.file = new ResourceLocation(p_i30_1_.getNamespace(), "textures/" + p_i30_1_.getPath());
            this.file = FontUtils.getHdFontLocation(this.file);
            this.chars = p_i30_4_;
            this.height = p_i30_2_;
            this.ascent = p_i30_3_;
        }

        public static TextureGlyphProvider.Factory deserialize(JsonObject jsonIn)
        {
            int i = JSONUtils.getInt(jsonIn, "height", 8);
            int j = JSONUtils.getInt(jsonIn, "ascent");

            if (j > i)
            {
                throw new JsonParseException("Ascent " + j + " higher than height " + i);
            }
            else
            {
                List<String> list = Lists.newArrayList();
                JsonArray jsonarray = JSONUtils.getJsonArray(jsonIn, "chars");

                for (int k = 0; k < jsonarray.size(); ++k)
                {
                    String s = JSONUtils.getString(jsonarray.get(k), "chars[" + k + "]");

                    if (k > 0)
                    {
                        int l = s.length();
                        int i1 = list.get(0).length();

                        if (l != i1)
                        {
                            throw new JsonParseException("Elements of chars have to be the same length (found: " + l + ", expected: " + i1 + "), pad with space or \\u0000");
                        }
                    }

                    list.add(s);
                }

                if (!list.isEmpty() && !list.get(0).isEmpty())
                {
                    return new TextureGlyphProvider.Factory(new ResourceLocation(JSONUtils.getString(jsonIn, "file")), i, j, list);
                }
                else
                {
                    throw new JsonParseException("Expected to find data in chars, found none.");
                }
            }
        }

        @Nullable
        public IGlyphProvider create(IResourceManager resourceManagerIn)
        {
            try (IResource iresource = resourceManagerIn.getResource(this.file))
            {
                NativeImage nativeimage = NativeImage.read(NativeImage.PixelFormat.RGBA, iresource.getInputStream());
                int i = nativeimage.getWidth();
                int j = nativeimage.getHeight();
                int k = i / this.chars.get(0).length();
                int l = j / this.chars.size();
                float f = (float)this.height / (float)l;
                Char2ObjectMap<TextureGlyphProvider.GlyphInfo> char2objectmap = new Char2ObjectOpenHashMap<>();
                Properties properties = FontUtils.readFontProperties(this.file);
                Char2ObjectMap<Float> char2objectmap1 = FontUtils.readCustomCharWidths(properties);
                Float f1 = char2objectmap1.get(' ');
                boolean flag = FontUtils.readBoolean(properties, "blend", false);
                float f2 = FontUtils.readFloat(properties, "offsetBold", -1.0F);

                if (f2 < 0.0F)
                {
                    f2 = k > 8 ? 0.5F : 1.0F;
                }

                for (int i1 = 0; i1 < this.chars.size(); ++i1)
                {
                    String s = this.chars.get(i1);

                    for (int j1 = 0; j1 < s.length(); ++j1)
                    {
                        char c0 = s.charAt(j1);

                        if (c0 != 0 && c0 != ' ')
                        {
                            float f3 = (float)this.getCharacterWidth(nativeimage, k, l, j1, i1);
                            Float f4 = char2objectmap1.get(c0);

                            if (f4 != null)
                            {
                                f3 = f4 * ((float)k / 8.0F);
                            }

                            TextureGlyphProvider.GlyphInfo textureglyphprovider$glyphinfo = char2objectmap.put(c0, new TextureGlyphProvider.GlyphInfo(f, nativeimage, j1 * k, i1 * l, k, l, (int)(0.5D + (double)(f3 * f)) + 1, this.ascent));

                            if (textureglyphprovider$glyphinfo != null)
                            {
                                TextureGlyphProvider.LOGGER.warn("Codepoint '{}' declared multiple times in {}", Integer.toHexString(c0), this.file);
                            }

                            TextureGlyphProvider.GlyphInfo textureglyphprovider$glyphinfo1 = char2objectmap.get(c0);
                            textureglyphprovider$glyphinfo1.offsetBold = f2;
                        }
                    }
                }

                TextureGlyphProvider textureglyphprovider = new TextureGlyphProvider(nativeimage, char2objectmap);
                textureglyphprovider.blend = flag;

                if (f1 != null)
                {
                    textureglyphprovider.widthSpace = f1;
                }

                return textureglyphprovider;
            }
            catch (IOException ioexception1)
            {
                throw new RuntimeException(ioexception1.getMessage());
            }
        }

        private int getCharacterWidth(NativeImage nativeImageIn, int charWidthIn, int charHeightInsp, int columnIn, int rowIn)
        {
            int i;

            for (i = charWidthIn - 1; i >= 0; --i)
            {
                int j = columnIn * charWidthIn + i;

                for (int k = 0; k < charHeightInsp; ++k)
                {
                    int l = rowIn * charHeightInsp + k;

                    if ((nativeImageIn.getPixelLuminanceOrAlpha(j, l) & 255) > 16)
                    {
                        return i + 1;
                    }
                }
            }

            return i + 1;
        }
    }

    static final class GlyphInfo implements IGlyphInfo
    {
        private final float scale;
        private final NativeImage texture;
        private final int unpackSkipPixels;
        private final int unpackSkipRows;
        private final int width;
        private final int height;
        private final int advanceWidth;
        private final int ascent;
        private float offsetBold = 1.0F;

        private GlyphInfo(float p_i257_1_, NativeImage p_i257_2_, int p_i257_3_, int p_i257_4_, int p_i257_5_, int p_i257_6_, int p_i257_7_, int p_i257_8_)
        {
            this.scale = p_i257_1_;
            this.texture = p_i257_2_;
            this.unpackSkipPixels = p_i257_3_;
            this.unpackSkipRows = p_i257_4_;
            this.width = p_i257_5_;
            this.height = p_i257_6_;
            this.advanceWidth = p_i257_7_;
            this.ascent = p_i257_8_;
        }

        public float getOversample()
        {
            return 1.0F / this.scale;
        }

        public int getWidth()
        {
            return this.width;
        }

        public int getHeight()
        {
            return this.height;
        }

        public float getAdvance()
        {
            return (float)this.advanceWidth;
        }

        public float getBearingY()
        {
            return IGlyphInfo.super.getBearingY() + 7.0F - (float)this.ascent;
        }

        public void uploadGlyph(int xOffset, int yOffset)
        {
            this.texture.uploadTextureSub(0, xOffset, yOffset, this.unpackSkipPixels, this.unpackSkipRows, this.width, this.height, false, false);
        }

        public boolean isColored()
        {
            return this.texture.getFormat().getPixelSize() > 1;
        }

        public float getBoldOffset()
        {
            return this.offsetBold;
        }
    }
}
