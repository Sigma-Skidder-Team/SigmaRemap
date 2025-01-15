// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.client.renderer.Matrix4f;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import java.nio.FloatBuffer;

public class Class7700
{
    private static FloatBuffer field30609;
    private static float[] field30610;
    
    public static String method24527() {
        Class7700.field30609.clear();
        GL11.glGetFloatv(2982, Class7700.field30609);
        Class7700.field30609.get(Class7700.field30610);
        return method24531(method24529(Class7700.field30610));
    }
    
    public static String method24528() {
        Class7700.field30609.clear();
        GL11.glGetFloatv(2983, Class7700.field30609);
        Class7700.field30609.get(Class7700.field30610);
        return method24531(method24529(Class7700.field30610));
    }
    
    private static float[] method24529(final float[] array) {
        final float[] array2 = new float[16];
        for (int i = 0; i < 4; ++i) {
            for (int j = 0; j < 4; ++j) {
                array2[i * 4 + j] = array[j * 4 + i];
            }
        }
        return array2;
    }
    
    public static String method24530(final Matrix4f class6789) {
        class6789.method20768(Class7700.field30610);
        return method24531(Class7700.field30610);
    }
    
    private static String method24531(final float[] array) {
        final StringBuffer sb = new StringBuffer();
        for (int i = 0; i < array.length; ++i) {
            final String format = String.format("%.2f", array[i]);
            if (i > 0) {
                if (i % 4 != 0) {
                    sb.append(", ");
                }
                else {
                    sb.append("\n");
                }
            }
            sb.append(Class9518.method35513(format, 5, ' '));
        }
        return sb.toString();
    }
    
    static {
        Class7700.field30609 = BufferUtils.createFloatBuffer(16);
        Class7700.field30610 = new float[16];
    }
}
