// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.client.renderer.Matrix4f;
import org.apache.logging.log4j.LogManager;
import java.nio.Buffer;
import org.lwjgl.system.MemoryUtil;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.apache.logging.log4j.Logger;

public class Class1879 extends Class1880 implements AutoCloseable
{
    private static final Logger field10229;
    private int field10230;
    private final int field10231;
    private final int field10232;
    private final IntBuffer field10233;
    private final FloatBuffer field10234;
    private final String field10235;
    private boolean field10236;
    private final Class1927 field10237;
    
    public Class1879(final String field10235, final int field10236, final int field10237, final Class1927 field10238) {
        this.field10235 = field10235;
        this.field10231 = field10237;
        this.field10232 = field10236;
        this.field10237 = field10238;
        if (field10236 > 3) {
            this.field10233 = null;
            this.field10234 = MemoryUtil.memAllocFloat(field10237);
        }
        else {
            this.field10233 = MemoryUtil.memAllocInt(field10237);
            this.field10234 = null;
        }
        this.field10230 = -1;
        this.method7159();
    }
    
    public static int method7156(final int n, final CharSequence charSequence) {
        return Class8933.method31536(n, charSequence);
    }
    
    public static void method7157(final int n, final int n2) {
        RenderSystem.method30091(n, n2);
    }
    
    public static int method7158(final int n, final CharSequence charSequence) {
        return Class8933.method31549(n, charSequence);
    }
    
    @Override
    public void close() {
        if (this.field10233 != null) {
            MemoryUtil.memFree(this.field10233);
        }
        if (this.field10234 != null) {
            MemoryUtil.memFree(this.field10234);
        }
    }
    
    private void method7159() {
        this.field10236 = true;
        if (this.field10237 != null) {
            this.field10237.method7713();
        }
    }
    
    public static int method7160(final String s) {
        int n = -1;
        if (!"int".equals(s)) {
            if (!"float".equals(s)) {
                if (s.startsWith("matrix")) {
                    if (!s.endsWith("2x2")) {
                        if (!s.endsWith("3x3")) {
                            if (s.endsWith("4x4")) {
                                n = 10;
                            }
                        }
                        else {
                            n = 9;
                        }
                    }
                    else {
                        n = 8;
                    }
                }
            }
            else {
                n = 4;
            }
        }
        else {
            n = 0;
        }
        return n;
    }
    
    public void method7161(final int field10230) {
        this.field10230 = field10230;
    }
    
    public String method7162() {
        return this.field10235;
    }
    
    @Override
    public void method7163(final float n) {
        this.field10234.position();
        this.field10234.put(0, n);
        this.method7159();
    }
    
    @Override
    public void method7164(final float n, final float n2) {
        this.field10234.position();
        this.field10234.put(0, n);
        this.field10234.put(1, n2);
        this.method7159();
    }
    
    @Override
    public void method7165(final float n, final float n2, final float n3) {
        this.field10234.position();
        this.field10234.put(0, n);
        this.field10234.put(1, n2);
        this.field10234.put(2, n3);
        this.method7159();
    }
    
    @Override
    public void method7166(final float n, final float n2, final float n3, final float n4) {
        this.field10234.position();
        this.field10234.put(n);
        this.field10234.put(n2);
        this.field10234.put(n3);
        this.field10234.put(n4);
        this.field10234.flip();
        this.method7159();
    }
    
    @Override
    public void method7167(final float n, final float n2, final float n3, final float n4) {
        this.field10234.position();
        if (this.field10232 >= 4) {
            this.field10234.put(0, n);
        }
        if (this.field10232 >= 5) {
            this.field10234.put(1, n2);
        }
        if (this.field10232 >= 6) {
            this.field10234.put(2, n3);
        }
        if (this.field10232 >= 7) {
            this.field10234.put(3, n4);
        }
        this.method7159();
    }
    
    @Override
    public void method7168(final int n, final int n2, final int n3, final int n4) {
        this.field10233.position();
        if (this.field10232 >= 0) {
            this.field10233.put(0, n);
        }
        if (this.field10232 >= 1) {
            this.field10233.put(1, n2);
        }
        if (this.field10232 >= 2) {
            this.field10233.put(2, n3);
        }
        if (this.field10232 >= 3) {
            this.field10233.put(3, n4);
        }
        this.method7159();
    }
    
    @Override
    public void method7169(final float[] src) {
        if (src.length >= this.field10231) {
            this.field10234.position();
            this.field10234.put(src);
            this.field10234.position();
            this.method7159();
        }
        else {
            Class1879.field10229.warn("Uniform.set called with a too-small value array (expected {}, got {}). Ignoring.", this.field10231, src.length);
        }
    }
    
    @Override
    public void method7170(final Matrix4f class6789) {
        this.field10234.position();
        class6789.method20747(this.field10234);
        this.method7159();
    }
    
    public void method7171() {
        if (this.field10236) {}
        this.field10236 = false;
        if (this.field10232 > 3) {
            if (this.field10232 > 7) {
                if (this.field10232 > 10) {
                    Class1879.field10229.warn("Uniform.upload called, but type value ({}) is not a valid type. Ignoring.", this.field10232);
                    return;
                }
                this.method7174();
            }
            else {
                this.method7173();
            }
        }
        else {
            this.method7172();
        }
    }
    
    private void method7172() {
        this.field10234.clear();
        switch (this.field10232) {
            case 0: {
                RenderSystem.method30092(this.field10230, this.field10233);
                break;
            }
            case 1: {
                RenderSystem.method30093(this.field10230, this.field10233);
                break;
            }
            case 2: {
                RenderSystem.method30094(this.field10230, this.field10233);
                break;
            }
            case 3: {
                RenderSystem.method30095(this.field10230, this.field10233);
                break;
            }
            default: {
                Class1879.field10229.warn("Uniform.upload called, but count value ({}) is  not in the range of 1 to 4. Ignoring.", this.field10231);
                break;
            }
        }
    }
    
    private void method7173() {
        this.field10234.clear();
        switch (this.field10232) {
            case 4: {
                RenderSystem.method30096(this.field10230, this.field10234);
                break;
            }
            case 5: {
                RenderSystem.method30097(this.field10230, this.field10234);
                break;
            }
            case 6: {
                RenderSystem.method30098(this.field10230, this.field10234);
                break;
            }
            case 7: {
                RenderSystem.method30099(this.field10230, this.field10234);
                break;
            }
            default: {
                Class1879.field10229.warn("Uniform.upload called, but count value ({}) is not in the range of 1 to 4. Ignoring.", this.field10231);
                break;
            }
        }
    }
    
    private void method7174() {
        this.field10234.clear();
        switch (this.field10232) {
            case 8: {
                RenderSystem.method30100(this.field10230, false, this.field10234);
                break;
            }
            case 9: {
                RenderSystem.method30101(this.field10230, false, this.field10234);
                break;
            }
            case 10: {
                RenderSystem.method30102(this.field10230, false, this.field10234);
                break;
            }
        }
    }
    
    static {
        field10229 = LogManager.getLogger();
    }
}
