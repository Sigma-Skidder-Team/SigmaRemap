package net.minecraft.util.registry;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Optional;
import java.util.Random;
import java.util.Set;
import javax.annotation.Nullable;
import net.minecraft.util.IntIdentityHashBiMap;
import net.minecraft.util.ResourceLocation;
import org.apache.commons.lang3.Validate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SimpleRegistry<T> extends MutableRegistry<T>
{
    protected static final Logger LOGGER0 = LogManager.getLogger();
    protected final IntIdentityHashBiMap<T> underlyingIntegerMap = new IntIdentityHashBiMap<>(256);
    protected final BiMap<ResourceLocation, T> registryObjects = HashBiMap.create();
    protected Object[] values;
    private int nextFreeId;

    public <V extends T> V register(int id, ResourceLocation name, V instance)
    {
        this.underlyingIntegerMap.put((T)instance, id);
        Validate.notNull(name);
        Validate.notNull(instance);
        this.values = null;

        if (this.registryObjects.containsKey(name))
        {
            LOGGER0.debug("Adding duplicate key '{}' to registry", (Object)name);
        }

        this.registryObjects.put(name, (T)instance);

        if (this.nextFreeId <= id)
        {
            this.nextFreeId = id + 1;
        }

        return instance;
    }

    public <V extends T> V register(ResourceLocation name, V instance)
    {
        return this.register(this.nextFreeId, name, instance);
    }

    @Nullable
    public ResourceLocation getKey(T value)
    {
        return this.registryObjects.inverse().get(value);
    }

    public int getId(@Nullable T value)
    {
        return this.underlyingIntegerMap.getId(value);
    }

    @Nullable
    public T getByValue(int value)
    {
        return this.underlyingIntegerMap.getByValue(value);
    }

    public Iterator<T> iterator()
    {
        return this.underlyingIntegerMap.iterator();
    }

    @Nullable
    public T getOrDefault(@Nullable ResourceLocation name)
    {
        return this.registryObjects.get(name);
    }

    public Optional<T> getValue(@Nullable ResourceLocation key)
    {
        return Optional.ofNullable(this.registryObjects.get(key));
    }

    public Set<ResourceLocation> keySet()
    {
        return Collections.unmodifiableSet(this.registryObjects.keySet());
    }

    public boolean isEmpty()
    {
        return this.registryObjects.isEmpty();
    }

    @Nullable
    public T getRandom(Random random)
    {
        if (this.values == null)
        {
            Collection<?> collection = this.registryObjects.values();

            if (collection.isEmpty())
            {
                return (T)null;
            }

            this.values = collection.toArray(new Object[collection.size()]);
        }

        return (T)this.values[random.nextInt(this.values.length)];
    }

    public boolean containsKey(ResourceLocation name)
    {
        return this.registryObjects.containsKey(name);
    }
}
