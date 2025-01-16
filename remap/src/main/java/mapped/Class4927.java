// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class4927 extends Class4800
{
    private static Minecraft field21081;
    public Class4899 field21082;
    
    public Class4927() {
        super("Spotlight");
        this.method14311(false);
        this.method14239(this.field21082 = new Class4899(this, "search", (this.method14276() - 675) / 2, (int)(this.field20481 * 0.25f), 675, 60, true));
    }
    
    @Override
    public void method14204(final int n) {
        super.method14204(n);
        if (n == 256) {
            Class4927.field21081.displayGuiScreen(null);
        }
    }
    
    static {
        Class4927.field21081 = Minecraft.method5277();
    }
}
