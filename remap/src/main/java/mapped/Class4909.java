// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.jello.ClientFonts;

public class Class4909 extends Class4825
{
    private static String[] field20591;
    public int field21003;
    
    public Class4909(final Class4803 class4803, final String s, final int n, final int n2, final int n3, final int n4, final String s2, final int field21003) {
        super(class4803, s, n, n2, n3, n4, false);
        this.method14315(s2);
        this.method14260((class4803, n) -> Minecraft.method5277().method5299().method6422(Class6836.method20933(Class8520.field35662, 1.0f)));
        this.field21003 = field21003;
    }
    
    @Override
    public void method14205(final float n) {
        this.method14317(ClientFonts.Default);
        Class8154.method26876((float)this.field20478, (float)this.field20479, (float)(this.field20478 + this.field20480), (float)(this.field20479 + this.field20481), Class6430.method19118(this.field21003, this.method14304() ? (this.method14308() ? (this.method14309() ? 0.6f : 0.5f) : 0.4f) : 0.25f));
        Class8154.method26879((float)this.field20478, (float)this.field20479, (float)(this.field20478 + this.field20480), (float)(this.field20479 + this.field20481), 2, Class6430.method19118(this.field21003, 0.2f));
        Class8154.method26890(ClientFonts.Default, (float)(this.method14272() + this.method14276() / 2), (float)(this.method14274() + this.method14278() / 2), this.field20495, Class6430.method19118(Class265.field1278.field1292, this.method14304() ? 1.0f : 0.5f), Class2056.field11738, Class2056.field11738);
        super.method14205(n);
    }
}
