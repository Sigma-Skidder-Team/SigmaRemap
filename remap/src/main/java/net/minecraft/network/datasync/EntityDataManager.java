// 
// Decompiled by Procyon v0.6.0
// 

package net.minecraft.network.datasync;

import mapped.*;
import net.minecraft.entity.Entity;
import org.apache.logging.log4j.LogManager;
import java.util.Objects;
import io.netty.handler.codec.DecoderException;
import io.netty.handler.codec.EncoderException;
import javax.annotation.Nullable;
import java.util.Iterator;
import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.List;
import org.apache.commons.lang3.ObjectUtils;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import com.google.common.collect.Maps;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.Map;
import org.apache.logging.log4j.Logger;

public class EntityDataManager
{
    private static final Logger field38914;
    private static final Map<Class<? extends Entity>, Integer> field38915;
    private final Entity field38916;
    private final Map<Integer, Class9369<?>> field38917;
    private final ReadWriteLock field38918;
    private boolean field38919;
    private boolean field38920;
    public Class3090 field38921;
    public BlockPos field38922;
    
    public EntityDataManager(final Entity field38916) {
        this.field38917 = Maps.newHashMap();
        this.field38918 = new ReentrantReadWriteLock();
        this.field38919 = true;
        this.field38921 = Class7102.field27633;
        this.field38922 = BlockPos.ZERO;
        this.field38916 = field38916;
    }
    
    public static <T> DataParameter<T> method33564(final Class<? extends Entity> obj, final Class4410<T> class4410) {
        if (EntityDataManager.field38914.isDebugEnabled()) {
            try {
                final Class<?> forName = Class.forName(Thread.currentThread().getStackTrace()[2].getClassName());
                if (!forName.equals(obj)) {
                    EntityDataManager.field38914.debug("defineId called for: {} from {}", (Object)obj, (Object)forName, (Object)new RuntimeException());
                }
            }
            catch (final ClassNotFoundException ex) {}
        }
        int n;
        if (EntityDataManager.field38915.containsKey(obj)) {
            n = EntityDataManager.field38915.get(obj) + 1;
        }
        else {
            int n2 = 0;
            Class<? super Entity> superclass = (Class<? super Entity>)obj;
            while (superclass != Entity.class) {
                superclass = superclass.getSuperclass();
                if (EntityDataManager.field38915.containsKey(superclass)) {
                    n2 = EntityDataManager.field38915.get(superclass) + 1;
                    break;
                }
            }
            n = n2;
        }
        if (n > 254) {
            throw new IllegalArgumentException("Data value id is too big with " + n + "! (Max is " + 254 + ")");
        }
        EntityDataManager.field38915.put(obj, n);
        return class4410.method13348(n);
    }
    
    public <T> void register(final DataParameter<T> class8810, final T t) {
        final int method30737 = class8810.method30737();
        if (method30737 > 254) {
            throw new IllegalArgumentException("Data value id is too big with " + method30737 + "! (Max is " + 254 + ")");
        }
        if (this.field38917.containsKey(method30737)) {
            throw new IllegalArgumentException("Duplicate id value for " + method30737 + "!");
        }
        if (Class7709.method24608(class8810.method30738()) >= 0) {
            this.method33566((DataParameter<Object>)class8810, t);
            return;
        }
        throw new IllegalArgumentException("Unregistered serializer " + class8810.method30738() + " for " + method30737 + "!");
    }
    
    private <T> void method33566(final DataParameter<T> class8810, final T t) {
        final Class9369 class8811 = new Class9369(class8810, t);
        this.field38918.writeLock().lock();
        this.field38917.put(class8810.method30737(), class8811);
        this.field38919 = false;
        this.field38918.writeLock().unlock();
    }
    
    private <T> Class9369<T> method33567(final DataParameter<T> class8810) {
        this.field38918.readLock().lock();
        Class9369 class8811;
        try {
            class8811 = this.field38917.get(class8810.method30737());
        }
        catch (final Throwable t) {
            final CrashReport method24421 = CrashReport.makeCrashReport(t, "Getting synched entity data");
            method24421.makeCategory("Synched entity data").addDetail("Data ID", class8810);
            throw new ReportedException(method24421);
        }
        finally {
            this.field38918.readLock().unlock();
        }
        return class8811;
    }
    
    public <T> T get(final DataParameter<T> class8810) {
        return this.method33567(class8810).method34768();
    }
    
    public <T> void set(final DataParameter<T> class8810, final T t) {
        final Class9369<T> method33567 = this.method33567(class8810);
        if (ObjectUtils.notEqual((Object)t, (Object)method33567.method34768())) {
            method33567.method34767(t);
            this.field38916.method1880(class8810);
            method33567.method34770(true);
            this.field38920 = true;
        }
    }
    
