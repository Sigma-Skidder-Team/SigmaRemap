// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;

import java.util.HashSet;
import com.google.common.collect.Sets;
import java.util.function.Consumer;
import com.google.common.collect.Maps;
import com.google.common.collect.Lists;
import java.util.Map;
import java.util.List;
import org.apache.logging.log4j.Logger;

public class Class7989
{
    private static final Logger field32886;
    private final Item field32887;
    private final int field32888;
    private final List<String> field32889;
    private final Map<Character, Class120> field32890;
    private final Class6056 field32891;
    private String field32892;
    
    public Class7989(final Class3832 class3832, final int field32888) {
        this.field32889 = Lists.newArrayList();
        this.field32890 = Maps.newLinkedHashMap();
        this.field32891 = Class6056.method18001();
        this.field32887 = class3832.method11704();
        this.field32888 = field32888;
    }
    
    public static Class7989 method26053(final Class3832 class3832) {
        return method26054(class3832, 1);
    }
    
    public static Class7989 method26054(final Class3832 class3832, final int n) {
        return new Class7989(class3832, n);
    }
    
    public Class7989 method26055(final Character c, final Class7909<Item> class7909) {
        return this.method26057(c, Class120.method620(class7909));
    }
    
    public Class7989 method26056(final Character c, final Class3832 class3832) {
        return this.method26057(c, Class120.method618(class3832));
    }
    
    public Class7989 method26057(final Character obj, final Class120 class120) {
        if (this.field32890.containsKey(obj)) {
            throw new IllegalArgumentException("Symbol '" + obj + "' is already defined!");
        }
        if (obj != ' ') {
            this.field32890.put(obj, class120);
            return this;
        }
        throw new IllegalArgumentException("Symbol ' ' (whitespace) is reserved and cannot be defined");
    }
    
    public Class7989 method26058(final String s) {
        if (!this.field32889.isEmpty() && s.length() != this.field32889.get(0).length()) {
            throw new IllegalArgumentException("Pattern must be the same width on every line!");
        }
        this.field32889.add(s);
        return this;
    }
    
    public Class7989 method26059(final String s, final Class4220 class4220) {
        this.field32891.method18009(s, class4220);
        return this;
    }
    
    public Class7989 method26060(final String field32892) {
        this.field32892 = field32892;
        return this;
    }
    
    public void method26061(final Consumer<Class5763> consumer) {
        this.method26063(consumer, Class90.field211.method503(this.field32887));
    }
    
    public void method26062(final Consumer<Class5763> consumer, final String str) {
        if (!new Class1932(str).equals(Class90.field211.method503(this.field32887))) {
            this.method26063(consumer, new Class1932(str));
            return;
        }
        throw new IllegalStateException("Shaped Recipe " + str + " should remove its 'save' argument");
    }
    
    public void method26063(final Consumer<Class5763> consumer, final Class1932 class1932) {
        this.method26064(class1932);
        this.field32891.method18003(new Class1932("recipes/root")).method18009("has_the_recipe", new Class4219(class1932)).method18007(Class6467.method19355(class1932)).method18011(Class6526.field25976);
        consumer.accept(new Class5767(class1932, this.field32887, this.field32888, (this.field32892 != null) ? this.field32892 : "", this.field32889, this.field32890, this.field32891, new Class1932(class1932.method7798(), "recipes/" + this.field32887.method11737().method22110() + "/" + class1932.method7797())));
    }
    
    private void method26064(final Class1932 obj) {
        if (this.field32889.isEmpty()) {
            throw new IllegalStateException("No pattern is defined for shaped recipe " + obj + "!");
        }
        final HashSet hashSet = Sets.newHashSet((Iterable)this.field32890.keySet());
        hashSet.remove(' ');
        for (final String s : this.field32889) {
            for (int i = 0; i < s.length(); ++i) {
                final char char1 = s.charAt(i);
                if (!this.field32890.containsKey(char1) && char1 != ' ') {
                    throw new IllegalStateException("Pattern in recipe " + obj + " uses undefined symbol '" + char1 + "'");
                }
                hashSet.remove(char1);
            }
        }
        if (!hashSet.isEmpty()) {
            throw new IllegalStateException("Ingredients are defined but not used in pattern for recipe " + obj);
        }
        if (this.field32889.size() == 1 && this.field32889.get(0).length() == 1) {
            throw new IllegalStateException("Shaped recipe " + obj + " only takes in a single item - should it be a shapeless recipe instead?");
        }
        if (!this.field32891.method18019().isEmpty()) {
            return;
        }
        throw new IllegalStateException("No way of obtaining recipe " + obj);
    }
    
    static {
        field32886 = LogManager.getLogger();
    }
}
