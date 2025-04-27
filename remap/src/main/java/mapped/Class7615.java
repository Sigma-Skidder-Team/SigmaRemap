// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Collection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;

public final class Class7615 implements Class7616
{
    @Override
    public void method23929(final Class9041 class9041, final Class7088 class9042) {
        if (class9041.field38263 == 2 || class9041.field38263 == 3) {
            if (Class6437.method19202(class9041.field38266)) {
                class9041.field38263 = ((class9041.field38263 != 2) ? 6 : 5);
            }
        }
        if (Class8171.method27013().isLoggable(Level.FINE)) {
            Class8171.method27013().fine(String.format("encoding packet %s", class9041));
        }
        if (5 != class9041.field38263 && 6 != class9041.field38263) {
            class9042.method21669(new String[] { this.method23930(class9041) });
        }
        else {
            this.method23931(class9041, class9042);
        }
    }
    
    private String method23930(final Class9041 class9041) {
        final StringBuilder sb = new StringBuilder("" + class9041.field38263);
        if (5 == class9041.field38263 || 6 == class9041.field38263) {
            sb.append(class9041.field38267);
            sb.append("-");
        }
        if (class9041.field38265 != null) {
            if (class9041.field38265.length() != 0) {
                if (!"/".equals(class9041.field38265)) {
                    sb.append(class9041.field38265);
                    sb.append(",");
                }
            }
        }
        if (class9041.field38264 >= 0) {
            sb.append(class9041.field38264);
        }
        if (class9041.field38266 != null) {
            sb.append(class9041.field38266);
        }
        if (Class8171.method27013().isLoggable(Level.FINE)) {
            Class8171.method27013().fine(String.format("encoded %s as %s", class9041, sb));
        }
        return sb.toString();
    }
    
    private void method23931(final Class9041 class9041, final Class7088 class9042) {
        final Class7845 method16358 = Class5255.method16358(class9041);
        final String method16359 = this.method23930(method16358.field32127);
        final ArrayList list = new ArrayList(Arrays.asList(method16358.field32128));
        list.add(0, method16359);
        class9042.method21669(list.toArray());
    }
}
