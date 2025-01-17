// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.jello.ClientFonts;
import org.lwjgl.opengl.GL11;

import java.util.ArrayList;
import java.util.List;

public class Class4891 extends Class4841
{
    public static final Class6523 field20908;
    public List<Integer> field20909;
    public List<Integer> field20910;
    public boolean field20911;
    public boolean field20912;
    private float field20913;
    
    public Class4891(final Class4803 class4803, final String s, final int n, final int n2, final int n3, final int n4, final String s2, final List<Integer> field20909) {
        super(class4803, s, n, n2, n3, n4, Class4891.field20908, s2, false);
        this.field20909 = new ArrayList<Integer>();
        this.field20910 = new ArrayList<Integer>();
        this.field20909 = field20909;
        this.method14661();
    }
    
    private void method14661() {
        this.method14250().clear();
        this.field20496 = ClientFonts.JelloLight18;
        final Class4868 class4868;
        this.method14239(class4868 = new Class4868(this, "dropdownButton", 0, 0, this.method14278(), this.method14278(), this.field20497));
        class4868.method14270((class4803, class4804) -> {
            class4803.method14273(0);
            class4803.method14275(0);
            class4803.method14277(this.method14276());
            class4803.method14279(this.method14278());
        });
        class4868.method14260((class4803, n) -> this.method14667(!this.method14666()));
        final int field20480 = this.field20480;
        int n = 0;
        for (final int intValue : this.field20909) {
            final Class4835 class4869;
            this.method14239(class4869 = new Class4835(this, intValue + "item", n % (this.field20480 / 50) * 50, this.field20481 + n / (this.field20480 / 50) * 50, 50, 50, intValue));
            class4869.method14503(this.field20910.contains(this.field20909.indexOf(intValue)));
            class4869.method14260((class4803, n) -> this.method14517());
            ++n;
        }
    }
    
    private int method14662() {
        return (int)((50 * (this.field20909.size() / (this.field20480 / 50)) + 1 + 50) * (this.field20913 * this.field20913));
    }
    
    @Override
    public void method14200(final int n, final int n2) {
        super.method14200(n, n2);
        if (!this.method14236(n, n2)) {
            if (this.method14666()) {
                this.field20912 = true;
            }
        }
        if (this.field20912) {
            this.field20913 += (this.method14666() ? (-0.014f - 0.14f * this.field20913) : (0.014f + 0.28f * (1.0f - this.field20913)));
            if (this.field20913 < 1.0f) {
                if (this.field20913 <= 0.0f) {
                    this.field20913 = 0.0f;
                    this.field20912 = false;
                    this.field20911 = false;
                }
            }
            else {
                this.field20913 = 1.0f;
                this.field20912 = false;
                this.field20911 = true;
            }
        }
    }
    
    @Override
    public void method14205(final float n) {
        Class8154.method26876((float)this.method14272(), (float)this.method14274(), (float)(this.method14272() + this.method14276()), (float)(this.method14274() + this.method14278() + this.method14662()), Class6430.method19118(Class265.field1278.field1292, n));
        Class8154.method26913((float)this.method14272(), (float)this.method14274(), (float)this.method14276(), (float)(this.method14278() + this.method14662()), 6.0f, n * 0.21f);
        if (this.method14314() != null) {
            Class8154.method26865(this);
            Class8154.method26889(this.method14316(), (float)(this.method14272() + 10), (float)(this.method14274() + (this.method14278() - this.method14316().getHeight()) / 2 + 1), this.field20495, Class6430.method19118(this.field20497.method19729(), n * 0.7f));
            Class8154.method26872();
        }
        Class8154.method26870(this.method14280(), this.method14281(), this.method14280() + this.method14276(), this.method14281() + this.method14278() + this.method14662());
        GL11.glPushMatrix();
        if (this.field20913 > 0.0f) {
            super.method14205(n);
        }
        GL11.glPopMatrix();
        Class8154.method26872();
        Class8154.method26878((float)this.method14272(), (float)this.method14274(), (float)(this.method14272() + this.method14276()), (float)(this.method14274() + this.method14278() + this.method14662()), Class6430.method19118(this.field20497.method19731(), n * 0.08f));
        final int n2 = this.method14276() - (int)(this.method14278() / 2.0f + 0.5f);
        final int n3 = (int)(this.method14278() / 2.0f + 0.5f) + 1;
        final int n4 = (int)(this.method14278() / 6.0f + 0.5f);
        GL11.glTranslatef((float)(this.method14272() + n2), (float)(this.method14274() + n3), 0.0f);
        GL11.glRotatef(90.0f * this.field20913, 0.0f, 0.0f, 1.0f);
        GL11.glTranslatef((float)(-this.method14272() - n2), (float)(-this.method14274() - n3), 0.0f);
        Class8154.method26889(this.field20496, (float)(this.method14272() + n2 - 6), (float)(this.method14274() + n3 - 14), ">", Class6430.method19118(this.field20497.method19729(), n * 0.7f * (this.method14236(this.method14320(), this.method14321()) ? 1.0f : 0.5f)));
    }
    
    public List<Integer> method14663() {
        return this.field20909;
    }
    
    public void method14664(final Integer n, final int n2) {
        this.method14663().add(n2, n);
        this.method14661();
    }
    
    public void method14665(final Integer n) {
        this.method14664(n, this.field20909.size());
    }
    
    public boolean method14666() {
        return this.field20911;
    }
    
    public void method14667(final boolean b) {
        if (b != this.field20911) {
            this.field20912 = true;
        }
    }
    
    @Override
    public boolean method14236(int n, int n2) {
        n -= this.method14280();
        n2 -= this.method14281();
        if (n >= 0) {
            if (n <= this.method14276()) {
                if (n2 >= 0) {
                    if (n2 <= this.method14278() + this.method14662()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    static {
        field20908 = new Class6523(1250067, -15329770).method19734(Class265.field1273.field1292).method19738(Class2056.field11738);
    }
}
