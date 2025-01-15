// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.io.IOException;
import com.google.common.collect.Lists;
import net.minecraft.util.text.ITextComponent;

import java.util.Collection;

public class Class4290 implements Class4252<Class5800>
{
    private String field19235;
    private ITextComponent field19236;
    private ITextComponent field19237;
    private ITextComponent field19238;
    private String field19239;
    private String field19240;
    private Class2116 field19241;
    private final Collection<String> field19242;
    private int field19243;
    private int field19244;
    
    public Class4290() {
        this.field19235 = "";
        this.field19236 = new Class2260("");
        this.field19237 = new Class2260("");
        this.field19238 = new Class2260("");
        this.field19239 = Class2097.field12147.field12152;
        this.field19240 = Class343.field2112.field2117;
        this.field19241 = Class2116.field12330;
        this.field19242 = Lists.newArrayList();
    }
    
    public Class4290(final Class6749 class6749, final int field19243) {
        this.field19235 = "";
        this.field19236 = new Class2260("");
        this.field19237 = new Class2260("");
        this.field19238 = new Class2260("");
        this.field19239 = Class2097.field12147.field12152;
        this.field19240 = Class343.field2112.field2117;
        this.field19241 = Class2116.field12330;
        this.field19242 = Lists.newArrayList();
        this.field19235 = class6749.method20539();
        this.field19243 = field19243;
        if (field19243 == 0 || field19243 == 2) {
            this.field19236 = class6749.method20540();
            this.field19244 = class6749.method20560();
            this.field19239 = class6749.method20554().field12152;
            this.field19240 = class6749.method20558().field2117;
            this.field19241 = class6749.method20563();
            this.field19237 = class6749.method20544();
            this.field19238 = class6749.method20546();
        }
        if (field19243 == 0) {
            this.field19242.addAll(class6749.method20547());
        }
    }
    
    public Class4290(final Class6749 class6749, final Collection<String> collection, final int field19243) {
        this.field19235 = "";
        this.field19236 = new Class2260("");
        this.field19237 = new Class2260("");
        this.field19238 = new Class2260("");
        this.field19239 = Class2097.field12147.field12152;
        this.field19240 = Class343.field2112.field2117;
        this.field19241 = Class2116.field12330;
        this.field19242 = Lists.newArrayList();
        if (field19243 != 3 && field19243 != 4) {
            throw new IllegalArgumentException("Method must be join or leave for player constructor");
        }
        if (collection != null && !collection.isEmpty()) {
            this.field19243 = field19243;
            this.field19235 = class6749.method20539();
            this.field19242.addAll(collection);
            return;
        }
        throw new IllegalArgumentException("Players cannot be null/empty");
    }
    
    @Override
    public void method12754(final Class8654 class8654) throws IOException {
        this.field19235 = class8654.method29513(16);
        this.field19243 = class8654.readByte();
        if (this.field19243 == 0 || this.field19243 == 2) {
            this.field19236 = class8654.method29497();
            this.field19244 = class8654.readByte();
            this.field19239 = class8654.method29513(40);
            this.field19240 = class8654.method29513(40);
            this.field19241 = class8654.method29499(Class2116.class);
            this.field19237 = class8654.method29497();
            this.field19238 = class8654.method29497();
        }
        if (this.field19243 != 0) {
            if (this.field19243 != 3) {
                if (this.field19243 != 4) {
                    return;
                }
            }
        }
        for (int method29501 = class8654.method29501(), i = 0; i < method29501; ++i) {
            this.field19242.add(class8654.method29513(40));
        }
    }
    
    @Override
    public void method12755(final Class8654 class8654) throws IOException {
        class8654.method29514(this.field19235);
        class8654.writeByte(this.field19243);
        if (this.field19243 == 0 || this.field19243 == 2) {
            class8654.method29498(this.field19236);
            class8654.writeByte(this.field19244);
            class8654.method29514(this.field19239);
            class8654.method29514(this.field19240);
            class8654.method29500(this.field19241);
            class8654.method29498(this.field19237);
            class8654.method29498(this.field19238);
        }
        if (this.field19243 != 0) {
            if (this.field19243 != 3) {
                if (this.field19243 != 4) {
                    return;
                }
            }
        }
        class8654.method29505(this.field19242.size());
        final Iterator<String> iterator = this.field19242.iterator();
        while (iterator.hasNext()) {
            class8654.method29514(iterator.next());
        }
    }
    
    public void method12764(final Class5800 class5800) {
        class5800.method17359(this);
    }
    
    public String method12880() {
        return this.field19235;
    }
    
    public ITextComponent method12881() {
        return this.field19236;
    }
    
    public Collection<String> method12882() {
        return this.field19242;
    }
    
    public int method12883() {
        return this.field19243;
    }
    
    public int method12884() {
        return this.field19244;
    }
    
    public Class2116 method12885() {
        return this.field19241;
    }
    
    public String method12886() {
        return this.field19239;
    }
    
    public String method12887() {
        return this.field19240;
    }
    
    public ITextComponent method12888() {
        return this.field19237;
    }
    
    public ITextComponent method12889() {
        return this.field19238;
    }
}
