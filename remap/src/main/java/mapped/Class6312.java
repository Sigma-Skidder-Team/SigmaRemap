// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.mods.impl.render.NewNameTags;
import net.minecraft.item.ItemStack;

import java.util.Optional;
import java.util.Iterator;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.List;

public class Class6312
{
    private static String[] field25234;
    public int field25235;
    public float field25236;
    public float field25237;
    public int field25238;
    public int field25239;
    public ItemStack field25240;
    public ItemStack field25241;
    public ItemStack field25242;
    
    public Class6312(final int field25235) {
        this.field25235 = field25235;
    }
    
    public void method18687() {
        this.method18690();
        final boolean b = this.field25241 != null && this.field25241.field34176 > 0;
        final boolean b2 = this.field25240 != null && this.field25240.field34176 > 0;
        boolean b3 = false;
        Label_0123: {
            if (this.method18689() != null) {
                if (this.method18689().equals(this.field25242.getItem())) {
                    if (this.field25242 != null) {
                        if (this.field25242.field34176 < 64) {
                            b3 = true;
                            break Label_0123;
                        }
                    }
                }
            }
            b3 = false;
        }
        final boolean b4 = b3;
        if (this.field25237 < this.field25236) {
            if (b2) {
                if (b4) {
                    if (this.field25239 > 0) {
                        this.field25237 += Client.method35173().method35194().method29226();
                    }
                }
            }
        }
        if (this.field25239 > 0) {
            --this.field25239;
        }
        if (this.field25239 == 0) {
            if (b && b2) {
                final ItemStack field25241 = this.field25241;
                --field25241.field34176;
                this.field25239 = this.field25238;
            }
            else {
                this.field25237 = 0.0f;
            }
        }
        if (this.field25237 >= this.field25236) {
            if (this.field25236 != 0.0f) {
                if (b2) {
                    final ItemStack field25242 = this.field25240;
                    --field25242.field34176;
                }
                this.field25237 = 0.0f;
                if (this.field25242 != null) {
                    final ItemStack method18688 = this.method18688();
                    final ItemStack field25243 = this.field25242;
                    field25243.field34176 += method18688.field34176;
                }
            }
        }
        if (this.field25240 != null) {
            if (this.field25240.field34176 == 0) {
                this.field25240 = null;
            }
        }
    }
    
    public ItemStack method18688() {
        if (this.field25240 != null) {
            if (!NewNameTags.method10340().method6378(Class8976.field37844, new Class443(new ItemStack[] { new ItemStack(Items.field30766) }), NewNameTags.method10339().field4683).isPresent()) {
                final Class6581 class6581 = new Class6581(Class346.field2138, new Thread());
                final Iterator<? super Object> iterator = NewNameTags.method10341().field4663.method7611().stream().map((Function<? super Class1922, ?>)Class1921::method7620).collect((Collector<? super Object, ?, List<? super Object>>)Collectors.toList()).iterator();
                while (iterator.hasNext()) {
                    class6581.method19931(iterator.next());
                }
                NewNameTags.method10340().method5785(new Class7884(this), class6581, Class5026.field21549, Class5026.field21549, Util.method27841(), NewNameTags.method10342());
            }
            final Optional<Class3684> method6378 = NewNameTags.method10340().method6378(Class8976.field37844, new Class443(new ItemStack[] { this.field25240 }), NewNameTags.method10343().field4683);
            if (method6378.isPresent()) {
                final ItemStack method6379 = method6378.get().method11292();
                if (!method6379.method27620()) {
                    return method6379.method27641();
                }
            }
            return null;
        }
        return null;
    }
    
    public Item method18689() {
        final ItemStack method18688 = this.method18688();
        if (method18688 == null) {
            return null;
        }
        return method18688.getItem();
    }
    
    public ItemStack method18690() {
        if (this.field25242 != null) {
            if (this.field25242.getItem() instanceof Class4099) {
                this.field25242 = null;
            }
        }
        if (this.field25240 != null) {
            if (this.field25240.getItem() instanceof Class4099) {
                this.field25240 = null;
            }
        }
        if (this.field25241 != null) {
            if (this.field25241.getItem() instanceof Class4099) {
                this.field25241 = null;
            }
        }
        if (this.field25242 != null) {
            return this.field25242;
        }
        if (this.field25240 != null) {
            final ItemStack method18688 = this.method18688();
            if (method18688 != null) {
                method18688.field34176 = 0;
            }
            return this.field25242 = method18688;
        }
        return null;
    }
}
