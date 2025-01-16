// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;

import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ConcurrentHashMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.concurrent.Executors;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import org.apache.logging.log4j.Logger;

public class Class9057
{
    private static final Logger field38341;
    private final ScheduledExecutorService field38342;
    private volatile boolean field38343;
    private final Class1202 field38344;
    private final Class1325 field38345;
    private final Class1182 field38346;
    private final Class1106 field38347;
    private final Class1087 field38348;
    private final Set<Class7437> field38349;
    private List<Class7437> field38350;
    private Class7446 field38351;
    private int field38352;
    private boolean field38353;
    private boolean field38354;
    private String field38355;
    private ScheduledFuture<?> field38356;
    private ScheduledFuture<?> field38357;
    private ScheduledFuture<?> field38358;
    private ScheduledFuture<?> field38359;
    private ScheduledFuture<?> field38360;
    private final Map<Class2099, Boolean> field38361;
    
    public Class9057() {
        this.field38342 = Executors.newScheduledThreadPool(3);
        this.field38343 = true;
        this.field38344 = new Class1202(this, null);
        this.field38345 = new Class1325(this, null);
        this.field38346 = new Class1182(this, null);
        this.field38347 = new Class1106(this, null);
        this.field38348 = new Class1087(this, null);
        this.field38349 = Sets.newHashSet();
        this.field38350 = Lists.newArrayList();
        this.field38361 = new ConcurrentHashMap<Class2099, Boolean>(Class2099.values().length);
    }
    
    public boolean method32588() {
        return this.field38343;
    }
    
    public synchronized void method32589() {
        if (this.field38343) {
            this.field38343 = false;
            this.method32602();
            this.method32601();
        }
    }
    
    public synchronized void method32590(final List<Class2099> list) {
        if (this.field38343) {
            this.field38343 = false;
            this.method32602();
            for (final Class2099 class2099 : list) {
                this.field38361.put(class2099, false);
                switch (Class9269.field39749[class2099.ordinal()]) {
                    case 1: {
                        this.field38356 = this.field38342.scheduleAtFixedRate(this.field38344, 0L, 60L, TimeUnit.SECONDS);
                        continue;
                    }
                    case 2: {
                        this.field38357 = this.field38342.scheduleAtFixedRate(this.field38345, 0L, 10L, TimeUnit.SECONDS);
                        continue;
                    }
                    case 3: {
                        this.field38358 = this.field38342.scheduleAtFixedRate(this.field38346, 0L, 60L, TimeUnit.SECONDS);
                        continue;
                    }
                    case 4: {
                        this.field38359 = this.field38342.scheduleAtFixedRate(this.field38347, 0L, 10L, TimeUnit.SECONDS);
                        continue;
                    }
                    case 5: {
                        this.field38360 = this.field38342.scheduleAtFixedRate(this.field38348, 0L, 300L, TimeUnit.SECONDS);
                        continue;
                    }
                }
            }
        }
    }
    
    public boolean method32591(final Class2099 class2099) {
        final Boolean b = this.field38361.get(class2099);
        return b != null && b;
    }
    
    public void method32592() {
        final Iterator<Class2099> iterator = this.field38361.keySet().iterator();
        while (iterator.hasNext()) {
            this.field38361.put(iterator.next(), false);
        }
    }
    
    public synchronized void method32593() {
        this.method32600();
        this.method32589();
    }
    
    public synchronized List<Class7437> method32594() {
        return Lists.newArrayList((Iterable)this.field38350);
    }
    
    public synchronized int method32595() {
        return this.field38352;
    }
    
    public synchronized boolean method32596() {
        return this.field38353;
    }
    
    public synchronized Class7446 method32597() {
        return this.field38351;
    }
    
    public synchronized boolean method32598() {
        return this.field38354;
    }
    
    public synchronized String method32599() {
        return this.field38355;
    }
    
    public synchronized void method32600() {
        this.field38343 = true;
        this.method32602();
    }
    
    private void method32601() {
        final Class2099[] values = Class2099.values();
        for (int length = values.length, i = 0; i < length; ++i) {
            this.field38361.put(values[i], false);
        }
        this.field38356 = this.field38342.scheduleAtFixedRate(this.field38344, 0L, 60L, TimeUnit.SECONDS);
        this.field38357 = this.field38342.scheduleAtFixedRate(this.field38345, 0L, 10L, TimeUnit.SECONDS);
        this.field38358 = this.field38342.scheduleAtFixedRate(this.field38346, 0L, 60L, TimeUnit.SECONDS);
        this.field38359 = this.field38342.scheduleAtFixedRate(this.field38347, 0L, 10L, TimeUnit.SECONDS);
        this.field38360 = this.field38342.scheduleAtFixedRate(this.field38348, 0L, 300L, TimeUnit.SECONDS);
    }
    
    private void method32602() {
        try {
            if (this.field38356 != null) {
                this.field38356.cancel(false);
            }
            if (this.field38357 != null) {
                this.field38357.cancel(false);
            }
            if (this.field38358 != null) {
                this.field38358.cancel(false);
            }
            if (this.field38359 != null) {
                this.field38359.cancel(false);
            }
            if (this.field38360 != null) {
                this.field38360.cancel(false);
            }
        }
        catch (final Exception ex) {
            Class9057.field38341.error("Failed to cancel Realms tasks", (Throwable)ex);
        }
    }
    
    private synchronized void method32603(final List<Class7437> field38350) {
        int n = 0;
        final Iterator<Class7437> iterator = this.field38349.iterator();
        while (iterator.hasNext()) {
            if (!field38350.remove(iterator.next())) {
                continue;
            }
            ++n;
        }
        if (n == 0) {
            this.field38349.clear();
        }
        this.field38350 = field38350;
    }
    
    public synchronized void method32604(final Class7437 class7437) {
        this.field38350.remove(class7437);
        this.field38349.add(class7437);
    }
    
    private void method32605(final List<Class7437> list) {
        list.sort(new Class4437(Realms.method25358()));
    }
    
    private boolean method32606() {
        return !this.field38343;
    }
    
    static {
        field38341 = LogManager.getLogger();
    }
}
