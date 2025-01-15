// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Arrays;
import javax.annotation.Nullable;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import net.minecraft.util.text.ITextComponent;

import java.util.Set;
import java.util.Map;

public class Class8863
{
    private final Class8863 field37253;
    private final Class7339 field37254;
    private final Class9032 field37255;
    private final Class1932 field37256;
    private final Map<String, Class8832> field37257;
    private final String[][] field37258;
    private final Set<Class8863> field37259;
    private final ITextComponent field37260;
    
    public Class8863(final Class1932 field37256, final Class8863 field37257, final Class7339 class2252, final Class9032 field37259, final Map<String, Class8832> map, final String[][] field37260) {
        this.field37259 = Sets.newLinkedHashSet();
        this.field37256 = field37256;
        this.field37254 = class2252;
        this.field37257 = (Map<String, Class8832>)ImmutableMap.copyOf((Map)map);
        this.field37253 = field37257;
        this.field37255 = field37259;
        this.field37258 = field37260;
        if (field37257 != null) {
            field37257.method31041(this);
        }
        if (class2252 != null) {
            this.field37260 = new Class2260("[").method8458(class2252.method22527().method8466().method8467(class2251 -> {
                final ITextComponent class2253;
                final Class2116 class2254;
                class2253.method8466().method8469(class2254).method8457("\n").method8458(class2252.method22528());
                class2251.method30420(new Class9390(Class1961.field10697, class2250));
            })).method8457("]").method8469(class2252.method22531().method8018());
        }
        else {
            this.field37260 = new Class2260(field37256.toString());
        }
    }
    
    public Class6056 method31034() {
        return new Class6056((this.field37253 != null) ? this.field37253.method31042() : null, this.field37254, this.field37255, this.field37257, this.field37258, null);
    }
    
    @Nullable
    public Class8863 method31035() {
        return this.field37253;
    }
    
    @Nullable
    public Class7339 method31036() {
        return this.field37254;
    }
    
    public Class9032 method31037() {
        return this.field37255;
    }
    
    @Override
    public String toString() {
        return "SimpleAdvancement{id=" + this.method31042() + ", parent=" + ((this.field37253 != null) ? this.field37253.method31042() : "null") + ", display=" + this.field37254 + ", rewards=" + this.field37255 + ", criteria=" + this.field37257 + ", requirements=" + Arrays.deepToString(this.field37258) + '}';
    }
    
    public Iterable<Class8863> method31038() {
        return this.field37259;
    }
    
    public Map<String, Class8832> method31039() {
        return this.field37257;
    }
    
    public int method31040() {
        return this.field37258.length;
    }
    
    public void method31041(final Class8863 class8863) {
        this.field37259.add(class8863);
    }
    
    public Class1932 method31042() {
        return this.field37256;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof Class8863 && this.field37256.equals(((Class8863)o).field37256));
    }
    
    @Override
    public int hashCode() {
        return this.field37256.hashCode();
    }
    
    public String[][] method31043() {
        return this.field37258;
    }
    
    public ITextComponent method31044() {
        return this.field37260;
    }
}
