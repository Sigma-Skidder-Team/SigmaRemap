// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.brigadier.Message;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.BuiltInExceptionProvider;

public class Class8099 implements BuiltInExceptionProvider
{
    private static final Dynamic2CommandExceptionType field33335;
    private static final Dynamic2CommandExceptionType field33336;
    private static final Dynamic2CommandExceptionType field33337;
    private static final Dynamic2CommandExceptionType field33338;
    private static final Dynamic2CommandExceptionType field33339;
    private static final Dynamic2CommandExceptionType field33340;
    private static final Dynamic2CommandExceptionType field33341;
    private static final Dynamic2CommandExceptionType field33342;
    private static final DynamicCommandExceptionType field33343;
    private static final SimpleCommandExceptionType field33344;
    private static final SimpleCommandExceptionType field33345;
    private static final DynamicCommandExceptionType field33346;
    private static final DynamicCommandExceptionType field33347;
    private static final DynamicCommandExceptionType field33348;
    private static final SimpleCommandExceptionType field33349;
    private static final DynamicCommandExceptionType field33350;
    private static final SimpleCommandExceptionType field33351;
    private static final DynamicCommandExceptionType field33352;
    private static final SimpleCommandExceptionType field33353;
    private static final DynamicCommandExceptionType field33354;
    private static final SimpleCommandExceptionType field33355;
    private static final SimpleCommandExceptionType field33356;
    private static final DynamicCommandExceptionType field33357;
    private static final SimpleCommandExceptionType field33358;
    private static final SimpleCommandExceptionType field33359;
    private static final SimpleCommandExceptionType field33360;
    private static final DynamicCommandExceptionType field33361;
    
    public Dynamic2CommandExceptionType doubleTooLow() {
        return Class8099.field33335;
    }
    
    public Dynamic2CommandExceptionType doubleTooHigh() {
        return Class8099.field33336;
    }
    
    public Dynamic2CommandExceptionType floatTooLow() {
        return Class8099.field33337;
    }
    
    public Dynamic2CommandExceptionType floatTooHigh() {
        return Class8099.field33338;
    }
    
    public Dynamic2CommandExceptionType integerTooLow() {
        return Class8099.field33339;
    }
    
    public Dynamic2CommandExceptionType integerTooHigh() {
        return Class8099.field33340;
    }
    
    public Dynamic2CommandExceptionType longTooLow() {
        return Class8099.field33341;
    }
    
    public Dynamic2CommandExceptionType longTooHigh() {
        return Class8099.field33342;
    }
    
    public DynamicCommandExceptionType literalIncorrect() {
        return Class8099.field33343;
    }
    
    public SimpleCommandExceptionType readerExpectedStartOfQuote() {
        return Class8099.field33344;
    }
    
    public SimpleCommandExceptionType readerExpectedEndOfQuote() {
        return Class8099.field33345;
    }
    
    public DynamicCommandExceptionType readerInvalidEscape() {
        return Class8099.field33346;
    }
    
    public DynamicCommandExceptionType readerInvalidBool() {
        return Class8099.field33347;
    }
    
    public DynamicCommandExceptionType readerInvalidInt() {
        return Class8099.field33348;
    }
    
    public SimpleCommandExceptionType readerExpectedInt() {
        return Class8099.field33349;
    }
    
    public DynamicCommandExceptionType readerInvalidLong() {
        return Class8099.field33350;
    }
    
    public SimpleCommandExceptionType readerExpectedLong() {
        return Class8099.field33351;
    }
    
    public DynamicCommandExceptionType readerInvalidDouble() {
        return Class8099.field33352;
    }
    
    public SimpleCommandExceptionType readerExpectedDouble() {
        return Class8099.field33353;
    }
    
    public DynamicCommandExceptionType readerInvalidFloat() {
        return Class8099.field33354;
    }
    
    public SimpleCommandExceptionType readerExpectedFloat() {
        return Class8099.field33355;
    }
    
    public SimpleCommandExceptionType readerExpectedBool() {
        return Class8099.field33356;
    }
    
    public DynamicCommandExceptionType readerExpectedSymbol() {
        return Class8099.field33357;
    }
    
