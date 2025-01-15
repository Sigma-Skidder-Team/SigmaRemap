// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.awt.geom.FlatteningPathIterator;
import java.awt.geom.AffineTransform;
import java.awt.BasicStroke;
import java.awt.geom.GeneralPath;
import java.awt.Shape;
import java.awt.Stroke;

public class Class6734 implements Stroke
{
    private static String[] field26485;
    private static final float field26486 = 1.0f;
    public final /* synthetic */ Class6900 field26487;
    
    private Class6734(final Class6900 field26487) {
        this.field26487 = field26487;
    }
    
    @Override
    public Shape createStrokedShape(Shape strokedShape) {
        final GeneralPath generalPath = new GeneralPath();
        strokedShape = new BasicStroke(this.field26487.method21196(), 2, this.field26487.method21200()).createStrokedShape(strokedShape);
        final FlatteningPathIterator flatteningPathIterator = new FlatteningPathIterator(strokedShape.getPathIterator(null), 1.0);
        final float[] array = new float[6];
        float method20486 = 0.0f;
        float method20487 = 0.0f;
        float n = 0.0f;
        float n2 = 0.0f;
        float n3 = 0.0f;
        while (!flatteningPathIterator.isDone()) {
            switch (flatteningPathIterator.currentSegment(array)) {
                case 0: {
                    n = (method20486 = this.method20486(array[0]));
                    n2 = (method20487 = this.method20486(array[1]));
                    generalPath.moveTo(method20486, method20487);
                    n3 = 0.0f;
                    break;
                }
                case 4: {
                    array[0] = method20486;
                    array[1] = method20487;
                }
                case 1: {
                    final float method20488 = this.method20486(array[0]);
                    final float method20489 = this.method20486(array[1]);
                    final float n4 = method20488 - n;
                    final float n5 = method20489 - n2;
                    final float n6 = (float)Math.sqrt(n4 * n4 + n5 * n5);
                    if (n6 >= n3) {
                        final float n7 = 1.0f / n6;
                        while (n6 >= n3) {
                            generalPath.lineTo(this.method20486(n + n3 * n4 * n7), this.method20486(n2 + n3 * n5 * n7));
                            n3 += Class6900.method21245(this.field26487);
                        }
                    }
                    n3 -= n6;
                    n = method20488;
                    n2 = method20489;
                    break;
                }
            }
            flatteningPathIterator.next();
        }
        return generalPath;
    }
    
    private float method20486(final float n) {
        return n + (float)Math.random() * Class6900.method21246(this.field26487) * 2.0f - 1.0f;
    }
}
