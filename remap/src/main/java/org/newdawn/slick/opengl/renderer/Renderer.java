package org.newdawn.slick.opengl.renderer;

public class Renderer {
    public static final int IMMEDIATE_RENDERER = 1;
    public static final int VERTEX_ARRAY_RENDERER = 2;
    public static final int DEFAULT_LINE_STRIP_RENDERER = 3;
    public static final int QUAD_BASED_LINE_STRIP_RENDERER = 4;
    private static SGL renderer = new ImmediateModeOGLRenderer();
    private static LineStripRenderer lineStripRenderer = new DefaultLineStripRenderer();

    public static void setRenderer(int type) {
        switch (type) {
            case IMMEDIATE_RENDERER:
                setRenderer(new ImmediateModeOGLRenderer());
                return;
            case VERTEX_ARRAY_RENDERER:
                setRenderer(new VAOGLRenderer());
                return;
        }

        throw new RuntimeException("Unknown renderer type: " + type);
    }

    public static void setLineStripRenderer(int type) {
        switch (type) {
            case DEFAULT_LINE_STRIP_RENDERER:
                setLineStripRenderer(new DefaultLineStripRenderer());
                return;
            case QUAD_BASED_LINE_STRIP_RENDERER:
                setLineStripRenderer(new QuadBasedLineStripRenderer());
                return;
        }

        throw new RuntimeException("Unknown line strip renderer type: " + type);
    }

    public static void setLineStripRenderer(LineStripRenderer renderer) {
        lineStripRenderer = renderer;
    }

    public static void setRenderer(SGL r) {
        Renderer.renderer = r;
    }

    public static SGL get() {
        return renderer;
    }

    public static LineStripRenderer getLineStripRenderer() {
        return lineStripRenderer;
    }
}
