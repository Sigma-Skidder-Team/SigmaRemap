// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class4300 implements Class4252<Class5800>
{
    private static String[] field19279;
    private boolean field19280;
    private boolean field19281;
    private boolean field19282;
    private boolean field19283;
    private float field19284;
    private float field19285;
    
    public Class4300() {
    }
    
    public Class4300(final Class6999 class6999) {
        this.method12918(class6999.field27301);
        this.method12920(class6999.field27302);
        this.method12922(class6999.field27303);
        this.method12924(class6999.field27304);
        this.method12926(class6999.method21425());
        this.method12928(class6999.method21427());
    }
    
    @Override
    public void method12754(final Class8654 class8654) throws IOException {
        class8654.readByte();
        Class4300 class8655 = this;
        Class4300 class8656 = this;
        Class4300 class8657 = this;
        Class4300 class8658 = this;
        final int n;
        boolean b3;
        boolean b2;
        boolean b;
        Label_0118_Outer:Label_0064_Outer:
        while (true) {
        Label_0064:
            while (true) {
                while (true) {
                    Label_0178: {
                        if ((n & 0x80000) != 0x0) {
                            break Label_0178;
                        }
                        if ((n & 0x400000) == 0x0) {
                            break Label_0118;
                        }
                        if ((n & 0x20000000) == 0x0) {
                            break Label_0064;
                        }
                        b = (b2 = (b3 = false));
                    Label_0097_Outer:
                        while (true) {
                            while (true) {
                                Label_0154: {
                                    if ((n & Integer.MAX_VALUE) == 0x0) {
                                        break Label_0154;
                                    }
                                    if ((n & 0x2) != 0x0) {
                                        break Label_0097;
                                    }
                                    class8658.method12918(b2);
                                    class8655 = this;
                                    class8656 = this;
                                    class8657 = this;
                                    class8658 = this;
                                    if ((n & 0x8000000) != 0x0) {
                                        break Label_0178;
                                    }
                                    if ((n & 0x1000) != 0x0) {
                                        break Label_0118;
                                    }
                                    if ((n & 0x400) == 0x0) {
                                        continue Label_0118_Outer;
                                    }
                                    b = (b2 = (b3 = false));
                                    if ((n & 0x80000) != 0x0) {
                                        break Label_0154;
                                    }
                                    if ((n & 0x80000) != 0x0) {
                                        continue Label_0097_Outer;
                                    }
                                    class8657.method12920(b);
                                    class8655 = this;
                                    class8656 = this;
                                    class8657 = this;
                                    class8658 = this;
                                    if ((n & Integer.MAX_VALUE) == 0x0) {
                                        break Label_0178;
                                    }
                                    if ((n & 0x20000) == 0x0) {
                                        continue Label_0064;
                                    }
                                    if ((n & 0x8000000) != 0x0) {
                                        continue Label_0118_Outer;
                                    }
                                    b = (b2 = (b3 = false));
                                }
                                if ((n & Integer.MAX_VALUE) == 0x0) {
                                    continue;
                                }
                                break;
                            }
                            if ((n & 0x40000000) != 0x0) {
                                continue Label_0097_Outer;
                            }
                            break;
                        }
                        class8656.method12922(b3);
                        class8655 = this;
                        class8656 = this;
                        class8657 = this;
                        class8658 = this;
                    }
                    if ((n & 0x20000) == 0x0) {
                        continue Label_0064_Outer;
                    }
                    break;
                }
                if ((n & 0x80000) != 0x0) {
                    continue Label_0064;
                }
                break;
            }
            if ((n & 0x4000000) != 0x0) {
                break;
            }
        }
        class8655.method12924(false);
        this.method12926(class8654.readFloat());
        this.method12928(class8654.readFloat());
    }
    
    @Override
    public void method12755(final Class8654 class8654) throws IOException {
        int n = 0;
        if (this.method12917()) {
            n = (byte)(n | 0x1);
        }
        if (this.method12919()) {
            n = (byte)(n | 0x2);
        }
        if (this.method12921()) {
            n = (byte)(n | 0x4);
        }
        if (this.method12923()) {
            n = (byte)(n | 0x8);
        }
        class8654.writeByte(n);
        class8654.writeFloat(this.field19284);
        class8654.writeFloat(this.field19285);
    }
    
    public void method12764(final Class5800 class5800) {
        class5800.method17343(this);
    }
    
    public boolean method12917() {
        return this.field19280;
    }
    
    public void method12918(final boolean field19280) {
        this.field19280 = field19280;
    }
    
    public boolean method12919() {
        return this.field19281;
    }
    
    public void method12920(final boolean field19281) {
        this.field19281 = field19281;
    }
    
    public boolean method12921() {
        return this.field19282;
    }
    
    public void method12922(final boolean field19282) {
        this.field19282 = field19282;
    }
    
    public boolean method12923() {
        return this.field19283;
    }
    
    public void method12924(final boolean field19283) {
        this.field19283 = field19283;
    }
    
    public float method12925() {
        return this.field19284;
    }
    
    public void method12926(final float field19284) {
        this.field19284 = field19284;
    }
    
    public float method12927() {
        return this.field19285;
    }
    
    public void method12928(final float field19285) {
        this.field19285 = field19285;
    }
}
