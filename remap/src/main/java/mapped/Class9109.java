// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.text.NumberFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.text.DecimalFormat;

public interface Class9109
{
    public static final DecimalFormat field38588 = Util.method27851(new DecimalFormat("########0.00"), decimalFormat -> decimalFormat.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT)));
    public static final Class9109 field38589 = NumberFormat.getIntegerInstance(Locale.US)::format;
    public static final Class9109 field38590 = n -> Class9109.field38588.format(n * 0.1);
    public static final Class9109 field38591 = i -> {
        final double number = i / 100.0;
        final double number2;
        if (number2 <= 0.5) {
            String s;
            if (number <= 0.5) {
                s = i + " cm";
            }
            else {
                s = Class9109.field38588.format(number) + " m";
            }
            return s;
        }
        else {
            return Class9109.field38588.format(number2) + " km";
        }
    };
    public static final Class9109 field38592 = n4 -> {
        final double d = n4 / 20.0;
        final double number3;
        if (number3 <= 0.5) {
            final double number4;
            if (number4 <= 0.5) {
                final double number5;
                if (number5 <= 0.5) {
                    final double number6;
                    String s2;
                    if (number6 <= 0.5) {
                        s2 = d + " s";
                    }
                    else {
                        s2 = Class9109.field38588.format(number6) + " m";
                    }
                    return s2;
                }
                else {
                    return Class9109.field38588.format(number5) + " h";
                }
            }
            else {
                return Class9109.field38588.format(number4) + " d";
            }
        }
        else {
            return Class9109.field38588.format(number3) + " y";
        }
    };
    
    String method32943(final int p0);
}
