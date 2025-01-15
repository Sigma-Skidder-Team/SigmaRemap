// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.nio.DoubleBuffer;
import org.lwjgl.opengl.GL11;
import org.lwjgl.BufferUtils;
import java.nio.FloatBuffer;

public class Class6446 extends Class6447
{
    private static String[] field25582;
    private static final int field25583 = 20;
    public static final int field25584 = -1;
    public static final int field25585 = 5000;
    private int field25586;
    private float[] field25587;
    private float[] field25588;
    private int field25589;
    private float[] field25590;
    private float[] field25591;
    private float[] field25592;
    private FloatBuffer field25593;
    private FloatBuffer field25594;
    private FloatBuffer field25595;
    private int field25596;
    
    public Class6446() {
        this.field25586 = -1;
        this.field25587 = new float[] { 1.0f, 1.0f, 1.0f, 1.0f };
        this.field25588 = new float[] { 0.0f, 0.0f };
        this.field25590 = new float[15000];
        this.field25591 = new float[20000];
        this.field25592 = new float[15000];
        this.field25593 = BufferUtils.createFloatBuffer(15000);
        this.field25594 = BufferUtils.createFloatBuffer(20000);
        this.field25595 = BufferUtils.createFloatBuffer(10000);
        this.field25596 = 0;
    }
    
    @Override
    public void method19246(final int n, final int n2) {
        super.method19246(n, n2);
        this.method19247();
        GL11.glEnableClientState(32884);
        GL11.glEnableClientState(32888);
        GL11.glEnableClientState(32886);
    }
    
    private void method19247() {
        this.field25589 = 0;
    }
    
    private void method19248() {
        if (this.field25589 == 0) {
            return;
        }
        if (this.field25586 == -1) {
            return;
        }
        if (this.field25589 >= 20) {
            this.field25593.clear();
            this.field25594.clear();
            this.field25595.clear();
            this.field25593.put(this.field25590, 0, this.field25589 * 3);
            this.field25594.put(this.field25591, 0, this.field25589 * 4);
            this.field25595.put(this.field25592, 0, this.field25589 * 2);
            this.field25593.flip();
            this.field25594.flip();
            this.field25595.flip();
            GL11.glVertexPointer(3, 0, 0, this.field25593);
            GL11.glColorPointer(4, 0, 0, this.field25594);
            GL11.glTexCoordPointer(2, 0, 0, this.field25595);
            GL11.glDrawArrays(this.field25586, 0, this.field25589);
            this.field25586 = -1;
            return;
        }
        GL11.glBegin(this.field25586);
        for (int i = 0; i < this.field25589; ++i) {
            GL11.glColor4f(this.field25591[i * 4 + 0], this.field25591[i * 4 + 1], this.field25591[i * 4 + 2], this.field25591[i * 4 + 3]);
            GL11.glTexCoord2f(this.field25592[i * 2 + 0], this.field25592[i * 2 + 1]);
            GL11.glVertex3f(this.field25590[i * 3 + 0], this.field25590[i * 3 + 1], this.field25590[i * 3 + 2]);
        }
        GL11.glEnd();
        this.field25586 = -1;
    }
    
    private void method19249() {
        if (this.field25596 <= 0) {
            if (this.field25589 != 0) {
                this.method19248();
                this.method19247();
            }
            super.method19252(this.field25587[0], this.field25587[1], this.field25587[2], this.field25587[3]);
        }
    }
    
    @Override
    public void method19250() {
        super.method19250();
        this.method19249();
    }
    
    @Override
    public void method19251(final int field25586) {
        if (this.field25596 <= 0) {
            if (this.field25586 != field25586) {
                this.method19249();
                this.field25586 = field25586;
            }
            return;
        }
        super.method19251(field25586);
    }
    
    @Override
    public void method19252(final float n, final float n2, final float n3, float n4) {
        n4 *= this.field25601;
        this.field25587[0] = n;
        this.field25587[1] = n2;
        this.field25587[2] = n3;
        this.field25587[3] = n4;
        if (this.field25596 <= 0) {
            return;
        }
        super.method19252(n, n2, n3, n4);
    }
    
    @Override
    public void method19253() {
        if (this.field25596 <= 0) {
            return;
        }
        super.method19253();
    }
    
