// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.client.renderer.Vector3f;
import org.apache.logging.log4j.LogManager;
import com.google.common.primitives.Floats;
import org.lwjgl.opengl.GL11;
import java.util.Arrays;
import com.mojang.datafixers.util.Pair;
import com.google.common.collect.ImmutableList;
import it.unimi.dsi.fastutil.ints.IntArrays;
import com.google.common.collect.Lists;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.BitSet;
import java.util.List;
import java.nio.ByteBuffer;
import org.apache.logging.log4j.Logger;

public class Class4148 extends Class4154 implements Class4149
{
    private static final Logger field18475;
    private ByteBuffer field18476;
    private final List<Class8127> field18477;
    private int field18478;
    private int field18479;
    private int field18480;
    private int field18481;
    private int field18482;
    private Class7187 field18483;
    private int field18484;
    private int field18485;
    private Class9272 field18486;
    private boolean field18487;
    private boolean field18488;
    private boolean field18489;
    private Class6332 field18490;
    private boolean[] field18491;
    private Class1912[] field18492;
    private Class1912[] field18493;
    private Class1912 field18494;
    public Class8900 field18495;
    public Class9145 field18496;
    public BitSet field18497;
    public BitSet field18498;
    private boolean field18499;
    private ByteBuffer field18500;
    private Vector3f field18501;
    private float[] field18502;
    private int[] field18503;
    private IntBuffer field18504;
    private FloatBuffer field18505;
    
    public Class4148(final int n) {
        this.field18477 = Lists.newArrayList();
        this.field18478 = 0;
        this.field18479 = 0;
        this.field18480 = 0;
        this.field18481 = 0;
        this.field18490 = null;
        this.field18491 = new boolean[256];
        this.field18492 = null;
        this.field18493 = null;
        this.field18494 = null;
        this.field18496 = null;
        this.field18497 = null;
        this.field18498 = new BitSet();
        this.field18499 = false;
        this.field18501 = new Vector3f();
        this.field18502 = new float[4];
        this.field18503 = new int[4];
        this.field18476 = Class9078.method32715(n * 4);
        this.field18504 = this.field18476.asIntBuffer();
        this.field18505 = this.field18476.asFloatBuffer();
        Class8900.method31334(this);
    }
    
    public void method12382() {
        this.method12383(this.field18486.method34194());
    }
    
    private void method12383(final int n) {
        if (this.field18480 + n > this.field18476.capacity()) {
            final int capacity = this.field18476.capacity();
            final int i = capacity + method12384(n);
            Class4148.field18475.debug("Needed to grow BufferBuilder buffer: Old size {} bytes, new size {} bytes.", (Object)capacity, (Object)i);
            final ByteBuffer method32715 = Class9078.method32715(i);
            this.field18476.position();
            method32715.put(this.field18476);
            method32715.rewind();
            this.field18476 = method32715;
            this.field18504 = this.field18476.asIntBuffer();
            this.field18505 = this.field18476.asFloatBuffer();
            if (this.field18492 != null) {
                final Class1912[] field18492 = this.field18492;
                System.arraycopy(field18492, 0, this.field18492 = new Class1912[this.method12413()], 0, Math.min(field18492.length, this.field18492.length));
                this.field18493 = null;
            }
        }
    }
    
    private static int method12384(final int n) {
        int n2 = 2097152;
        if (n != 0) {
            if (n < 0) {
                n2 *= -1;
            }
            final int n3 = n % n2;
            return (n3 != 0) ? (n + n2 - n3) : n;
        }
        return n2;
    }
    
