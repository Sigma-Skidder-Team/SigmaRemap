// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.ClientFonts;
import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;

import java.util.ArrayList;
import java.util.List;

public class Class4821 extends Class4817 implements Class4820
{
    public final Category field20629;
    private List<Class4868> field20630;
    private boolean field20631;
    private boolean field20632;
    private float field20633;
    
    public Class4821(final Class4803 class4803, final String s, final int n, final int n2, final int n3, final int n4, final Category field20629) {
        super(class4803, s, n, n2, n3, n4);
        this.field20630 = new ArrayList<Class4868>();
        this.field20633 = 1.0f;
        this.field20629 = field20629;
        this.field20632 = true;
        ((Class4924)class4803).field21063 = 1.0f;
        this.field20632 = true;
        this.method14311(false);
        this.method14390();
    }
    
    public void method14390() {
        int n = 0;
        for (final Module class3167 : Client.method35173().method35189().method21554(this.field20629)) {
            final int method19118 = Class6430.method19118(-3487030, 0.0f);
            final Class6523 method19119 = new Class6523(class3167.method9906() ? -14047489 : 1895167477, class3167.method9906() ? -14042881 : method19118).method19734(class3167.method9906() ? Class265.field1278.field1292 : Class265.field1273.field1292);
            method19119.method19736(Class2056.field11734);
            final Class4868 class3168;
            this.method14396().addVisualThing(class3168 = new Class4868(this.method14396(), class3167.getName() + "Button", 0, n * 30, this.method14276(), 30, method19119, class3167.getName(), ClientFonts.JelloLight20));
            if (!class3167.method9906()) {
                class3168.method14603(22);
            }
            else {
                class3168.method14603(30);
            }
            this.field20630.add(class3168);
            class3168.method14260((class3168, n2) -> {
                final Class4868 class3169 = (Class4868)class3168;
                if (n2 != 0) {
                    if (n2 == 1) {
                        ((Class4924)this.method14267()).method14776(class3167);
                    }
                }
                else {
                    class3167.method9910();
                    final Class6523 method19734 = new Class6523(class3167.method9906() ? -14047489 : 1895167477, class3167.method9906() ? -14042881 : method19118).method19734(class3167.method9906() ? Class265.field1278.field1292 : Class265.field1273.field1292);
                    if (!class3167.method9906()) {
                        class3169.method14603(22);
                    }
                    else {
                        class3169.method14603(30);
                    }
                    method19734.method19736(Class2056.field11734);
                    class3169.method14319(method19734);
                }
            });
            class3168.method14270(new Class6508());
            ++n;
        }
        this.method14396().method14255(new Class6803(1));
    }
    
    private float method14430() {
        return this.field20633 * this.field20633 * (3.0f - 2.0f * this.field20633);
    }
    
    private float method14431(float n, final float n2, final float n3, final float n4) {
        n /= n4 / 2.0f;
        if (n >= 1.0f) {
            --n;
            return -n3 / 2.0f * (n * (n - 2.0f) - 1.0f) + n2;
        }
        return n3 / 2.0f * n * n + n2;
    }
    
    @Override
    public void method14200(final int n, final int n2) {
        super.method14200(n, n2);
        final Class4924 class4924 = (Class4924)this.field20475;
        final double n3 = 0.07000000029802322;
        final double n4 = 60.0;
        Minecraft.method5277();
        final float n5 = (float)(n3 * (n4 / Minecraft.method5338()));
        this.field20633 += (this.method14403() ? (this.field20632 ? (-n5) : n5) : 0.0f);
        this.field20633 = Math.max(0.0f, Math.min(1.0f, this.field20633));
        class4924.field21063 = this.method14431(this.field20633, 0.0f, 1.0f, 1.0f);
        if (this.method14403()) {
            this.method14297(true);
            if (class4924.field21063 > 0.0f) {
                if (class4924.field21063 >= 1.0f) {
                    this.field20631 = false;
                    this.method14301(this.field20632 = true);
                    this.method14307(true);
                    this.method14305(true);
                    class4924.field21063 = 1.0f;
                }
            }
            else {
                this.field20631 = false;
                this.method14301(this.field20632 = false);
                this.method14307(false);
                this.method14305(false);
                class4924.field21063 = 0.0f;
            }
        }
    }
    
    @Override
    public void method14205(final float n) {
        this.method14228();
        super.method14205(n * ((Class4924)this.field20475).field21063);
    }
    
    @Override
    public boolean method14403() {
        return this.field20631;
    }
    
    @Override
    public void method14404() {
        this.field20631 = true;
    }
    
    @Override
    public boolean method14405() {
        return this.field20632;
    }
    
    @Override
    public void method14406(final boolean b) {
        if (b != this.method14405()) {
            this.method14404();
        }
    }
    
    public int method14432(final Module class3167) {
        int n = 0;
        for (final Class4868 class3168 : this.field20630) {
            ++n;
            if (!class3168.method14266().equals(class3167.getName() + "Button")) {
                continue;
            }
            break;
        }
        return n * 30;
    }
}
