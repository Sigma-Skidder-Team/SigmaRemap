// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.awt.BasicStroke;
import java.awt.geom.FlatteningPathIterator;
import java.awt.geom.AffineTransform;
import java.awt.geom.GeneralPath;
import java.awt.Shape;
import java.awt.Stroke;

public class Class6735 implements Stroke
{
    private static String[] field26488;
    private static final float field26489 = 1.0f;
    public final /* synthetic */ Class6893 field26490;
    
    private Class6735(final Class6893 field26490) {
        this.field26490 = field26490;
    }
    
    @Override
    public Shape createStrokedShape(final Shape shape) {
        final GeneralPath s = new GeneralPath();
        final FlatteningPathIterator flatteningPathIterator = new FlatteningPathIterator(shape.getPathIterator(null), 1.0);
        final float[] array = new float[6];
        float x = 0.0f;
        float y = 0.0f;
        float n = 0.0f;
        float n2 = 0.0f;
        float n3 = 0.0f;
        int n4 = 0;
        while (!flatteningPathIterator.isDone()) {
            final int currentSegment = flatteningPathIterator.currentSegment(array);
            switch (currentSegment) {
                case 0: {
                    n = (x = array[0]);
                    n2 = (y = array[1]);
                    s.moveTo(x, y);
                    n3 = Class6893.method21210(this.field26490) / 2.0f;
                    break;
                }
                case 4: {
                    array[0] = x;
                    array[1] = y;
                }
                case 1: {
                    final float n5 = array[0];
                    final float n6 = array[1];
                    final float n7 = n5 - n;
                    final float n8 = n6 - n2;
                    final float n9 = (float)Math.sqrt(n7 * n7 + n8 * n8);
                    if (n9 >= n3) {
                        final float n10 = 1.0f / n9;
                        while (n9 >= n3) {
                            final float n11 = n + n3 * n7 * n10;
                            final float n12 = n2 + n3 * n8 * n10;
                            if ((n4 & 0x1) == 0x0) {
                                s.lineTo(n11 + Class6893.method21211(this.field26490) * n8 * n10, n12 - Class6893.method21211(this.field26490) * n7 * n10);
                            }
                            else {
                                s.lineTo(n11 - Class6893.method21211(this.field26490) * n8 * n10, n12 + Class6893.method21211(this.field26490) * n7 * n10);
                            }
                            n3 += Class6893.method21210(this.field26490);
                            ++n4;
                        }
                    }
                    n3 -= n9;
                    n = n5;
                    n2 = n6;
                    if (currentSegment == 4) {
                        s.closePath();
                        break;
                    }
                    break;
                }
            }
            flatteningPathIterator.next();
        }
        return new BasicStroke(this.field26490.method21196(), 2, this.field26490.method21200()).createStrokedShape(s);
    }
}
