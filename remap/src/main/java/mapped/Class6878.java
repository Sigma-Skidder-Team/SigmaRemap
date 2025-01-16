// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.HashSet;
import java.util.Collection;
import com.google.common.collect.Sets;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.Style;

import java.util.UUID;
import java.util.Set;

public class Class6878 extends Class6879
{
    private final ResourceLocation field26947;
    private final Set<UUID> field26948;
    private int field26949;
    private int field26950;
    
    public Class6878(final ResourceLocation field26947, final ITextComponent class2250) {
        super(class2250, Class2200.field13396, Class342.field2105);
        this.field26948 = Sets.newHashSet();
        this.field26950 = 100;
        this.field26947 = field26947;
        this.method21064(0.0f);
    }
    
    public ResourceLocation method21048() {
        return this.field26947;
    }
    
    @Override
    public void method21049(final Class513 class513) {
        super.method21049(class513);
        this.field26948.add(class513.method1865());
    }
    
    public void method21050(final UUID uuid) {
        this.field26948.add(uuid);
    }
    
    @Override
    public void method21051(final Class513 class513) {
        super.method21051(class513);
        this.field26948.remove(class513.method1865());
    }
    
    @Override
    public void method21052() {
        super.method21052();
        this.field26948.clear();
    }
    
    public int method21053() {
        return this.field26949;
    }
    
    public int method21054() {
        return this.field26950;
    }
    
    public void method21055(final int field26949) {
        this.field26949 = field26949;
        this.method21064(MathHelper.clamp(field26949 / (float)this.field26950, 0.0f, 1.0f));
    }
    
    public void method21056(final int field26950) {
        this.field26950 = field26950;
        this.method21064(MathHelper.clamp(this.field26949 / (float)field26950, 0.0f, 1.0f));
    }
    
    public final ITextComponent method21057() {
        return Class9479.method35299(this.method21076()).applyTextStyle(class8768 -> {
            class8768.setColor(this.method21078().method8371());
            new Class9390(Class1961.field10697, new StringTextComponent(this.method21048().toString()));
            final Class9390 class8769;
            final Style class8770;
            class8770.method30420(class8769).method30421(this.method21048().toString());
        });
    }
    
    public boolean method21058(final Collection<Class513> collection) {
        final HashSet hashSet = Sets.newHashSet();
        final HashSet hashSet2 = Sets.newHashSet();
        for (final UUID obj : this.field26948) {
            int n = 0;
            final Iterator<Class513> iterator2 = collection.iterator();
            while (iterator2.hasNext()) {
                if (!iterator2.next().method1865().equals(obj)) {
                    continue;
                }
                n = 1;
                break;
            }
            if (n != 0) {
                continue;
            }
            hashSet.add(obj);
        }
        for (final Class513 class513 : collection) {
            int n2 = 0;
            final Iterator<UUID> iterator4 = this.field26948.iterator();
            while (iterator4.hasNext()) {
                if (!class513.method1865().equals(iterator4.next())) {
                    continue;
                }
                n2 = 1;
                break;
            }
            if (n2 != 0) {
                continue;
            }
            hashSet2.add(class513);
        }
        for (final UUID obj2 : hashSet) {
            for (final Class513 class514 : this.method21074()) {
                if (!class514.method1865().equals(obj2)) {
                    continue;
                }
                this.method21051(class514);
                break;
            }
            this.field26948.remove(obj2);
        }
        final Iterator iterator7 = hashSet2.iterator();
        while (iterator7.hasNext()) {
            this.method21049((Class513)iterator7.next());
        }
        return !hashSet.isEmpty() || !hashSet2.isEmpty();
    }
    
    public CompoundNBT method21059() {
        final CompoundNBT class51 = new CompoundNBT();
        class51.putString("Name", Class5953.method17869(this.field26956));
        class51.putBoolean("Visible", this.method21072());
        class51.putInt("Value", this.field26949);
        class51.putInt("Max", this.field26950);
        class51.putString("Color", this.method21078().method8372());
        class51.putString("Overlay", this.method21079().method1019());
        class51.putBoolean("DarkenScreen", this.method21080());
        class51.putBoolean("PlayBossMusic", this.method21081());
        class51.putBoolean("CreateWorldFog", this.method21082());
        final ListNBT class52 = new ListNBT();
        final Iterator<UUID> iterator = this.field26948.iterator();
        while (iterator.hasNext()) {
            ((AbstractList<CompoundNBT>)class52).add(Class9346.method34643(iterator.next()));
        }
        class51.put("Players", class52);
        return class51;
    }
    
    public static Class6878 method21060(final CompoundNBT class51, final ResourceLocation class52) {
        final Class6878 class53 = new Class6878(class52, Class5953.method17871(class51.getString("Name")));
        class53.method21073(class51.getBoolean("Visible"));
        class53.method21055(class51.getInt("Value"));
        class53.method21056(class51.getInt("Max"));
        class53.method21065(Class2200.method8373(class51.getString("Color")));
        class53.method21066(Class342.method1020(class51.getString("Overlay")));
        class53.method21067(class51.getBoolean("DarkenScreen"));
        class53.method21068(class51.getBoolean("PlayBossMusic"));
        class53.method21069(class51.getBoolean("CreateWorldFog"));
        final ListNBT method328 = class51.getList("Players", 10);
        for (int i = 0; i < method328.size(); ++i) {
            class53.method21050(Class9346.method34644(method328.method346(i)));
        }
        return class53;
    }
    
    public void method21061(final Class513 class513) {
        if (this.field26948.contains(class513.method1865())) {
            this.method21049(class513);
        }
    }
    
    public void method21062(final Class513 class513) {
        super.method21051(class513);
    }
}
