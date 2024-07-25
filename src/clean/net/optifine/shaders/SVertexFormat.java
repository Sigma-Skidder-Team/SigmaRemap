package net.optifine.shaders;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import net.minecraft.client.renderer.vertex.VertexFormat;
import net.minecraft.client.renderer.vertex.VertexFormatElement;

public class SVertexFormat
{
    public static final int vertexSizeBlock = 16;
    public static final int offsetMidTexCoord = 9;
    public static final int offsetTangent = 11;
    public static final int offsetEntity = 13;
    public static final VertexFormat defVertexFormatTextured = makeDefVertexFormatTextured();

    public static VertexFormat makeExtendedFormatBlock(VertexFormat blockVanilla)
    {
        Builder<VertexFormatElement> builder = ImmutableList.builder();
        builder.addAll(blockVanilla.getElements());
        builder.add(new VertexFormatElement(0, VertexFormatElement.Type.BYTE, VertexFormatElement.Usage.PADDING, 3));
        builder.add(new VertexFormatElement(0, VertexFormatElement.Type.BYTE, VertexFormatElement.Usage.PADDING, 1));
        builder.add(new VertexFormatElement(0, VertexFormatElement.Type.FLOAT, VertexFormatElement.Usage.PADDING, 2));
        builder.add(new VertexFormatElement(0, VertexFormatElement.Type.SHORT, VertexFormatElement.Usage.PADDING, 4));
        builder.add(new VertexFormatElement(0, VertexFormatElement.Type.SHORT, VertexFormatElement.Usage.PADDING, 4));
        builder.add(new VertexFormatElement(0, VertexFormatElement.Type.BYTE, VertexFormatElement.Usage.PADDING, 4));
        return new VertexFormat(builder.build());
    }

    public static VertexFormat makeDefVertexFormatItem()
    {
        Builder<VertexFormatElement> builder = ImmutableList.builder();
        builder.add(new VertexFormatElement(0, VertexFormatElement.Type.FLOAT, VertexFormatElement.Usage.POSITION, 3));
        builder.add(new VertexFormatElement(0, VertexFormatElement.Type.UBYTE, VertexFormatElement.Usage.COLOR, 4));
        builder.add(new VertexFormatElement(0, VertexFormatElement.Type.FLOAT, VertexFormatElement.Usage.UV, 2));
        builder.add(new VertexFormatElement(0, VertexFormatElement.Type.SHORT, VertexFormatElement.Usage.PADDING, 2));
        builder.add(new VertexFormatElement(0, VertexFormatElement.Type.BYTE, VertexFormatElement.Usage.NORMAL, 3));
        builder.add(new VertexFormatElement(0, VertexFormatElement.Type.BYTE, VertexFormatElement.Usage.PADDING, 1));
        builder.add(new VertexFormatElement(0, VertexFormatElement.Type.FLOAT, VertexFormatElement.Usage.PADDING, 2));
        builder.add(new VertexFormatElement(0, VertexFormatElement.Type.SHORT, VertexFormatElement.Usage.PADDING, 4));
        builder.add(new VertexFormatElement(0, VertexFormatElement.Type.SHORT, VertexFormatElement.Usage.PADDING, 4));
        return new VertexFormat(builder.build());
    }

    public static VertexFormat makeDefVertexFormatTextured()
    {
        Builder<VertexFormatElement> builder = ImmutableList.builder();
        builder.add(new VertexFormatElement(0, VertexFormatElement.Type.FLOAT, VertexFormatElement.Usage.POSITION, 3));
        builder.add(new VertexFormatElement(0, VertexFormatElement.Type.UBYTE, VertexFormatElement.Usage.PADDING, 4));
        builder.add(new VertexFormatElement(0, VertexFormatElement.Type.FLOAT, VertexFormatElement.Usage.UV, 2));
        builder.add(new VertexFormatElement(0, VertexFormatElement.Type.SHORT, VertexFormatElement.Usage.PADDING, 2));
        builder.add(new VertexFormatElement(0, VertexFormatElement.Type.BYTE, VertexFormatElement.Usage.NORMAL, 3));
        builder.add(new VertexFormatElement(0, VertexFormatElement.Type.BYTE, VertexFormatElement.Usage.PADDING, 1));
        builder.add(new VertexFormatElement(0, VertexFormatElement.Type.FLOAT, VertexFormatElement.Usage.PADDING, 2));
        builder.add(new VertexFormatElement(0, VertexFormatElement.Type.SHORT, VertexFormatElement.Usage.PADDING, 4));
        builder.add(new VertexFormatElement(0, VertexFormatElement.Type.SHORT, VertexFormatElement.Usage.PADDING, 4));
        return new VertexFormat(builder.build());
    }
}
