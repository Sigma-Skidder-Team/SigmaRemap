// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;
import java.util.function.Function;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.command.ICommandSource;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.Style;

public class Class497 extends Class436
{
    public final ITextComponent[] field2850;
    private boolean field2851;
    private Class512 field2852;
    private final String[] field2853;
    private Class181 field2854;
    
    public Class497() {
        super(Class5412.field22548);
        this.field2850 = new ITextComponent[] { new StringTextComponent(""), new StringTextComponent(""), new StringTextComponent(""), new StringTextComponent("") };
        this.field2851 = true;
        this.field2853 = new String[4];
        this.field2854 = Class181.field552;
    }
    
    @Override
    public Class51 method2180(final Class51 class51) {
        super.method2180(class51);
        for (int i = 0; i < 4; ++i) {
            class51.method306("Text" + (i + 1), Class5953.method17869(this.field2850[i]));
        }
        class51.method306("Color", this.field2854.method814());
        return class51;
    }
    
    @Override
    public void method2179(final Class51 class51) {
        this.field2851 = false;
        super.method2179(class51);
        this.field2854 = Class181.method820(class51.method323("Color"), Class181.field552);
        for (int i = 0; i < 4; ++i) {
            final String method323 = class51.method323("Text" + (i + 1));
            final ITextComponent method324 = Class5953.method17871(method323.isEmpty() ? "\"\"" : method323);
            if (this.field2656 instanceof Class1849) {
                try {
                    this.field2850[i] = Class9479.method35294(this.method2528(null), method324, null, 0);
                }
                catch (final CommandSyntaxException ex) {
                    this.field2850[i] = method324;
                }
            }
            else {
                this.field2850[i] = method324;
            }
            this.field2853[i] = null;
        }
    }
    
    public ITextComponent method2520(final int n) {
        return this.field2850[n];
    }
    
    public void method2521(final int n, final ITextComponent class2250) {
        this.field2850[n] = class2250;
        this.field2853[n] = null;
    }
    
    @Nullable
    public String method2522(final int n, final Function<ITextComponent, String> function) {
        if (this.field2853[n] == null) {
            if (this.field2850[n] != null) {
                this.field2853[n] = function.apply(this.field2850[n]);
            }
        }
        return this.field2853[n];
    }
    
    @Nullable
    @Override
    public Class4357 method2195() {
        return new Class4357(this.field2657, 9, this.method2196());
    }
    
    @Override
    public Class51 method2196() {
        return this.method2180(new Class51());
    }
    
    @Override
    public boolean method2178() {
        return true;
    }
    
    public boolean method2523() {
        return this.field2851;
    }
    
    public void method2524(final boolean field2851) {
        this.field2851 = field2851;
        if (!field2851) {
            this.field2852 = null;
        }
    }
    
    public void method2525(final Class512 field2852) {
        this.field2852 = field2852;
    }
    
    public Class512 method2526() {
        return this.field2852;
    }
    
    public boolean method2527(final Class512 class512) {
        for (final ITextComponent class513 : this.field2850) {
            final Style class514 = (class513 != null) ? class513.getStyle() : null;
            if (class514 != null) {
                if (class514.method30410() != null) {
                    final Class9485 method30410 = class514.method30410();
                    if (method30410.method35309() == Class2075.field11973) {
                        class512.method1897().method1573().method24998(this.method2528((Class513)class512), method30410.method35310());
                    }
                }
            }
        }
        return true;
    }
    
    public Class7492 method2528(final Class513 class513) {
        return new Class7492(ICommandSource.DUMMY, new Vec3d(this.field2657.getX() + 0.5, this.field2657.getY() + 0.5, this.field2657.getZ() + 0.5), Vec2f.ZERO, (Class1849)this.field2656, 2, (class513 != null) ? class513.getName().getString() : "Sign", (class513 != null) ? class513.getDisplayName() : new StringTextComponent("Sign"), this.field2656.method6679(), class513);
    }
    
    public Class181 method2529() {
        return this.field2854;
    }
    
    public boolean method2530(final Class181 field2854) {
        if (field2854 == this.method2529()) {
            return false;
        }
        this.field2854 = field2854;
        this.method2161();
        this.field2656.method6693(this.method2193(), this.method2194(), this.method2194(), 3);
        return true;
    }
}
