// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.AbstractList;
import org.apache.logging.log4j.LogManager;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.Collections;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import com.google.common.collect.Lists;
import java.util.Collection;
import org.apache.logging.log4j.Logger;

public class Class6522 extends Class6521
{
    private static final Logger field25961;
    private final Class1780 field25962;
    
    public Class6522(final Class1780 field25962) {
        this.field25962 = field25962;
    }
    
    public int method19720(final Collection<IRecipe<?>> collection, final Class513 class513) {
        final ArrayList arrayList = Lists.newArrayList();
        int n = 0;
        for (final IRecipe class514 : collection) {
            final ResourceLocation method11298 = class514.method11298();
            if (this.field25951.contains(method11298)) {
                continue;
            }
            if (class514.method11295()) {
                continue;
            }
            this.method19694(method11298);
            this.method19702(method11298);
            arrayList.add(method11298);
            Class7770.field31780.method13761(class513, class514);
            ++n;
        }
        this.method19722(Class2227.field13702, class513, arrayList);
        return n;
    }
    
    public int method19721(final Collection<IRecipe<?>> collection, final Class513 class513) {
        final ArrayList arrayList = Lists.newArrayList();
        int n = 0;
        final Iterator<IRecipe<?>> iterator = collection.iterator();
        while (iterator.hasNext()) {
            final ResourceLocation method11298 = iterator.next().method11298();
            if (!this.field25951.contains(method11298)) {
                continue;
            }
            this.method19698(method11298);
            arrayList.add(method11298);
            ++n;
        }
        this.method19722(Class2227.field13703, class513, arrayList);
        return n;
    }
    
    private void method19722(final Class2227 class2227, final Class513 class2228, final List<ResourceLocation> list) {
        class2228.field3039.method17469(new Class4331(class2227, list, (Collection<ResourceLocation>)Collections.emptyList(), this.field25953, this.field25954, this.field25955, this.field25956));
    }
    
    public CompoundNBT method19723() {
        final CompoundNBT class51 = new CompoundNBT();
        class51.putBoolean("isGuiOpen", this.field25953);
        class51.putBoolean("isFilteringCraftable", this.field25954);
        class51.putBoolean("isFurnaceGuiOpen", this.field25955);
        class51.putBoolean("isFurnaceFilteringCraftable", this.field25956);
        final ListNBT class52 = new ListNBT();
        final Iterator<ResourceLocation> iterator = this.field25951.iterator();
        while (iterator.hasNext()) {
            ((AbstractList<StringNBT>)class52).add(StringNBT.method290(iterator.next().toString()));
        }
        class51.put("recipes", class52);
        final ListNBT class53 = new ListNBT();
        final Iterator<ResourceLocation> iterator2 = this.field25952.iterator();
        while (iterator2.hasNext()) {
            ((AbstractList<StringNBT>)class53).add(StringNBT.method290(iterator2.next().toString()));
        }
        class51.put("toBeDisplayed", class53);
        return class51;
    }
    
    public void method19724(final CompoundNBT class51) {
        this.field25953 = class51.getBoolean("isGuiOpen");
        this.field25954 = class51.getBoolean("isFilteringCraftable");
        this.field25955 = class51.getBoolean("isFurnaceGuiOpen");
        this.field25956 = class51.getBoolean("isFurnaceFilteringCraftable");
        this.method19725(class51.getList("recipes", 8), this::method19693);
        this.method19725(class51.getList("toBeDisplayed", 8), this::method19701);
    }
    
    private void method19725(final ListNBT class52, final Consumer<IRecipe<?>> consumer) {
        for (int i = 0; i < class52.size(); ++i) {
            final String method353 = class52.method353(i);
            try {
                final ResourceLocation class53 = new ResourceLocation(method353);
                final Optional<? extends IRecipe<?>> method354 = this.field25962.method6382(class53);
                if (!method354.isPresent()) {
                    Class6522.field25961.error("Tried to load unrecognized recipe: {} removed now.", (Object)class53);
                }
                else {
                    consumer.accept(method354.get());
                }
            }
            catch (final Class2357 class54) {
                Class6522.field25961.error("Tried to load improperly formatted recipe: {} removed now.", (Object)method353);
            }
        }
    }
    
    public void method19726(final Class513 class513) {
        class513.field3039.method17469(new Class4331(Class2227.field13701, this.field25951, this.field25952, this.field25953, this.field25954, this.field25955, this.field25956));
    }
    
    static {
        field25961 = LogManager.getLogger();
    }
}
