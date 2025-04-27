// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;
import com.google.common.collect.Iterables;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import net.minecraft.entity.LivingEntity;

import java.util.List;

public class Class5860<T extends LivingEntity> extends Class5853<T>
{
    private static String[] field24020;
    private List<Class6300> field24021;
    public final Class6300 field24022;
    public final Class6300 field24023;
    public final Class6300 field24024;
    public final Class6300 field24025;
    public final Class6300 field24026;
    private final Class6300 field24027;
    private final Class6300 field24028;
    private final boolean field24029;
    
    public Class5860(final float n, final boolean field24029) {
        super(Class6332::method18773, n, 0.0f, 64, 64);
        this.field24021 = Lists.newArrayList();
        this.field24029 = field24029;
        (this.field24028 = new Class6300(this, 24, 0)).method18638(-3.0f, -6.0f, -1.0f, 6.0f, 6.0f, 1.0f, n);
        (this.field24027 = new Class6300(this, 0, 0)).method18647(64, 32);
        this.field24027.method18638(-5.0f, 0.0f, -1.0f, 10.0f, 16.0f, 1.0f, n);
        if (!field24029) {
            (this.field23997 = new Class6300(this, 32, 48)).method18638(-1.0f, -2.0f, -2.0f, 4.0f, 12.0f, 4.0f, n);
            this.field23997.method18642(5.0f, 2.0f, 0.0f);
            (this.field24022 = new Class6300(this, 48, 48)).method18638(-1.0f, -2.0f, -2.0f, 4.0f, 12.0f, 4.0f, n + 0.25f);
            this.field24022.method18642(5.0f, 2.0f, 0.0f);
            (this.field24023 = new Class6300(this, 40, 32)).method18638(-3.0f, -2.0f, -2.0f, 4.0f, 12.0f, 4.0f, n + 0.25f);
            this.field24023.method18642(-5.0f, 2.0f, 10.0f);
        }
        else {
            (this.field23997 = new Class6300(this, 32, 48)).method18638(-1.0f, -2.0f, -2.0f, 3.0f, 12.0f, 4.0f, n);
            this.field23997.method18642(5.0f, 2.5f, 0.0f);
            (this.field23996 = new Class6300(this, 40, 16)).method18638(-2.0f, -2.0f, -2.0f, 3.0f, 12.0f, 4.0f, n);
            this.field23996.method18642(-5.0f, 2.5f, 0.0f);
            (this.field24022 = new Class6300(this, 48, 48)).method18638(-1.0f, -2.0f, -2.0f, 3.0f, 12.0f, 4.0f, n + 0.25f);
            this.field24022.method18642(5.0f, 2.5f, 0.0f);
            (this.field24023 = new Class6300(this, 40, 32)).method18638(-2.0f, -2.0f, -2.0f, 3.0f, 12.0f, 4.0f, n + 0.25f);
            this.field24023.method18642(-5.0f, 2.5f, 10.0f);
        }
        (this.field23999 = new Class6300(this, 16, 48)).method18638(-2.0f, 0.0f, -2.0f, 4.0f, 12.0f, 4.0f, n);
        this.field23999.method18642(1.9f, 12.0f, 0.0f);
        (this.field24024 = new Class6300(this, 0, 48)).method18638(-2.0f, 0.0f, -2.0f, 4.0f, 12.0f, 4.0f, n + 0.25f);
        this.field24024.method18642(1.9f, 12.0f, 0.0f);
        (this.field24025 = new Class6300(this, 0, 32)).method18638(-2.0f, 0.0f, -2.0f, 4.0f, 12.0f, 4.0f, n + 0.25f);
        this.field24025.method18642(-1.9f, 12.0f, 0.0f);
        (this.field24026 = new Class6300(this, 16, 32)).method18638(-4.0f, 0.0f, -2.0f, 8.0f, 12.0f, 4.0f, n + 0.25f);
        this.field24026.method18642(0.0f, 0.0f, 0.0f);
    }
    
    @Override
    public Iterable<Class6300> method17560() {
        return Iterables.concat((Iterable)super.method17560(), ImmutableList.of(this.field24024, this.field24025, this.field24022, this.field24023, (Object)this.field24026));
    }
    
    public void method17593(final MatrixStack class7351, final Class4150 class7352, final int n, final int n2) {
        this.field24028.method18632(this.field23993);
        this.field24028.field25180 = 0.0f;
        this.field24028.field25181 = 0.0f;
        this.field24028.method18643(class7351, class7352, n, n2);
    }
    
    public void method17594(final MatrixStack class7351, final Class4150 class7352, final int n, final int n2) {
        this.field24027.method18643(class7351, class7352, n, n2);
    }
    
    @Override
    public void method17580(final T t, final float n, final float n2, final float n3, final float n4, final float n5) {
        super.method17580(t, n, n2, n3, n4, n5);
        this.field24024.method18632(this.field23999);
        this.field24025.method18632(this.field23998);
        this.field24022.method18632(this.field23997);
        this.field24023.method18632(this.field23996);
        this.field24026.method18632(this.field23995);
    }
    
    @Override
    public void method17584(final boolean field25187) {
        super.method17584(field25187);
        this.field24022.field25187 = field25187;
        this.field24023.field25187 = field25187;
        this.field24024.field25187 = field25187;
        this.field24025.field25187 = field25187;
        this.field24026.field25187 = field25187;
        this.field24027.field25187 = field25187;
        this.field24028.field25187 = field25187;
    }
    
    @Override
    public void method17578(final Class2226 class2226, final MatrixStack class2227) {
        final Class6300 method17585 = this.method17585(class2226);
        if (!this.field24029) {
            method17585.method18645(class2227);
        }
        else {
            final float n = 0.5f * ((class2226 != Class2226.field13698) ? -1 : 1);
            final Class6300 class2228 = method17585;
            class2228.field25180 += n;
            method17585.method18645(class2227);
            final Class6300 class2229 = method17585;
            class2229.field25180 -= n;
        }
    }
    
    public Class6300 method17595(final Random random) {
        return this.field24021.get(random.nextInt(this.field24021.size()));
    }
    
    @Override
    public void accept(final Class6300 class6300) {
        if (this.field24021 == null) {
            this.field24021 = Lists.newArrayList();
        }
        this.field24021.add(class6300);
    }
}
