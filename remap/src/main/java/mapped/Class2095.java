// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.MathHelper;

public enum Class2095
{
    field12111(false), 
    field12112(true), 
    field12113(false), 
    field12114(false), 
    field12115(true), 
    field12116(true), 
    field12117(false), 
    field12118(false), 
    field12119(true, 5393476), 
    field12120(true, 3830373), 
    field12121(true), 
    field12122(true), 
    field12123(true), 
    field12124(true), 
    field12125(true), 
    field12126(true), 
    field12127(true), 
    field12128(true), 
    field12129(true), 
    field12130(true), 
    field12131(true), 
    field12132(true), 
    field12133(true), 
    field12134(true), 
    field12135(true), 
    field12136(true), 
    field12137(true);
    
    private final byte field12138;
    private final boolean field12139;
    private final int field12140;
    
    Class2095(final boolean b) {
        this(b, -1);
    }
    
    Class2095(final boolean field12139, final int field12140) {
        this.field12138 = (byte)this.ordinal();
        this.field12139 = field12139;
        this.field12140 = field12140;
    }
    
    public byte method8212() {
        return this.field12138;
    }
    
    public boolean method8213() {
        return this.field12139;
    }
    
    public boolean method8214() {
        return this.field12140 >= 0;
    }
    
    public int method8215() {
        return this.field12140;
    }
    
    public static Class2095 method8216(final byte b) {
        return values()[MathHelper.method35651(b, 0, values().length - 1)];
    }
}
