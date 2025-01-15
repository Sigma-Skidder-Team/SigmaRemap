package net.minecraft.client.renderer.vertex;

import com.mojang.blaze3d.platform.GlStateManager;
import java.util.function.IntConsumer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class VertexFormatElement
{
    private static final Logger LOGGER = LogManager.getLogger();
    private final VertexFormatElement.Type type;
    private final VertexFormatElement.Usage usage;
    private final int index;
    private final int elementCount;
    private final int sizeBytes;

    public VertexFormatElement(int p_i3503_1_, VertexFormatElement.Type p_i3503_2_, VertexFormatElement.Usage p_i3503_3_, int p_i3503_4_)
    {
        if (this.isFirstOrUV(p_i3503_1_, p_i3503_3_))
        {
            this.usage = p_i3503_3_;
        }
        else
        {
            LOGGER.warn("Multiple vertex elements of the same type other than UVs are not supported. Forcing type to UV.");
            this.usage = VertexFormatElement.Usage.UV;
        }

        this.type = p_i3503_2_;
        this.index = p_i3503_1_;
        this.elementCount = p_i3503_4_;
        this.sizeBytes = p_i3503_2_.getSize() * this.elementCount;
    }

    private boolean isFirstOrUV(int indexIn, VertexFormatElement.Usage usageIn)
    {
        return indexIn == 0 || usageIn == VertexFormatElement.Usage.UV;
    }

    public final VertexFormatElement.Type getType()
    {
        return this.type;
    }

    public final VertexFormatElement.Usage getUsage()
    {
        return this.usage;
    }

    public final int getElementCount()
    {
        return this.elementCount;
    }

    public final int getIndex()
    {
        return this.index;
    }

    public String toString()
    {
        return this.elementCount + "," + this.usage.getDisplayName() + "," + this.type.getDisplayName();
    }

    public final int getSize()
    {
        return this.sizeBytes;
    }

    public final boolean isPositionElement()
    {
        return this.usage == VertexFormatElement.Usage.POSITION;
    }

    public boolean equals(Object p_equals_1_)
    {
        if (this == p_equals_1_)
        {
            return true;
        }
        else if (p_equals_1_ != null && this.getClass() == p_equals_1_.getClass())
        {
            VertexFormatElement vertexformatelement = (VertexFormatElement)p_equals_1_;

            if (this.elementCount != vertexformatelement.elementCount)
            {
                return false;
            }
            else if (this.index != vertexformatelement.index)
            {
                return false;
            }
            else if (this.type != vertexformatelement.type)
            {
                return false;
            }
            else
            {
                return this.usage == vertexformatelement.usage;
            }
        }
        else
        {
            return false;
        }
    }

    public int hashCode()
    {
        int i = this.type.hashCode();
        i = 31 * i + this.usage.hashCode();
        i = 31 * i + this.index;
        i = 31 * i + this.elementCount;
        return i;
    }

    public void setupBufferState(long pointerIn, int strideIn)
    {
        this.usage.setupBufferState(this.elementCount, this.type.getGlConstant(), strideIn, pointerIn, this.index);
    }

    public void clearBufferState()
    {
        this.usage.clearBufferState(this.index);
    }

    public static enum Type
    {
        FLOAT(4, "Float", 5126),
        UBYTE(1, "Unsigned Byte", 5121),
        BYTE(1, "Byte", 5120),
        USHORT(2, "Unsigned Short", 5123),
        SHORT(2, "Short", 5122),
        UINT(4, "Unsigned Int", 5125),
        INT(4, "Int", 5124);

        private final int size;
        private final String displayName;
        private final int glConstant;

        private Type(int p_i3442_3_, String p_i3442_4_, int p_i3442_5_)
        {
            this.size = p_i3442_3_;
            this.displayName = p_i3442_4_;
            this.glConstant = p_i3442_5_;
        }

        public int getSize()
        {
            return this.size;
        }

        public String getDisplayName()
        {
            return this.displayName;
        }

        public int getGlConstant()
        {
            return this.glConstant;
        }
    }

    public static enum Usage
    {
        POSITION("Position", (p_227914_0_, p_227914_1_, p_227914_2_, p_227914_3_, p_227914_5_) -> {
            GlStateManager.vertexPointer(p_227914_0_, p_227914_1_, p_227914_2_, p_227914_3_);
            GlStateManager.enableClientState(32884);
        }, (p_227912_0_) -> {
            GlStateManager.disableClientState(32884);
        }),
        NORMAL("Normal", (p_227913_0_, p_227913_1_, p_227913_2_, p_227913_3_, p_227913_5_) -> {
            GlStateManager.normalPointer(p_227913_1_, p_227913_2_, p_227913_3_);
            GlStateManager.enableClientState(32885);
        }, (p_227910_0_) -> {
            GlStateManager.disableClientState(32885);
        }),
        COLOR("Vertex Color", (p_227911_0_, p_227911_1_, p_227911_2_, p_227911_3_, p_227911_5_) -> {
            GlStateManager.colorPointer(p_227911_0_, p_227911_1_, p_227911_2_, p_227911_3_);
            GlStateManager.enableClientState(32886);
        }, (p_227908_0_) -> {
            GlStateManager.disableClientState(32886);
            GlStateManager.clearCurrentColor();
        }),
        UV("UV", (p_227909_0_, p_227909_1_, p_227909_2_, p_227909_3_, p_227909_5_) -> {
            GlStateManager.clientActiveTexture(33984 + p_227909_5_);
            GlStateManager.texCoordPointer(p_227909_0_, p_227909_1_, p_227909_2_, p_227909_3_);
            GlStateManager.enableClientState(32888);
            GlStateManager.clientActiveTexture(33984);
        }, (p_227906_0_) -> {
            GlStateManager.clientActiveTexture(33984 + p_227906_0_);
            GlStateManager.disableClientState(32888);
            GlStateManager.clientActiveTexture(33984);
        }),
        PADDING("Padding", (p_227907_0_, p_227907_1_, p_227907_2_, p_227907_3_, p_227907_5_) -> {
        }, (p_227904_0_) -> {
        }),
        GENERIC("Generic", (p_227905_0_, p_227905_1_, p_227905_2_, p_227905_3_, p_227905_5_) -> {
            GlStateManager.enableVertexAttribArray(p_227905_5_);
            GlStateManager.vertexAttribPointer(p_227905_5_, p_227905_0_, p_227905_1_, false, p_227905_2_, p_227905_3_);
        }, GlStateManager::glEnableVertexAttribArray);

        private final String displayName;
        private final VertexFormatElement.Usage.ISetupState setupState;
        private final IntConsumer clearState;

        private Usage(String p_i3190_3_, VertexFormatElement.Usage.ISetupState p_i3190_4_, IntConsumer p_i3190_5_)
        {
            this.displayName = p_i3190_3_;
            this.setupState = p_i3190_4_;
            this.clearState = p_i3190_5_;
        }

        private void setupBufferState(int countIn, int glTypeIn, int strideIn, long pointerIn, int indexIn)
        {
            this.setupState.setupBufferState(countIn, glTypeIn, strideIn, pointerIn, indexIn);
        }

        public void clearBufferState(int indexIn)
        {
            this.clearState.accept(indexIn);
        }

        public String getDisplayName()
        {
            return this.displayName;
        }

        interface ISetupState {
            void setupBufferState(int p_setupBufferState_1_, int p_setupBufferState_2_, int p_setupBufferState_3_, long p_setupBufferState_4_, int p_setupBufferState_6_);
        }
    }
}
