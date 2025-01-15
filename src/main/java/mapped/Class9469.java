// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class9469
{
    private static String[] field40722;
    public int field40723;
    public int field40724;
    
    public Class9469(final int field40723, final int field40724) {
        this.field40723 = field40723;
        this.field40724 = field40724;
    }
    
    public int method35234() {
        return this.field40723;
    }
    
    public Class9469 method35235(final Class9469 class9469) {
        return new Class9469(this.field40723 + class9469.field40723, this.field40724 + class9469.field40724);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final Class9469 class9469 = (Class9469)o;
            return this.field40723 == class9469.field40723 && this.field40724 == class9469.field40724;
        }
        return false;
    }
}
