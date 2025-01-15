// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Queues;
import org.apache.logging.log4j.LogManager;
import java.util.function.IntSupplier;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.lwjgl.glfw.GLFWErrorCallbackI;
import java.util.function.LongSupplier;
import java.util.function.Consumer;
import java.nio.ByteBuffer;
import org.lwjgl.glfw.GLFW;
import java.util.function.Supplier;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.apache.logging.log4j.Logger;

public class Class8726
{
    private static final Logger field36649;
    private static final ConcurrentLinkedQueue<Class7531> field36650;
    private static final Class7392 field36651;
    public static final float field36652 = 0.1f;
    private static final int field36653 = 1024;
    private static boolean field36654;
    private static Thread field36655;
    private static Thread field36656;
    private static int field36657;
    private static boolean field36658;
    private static double field36659;
    
    public static void method29983() {
        if (Class8726.field36656 == null && Class8726.field36655 != Thread.currentThread()) {
            Class8726.field36656 = Thread.currentThread();
            return;
        }
        throw new IllegalStateException("Could not initialize render thread");
    }
    
    public static boolean method29984() {
        return Thread.currentThread() == Class8726.field36656;
    }
    
    public static boolean method29985() {
        return Class8726.field36658 || method29984();
    }
    
    public static void method29986(final boolean b) {
        final boolean b2 = Class8726.field36656 == Thread.currentThread();
        if (Class8726.field36655 == null) {
            if (Class8726.field36656 != null) {
                if (b2 != b) {
                    Class8726.field36655 = Thread.currentThread();
                    return;
                }
            }
        }
        throw new IllegalStateException("Could not initialize tick thread");
    }
    
    public static boolean method29987() {
        return true;
    }
    
    public static boolean method29988() {
        return Class8726.field36658 || method29987();
    }
    
    public static void method29989(final Supplier<Boolean> supplier) {
        if (supplier.get()) {
            return;
        }
        throw new IllegalStateException("Rendersystem called from wrong thread");
    }
    
    public static boolean method29990() {
        return true;
    }
    
    public static void method29991(final Class7531 e) {
        Class8726.field36650.add(e);
    }
    
    public static void method29992(final long n) {
        GLFW.glfwPollEvents();
        method29993();
        Class7392.method22694().method22696().method12402();
        GLFW.glfwSwapBuffers(n);
        GLFW.glfwPollEvents();
    }
    
    public static void method29993() {
        Class8726.field36654 = true;
        while (!Class8726.field36650.isEmpty()) {
            Class8726.field36650.poll().method23591();
        }
        Class8726.field36654 = false;
    }
    
    public static void method29994(final int n) {
        double n2;
        double field36659;
        for (n2 = Class8726.field36659 + 1.0 / n, field36659 = GLFW.glfwGetTime(); field36659 < n2; field36659 = GLFW.glfwGetTime()) {
            GLFW.glfwWaitEventsTimeout(n2 - field36659);
        }
        Class8726.field36659 = field36659;
    }
    
    public static void method29995() {
        method29989(Class8726::method29987);
        Class8933.method31499();
    }
    
    public static void method29996() {
        method29989(Class8726::method29987);
        Class8933.method31500();
    }
    
    public static void method29997() {
        method29989(Class8726::method29987);
        Class8933.method31501();
    }
    
    public static void method29998() {
        method29989(Class8726::method29987);
        Class8933.method31502();
    }
    
    public static void method29999() {
        method29989(Class8726::method29987);
        Class8933.method31503();
    }
    
    public static void method30000(final int n, final float n2) {
        method29989(Class8726::method29987);
        Class8933.method31504(n, n2);
    }
    
    public static void method30001() {
        method29989(Class8726::method29987);
        Class8933.method31505();
    }
    
    public static void method30002() {
        method29989(Class8726::method29987);
        Class8933.method31506();
    }
    
    public static void method30003() {
        method29989(Class8726::method29987);
        Class8933.method31508();
    }
    
    public static void method30004() {
        method29989(Class8726::method29987);
        Class8933.method31509();
    }
    
    public static void method30005(final int n, final int n2) {
        method29989(Class8726::method29987);
        Class8933.method31510(n, n2);
    }
    
