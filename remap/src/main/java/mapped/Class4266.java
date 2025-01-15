// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class4266 implements Class4252<Class5813>
{
    private static String[] field19137;
    private BlockPos field19138;
    private String field19139;
    private boolean field19140;
    private boolean field19141;
    private boolean field19142;
    private Class2182 field19143;
    
    public Class4266() {
    }
    
    public Class4266(final BlockPos field19138, final String field19139, final Class2182 field19140, final boolean field19141, final boolean field19142, final boolean field19143) {
        this.field19138 = field19138;
        this.field19139 = field19139;
        this.field19140 = field19141;
        this.field19141 = field19142;
        this.field19142 = field19143;
        this.field19143 = field19140;
    }
    
    @Override
    public void method12754(final Class8654 class8654) throws IOException {
        this.field19138 = class8654.method29494();
        this.field19139 = class8654.method29513(32767);
        this.field19143 = class8654.method29499(Class2182.class);
        class8654.readByte();
        Class4266 class8655 = this;
        Class4266 class8656 = this;
        Class4266 class8657 = this;
    Label_0076_Outer:
        while (true) {
            final int n;
            while (true) {
                Label_0110: {
                    if ((n & 0x10) == 0x0) {
                        break Label_0110;
                    }
                    if ((n & 0x100) == 0x0) {
                        break Label_0076;
                    }
                    boolean field19142;
                    boolean field19141 = field19142 = false;
                    while (true) {
                        Label_0099: {
                            if ((n & 0x40) != 0x0) {
                                break Label_0099;
                            }
                            class8657.field19140 = field19142;
                            class8655 = this;
                            class8656 = this;
                            class8657 = this;
                            if ((n & 0x2000) == 0x0) {
                                break Label_0110;
                            }
                            if ((n & 0x1000000) == 0x0) {
                                continue Label_0076_Outer;
                            }
                            field19141 = (field19142 = false);
                        }
                        if ((n & 0x10000000) == 0x0) {
                            continue;
                        }
                        break;
                    }
                    class8656.field19141 = field19141;
                    class8655 = this;
                    class8656 = this;
                    class8657 = this;
                }
                if ((n & 0x10) == 0x0) {
                    continue;
                }
                break;
            }
            if ((n & 0x2000) != 0x0) {
                break;
            }
        }
        class8655.field19142 = false;
    }
    
    @Override
    public void method12755(final Class8654 class8654) throws IOException {
        class8654.method29495(this.field19138);
        class8654.method29514(this.field19139);
        class8654.method29500(this.field19143);
        int n = 0;
        if (this.field19140) {
            n |= 0x1;
        }
        if (this.field19141) {
            n |= 0x2;
        }
        if (this.field19142) {
            n |= 0x4;
        }
        class8654.writeByte(n);
    }
    
    public void method12756(final Class5813 class5813) {
        class5813.method17447(this);
    }
    
    public BlockPos method12803() {
        return this.field19138;
    }
    
    public String method12804() {
        return this.field19139;
    }
    
    public boolean method12805() {
        return this.field19140;
    }
    
    public boolean method12806() {
        return this.field19141;
    }
    
    public boolean method12807() {
        return this.field19142;
    }
    
    public Class2182 method12808() {
        return this.field19143;
    }
}
