// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.brigadier.context.ParsedArgument;
import javax.annotation.Nullable;
import java.util.ArrayList;
import com.mojang.brigadier.context.SuggestionContext;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.Map;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.regex.Matcher;
import com.google.common.base.Strings;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import com.mojang.brigadier.StringReader;
import java.util.Iterator;
import com.mojang.brigadier.suggestion.Suggestion;
import com.google.common.collect.Lists;
import com.mojang.brigadier.suggestion.Suggestions;
import java.util.concurrent.CompletableFuture;
import com.mojang.brigadier.ParseResults;
import net.minecraft.util.math.MathHelper;

import java.util.List;
import java.util.regex.Pattern;

public class Class6823
{
    private static final Pattern field26790;
    private final Minecraft field26791;
    private final Screen field26792;
    private final Class576 field26793;
    private final FontRenderer field26794;
    private final boolean field26795;
    private final boolean field26796;
    private final int field26797;
    private final int field26798;
    private final boolean field26799;
    private final int field26800;
    private final List<String> field26801;
    private int field26802;
    private int field26803;
    private ParseResults<Class7491> field26804;
    private CompletableFuture<Suggestions> field26805;
    private Class8490 field26806;
    private boolean field26807;
    private boolean field26808;
    
    public Class6823(final Minecraft field26791, final Screen field26792, final Class576 field26793, final FontRenderer field26794, final boolean field26795, final boolean field26796, final int field26797, final int field26798, final boolean field26799, final int field26800) {
        this.field26801 = Lists.newArrayList();
        this.field26791 = field26791;
        this.field26792 = field26792;
        this.field26793 = field26793;
        this.field26794 = field26794;
        this.field26795 = field26795;
        this.field26796 = field26796;
        this.field26797 = field26797;
        this.field26798 = field26798;
        this.field26799 = field26799;
        this.field26800 = field26800;
        field26793.method3375(this::method20894);
    }
    
    public void method20885(final boolean field26807) {
        this.field26807 = field26807;
        if (!field26807) {
            this.field26806 = null;
        }
    }
    
    public boolean method20886(final int n, final int n2, final int n3) {
        if (this.field26806 != null && this.field26806.method28358(n, n2, n3)) {
            return true;
        }
        if (this.field26792.getFocused() == this.field26793 && n == 258) {
            this.method20889(true);
            return true;
        }
        return false;
    }
    
    public boolean method20887(final double n) {
        return this.field26806 != null && this.field26806.method28357(MathHelper.clamp(n, -1.0, 1.0));
    }
    
    public boolean method20888(final double n, final double n2, final int n3) {
        return this.field26806 != null && this.field26806.method28356((int)n, (int)n2, n3);
    }
    
    public void method20889(final boolean b) {
        if (this.field26805 != null) {
            if (this.field26805.isDone()) {
                final Suggestions suggestions = this.field26805.join();
                if (!suggestions.isEmpty()) {
                    int max = 0;
                    final Iterator iterator = suggestions.getList().iterator();
                    while (iterator.hasNext()) {
                        max = Math.max(max, this.field26794.getStringWidth(((Suggestion)iterator.next()).getText()));
                    }
                    this.field26806 = new Class8490(this, MathHelper.method35651(this.field26793.method3412(suggestions.getRange().getStart()), 0, this.field26793.method3412(0) + this.field26793.method3406() - max), this.field26799 ? (this.field26792.height - 12) : 72, max, suggestions, b, null);
                }
            }
        }
    }
    
    public void method20890() {
        final String method3378 = this.field26793.method3378();
        if (this.field26804 != null) {
            if (!this.field26804.getReader().getString().equals(method3378)) {
                this.field26804 = null;
            }
        }
        if (!this.field26808) {
            this.field26793.method3411(null);
            this.field26806 = null;
        }
        this.field26801.clear();
        final StringReader stringReader = new StringReader(method3378);
        final boolean b = stringReader.canRead() && stringReader.peek() == '/';
        if (b) {
            stringReader.skip();
        }
        final boolean b2 = this.field26795 || b;
        final int method3379 = this.field26793.method3399();
        if (!b2) {
            final String substring = method3378.substring(0, method3379);
            this.field26805 = Class7491.method23226(this.field26791.player.field4069.method17269().method23205(), new SuggestionsBuilder(substring, method20891(substring)));
        }
        else {
            final CommandDispatcher<Class7491> method3380 = this.field26791.player.field4069.method17375();
            if (this.field26804 == null) {
                this.field26804 = (ParseResults<Class7491>)method3380.parse(stringReader, (Object)this.field26791.player.field4069.method17269());
            }
            if (method3379 >= (this.field26796 ? stringReader.getCursor() : 1)) {
                if (this.field26806 == null || !this.field26808) {
                    (this.field26805 = method3380.getCompletionSuggestions((ParseResults)this.field26804, method3379)).thenRun(() -> {
                        if (!(!this.field26805.isDone())) {
                            this.method20892();
                        }
                    });
                }
            }
        }
    }
    
    private static int method20891(final String input) {
        if (!Strings.isNullOrEmpty(input)) {
            int end = 0;
            final Matcher matcher = Class6823.field26790.matcher(input);
            while (matcher.find()) {
                end = matcher.end();
            }
            return end;
        }
        return 0;
    }
    
