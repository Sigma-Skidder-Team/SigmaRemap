// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.awt.event.ActionEvent;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.Timer;
import java.text.DecimalFormat;
import javax.swing.JComponent;

public class Class2418 extends JComponent
{
    private static final DecimalFormat field14306;
    private final int[] field14307;
    private int field14308;
    private final String[] field14309;
    private final Class394 field14310;
    private final Timer field14311;
    
    public Class2418(final Class394 field14310) {
        this.field14307 = new int[256];
        this.field14309 = new String[11];
        this.field14310 = field14310;
        this.setPreferredSize(new Dimension(456, 246));
        this.setMinimumSize(new Dimension(456, 246));
        this.setMaximumSize(new Dimension(456, 246));
        (this.field14311 = new Timer(500, p0 -> this.method9706())).start();
        this.setBackground(Color.BLACK);
    }
    
    private void method9706() {
        final long n = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        this.field14309[0] = "Memory use: " + n / 1024L / 1024L + " mb (" + Runtime.getRuntime().freeMemory() * 100L / Runtime.getRuntime().maxMemory() + "% free)";
        this.field14309[1] = "Avg tick: " + Class2418.field14306.format(this.method9707(this.field14310.field2323) * 1.0E-6) + " ms";
        this.field14307[this.field14308++ & 0xFF] = (int)(n * 100L / Runtime.getRuntime().maxMemory());
        this.repaint();
    }
    
    private double method9707(final long[] array) {
        long n = 0L;
        for (int length = array.length, i = 0; i < length; ++i) {
            n += array[i];
        }
        return n / (double)array.length;
    }
    
    @Override
    public void paint(final Graphics graphics) {
        graphics.setColor(new Color(16777215));
        graphics.fillRect(0, 0, 456, 246);
        for (int i = 0; i < 256; ++i) {
            final int n = this.field14307[i + this.field14308 & 0xFF];
            graphics.setColor(new Color(n + 28 << 16));
            graphics.fillRect(i, 100 - n, 1, n);
        }
        graphics.setColor(Color.BLACK);
        for (int j = 0; j < this.field14309.length; ++j) {
            final String s = this.field14309[j];
            if (s != null) {
                graphics.drawString(s, 32, 116 + j * 16);
            }
        }
    }
    
    public void method9708() {
        this.field14311.stop();
    }
    
    static {
        field14306 = Class8349.method27851(new DecimalFormat("########0.000"), decimalFormat -> decimalFormat.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT)));
    }
}
