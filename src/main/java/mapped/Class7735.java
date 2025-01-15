// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public interface Class7735
{
    int method24684();
    
    Class2250 method24685(final int p0);
    
    default Class2250 method24686(final int n) {
        return (n >= 0 && n < this.method24684()) ? this.method24685(n) : new Class2260("");
    }
    
    default Class7735 method24687(final Class8321 class8321) {
        final Class3820 method27622 = class8321.method27622();
        if (method27622 != Class7739.field31513) {
            return (method27622 != Class7739.field31512) ? Class723.field3946 : new Class7736(class8321);
        }
        return new Class7738(class8321);
    }
}