    public void method12385(final float n, final float n2, final float n3) {
        this.field18476.clear();
        final FloatBuffer floatBuffer = this.field18476.asFloatBuffer();
        final FloatBuffer slice = floatBuffer.slice();
        final int n4 = this.field18482 / 4;
        final float[] array = new float[n4];
        for (int i = 0; i < n4; ++i) {
            array[i] = method12388(floatBuffer, n, n2, n3, this.field18486.method34193(), this.field18479 / 4 + i * this.field18486.method34194());
        }
        final int[] array2 = new int[n4];
        for (int j = 0; j < array2.length; array2[j] = j++) {}
        IntArrays.mergeSort(array2, (n, n2) -> Floats.compare(array[n2], array[n]));
        final BitSet set = new BitSet();
        final FloatBuffer method32716 = Class9078.method32716(this.field18486.method34193() * 4);
        for (int k = set.nextClearBit(0); k < array2.length; k = set.nextClearBit(k + 1)) {
            final int n5 = array2[k];
            if (n5 != k) {
                this.method12386(floatBuffer, n5);
                method32716.clear();
                method32716.put(floatBuffer);
                for (int l = n5, n6 = array2[n5]; l != k; l = n6, n6 = array2[n6]) {
                    this.method12386(floatBuffer, n6);
                    slice.clear();
                    slice.position();
                    slice.limit();
                    this.method12386(floatBuffer, l);
                    floatBuffer.put(slice);
                    set.set(l);
                }
                this.method12386(floatBuffer, k);
                method32716.flip();
                floatBuffer.put(method32716);
            }
            set.set(k);
        }
        if (this.field18492 != null) {
            final Class1912[] array3 = new Class1912[this.field18482 / 4];
            final int n7 = this.field18486.method34194() / 4 * 4;
            for (int n8 = 0; n8 < array2.length; ++n8) {
                array3[n8] = this.field18492[array2[n8]];
            }
            System.arraycopy(array3, 0, this.field18492, 0, array3.length);
        }
    }
    
    private void method12386(final FloatBuffer floatBuffer, final int n) {
        final int n2 = this.field18486.method34193() * 4;
        floatBuffer.limit();
        floatBuffer.position();
    }
    
    public Class7819 method12387() {
        this.field18476.limit();
        this.field18476.position();
        final ByteBuffer allocate = ByteBuffer.allocate(this.field18482 * this.field18486.method34194());
        allocate.put(this.field18476);
        this.field18476.clear();
        if (this.field18492 != null) {
            final int n = this.field18482 / 4;
            System.arraycopy(this.field18492, 0, new Class1912[n], 0, n);
        }
        return new Class7819(allocate, this.field18486, this.field18492);
    }
    
    private static float method12388(final FloatBuffer floatBuffer, final float n, final float n2, final float n3, final int n4, final int n5) {
        final float value = floatBuffer.get(n5 + n4 * 0 + 0);
        final float value2 = floatBuffer.get(n5 + n4 * 0 + 1);
        final float value3 = floatBuffer.get(n5 + n4 * 0 + 2);
        final float value4 = floatBuffer.get(n5 + n4 * 1 + 0);
        final float value5 = floatBuffer.get(n5 + n4 * 1 + 1);
        final float value6 = floatBuffer.get(n5 + n4 * 1 + 2);
        final float value7 = floatBuffer.get(n5 + n4 * 2 + 0);
        final float value8 = floatBuffer.get(n5 + n4 * 2 + 1);
        final float value9 = floatBuffer.get(n5 + n4 * 2 + 2);
        final float value10 = floatBuffer.get(n5 + n4 * 3 + 0);
        final float value11 = floatBuffer.get(n5 + n4 * 3 + 1);
        final float value12 = floatBuffer.get(n5 + n4 * 3 + 2);
        final float n6 = (value + value4 + value7 + value10) * 0.25f - n;
        final float n7 = (value2 + value5 + value8 + value11) * 0.25f - n2;
        final float n8 = (value3 + value6 + value9 + value12) * 0.25f - n3;
        return n6 * n6 + n7 * n7 + n8 * n8;
    }
    
    public void method12389(final Class7819 class7819) {
        Class7819.method25262(class7819).clear();
        final int capacity = Class7819.method25262(class7819).capacity();
        this.method12383(capacity);
        this.field18476.limit();
        this.field18476.position();
        this.field18476.put(Class7819.method25262(class7819));
        this.field18476.clear();
        final Class9272 method25263 = Class7819.method25263(class7819);
        this.method12392(method25263);
        this.field18482 = capacity / method25263.method34194();
        this.field18480 = this.field18479 + this.field18482 * method25263.method34194();
        if (Class7819.method25264(class7819) == null) {
            if (this.field18492 != null) {
                this.field18493 = this.field18492;
            }
            this.field18492 = null;
        }
        else {
            if (this.field18492 == null) {
                this.field18492 = this.field18493;
            }
            if (this.field18492 == null || this.field18492.length < this.method12413()) {
                this.field18492 = new Class1912[this.method12413()];
            }
            final Class1912[] method25264 = Class7819.method25264(class7819);
            System.arraycopy(method25264, 0, this.field18492, 0, method25264.length);
        }
    }
    
