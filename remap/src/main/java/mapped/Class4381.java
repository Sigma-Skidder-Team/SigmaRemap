// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.Vec3d;

import javax.annotation.Nullable;
import java.io.IOException;

public class Class4381 implements Class4252<Class5813>
{
    private static String[] field19621;
    private int field19622;
    private Class2029 field19623;
    private Vec3d field19624;
    private Class316 field19625;
    
    public Class4381() {
    }
    
    public Class4381(final Entity class399) {
        this.field19622 = class399.method1643();
        this.field19623 = Class2029.field11565;
    }
    
    public Class4381(final Entity class399, final Class316 field19625) {
        this.field19622 = class399.method1643();
        this.field19623 = Class2029.field11564;
        this.field19625 = field19625;
    }
    
    public Class4381(final Entity class399, final Class316 field19625, final Vec3d field19626) {
        this.field19622 = class399.method1643();
        this.field19623 = Class2029.field11566;
        this.field19625 = field19625;
        this.field19624 = field19626;
    }
    
    @Override
    public void method12754(final Class8654 class8654) throws IOException {
        this.field19622 = class8654.method29501();
        this.field19623 = class8654.method29499(Class2029.class);
        if (this.field19623 == Class2029.field11566) {
            this.field19624 = new Vec3d(class8654.readFloat(), class8654.readFloat(), class8654.readFloat());
        }
        if (this.field19623 == Class2029.field11564 || this.field19623 == Class2029.field11566) {
            this.field19625 = class8654.method29499(Class316.class);
        }
    }
    
    @Override
    public void method12755(final Class8654 class8654) throws IOException {
        class8654.method29505(this.field19622);
        class8654.method29500(this.field19623);
        if (this.field19623 == Class2029.field11566) {
            class8654.writeFloat((float)this.field19624.x);
            class8654.writeFloat((float)this.field19624.y);
            class8654.writeFloat((float)this.field19624.z);
        }
        if (this.field19623 == Class2029.field11564 || this.field19623 == Class2029.field11566) {
            class8654.method29500(this.field19625);
        }
    }
    
    public void method12756(final Class5813 class5813) {
        class5813.method17427(this);
    }
    
    @Nullable
    public Entity method13170(final Class1847 class1847) {
        return class1847.method6741(this.field19622);
    }
    
    public Class2029 method13171() {
        return this.field19623;
    }
    
    public Class316 method13172() {
        return this.field19625;
    }
    
    public Vec3d method13173() {
        return this.field19624;
    }
}