    public SimpleCommandExceptionType dispatcherUnknownCommand() {
        return Class8099.field33358;
    }
    
    public SimpleCommandExceptionType dispatcherUnknownArgument() {
        return Class8099.field33359;
    }
    
    public SimpleCommandExceptionType dispatcherExpectedArgumentSeparator() {
        return Class8099.field33360;
    }
    
    public DynamicCommandExceptionType dispatcherParseException() {
        return Class8099.field33361;
    }
    
    static {
        field33335 = new Dynamic2CommandExceptionType((o, o2) -> new Class2259("argument.double.low", new Object[] { o2, o }));
        field33336 = new Dynamic2CommandExceptionType((o, o2) -> new Class2259("argument.double.big", new Object[] { o2, o }));
        field33337 = new Dynamic2CommandExceptionType((o, o2) -> new Class2259("argument.float.low", new Object[] { o2, o }));
        field33338 = new Dynamic2CommandExceptionType((o, o2) -> new Class2259("argument.float.big", new Object[] { o2, o }));
        field33339 = new Dynamic2CommandExceptionType((o, o2) -> new Class2259("argument.integer.low", new Object[] { o2, o }));
        field33340 = new Dynamic2CommandExceptionType((o, o2) -> new Class2259("argument.integer.big", new Object[] { o2, o }));
        field33341 = new Dynamic2CommandExceptionType((o, o2) -> new Class2259("argument.long.low", new Object[] { o2, o }));
        field33342 = new Dynamic2CommandExceptionType((o, o2) -> new Class2259("argument.long.big", new Object[] { o2, o }));
        field33343 = new DynamicCommandExceptionType(o -> {
            new Class2259("argument.literal.incorrect", new Object[] { o });
            return;
        });
        field33344 = new SimpleCommandExceptionType((Message)new Class2259("parsing.quote.expected.start", new Object[0]));
        field33345 = new SimpleCommandExceptionType((Message)new Class2259("parsing.quote.expected.end", new Object[0]));
        field33346 = new DynamicCommandExceptionType(o3 -> {
            new Class2259("parsing.quote.escape", new Object[] { o3 });
            return;
        });
        field33347 = new DynamicCommandExceptionType(o5 -> {
            new Class2259("parsing.bool.invalid", new Object[] { o5 });
            return;
        });
        field33348 = new DynamicCommandExceptionType(o7 -> {
            new Class2259("parsing.int.invalid", new Object[] { o7 });
            return;
        });
        field33349 = new SimpleCommandExceptionType((Message)new Class2259("parsing.int.expected", new Object[0]));
        field33350 = new DynamicCommandExceptionType(o9 -> {
            new Class2259("parsing.long.invalid", new Object[] { o9 });
            return;
        });
        field33351 = new SimpleCommandExceptionType((Message)new Class2259("parsing.long.expected", new Object[0]));
        field33352 = new DynamicCommandExceptionType(o11 -> {
            new Class2259("parsing.double.invalid", new Object[] { o11 });
            return;
        });
        field33353 = new SimpleCommandExceptionType((Message)new Class2259("parsing.double.expected", new Object[0]));
        field33354 = new DynamicCommandExceptionType(o13 -> {
            new Class2259("parsing.float.invalid", new Object[] { o13 });
            return;
        });
        field33355 = new SimpleCommandExceptionType((Message)new Class2259("parsing.float.expected", new Object[0]));
        field33356 = new SimpleCommandExceptionType((Message)new Class2259("parsing.bool.expected", new Object[0]));
        field33357 = new DynamicCommandExceptionType(o15 -> {
            new Class2259("parsing.expected", new Object[] { o15 });
            return;
        });
        field33358 = new SimpleCommandExceptionType((Message)new Class2259("command.unknown.command", new Object[0]));
        field33359 = new SimpleCommandExceptionType((Message)new Class2259("command.unknown.argument", new Object[0]));
        field33360 = new SimpleCommandExceptionType((Message)new Class2259("command.expected.separator", new Object[0]));
        field33361 = new DynamicCommandExceptionType(o17 -> {
            new Class2259("command.exception", new Object[] { o17 });
            return;
        });
    }
}
