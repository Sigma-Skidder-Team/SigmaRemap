// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;

public class Class8879
{
    private int field37347;
    private Object field37348;
    
    public Class8879(final Class4405 class4405) {
        this.field37347 = -1;
        this.method31226(class4405);
    }
    
    public Class8879(final int field37347, final Class3167 field37348) {
        this.field37347 = -1;
        this.field37347 = field37347;
        this.field37348 = field37348;
    }
    
    public Class8879(final int field37347, final Class<? extends Class527> field37348) {
        this.field37347 = -1;
        this.field37347 = field37347;
        this.field37348 = field37348;
    }
    
    public void method31226(final Class4405 class4405) {
        if (!class4405.method13269("target")) {
            return;
        }
        if (class4405.method13269("key")) {
            this.field37347 = class4405.method13262("key");
        }
        if (class4405.method13269("type")) {
            final String method13268 = class4405.method13268("type");
            switch (method13268) {
                case "mod": {
                    for (final Class3167 field37348 : Class9463.method35173().method35189().method21553().values()) {
                        if (class4405.method13268("target").equals(field37348.method9901())) {
                            this.field37348 = field37348;
                        }
                    }
                }
                case "screen": {
                    final Class<? extends Class527> method13269 = Class9463.method35173().method35193().method32151(class4405.method13268("target"));
                    if (method13269 != null) {
                        this.field37348 = method13269;
                        break;
                    }
                    break;
                }
            }
        }
    }
    
    public Class4405 method31227() {
        final Class4405 class4405 = new Class4405();
        switch (Class8623.field36188[this.method31231().ordinal()]) {
            case 1: {
                class4405.method13301("type", "mod");
                class4405.method13301("target", ((Class3167)this.field37348).method9901());
                break;
            }
            case 2: {
                class4405.method13301("type", "screen");
                class4405.method13301("target", Class9463.method35173().method35193().method32152((Class<? extends Class527>)this.field37348));
                break;
            }
        }
        class4405.method13298("key", this.field37347);
        return class4405;
    }
    
    public boolean method31228() {
        return this.field37348 != null;
    }
    
    public int method31229() {
        return this.field37347;
    }
    
    public void method31230(final int field37347) {
        this.field37347 = field37347;
    }
    
    public Class2093 method31231() {
        return (this.field37348 instanceof Class3167) ? Class2093.field12102 : Class2093.field12103;
    }
    
    public Object method31232() {
        return this.field37348;
    }
    
    public Class<? extends Class527> method31233() {
        return (Class)this.field37348;
    }
    
    public Class3167 method31234() {
        return (Class3167)this.field37348;
    }
    
    @Override
    public boolean equals(final Object o) {
        return o == this || (o instanceof Class8879 && this.method31232().equals(((Class8879)o).method31232()));
    }
}
