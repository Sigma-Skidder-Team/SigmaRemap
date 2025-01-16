// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Tessellator
{
    private static String[] field28467;
    private final BufferBuilder field28468;
    private static final Tessellator field28469;
    
    public static Tessellator getInstance() {
        RenderSystem.method29989(RenderSystem::method29988);
        return Tessellator.field28469;
    }
    
    public Tessellator(final int n) {
        this.field28468 = new BufferBuilder(n);
    }
    
    public Tessellator() {
        this(2097152);
    }
    
    public void draw() {
        if (this.field28468.field18497 != null) {
            Class7663.method24286(this.field28468.field18497);
        }
        this.field28468.finishDrawing();
        WorldVertexBufferUploader.draw(this.field28468);
    }
    
    public BufferBuilder getBuffer() {
        return this.field28468;
    }
    
    static {
        field28469 = new Tessellator();
    }
}
