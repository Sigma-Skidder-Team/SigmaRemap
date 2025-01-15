// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Consumer;

public class Class8646
{
    private final Class3820 field36296;
    private final Class120 field36297;
    private final int field36298;
    private final Class6056 field36299;
    private String field36300;
    private final Class6096<?> field36301;
    
    public Class8646(final Class6096<?> field36301, final Class120 field36302, final Class3832 class3832, final int field36303) {
        this.field36299 = Class6056.method18001();
        this.field36301 = field36301;
        this.field36296 = class3832.method11704();
        this.field36297 = field36302;
        this.field36298 = field36303;
    }
    
    public static Class8646 method29409(final Class120 class120, final Class3832 class121) {
        return new Class8646(Class6096.field24752, class120, class121, 1);
    }
    
    public static Class8646 method29410(final Class120 class120, final Class3832 class121, final int n) {
        return new Class8646(Class6096.field24752, class120, class121, n);
    }
    
    public Class8646 method29411(final String s, final Class4220 class4220) {
        this.field36299.method18009(s, class4220);
        return this;
    }
    
    public void method29412(final Consumer<Class5763> consumer, final String str) {
        if (!new Class1932(str).equals(Class90.field211.method503(this.field36296))) {
            this.method29413(consumer, new Class1932(str));
            return;
        }
        throw new IllegalStateException("Single Item Recipe " + str + " should remove its 'save' argument");
    }
    
    public void method29413(final Consumer<Class5763> consumer, final Class1932 class1932) {
        this.method29414(class1932);
        this.field36299.method18003(new Class1932("recipes/root")).method18009("has_the_recipe", new Class4219(class1932)).method18007(Class6467.method19355(class1932)).method18011(Class6526.field25976);
        consumer.accept(new Class5764(class1932, this.field36301, (this.field36300 != null) ? this.field36300 : "", this.field36297, this.field36296, this.field36298, this.field36299, new Class1932(class1932.method7798(), "recipes/" + this.field36296.method11737().method22110() + "/" + class1932.method7797())));
    }
    
    private void method29414(final Class1932 obj) {
        if (!this.field36299.method18019().isEmpty()) {
            return;
        }
        throw new IllegalStateException("No way of obtaining recipe " + obj);
    }
}
