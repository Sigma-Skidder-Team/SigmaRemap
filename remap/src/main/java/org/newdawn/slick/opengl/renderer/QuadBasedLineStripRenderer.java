package org.newdawn.slick.opengl.renderer;

public class QuadBasedLineStripRenderer implements LineStripRenderer {
    private SGL GL = Renderer.get();
    public static int MAX_POINTS = 10000;
    private boolean antialias;
    private float width = 1.0F;
    private float[] points;
    private float[] colours;
    private int pts;
    private int cpt;
    private DefaultLineStripRenderer def = new DefaultLineStripRenderer();
    private boolean renderHalf;
    private boolean lineCaps = false;

    public QuadBasedLineStripRenderer() {
        this.points = new float[MAX_POINTS * 2];
        this.colours = new float[MAX_POINTS * 4];
    }

    @Override
    public void setLineCaps(boolean caps) {
        this.lineCaps = caps;
    }

    @Override
    public void start() {
        if (this.width != 1.0F) {
            this.pts = 0;
            this.cpt = 0;
            this.GL.flush();
            float[] var3 = this.GL.getCurrentColor();
            this.color(var3[0], var3[1], var3[2], var3[3]);
        } else {
            this.def.start();
        }
    }

    @Override
    public void end() {
        if (this.width != 1.0F) {
            this.renderLines(this.points, this.pts);
        } else {
            this.def.end();
        }
    }

    @Override
    public void vertex(float x, float y) {
        if (this.width != 1.0F) {
            this.points[this.pts * 2] = x;
            this.points[this.pts * 2 + 1] = y;
            this.pts++;
            int var5 = this.pts - 1;
            this.color(this.colours[var5 * 4], this.colours[var5 * 4 + 1], this.colours[var5 * 4 + 2], this.colours[var5 * 4 + 3]);
        } else {
            this.def.vertex(x, y);
        }
    }

    @Override
    public void setWidth(float width) {
        this.width = width;
    }

    @Override
    public void setAntiAlias(boolean antialias) {
        this.def.setAntiAlias(antialias);
        this.antialias = antialias;
    }

    public void renderLines(float[] var1, int var2) {
        if (this.antialias) {
            this.GL.glEnable(SGL.GL_POLYGON_SMOOTH);
            this.renderLinesImpl(var1, var2, this.width + 1.0F);
        }

        this.GL.glDisable(SGL.GL_POLYGON_SMOOTH);
        this.renderLinesImpl(var1, var2, this.width);
        if (this.antialias) {
            this.GL.glEnable(SGL.GL_POLYGON_SMOOTH);
        }
    }

