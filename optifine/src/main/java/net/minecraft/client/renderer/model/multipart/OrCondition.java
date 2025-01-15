package net.minecraft.client.renderer.model.multipart;

import com.google.common.collect.Streams;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.state.StateContainer;

public class OrCondition implements ICondition
{
    private final Iterable <? extends ICondition > conditions;

    public OrCondition(Iterable <? extends ICondition > p_i885_1_)
    {
        this.conditions = p_i885_1_;
    }

    public Predicate<BlockState> getPredicate(StateContainer<Block, BlockState> p_getPredicate_1_)
    {
        List<Predicate<BlockState>> list = Streams.stream(this.conditions).map((p_200689_1_) ->
        {
            return p_200689_1_.getPredicate(p_getPredicate_1_);
        }).collect(Collectors.toList());
        return (p_200690_1_) ->
        {
            return list.stream().anyMatch((p_212488_1_) -> {
                return p_212488_1_.test(p_200690_1_);
            });
        };
    }
}