    @Override
    public void method19254(final float n, final float n2) {
        if (this.field25596 <= 0) {
            this.field25588[0] = n;
            this.field25588[1] = n2;
            return;
        }
        super.method19254(n, n2);
    }
    
    @Override
    public void method19255(final float n, final float n2) {
        if (this.field25596 <= 0) {
            this.method19256(n, n2, 0.0f);
            return;
        }
        super.method19255(n, n2);
    }
    
    @Override
    public void method19256(final float n, final float n2, final float n3) {
        if (this.field25596 <= 0) {
            this.field25590[this.field25589 * 3 + 0] = n;
            this.field25590[this.field25589 * 3 + 1] = n2;
            this.field25590[this.field25589 * 3 + 2] = n3;
            this.field25591[this.field25589 * 4 + 0] = this.field25587[0];
            this.field25591[this.field25589 * 4 + 1] = this.field25587[1];
            this.field25591[this.field25589 * 4 + 2] = this.field25587[2];
            this.field25591[this.field25589 * 4 + 3] = this.field25587[3];
            this.field25592[this.field25589 * 2 + 0] = this.field25588[0];
            this.field25592[this.field25589 * 2 + 1] = this.field25588[1];
            ++this.field25589;
            if (this.field25589 > 4950) {
                if (this.method19257(this.field25589, this.field25586)) {
                    final int field25586 = this.field25586;
                    this.method19249();
                    this.field25586 = field25586;
                }
            }
            return;
        }
        super.method19256(n, n2, n3);
    }
    
    private boolean method19257(final int n, final int n2) {
        switch (n2) {
            case 7: {
                return n % 4 == 0;
            }
            case 4: {
                return n % 3 == 0;
            }
            case 6913: {
                return n % 2 == 0;
            }
            default: {
                return false;
            }
        }
    }
    
    @Override
    public void method19258(final int n, final int n2) {
        this.method19249();
        super.method19258(n, n2);
    }
    
    @Override
    public void method19259(final int n, final int n2) {
        this.method19249();
        super.method19259(n, n2);
    }
    
    @Override
    public void method19260(final int n) {
        this.method19249();
        super.method19260(n);
    }
    
    @Override
    public void method19261(final int n) {
        this.method19249();
        super.method19261(n);
    }
    
    @Override
    public void method19262(final int n, final DoubleBuffer doubleBuffer) {
        this.method19249();
        super.method19262(n, doubleBuffer);
    }
    
    @Override
    public void method19263(final boolean b, final boolean b2, final boolean b3, final boolean b4) {
        this.method19249();
        super.method19263(b, b2, b3, b4);
    }
    
    @Override
    public void method19264(final int n) {
        this.method19249();
        super.method19264(n);
    }
    
    @Override
    public void method19265(final int n) {
        this.method19249();
        super.method19265(n);
    }
    
    @Override
    public void method19266(final float n) {
        this.method19249();
        super.method19266(n);
    }
    
    @Override
    public void method19267(final float n) {
        this.method19249();
        super.method19267(n);
    }
    
    @Override
    public void method19268() {
        this.method19249();
        super.method19268();
    }
    
    @Override
    public void method19269() {
        this.method19249();
        super.method19269();
    }
    
    @Override
    public void method19270(final float n, final float n2, final float n3, final float n4) {
        this.method19249();
        super.method19270(n, n2, n3, n4);
    }
    
    @Override
    public void method19271(final float n, final float n2, final float n3) {
        this.method19249();
        super.method19271(n, n2, n3);
    }
    
    @Override
    public void method19272(final int n, final int n2, final int n3, final int n4) {
        this.method19249();
        super.method19272(n, n2, n3, n4);
    }
    
    @Override
    public void method19273(final int n, final int n2, final int n3) {
        this.method19249();
        super.method19273(n, n2, n3);
    }
    
    @Override
    public void method19274(final float n, final float n2, final float n3) {
        this.method19249();
        super.method19274(n, n2, n3);
    }
    
    @Override
    public void method19275() {
        --this.field25596;
        super.method19275();
    }
    
    @Override
    public void method19276(final int n, final int n2) {
        ++this.field25596;
        super.method19276(n, n2);
    }
    
    @Override
    public float[] method19277() {
        return this.field25587;
    }
    
    @Override
    public void method19278(final FloatBuffer floatBuffer) {
        this.method19248();
        super.method19278(floatBuffer);
    }
}