    public void renderLinesImpl(float[] var1, int var2, float var3) {
        float var6 = var3 / 2.0F;
        float var7 = 0.0F;
        float var8 = 0.0F;
        float var9 = 0.0F;
        float var10 = 0.0F;
        this.GL.glBegin(SGL.GL_QUADS);

        for (int var11 = 0; var11 < var2 + 1; var11++) {
            int var12 = var11;
            int var13 = var11 + 1;
            int var14 = var11 - 1;
            if (var14 < 0) {
                var14 += var2;
            }

            if (var13 >= var2) {
                var13 -= var2;
            }

            if (var11 >= var2) {
                var12 = var11 - var2;
            }

            float var15 = var1[var12 * 2];
            float var16 = var1[var12 * 2 + 1];
            float var17 = var1[var13 * 2];
            float var18 = var1[var13 * 2 + 1];
            float var19 = var17 - var15;
            float var20 = var18 - var16;
            if (var19 != 0.0F || var20 != 0.0F) {
                float var21 = var19 * var19 + var20 * var20;
                float var22 = (float) Math.sqrt((double) var21);
                var19 *= var6;
                var20 *= var6;
                var19 /= var22;
                var20 /= var22;
                float var24 = -var19;
                if (var11 != 0) {
                    this.bindColor(var14);
                    this.GL.glVertex3f(var7, var8, 0.0F);
                    this.GL.glVertex3f(var9, var10, 0.0F);
                    this.bindColor(var12);
                    this.GL.glVertex3f(var15 + var20, var16 + var24, 0.0F);
                    this.GL.glVertex3f(var15 - var20, var16 - var24, 0.0F);
                }

                var7 = var17 - var20;
                var8 = var18 - var24;
                var9 = var17 + var20;
                var10 = var18 + var24;
                if (var11 < var2 - 1) {
                    this.bindColor(var12);
                    this.GL.glVertex3f(var15 + var20, var16 + var24, 0.0F);
                    this.GL.glVertex3f(var15 - var20, var16 - var24, 0.0F);
                    this.bindColor(var13);
                    this.GL.glVertex3f(var17 - var20, var18 - var24, 0.0F);
                    this.GL.glVertex3f(var17 + var20, var18 + var24, 0.0F);
                }
            }
        }

        this.GL.glEnd();
        float step = !(var6 <= 12.5F) ? 180.0F / (float) Math.ceil((double) var6 / 2.5) : 5.0F;
        if (this.lineCaps) {
            float var26 = var1[2] - var1[0];
            float var28 = var1[3] - var1[1];
            float var30 = (float) Math.toDegrees(Math.atan2((double) var28, (double) var26)) + 90.0F;
            if (var26 != 0.0F || var28 != 0.0F) {
                this.GL.glBegin(SGL.GL_TRIANGLE_FAN);
                this.bindColor(0);
                this.GL.glVertex2f(var1[0], var1[1]);

                for (int var32 = 0; (float) var32 < 180.0F + step; var32 = (int) ((float) var32 + step)) {
                    float var34 = (float) Math.toRadians((double) (var30 + (float) var32));
                    this.GL
                            .glVertex2f(var1[0] + (float) (Math.cos((double) var34) * (double) var6), var1[1] + (float) (Math.sin((double) var34) * (double) var6));
                }

                this.GL.glEnd();
            }
        }

        if (this.lineCaps) {
            float var27 = var1[var2 * 2 - 2] - var1[var2 * 2 - 4];
            float var29 = var1[var2 * 2 - 1] - var1[var2 * 2 - 3];
            float var31 = (float) Math.toDegrees(Math.atan2((double) var29, (double) var27)) - 90.0F;
            if (var27 != 0.0F || var29 != 0.0F) {
                this.GL.glBegin(SGL.GL_TRIANGLE_FAN);
                this.bindColor(var2 - 1);
                this.GL.glVertex2f(var1[var2 * 2 - 2], var1[var2 * 2 - 1]);

                for (int var33 = 0; (float) var33 < 180.0F + step; var33 = (int) ((float) var33 + step)) {
                    float var35 = (float) Math.toRadians((double) (var31 + (float) var33));
                    this.GL
                            .glVertex2f(
                                    var1[var2 * 2 - 2] + (float) (Math.cos((double) var35) * (double) var6), var1[var2 * 2 - 1] + (float) (Math.sin((double) var35) * (double) var6)
                            );
                }

                this.GL.glEnd();
            }
        }
    }

    private void bindColor(int var1) {
        if (var1 < this.cpt) {
            if (!this.renderHalf) {
                this.GL.glColor4f(this.colours[var1 * 4], this.colours[var1 * 4 + 1], this.colours[var1 * 4 + 2], this.colours[var1 * 4 + 3]);
            } else {
                this.GL
                        .glColor4f(
                                this.colours[var1 * 4] * 0.5F,
                                this.colours[var1 * 4 + 1] * 0.5F,
                                this.colours[var1 * 4 + 2] * 0.5F,
                                this.colours[var1 * 4 + 3] * 0.5F
                        );
            }
        }
    }

    @Override
    public void color(float r, float g, float b, float a) {
        if (this.width != 1.0F) {
            this.colours[this.pts * 4] = r;
            this.colours[this.pts * 4 + 1] = g;
            this.colours[this.pts * 4 + 2] = b;
            this.colours[this.pts * 4 + 3] = a;
            this.cpt++;
        } else {
            this.def.color(r, g, b, a);
        }
    }

    @Override
    public boolean applyGLLineFixes() {
        return this.width != 1.0F ? this.def.applyGLLineFixes() : this.def.applyGLLineFixes();
    }
}
