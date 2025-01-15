// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Predicate;

public class Class3470 extends Class3467
{
    private static String[] field16351;
    private final Predicate<Class2113> field16352;
    public int field16353;
    public int field16354;
    public int field16355;
    
    public Class3470(final Class759 class759, final Predicate<Class2113> field16352) {
        super(class759);
        this.field16354 = -1;
        this.field16355 = -1;
        this.field16352 = field16352;
    }
    
    public Class3470(final Class759 class759, final int field16355, final Predicate<Class2113> predicate) {
        this(class759, predicate);
        this.field16355 = field16355;
    }
    
    public int method11036() {
        return Math.max(240, this.field16355);
    }
    
    @Override
    public boolean method11013() {
        return super.method11013() && this.field16340.field2391.method6765().method31216(Class8878.field37316) && this.method11037(this.field16340.field2391.method6954()) && !this.method11033();
    }
    
    @Override
    public void method11015() {
        super.method11015();
        this.field16353 = 0;
    }
    
    @Override
    public boolean method11017() {
        if (this.field16353 <= this.method11036()) {
            if (!this.method11033()) {
                if (this.field16341.method1082(this.field16340.method1934(), 2.0)) {
                    if (this.method11037(this.field16340.field2391.method6954())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    @Override
    public void method11018() {
        super.method11018();
        this.field16340.field2391.method6780(this.field16340.method1643(), this.field16341, -1);
    }
    
    @Override
    public void method11016() {
        super.method11016();
        if (this.field16340.method2633().nextInt(20) == 0) {
            this.field16340.field2391.method6955(1019, this.field16341, 0);
            if (!this.field16340.field2933) {
                this.field16340.method2707(this.field16340.method2757());
            }
        }
        ++this.field16353;
        final int field16354 = (int)(this.field16353 / (float)this.method11036() * 10.0f);
        if (field16354 != this.field16354) {
            this.field16340.field2391.method6780(this.field16340.method1643(), this.field16341, field16354);
            this.field16354 = field16354;
        }
        if (this.field16353 == this.method11036()) {
            if (this.method11037(this.field16340.field2391.method6954())) {
                this.field16340.field2391.method6690(this.field16341, false);
                this.field16340.field2391.method6955(1021, this.field16341, 0);
                this.field16340.field2391.method6955(2001, this.field16341, Class3833.method11774(this.field16340.field2391.method6701(this.field16341)));
            }
        }
    }
    
    private boolean method11037(final Class2113 class2113) {
        return this.field16352.test(class2113);
    }
}
