// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class4256 implements Class4252<Class5813>
{
    private static String[] field19093;
    private int field19094;
    private int field19095;
    private int field19096;
    private short field19097;
    private ItemStack field19098;
    private Class2133 field19099;
    
    public Class4256() {
        this.field19098 = ItemStack.field34174;
    }
    
    public Class4256(final int field19094, final int field19095, final int field19096, final Class2133 field19097, final ItemStack class8321, final short field19098) {
        this.field19098 = ItemStack.field34174;
        this.field19094 = field19094;
        this.field19095 = field19095;
        this.field19096 = field19096;
        this.field19098 = class8321.method27641();
        this.field19097 = field19098;
        this.field19099 = field19097;
    }
    
    public void method12756(final Class5813 class5813) {
        class5813.method17423(this);
    }
    
    @Override
    public void method12754(final Class8654 class8654) throws IOException {
        this.field19094 = class8654.readByte();
        this.field19095 = class8654.readShort();
        this.field19096 = class8654.readByte();
        this.field19097 = class8654.readShort();
        this.field19099 = class8654.method29499(Class2133.class);
        this.field19098 = class8654.method29511();
    }
    
    @Override
    public void method12755(final Class8654 class8654) throws IOException {
        class8654.writeByte(this.field19094);
        class8654.writeShort(this.field19095);
        class8654.writeByte(this.field19096);
        class8654.writeShort(this.field19097);
        class8654.method29500(this.field19099);
        class8654.method29509(this.field19098);
    }
    
    public int method12773() {
        return this.field19094;
    }
    
    public int method12774() {
        return this.field19095;
    }
    
    public int method12775() {
        return this.field19096;
    }
    
    public short method12776() {
        return this.field19097;
    }
    
    public ItemStack method12777() {
        return this.field19098;
    }
    
    public Class2133 method12778() {
        return this.field19099;
    }
}