    public static void method30006(final float n, final float n2, final float n3) {
        method29989(Class8726::method29987);
        Class8933.method31513(n, n2, n3);
    }
    
    public static void method30007() {
        method29989(Class8726::method29987);
        Class8933.method31514();
    }
    
    public static void method30008() {
        method29989(Class8726::method29988);
        Class8933.method31515();
    }
    
    public static void method30009(final int n) {
        method29989(Class8726::method29987);
        Class8933.method31516(n);
    }
    
    public static void method30010(final boolean b) {
        method29989(Class8726::method29987);
        Class8933.method31517(b);
    }
    
    public static void method30011() {
        method29989(Class8726::method29987);
        Class8933.method31519();
    }
    
    public static void method30012() {
        method29989(Class8726::method29987);
        Class8933.method31518();
    }
    
    public static void method30013(final Class2050 class2050, final Class2135 class2051) {
        method29989(Class8726::method29987);
        Class8933.method31520(class2050.field11697, class2051.field12465);
    }
    
    public static void method30014(final int n, final int n2) {
        method29989(Class8726::method29987);
        Class8933.method31520(n, n2);
    }
    
    public static void method30015(final Class2050 class2050, final Class2135 class2051, final Class2050 class2052, final Class2135 class2053) {
        method29989(Class8726::method29987);
        Class8933.method31521(class2050.field11697, class2051.field12465, class2052.field11697, class2053.field12465);
    }
    
    public static void method30016(final int n, final int n2, final int n3, final int n4) {
        method29989(Class8726::method29987);
        Class8933.method31521(n, n2, n3, n4);
    }
    
    public static void method30017(final int n) {
        method29989(Class8726::method29987);
        Class8933.method31523(n);
    }
    
    public static void method30018(final float n, final float n2, final float n3, final float n4) {
        method29989(Class8726::method29987);
        Class8933.method31522(n, n2, n3, n4);
    }
    
    public static void method30019() {
        method29989(Class8726::method29987);
        Class8933.method31584();
    }
    
    public static void method30020() {
        method29989(Class8726::method29987);
        Class8933.method31585();
    }
    
    public static void method30021(final Class317 class317) {
        method29989(Class8726::method29987);
        Class8933.method31586(class317.field1883);
    }
    
    public static void method30022(final int n) {
        method29989(Class8726::method29987);
        Class8933.method31586(n);
    }
    
    public static void method30023(final float n) {
        method29989(Class8726::method29987);
        Class8933.method31587(n);
    }
    
    public static void method30024(final float n) {
        method29989(Class8726::method29987);
        Class8933.method31588(n);
    }
    
    public static void method30025(final float n) {
        method29989(Class8726::method29987);
        Class8933.method31589(n);
    }
    
    public static void method30026(final int n, final float n2, final float n3, final float n4, final float n5) {
        method29989(Class8726::method29987);
        Class8933.method31590(n, new float[] { n2, n3, n4, n5 });
    }
    
    public static void method30027(final int n, final int n2) {
        method29989(Class8726::method29987);
        Class8933.method31591(n, n2);
    }
    
    public static void method30028() {
        method29989(Class8726::method29987);
        Class8933.method31592();
    }
    
    public static void method30029() {
        method29989(Class8726::method29987);
        Class8933.method31593();
    }
    
    public static void method30030(final int n, final int n2) {
        method29989(Class8726::method29987);
        Class8933.method31594(n, n2);
    }
    
    public static void method30031() {
        method29989(Class8726::method29987);
        Class8933.method31595();
    }
    
    public static void method30032() {
        method29989(Class8726::method29987);
        Class8933.method31596();
    }
    
    public static void method30033() {
        method29989(Class8726::method29987);
        Class8933.method31597();
    }
    
    public static void method30034() {
        method29989(Class8726::method29987);
        Class8933.method31598();
    }
    
    public static void method30035(final float n, final float n2) {
        method29989(Class8726::method29987);
        Class8933.method31599(n, n2);
    }
    
    public static void method30036() {
        method29989(Class8726::method29987);
        Class8933.method31600();
    }
    
    public static void method30037() {
        method29989(Class8726::method29987);
        Class8933.method31601();
    }
    
    public static void method30038(final Class2188 class2188) {
        method29989(Class8726::method29987);
        Class8933.method31602(class2188.field12995);
    }
    