    public boolean method33570() {
        return this.field38920;
    }
    
    public static void method33571(final List<Class9369<?>> list, final PacketBuffer class8654) throws IOException {
        if (list != null) {
            for (int i = 0; i < list.size(); ++i) {
                method33574(class8654, (Class9369<Object>)list.get(i));
            }
        }
        class8654.writeByte(255);
    }
    
    @Nullable
    public List<Class9369<?>> method33572() {
        List arrayList = null;
        if (this.field38920) {
            this.field38918.readLock().lock();
            for (final Class9369 class9369 : this.field38917.values()) {
                if (!class9369.method34769()) {
                    continue;
                }
                class9369.method34770(false);
                if (arrayList == null) {
                    arrayList = Lists.newArrayList();
                }
                arrayList.add(class9369.method34771());
            }
            this.field38918.readLock().unlock();
        }
        this.field38920 = false;
        return arrayList;
    }
    
    @Nullable
    public List<Class9369<?>> method33573() {
        List arrayList = null;
        this.field38918.readLock().lock();
        for (final Class9369 class9369 : this.field38917.values()) {
            if (arrayList == null) {
                arrayList = Lists.newArrayList();
            }
            arrayList.add(class9369.method34771());
        }
        this.field38918.readLock().unlock();
        return arrayList;
    }
    
    private static <T> void method33574(final PacketBuffer class8654, final Class9369<T> class8655) throws IOException {
        final DataParameter<T> method34766 = class8655.method34766();
        final int method34767 = Class7709.method24608(method34766.method30738());
        if (method34767 >= 0) {
            class8654.writeByte(method34766.method30737());
            class8654.writeVarInt(method34767);
            method34766.method30738().method13347(class8654, class8655.method34768());
            return;
        }
        throw new EncoderException("Unknown serializer type " + method34766.method30738());
    }
    
    @Nullable
    public static List<Class9369<?>> method33575(final PacketBuffer class8654) throws IOException {
        List arrayList = null;
        short unsignedByte;
        while ((unsignedByte = class8654.readUnsignedByte()) != 255) {
            if (arrayList == null) {
                arrayList = Lists.newArrayList();
            }
            final int method29501 = class8654.readVarInt();
            final Class4410<?> method29502 = Class7709.method24607(method29501);
            if (method29502 == null) {
                throw new DecoderException("Unknown serializer type " + method29501);
            }
            arrayList.add(method33576(class8654, unsignedByte, method29502));
        }
        return arrayList;
    }
    
    private static <T> Class9369<T> method33576(final PacketBuffer class8654, final int n, final Class4410<T> class8655) {
        return new Class9369<T>(class8655.method13348(n), class8655.method13346(class8654));
    }
    
    public void method33577(final List<Class9369<?>> list) {
        this.field38918.writeLock().lock();
        for (final Class9369 class9369 : list) {
            final Class9369 class9370 = this.field38917.get(class9369.method34766().method30737());
            if (class9370 == null) {
                continue;
            }
            this.method33578((Class9369<Object>)class9370, class9369);
            this.field38916.method1880(class9369.method34766());
        }
        this.field38918.writeLock().unlock();
        this.field38920 = true;
    }
    
    private <T> void method33578(final Class9369<T> class9369, final Class9369<?> class9370) {
        if (Objects.equals(Class9369.method34772((Class9369<Object>)class9370).method30738(), Class9369.method34772((Class9369<Object>)class9369).method30738())) {
            class9369.method34767(class9370.method34768());
            return;
        }
        throw new IllegalStateException(String.format("Invalid entity data item type for field %d on entity %s: old=%s(%s), new=%s(%s)", Class9369.method34772((Class9369<Object>)class9369).method30737(), this.field38916, Class9369.method34773((Class9369<Object>)class9369), Class9369.method34773((Class9369<Object>)class9369).getClass(), Class9369.method34773((Class9369<Object>)class9370), Class9369.method34773((Class9369<Object>)class9370).getClass()));
    }
    
    public boolean method33579() {
        return this.field38919;
    }
    
    public void method33580() {
        this.field38920 = false;
        this.field38918.readLock().lock();
        final Iterator<Class9369<?>> iterator = this.field38917.values().iterator();
        while (iterator.hasNext()) {
            iterator.next().method34770(false);
        }
        this.field38918.readLock().unlock();
    }
    
    static {
        field38914 = LogManager.getLogger();
        field38915 = Maps.newHashMap();
    }
}
