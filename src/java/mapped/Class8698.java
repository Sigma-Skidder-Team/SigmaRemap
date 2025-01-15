// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public final class Class8698
{
    private final Class1995 field36554;
    private final String field36555;
    
    public Class1995 method29816() {
        return this.field36554;
    }
    
    public String method29817() {
        return this.field36555;
    }
    
    @Override
    public String toString() {
        return "ClickEvent(action=" + this.method29816() + ", value=" + this.method29817() + ")";
    }
    
    public Class8698(final Class1995 field36554, final String field36555) {
        this.field36554 = field36554;
        this.field36555 = field36555;
    }
}
