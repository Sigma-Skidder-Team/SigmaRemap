// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.mods.Module;

import java.util.Iterator;
import java.util.Map;
import java.util.ArrayList;
import java.util.Date;

public class Class4940 extends Class4800
{
    private static Minecraft field21209;
    private Class7776 field21210;
    public Date field21211;
    public Class4850 field21212;
    public Class4882 field21213;
    public boolean field21214;
    public boolean field21215;
    public Class4849 field21216;
    public int field21217;
    public boolean field21218;
    private boolean field21219;
    private boolean field21220;
    
    public Class4940() {
        super("KeybindManager");
        this.field21214 = false;
        this.field21211 = new Date();
        this.method14239(this.field21213 = new Class4882(this, "keyboard", (this.field20480 - 1060) / 2, (this.field20481 - 357) / 2));
        this.field21213.method14288(0.4f, 0.4f);
        this.field21213.method14516(class4941 -> {
            boolean b = false;
            final Iterator<Class4803> iterator = this.method14250().iterator();
            while (iterator.hasNext()) {
                if (!(iterator.next() instanceof Class4850)) {
                    continue;
                }
                b = true;
            }
            if (this.field21213.field20877 == this.field21217 && b) {
                this.method14879();
            }
            else {
                final int[] method14615 = this.field21213.method14615(this.field21213.field20877);
                (this.field21212 = new Class4850(class4940, "popover", this.field21213.method14272() + method14615[0], this.field21213.method14274() + method14615[1], this.field21213.field20877, Class6430.method19166(this.field21213.field20877))).method14516(class4841 -> this.method14875(this.field21213));
                this.field21212.method14550(class4850 -> {
                    class4850.method14301(false);
                    this.method14877();
                });
                this.field21217 = this.field21213.field20877;
            }
        });
        Class6430.method19169();
    }
    
    public static ArrayList<Class8799> method14874() {
        final ArrayList list = new ArrayList();
        final Iterator<Module> iterator = Client.method35173().method35189().method21553().values().iterator();
        while (iterator.hasNext()) {
            list.add(new Class8799(iterator.next()));
        }
        final Iterator<Map.Entry<Class<? extends Screen>, String>> iterator2 = Class9000.field37983.entrySet().iterator();
        while (iterator2.hasNext()) {
            list.add(new Class8799(((Map.Entry<Class, V>)iterator2.next()).getKey()));
        }
        return list;
    }
    
    private void method14875(final Class4882 class4882) {
        this.method14225(new Class1093(this, class4882));
    }
    
    private void method14876() {
        this.method14225(new Class1644(this, this));
    }
    
    private void method14877() {
        this.method14225(new Class1435(this, this));
    }
    
    private void method14878() {
        this.method14225(new Class966(this, this));
    }
    
    private void method14879() {
        this.method14225(new Class1239(this, this));
    }
    
    @Override
    public void method14200(final int n, final int n2) {
        if (this.method14309()) {
            this.field21213.method14251();
            this.method14253();
            this.field21217 = 0;
            this.field21212 = null;
        }
        if (this.field21212 != null) {
            this.field21213.method14251();
            this.method14253();
            this.method14239(this.field21212);
            this.field21212 = null;
        }
        super.method14200(n, n2);
        this.method14311(false);
    }
    
    @Override
    public int method14201() {
        return 60;
    }
    
    @Override
    public void method14204(final int n) {
        super.method14204(n);
        if (n == 256) {
            Class6430.method19172();
            Class4940.field21209.displayGuiScreen(null);
        }
    }
    
    @Override
    public void method14205(float n) {
        n = Math.min(200L, new Date().getTime() - this.field21211.getTime()) / 200.0f;
        final float method24584 = Class7707.method24584(n, 0.0f, 1.0f, 1.0f);
        this.method14288(0.8f + method24584 * 0.2f, 0.8f + method24584 * 0.2f);
        Class8154.method26876((float)this.field20478, (float)this.field20479, (float)(this.field20478 + this.field20480), (float)(this.field20479 + this.field20481), Class6430.method19118(Class265.field1273.field1292, 0.25f * n));
        super.method14227();
        Class8154.method26889(Class9400.field40325, (float)((this.field20480 - 1060) / 2), (float)((this.field20481 - 357) / 2 - 90), "Keybind Manager", Class265.field1278.field1292);
        super.method14205(n);
    }
    
    static {
        Class4940.field21209 = Minecraft.method5277();
    }
}
