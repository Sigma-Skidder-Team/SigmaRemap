// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Map;
import java.util.Collection;
import java.util.TreeSet;
import java.util.SortedSet;
import io.netty.buffer.ByteBuf;
import java.util.UUID;

public class Class8947 implements Class8948<Class756>
{
    public int method31738(final Class756 class756) {
        if (class756 != null) {
            return Class9367.method34761();
        }
        throw new NullPointerException("player is marked non-null but is null");
    }
    
    @Override
    public int method31739(final UUID uuid) {
        if (uuid != null) {
            return Class9367.method34761();
        }
        throw new NullPointerException("uuid is marked non-null but is null");
    }
    
    @Override
    public boolean method31740(final UUID uuid) {
        return this.method31747().containsKey(uuid);
    }
    
    @Override
    public String method31741() {
        return Class8563.method28793().method34745();
    }
    
    @Override
    public void method31742(final UUID uuid, final ByteBuf byteBuf) throws IllegalArgumentException {
        System.out.println("sendRawPacket");
        if (this.method31740(uuid)) {
            this.method31747().get(uuid).method18213(byteBuf);
            return;
        }
        throw new IllegalArgumentException("This player is not controlled by ViaVersion!");
    }
    
    public void method31743(final Class756 class756, final ByteBuf byteBuf) throws IllegalArgumentException {
        System.out.println("sendRawPacket");
        this.method31742(class756.method1865(), byteBuf);
    }
    
    @Override
    public Class8254 method31744(final String s, final Class320 class320, final Class2163 class321) {
        return new Class8253(s, 1.0f, class320, class321);
    }
    
    @Override
    public Class8254 method31745(final String s, final float n, final Class320 class320, final Class2163 class321) {
        return new Class8253(s, n, class320, class321);
    }
    
    @Override
    public SortedSet<Integer> method31746() {
        final TreeSet set = new TreeSet((SortedSet<E>)Class8626.method29276());
        set.removeAll(Class8563.method28793().method34756().method23293());
        return set;
    }
    
    public Map<UUID, Class6108> method31747() {
        return Class8563.method28794().method33557();
    }
}
