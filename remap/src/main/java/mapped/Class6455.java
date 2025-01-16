// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public final class Class6455 implements Class6451
{
    @Override
    public void method19304(final BufferBuilder class4148, final Class1663 class4149) {
        RenderSystem.disableBlend();
        RenderSystem.method30010(true);
        class4149.method5849(Class1774.field9854);
        class4148.begin(7, DefaultVertexFormats.field39613);
    }
    
    @Override
    public void method19305(final Tessellator class7392) {
        class7392.draw();
    }
    
    @Override
    public String toString() {
        return "PARTICLE_SHEET_LIT";
    }
}