    public void method12390(final int field18485, final Class9272 class9272) {
        if (!this.field18489) {
            this.field18489 = true;
            this.field18485 = field18485;
            this.method12392(class9272);
            this.field18483 = (Class7187)class9272.method34195().get(0);
            this.field18484 = 0;
            this.field18476.clear();
            if (Class8571.method28955()) {
                Class8900.method31340(this);
            }
            if (!Class8571.method28928()) {
                if (this.field18492 != null) {
                    this.field18493 = this.field18492;
                }
                this.field18492 = null;
            }
            else if (this.field18490 != null) {
                if (this.field18492 == null) {
                    this.field18492 = this.field18493;
                }
                if (this.field18492 == null || this.field18492.length < this.method12413()) {
                    this.field18492 = new Class1912[this.method12413()];
                }
            }
            if (!Class7663.method24283()) {
                if (this.field18497 != null) {
                    this.field18497 = null;
                }
            }
            else {
                if (this.field18497 == null) {
                    this.field18497 = this.field18498;
                }
                this.field18497.clear();
            }
            return;
        }
        throw new IllegalStateException("Already building!");
    }
    
    @Override
    public Class4150 method12391(float method7524, float method7525) {
        if (this.field18494 != null) {
            if (this.field18492 != null) {
                method7524 = this.field18494.method7524(method7524);
                method7525 = this.field18494.method7525(method7525);
                this.field18492[this.field18482 / 4] = this.field18494;
            }
        }
        return super.method12391(method7524, method7525);
    }
    
    private void method12392(final Class9272 field18486) {
        if (this.field18486 != field18486) {
            this.field18486 = field18486;
            final boolean field18487 = field18486 == Class9237.field39608;
            final boolean b = field18486 == Class9237.field39607;
            this.field18487 = (field18487 || b);
            this.field18488 = field18487;
        }
    }
    
    public void method12393() {
        if (this.field18489) {
            this.field18489 = false;
            this.field18477.add(new Class8127(this.field18486, this.field18482, this.field18485, null));
            this.field18479 += this.field18482 * this.field18486.method34194();
            this.field18482 = 0;
            this.field18483 = null;
            this.field18484 = 0;
            return;
        }
        throw new IllegalStateException("Not building!");
    }
    
    @Override
    public void method12394(final int n, final byte b) {
        this.field18476.put(this.field18480 + n, b);
    }
    
    @Override
    public void method12395(final int n, final short n2) {
        this.field18476.putShort(this.field18480 + n, n2);
    }
    
    @Override
    public void method12396(final int n, final float n2) {
        this.field18476.putFloat(this.field18480 + n, n2);
    }
    
    @Override
    public void method12397() {
        if (this.field18484 == 0) {
            ++this.field18482;
            this.method12382();
            if (Class8571.method28955()) {
                Class8900.method31342(this);
            }
            return;
        }
        throw new IllegalStateException("Not filled all elements of the vertex");
    }
    
    @Override
    public void method12398() {
        final ImmutableList<Class7187> method34195 = this.field18486.method34195();
        this.field18484 = (this.field18484 + 1) % method34195.size();
        this.field18480 += this.field18483.method22052();
        final Class7187 field18483 = (Class7187)method34195.get(this.field18484);
        this.field18483 = field18483;
        if (field18483.method22049() == Class2078.field12014) {
            this.method12398();
        }
        if (this.field18513) {
            if (this.field18483.method22049() == Class2078.field12012) {
                super.method12399(this.field18514, this.field18515, this.field18516, this.field18517);
            }
        }
    }
    
    @Override
    public Class4150 method12399(final int n, final int n2, final int n3, final int n4) {
        if (!this.field18513) {
            return super.method12399(n, n2, n3, n4);
        }
        throw new IllegalStateException();
    }
    
