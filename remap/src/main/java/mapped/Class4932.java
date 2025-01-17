// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class4932 extends Class4800
{
    public Minecraft field21122;
    public Class7617 field21123;
    public Class4915 field21124;
    public Class9572 field21125;
    public int field21126;
    public int field21127;
    
    public Class4932() {
        super("SnakeGameScreen");
        this.field21122 = Minecraft.method5277();
        this.field21123 = new Class7617();
        this.field21127 = 14;
        this.method14311(false);
        this.field21123.method23932();
        this.field21125 = new Class9572(200, 0);
        Class6430.method19169();
        final int n = 48;
        final int n2 = 27;
        final int n3 = 14;
        this.method14239(this.field21124 = new Class4915(this, "snake", (this.field20480 - n * n3) / 2, (this.method14278() - n2 * n3) / 2 + 30, n, 27, n3));
    }
    
    @Override
    public void method14205(float method35858) {
        method35858 = this.field21125.method35858();
        final float method35859 = Class7707.method24584(method35858, 0.0f, 1.0f, 1.0f);
        this.method14288(0.8f + method35859 * 0.2f, 0.8f + method35859 * 0.2f);
        Class8154.method26876((float)this.field20478, (float)this.field20479, (float)(this.field20478 + this.field20480), (float)(this.field20479 + this.field20481), Class6430.method19118(Class265.field1273.field1292, 0.25f * method35858));
        super.method14227();
        Class8154.method26913((float)this.field21124.method14272(), (float)this.field21124.method14274(), (float)this.field21124.method14276(), (float)this.field21124.method14278(), 40.0f, method35858);
        Class8154.method26925((float)(this.field21124.method14272() - 20), (float)(this.field21124.method14274() - 20), (float)(this.field21124.method14276() + 40), (float)(this.field21124.method14278() + 40), 14.0f, Class265.field1278.field1292);
        super.method14205(method35858);
        final int n = (this.field20480 - this.field21124.method14276()) / 2;
        final int n2 = (this.field20481 - this.field21124.method14278()) / 2;
        Class8154.method26889(ClientFonts.JelloMedium40, (float)n, (float)(n2 - 60), "Snake", Class265.field1278.field1292);
        this.field21126 = Math.max(this.field21124.method14756(), this.field21126);
        final String string = "Max: " + this.field21126 + "   |   Score: " + this.field21124.method14756();
        Class8154.method26889(ClientFonts.JelloLight20, (float)(n + this.field21124.method14276() - ClientFonts.JelloLight20.getWidth(string)), (float)(n2 - 50), string, Class6430.method19118(Class265.field1278.field1292, 0.8f));
    }
    
    @Override
    public void method14204(final int n) {
        super.method14204(n);
        if (n == 256) {
            Class6430.method19172();
            Minecraft.method5277().displayGuiScreen(null);
        }
    }
}
