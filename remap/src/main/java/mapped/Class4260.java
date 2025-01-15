// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class4260 implements Class4252<Class5800>
{
    public Class344 field19115;
    public int field19116;
    public int field19117;
    public int field19118;
    public Class2250 field19119;
    
    public Class4260() {
    }
    
    public Class4260(final Class9535 class9535, final Class344 class9536) {
        this(class9535, class9536, new Class2260(""));
    }
    
    public Class4260(final Class9535 class9535, final Class344 field19115, final Class2250 field19116) {
        this.field19115 = field19115;
        final Class511 method35596 = class9535.method35596();
        switch (Class8429.field34593[field19115.ordinal()]) {
            case 1: {
                this.field19118 = class9535.method35599();
                this.field19117 = ((method35596 == null) ? -1 : method35596.method1643());
                break;
            }
            case 2: {
                this.field19116 = class9535.method35602().method1643();
                this.field19117 = ((method35596 == null) ? -1 : method35596.method1643());
                this.field19119 = field19116;
                break;
            }
        }
    }
    
    @Override
    public void method12754(final Class8654 class8654) throws IOException {
        this.field19115 = class8654.method29499(Class344.class);
        if (this.field19115 != Class344.field2121) {
            if (this.field19115 == Class344.field2122) {
                this.field19116 = class8654.method29501();
                this.field19117 = class8654.readInt();
                this.field19119 = class8654.method29497();
            }
        }
        else {
            this.field19118 = class8654.method29501();
            this.field19117 = class8654.readInt();
        }
    }
    
    @Override
    public void method12755(final Class8654 class8654) throws IOException {
        class8654.method29500(this.field19115);
        if (this.field19115 != Class344.field2121) {
            if (this.field19115 == Class344.field2122) {
                class8654.method29505(this.field19116);
                class8654.writeInt(this.field19117);
                class8654.method29498(this.field19119);
            }
        }
        else {
            class8654.method29505(this.field19118);
            class8654.writeInt(this.field19117);
        }
    }
    
    public void method12764(final Class5800 class5800) {
        class5800.method17334(this);
    }
    
    @Override
    public boolean method12763() {
        return this.field19115 == Class344.field2122;
    }
}