    @Override
    public void method12400(final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7, final float n8, final float n9, final int n10, final int n11, final float n12, final float n13, final float n14) {
        if (!this.field18513) {
            if (!this.field18487) {
                super.method12400(n, n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12, n13, n14);
            }
            else {
                this.method12396(0, n);
                this.method12396(4, n2);
                this.method12396(8, n3);
                this.method12394(12, (byte)(n4 * 255.0f));
                this.method12394(13, (byte)(n5 * 255.0f));
                this.method12394(14, (byte)(n6 * 255.0f));
                this.method12394(15, (byte)(n7 * 255.0f));
                this.method12396(16, n8);
                this.method12396(20, n9);
                int n15;
                if (!this.field18488) {
                    n15 = 24;
                }
                else {
                    this.method12395(24, (short)(n10 & 0xFFFF));
                    this.method12395(26, (short)(n10 >> 16 & 0xFFFF));
                    n15 = 28;
                }
                this.method12395(n15 + 0, (short)(n11 & 0xFFFF));
                this.method12395(n15 + 2, (short)(n11 >> 16 & 0xFFFF));
                this.method12394(n15 + 4, Class4149.method12437(n12));
                this.method12394(n15 + 5, Class4149.method12437(n13));
                this.method12394(n15 + 6, Class4149.method12437(n14));
                this.field18480 += this.field18486.method34194();
                this.method12397();
            }
            return;
        }
        throw new IllegalStateException();
    }
    
    public Pair<Class8127, ByteBuffer> method12401() {
        final Class8127 class8127 = this.field18477.get(this.field18478++);
        this.field18476.position();
        this.field18481 += class8127.method26771() * class8127.method26770().method34194();
        this.field18476.limit();
        if (this.field18478 == this.field18477.size()) {
            if (this.field18482 == 0) {
                this.method12402();
            }
        }
        final ByteBuffer slice = this.field18476.slice();
        slice.order(this.field18476.order());
        this.field18476.clear();
        return (Pair<Class8127, ByteBuffer>)Pair.of((Object)class8127, (Object)slice);
    }
    
    public void method12402() {
        if (this.field18479 != this.field18481) {
            Class4148.field18475.warn("Bytes mismatch " + this.field18479 + " " + this.field18481);
        }
        this.method12403();
    }
    
    public void method12403() {
        this.field18479 = 0;
        this.field18481 = 0;
        this.field18480 = 0;
        this.field18477.clear();
        this.field18478 = 0;
        this.field18494 = null;
        this.field18499 = false;
    }
    
    @Override
    public Class7187 method12404() {
        if (this.field18483 != null) {
            return this.field18483;
        }
        throw new IllegalStateException("BufferBuilder not started");
    }
    
    public boolean method12405() {
        return this.field18489;
    }
    
    @Override
    public void method12406(final Class1912 class1912) {
        if (this.field18497 != null) {
            if (class1912 != null) {
                if (class1912.method7534()) {
                    if (class1912.method7515() >= 0) {
                        this.field18497.set(class1912.method7515());
                    }
                }
            }
        }
        if (this.field18492 != null) {
            this.field18492[this.field18482 / 4 - 1] = class1912;
        }
    }
    
    @Override
    public void method12407(final Class1912 field18494) {
        if (this.field18497 != null) {
            if (field18494 != null) {
                if (field18494.method7534()) {
                    if (field18494.method7515() >= 0) {
                        this.field18497.set(field18494.method7515());
                    }
                }
            }
        }
        if (this.field18492 != null) {
            this.field18494 = field18494;
        }
    }
    
    @Override
    public boolean method12408() {
        return this.field18492 != null;
    }
    
    public void method12409() {
        if (this.field18492 != null) {
            final int method6349 = Class8571.method29001().method6349();
            if (this.field18491.length <= method6349) {
                this.field18491 = new boolean[method6349 + 1];
            }
            Arrays.fill(this.field18491, false);
            int n = 0;
            int n2 = -1;
            for (int n3 = this.field18482 / 4, i = 0; i < n3; ++i) {
                final Class1912 class1912 = this.field18492[i];
                if (class1912 != null) {
                    final int method6350 = class1912.method7513();
                    if (!this.field18491[method6350]) {
                        if (class1912 != Class8969.field37701) {
                            i = this.method12410(class1912, i) - 1;
                            ++n;
                            if (this.field18490 != Class9484.field40762) {
                                this.field18491[method6350] = true;
                            }
                        }
                        else if (n2 < 0) {
                            n2 = i;
                        }
                    }
                }
            }
            if (n2 >= 0) {
                this.method12410(Class8969.field37701, n2);
                ++n;
            }
            if (n <= 0) {}
        }
    }
    
