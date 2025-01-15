// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;
import java.io.IOException;
import java.util.Objects;

public class Class4377 implements Class4252<Class5800>
{
    private String field19609;
    private String field19610;
    private int field19611;
    private Class2142 field19612;
    
    public Class4377() {
        this.field19609 = "";
    }
    
    public Class4377(final Class2142 field19612, final String field19613, final String field19614, final int field19615) {
        this.field19609 = "";
        if (field19612 != Class2142.field12615 && field19613 == null) {
            throw new IllegalArgumentException("Need an objective name");
        }
        this.field19609 = field19614;
        this.field19610 = field19613;
        this.field19611 = field19615;
        this.field19612 = field19612;
    }
    
    @Override
    public void method12754(final Class8654 class8654) throws IOException {
        this.field19609 = class8654.method29513(40);
        this.field19612 = class8654.method29499(Class2142.class);
        final String method29513 = class8654.method29513(16);
        this.field19610 = (Objects.equals(method29513, "") ? null : method29513);
        if (this.field19612 != Class2142.field12615) {
            this.field19611 = class8654.method29501();
        }
    }
    
    @Override
    public void method12755(final Class8654 class8654) throws IOException {
        class8654.method29514(this.field19609);
        class8654.method29500(this.field19612);
        class8654.method29514((this.field19610 != null) ? this.field19610 : "");
        if (this.field19612 != Class2142.field12615) {
            class8654.method29505(this.field19611);
        }
    }
    
    public void method12764(final Class5800 class5800) {
        class5800.method17357(this);
    }
    
    public String method13160() {
        return this.field19609;
    }
    
    @Nullable
    public String method13161() {
        return this.field19610;
    }
    
    public int method13162() {
        return this.field19611;
    }
    
    public Class2142 method13163() {
        return this.field19612;
    }
}
