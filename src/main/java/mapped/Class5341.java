// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.io.InputStream;
import java.util.ArrayList;

public class Class5341 implements Class5337
{
    private ArrayList field22396;
    private Class5337 field22397;
    
    public Class5341() {
        this.field22396 = new ArrayList();
    }
    
    public void method16500(final Class5337 e) {
        this.field22396.add(e);
    }
    
    @Override
    public ByteBuffer method16491(final InputStream inputStream) throws IOException {
        return this.method16492(inputStream, false, null);
    }
    
    @Override
    public ByteBuffer method16492(final InputStream inputStream, final boolean b, final int[] array) throws IOException {
        return this.method16493(inputStream, b, false, array);
    }
    
    @Override
    public ByteBuffer method16493(final InputStream in, final boolean b, final boolean b2, final int[] array) throws IOException {
        final Class2350 class2350 = new Class2350();
        ByteBuffer method16493 = null;
        final BufferedInputStream bufferedInputStream = new BufferedInputStream(in, in.available());
        bufferedInputStream.mark(in.available());
        int i = 0;
        while (i < this.field22396.size()) {
            bufferedInputStream.reset();
            try {
                final Class5337 field22397 = this.field22396.get(i);
                method16493 = field22397.method16493(bufferedInputStream, b, b2, array);
                this.field22397 = field22397;
            }
            catch (final Exception ex) {
                ++i;
                continue;
            }
            break;
        }
        if (this.field22397 == null) {
            throw class2350;
        }
        return method16493;
    }
    
    private void method16501() {
        if (this.field22397 != null) {
            return;
        }
        throw new RuntimeException("Attempt to make use of uninitialised or invalid composite image data");
    }
    
    @Override
    public int method16480() {
        this.method16501();
        return this.field22397.method16480();
    }
    
    @Override
    public int method16481() {
        this.method16501();
        return this.field22397.method16481();
    }
    
    @Override
    public ByteBuffer method16485() {
        this.method16501();
        return this.field22397.method16485();
    }
    
    @Override
    public int method16482() {
        this.method16501();
        return this.field22397.method16482();
    }
    
    @Override
    public int method16483() {
        this.method16501();
        return this.field22397.method16483();
    }
    
    @Override
    public int method16484() {
        this.method16501();
        return this.field22397.method16484();
    }
    
    @Override
    public void method16490(final boolean b) {
        for (int i = 0; i < this.field22396.size(); ++i) {
            ((Class5337)this.field22396.get(i)).method16490(b);
        }
    }
}
