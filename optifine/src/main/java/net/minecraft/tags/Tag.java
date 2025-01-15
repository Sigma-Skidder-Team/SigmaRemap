package net.minecraft.tags;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.Set;
import java.util.function.Function;
import javax.annotation.Nullable;
import net.minecraft.util.JSONUtils;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Util;

public class Tag<T>
{
    private final ResourceLocation resourceLocation;
    private final Set<T> taggedItems;
    private final Collection<Tag.ITagEntry<T>> entries;

    public Tag(ResourceLocation p_i3678_1_)
    {
        this.resourceLocation = p_i3678_1_;
        this.taggedItems = Collections.emptySet();
        this.entries = Collections.emptyList();
    }

    public Tag(ResourceLocation p_i3679_1_, Collection<Tag.ITagEntry<T>> p_i3679_2_, boolean p_i3679_3_)
    {
        this.resourceLocation = p_i3679_1_;
        this.taggedItems = (Set<T>)(p_i3679_3_ ? Sets.newLinkedHashSet() : Sets.newHashSet());
        this.entries = p_i3679_2_;

        for (Tag.ITagEntry<T> itagentry : p_i3679_2_)
        {
            itagentry.populate(this.taggedItems);
        }
    }

    public JsonObject serialize(Function<T, ResourceLocation> getNameForObject)
    {
        JsonObject jsonobject = new JsonObject();
        JsonArray jsonarray = new JsonArray();

        for (Tag.ITagEntry<T> itagentry : this.entries)
        {
            itagentry.serialize(jsonarray, getNameForObject);
        }

        jsonobject.addProperty("replace", false);
        jsonobject.add("values", jsonarray);
        return jsonobject;
    }

    public boolean contains(T itemIn)
    {
        return this.taggedItems.contains(itemIn);
    }

    public Collection<T> getAllElements()
    {
        return this.taggedItems;
    }

    public Collection<Tag.ITagEntry<T>> getEntries()
    {
        return this.entries;
    }

    public T getRandomElement(Random random)
    {
        List<T> list = Lists.newArrayList(this.getAllElements());
        return list.get(random.nextInt(list.size()));
    }

    public ResourceLocation getId()
    {
        return this.resourceLocation;
    }

    public static class Builder<T>
    {
        private final Set<Tag.ITagEntry<T>> entries = Sets.newLinkedHashSet();
        private boolean preserveOrder;

        public static <T> Tag.Builder<T> create()
        {
            return new Tag.Builder<>();
        }

        public Tag.Builder<T> add(Tag.ITagEntry<T> entry)
        {
            this.entries.add(entry);
            return this;
        }

        public Tag.Builder<T> add(T itemIn)
        {
            this.entries.add(new Tag.ListEntry<>(Collections.singleton(itemIn)));
            return this;
        }

        @SafeVarargs
        public final Tag.Builder<T> add(T... itemsIn)
        {
            this.entries.add(new Tag.ListEntry<>(Lists.newArrayList(itemsIn)));
            return this;
        }

        public Tag.Builder<T> add(Tag<T> tagIn)
        {
            this.entries.add(new Tag.TagEntry<>(tagIn));
            return this;
        }

        public Tag.Builder<T> ordered(boolean preserveOrderIn)
        {
            this.preserveOrder = preserveOrderIn;
            return this;
        }

        public boolean resolve(Function<ResourceLocation, Tag<T>> resourceLocationToTag)
        {
            for (Tag.ITagEntry<T> itagentry : this.entries)
            {
                if (!itagentry.resolve(resourceLocationToTag))
                {
                    return false;
                }
            }

            return true;
        }

        public Tag<T> build(ResourceLocation resourceLocationIn)
        {
            return new Tag<>(resourceLocationIn, this.entries, this.preserveOrder);
        }

        public Tag.Builder<T> fromJson(Function<ResourceLocation, Optional<T>> p_219783_1_, JsonObject p_219783_2_)
        {
            JsonArray jsonarray = JSONUtils.getJsonArray(p_219783_2_, "values");
            List<Tag.ITagEntry<T>> list = Lists.newArrayList();

            for (JsonElement jsonelement : jsonarray)
            {
                String s = JSONUtils.getString(jsonelement, "value");

                if (s.startsWith("#"))
                {
                    list.add(new Tag.TagEntry<>(new ResourceLocation(s.substring(1))));
                }
                else
                {
                    ResourceLocation resourcelocation = new ResourceLocation(s);
                    list.add(new Tag.ListEntry<>(Collections.singleton(p_219783_1_.apply(resourcelocation).orElseThrow(() ->
                    {
                        return new JsonParseException("Unknown value '" + resourcelocation + "'");
                    }))));
                }
            }

            if (JSONUtils.getBoolean(p_219783_2_, "replace", false))
            {
                this.entries.clear();
            }

            this.entries.addAll(list);
            return this;
        }
    }

    public interface ITagEntry<T>
    {
    default boolean resolve(Function<ResourceLocation, Tag<T>> resourceLocationToTag)
        {
            return true;
        }

        void populate(Collection<T> itemsIn);

        void serialize(JsonArray array, Function<T, ResourceLocation> getNameForObject);
    }

    public static class ListEntry<T> implements Tag.ITagEntry<T>
    {
        private final Collection<T> taggedItems;

        public ListEntry(Collection<T> p_i425_1_)
        {
            this.taggedItems = p_i425_1_;
        }

        public void populate(Collection<T> itemsIn)
        {
            itemsIn.addAll(this.taggedItems);
        }

        public void serialize(JsonArray array, Function<T, ResourceLocation> getNameForObject)
        {
            for (T t : this.taggedItems)
            {
                ResourceLocation resourcelocation = getNameForObject.apply(t);

                if (resourcelocation == null)
                {
                    throw new IllegalStateException("Unable to serialize an anonymous value to json!");
                }

                array.add(resourcelocation.toString());
            }
        }

        public Collection<T> getTaggedItems()
        {
            return this.taggedItems;
        }
    }

    public static class TagEntry<T> implements Tag.ITagEntry<T>
    {
        @Nullable
        private final ResourceLocation id;
        @Nullable
        private Tag<T> tag;

        public TagEntry(ResourceLocation p_i1812_1_)
        {
            this.id = p_i1812_1_;
        }

        public TagEntry(Tag<T> p_i1813_1_)
        {
            this.id = p_i1813_1_.getId();
            this.tag = p_i1813_1_;
        }

        public boolean resolve(Function<ResourceLocation, Tag<T>> resourceLocationToTag)
        {
            if (this.tag == null)
            {
                this.tag = resourceLocationToTag.apply(this.id);
            }

            return this.tag != null;
        }

        public void populate(Collection<T> itemsIn)
        {
            if (this.tag == null)
            {
                throw Util.pauseDevMode((new IllegalStateException("Cannot build unresolved tag entry")));
            }
            else
            {
                itemsIn.addAll(this.tag.getAllElements());
            }
        }

        public ResourceLocation getSerializedId()
        {
            if (this.tag != null)
            {
                return this.tag.getId();
            }
            else if (this.id != null)
            {
                return this.id;
            }
            else
            {
                throw new IllegalStateException("Cannot serialize an anonymous tag to json!");
            }
        }

        public void serialize(JsonArray array, Function<T, ResourceLocation> getNameForObject)
        {
            array.add("#" + this.getSerializedId());
        }
    }
}
