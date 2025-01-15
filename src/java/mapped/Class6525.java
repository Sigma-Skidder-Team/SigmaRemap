// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.text.ParsePosition;
import java.util.Date;
import java.text.DateFormat;

public final class Class6525
{
    public static final long field25971 = 253402300799999L;
    private static final ThreadLocal<DateFormat> field25972;
    private static final String[] field25973;
    private static final DateFormat[] field25974;
    
    public static Date method19743(final String s) {
        if (s.length() == 0) {
            return null;
        }
        final ParsePosition parsePosition = new ParsePosition(0);
        final Date parse = Class6525.field25972.get().parse(s, parsePosition);
        if (parsePosition.getIndex() == s.length()) {
            return parse;
        }
        synchronized (Class6525.field25973) {
            for (int i = 0; i < Class6525.field25973.length; ++i) {
                DateFormat dateFormat = Class6525.field25974[i];
                if (dateFormat == null) {
                    dateFormat = new SimpleDateFormat(Class6525.field25973[i], Locale.US);
                    dateFormat.setTimeZone(Class7690.field30554);
                    Class6525.field25974[i] = dateFormat;
                }
                parsePosition.setIndex(0);
                final Date parse2 = dateFormat.parse(s, parsePosition);
                if (parsePosition.getIndex() != 0) {
                    return parse2;
                }
            }
        }
        return null;
    }
    
    public static String method19744(final Date date) {
        return Class6525.field25972.get().format(date);
    }
    
    private Class6525() {
    }
    
    static {
        field25972 = new Class2432();
        field25973 = new String[] { "EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z" };
        field25974 = new DateFormat[Class6525.field25973.length];
    }
}
