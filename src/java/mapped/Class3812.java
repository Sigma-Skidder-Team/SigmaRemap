// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class3812 extends Class3703
{
    private int[] field17344;
    private int[][] field17345;
    
    public Class3812() {
        super("Sample Dependency Box");
    }
    
    @Override
    public void method11381(final Class9131 class9131) throws IOException {
        super.method11381(class9131);
        for (int method11688 = ((Class3815)this.field17139.method11499(1937011578L)).method11688(), i = 0; i < method11688; ++i) {
            this.field17344[i] = (int)class9131.method33137(2);
            for (int j = 0; j < this.field17344[i]; ++j) {
                this.field17345[i][j] = (int)class9131.method33137(2);
            }
        }
    }
    
    public int[] method11682() {
        return this.field17344;
    }
    
    public int[][] method11683() {
        return this.field17345;
    }
}
