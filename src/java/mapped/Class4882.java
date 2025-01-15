// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public class Class4882 extends Class4841
{
    private List<Class4868> field20876;
    public int field20877;
    
    public Class4882(final Class4803 class4803, final String s, final int n, final int n2) {
        super(class4803, s, n, n2, 1060, 357, false);
        this.field20876 = new ArrayList<Class4868>();
        for (final Class283 class4804 : Class283.values()) {
            final Class4857 class4805;
            this.method14239(class4805 = new Class4857(this, "KEY_" + class4804.field1563 + this.method14250().size(), class4804.method928(), class4804.method927(), class4804.method929(), class4804.method930(), class4804.field1560, class4804.field1563));
            class4805.method14260((class4858, n) -> {
                this.field20877 = class4805.field20807;
                this.method14517();
            });
        }
        this.method14311(false);
    }
    
    @Override
    public boolean method14211(final int n, final int n2, final int field20877) {
        if (field20877 <= 1) {
            return super.method14211(n, n2, field20877);
        }
        this.field20877 = field20877;
        this.method14517();
        return false;
    }
    
    @Override
    public void method14204(final int field20877) {
        final Class283[] values = Class283.values();
        for (int length = values.length, i = 0; i < length; ++i) {
            if (values[i].field1563 == field20877) {
                super.method14204(field20877);
                return;
            }
        }
        this.field20877 = field20877;
        this.method14517();
        super.method14204(field20877);
    }
    
    public void method14614() {
        for (final Class4803 class4803 : this.method14250()) {
            if (!(class4803 instanceof Class4857)) {
                continue;
            }
            ((Class4857)class4803).method14570();
        }
    }
    
    public int[] method14615(final int n) {
        for (final Class283 class283 : Class283.values()) {
            if (class283.field1563 == n) {
                return new int[] { class283.method928() + class283.method929() / 2, class283.method927() + class283.method930() };
            }
        }
        return new int[] { this.method14276() / 2, 20 };
    }
    
    @Override
    public void method14200(final int n, final int n2) {
        super.method14200(n, n2);
    }
    
    @Override
    public void method14205(final float n) {
        final int n2 = 20;
        final int n3 = 14;
        final int n4 = this.field20478 - n2;
        final int n5 = this.field20479 - n2;
        final int n6 = this.field20480 + n2 * 2;
        final int n7 = this.field20481 + 5 + n2 * 2;
        Class8154.method26913((float)(n4 + n3 / 2), (float)(n5 + n3 / 2), (float)(n6 - n3), (float)(n7 - n3), 20.0f, n * 0.5f);
        Class8154.method26924((float)n4, (float)n5, (float)n6, (float)n7, 14.0f, Class265.field1278.field1292);
        super.method14205(n);
    }
}
