// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.regex.Matcher;
import java.io.IOException;
import java.util.regex.Pattern;
import java.io.InputStream;

public class Class918 extends Thread
{
    private static final String field4886 = "percent";
    private static final String field4887 = "minutes";
    private static final String field4888 = "seconds";
    private InputStream field4889;
    private StringBuffer field4890;
    private final Class8413 field4891;
    private Pattern field4892;
    
    public Class918(final StringBuffer field4890, final InputStream field4891, final Class8413 field4892) {
        this.field4892 = Pattern.compile("\\[download\\]\\s+(?<percent>\\d+\\.\\d)% .* ETA (?<minutes>\\d+):(?<seconds>\\d+)");
        this.field4889 = field4891;
        this.field4890 = field4890;
        this.field4891 = field4892;
        this.start();
    }
    
    @Override
    public void run() {
        try {
            final StringBuilder sb = new StringBuilder();
            int read;
            while ((read = this.field4889.read()) != -1) {
                this.field4890.append((char)read);
                if (read == 13 && this.field4891 != null) {
                    this.method5421(sb.toString());
                    sb.setLength();
                }
                else {
                    sb.append((char)read);
                }
            }
        }
        catch (final IOException ex) {}
    }
    
    private void method5421(final String input) {
        final Matcher matcher = this.field4892.matcher(input);
        if (matcher.matches()) {
            this.field4891.method28104(Float.parseFloat(matcher.group("percent")), this.method5422(matcher.group("minutes"), matcher.group("seconds")));
        }
    }
    
    private int method5422(final String s, final String s2) {
        return Integer.parseInt(s) * 60 + Integer.parseInt(s2);
    }
}
