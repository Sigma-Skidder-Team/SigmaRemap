// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.awt.RenderingHints;
import java.nio.ByteOrder;
import java.util.ListIterator;
import java.awt.image.WritableRaster;
import java.awt.Shape;
import java.awt.Color;
import java.awt.Composite;
import java.awt.AlphaComposite;
import java.util.Iterator;
import org.newdawn.slick.SlickException;
import java.util.ArrayList;
import java.util.List;
import java.awt.font.FontRenderContext;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.nio.IntBuffer;
import java.nio.ByteBuffer;

public class Class9498
{
    private static String[] field40853;
    private static final Class6448 field40854;
    public static final int field40855 = 256;
    private static ByteBuffer field40856;
    private static IntBuffer field40857;
    private static BufferedImage field40858;
    private static Graphics2D field40859;
    public static FontRenderContext field40860;
    private final Class7522 field40861;
    private final int field40862;
    private final int field40863;
    private final Class7764 field40864;
    private int field40865;
    private int field40866;
    private int field40867;
    private boolean field40868;
    private final List field40869;
    
    public static Graphics2D method35362() {
        return Class9498.field40859;
    }
    
    public Class9498(final Class7522 field40861, final int field40862, final int field40863) throws SlickException {
        this.field40869 = new ArrayList(32);
        this.field40861 = field40861;
        this.field40862 = field40862;
        this.field40863 = field40863;
        this.field40864 = new Class7764(field40862, field40863);
    }
    
    public int method35363(final List list, final int n) throws SlickException {
        if (this.field40867 != 0) {
            if (n == -1) {
                int field40865 = this.field40865;
                int field40866 = this.field40866;
                int field40867 = this.field40867;
                final Iterator method35365 = this.method35365(list);
                while (method35365.hasNext()) {
                    final Class8274 class8274 = method35365.next();
                    final int method35366 = class8274.method27503();
                    final int method35367 = class8274.method27504();
                    if (field40865 + method35366 < this.field40862) {
                        if (method35367 > field40867) {
                            field40867 = method35367;
                        }
                    }
                    else {
                        field40865 = 0;
                        field40866 += field40867;
                        field40867 = method35367;
                    }
                    if (field40866 + field40867 >= this.field40862) {
                        return 0;
                    }
                    field40865 += method35366;
                }
            }
        }
        Class2427.field14355.method9766();
        this.field40864.method24811();
        int n2 = 0;
        final Iterator method35368 = this.method35365(list);
        while (method35368.hasNext()) {
            final Class8274 class8275 = method35368.next();
            final int min = Math.min(256, class8275.method27503());
            final int min2 = Math.min(256, class8275.method27504());
            if (this.field40867 != 0) {
                if (this.field40865 + min < this.field40862) {
                    if (min2 > this.field40867) {
                        if (this.field40866 + min2 >= this.field40863) {
                            break;
                        }
                        this.field40867 = min2;
                    }
                }
                else {
                    if (this.field40866 + this.field40867 + min2 >= this.field40863) {
                        break;
                    }
                    this.field40865 = 0;
                    this.field40866 += this.field40867;
                    this.field40867 = min2;
                }
            }
            else {
                this.field40867 = min2;
            }
            this.method35364(class8275, min, min2);
            this.field40869.add(class8275);
            this.field40865 += min;
            method35368.remove();
            if (++n2 != n) {
                continue;
            }
            this.field40868 = !this.field40868;
            break;
        }
        Class7777.method24930();
        this.field40868 = !this.field40868;
        return n2;
    }
    
    private void method35364(final Class8274 class8274, final int w, final int n) throws SlickException {
        Class9498.field40859.setComposite(AlphaComposite.Clear);
        Class9498.field40859.fillRect(0, 0, 256, 256);
        Class9498.field40859.setComposite(AlphaComposite.SrcOver);
        Class9498.field40859.setColor(Color.white);
        final Iterator iterator = this.field40861.method23530().iterator();
        while (iterator.hasNext()) {
            ((Class6898)iterator.next()).method21195(Class9498.field40858, Class9498.field40859, this.field40861, class8274);
        }
        class8274.method27506(null);
        final WritableRaster raster = Class9498.field40858.getRaster();
        final int[] array = new int[w];
        for (int i = 0; i < n; ++i) {
            raster.getDataElements(0, i, w, 1, array);
            Class9498.field40857.put(array);
        }
        Class9498.field40854.method19298(3553, 0, this.field40865, this.field40866, w, n, 32993, 5121, Class9498.field40856);
        Class9498.field40857.clear();
        class8274.method27508(this.field40864.method24836(this.field40865, this.field40866, w, n));
    }
    
    private Iterator method35365(final List list) {
        if (!this.field40868) {
            return new Class7252(this, list.listIterator(list.size()));
        }
        return list.iterator();
    }
    
    public List method35366() {
        return this.field40869;
    }
    
    public Class7764 method35367() {
        return this.field40864;
    }
    
    static {
        field40854 = Class7840.method25330();
        (Class9498.field40856 = ByteBuffer.allocateDirect(262144)).order(ByteOrder.LITTLE_ENDIAN);
        Class9498.field40857 = Class9498.field40856.asIntBuffer();
        Class9498.field40858 = new BufferedImage(256, 256, 2);
        (Class9498.field40859 = (Graphics2D)Class9498.field40858.getGraphics()).setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        Class9498.field40859.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        Class9498.field40859.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_ON);
        Class9498.field40860 = Class9498.field40859.getFontRenderContext();
    }
}
