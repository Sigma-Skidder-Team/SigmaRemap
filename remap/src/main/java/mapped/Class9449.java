// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class9449
{
    private final Class9334 field40609;
    private int[] field40610;
    
    public Class9449(final Class9334 class9334) {
        this(class9334, null);
    }
    
    public Class9449(final Class9334 class9334, final int n) {
        this(class9334, new int[] { n });
    }
    
    public Class9449(final Class9334 field40609, final int[] field40610) {
        this.field40609 = field40609;
        this.field40610 = field40610;
    }
    
    public boolean method35099(final Class9334 class9334, final int n) {
        return this.field40609 == class9334 && (this.field40610 == null || Config.method28978(n, this.field40610));
    }
    
    private boolean method35100(final int n) {
        return this.field40610 != null && Config.method28978(n, this.field40610);
    }
    
    public boolean method35101(final int n) {
        if (this.field40610 == null) {
            this.field40610 = new int[] { n };
            return true;
        }
        if (!this.method35100(n)) {
            this.field40610 = Config.method28997(this.field40610, n);
            return true;
        }
        return false;
    }
    
    public Class9334 method35102() {
        return this.field40609;
    }
    
    public int[] method35103() {
        return this.field40610;
    }
    
    public static boolean method35104(final Class9334 class9334, final int n, final Class9449[] array) {
        if (array != null) {
            for (int i = 0; i < array.length; ++i) {
                if (array[i].method35099(class9334, n)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
    
    @Override
    public String toString() {
        return (this.field40610 != null) ? (this.field40609 + ":" + Config.method28890(this.field40610)) : ("" + this.field40609);
    }
}