    public static void method30039(final int n) {
        method29989(Class8726::method29987);
        Class8933.method31608(n);
    }
    
    public static void method30040() {
        method29989(Class8726::method29987);
        Class8933.method31609();
    }
    
    public static void method30041() {
        method29989(Class8726::method29987);
        Class8933.method31610();
    }
    
    public static void method30042(final int n, final int n2, final int n3) {
        Class8933.method31613(n, n2, n3);
    }
    
    public static void method30043(final int n) {
        method29989(Class8726::method29988);
        Class8933.method31616(n);
    }
    
    public static void method30044(final int n) {
        Class8933.method31617(n);
    }
    
    public static void method30045(final int n) {
        method29989(Class8726::method29987);
        Class8933.method31621(n);
    }
    
    public static void method30046() {
        method29989(Class8726::method29987);
        Class8933.method31622();
    }
    
    public static void method30047() {
        method29989(Class8726::method29987);
        Class8933.method31623();
    }
    
    public static void method30048(final int n, final int n2, final int n3, final int n4) {
        method29989(Class8726::method29988);
        Class8933.method31624(n, n2, n3, n4);
    }
    
    public static void method30049(final boolean b, final boolean b2, final boolean b3, final boolean b4) {
        method29989(Class8726::method29987);
        Class8933.method31625(b, b2, b3, b4);
    }
    
    public static void method30050(final int n, final int n2, final int n3) {
        method29989(Class8726::method29987);
        Class8933.method31626(n, n2, n3);
    }
    
    public static void method30051(final int n) {
        method29989(Class8726::method29987);
        Class8933.method31627(n);
    }
    
    public static void method30052(final int n, final int n2, final int n3) {
        method29989(Class8726::method29987);
        Class8933.method31628(n, n2, n3);
    }
    
    public static void method30053(final double n) {
        method29989(Class8726::method29988);
        Class8933.method31629(n);
    }
    
    public static void method30054(final float n, final float n2, final float n3, final float n4) {
        method29989(Class8726::method29988);
        Class8933.method31630(n, n2, n3, n4);
    }
    
    public static void method30055(final int n) {
        method29989(Class8726::method29987);
        Class8933.method31631(n);
    }
    
    public static void method30056(final int n, final boolean b) {
        method29989(Class8726::method29988);
        Class8933.method31632(n, b);
    }
    
    public static void method30057(final int n) {
        method29989(Class8726::method29987);
        Class8933.method31633(n);
    }
    
    public static void method30058() {
        method29989(Class8726::method29987);
        Class8933.method31634();
    }
    
    public static void method30059() {
        method29989(Class8726::method29987);
        Class8933.method31635();
    }
    
    public static void method30060() {
        method29989(Class8726::method29987);
        Class8933.method31636();
    }
    
    public static void method30061(final double n, final double n2, final double n3, final double n4, final double n5, final double n6) {
        method29989(Class8726::method29987);
        Class8933.method31638(n, n2, n3, n4, n5, n6);
    }
    
    public static void method30062(final float n, final float n2, final float n3, final float n4) {
        method29989(Class8726::method29987);
        Class8933.method31639(n, n2, n3, n4);
    }
    
    public static void method30063(final float n, final float n2, final float n3) {
        method29989(Class8726::method29987);
        Class8933.method31640(n, n2, n3);
    }
    
    public static void method30064(final double n, final double n2, final double n3) {
        method29989(Class8726::method29987);
        Class8933.method31641(n, n2, n3);
    }
    
    public static void method30065(final float n, final float n2, final float n3) {
        method29989(Class8726::method29987);
        Class8933.method31642(n, n2, n3);
    }
    
    public static void method30066(final double n, final double n2, final double n3) {
        method29989(Class8726::method29987);
        Class8933.method31643(n, n2, n3);
    }
    
    public static void method30067(final Class6789 class6789) {
        method29989(Class8726::method29987);
        Class8933.method31645(class6789);
    }
    
    public static void method30068(final float n, final float n2, final float n3, final float n4) {
        method29989(Class8726::method29987);
        Class8933.method31646(n, n2, n3, n4);
    }
    
