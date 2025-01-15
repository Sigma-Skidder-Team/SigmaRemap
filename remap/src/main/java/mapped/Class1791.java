// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;
import java.util.Locale;
import java.util.Date;
import java.util.Calendar;
import java.io.IOException;
import java.util.Collections;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.function.Function;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import com.google.common.collect.Lists;
import java.util.Random;
import java.util.List;

public class Class1791 extends Class1776<List<String>>
{
    private static final Class1932 field9914;
    private static final Random field9915;
    private final List<String> field9916;
    private final Class9212 field9917;
    
    public Class1791(final Class9212 field9917) {
        this.field9916 = Lists.newArrayList();
        this.field9917 = field9917;
    }
    
    public List<String> method6459(final Class6582 class6582, final IProfiler class6583) {
        try (final Class1671 method19933 = Class869.method5277().method5291().method19933(Class1791.field9914);
             final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(method19933.method5887(), StandardCharsets.UTF_8))) {
            return (List<String>)bufferedReader.lines().map((Function<? super String, ?>)String::trim).filter(s -> s.hashCode() != 125780783).collect((Collector<? super Object, ?, List<? super Object>>)Collectors.toList());
        }
        catch (final IOException ex) {
            return Collections.emptyList();
        }
    }
    
    public void method6460(final List<String> list, final Class6582 class6582, final IProfiler class6583) {
        this.field9916.clear();
        this.field9916.addAll(list);
    }
    
    @Nullable
    public String method6461() {
        final Calendar instance = Calendar.getInstance();
        instance.setTime(new Date());
        if (instance.get(2) + 1 == 12 && instance.get(5) == 24) {
            return "Merry X-mas!";
        }
        if (instance.get(2) + 1 == 1 && instance.get(5) == 1) {
            return "Happy new year!";
        }
        if (instance.get(2) + 1 == 10 && instance.get(5) == 31) {
            return "OOoooOOOoooo! Spooky!";
        }
        if (!this.field9916.isEmpty()) {
            return (this.field9917 != null && Class1791.field9915.nextInt(this.field9916.size()) == 42) ? (this.field9917.method33692().toUpperCase(Locale.ROOT) + " IS YOU") : this.field9916.get(Class1791.field9915.nextInt(this.field9916.size()));
        }
        return null;
    }
    
    static {
        field9914 = new Class1932("texts/splashes.txt");
        field9915 = new Random();
    }
}
