// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public class Class4890 extends Class4841
{
    public static final Class6523 field20903;
    public List<String> field20904;
    public int field20905;
    public boolean field20906;
    public boolean field20907;
    
    public Class4890(final Class4803 class4803, final String s, final int n, final int n2, final int n3, final int n4, final List<String> field20904, final int field20905) {
        super(class4803, s, n, n2, n3, n4, Class4890.field20903, false);
        this.field20904 = new ArrayList<String>();
        this.field20905 = 0;
        this.field20904 = field20904;
        this.field20905 = field20905;
        this.method14646();
    }
    
    private void method14646() {
        this.method14250().clear();
        this.field20496 = Class9493.field40809;
        final Class4868 class4868;
        this.method14239(class4868 = new Class4868(this, "dropdownButton", 0, 0, this.method14278(), this.method14278(), this.field20497));
        class4868.method14270((class4803, class4804) -> {
            class4803.method14273(0);
            class4803.method14275(0);
            class4803.method14277(this.method14276());
            class4803.method14279(this.method14278());
        });
        class4868.method14260((class4803, n) -> this.method14657(!this.method14656()));
        for (final String s : this.field20904) {
            final Class4868 class4869;
            this.method14239(class4869 = new Class4868(this, s, 0, this.method14278(), this.method14276(), 17, new Class6523(-14540254, this.field20497.method19729(), this.field20497.method19729(), Class265.field1278.field1292, Class2056.field11734, Class2056.field11738), s, Class9493.field40810));
            class4869.method14603(8);
            class4869.method14260((class4803, n) -> {
                final int method14654 = this.method14654();
                this.method14655(this.field20904.indexOf(s));
                this.method14657(false);
                if (method14654 != this.method14654()) {
                    this.method14517();
                }
            });
        }
        this.method14255(new Class6803(1));
    }
    
    private int method14647() {
        return this.method14648();
    }
    
    private int method14648() {
        if (this.method14656()) {
            return this.method14278() * (this.field20904.size() + 1);
        }
        return this.method14278();
    }
    
    private int method14649() {
        return 0;
    }
    
    @Override
    public void method14200(final int n, final int n2) {
        if (!this.method14306()) {
            if (this.method14656()) {
                this.method14657(false);
            }
        }
        super.method14200(n, n2);
    }
    
    @Override
    public void method14205(final float n) {
        Class8154.method26876((float)this.method14272(), (float)this.method14274(), (float)(this.method14272() + this.method14276()), (float)(this.method14274() + this.method14278()), -14540254);
        Class8154.method26878((float)this.method14272(), (float)this.method14274(), (float)(this.method14272() + this.method14276()), (float)(this.method14274() + this.method14278()), Class265.field1273.field1292);
        if (this.method14236(this.method14320(), this.method14321())) {
            if (this.method14321() - this.method14281() < this.method14278()) {
                Class8154.method26878((float)(this.method14272() + 1), (float)(this.method14274() + 1), (float)(this.method14272() + this.method14276() - 1), (float)(this.method14274() + this.method14278() - 1), Class6430.method19118(Class265.field1278.field1292, 0.25f));
            }
        }
        final int n2 = this.method14272() + this.method14276() - 11;
        final int n3 = this.method14274() + this.method14278() - 12;
        if (!this.method14656()) {
            Class8154.method26884((float)n2, (float)n3, (float)(n2 + 6), (float)n3, (float)(n2 + 3), (float)(n3 + 3), Class265.field1281.field1292);
        }
        else {
            Class8154.method26884((float)n2, (float)(n3 + 3), (float)(n2 + 6), (float)(n3 + 3), (float)(n2 + 3), (float)n3, Class265.field1281.field1292);
        }
        for (final Class4803 class4803 : this.method14250()) {
            if (class4803.method14266().equals("dropdownButton")) {
                continue;
            }
            class4803.method14297(this.field20906);
        }
        if (this.method14314() != null) {
            Class8154.method26865(this);
            Class8154.method26889(this.method14316(), (float)(this.method14272() + 7), (float)(this.method14274() + (this.method14278() - this.method14316().method23539()) / 2), this.method14314(), Class6430.method19118(Class265.field1278.field1292, n * 0.5f));
            Class8154.method26872();
        }
        if (!this.method14656()) {
            Class8154.method26865(this);
        }
        super.method14205(n);
        if (!this.method14656()) {
            Class8154.method26872();
        }
    }
    
    public List<String> method14650() {
        return this.field20904;
    }
    
    public void method14651(final String s, final int n) {
        this.method14650().add(n, s);
        this.method14646();
    }
    
    public void method14652(final String s) {
        this.method14651(s, this.field20904.size());
    }
    
    public <E extends Enum<E>> void method14653(final Class<E> clazz) {
        this.field20904.clear();
        for (final Enum<E> enum1 : clazz.getEnumConstants()) {
            this.method14651(enum1.toString().substring(0, 1).toUpperCase() + enum1.toString().substring(1, enum1.toString().length()).toLowerCase(), enum1.ordinal());
        }
    }
    
    public int method14654() {
        return this.field20905;
    }
    
    public void method14655(final int field20905) {
        this.field20905 = field20905;
    }
    
    public boolean method14656() {
        return this.field20906;
    }
    
    public void method14657(final boolean field20906) {
        this.field20906 = field20906;
    }
    
    @Override
    public String method14314() {
        return (this.method14650().size() <= 0) ? null : this.method14650().get(this.method14654());
    }
    
    @Override
    public boolean method14236(int n, int n2) {
        n -= this.method14280();
        n2 -= this.method14281();
        if (n >= 0) {
            if (n <= this.method14276()) {
                if (n2 >= 0) {
                    if (n2 <= this.method14648()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    static {
        field20903 = new Class6523(1250067, -15329770).method19734(Class265.field1273.field1292).method19738(Class2056.field11738);
    }
}
