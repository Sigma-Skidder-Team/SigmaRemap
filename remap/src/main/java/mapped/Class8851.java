// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Consumer;

public class Class8851
{
    private final Item field37222;
    private final Class120 field37223;
    private final float field37224;
    private final int field37225;
    private final Class6056 field37226;
    private String field37227;
    private final Class6098<?> field37228;
    
    private Class8851(final Class3832 class3832, final Class120 field37223, final float field37224, final int field37225, final Class6098<?> field37226) {
        this.field37226 = Class6056.method18001();
        this.field37222 = class3832.method11704();
        this.field37223 = field37223;
        this.field37224 = field37224;
        this.field37225 = field37225;
        this.field37228 = field37226;
    }
    
    public static Class8851 method31000(final Class120 class120, final Class3832 class121, final float n, final int n2, final Class6098<?> class122) {
        return new Class8851(class121, class120, n, n2, class122);
    }
    
    public static Class8851 method31001(final Class120 class120, final Class3832 class121, final float n, final int n2) {
        return method31000(class120, class121, n, n2, Class6096.field24749);
    }
    
    public static Class8851 method31002(final Class120 class120, final Class3832 class121, final float n, final int n2) {
        return method31000(class120, class121, n, n2, Class6096.field24748);
    }
    
    public Class8851 method31003(final String s, final Class4220 class4220) {
        this.field37226.method18009(s, class4220);
        return this;
    }
    
    public void method31004(final Consumer<Class5763> consumer) {
        this.method31006(consumer, Class90.field211.method503(this.field37222));
    }
    
    public void method31005(final Consumer<Class5763> consumer, final String s) {
        final Class1932 method503 = Class90.field211.method503(this.field37222);
        final Class1932 obj = new Class1932(s);
        if (!obj.equals(method503)) {
            this.method31006(consumer, obj);
            return;
        }
        throw new IllegalStateException("Recipe " + obj + " should remove its 'save' argument");
    }
    
    public void method31006(final Consumer<Class5763> consumer, final Class1932 class1932) {
        this.method31007(class1932);
        this.field37226.method18003(new Class1932("recipes/root")).method18009("has_the_recipe", new Class4219(class1932)).method18007(Class6467.method19355(class1932)).method18011(Class6526.field25976);
        consumer.accept(new Class5768(class1932, (this.field37227 != null) ? this.field37227 : "", this.field37223, this.field37222, this.field37224, this.field37225, this.field37226, new Class1932(class1932.method7798(), "recipes/" + this.field37222.method11737().method22110() + "/" + class1932.method7797()), (Class6096<? extends Class3680>)this.field37228));
    }
    
    private void method31007(final Class1932 obj) {
        if (!this.field37226.method18019().isEmpty()) {
            return;
        }
        throw new IllegalStateException("No way of obtaining recipe " + obj);
    }
}
