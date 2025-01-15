// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.text.DateFormat;

public final class Class2432 extends ThreadLocal<DateFormat>
{
    public DateFormat initialValue() {
        final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
        simpleDateFormat.setLenient(false);
        simpleDateFormat.setTimeZone(Class7690.field30554);
        return simpleDateFormat;
    }
}
