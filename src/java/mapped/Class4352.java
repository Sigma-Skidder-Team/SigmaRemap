// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class4352 implements Class4252<Class5800>
{
    private static String[] field19492;
    private Class2019 field19493;
    private Class2250 field19494;
    private int field19495;
    private int field19496;
    private int field19497;
    
    public Class4352() {
    }
    
    public Class4352(final Class2019 class2019, final Class2250 class2020) {
        this(class2019, class2020, -1, -1, -1);
    }
    
    public Class4352(final int n, final int n2, final int n3) {
        this(Class2019.field11517, null, n, n2, n3);
    }
    
    public Class4352(final Class2019 field19493, final Class2250 field19494, final int field19495, final int field19496, final int field19497) {
        this.field19493 = field19493;
        this.field19494 = field19494;
        this.field19495 = field19495;
        this.field19496 = field19496;
        this.field19497 = field19497;
    }
    
    @Override
    public void method12754(final Class8654 class8654) throws IOException {
        this.field19493 = class8654.method29499(Class2019.class);
        Label_0059: {
            if (this.field19493 != Class2019.field11514) {
                if (this.field19493 != Class2019.field11515) {
                    if (this.field19493 != Class2019.field11516) {
                        break Label_0059;
                    }
                }
            }
            this.field19494 = class8654.method29497();
        }
        if (this.field19493 == Class2019.field11517) {
            this.field19495 = class8654.readInt();
            this.field19496 = class8654.readInt();
            this.field19497 = class8654.readInt();
        }
    }
    
    @Override
    public void method12755(final Class8654 class8654) throws IOException {
        class8654.method29500(this.field19493);
        Label_0056: {
            if (this.field19493 != Class2019.field11514) {
                if (this.field19493 != Class2019.field11515) {
                    if (this.field19493 != Class2019.field11516) {
                        break Label_0056;
                    }
                }
            }
            class8654.method29498(this.field19494);
        }
        if (this.field19493 == Class2019.field11517) {
            class8654.writeInt(this.field19495);
            class8654.writeInt(this.field19496);
            class8654.writeInt(this.field19497);
        }
    }
    
    public void method12764(final Class5800 class5800) {
        class5800.method17338(this);
    }
    
    public Class2019 method13073() {
        return this.field19493;
    }
    
    public Class2250 method13074() {
        return this.field19494;
    }
    
    public int method13075() {
        return this.field19495;
    }
    
    public int method13076() {
        return this.field19496;
    }
    
    public int method13077() {
        return this.field19497;
    }
}
