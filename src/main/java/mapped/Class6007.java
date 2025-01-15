// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.regex.Matcher;
import java.util.TimeZone;
import java.util.Calendar;

public class Class6007 extends Class6002
{
    private Calendar field24481;
    
    public Calendar method17925() {
        return this.field24481;
    }
    
    @Override
    public Object method17922(final Class7576 class7576) {
        final String method23856 = ((Class7577)class7576).method23856();
        final Matcher matcher = Class6587.method20019().matcher(method23856);
        if (matcher.matches()) {
            final String group = matcher.group(1);
            final String group2 = matcher.group(2);
            final String group3 = matcher.group(3);
            (this.field24481 = Calendar.getInstance(TimeZone.getTimeZone("UTC"))).clear();
            this.field24481.set(1, Integer.parseInt(group));
            this.field24481.set(2, Integer.parseInt(group2) - 1);
            this.field24481.set(5, Integer.parseInt(group3));
            return this.field24481.getTime();
        }
        final Matcher matcher2 = Class6587.method20020().matcher(method23856);
        if (matcher2.matches()) {
            final String group4 = matcher2.group(1);
            final String group5 = matcher2.group(2);
            final String group6 = matcher2.group(3);
            final String group7 = matcher2.group(4);
            final String group8 = matcher2.group(5);
            String s = matcher2.group(6);
            final String group9 = matcher2.group(7);
            if (group9 != null) {
                s = s + "." + group9;
            }
            final double double1 = Double.parseDouble(s);
            final int value = (int)Math.round(Math.floor(double1));
            final int value2 = (int)Math.round((double1 - value) * 1000.0);
            final String group10 = matcher2.group(8);
            final String group11 = matcher2.group(9);
            TimeZone zone;
            if (group10 == null) {
                zone = TimeZone.getTimeZone("UTC");
            }
            else {
                zone = TimeZone.getTimeZone("GMT" + group10 + ((group11 == null) ? "00" : (":" + group11)));
            }
            (this.field24481 = Calendar.getInstance(zone)).set(1, Integer.parseInt(group4));
            this.field24481.set(2, Integer.parseInt(group5) - 1);
            this.field24481.set(5, Integer.parseInt(group6));
            this.field24481.set(11, Integer.parseInt(group7));
            this.field24481.set(12, Integer.parseInt(group8));
            this.field24481.set(13, value);
            this.field24481.set(14, value2);
            return this.field24481.getTime();
        }
        throw new Class2386("Unexpected timestamp: " + method23856);
    }
}
