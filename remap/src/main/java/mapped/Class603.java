// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Properties;
import java.util.ArrayList;

public class Class603 extends Class599
{
    private ArrayList field3534;
    private int field3535;
    private long field3536;
    private long field3537;
    public final Class716 field3538;
    
    public Class603(final Class716 field3538, final int n, final int n2, final int n3, final int n4, final int n5) {
        super(field3538.method3935(), n, n2, n3, n4, n5);
        this.field3536 = Long.MIN_VALUE;
        this.field3537 = 0L;
        this.field3538 = field3538;
        this.method3522();
        this.field3522 = 0.0;
        final int n6 = this.field3535 * n5;
        final int n7 = (n4 - n3) / 2;
        if (n6 > n7) {
            this.method3502(n6 - n7);
        }
    }
    
    @Override
    public int method3505() {
        return this.field3513 - 20;
    }
    
    public void method3522() {
        this.field3534 = Class9216.method33737();
        this.field3535 = 0;
        for (int i = 0; i < this.field3534.size(); ++i) {
            if (((String)this.field3534.get(i)).equals(Class9216.field39326)) {
                this.field3535 = i;
                break;
            }
        }
    }
    
    @Override
    public int method3485() {
        return this.field3534.size();
    }
    
    @Override
    public boolean method3486(final int index, final int n, final double n2, final double n3) {
        if (index == this.field3535 && this.field3536 == this.field3537) {
            return false;
        }
        if (this.method3524(Class9216.method33709(this.field3534.get(index)), index)) {
            this.method3523(index);
            return true;
        }
        return false;
    }
    
    private void method3523(final int n) {
        this.field3535 = n;
        this.field3537 = this.field3536;
        Class9216.method33707(this.field3534.get(n));
        Class9216.method33788();
        this.field3538.method3934();
    }
    
    private boolean method3524(final Class7038 class7038, final int n) {
        if (class7038 == null) {
            return true;
        }
        final Properties method32785 = Class9084.method32785(class7038.method21531("/shaders/shaders.properties"), "Shaders");
        if (method32785 == null) {
            return true;
        }
        final String property = method32785.getProperty("version.1.15.2");
        if (property == null) {
            return true;
        }
        final String trim = property.trim();
        if (Config.method28965("G1_pre18", trim) < 0) {
            this.field3512.displayGuiScreen(new Class546(b -> {
                if (b) {
                    this.method3523(n);
                }
                this.field3512.displayGuiScreen(this.field3538);
            }, new StringTextComponent(Class8822.method30773("of.message.shaders.nv1", ("HD_U_" + trim).replace('_', ' '))), new StringTextComponent(Class8822.method30773("of.message.shaders.nv2", new Object[0]))));
            return false;
        }
        return true;
    }
    
    @Override
    public boolean method3487(final int n) {
        return n == this.field3535;
    }
    
    @Override
    public int method3508() {
        return this.field3513 - 6;
    }
    
    @Override
    public int method3511() {
        return this.method3485() * 18;
    }
    
    @Override
    public void method3489() {
    }
    
    @Override
    public void method3491(final int index, final int n, final int n2, final int n3, final int n4, final int n5, final float n6) {
        String s = this.field3534.get(index);
        if (!s.equals("OFF")) {
            if (s.equals("(internal)")) {
                s = Class4647.method13876("of.options.shaders.packDefault");
            }
        }
        else {
            s = Class4647.method13876("of.options.shaders.packNone");
        }
        this.field3538.method3184(s, this.field3513 / 2, n2 + 1, 14737632);
    }
    
    public int method3525() {
        return this.field3535;
    }
    
    @Override
    public boolean mouseScrolled(final double n, final double n2, final double n3) {
        return super.mouseScrolled(n, n2, n3 * 3.0);
    }
}
