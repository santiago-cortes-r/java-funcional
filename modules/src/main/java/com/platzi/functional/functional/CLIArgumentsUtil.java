package com.platzi.functional.functional;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class CLIArgumentsUtil {
    static void showHelp(CLIArguments cliArguements){
        Consumer<CLIArguments> consumerHelper = cliArguments1 -> {
            if (cliArguments1.isHelp()) {
                System.out.println("manual solicitado");

            }
        };

        consumerHelper.accept(cliArguements);
    }

    static CLIArguments generateCLI(){
        Supplier<CLIArguments> generator = () -> new CLIArguments();
        return generator.get();
    }
}
