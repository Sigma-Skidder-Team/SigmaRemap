// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class4325 implements Class4252<Class5800>
{
    private static String[] field19369;
    private int[] field19370;
    
    public Class4325() {
    }
    
    public Class4325(final int... field19370) {
        this.field19370 = field19370;
    }
    
    @Override
    public void method12754(final Class8654 class8654) throws IOException {
        this.field19370 = new int[class8654.method29501()];
        for (int i = 0; i < this.field19370.length; ++i) {
            this.field19370[i] = class8654.method29501();
        }
    }
    
    @Override
    public void method12755(final Class8654 class8654) throws IOException {
        class8654.method29505(this.field19370.length);
        final int[] field19370 = this.field19370;
        for (int length = field19370.length, i = 0; i < length; ++i) {
            class8654.method29505(field19370[i]);
        }
    }
    
    public void method12764(final Class5800 class5800) {
        class5800.method17284(this);
    }
    
    public int[] method12989() {
        return this.field19370;
    }
}
