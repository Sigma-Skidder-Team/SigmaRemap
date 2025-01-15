// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class4358 implements Class4252<Class5813>
{
    private static String[] field19513;
    private boolean field19514;
    private boolean field19515;
    private boolean field19516;
    private boolean field19517;
    private float field19518;
    private float field19519;
    
    public Class4358() {
    }
    
    public Class4358(final Class6999 class6999) {
        this.method13088(class6999.field27301);
        this.method13090(class6999.field27302);
        this.method13092(class6999.field27303);
        this.method13094(class6999.field27304);
        this.method13095(class6999.method21425());
        this.method13096(class6999.method21427());
    }
    
    @Override
    public void method12754(final Class8654 class8654) throws IOException {
        class8654.readByte();
        Class4358 class8655 = this;
        Class4358 class8656 = this;
        Class4358 class8657 = this;
        Class4358 class8658 = this;
        final int n;
        boolean b3;
        boolean b2;
        boolean b;
        Label_0109_Outer:Label_0058_Outer:
        while (true) {
        Label_0058:
            while (true) {
                while (true) {
                    Label_0157: {
                        if ((n & 0x1000000) == 0x0) {
                            break Label_0157;
                        }
                        if ((n & 0x10) != 0x0) {
                            break Label_0109;
                        }
                        if ((n & 0x400) != 0x0) {
                            break Label_0058;
                        }
                        b = (b2 = (b3 = false));
                    Label_0091_Outer:
                        while (true) {
                            while (true) {
                                Label_0136: {
                                    if ((n & Integer.MAX_VALUE) == 0x0) {
                                        break Label_0136;
                                    }
                                    if ((n & 0x800000) == 0x0) {
                                        break Label_0091;
                                    }
                                    class8658.method13088(b2);
                                    class8655 = this;
                                    class8656 = this;
                                    class8657 = this;
                                    class8658 = this;
                                    if ((n & 0x4) != 0x0) {
                                        break Label_0157;
                                    }
                                    if ((n & Integer.MAX_VALUE) == 0x0) {
                                        break Label_0109;
                                    }
                                    if ((n & 0x100000) != 0x0) {
                                        continue Label_0109_Outer;
                                    }
                                    b = (b2 = (b3 = false));
                                    if ((n & 0x1000000) == 0x0) {
                                        break Label_0136;
                                    }
                                    if ((n & Integer.MAX_VALUE) == 0x0) {
                                        continue Label_0091_Outer;
                                    }
                                    class8657.method13090(b);
                                    class8655 = this;
                                    class8656 = this;
                                    class8657 = this;
                                    class8658 = this;
                                    if ((n & 0x8000000) != 0x0) {
                                        break Label_0157;
                                    }
                                    if ((n & 0x400) != 0x0) {
                                        continue Label_0058;
                                    }
                                    if ((n & 0x10) != 0x0) {
                                        continue Label_0109_Outer;
                                    }
                                    b = (b2 = (b3 = false));
                                }
                                if ((n & 0x8000) != 0x0) {
                                    continue;
                                }
                                break;
                            }
                            if ((n & 0x100000) != 0x0) {
                                continue Label_0091_Outer;
                            }
                            break;
                        }
                        class8656.method13092(b3);
                        class8655 = this;
                        class8656 = this;
                        class8657 = this;
                        class8658 = this;
                    }
                    if ((n & 0x100000) != 0x0) {
                        continue Label_0058_Outer;
                    }
                    break;
                }
                if ((n & 0x400) != 0x0) {
                    continue Label_0058;
                }
                break;
            }
            if ((n & 0x4000000) != 0x0) {
                continue Label_0109_Outer;
            }
            break;
        }
        class8655.method13094(false);
        this.method13095(class8654.readFloat());
        this.method13096(class8654.readFloat());
    }
    
    @Override
    public void method12755(final Class8654 class8654) throws IOException {
        int n = 0;
        if (this.method13087()) {
            n = (byte)(n | 0x1);
        }
        if (this.method13089()) {
            n = (byte)(n | 0x2);
        }
        if (this.method13091()) {
            n = (byte)(n | 0x4);
        }
        if (this.method13093()) {
            n = (byte)(n | 0x8);
        }
        class8654.writeByte(n);
        class8654.writeFloat(this.field19518);
        class8654.writeFloat(this.field19519);
    }
    
    public void method12756(final Class5813 class5813) {
        class5813.method17430(this);
    }
    
    public boolean method13087() {
        return this.field19514;
    }
    
    public void method13088(final boolean field19514) {
        this.field19514 = field19514;
    }
    
    public boolean method13089() {
        return this.field19515;
    }
    
    public void method13090(final boolean field19515) {
        this.field19515 = field19515;
    }
    
    public boolean method13091() {
        return this.field19516;
    }
    
    public void method13092(final boolean field19516) {
        this.field19516 = field19516;
    }
    
    public boolean method13093() {
        return this.field19517;
    }
    
    public void method13094(final boolean field19517) {
        this.field19517 = field19517;
    }
    
    public void method13095(final float field19518) {
        this.field19518 = field19518;
    }
    
    public void method13096(final float field19519) {
        this.field19519 = field19519;
    }
}
