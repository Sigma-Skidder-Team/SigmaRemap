package net.minecraft.tags;

import java.util.Collection;
import java.util.Optional;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;

public class EntityTypeTags
{
    private static TagCollection < EntityType<? >> field_219766_c = new TagCollection<>((p_219758_0_) ->
    {
        return Optional.empty();
    }, "", false, "");
    private static int generation;
    public static final Tag < EntityType<? >> SKELETONS = func_219763_a("skeletons");
    public static final Tag < EntityType<? >> RAIDERS = func_219763_a("raiders");
    public static final Tag < EntityType<? >> field_226155_c_ = func_219763_a("beehive_inhabitors");
    public static final Tag < EntityType<? >> field_226156_d_ = func_219763_a("arrows");

    public static void setCollection(TagCollection < EntityType<? >> p_219759_0_)
    {
        field_219766_c = p_219759_0_;
        ++generation;
    }

    public static TagCollection < EntityType<? >> getCollection()
    {
        return field_219766_c;
    }

    private static Tag < EntityType<? >> func_219763_a(String p_219763_0_)
    {
        return new EntityTypeTags.Wrapper(new ResourceLocation(p_219763_0_));
    }

    public static class Wrapper extends Tag < EntityType<? >>
    {
        private int lastKnownGeneration = -1;
        private Tag < EntityType<? >> cachedTag;

        public Wrapper(ResourceLocation p_i4179_1_)
        {
            super(p_i4179_1_);
        }

        public boolean contains(EntityType<?> itemIn)
        {
            if (this.lastKnownGeneration != EntityTypeTags.generation)
            {
                this.cachedTag = EntityTypeTags.field_219766_c.getOrCreate(this.getId());
                this.lastKnownGeneration = EntityTypeTags.generation;
            }

            return this.cachedTag.contains(itemIn);
        }

        public Collection < EntityType<? >> getAllElements()
        {
            if (this.lastKnownGeneration != EntityTypeTags.generation)
            {
                this.cachedTag = EntityTypeTags.field_219766_c.getOrCreate(this.getId());
                this.lastKnownGeneration = EntityTypeTags.generation;
            }

            return this.cachedTag.getAllElements();
        }

        public Collection < Tag.ITagEntry < EntityType<? >>> getEntries()
        {
            if (this.lastKnownGeneration != EntityTypeTags.generation)
            {
                this.cachedTag = EntityTypeTags.field_219766_c.getOrCreate(this.getId());
                this.lastKnownGeneration = EntityTypeTags.generation;
            }

            return this.cachedTag.getEntries();
        }
    }
}
