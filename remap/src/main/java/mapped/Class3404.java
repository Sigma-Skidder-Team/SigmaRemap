// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Date;
import java.util.TimeZone;
import java.util.Calendar;

public class Class3404 implements Class3398
{
    public final /* synthetic */ Class7353 field16127;
    
    public Class3404(final Class7353 field16127) {
        this.field16127 = field16127;
    }
    
    @Override
    public Class7576 method10839(final Object o) {
        Calendar instance;
        if (!(o instanceof Calendar)) {
            instance = Calendar.getInstance((this.field16127.method22587() != null) ? this.field16127.field28382 : TimeZone.getTimeZone("UTC"));
            instance.setTime((Date)o);
        }
        else {
            instance = (Calendar)o;
        }
        final int value = instance.get(1);
        final int i = instance.get(2) + 1;
        final int value2 = instance.get(5);
        final int value3 = instance.get(11);
        final int value4 = instance.get(12);
        final int value5 = instance.get(13);
        final int value6 = instance.get(14);
        final StringBuilder sb = new StringBuilder(String.valueOf(value));
        while (sb.length() < 4) {
            sb.insert(0, "0");
        }
        sb.append("-");
        if (i < 10) {
            sb.append("0");
        }
        sb.append(String.valueOf(i));
        sb.append("-");
        if (value2 < 10) {
            sb.append("0");
        }
        sb.append(String.valueOf(value2));
        sb.append("T");
        if (value3 < 10) {
            sb.append("0");
        }
        sb.append(String.valueOf(value3));
        sb.append(":");
        if (value4 < 10) {
            sb.append("0");
        }
        sb.append(String.valueOf(value4));
        sb.append(":");
        if (value5 < 10) {
            sb.append("0");
        }
        sb.append(String.valueOf(value5));
        if (value6 > 0) {
            if (value6 >= 10) {
                if (value6 >= 100) {
                    sb.append(".");
                }
                else {
                    sb.append(".0");
                }
            }
            else {
                sb.append(".00");
            }
            sb.append(String.valueOf(value6));
        }
        int offset = instance.getTimeZone().getOffset(instance.get(0), instance.get(1), instance.get(2), instance.get(5), instance.get(7), instance.get(14));
        if (offset != 0) {
            if (offset >= 0) {
                sb.append('+');
            }
            else {
                sb.append('-');
                offset *= -1;
            }
            final int n = offset / 60000;
            final int j = n / 60;
            final int k = n % 60;
            if (j < 10) {
                sb.append('0');
            }
            sb.append(j);
            sb.append(':');
            if (k < 10) {
                sb.append('0');
            }
            sb.append(k);
        }
        else {
            sb.append('Z');
        }
        return this.field16127.method22574(this.field16127.method22585(o.getClass(), Class8542.field35872), sb.toString(), Class2031.field11579);
    }
}
