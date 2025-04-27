// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public enum Class233
{
    field870(51, true), 
    field871(59, true), 
    field872(10, true), 
    field873(11, true);
    
    public int field874;
    public boolean field875;
    
    Class233(final int field874, final boolean field875) {
        this.field874 = field874;
        this.field875 = field875;
    }
    
    public static boolean method867(final int n) {
        final Class233[] values = values();
        for (int length = values.length, i = 0; i < length; ++i) {
            if (values[i].field874 == n) {
                return true;
            }
        }
        return false;
    }
}
