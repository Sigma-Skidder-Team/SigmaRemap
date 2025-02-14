package net.minecraft.util.text;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.command.CommandSource;
import net.minecraft.entity.Entity;

public interface ITargetedTextComponent {
   IFormattableTextComponent func_230535_a_(CommandSource var1, Entity var2, int var3) throws CommandSyntaxException;
}
