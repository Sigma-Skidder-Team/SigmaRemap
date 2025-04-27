// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Maps;
import net.minecraft.client.renderer.Matrix4f;
import net.minecraft.client.renderer.Quaternion;
import net.minecraft.client.renderer.Vector3f;
import net.minecraft.util.Direction;
import org.apache.logging.log4j.LogManager;
import java.util.function.Supplier;
import java.util.EnumMap;
import org.apache.logging.log4j.Logger;

public class Class7235
{
    private static String[] field28045;
    private static final Logger field28046;
    public static final EnumMap<Direction, TransformationMatrix> field28047;
    public static final EnumMap<Direction, TransformationMatrix> field28048;
    
    public static TransformationMatrix method22137(final TransformationMatrix class9294) {
        final Matrix4f method20760 = Matrix4f.method20760(0.5f, 0.5f, 0.5f);
        method20760.method20752(class9294.getMatrix());
        method20760.method20752(Matrix4f.method20760(-0.5f, -0.5f, -0.5f));
        return new TransformationMatrix(method20760);
    }
    
    public static TransformationMatrix method22138(final TransformationMatrix class9294, final Direction key, final Supplier<String> supplier) {
        final Direction method777 = Direction.rotateFace(class9294.getMatrix(), key);
        final TransformationMatrix method778 = class9294.method34324();
        if (method778 != null) {
            return method22137(Class7235.field28048.get(key).method34323(method778).method34323(Class7235.field28047.get(method777)));
        }
        Class7235.field28046.warn(supplier.get());
        return new TransformationMatrix(null, null, new Vector3f(0.0f, 0.0f, 0.0f), null);
    }
    
    static {
        field28046 = LogManager.getLogger();
        field28047 = Util.method27851(Maps.newEnumMap((Class) Direction.class), enumMap -> {
            enumMap.put(Direction.SOUTH, TransformationMatrix.identity());
            final Direction field28049 = Direction.EAST;
            new(TransformationMatrix.class)();
            final Vector3f class9138 = null;
            new Quaternion(new Vector3f(0.0f, 1.0f, 0.0f), 90.0f, true);
            final Quaternion class9139;
            new TransformationMatrix(class9138, class9139, null, null);
            final TransformationMatrix value;
            enumMap.put(field28049, value);
            final Direction field28050 = Direction.WEST;
            new(TransformationMatrix.class)();
            final Vector3f class9140 = null;
            new Quaternion(new Vector3f(0.0f, 1.0f, 0.0f), -90.0f, true);
            final Quaternion class9141;
            new TransformationMatrix(class9140, class9141, null, null);
            final TransformationMatrix value2;
            enumMap.put(field28050, value2);
            final Direction field28051 = Direction.NORTH;
            new(TransformationMatrix.class)();
            final Vector3f class9142 = null;
            new Quaternion(new Vector3f(0.0f, 1.0f, 0.0f), 180.0f, true);
            final Quaternion class9143;
            new TransformationMatrix(class9142, class9143, null, null);
            final TransformationMatrix value3;
            enumMap.put(field28051, value3);
            final Direction field28052 = Direction.UP;
            new(TransformationMatrix.class)();
            final Vector3f class9144 = null;
            new Quaternion(new Vector3f(1.0f, 0.0f, 0.0f), -90.0f, true);
            final Quaternion class9145;
            new TransformationMatrix(class9144, class9145, null, null);
            final TransformationMatrix value4;
            enumMap.put(field28052, value4);
            final Direction field28053 = Direction.DOWN;
            new(TransformationMatrix.class)();
            final Vector3f class9146 = null;
            new Quaternion(new Vector3f(1.0f, 0.0f, 0.0f), 90.0f, true);
            final Quaternion class9147;
            new TransformationMatrix(class9146, class9147, null, null);
            final TransformationMatrix value5;
            enumMap.put(field28053, value5);
        });
        field28048 = Util.method27851(Maps.newEnumMap((Class) Direction.class), enumMap2 -> {
            Direction.values();
            final Direction[] array;
            int i = 0;
            for (int length = array.length; i < length; ++i) {
                final Direction class9148 = array[i];
                enumMap2.put(class9148, Class7235.field28047.get(class9148).method34324());
            }
        });
    }
}
