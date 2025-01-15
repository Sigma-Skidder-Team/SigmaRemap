// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import java.util.function.Consumer;
import com.google.common.collect.Lists;
import java.util.List;
import org.apache.logging.log4j.Logger;

public class Class8411
{
    private static final Logger field34534;
    private final Item field34535;
    private final int field34536;
    private final List<Class120> field34537;
    private final Class6056 field34538;
    private String field34539;
    
    public Class8411(final Class3832 class3832, final int field34536) {
        this.field34537 = Lists.newArrayList();
        this.field34538 = Class6056.method18001();
        this.field34535 = class3832.method11704();
        this.field34536 = field34536;
    }
    
    public static Class8411 method28072(final Class3832 class3832) {
        return new Class8411(class3832, 1);
    }
    
    public static Class8411 method28073(final Class3832 class3832, final int n) {
        return new Class8411(class3832, n);
    }
    
    public Class8411 method28074(final Class7909<Item> class7909) {
        return this.method28077(Class120.method620(class7909));
    }
    
    public Class8411 method28075(final Class3832 class3832) {
        return this.method28076(class3832, 1);
    }
    
    public Class8411 method28076(final Class3832 class3832, final int n) {
        for (int i = 0; i < n; ++i) {
            this.method28077(Class120.method618(class3832));
        }
        return this;
    }
    
    public Class8411 method28077(final Class120 class120) {
        return this.method28078(class120, 1);
    }
    
    public Class8411 method28078(final Class120 class120, final int n) {
        for (int i = 0; i < n; ++i) {
            this.field34537.add(class120);
        }
        return this;
    }
    
    public Class8411 method28079(final String s, final Class4220 class4220) {
        this.field34538.method18009(s, class4220);
        return this;
    }
    
    public Class8411 method28080(final String field34539) {
        this.field34539 = field34539;
        return this;
    }
    
    public void method28081(final Consumer<Class5763> consumer) {
        this.method28083(consumer, Class90.field211.method503(this.field34535));
    }
    
    public void method28082(final Consumer<Class5763> consumer, final String str) {
        if (!new Class1932(str).equals(Class90.field211.method503(this.field34535))) {
            this.method28083(consumer, new Class1932(str));
            return;
        }
        throw new IllegalStateException("Shapeless Recipe " + str + " should remove its 'save' argument");
    }
    
    public void method28083(final Consumer<Class5763> consumer, final Class1932 class1932) {
        this.method28084(class1932);
        this.field34538.method18003(new Class1932("recipes/root")).method18009("has_the_recipe", new Class4219(class1932)).method18007(Class6467.method19355(class1932)).method18011(Class6526.field25976);
        consumer.accept(new Class5765(class1932, this.field34535, this.field34536, (this.field34539 != null) ? this.field34539 : "", this.field34537, this.field34538, new Class1932(class1932.method7798(), "recipes/" + this.field34535.method11737().method22110() + "/" + class1932.method7797())));
    }
    
    private void method28084(final Class1932 obj) {
        if (!this.field34538.method18019().isEmpty()) {
            return;
        }
        throw new IllegalStateException("No way of obtaining recipe " + obj);
    }
    
    static {
        field34534 = LogManager.getLogger();
    }
}
