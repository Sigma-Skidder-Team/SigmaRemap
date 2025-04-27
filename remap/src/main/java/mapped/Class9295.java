// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.AbstractList;
import org.apache.logging.log4j.LogManager;
import java.util.Iterator;
import java.io.File;
import com.google.common.collect.Lists;
import java.util.List;
import org.apache.logging.log4j.Logger;

public class Class9295
{
    private static final Logger field39864;
    private final Minecraft field39865;
    private final List<ServerData> field39866;
    
    public Class9295(final Minecraft field39865) {
        this.field39866 = Lists.newArrayList();
        this.field39865 = field39865;
        this.method34331();
    }
    
    public void method34331() {
        try {
            this.field39866.clear();
            final CompoundNBT method26594 = Class8097.method26594(new File(this.field39865.field4652, "servers.dat"));
            if (method26594 == null) {
                return;
            }
            final ListNBT method26595 = method26594.getList("servers", 10);
            for (int i = 0; i < method26595.size(); ++i) {
                this.field39866.add(ServerData.method35868(method26595.method346(i)));
            }
        }
        catch (final Exception ex) {
            Class9295.field39864.error("Couldn't load server list", ex);
        }
    }
    
    public void method34332() {
        try {
            final ListNBT class52 = new ListNBT();
            final Iterator<ServerData> iterator = this.field39866.iterator();
            while (iterator.hasNext()) {
                class52.add(iterator.next().method35865());
            }
            final CompoundNBT class53 = new CompoundNBT();
            class53.put("servers", class52);
            Class8097.method26592(class53, new File(this.field39865.field4652, "servers.dat"));
        }
        catch (final Exception ex) {
            Class9295.field39864.error("Couldn't save server list", ex);
        }
    }
    
    public ServerData method34333(final int n) {
        return this.field39866.get(n);
    }
    
    public void method34334(final ServerData class9575) {
        this.field39866.remove(class9575);
    }
    
    public void method34335(final ServerData class9575) {
        this.field39866.add(class9575);
    }
    
    public int method34336() {
        return this.field39866.size();
    }
    
    public void method34337(final int n, final int n2) {
        final ServerData method34333 = this.method34333(n);
        this.field39866.set(n, this.method34333(n2));
        this.field39866.set(n2, method34333);
        this.method34332();
    }
    
    public void method34338(final int n, final ServerData class9575) {
        this.field39866.set(n, class9575);
    }
    
    public static void method34339(final ServerData class9575) {
        final Class9295 class9576 = new Class9295(Minecraft.getInstance());
        class9576.method34331();
        for (int i = 0; i < class9576.method34336(); ++i) {
            final ServerData method34333 = class9576.method34333(i);
            if (method34333.field41612.equals(class9575.field41612) && method34333.field41613.equals(class9575.field41613)) {
                class9576.method34338(i, class9575);
                break;
            }
        }
        class9576.method34332();
    }
    
    static {
        field39864 = LogManager.getLogger();
    }
}
