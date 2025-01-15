// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class2260 extends Class2251
{
    private final String field13817;
    
    public Class2260(final String field13817) {
        this.field13817 = field13817;
    }
    
    public String method8498() {
        return this.field13817;
    }
    
    @Override
    public String method8459() {
        return this.field13817;
    }
    
    public Class2260 method8499() {
        return new Class2260(this.field13817);
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof Class2260 && this.field13817.equals(((Class2260)o).method8498()) && super.equals(o));
    }
    
    @Override
    public String toString() {
        return "TextComponent{text='" + this.field13817 + '\'' + ", siblings=" + this.field13791 + ", style=" + this.method8456() + '}';
    }
}
