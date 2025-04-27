// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Collections;
import java.util.ArrayList;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.List;

public abstract class Class5775
{
    public static final int field23629 = 1;
    public static final int field23630 = 2;
    public static final int field23631 = 3;
    public static final int field23632 = 4;
    public static final int field23633 = 5;
    public static final int field23634 = 6;
    public static final int field23635 = 14;
    public static final int field23636 = 16;
    public int field23637;
    public int field23638;
    public long field23639;
    private final List<Class5775> field23640;
    
    public static Class5775 method17219(final Class9131 class9131) throws IOException {
        final int method33135 = class9131.method33135();
        int n = 1;
        int field23638 = 0;
        int method33136;
        do {
            method33136 = class9131.method33135();
            field23638 = (field23638 << 7 | (method33136 & 0x7F));
            ++n;
        } while ((method33136 & 0x80) == 0x80);
        final Class5775 method33137 = method17220(method33135);
        method33137.field23637 = method33135;
        method33137.field23638 = field23638;
        method33137.field23639 = class9131.method33145();
        method33137.method17212(class9131);
        final long l = field23638 - (class9131.method33145() - method33137.field23639);
        if (l > 0L) {
            Logger.getLogger("MP4 Boxes").log(Level.INFO, "Descriptor: bytes left: {0}, offset: {1}", new Long[] { l, class9131.method33145() });
            class9131.method33144(l);
        }
        final Class5775 class9132 = method33137;
        class9132.field23638 += n;
        return method33137;
    }
    
    private static Class5775 method17220(final int i) {
        Class5775 class5775 = null;
        switch (i) {
            case 1: {
                class5775 = new Class5779();
                break;
            }
            case 2:
            case 16: {
                class5775 = new Class5777();
                break;
            }
            case 3: {
                class5775 = new Class5774();
                break;
            }
            case 4: {
                class5775 = new Class5780();
                break;
            }
            case 5: {
                class5775 = new Class5778();
                break;
            }
            default: {
                Logger.getLogger("MP4 Boxes").log(Level.INFO, "Unknown descriptor type: {0}", i);
                class5775 = new Class5781();
                break;
            }
        }
        return class5775;
    }
    
    public Class5775() {
        this.field23640 = new ArrayList<Class5775>();
    }
    
    public abstract void method17212(final Class9131 p0) throws IOException;
    
    public void method17221(final Class9131 class9131) throws IOException {
        while (this.field23638 - (class9131.method33145() - this.field23639) > 0L) {
            this.field23640.add(method17219(class9131));
        }
    }
    
    public List<Class5775> method17222() {
        return Collections.unmodifiableList(this.field23640);
    }
    
    public int method17223() {
        return this.field23637;
    }
    
    public int method17224() {
        return this.field23638;
    }
}