    private int method12410(final Class1912 class1912, final int n) {
        GL11.glBindTexture(3553, class1912.field10386);
        int n2 = -1;
        int n3 = -1;
        final int n4 = this.field18482 / 4;
        for (int i = n; i < n4; ++i) {
            if (this.field18492[i] != class1912) {
                if (n3 >= 0) {
                    this.method12411(n3, i);
                    if (this.field18490 == Class9484.field40762) {
                        return i;
                    }
                    n3 = -1;
                    if (n2 < 0) {
                        n2 = i;
                    }
                }
            }
            else if (n3 < 0) {
                n3 = i;
            }
        }
        if (n3 >= 0) {
            this.method12411(n3, n4);
        }
        if (n2 < 0) {
            n2 = n4;
        }
        return n2;
    }
    
    private void method12411(final int n, final int n2) {
        final int n3 = n2 - n;
        if (n3 > 0) {
            GL11.glDrawArrays(this.field18485, n * 4, n3 * 4);
        }
    }
    
    @Override
    public void method12412(final Class6332 field18490) {
        this.field18490 = field18490;
        if (field18490 == null) {
            if (this.field18492 != null) {
                this.field18493 = this.field18492;
            }
            this.field18492 = null;
            this.field18494 = null;
        }
    }
    
    private int method12413() {
        return this.field18476.capacity() / this.field18486.method34194();
    }
    
    @Override
    public Class9145 method12414(final Class7096 class7096, final BlockPos class7097) {
        if (this.field18496 != null) {
            this.field18496.method33373(class7096, class7097);
            return this.field18496;
        }
        return this.field18496 = new Class9145(class7096, class7097);
    }
    
    @Override
    public Class6332 method12415() {
        return this.field18490;
    }
    
    public void method12416() {
        if (this.field18485 == 7) {
            if (this.field18500 == null) {
                this.field18500 = Class9078.method32715(this.field18476.capacity() * 2);
            }
            if (this.field18500.capacity() < this.field18476.capacity() * 2) {
                this.field18500 = Class9078.method32715(this.field18476.capacity() * 2);
            }
            final int method34194 = this.field18486.method34194();
            final int limit = this.field18476.limit();
            this.field18476.rewind();
            this.field18500.clear();
            for (int i = 0; i < this.field18482; i += 4) {
                this.field18476.limit();
                this.field18476.position();
                this.field18500.put(this.field18476);
                this.field18476.limit();
                this.field18476.position();
                this.field18500.put(this.field18476);
                this.field18476.limit();
                this.field18476.position();
                this.field18500.put(this.field18476);
            }
            this.field18476.limit();
            this.field18476.rewind();
            this.field18500.flip();
            this.field18499 = true;
        }
    }
    
    public int method12417() {
        return this.field18499 ? 4 : this.field18485;
    }
    
    public int method12418() {
        return this.field18482;
    }
    
    @Override
    public Vector3f method12419(final Vector3f class9138) {
        this.field18501.set(class9138.getX(), class9138.getY(), class9138.getZ());
        return this.field18501;
    }
    
    @Override
    public Vector3f method12420(final float n, final float n2, final float n3) {
        this.field18501.set(n, n2, n3);
        return this.field18501;
    }
    
    @Override
    public float[] method12421(final float n, final float n2, final float n3, final float n4) {
        this.field18502[0] = n;
        this.field18502[1] = n2;
        this.field18502[2] = n3;
        this.field18502[3] = n4;
        return this.field18502;
    }
    
    @Override
    public int[] method12422(final int n, final int n2, final int n3, final int n4) {
        this.field18503[0] = n;
        this.field18503[1] = n2;
        this.field18503[2] = n3;
        this.field18503[3] = n4;
        return this.field18503;
    }
    
    public ByteBuffer method12423() {
        return this.field18476;
    }
    
    public FloatBuffer method12424() {
        return this.field18505;
    }
    
    public IntBuffer method12425() {
        return this.field18504;
    }
    
    public int method12426() {
        return this.field18482 * this.field18486.method34193();
    }
    
    public void method12427(final ByteBuffer src) {
        if (Class8571.method28955()) {
            Class8900.method31344(this, src);
        }
        this.method12383(src.limit() + this.field18486.method34194());
        this.field18476.position();
        this.field18476.put(src);
        this.field18482 += src.limit() / this.field18486.method34194();
        this.field18480 += src.limit();
        if (Class8571.method28955()) {
            Class8900.method31345(this);
        }
    }
    
    public Class9272 method12428() {
        return this.field18486;
    }
    
    public int method12429() {
        return this.field18479;
    }
    
    public int method12430() {
        return this.field18479 / 4;
    }
    
    static {
        field18475 = LogManager.getLogger();
    }
}