    public void method20892() {
        if (this.field26793.method3399() == this.field26793.method3378().length()) {
            if (this.field26805.join().isEmpty() && !this.field26804.getExceptions().isEmpty()) {
                int n = 0;
                final Iterator iterator = this.field26804.getExceptions().entrySet().iterator();
                while (iterator.hasNext()) {
                    final CommandSyntaxException ex = ((Map.Entry<K, CommandSyntaxException>)iterator.next()).getValue();
                    if (ex.getType() != CommandSyntaxException.BUILT_IN_EXCEPTIONS.literalIncorrect()) {
                        this.field26801.add(ex.getMessage());
                    }
                    else {
                        ++n;
                    }
                }
                if (n > 0) {
                    this.field26801.add(CommandSyntaxException.BUILT_IN_EXCEPTIONS.dispatcherUnknownCommand().create().getMessage());
                }
            }
            else if (this.field26804.getReader().canRead()) {
                this.field26801.add(Class7788.method25005(this.field26804).getMessage());
            }
        }
        this.field26802 = 0;
        this.field26803 = this.field26792.width;
        if (this.field26801.isEmpty()) {
            this.method20893(TextFormatting.GRAY);
        }
        this.field26806 = null;
        if (this.field26807) {
            if (this.field26791.gameSettings.field23415) {
                this.method20889(false);
            }
        }
    }
    
    private void method20893(final TextFormatting obj) {
        final SuggestionContext suggestionContext = this.field26804.getContext().findSuggestionContext(this.field26793.method3399());
        final Map smartUsage = this.field26791.player.field4069.method17375().getSmartUsage(suggestionContext.parent, (Object)this.field26791.player.field4069.method17269());
        final ArrayList arrayList = Lists.newArrayList();
        int max = 0;
        for (final Map.Entry<K, String> entry : smartUsage.entrySet()) {
            if (entry.getKey() instanceof LiteralCommandNode) {
                continue;
            }
            arrayList.add(obj + entry.getValue());
            max = Math.max(max, this.field26794.getStringWidth(entry.getValue()));
        }
        if (!arrayList.isEmpty()) {
            this.field26801.addAll(arrayList);
            this.field26802 = MathHelper.method35651(this.field26793.method3412(suggestionContext.startPos), 0, this.field26793.method3412(0) + this.field26793.method3406() - max);
            this.field26803 = max;
        }
    }
    
    private String method20894(final String s, final int n) {
        return (this.field26804 == null) ? s : method20896(this.field26804, s, n);
    }
    
    @Nullable
    private static String method20895(final String prefix, final String s) {
        return s.startsWith(prefix) ? s.substring(prefix.length()) : null;
    }
    
    public static String method20896(final ParseResults<Class7491> parseResults, final String s, final int n) {
        final TextFormatting[] array = { TextFormatting.AQUA, TextFormatting.YELLOW, TextFormatting.GREEN, TextFormatting.LIGHT_PURPLE, TextFormatting.GOLD};
        final String string = TextFormatting.GRAY.toString();
        final StringBuilder sb = new StringBuilder(string);
        int start = 0;
        int n2 = -1;
        for (final ParsedArgument parsedArgument : parseResults.getContext().getLastChild().getArguments().values()) {
            if (++n2 >= array.length) {
                n2 = 0;
            }
            final int max = Math.max(parsedArgument.getRange().getStart() - n, 0);
            if (max >= s.length()) {
                break;
            }
            final int min = Math.min(parsedArgument.getRange().getEnd() - n, s.length());
            if (min <= 0) {
                continue;
            }
            sb.append(s, start, max);
            sb.append(array[n2]);
            sb.append(s, max, min);
            sb.append(string);
            start = min;
        }
        if (parseResults.getReader().canRead()) {
            final int max2 = Math.max(parseResults.getReader().getCursor() - n, 0);
            if (max2 < s.length()) {
                final int min2 = Math.min(max2 + parseResults.getReader().getRemainingLength(), s.length());
                sb.append(s, start, max2);
                sb.append(TextFormatting.RED);
                sb.append(s, max2, min2);
                start = min2;
            }
        }
        sb.append(s, start, s.length());
        return sb.toString();
    }
    
    public void method20897(final int n, final int n2) {
        if (this.field26806 == null) {
            int n3 = 0;
            for (final String s : this.field26801) {
                final int n4 = this.field26799 ? (this.field26792.height - 14 - 13 - 12 * n3) : (72 + 12 * n3);
                AbstractGui.fill(this.field26802 - 1, n4, this.field26802 + this.field26803 + 1, n4 + 12, this.field26800);
                this.field26794.drawStringWithShadow(s, (float)this.field26802, (float)(n4 + 2), -1);
                ++n3;
            }
        }
        else {
            this.field26806.method28355(n, n2);
        }
    }
    
    public String method20898() {
        return (this.field26806 == null) ? "" : ("\n" + Class8490.method28364(this.field26806));
    }
    
    static {
        field26790 = Pattern.compile("(\\s+)");
    }
}
