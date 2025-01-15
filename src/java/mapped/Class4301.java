// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.util.UUID;

public class Class4301 implements Class4252<Class5800>
{
    private static String[] field19286;
    private UUID field19287;
    private Class1994 field19288;
    public Class2250 field19289;
    private float field19290;
    private Class2200 field19291;
    private Class342 field19292;
    private boolean field19293;
    private boolean field19294;
    private boolean field19295;
    
    public Class4301() {
    }
    
    public Class4301(final Class1994 field19288, final Class6880 class6880) {
        this.field19288 = field19288;
        this.field19287 = class6880.method21075();
        this.field19289 = class6880.method21076();
        this.field19290 = class6880.method21077();
        this.field19291 = class6880.method21078();
        this.field19292 = class6880.method21079();
        this.field19293 = class6880.method21080();
        this.field19294 = class6880.method21081();
        this.field19295 = class6880.method21082();
    }
    
    @Override
    public void method12754(final Class8654 class8654) throws IOException {
        this.field19287 = class8654.method29504();
        this.field19288 = class8654.method29499(Class1994.class);
        switch (Class8716.field36625[this.field19288.ordinal()]) {
            case 1: {
                this.field19289 = class8654.method29497();
                this.field19290 = class8654.readFloat();
                this.field19291 = class8654.method29499(Class2200.class);
                this.field19292 = class8654.method29499(Class342.class);
                this.method12929(class8654.readUnsignedByte());
                break;
            }
            case 3: {
                this.field19290 = class8654.readFloat();
                break;
            }
            case 4: {
                this.field19289 = class8654.method29497();
                break;
            }
            case 5: {
                this.field19291 = class8654.method29499(Class2200.class);
                this.field19292 = class8654.method29499(Class342.class);
                break;
            }
            case 6: {
                this.method12929(class8654.readUnsignedByte());
                break;
            }
        }
    }
    
    private void method12929(final int n) {
        Class4301 class4301 = this;
        Class4301 class4302 = this;
        Class4301 class4303 = this;
    Label_0035_Outer:
        while (true) {
            final int n2;
            while (true) {
                Label_0069: {
                    if ((n2 & 0x80) != 0x0) {
                        break Label_0069;
                    }
                    if ((n2 & 0x10000) == 0x0) {
                        break Label_0035;
                    }
                    boolean field19295;
                    boolean field19294 = field19295 = false;
                    while (true) {
                        Label_0055: {
                            if ((n2 & 0x80000) != 0x0) {
                                break Label_0055;
                            }
                            class4303.field19293 = field19295;
                            class4301 = this;
                            class4302 = this;
                            class4303 = this;
                            if ((n2 & 0x80000) != 0x0) {
                                break Label_0069;
                            }
                            if ((n2 & 0x4000) == 0x0) {
                                continue Label_0035_Outer;
                            }
                            field19294 = (field19295 = false);
                        }
                        if ((n2 & 0x200000) != 0x0) {
                            continue;
                        }
                        break;
                    }
                    class4302.field19294 = field19294;
                    class4301 = this;
                    class4302 = this;
                    class4303 = this;
                }
                if ((n2 & 0x4000) == 0x0) {
                    continue;
                }
                break;
            }
            if ((n2 & 0x800000) == 0x0) {
                continue Label_0035_Outer;
            }
            break;
        }
        class4301.field19295 = false;
    }
    
    @Override
    public void method12755(final Class8654 class8654) throws IOException {
        class8654.method29503(this.field19287);
        class8654.method29500(this.field19288);
        switch (Class8716.field36625[this.field19288.ordinal()]) {
            case 1: {
                class8654.method29498(this.field19289);
                class8654.writeFloat(this.field19290);
                class8654.method29500(this.field19291);
                class8654.method29500(this.field19292);
                class8654.writeByte(this.method12930());
                break;
            }
            case 3: {
                class8654.writeFloat(this.field19290);
                break;
            }
            case 4: {
                class8654.method29498(this.field19289);
                break;
            }
            case 5: {
                class8654.method29500(this.field19291);
                class8654.method29500(this.field19292);
                break;
            }
            case 6: {
                class8654.writeByte(this.method12930());
                break;
            }
        }
    }
    
    private int method12930() {
        int n = 0;
        if (this.field19293) {
            n |= 0x1;
        }
        if (this.field19294) {
            n |= 0x2;
        }
        if (this.field19295) {
            n |= 0x4;
        }
        return n;
    }
    
    public void method12764(final Class5800 class5800) {
        class5800.method17351(this);
    }
    
    public UUID method12931() {
        return this.field19287;
    }
    
    public Class1994 method12932() {
        return this.field19288;
    }
    
    public Class2250 method12933() {
        return this.field19289;
    }
    
    public float method12934() {
        return this.field19290;
    }
    
    public Class2200 method12935() {
        return this.field19291;
    }
    
    public Class342 method12936() {
        return this.field19292;
    }
    
    public boolean method12937() {
        return this.field19293;
    }
    
    public boolean method12938() {
        return this.field19294;
    }
    
    public boolean method12939() {
        return this.field19295;
    }
}