    public static void method30069(final float n, final float n2, final float n3) {
        method29989(Class8726::method29987);
        Class8933.method31646(n, n2, n3, 1.0f);
    }
    
    public static void method30070() {
        method29989(Class8726::method29987);
        Class8933.method31647();
    }
    
    public static void method30071(final int n, final int n2, final int n3) {
        method29989(Class8726::method29987);
        Class8933.method31657(n, n2, n3);
    }
    
    public static void method30072(final float n) {
        method29989(Class8726::method29987);
        Class8933.method31658(n);
    }
    
    public static void method30073(final int n, final int n2) {
        method29989(Class8726::method29988);
        Class8933.method31659(n, n2);
    }
    
    public static void method30074(final int n, final float n2) {
        Class8933.method31660(n, n2);
    }
    
    public static void method30075(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final ByteBuffer byteBuffer) {
        method29989(Class8726::method29987);
        Class8933.method31661(n, n2, n3, n4, n5, n6, byteBuffer);
    }
    
    public static void method30076(final int n, final Consumer<String> consumer) {
        method29989(Class8726::method29987);
        consumer.accept(Class8933.method31663(n));
    }
    
    public static String method30077() {
        method29989(Class8726::method29990);
        return String.format("LWJGL version %s", Class8543.method28664());
    }
    
    public static String method30078() {
        method29989(Class8726::method29990);
        return Class8543.method28662();
    }
    
    public static LongSupplier method30079() {
        method29989(Class8726::method29990);
        return Class8543.method28665();
    }
    
    public static void method30080(final int n, final boolean b) {
        method29989(Class8726::method29990);
        Class8543.method28669(n, b);
    }
    
    public static void method30081(final GLFWErrorCallbackI glfwErrorCallbackI) {
        method29989(Class8726::method29990);
        Class8543.method28666(glfwErrorCallbackI);
    }
    
    public static void method30082(final int n) {
        method29989(Class8726::method29987);
        Class8543.method28672(n, true, true, true);
    }
    
    public static void method30083() {
        method29989(Class8726::method29987);
        Class8543.method28668();
    }
    
    public static void method30084(final int n, final float n2, final float n3) {
        method29989(Class8726::method29987);
        Class8933.method31566(n, n2, n3);
    }
    
    public static String method30085() {
        method29989(Class8726::method29987);
        return Class8543.method28670();
    }
    
    public static void method30086(final int n, final int n2, final int n3, final int n4) {
        method29989(Class8726::method29990);
        Class8933.method31609();
        Class8933.method31621(7425);
        Class8933.method31629(1.0);
        Class8933.method31515();
        Class8933.method31516(515);
        Class8933.method31503();
        Class8933.method31504(516, 0.1f);
        Class8933.method31633(5889);
        Class8933.method31634();
        Class8933.method31633(5888);
        Class8933.method31624(n, n2, n3, n4);
    }
    
    public static int method30087() {
        method29989(Class8726::method29990);
        if (Class8726.field36657 == -1) {
            final int method31664 = Class8933.method31664(3379);
            for (int i = Math.max(32768, method31664); i >= 1024; i >>= 1) {
                Class8933.method31618(32868, 0, 6408, i, i, 0, 6408, 5121, null);
                if (Class8933.method31614(32868, 0, 4096) != 0) {
                    return Class8726.field36657 = i;
                }
            }
            Class8726.field36657 = Math.max(method31664, 1024);
            Class8726.field36649.info("Failed to determine maximum texture size by probing, trying GL_MAX_TEXTURE_SIZE = {}", (Object)Class8726.field36657);
        }
        return Class8726.field36657;
    }
    
    public static void method30088(final int n, final Supplier<Integer> supplier) {
        Class8933.method31551(n, supplier.get());
    }
    
    public static void method30089(final int n, final ByteBuffer byteBuffer, final int n2) {
        method29989(Class8726::method29985);
        Class8933.method31552(n, byteBuffer, n2);
    }
    
    public static void method30090(final int n) {
        method29989(Class8726::method29987);
        Class8933.method31553(n);
    }
    
    public static void method30091(final int n, final int n2) {
        method29989(Class8726::method29987);
        Class8933.method31538(n, n2);
    }
    
