package net.minecraft.village;

import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public enum GossipType
{
    MAJOR_NEGATIVE("major_negative", -5, 100, 10, 10),
    MINOR_NEGATIVE("minor_negative", -1, 200, 20, 20),
    MINOR_POSITIVE("minor_positive", 1, 200, 1, 5),
    MAJOR_POSITIVE("major_positive", 5, 100, 0, 100),
    TRADING("trading", 1, 25, 2, 20);

    public final String field_220931_g;
    public final int field_220932_h;
    public final int field_220933_i;
    public final int field_220934_j;
    public final int field_220935_k;
    private static final Map<String, GossipType> field_220936_l = Stream.of(values()).collect(ImmutableMap.toImmutableMap((p_220930_0_) -> {
        return p_220930_0_.field_220931_g;
    }, Function.identity()));

    private GossipType(String p_i2458_3_, int p_i2458_4_, int p_i2458_5_, int p_i2458_6_, int p_i2458_7_)
    {
        this.field_220931_g = p_i2458_3_;
        this.field_220932_h = p_i2458_4_;
        this.field_220933_i = p_i2458_5_;
        this.field_220934_j = p_i2458_6_;
        this.field_220935_k = p_i2458_7_;
    }

    @Nullable
    public static GossipType func_220929_a(String p_220929_0_)
    {
        return field_220936_l.get(p_220929_0_);
    }
}
