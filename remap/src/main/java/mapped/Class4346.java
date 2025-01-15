// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class4346 implements Class4252<Class5800>
{
    private static String[] field19465;
    private int field19466;
    private Class57 field19467;
    private int field19468;
    private int field19469;
    private boolean field19470;
    private boolean field19471;
    
    public Class4346() {
    }
    
    public Class4346(final int field19466, final Class57 field19467, final int field19468, final int field19469, final boolean field19470, final boolean field19471) {
        this.field19466 = field19466;
        this.field19467 = field19467;
        this.field19468 = field19468;
        this.field19469 = field19469;
        this.field19470 = field19470;
        this.field19471 = field19471;
    }
    
    @Override
    public void method12754(final Class8654 class8654) throws IOException {
        this.field19466 = class8654.method29501();
        this.field19467 = Class57.method361(class8654);
        this.field19468 = class8654.method29501();
        this.field19469 = class8654.method29501();
        this.field19470 = class8654.readBoolean();
        this.field19471 = class8654.readBoolean();
    }
    
    @Override
    public void method12755(final Class8654 class8654) throws IOException {
        class8654.method29505(this.field19466);
        this.field19467.method360(class8654);
        class8654.method29505(this.field19468);
        class8654.method29505(this.field19469);
        class8654.writeBoolean(this.field19470);
        class8654.writeBoolean(this.field19471);
    }
    
    public void method12764(final Class5800 class5800) {
        class5800.method17364(this);
    }
    
    public int method13050() {
        return this.field19466;
    }
    
    public Class57 method13051() {
        return this.field19467;
    }
    
    public int method13052() {
        return this.field19468;
    }
    
    public int method13053() {
        return this.field19469;
    }
    
    public boolean method13054() {
        return this.field19470;
    }
    
    public boolean method13055() {
        return this.field19471;
    }
}