    public static void method30092(final int n, final IntBuffer intBuffer) {
        method29989(Class8726::method29987);
        Class8933.method31537(n, intBuffer);
    }
    
    public static void method30093(final int n, final IntBuffer intBuffer) {
        method29989(Class8726::method29987);
        Class8933.method31540(n, intBuffer);
    }
    
    public static void method30094(final int n, final IntBuffer intBuffer) {
        method29989(Class8726::method29987);
        Class8933.method31542(n, intBuffer);
    }
    
    public static void method30095(final int n, final IntBuffer intBuffer) {
        method29989(Class8726::method29987);
        Class8933.method31544(n, intBuffer);
    }
    
    public static void method30096(final int n, final FloatBuffer floatBuffer) {
        method29989(Class8726::method29987);
        Class8933.method31539(n, floatBuffer);
    }
    
    public static void method30097(final int n, final FloatBuffer floatBuffer) {
        method29989(Class8726::method29987);
        Class8933.method31541(n, floatBuffer);
    }
    
    public static void method30098(final int n, final FloatBuffer floatBuffer) {
        method29989(Class8726::method29987);
        Class8933.method31543(n, floatBuffer);
    }
    
    public static void method30099(final int n, final FloatBuffer floatBuffer) {
        method29989(Class8726::method29987);
        Class8933.method31545(n, floatBuffer);
    }
    
    public static void method30100(final int n, final boolean b, final FloatBuffer floatBuffer) {
        method29989(Class8726::method29987);
        Class8933.method31546(n, b, floatBuffer);
    }
    
    public static void method30101(final int n, final boolean b, final FloatBuffer floatBuffer) {
        method29989(Class8726::method29987);
        Class8933.method31547(n, b, floatBuffer);
    }
    
    public static void method30102(final int n, final boolean b, final FloatBuffer floatBuffer) {
        method29989(Class8726::method29987);
        Class8933.method31548(n, b, floatBuffer);
    }
    
    public static void method30103() {
        method29989(Class8726::method29987);
        Class8933.method31570();
    }
    
    public static void method30104() {
        method29989(Class8726::method29987);
        Class8933.method31571();
    }
    
    public static void method30105(final IntSupplier intSupplier, final int n) {
        method29989(Class8726::method29987);
        Class8933.method31572(intSupplier.getAsInt(), n);
    }
    
    public static void method30106() {
        method29989(Class8726::method29987);
        Class8933.method31573();
    }
    
    public static void method30107(final Class6789 class6789) {
        method29989(Class8726::method29987);
        Class8933.method31577(class6789);
    }
    
    public static void method30108() {
        method29989(Class8726::method29987);
        Class8933.method31578();
    }
    
    public static void method30109() {
        method29989(Class8726::method29987);
        Class8933.method31579();
    }
    
    public static void method30110() {
        method29989(Class8726::method29987);
        Class8933.method31583();
    }
    
    public static void method30111() {
        method29989(Class8726::method29987);
        Class8933.method31581();
    }
    
    public static void method30112() {
        method29989(Class8726::method29987);
        Class8933.method31582();
    }
    
    public static void method30113() {
        Class8726.field36658 = true;
    }
    
    public static void method30114() {
        Class8726.field36658 = false;
        if (!Class8726.field36650.isEmpty()) {
            method29993();
        }
        if (Class8726.field36650.isEmpty()) {
            return;
        }
        throw new IllegalStateException("Recorded to render queue during initialization");
    }
    
    public static void method30115(final Consumer<Integer> consumer) {
        if (method29984()) {
            consumer.accept(Class8933.method31550());
        }
        else {
            method29991(() -> consumer.accept(Class8933.method31550()));
        }
    }
    
    public static Class7392 method30116() {
        method29989(Class8726::method29984);
        return Class8726.field36651;
    }
    
    public static void method30117() {
        method30015(Class2050.field11693, Class2135.field12460, Class2050.field11686, Class2135.field12464);
    }
    
    public static void method30118() {
        method30000(516, 0.1f);
    }
    
    static {
        field36649 = LogManager.getLogger();
        field36650 = Queues.newConcurrentLinkedQueue();
        field36651 = new Class7392();
        Class8726.field36657 = -1;
        Class8726.field36659 = Double.MIN_VALUE;
    }
}
