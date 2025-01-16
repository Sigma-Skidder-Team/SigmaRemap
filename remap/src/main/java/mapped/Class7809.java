// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Optional;

public class Class7809 implements IRenderTypeBuffer
{
    private static String[] field31981;
    private final Impl field31982;
    private final Impl field31983;
    private int field31984;
    private int field31985;
    private int field31986;
    private int field31987;
    
    public Class7809(final Impl field31982) {
        this.field31983 = IRenderTypeBuffer.getImpl(new BufferBuilder(256));
        this.field31984 = 255;
        this.field31985 = 255;
        this.field31986 = 255;
        this.field31987 = 255;
        this.field31982 = field31982;
    }
    
    @Override
    public Class4150 method25214(final Class6332 class6332) {
        if (class6332.method18800()) {
            return new Class4156(this.field31983.method25214(class6332), this.field31984, this.field31985, this.field31986, this.field31987, null);
        }
        final Class4150 method25214 = this.field31982.method25214(class6332);
        final Optional<Class6332> method25215 = class6332.method18799();
        if (!method25215.isPresent()) {
            return method25214;
        }
        return Class9343.method34633(new Class4156(this.field31983.method25214(method25215.get()), this.field31984, this.field31985, this.field31986, this.field31987, null), method25214);
    }
    
    public void method25218(final int field31984, final int field31985, final int field31986, final int field31987) {
        this.field31984 = field31984;
        this.field31985 = field31985;
        this.field31986 = field31986;
        this.field31987 = field31987;
    }
    
    public void method25219() {
        this.field31983.finish();
    }
}
