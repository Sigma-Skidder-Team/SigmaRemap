// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import joptsimple.OptionSet;
import joptsimple.ArgumentAcceptingOptionSpec;
import joptsimple.OptionSpecBuilder;
import joptsimple.AbstractOptionSpec;
import java.io.OutputStream;
import java.nio.file.Path;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.Collection;
import java.nio.file.Paths;
import joptsimple.OptionSpec;
import joptsimple.OptionParser;

public class Class8566
{
    public static void main(final String[] array) throws IOException {
        final OptionParser optionParser = new OptionParser();
        final AbstractOptionSpec forHelp = optionParser.accepts("help", "Show the help menu").forHelp();
        final OptionSpecBuilder accepts = optionParser.accepts("server", "Include server generators");
        final OptionSpecBuilder accepts2 = optionParser.accepts("client", "Include client generators");
        final OptionSpecBuilder accepts3 = optionParser.accepts("dev", "Include development tools");
        final OptionSpecBuilder accepts4 = optionParser.accepts("reports", "Include data reports");
        final OptionSpecBuilder accepts5 = optionParser.accepts("validate", "Validate inputs");
        final OptionSpecBuilder accepts6 = optionParser.accepts("all", "Include all generators");
        final ArgumentAcceptingOptionSpec defaultsTo = optionParser.accepts("output", "Output folder").withRequiredArg().defaultsTo((Object)"generated", (Object[])new String[0]);
        final ArgumentAcceptingOptionSpec withRequiredArg = optionParser.accepts("input", "Input folder").withRequiredArg();
        final OptionSet parse = optionParser.parse(array);
        if (!parse.has((OptionSpec)forHelp) && parse.hasOptions()) {
            final Path value = Paths.get((String)((OptionSpec)defaultsTo).value(parse), new String[0]);
            final boolean has = parse.has((OptionSpec)accepts6);
            method28799(value, (Collection<Path>)parse.valuesOf((OptionSpec)withRequiredArg).stream().map(first -> Paths.get(first, new String[0])).collect(Collectors.toList()), has || parse.has((OptionSpec)accepts2), has || parse.has((OptionSpec)accepts), has || parse.has((OptionSpec)accepts3), has || parse.has((OptionSpec)accepts4), has || parse.has((OptionSpec)accepts5)).run();
        }
        else {
            optionParser.printHelpOn((OutputStream)System.out);
        }
    }
    
    public static Class7203 method28799(final Path path, final Collection<Path> collection, final boolean b, final boolean b2, final boolean b3, final boolean b4, final boolean b5) {
        final Class7203 class7203 = new Class7203(path, collection);
        if (b || b2) {
            class7203.method22100(new Class3688(class7203).method11335(new Class7419()));
        }
        if (b2) {
            class7203.method22100(new Class3697(class7203));
            class7203.method22100(new Class3695(class7203));
            class7203.method22100(new Class3694(class7203));
            class7203.method22100(new Class3696(class7203));
            class7203.method22100(new Class3692(class7203));
            class7203.method22100(new Class3700(class7203));
            class7203.method22100(new Class3690(class7203));
        }
        if (b3) {
            class7203.method22100(new Class3701(class7203));
        }
        if (b4) {
            class7203.method22100(new Class3698(class7203));
            class7203.method22100(new Class3691(class7203));
            class7203.method22100(new Class3699(class7203));
        }
        return class7203;
    }
}
