package net.minecraft.village;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.types.DynamicOps;
import it.unimi.dsi.fastutil.shorts.Short2ObjectMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectOpenHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;
import net.minecraft.util.IDynamicSerializable;
import net.minecraft.util.Util;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.SectionPos;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PointOfInterestData implements IDynamicSerializable
{
    private static final Logger field_218255_a = LogManager.getLogger();
    private final Short2ObjectMap<PointOfInterest> field_218256_b = new Short2ObjectOpenHashMap<>();
    private final Map<PointOfInterestType, Set<PointOfInterest>> field_218257_c = Maps.newHashMap();
    private final Runnable onChange;
    private boolean valid;

    public PointOfInterestData(Runnable p_i2749_1_)
    {
        this.onChange = p_i2749_1_;
        this.valid = true;
    }

    public <T> PointOfInterestData(Runnable p_i2750_1_, Dynamic<T> p_i2750_2_)
    {
        this.onChange = p_i2750_1_;

        try
        {
            this.valid = p_i2750_2_.get("Valid").asBoolean(false);
            p_i2750_2_.get("Records").asStream().forEach((p_218249_2_) ->
            {
                this.func_218254_a(new PointOfInterest(p_218249_2_, p_i2750_1_));
            });
        }
        catch (Exception exception)
        {
            field_218255_a.error("Failed to load POI chunk", (Throwable)exception);
            this.clear();
            this.valid = false;
        }
    }

    public Stream<PointOfInterest> func_218247_a(Predicate<PointOfInterestType> p_218247_1_, PointOfInterestManager.Status p_218247_2_)
    {
        return this.field_218257_c.entrySet().stream().filter((p_218239_1_) ->
        {
            return p_218247_1_.test(p_218239_1_.getKey());
        }).flatMap((p_218246_0_) ->
        {
            return p_218246_0_.getValue().stream();
        }).filter(p_218247_2_.func_221035_a());
    }

    public void func_218243_a(BlockPos p_218243_1_, PointOfInterestType p_218243_2_)
    {
        if (this.func_218254_a(new PointOfInterest(p_218243_1_, p_218243_2_, this.onChange)))
        {
            field_218255_a.debug("Added POI of type {} @ {}", () ->
            {
                return p_218243_2_;
            }, () ->
            {
                return p_218243_1_;
            });
            this.onChange.run();
        }
    }

    private boolean func_218254_a(PointOfInterest p_218254_1_)
    {
        BlockPos blockpos = p_218254_1_.getPos();
        PointOfInterestType pointofinteresttype = p_218254_1_.getType();
        short short1 = SectionPos.toRelativeOffset(blockpos);
        PointOfInterest pointofinterest = this.field_218256_b.get(short1);

        if (pointofinterest != null)
        {
            if (pointofinteresttype.equals(pointofinterest.getType()))
            {
                return false;
            }
            else
            {
                throw(IllegalStateException)Util.pauseDevMode(new IllegalStateException("POI data mismatch: already registered at " + blockpos));
            }
        }
        else
        {
            this.field_218256_b.put(short1, p_218254_1_);
            this.field_218257_c.computeIfAbsent(pointofinteresttype, (p_218252_0_) ->
            {
                return Sets.newHashSet();
            }).add(p_218254_1_);
            return true;
        }
    }

    public void remove(BlockPos p_218248_1_)
    {
        PointOfInterest pointofinterest = this.field_218256_b.remove(SectionPos.toRelativeOffset(p_218248_1_));

        if (pointofinterest == null)
        {
            field_218255_a.error("POI data mismatch: never registered at " + p_218248_1_);
        }
        else
        {
            this.field_218257_c.get(pointofinterest.getType()).remove(pointofinterest);
            field_218255_a.debug("Removed POI of type {} @ {}", pointofinterest::getType, pointofinterest::getPos);
            this.onChange.run();
        }
    }

    public boolean func_218251_c(BlockPos p_218251_1_)
    {
        PointOfInterest pointofinterest = this.field_218256_b.get(SectionPos.toRelativeOffset(p_218251_1_));

        if (pointofinterest == null)
        {
            throw(IllegalStateException)Util.pauseDevMode(new IllegalStateException("POI never registered at " + p_218251_1_));
        }
        else
        {
            boolean flag = pointofinterest.release();
            this.onChange.run();
            return flag;
        }
    }

    public boolean func_218245_a(BlockPos p_218245_1_, Predicate<PointOfInterestType> p_218245_2_)
    {
        short short1 = SectionPos.toRelativeOffset(p_218245_1_);
        PointOfInterest pointofinterest = this.field_218256_b.get(short1);
        return pointofinterest != null && p_218245_2_.test(pointofinterest.getType());
    }

    public Optional<PointOfInterestType> func_218244_d(BlockPos p_218244_1_)
    {
        short short1 = SectionPos.toRelativeOffset(p_218244_1_);
        PointOfInterest pointofinterest = this.field_218256_b.get(short1);
        return pointofinterest != null ? Optional.of(pointofinterest.getType()) : Optional.empty();
    }

    public <T> T serialize(DynamicOps<T> p_218175_1_)
    {
        T t = p_218175_1_.createList(this.field_218256_b.values().stream().map((p_218242_1_) ->
        {
            return p_218242_1_.serialize(p_218175_1_);
        }));
        return p_218175_1_.createMap(ImmutableMap.of(p_218175_1_.createString("Records"), t, p_218175_1_.createString("Valid"), p_218175_1_.createBoolean(this.valid)));
    }

    public void func_218240_a(Consumer<BiConsumer<BlockPos, PointOfInterestType>> p_218240_1_)
    {
        if (!this.valid)
        {
            Short2ObjectMap<PointOfInterest> short2objectmap = new Short2ObjectOpenHashMap<>(this.field_218256_b);
            this.clear();
            p_218240_1_.accept((p_218250_2_, p_218250_3_) ->
            {
                short short1 = SectionPos.toRelativeOffset(p_218250_2_);
                PointOfInterest pointofinterest = short2objectmap.computeIfAbsent(short1, (p_218241_3_) -> {
                    return new PointOfInterest(p_218250_2_, p_218250_3_, this.onChange);
                });
                this.func_218254_a(pointofinterest);
            });
            this.valid = true;
            this.onChange.run();
        }
    }

    private void clear()
    {
        this.field_218256_b.clear();
        this.field_218257_c.clear();
    }

    boolean func_226355_a_()
    {
        return this.valid;
    }
}
