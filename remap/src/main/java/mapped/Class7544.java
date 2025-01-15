// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.HashMap;
import java.nio.charset.CharacterCodingException;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public final class Class7544 implements Class7545
{
    private static final Pattern field29928;
    public static final Map<Character, String> field29929;
    public static final Map<Character, Integer> field29930;
    private final Class8028 field29931;
    private boolean field29932;
    private int field29933;
    private List<Class5233> field29934;
    private int field29935;
    private int field29936;
    private Class7653<Integer> field29937;
    private boolean field29938;
    private Map<Integer, Class8130> field29939;
    
    public Class7544(final Class8028 field29931) {
        this.field29932 = false;
        this.field29933 = 0;
        this.field29935 = 0;
        this.field29936 = -1;
        this.field29938 = true;
        this.field29931 = field29931;
        this.field29934 = new ArrayList<Class5233>(100);
        this.field29937 = new Class7653<Integer>(10);
        this.field29939 = new LinkedHashMap<Integer, Class8130>();
        this.method23642();
    }
    
    @Override
    public boolean method23631(final Class2207... array) {
        while (this.method23634()) {
            this.method23635();
        }
        if (!this.field29934.isEmpty()) {
            if (array.length == 0) {
                return true;
            }
            final Class2207 method16347 = this.field29934.get(0).method16347();
            for (int i = 0; i < array.length; ++i) {
                if (method16347 == array[i]) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public Class5233 method23632() {
        while (this.method23634()) {
            this.method23635();
        }
        return this.field29934.get(0);
    }
    
    @Override
    public Class5233 method23633() {
        ++this.field29935;
        return this.field29934.remove(0);
    }
    
    private boolean method23634() {
        if (this.field29932) {
            return false;
        }
        if (!this.field29934.isEmpty()) {
            this.method23637();
            return this.method23636() == this.field29935;
        }
        return true;
    }
    
    private void method23635() {
        this.method23675();
        this.method23637();
        this.method23640(this.field29931.method26331());
        final int method26324 = this.field29931.method26324();
        switch (method26324) {
            case 0: {
                this.method23643();
                return;
            }
            case 37: {
                if (this.method23668()) {
                    this.method23644();
                    return;
                }
                break;
            }
            case 45: {
                if (this.method23669()) {
                    this.method23645();
                    return;
                }
                if (this.method23671()) {
                    this.method23655();
                    return;
                }
                break;
            }
            case 46: {
                if (this.method23670()) {
                    this.method23646();
                    return;
                }
                break;
            }
            case 91: {
                this.method23648();
                return;
            }
            case 123: {
                this.method23649();
                return;
            }
            case 93: {
                this.method23651();
                return;
            }
            case 125: {
                this.method23652();
                return;
            }
            case 44: {
                this.method23654();
                return;
            }
            case 63: {
                if (this.method23672()) {
                    this.method23656();
                    return;
                }
                break;
            }
            case 58: {
                if (this.method23673()) {
                    this.method23657();
                    return;
                }
                break;
            }
            case 42: {
                this.method23658();
                return;
            }
            case 38: {
                this.method23659();
                return;
            }
            case 33: {
                this.method23660();
                return;
            }
            case 124: {
                if (this.field29933 == 0) {
                    this.method23661();
                    return;
                }
                break;
            }
            case 62: {
                if (this.field29933 == 0) {
                    this.method23662();
                    return;
                }
                break;
            }
            case 39: {
                this.method23664();
                return;
            }
            case 34: {
                this.method23665();
                return;
            }
        }
        if (this.method23674()) {
            this.method23667();
            return;
        }
        String s = String.valueOf(Character.toChars(method26324));
        for (final Character obj : Class7544.field29929.keySet()) {
            if (Class7544.field29929.get(obj).equals(s)) {
                s = "\\" + obj;
                break;
            }
        }
        if (method26324 == 9) {
            s += "(TAB)";
        }
        throw new Class2392("while scanning for the next token", null, String.format("found character '%s' that cannot start any token. (Do not use %s for indentation)", s, s), this.field29931.method26321());
    }
    
    private int method23636() {
        if (this.field29939.isEmpty()) {
            return -1;
        }
        return this.field29939.values().iterator().next().method26792();
    }
    
    private void method23637() {
        if (!this.field29939.isEmpty()) {
            final Iterator<Class8130> iterator = this.field29939.values().iterator();
            while (iterator.hasNext()) {
                final Class8130 class8130 = iterator.next();
                if (class8130.method26796() == this.field29931.method26333() && this.field29931.method26332() - class8130.method26795() <= 1024) {
                    continue;
                }
                if (class8130.method26797()) {
                    throw new Class2392("while scanning a simple key", class8130.method26794(), "could not find expected ':'", this.field29931.method26321());
                }
                iterator.remove();
            }
        }
    }
    
    private void method23638() {
        final boolean b = this.field29933 == 0 && this.field29936 == this.field29931.method26331();
        if (!this.field29938 && b) {
            throw new Class2386("A simple key is required only if it is the first token in the current line");
        }
        if (this.field29938) {
            this.method23639();
            this.field29939.put(this.field29933, new Class8130(this.field29935 + this.field29934.size(), b, this.field29931.method26332(), this.field29931.method26333(), this.field29931.method26331(), this.field29931.method26321()));
        }
    }
    
    private void method23639() {
        final Class8130 class8130 = this.field29939.remove(this.field29933);
        if (class8130 != null && class8130.method26797()) {
            throw new Class2392("while scanning a simple key", class8130.method26794(), "could not find expected ':'", this.field29931.method26321());
        }
    }
    
    private void method23640(final int n) {
        if (this.field29933 == 0) {
            while (this.field29936 > n) {
                final Class2314 method26321 = this.field29931.method26321();
                this.field29936 = this.field29937.method24254();
                this.field29934.add(new Class5239(method26321, method26321));
            }
        }
    }
    
    private boolean method23641(final int field29936) {
        if (this.field29936 >= field29936) {
            return false;
        }
        this.field29937.method24253(this.field29936);
        this.field29936 = field29936;
        return true;
    }
    
    private void method23642() {
        final Class2314 method26321 = this.field29931.method26321();
        this.field29934.add(new Class5248(method26321, method26321));
    }
    
    private void method23643() {
        this.method23640(-1);
        this.method23639();
        this.field29938 = false;
        this.field29939.clear();
        final Class2314 method26321 = this.field29931.method26321();
        this.field29934.add(new Class5252(method26321, method26321));
        this.field29932 = true;
    }
    
    private void method23644() {
        this.method23640(-1);
        this.method23639();
        this.field29938 = false;
        this.field29934.add(this.method23676());
    }
    
    private void method23645() {
        this.method23647(true);
    }
    
    private void method23646() {
        this.method23647(false);
    }
    
    private void method23647(final boolean b) {
        this.method23640(-1);
        this.method23639();
        this.field29938 = false;
        final Class2314 method26321 = this.field29931.method26321();
        this.field29931.method26323(3);
        final Class2314 method26322 = this.field29931.method26321();
        Class5233 class5233;
        if (!b) {
            class5233 = new Class5243(method26321, method26322);
        }
        else {
            class5233 = new Class5251(method26321, method26322);
        }
        this.field29934.add(class5233);
    }
    
    private void method23648() {
        this.method23650(false);
    }
    
    private void method23649() {
        this.method23650(true);
    }
    
    private void method23650(final boolean b) {
        this.method23638();
        ++this.field29933;
        this.field29938 = true;
        final Class2314 method26321 = this.field29931.method26321();
        this.field29931.method26323(1);
        final Class2314 method26322 = this.field29931.method26321();
        Class5233 class5233;
        if (!b) {
            class5233 = new Class5236(method26321, method26322);
        }
        else {
            class5233 = new Class5240(method26321, method26322);
        }
        this.field29934.add(class5233);
    }
    
    private void method23651() {
        this.method23653(false);
    }
    
    private void method23652() {
        this.method23653(true);
    }
    
    private void method23653(final boolean b) {
        this.method23639();
        --this.field29933;
        this.field29938 = false;
        final Class2314 method26321 = this.field29931.method26321();
        this.field29931.method26322();
        final Class2314 method26322 = this.field29931.method26321();
        Class5233 class5233;
        if (!b) {
            class5233 = new Class5245(method26321, method26322);
        }
        else {
            class5233 = new Class5234(method26321, method26322);
        }
        this.field29934.add(class5233);
    }
    
    private void method23654() {
        this.field29938 = true;
        this.method23639();
        final Class2314 method26321 = this.field29931.method26321();
        this.field29931.method26322();
        this.field29934.add(new Class5244(method26321, this.field29931.method26321()));
    }
    
    private void method23655() {
        if (this.field29933 == 0) {
            if (!this.field29938) {
                throw new Class2392(null, null, "sequence entries are not allowed here", this.field29931.method26321());
            }
            if (this.method23641(this.field29931.method26331())) {
                final Class2314 method26321 = this.field29931.method26321();
                this.field29934.add(new Class5235(method26321, method26321));
            }
        }
        this.field29938 = true;
        this.method23639();
        final Class2314 method26322 = this.field29931.method26321();
        this.field29931.method26322();
        this.field29934.add(new Class5237(method26322, this.field29931.method26321()));
    }
    
    private void method23656() {
        if (this.field29933 == 0) {
            if (!this.field29938) {
                throw new Class2392(null, null, "mapping keys are not allowed here", this.field29931.method26321());
            }
            if (this.method23641(this.field29931.method26331())) {
                final Class2314 method26321 = this.field29931.method26321();
                this.field29934.add(new Class5253(method26321, method26321));
            }
        }
        this.field29938 = (this.field29933 == 0);
        this.method23639();
        final Class2314 method26322 = this.field29931.method26321();
        this.field29931.method26322();
        this.field29934.add(new Class5232(method26322, this.field29931.method26321()));
    }
    
    private void method23657() {
        final Class8130 class8130 = this.field29939.remove(this.field29933);
        if (class8130 == null) {
            if (this.field29933 == 0 && !this.field29938) {
                throw new Class2392(null, null, "mapping values are not allowed here", this.field29931.method26321());
            }
            if (this.field29933 == 0) {
                if (this.method23641(this.field29931.method26331())) {
                    final Class2314 method26321 = this.field29931.method26321();
                    this.field29934.add(new Class5253(method26321, method26321));
                }
            }
            this.field29938 = (this.field29933 == 0);
            this.method23639();
        }
        else {
            this.field29934.add(class8130.method26792() - this.field29935, new Class5232(class8130.method26794(), class8130.method26794()));
            if (this.field29933 == 0) {
                if (this.method23641(class8130.method26793())) {
                    this.field29934.add(class8130.method26792() - this.field29935, new Class5253(class8130.method26794(), class8130.method26794()));
                }
            }
            this.field29938 = false;
        }
        final Class2314 method26322 = this.field29931.method26321();
        this.field29931.method26322();
        this.field29934.add(new Class5241(method26322, this.field29931.method26321()));
    }
    
    private void method23658() {
        this.method23638();
        this.field29938 = false;
        this.field29934.add(this.method23684(false));
    }
    
    private void method23659() {
        this.method23638();
        this.field29938 = false;
        this.field29934.add(this.method23684(true));
    }
    
    private void method23660() {
        this.method23638();
        this.field29938 = false;
        this.field29934.add(this.method23685());
    }
    
    private void method23661() {
        this.method23663('|');
    }
    
    private void method23662() {
        this.method23663('>');
    }
    
    private void method23663(final char c) {
        this.field29938 = true;
        this.method23639();
        this.field29934.add(this.method23686(c));
    }
    
    private void method23664() {
        this.method23666('\'');
    }
    
    private void method23665() {
        this.method23666('\"');
    }
    
    private void method23666(final char c) {
        this.method23638();
        this.field29938 = false;
        this.field29934.add(this.method23691(c));
    }
    
    private void method23667() {
        this.method23638();
        this.field29938 = false;
        this.field29934.add(this.method23695());
    }
    
    private boolean method23668() {
        return this.field29931.method26331() == 0;
    }
    
    private boolean method23669() {
        if (this.field29931.method26331() == 0) {
            if ("---".equals(this.field29931.method26326(3))) {
                if (Class6942.field27190.method21321(this.field29931.method26325(3))) {
                    return true;
                }
            }
        }
        return false;
    }
    
    private boolean method23670() {
        if (this.field29931.method26331() == 0) {
            if ("...".equals(this.field29931.method26326(3))) {
                if (Class6942.field27190.method21321(this.field29931.method26325(3))) {
                    return true;
                }
            }
        }
        return false;
    }
    
    private boolean method23671() {
        return Class6942.field27190.method21321(this.field29931.method26325(1));
    }
    
    private boolean method23672() {
        return this.field29933 != 0 || Class6942.field27190.method21321(this.field29931.method26325(1));
    }
    
    private boolean method23673() {
        return this.field29933 != 0 || Class6942.field27190.method21321(this.field29931.method26325(1));
    }
    
    private boolean method23674() {
        final int method26324 = this.field29931.method26324();
        if (!Class6942.field27190.method21324(method26324, "-?:,[]{}#&*!|>'\"%@`")) {
            if (Class6942.field27190.method21322(this.field29931.method26325(1))) {
                if (method26324 == 45) {
                    return true;
                }
                if (this.field29933 == 0) {
                    if ("?:".indexOf(method26324) != -1) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }
    
    private void method23675() {
        if (this.field29931.method26332() == 0) {
            if (this.field29931.method26324() == 65279) {
                this.field29931.method26322();
            }
        }
        int i = 0;
        while (i == 0) {
            int n;
            for (n = 0; this.field29931.method26325(n) == 32; ++n) {}
            if (n > 0) {
                this.field29931.method26323(n);
            }
            if (this.field29931.method26324() == 35) {
                int n2;
                for (n2 = 0; Class6942.field27188.method21322(this.field29931.method26325(n2)); ++n2) {}
                if (n2 > 0) {
                    this.field29931.method26323(n2);
                }
            }
            if (this.method23700().length() == 0) {
                i = 1;
            }
            else {
                if (this.field29933 != 0) {
                    continue;
                }
                this.field29938 = true;
            }
        }
    }
    
    private Class5233 method23676() {
        final Class2314 method26321 = this.field29931.method26321();
        this.field29931.method26322();
        final String method26322 = this.method23677(method26321);
        Object o = null;
        Class2314 class2314;
        if (!"YAML".equals(method26322)) {
            if (!"TAG".equals(method26322)) {
                class2314 = this.field29931.method26321();
                int n;
                for (n = 0; Class6942.field27188.method21322(this.field29931.method26325(n)); ++n) {}
                if (n > 0) {
                    this.field29931.method26323(n);
                }
            }
            else {
                o = this.method23680(method26321);
                class2314 = this.field29931.method26321();
            }
        }
        else {
            o = this.method23678(method26321);
            class2314 = this.field29931.method26321();
        }
        this.method23683(method26321);
        return new Class5238<Object>(method26322, (List<Object>)o, method26321, class2314);
    }
    
    private String method23677(final Class2314 class2314) {
        int n;
        int n2;
        for (n = 0, n2 = this.field29931.method26325(n); Class6942.field27193.method21321(n2); n2 = this.field29931.method26325(n)) {
            ++n;
        }
        if (n == 0) {
            throw new Class2392("while scanning a directive", class2314, "expected alphabetic or numeric character, but found " + String.valueOf(Character.toChars(n2)) + "(" + n2 + ")", this.field29931.method26321());
        }
        final String method26327 = this.field29931.method26327(n);
        final int method26328 = this.field29931.method26324();
        if (!Class6942.field27189.method21322(method26328)) {
            return method26327;
        }
        throw new Class2392("while scanning a directive", class2314, "expected alphabetic or numeric character, but found " + String.valueOf(Character.toChars(method26328)) + "(" + method26328 + ")", this.field29931.method26321());
    }
    
    private List<Integer> method23678(final Class2314 class2314) {
        while (this.field29931.method26324() == 32) {
            this.field29931.method26322();
        }
        final Integer method23679 = this.method23679(class2314);
        final int method23680 = this.field29931.method26324();
        if (method23680 != 46) {
            throw new Class2392("while scanning a directive", class2314, "expected a digit or '.', but found " + String.valueOf(Character.toChars(method23680)) + "(" + method23680 + ")", this.field29931.method26321());
        }
        this.field29931.method26322();
        final Integer method23681 = this.method23679(class2314);
        final int method23682 = this.field29931.method26324();
        if (!Class6942.field27189.method21322(method23682)) {
            final ArrayList list = new ArrayList(2);
            list.add(method23679);
            list.add(method23681);
            return list;
        }
        throw new Class2392("while scanning a directive", class2314, "expected a digit or ' ', but found " + String.valueOf(Character.toChars(method23682)) + "(" + method23682 + ")", this.field29931.method26321());
    }
    
    private Integer method23679(final Class2314 class2314) {
        final int method26324 = this.field29931.method26324();
        if (Character.isDigit(method26324)) {
            int n;
            for (n = 0; Character.isDigit(this.field29931.method26325(n)); ++n) {}
            return Integer.parseInt(this.field29931.method26327(n));
        }
        throw new Class2392("while scanning a directive", class2314, "expected a digit, but found " + String.valueOf(Character.toChars(method26324)) + "(" + method26324 + ")", this.field29931.method26321());
    }
    
    private List<String> method23680(final Class2314 class2314) {
        while (this.field29931.method26324() == 32) {
            this.field29931.method26322();
        }
        final String method23681 = this.method23681(class2314);
        while (this.field29931.method26324() == 32) {
            this.field29931.method26322();
        }
        final String method23682 = this.method23682(class2314);
        final ArrayList list = new ArrayList(2);
        list.add(method23681);
        list.add(method23682);
        return list;
    }
    
    private String method23681(final Class2314 class2314) {
        final String method23697 = this.method23697("directive", class2314);
        final int method23698 = this.field29931.method26324();
        if (method23698 == 32) {
            return method23697;
        }
        throw new Class2392("while scanning a directive", class2314, "expected ' ', but found " + String.valueOf(Character.toChars(method23698)) + "(" + method23698 + ")", this.field29931.method26321());
    }
    
    private String method23682(final Class2314 class2314) {
        final String method23698 = this.method23698("directive", class2314);
        final int method23699 = this.field29931.method26324();
        if (!Class6942.field27189.method21322(method23699)) {
            return method23698;
        }
        throw new Class2392("while scanning a directive", class2314, "expected ' ', but found " + String.valueOf(Character.toChars(method23699)) + "(" + method23699 + ")", this.field29931.method26321());
    }
    
    private void method23683(final Class2314 class2314) {
        while (this.field29931.method26324() == 32) {
            this.field29931.method26322();
        }
        if (this.field29931.method26324() == 35) {
            while (Class6942.field27188.method21322(this.field29931.method26324())) {
                this.field29931.method26322();
            }
        }
        final int method26324 = this.field29931.method26324();
        if (this.method23700().length() == 0 && method26324 != 0) {
            throw new Class2392("while scanning a directive", class2314, "expected a comment or a line break, but found " + String.valueOf(Character.toChars(method26324)) + "(" + method26324 + ")", this.field29931.method26321());
        }
    }
    
    private Class5233 method23684(final boolean b) {
        final Class2314 method26321 = this.field29931.method26321();
        final String s = (this.field29931.method26324() != 42) ? "anchor" : "alias";
        this.field29931.method26322();
        int n;
        int n2;
        for (n = 0, n2 = this.field29931.method26325(n); Class6942.field27193.method21321(n2); n2 = this.field29931.method26325(n)) {
            ++n;
        }
        if (n == 0) {
            throw new Class2392("while scanning an " + s, method26321, "expected alphabetic or numeric character, but found " + String.valueOf(Character.toChars(n2)) + "(" + n2 + ")", this.field29931.method26321());
        }
        final String method26322 = this.field29931.method26327(n);
        final int method26323 = this.field29931.method26324();
        if (!Class6942.field27190.method21324(method26323, "?:,]}%@`")) {
            final Class2314 method26324 = this.field29931.method26321();
            Class5233 class5233;
            if (!b) {
                class5233 = new Class5242(method26322, method26321, method26324);
            }
            else {
                class5233 = new Class5249(method26322, method26321, method26324);
            }
            return class5233;
        }
        throw new Class2392("while scanning an " + s, method26321, "expected alphabetic or numeric character, but found " + String.valueOf(Character.toChars(method26323)) + "(" + method26323 + ")", this.field29931.method26321());
    }
    
    private Class5233 method23685() {
        final Class2314 method26321 = this.field29931.method26321();
        int n = this.field29931.method26325(1);
        String method26322 = null;
        String s;
        if (n != 60) {
            if (!Class6942.field27190.method21321(n)) {
                int n2 = 1;
                int n3 = 0;
                while (Class6942.field27189.method21322(n)) {
                    if (n == 33) {
                        n3 = 1;
                        break;
                    }
                    ++n2;
                    n = this.field29931.method26325(n2);
                }
                if (n3 == 0) {
                    method26322 = "!";
                    this.field29931.method26322();
                }
                else {
                    method26322 = this.method23697("tag", method26321);
                }
                s = this.method23698("tag", method26321);
            }
            else {
                s = "!";
                this.field29931.method26322();
            }
        }
        else {
            this.field29931.method26323(2);
            s = this.method23698("tag", method26321);
            final int method26323 = this.field29931.method26324();
            if (method26323 != 62) {
                throw new Class2392("while scanning a tag", method26321, "expected '>', but found '" + String.valueOf(Character.toChars(method26323)) + "' (" + method26323 + ")", this.field29931.method26321());
            }
            this.field29931.method26322();
        }
        final int method26324 = this.field29931.method26324();
        if (!Class6942.field27189.method21322(method26324)) {
            return new Class5254(new Class8352(method26322, s), method26321, this.field29931.method26321());
        }
        throw new Class2392("while scanning a tag", method26321, "expected ' ', but found '" + String.valueOf(Character.toChars(method26324)) + "' (" + method26324 + ")", this.field29931.method26321());
    }
    
    private Class5233 method23686(final char c) {
        final boolean b = c == '>';
        final StringBuilder sb = new StringBuilder();
        final Class2314 method26321 = this.field29931.method26321();
        this.field29931.method26322();
        final Class6536 method26322 = this.method23687(method26321);
        final int method26323 = method26322.method19769();
        this.method23688(method26321);
        int a = this.field29936 + 1;
        if (a < 1) {
            a = 1;
        }
        int max;
        String s;
        Class2314 class2314;
        if (method26323 != -1) {
            max = a + method26323 - 1;
            final Object[] method26324 = this.method23690(max);
            s = (String)method26324[0];
            class2314 = (Class2314)method26324[1];
        }
        else {
            final Object[] method26325 = this.method23689();
            s = (String)method26325[0];
            final int intValue = (int)method26325[1];
            class2314 = (Class2314)method26325[2];
            max = Math.max(a, intValue);
        }
        String method26326 = "";
        while (this.field29931.method26331() == max) {
            if (this.field29931.method26324() == 0) {
                break;
            }
            sb.append(s);
            final boolean b2 = " \t".indexOf(this.field29931.method26324()) == -1;
            int n;
            for (n = 0; Class6942.field27188.method21322(this.field29931.method26325(n)); ++n) {}
            sb.append(this.field29931.method26327(n));
            method26326 = this.method23700();
            final Object[] method26327 = this.method23690(max);
            s = (String)method26327[0];
            class2314 = (Class2314)method26327[1];
            if (this.field29931.method26331() != max) {
                break;
            }
            if (this.field29931.method26324() == 0) {
                break;
            }
            if (b) {
                if ("\n".equals(method26326)) {
                    if (b2) {
                        if (" \t".indexOf(this.field29931.method26324()) == -1) {
                            if (s.length() != 0) {
                                continue;
                            }
                            sb.append(" ");
                            continue;
                        }
                    }
                }
            }
            sb.append(method26326);
        }
        if (method26322.method19767()) {
            sb.append(method26326);
        }
        if (method26322.method19768()) {
            sb.append(s);
        }
        return new Class5250(sb.toString(), false, method26321, class2314, Class2031.method8090(c));
    }
    
    private Class6536 method23687(final Class2314 class2314) {
        Boolean b = null;
        int n = -1;
        final int method26324 = this.field29931.method26324();
        if (method26324 != 45 && method26324 != 43) {
            if (Character.isDigit(method26324)) {
                n = Integer.parseInt(String.valueOf(Character.toChars(method26324)));
                if (n == 0) {
                    throw new Class2392("while scanning a block scalar", class2314, "expected indentation indicator in the range 1-9, but found 0", this.field29931.method26321());
                }
                this.field29931.method26322();
                final int method26325 = this.field29931.method26324();
                if (method26325 == 45 || method26325 == 43) {
                    if (method26325 != 43) {
                        b = Boolean.FALSE;
                    }
                    else {
                        b = Boolean.TRUE;
                    }
                    this.field29931.method26322();
                }
            }
        }
        else {
            if (method26324 != 43) {
                b = Boolean.FALSE;
            }
            else {
                b = Boolean.TRUE;
            }
            this.field29931.method26322();
            final int method26326 = this.field29931.method26324();
            if (Character.isDigit(method26326)) {
                n = Integer.parseInt(String.valueOf(Character.toChars(method26326)));
                if (n == 0) {
                    throw new Class2392("while scanning a block scalar", class2314, "expected indentation indicator in the range 1-9, but found 0", this.field29931.method26321());
                }
                this.field29931.method26322();
            }
        }
        final int method26327 = this.field29931.method26324();
        if (!Class6942.field27189.method21322(method26327)) {
            return new Class6536(b, n);
        }
        throw new Class2392("while scanning a block scalar", class2314, "expected chomping or indentation indicators, but found " + String.valueOf(Character.toChars(method26327)) + "(" + method26327 + ")", this.field29931.method26321());
    }
    
    private String method23688(final Class2314 class2314) {
        while (this.field29931.method26324() == 32) {
            this.field29931.method26322();
        }
        if (this.field29931.method26324() == 35) {
            while (Class6942.field27188.method21322(this.field29931.method26324())) {
                this.field29931.method26322();
            }
        }
        final int method26324 = this.field29931.method26324();
        final String method26325 = this.method23700();
        if (method26325.length() == 0 && method26324 != 0) {
            throw new Class2392("while scanning a block scalar", class2314, "expected a comment or a line break, but found " + String.valueOf(Character.toChars(method26324)) + "(" + method26324 + ")", this.field29931.method26321());
        }
        return method26325;
    }
    
    private Object[] method23689() {
        final StringBuilder sb = new StringBuilder();
        int method26331 = 0;
        Class2314 class2314 = this.field29931.method26321();
        while (Class6942.field27186.method21323(this.field29931.method26324(), " \r")) {
            if (this.field29931.method26324() == 32) {
                this.field29931.method26322();
                if (this.field29931.method26331() <= method26331) {
                    continue;
                }
                method26331 = this.field29931.method26331();
            }
            else {
                sb.append(this.method23700());
                class2314 = this.field29931.method26321();
            }
        }
        return new Object[] { sb.toString(), method26331, class2314 };
    }
    
    private Object[] method23690(final int n) {
        final StringBuilder sb = new StringBuilder();
        Class2314 class2314 = this.field29931.method26321();
        for (int method26331 = this.field29931.method26331(); method26331 < n && this.field29931.method26324() == 32; ++method26331) {
            this.field29931.method26322();
        }
        String method26332;
        while ((method26332 = this.method23700()).length() != 0) {
            sb.append(method26332);
            class2314 = this.field29931.method26321();
            for (int i = this.field29931.method26331(); i < n; ++i) {
                if (this.field29931.method26324() != 32) {
                    break;
                }
                this.field29931.method26322();
            }
        }
        return new Object[] { sb.toString(), class2314 };
    }
    
    private Class5233 method23691(final char c) {
        final boolean b = c == '\"';
        final StringBuilder sb = new StringBuilder();
        final Class2314 method26321 = this.field29931.method26321();
        final int method26322 = this.field29931.method26324();
        this.field29931.method26322();
        sb.append(this.method23692(b, method26321));
        while (this.field29931.method26324() != method26322) {
            sb.append(this.method23693(method26321));
            sb.append(this.method23692(b, method26321));
        }
        this.field29931.method26322();
        return new Class5250(sb.toString(), false, method26321, this.field29931.method26321(), Class2031.method8090(c));
    }
    
    private String method23692(final boolean b, final Class2314 class2314) {
        final StringBuilder sb = new StringBuilder();
        while (true) {
            int n;
            for (n = 0; Class6942.field27190.method21324(this.field29931.method26325(n), "'\"\\"); ++n) {}
            if (n != 0) {
                sb.append(this.field29931.method26327(n));
            }
            final int method26324 = this.field29931.method26324();
            if (!b) {
                if (method26324 == 39) {
                    if (this.field29931.method26325(1) == 39) {
                        sb.append("'");
                        this.field29931.method26323(2);
                        continue;
                    }
                }
            }
            if ((!b || method26324 != 39) && (b || "\"\\".indexOf(method26324) == -1)) {
                if (!b || method26324 != 92) {
                    return sb.toString();
                }
                this.field29931.method26322();
                final int method26325 = this.field29931.method26324();
                if (!Character.isSupplementaryCodePoint(method26325) && Class7544.field29929.containsKey((char)method26325)) {
                    sb.append(Class7544.field29929.get((char)method26325));
                    this.field29931.method26322();
                }
                else if (!Character.isSupplementaryCodePoint(method26325) && Class7544.field29930.containsKey((char)method26325)) {
                    final int intValue = Class7544.field29930.get((char)method26325);
                    this.field29931.method26322();
                    final String method26326 = this.field29931.method26326(intValue);
                    if (Class7544.field29928.matcher(method26326).find()) {
                        throw new Class2392("while scanning a double-quoted scalar", class2314, "expected escape sequence of " + intValue + " hexadecimal numbers, but found: " + method26326, this.field29931.method26321());
                    }
                    sb.append(new String(Character.toChars(Integer.parseInt(method26326, 16))));
                    this.field29931.method26323(intValue);
                }
                else {
                    if (this.method23700().length() == 0) {
                        throw new Class2392("while scanning a double-quoted scalar", class2314, "found unknown escape character " + String.valueOf(Character.toChars(method26325)) + "(" + method26325 + ")", this.field29931.method26321());
                    }
                    sb.append(this.method23694(class2314));
                }
            }
            else {
                sb.appendCodePoint(method26324);
                this.field29931.method26322();
            }
        }
    }
    
    private String method23693(final Class2314 class2314) {
        final StringBuilder sb = new StringBuilder();
        int n;
        for (n = 0; " \t".indexOf(this.field29931.method26325(n)) != -1; ++n) {}
        final String method26327 = this.field29931.method26327(n);
        if (this.field29931.method26324() != 0) {
            final String method26328 = this.method23700();
            if (method26328.length() == 0) {
                sb.append(method26327);
            }
            else {
                final String method26329 = this.method23694(class2314);
                if ("\n".equals(method26328)) {
                    if (method26329.length() == 0) {
                        sb.append(" ");
                    }
                }
                else {
                    sb.append(method26328);
                }
                sb.append(method26329);
            }
            return sb.toString();
        }
        throw new Class2392("while scanning a quoted scalar", class2314, "found unexpected end of stream", this.field29931.method26321());
    }
    
    private String method23694(final Class2314 class2314) {
        final StringBuilder sb = new StringBuilder();
        while (true) {
            final String method26326 = this.field29931.method26326(3);
            if ("---".equals(method26326) || "...".equals(method26326)) {
                if (Class6942.field27190.method21321(this.field29931.method26325(3))) {
                    throw new Class2392("while scanning a quoted scalar", class2314, "found unexpected document separator", this.field29931.method26321());
                }
            }
            while (" \t".indexOf(this.field29931.method26324()) != -1) {
                this.field29931.method26322();
            }
            final String method26327 = this.method23700();
            if (method26327.length() == 0) {
                return sb.toString();
            }
            sb.append(method26327);
        }
    }
    
    private Class5233 method23695() {
        final StringBuilder sb = new StringBuilder();
        Class2314 class2314 = this.field29931.method26321();
        final int n = this.field29936 + 1;
        String method23696 = "";
    Label_0071_Outer:
        while (true) {
            int n2 = 0;
            if (this.field29931.method26324() != 35) {
                while (true) {
                    final int method23697 = this.field29931.method26325(n2);
                    if (Class6942.field27190.method21321(method23697)) {
                        break;
                    }
                    if (method23697 == 58 && Class6942.field27190.method21323(this.field29931.method26325(n2 + 1), (this.field29933 == 0) ? "" : ",[]{}")) {
                        break;
                    }
                    if (this.field29933 != 0 && ",?[]{}".indexOf(method23697) != -1) {
                        break;
                    }
                    ++n2;
                }
                while (true) {
                    if (n2 == 0) {
                        break;
                    }
                    this.field29938 = false;
                    sb.append(method23696);
                    sb.append(this.field29931.method26327(n2));
                    class2314 = this.field29931.method26321();
                    method23696 = this.method23696();
                    if (method23696.length() == 0) {
                        break;
                    }
                    if (this.field29931.method26324() == 35) {
                        break;
                    }
                    if (this.field29933 == 0 && this.field29931.method26331() < n) {
                        break;
                    }
                    continue Label_0071_Outer;
                    continue;
                }
            }
            break;
        }
        return new Class5250(sb.toString(), class2314, class2314, true);
    }
    
    private String method23696() {
        int n;
        for (n = 0; this.field29931.method26325(n) == 32 || this.field29931.method26325(n) == 9; ++n) {}
        final String method26327 = this.field29931.method26327(n);
        final String method26328 = this.method23700();
        if (method26328.length() == 0) {
            return method26327;
        }
        this.field29938 = true;
        final String method26329 = this.field29931.method26326(3);
        if ("---".equals(method26329) || ("...".equals(method26329) && Class6942.field27190.method21321(this.field29931.method26325(3)))) {
            return "";
        }
        final StringBuilder obj = new StringBuilder();
        while (true) {
            if (this.field29931.method26324() != 32) {
                final String method26330 = this.method23700();
                if (method26330.length() == 0) {
                    if (!"\n".equals(method26328)) {
                        return method26328 + (Object)obj;
                    }
                    if (obj.length() != 0) {
                        return obj.toString();
                    }
                    return " ";
                }
                else {
                    obj.append(method26330);
                    final String method26331 = this.field29931.method26326(3);
                    if (!"---".equals(method26331) && (!"...".equals(method26331) || !Class6942.field27190.method21321(this.field29931.method26325(3)))) {
                        continue;
                    }
                    return "";
                }
            }
            else {
                this.field29931.method26322();
            }
        }
    }
    
    private String method23697(final String s, final Class2314 class2314) {
        final int method26324 = this.field29931.method26324();
        if (method26324 == 33) {
            int n = 1;
            int n2 = this.field29931.method26325(n);
            if (n2 != 32) {
                while (Class6942.field27193.method21321(n2)) {
                    ++n;
                    n2 = this.field29931.method26325(n);
                }
                if (n2 != 33) {
                    this.field29931.method26323(n);
                    throw new Class2392("while scanning a " + s, class2314, "expected '!', but found " + String.valueOf(Character.toChars(n2)) + "(" + n2 + ")", this.field29931.method26321());
                }
                ++n;
            }
            return this.field29931.method26327(n);
        }
        throw new Class2392("while scanning a " + s, class2314, "expected '!', but found " + String.valueOf(Character.toChars(method26324)) + "(" + method26324 + ")", this.field29931.method26321());
    }
    
    private String method23698(final String str, final Class2314 class2314) {
        final StringBuilder sb = new StringBuilder();
        int n;
        int n2;
        for (n = 0, n2 = this.field29931.method26325(n); Class6942.field27192.method21321(n2); n2 = this.field29931.method26325(n)) {
            if (n2 != 37) {
                ++n;
            }
            else {
                sb.append(this.field29931.method26327(n));
                n = 0;
                sb.append(this.method23699(str, class2314));
            }
        }
        if (n != 0) {
            sb.append(this.field29931.method26327(n));
        }
        if (sb.length() != 0) {
            return sb.toString();
        }
        throw new Class2392("while scanning a " + str, class2314, "expected URI, but found " + String.valueOf(Character.toChars(n2)) + "(" + n2 + ")", this.field29931.method26321());
    }
    
    private String method23699(final String s, final Class2314 class2314) {
        int capacity;
        for (capacity = 1; this.field29931.method26325(capacity * 3) == 37; ++capacity) {}
        final Class2314 method26321 = this.field29931.method26321();
        final ByteBuffer allocate = ByteBuffer.allocate(capacity);
        while (this.field29931.method26324() == 37) {
            this.field29931.method26322();
            try {
                allocate.put((byte)Integer.parseInt(this.field29931.method26326(2), 16));
            }
            catch (final NumberFormatException ex) {
                final int method26322 = this.field29931.method26324();
                final String value = String.valueOf(Character.toChars(method26322));
                final int method26323 = this.field29931.method26325(1);
                throw new Class2392("while scanning a " + s, class2314, "expected URI escape sequence of 2 hexadecimal numbers, but found " + value + "(" + method26322 + ") and " + String.valueOf(Character.toChars(method26323)) + "(" + method26323 + ")", this.field29931.method26321());
            }
            this.field29931.method26323(2);
        }
        allocate.flip();
        try {
            return Class9354.method34670(allocate);
        }
        catch (final CharacterCodingException ex2) {
            throw new Class2392("while scanning a " + s, class2314, "expected URI in UTF-8: " + ex2.getMessage(), method26321);
        }
    }
    
    private String method23700() {
        final int method26324 = this.field29931.method26324();
        if (method26324 != 13) {
            if (method26324 != 10) {
                if (method26324 != 133) {
                    if (method26324 != 8232 && method26324 != 8233) {
                        return "";
                    }
                    this.field29931.method26322();
                    return String.valueOf(Character.toChars(method26324));
                }
            }
        }
        if (method26324 == 13 && 10 == this.field29931.method26325(1)) {
            this.field29931.method26323(2);
        }
        else {
            this.field29931.method26322();
        }
        return "\n";
    }
    
    static {
        field29928 = Pattern.compile("[^0-9A-Fa-f]");
        field29929 = new HashMap<Character, String>();
        field29930 = new HashMap<Character, Integer>();
        Class7544.field29929.put('0', "\u0000");
        Class7544.field29929.put('a', "\u0007");
        Class7544.field29929.put('b', "\b");
        Class7544.field29929.put('t', "\t");
        Class7544.field29929.put('n', Class7544.\u43e6\ud59e\u6c4f\u9314\u7e3a\uc10a[38]);
        Class7544.field29929.put('v', "\u000b");
        Class7544.field29929.put('f', "\f");
        Class7544.field29929.put('r', "\r");
        Class7544.field29929.put('e', "\u001b");
        Class7544.field29929.put(' ', Class7544.\u43e6\ud59e\u6c4f\u9314\u7e3a\uc10a[39]);
        Class7544.field29929.put('\"', "\"");
        Class7544.field29929.put('\\', Class7544.\u43e6\ud59e\u6c4f\u9314\u7e3a\uc10a[0]);
        Class7544.field29929.put('N', "\u0085");
        Class7544.field29929.put('_', " ");
        Class7544.field29929.put('L', "\u2028");
        Class7544.field29929.put('P', "\u2029");
        Class7544.field29930.put('x', 2);
        Class7544.field29930.put('u', 4);
        Class7544.field29930.put('U', 8);
    }
}
